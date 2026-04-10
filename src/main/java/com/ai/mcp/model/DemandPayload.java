package com.ai.mcp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemandPayload {

  private Payload payload;

  public Payload getPayload() { return payload; }
  public void setPayload(Payload payload) { this.payload = payload; }

  public static class Payload {
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

    // getters/setters omitted for brevity (generate via Lombok or IDE)
    // ...
    public PrimarySkill getPrimarySkill() { return primarySkill; }
    public void setPrimarySkill(PrimarySkill primarySkill) { this.primarySkill = primarySkill; }
    public String getCostCenterNameId() { return costCenterNameId; }
    public void setCostCenterNameId(String costCenterNameId) { this.costCenterNameId = costCenterNameId; }
    public String getRoleId() { return roleId; }
    public void setRoleId(String roleId) { this.roleId = roleId; }
    public String getCareerStageLevelId() { return careerStageLevelId; }
    public void setCareerStageLevelId(String careerStageLevelId) { this.careerStageLevelId = careerStageLevelId; }
    public String getAssignmentType() { return assignmentType; }
    public void setAssignmentType(String assignmentType) { this.assignmentType = assignmentType; }
    public String getMetroId() { return metroId; }
    public void setMetroId(String metroId) { this.metroId = metroId; }
    public String getTravelMetroId() { return travelMetroId; }
    public void setTravelMetroId(String travelMetroId) { this.travelMetroId = travelMetroId; }
    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }
    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    public String getDemandType() { return demandType; }
    public void setDemandType(String demandType) { this.demandType = demandType; }
    public Integer getCommitment() { return commitment; }
    public void setCommitment(Integer commitment) { this.commitment = commitment; }
    public Integer getBillRate() { return billRate; }
    public void setBillRate(Integer billRate) { this.billRate = billRate; }
    public String getJobCode() { return jobCode; }
    public void setJobCode(String jobCode) { this.jobCode = jobCode; }
    public Boolean getBackdated() { return backdated; }
    public void setBackdated(Boolean backdated) { this.backdated = backdated; }
    public String getAdditionalInfo() { return additionalInfo; }
    public void setAdditionalInfo(String additionalInfo) { this.additionalInfo = additionalInfo; }
    public Object getAdditionalSkills() { return additionalSkills; }
    public void setAdditionalSkills(Object additionalSkills) { this.additionalSkills = additionalSkills; }
    public Integer getLaborCostRate() { return laborCostRate; }
    public void setLaborCostRate(Integer laborCostRate) { this.laborCostRate = laborCostRate; }
    public Boolean getIca() { return ica; }
    public void setIca(Boolean ica) { this.ica = ica; }
    public Boolean getContractingAllowed() { return contractingAllowed; }
    public void setContractingAllowed(Boolean contractingAllowed) { this.contractingAllowed = contractingAllowed; }
    public Integer getContractorCostRate() { return contractorCostRate; }
    public void setContractorCostRate(Integer contractorCostRate) { this.contractorCostRate = contractorCostRate; }
    public Double getAdditionalAvailableHours() { return additionalAvailableHours; }
    public void setAdditionalAvailableHours(Double additionalAvailableHours) { this.additionalAvailableHours = additionalAvailableHours; }
    public String getPreferredNomineePersonId() { return preferredNomineePersonId; }
    public void setPreferredNomineePersonId(String preferredNomineePersonId) { this.preferredNomineePersonId = preferredNomineePersonId; }
  }

  public static class PrimarySkill {
    private String skillId;
    private String competencyId;

    public String getSkillId() { return skillId; }
    public void setSkillId(String skillId) { this.skillId = skillId; }
    public String getCompetencyId() { return competencyId; }
    public void setCompetencyId(String competencyId) { this.competencyId = competencyId; }
  }
}