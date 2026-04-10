package com.ai.mcp.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.HashMap;
import java.util.Map;

public class DemandApiResponse {
  private final Map<String, Object> raw = new HashMap<>();

  @JsonAnySetter
  public void set(String key, Object value) {
    raw.put(key, value);
  }

  public Map<String, Object> getRaw() {
    return raw;
  }
}