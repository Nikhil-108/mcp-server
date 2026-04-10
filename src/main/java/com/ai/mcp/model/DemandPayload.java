package com.ai.mcp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemandPayload {

  private Payload payload;
  @Data
  @AllArgsConstructor
  public static class Payload {
    private String token;
    private PrimarySkill primarySkill;
    private String costCenterNameId;
    private String roleId;
    private String careerStageLevelId;
    private String assignmentType;
    private String metroId;
    private String travelMetroId;
    private String startDate;
    private String endDate;
    private String demandType;
    private Integer commitment;
    private Integer billRate;
    private String jobCode;
    private Boolean backdated;
    private String additionalInfo;
    private Object additionalSkills;
    private Integer laborCostRate;
    private Boolean ica;
    private Boolean contractingAllowed;
    private Integer contractorCostRate;
    private Double additionalAvailableHours;
    private String preferredNomineePersonId;
  }

  @Data
  @AllArgsConstructor
  public static class PrimarySkill {
    private String skillId;
    private String competencyId;
 }
}