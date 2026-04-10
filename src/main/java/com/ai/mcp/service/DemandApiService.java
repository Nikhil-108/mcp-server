package com.ai.mcp.service;

import com.ai.mcp.model.DemandApiResponse;
import com.ai.mcp.model.DemandPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class DemandApiService {

  private static final Logger log = LoggerFactory.getLogger(DemandApiService.class);

  private final WebClient webClient;

  private final String baseUrl;
  private final String demandPath;
  private final String assumedRole;
  private final String bearerToken;

  public DemandApiService(
          WebClient webClient,
          @Value("${downstream.enrich.base-url}") String baseUrl,
          @Value("${downstream.enrich.demand-path}") String demandPath,
          @Value("${downstream.enrich.assumed-role}") String assumedRole,
          @Value("${security.bearer-token-env}") String bearerToken
  ) {
    this.webClient = webClient;
    this.baseUrl = baseUrl;
    this.demandPath = demandPath;
    this.assumedRole = assumedRole;
      this.bearerToken = bearerToken;
  }

  public DemandApiResponse createDemand(DemandPayload payload) {
    long start = System.currentTimeMillis();

   try {
      DemandApiResponse response = webClient.post()
          .uri(baseUrl + demandPath)
          .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
          .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
          .header(HttpHeaders.AUTHORIZATION, "Bearer " + bearerToken)
          .header("x-assumed-role", assumedRole)
          // You can add more headers if the API strictly requires them,
          // but typically only auth + content-type + role are needed.
          .bodyValue(payload)
          .retrieve()
          .bodyToMono(DemandApiResponse.class)
          .block();

      long ms = System.currentTimeMillis() - start;
      log.info("Downstream createDemand success status=200 latencyMs={}", ms);

      return response;

    } catch (Exception ex) {
      long ms = System.currentTimeMillis() - start;
      log.error("Downstream createDemand failed latencyMs={}", ms, ex);
      throw ex;
    }
  }
}