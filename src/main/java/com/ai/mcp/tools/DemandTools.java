package com.ai.mcp.tools;

import com.ai.mcp.model.DemandApiResponse;
import com.ai.mcp.model.DemandPayload;
import com.ai.mcp.service.DemandApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class DemandTools {

  private final DemandApiService demandApiService;

  private final ObjectMapper mapper;

  @McpTool(
      name = "createDemand",
      description = "Creates a demand in Enrich. Input must match the /api/core/demand request body schema."
  )
  public DemandApiResponse createDemand(Map<String, Object> payload) {
    return demandApiService.createDemand(new DemandPayload(mapper.convertValue(payload, DemandPayload.Payload.class)));
  }
}