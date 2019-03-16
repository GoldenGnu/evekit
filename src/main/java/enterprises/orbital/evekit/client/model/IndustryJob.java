/*
 * EveKit Model API Server
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package enterprises.orbital.evekit.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Model data common properties
 */
@ApiModel(description = "Model data common properties")

public class IndustryJob implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CID = "cid";
  @SerializedName(SERIALIZED_NAME_CID)
  private Long cid;

  public static final String SERIALIZED_NAME_EVE_KIT_VERSION = "eveKitVersion";
  @SerializedName(SERIALIZED_NAME_EVE_KIT_VERSION)
  private Integer eveKitVersion;

  public static final String SERIALIZED_NAME_LIFE_START = "lifeStart";
  @SerializedName(SERIALIZED_NAME_LIFE_START)
  private Long lifeStart;

  public static final String SERIALIZED_NAME_LIFE_END = "lifeEnd";
  @SerializedName(SERIALIZED_NAME_LIFE_END)
  private Long lifeEnd;

  public static final String SERIALIZED_NAME_JOB_I_D = "jobID";
  @SerializedName(SERIALIZED_NAME_JOB_I_D)
  private Integer jobID;

  public static final String SERIALIZED_NAME_INSTALLER_I_D = "installerID";
  @SerializedName(SERIALIZED_NAME_INSTALLER_I_D)
  private Integer installerID;

  public static final String SERIALIZED_NAME_FACILITY_I_D = "facilityID";
  @SerializedName(SERIALIZED_NAME_FACILITY_I_D)
  private Long facilityID;

  public static final String SERIALIZED_NAME_STATION_I_D = "stationID";
  @SerializedName(SERIALIZED_NAME_STATION_I_D)
  private Long stationID;

  public static final String SERIALIZED_NAME_ACTIVITY_I_D = "activityID";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_I_D)
  private Integer activityID;

  public static final String SERIALIZED_NAME_BLUEPRINT_I_D = "blueprintID";
  @SerializedName(SERIALIZED_NAME_BLUEPRINT_I_D)
  private Long blueprintID;

  public static final String SERIALIZED_NAME_BLUEPRINT_TYPE_I_D = "blueprintTypeID";
  @SerializedName(SERIALIZED_NAME_BLUEPRINT_TYPE_I_D)
  private Integer blueprintTypeID;

  public static final String SERIALIZED_NAME_BLUEPRINT_LOCATION_I_D = "blueprintLocationID";
  @SerializedName(SERIALIZED_NAME_BLUEPRINT_LOCATION_I_D)
  private Long blueprintLocationID;

  public static final String SERIALIZED_NAME_OUTPUT_LOCATION_I_D = "outputLocationID";
  @SerializedName(SERIALIZED_NAME_OUTPUT_LOCATION_I_D)
  private Long outputLocationID;

  public static final String SERIALIZED_NAME_RUNS = "runs";
  @SerializedName(SERIALIZED_NAME_RUNS)
  private Integer runs;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost;

  public static final String SERIALIZED_NAME_LICENSED_RUNS = "licensedRuns";
  @SerializedName(SERIALIZED_NAME_LICENSED_RUNS)
  private Integer licensedRuns;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Double probability;

  public static final String SERIALIZED_NAME_PRODUCT_TYPE_I_D = "productTypeID";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE_I_D)
  private Integer productTypeID;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIME_IN_SECONDS = "timeInSeconds";
  @SerializedName(SERIALIZED_NAME_TIME_IN_SECONDS)
  private Integer timeInSeconds;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Long startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Long endDate;

  public static final String SERIALIZED_NAME_PAUSE_DATE = "pauseDate";
  @SerializedName(SERIALIZED_NAME_PAUSE_DATE)
  private Long pauseDate;

  public static final String SERIALIZED_NAME_COMPLETED_DATE = "completedDate";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DATE)
  private Long completedDate;

  public static final String SERIALIZED_NAME_COMPLETED_CHARACTER_I_D = "completedCharacterID";
  @SerializedName(SERIALIZED_NAME_COMPLETED_CHARACTER_I_D)
  private Integer completedCharacterID;

  public static final String SERIALIZED_NAME_SUCCESSFUL_RUNS = "successfulRuns";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_RUNS)
  private Integer successfulRuns;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_START_DATE_DATE = "startDateDate";
  @SerializedName(SERIALIZED_NAME_START_DATE_DATE)
  private OffsetDateTime startDateDate;

  public static final String SERIALIZED_NAME_END_DATE_DATE = "endDateDate";
  @SerializedName(SERIALIZED_NAME_END_DATE_DATE)
  private OffsetDateTime endDateDate;

  public static final String SERIALIZED_NAME_PAUSE_DATE_DATE = "pauseDateDate";
  @SerializedName(SERIALIZED_NAME_PAUSE_DATE_DATE)
  private OffsetDateTime pauseDateDate;

  public static final String SERIALIZED_NAME_COMPLETED_DATE_DATE = "completedDateDate";
  @SerializedName(SERIALIZED_NAME_COMPLETED_DATE_DATE)
  private OffsetDateTime completedDateDate;

  public IndustryJob cid(Long cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Unique ID
   * @return cid
  **/
  @ApiModelProperty(value = "Unique ID")
  public Long getCid() {
    return cid;
  }

  public void setCid(Long cid) {
    this.cid = cid;
  }

  public IndustryJob eveKitVersion(Integer eveKitVersion) {
    this.eveKitVersion = eveKitVersion;
    return this;
  }

   /**
   * EveKit release version
   * @return eveKitVersion
  **/
  @ApiModelProperty(value = "EveKit release version")
  public Integer getEveKitVersion() {
    return eveKitVersion;
  }

  public void setEveKitVersion(Integer eveKitVersion) {
    this.eveKitVersion = eveKitVersion;
  }

  public IndustryJob lifeStart(Long lifeStart) {
    this.lifeStart = lifeStart;
    return this;
  }

   /**
   * Model lifeline start (milliseconds UTC)
   * @return lifeStart
  **/
  @ApiModelProperty(value = "Model lifeline start (milliseconds UTC)")
  public Long getLifeStart() {
    return lifeStart;
  }

  public void setLifeStart(Long lifeStart) {
    this.lifeStart = lifeStart;
  }

  public IndustryJob lifeEnd(Long lifeEnd) {
    this.lifeEnd = lifeEnd;
    return this;
  }

   /**
   * Model lifeline end (milliseconds UTC), MAX_LONG for live data
   * @return lifeEnd
  **/
  @ApiModelProperty(value = "Model lifeline end (milliseconds UTC), MAX_LONG for live data")
  public Long getLifeEnd() {
    return lifeEnd;
  }

  public void setLifeEnd(Long lifeEnd) {
    this.lifeEnd = lifeEnd;
  }

  public IndustryJob jobID(Integer jobID) {
    this.jobID = jobID;
    return this;
  }

   /**
   * Get jobID
   * @return jobID
  **/
  @ApiModelProperty(value = "")
  public Integer getJobID() {
    return jobID;
  }

  public void setJobID(Integer jobID) {
    this.jobID = jobID;
  }

  public IndustryJob installerID(Integer installerID) {
    this.installerID = installerID;
    return this;
  }

   /**
   * Get installerID
   * @return installerID
  **/
  @ApiModelProperty(value = "")
  public Integer getInstallerID() {
    return installerID;
  }

  public void setInstallerID(Integer installerID) {
    this.installerID = installerID;
  }

  public IndustryJob facilityID(Long facilityID) {
    this.facilityID = facilityID;
    return this;
  }

   /**
   * Get facilityID
   * @return facilityID
  **/
  @ApiModelProperty(value = "")
  public Long getFacilityID() {
    return facilityID;
  }

  public void setFacilityID(Long facilityID) {
    this.facilityID = facilityID;
  }

  public IndustryJob stationID(Long stationID) {
    this.stationID = stationID;
    return this;
  }

   /**
   * Get stationID
   * @return stationID
  **/
  @ApiModelProperty(value = "")
  public Long getStationID() {
    return stationID;
  }

  public void setStationID(Long stationID) {
    this.stationID = stationID;
  }

  public IndustryJob activityID(Integer activityID) {
    this.activityID = activityID;
    return this;
  }

   /**
   * Get activityID
   * @return activityID
  **/
  @ApiModelProperty(value = "")
  public Integer getActivityID() {
    return activityID;
  }

  public void setActivityID(Integer activityID) {
    this.activityID = activityID;
  }

  public IndustryJob blueprintID(Long blueprintID) {
    this.blueprintID = blueprintID;
    return this;
  }

   /**
   * Get blueprintID
   * @return blueprintID
  **/
  @ApiModelProperty(value = "")
  public Long getBlueprintID() {
    return blueprintID;
  }

  public void setBlueprintID(Long blueprintID) {
    this.blueprintID = blueprintID;
  }

  public IndustryJob blueprintTypeID(Integer blueprintTypeID) {
    this.blueprintTypeID = blueprintTypeID;
    return this;
  }

   /**
   * Get blueprintTypeID
   * @return blueprintTypeID
  **/
  @ApiModelProperty(value = "")
  public Integer getBlueprintTypeID() {
    return blueprintTypeID;
  }

  public void setBlueprintTypeID(Integer blueprintTypeID) {
    this.blueprintTypeID = blueprintTypeID;
  }

  public IndustryJob blueprintLocationID(Long blueprintLocationID) {
    this.blueprintLocationID = blueprintLocationID;
    return this;
  }

   /**
   * Get blueprintLocationID
   * @return blueprintLocationID
  **/
  @ApiModelProperty(value = "")
  public Long getBlueprintLocationID() {
    return blueprintLocationID;
  }

  public void setBlueprintLocationID(Long blueprintLocationID) {
    this.blueprintLocationID = blueprintLocationID;
  }

  public IndustryJob outputLocationID(Long outputLocationID) {
    this.outputLocationID = outputLocationID;
    return this;
  }

   /**
   * Get outputLocationID
   * @return outputLocationID
  **/
  @ApiModelProperty(value = "")
  public Long getOutputLocationID() {
    return outputLocationID;
  }

  public void setOutputLocationID(Long outputLocationID) {
    this.outputLocationID = outputLocationID;
  }

  public IndustryJob runs(Integer runs) {
    this.runs = runs;
    return this;
  }

   /**
   * Get runs
   * @return runs
  **/
  @ApiModelProperty(value = "")
  public Integer getRuns() {
    return runs;
  }

  public void setRuns(Integer runs) {
    this.runs = runs;
  }

  public IndustryJob cost(Double cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public IndustryJob licensedRuns(Integer licensedRuns) {
    this.licensedRuns = licensedRuns;
    return this;
  }

   /**
   * Get licensedRuns
   * @return licensedRuns
  **/
  @ApiModelProperty(value = "")
  public Integer getLicensedRuns() {
    return licensedRuns;
  }

  public void setLicensedRuns(Integer licensedRuns) {
    this.licensedRuns = licensedRuns;
  }

  public IndustryJob probability(Double probability) {
    this.probability = probability;
    return this;
  }

   /**
   * Get probability
   * @return probability
  **/
  @ApiModelProperty(value = "")
  public Double getProbability() {
    return probability;
  }

  public void setProbability(Double probability) {
    this.probability = probability;
  }

  public IndustryJob productTypeID(Integer productTypeID) {
    this.productTypeID = productTypeID;
    return this;
  }

   /**
   * Get productTypeID
   * @return productTypeID
  **/
  @ApiModelProperty(value = "")
  public Integer getProductTypeID() {
    return productTypeID;
  }

  public void setProductTypeID(Integer productTypeID) {
    this.productTypeID = productTypeID;
  }

  public IndustryJob status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IndustryJob timeInSeconds(Integer timeInSeconds) {
    this.timeInSeconds = timeInSeconds;
    return this;
  }

   /**
   * Get timeInSeconds
   * @return timeInSeconds
  **/
  @ApiModelProperty(value = "")
  public Integer getTimeInSeconds() {
    return timeInSeconds;
  }

  public void setTimeInSeconds(Integer timeInSeconds) {
    this.timeInSeconds = timeInSeconds;
  }

  public IndustryJob startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public IndustryJob endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public IndustryJob pauseDate(Long pauseDate) {
    this.pauseDate = pauseDate;
    return this;
  }

   /**
   * Get pauseDate
   * @return pauseDate
  **/
  @ApiModelProperty(value = "")
  public Long getPauseDate() {
    return pauseDate;
  }

  public void setPauseDate(Long pauseDate) {
    this.pauseDate = pauseDate;
  }

  public IndustryJob completedDate(Long completedDate) {
    this.completedDate = completedDate;
    return this;
  }

   /**
   * Get completedDate
   * @return completedDate
  **/
  @ApiModelProperty(value = "")
  public Long getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(Long completedDate) {
    this.completedDate = completedDate;
  }

  public IndustryJob completedCharacterID(Integer completedCharacterID) {
    this.completedCharacterID = completedCharacterID;
    return this;
  }

   /**
   * Get completedCharacterID
   * @return completedCharacterID
  **/
  @ApiModelProperty(value = "")
  public Integer getCompletedCharacterID() {
    return completedCharacterID;
  }

  public void setCompletedCharacterID(Integer completedCharacterID) {
    this.completedCharacterID = completedCharacterID;
  }

  public IndustryJob successfulRuns(Integer successfulRuns) {
    this.successfulRuns = successfulRuns;
    return this;
  }

   /**
   * Get successfulRuns
   * @return successfulRuns
  **/
  @ApiModelProperty(value = "")
  public Integer getSuccessfulRuns() {
    return successfulRuns;
  }

  public void setSuccessfulRuns(Integer successfulRuns) {
    this.successfulRuns = successfulRuns;
  }

  public IndustryJob lifeStartDate(OffsetDateTime lifeStartDate) {
    this.lifeStartDate = lifeStartDate;
    return this;
  }

   /**
   * lifeStart Date
   * @return lifeStartDate
  **/
  @ApiModelProperty(value = "lifeStart Date")
  public OffsetDateTime getLifeStartDate() {
    return lifeStartDate;
  }

  public void setLifeStartDate(OffsetDateTime lifeStartDate) {
    this.lifeStartDate = lifeStartDate;
  }

  public IndustryJob lifeEndDate(OffsetDateTime lifeEndDate) {
    this.lifeEndDate = lifeEndDate;
    return this;
  }

   /**
   * lifeEnd Date
   * @return lifeEndDate
  **/
  @ApiModelProperty(value = "lifeEnd Date")
  public OffsetDateTime getLifeEndDate() {
    return lifeEndDate;
  }

  public void setLifeEndDate(OffsetDateTime lifeEndDate) {
    this.lifeEndDate = lifeEndDate;
  }

  public IndustryJob startDateDate(OffsetDateTime startDateDate) {
    this.startDateDate = startDateDate;
    return this;
  }

   /**
   * startDate Date
   * @return startDateDate
  **/
  @ApiModelProperty(value = "startDate Date")
  public OffsetDateTime getStartDateDate() {
    return startDateDate;
  }

  public void setStartDateDate(OffsetDateTime startDateDate) {
    this.startDateDate = startDateDate;
  }

  public IndustryJob endDateDate(OffsetDateTime endDateDate) {
    this.endDateDate = endDateDate;
    return this;
  }

   /**
   * endDate Date
   * @return endDateDate
  **/
  @ApiModelProperty(value = "endDate Date")
  public OffsetDateTime getEndDateDate() {
    return endDateDate;
  }

  public void setEndDateDate(OffsetDateTime endDateDate) {
    this.endDateDate = endDateDate;
  }

  public IndustryJob pauseDateDate(OffsetDateTime pauseDateDate) {
    this.pauseDateDate = pauseDateDate;
    return this;
  }

   /**
   * pauseDate Date
   * @return pauseDateDate
  **/
  @ApiModelProperty(value = "pauseDate Date")
  public OffsetDateTime getPauseDateDate() {
    return pauseDateDate;
  }

  public void setPauseDateDate(OffsetDateTime pauseDateDate) {
    this.pauseDateDate = pauseDateDate;
  }

  public IndustryJob completedDateDate(OffsetDateTime completedDateDate) {
    this.completedDateDate = completedDateDate;
    return this;
  }

   /**
   * completedDate Date
   * @return completedDateDate
  **/
  @ApiModelProperty(value = "completedDate Date")
  public OffsetDateTime getCompletedDateDate() {
    return completedDateDate;
  }

  public void setCompletedDateDate(OffsetDateTime completedDateDate) {
    this.completedDateDate = completedDateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndustryJob industryJob = (IndustryJob) o;
    return Objects.equals(this.cid, industryJob.cid) &&
        Objects.equals(this.eveKitVersion, industryJob.eveKitVersion) &&
        Objects.equals(this.lifeStart, industryJob.lifeStart) &&
        Objects.equals(this.lifeEnd, industryJob.lifeEnd) &&
        Objects.equals(this.jobID, industryJob.jobID) &&
        Objects.equals(this.installerID, industryJob.installerID) &&
        Objects.equals(this.facilityID, industryJob.facilityID) &&
        Objects.equals(this.stationID, industryJob.stationID) &&
        Objects.equals(this.activityID, industryJob.activityID) &&
        Objects.equals(this.blueprintID, industryJob.blueprintID) &&
        Objects.equals(this.blueprintTypeID, industryJob.blueprintTypeID) &&
        Objects.equals(this.blueprintLocationID, industryJob.blueprintLocationID) &&
        Objects.equals(this.outputLocationID, industryJob.outputLocationID) &&
        Objects.equals(this.runs, industryJob.runs) &&
        Objects.equals(this.cost, industryJob.cost) &&
        Objects.equals(this.licensedRuns, industryJob.licensedRuns) &&
        Objects.equals(this.probability, industryJob.probability) &&
        Objects.equals(this.productTypeID, industryJob.productTypeID) &&
        Objects.equals(this.status, industryJob.status) &&
        Objects.equals(this.timeInSeconds, industryJob.timeInSeconds) &&
        Objects.equals(this.startDate, industryJob.startDate) &&
        Objects.equals(this.endDate, industryJob.endDate) &&
        Objects.equals(this.pauseDate, industryJob.pauseDate) &&
        Objects.equals(this.completedDate, industryJob.completedDate) &&
        Objects.equals(this.completedCharacterID, industryJob.completedCharacterID) &&
        Objects.equals(this.successfulRuns, industryJob.successfulRuns) &&
        Objects.equals(this.lifeStartDate, industryJob.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, industryJob.lifeEndDate) &&
        Objects.equals(this.startDateDate, industryJob.startDateDate) &&
        Objects.equals(this.endDateDate, industryJob.endDateDate) &&
        Objects.equals(this.pauseDateDate, industryJob.pauseDateDate) &&
        Objects.equals(this.completedDateDate, industryJob.completedDateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, jobID, installerID, facilityID, stationID, activityID, blueprintID, blueprintTypeID, blueprintLocationID, outputLocationID, runs, cost, licensedRuns, probability, productTypeID, status, timeInSeconds, startDate, endDate, pauseDate, completedDate, completedCharacterID, successfulRuns, lifeStartDate, lifeEndDate, startDateDate, endDateDate, pauseDateDate, completedDateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndustryJob {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
    sb.append("    installerID: ").append(toIndentedString(installerID)).append("\n");
    sb.append("    facilityID: ").append(toIndentedString(facilityID)).append("\n");
    sb.append("    stationID: ").append(toIndentedString(stationID)).append("\n");
    sb.append("    activityID: ").append(toIndentedString(activityID)).append("\n");
    sb.append("    blueprintID: ").append(toIndentedString(blueprintID)).append("\n");
    sb.append("    blueprintTypeID: ").append(toIndentedString(blueprintTypeID)).append("\n");
    sb.append("    blueprintLocationID: ").append(toIndentedString(blueprintLocationID)).append("\n");
    sb.append("    outputLocationID: ").append(toIndentedString(outputLocationID)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    licensedRuns: ").append(toIndentedString(licensedRuns)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    productTypeID: ").append(toIndentedString(productTypeID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeInSeconds: ").append(toIndentedString(timeInSeconds)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    pauseDate: ").append(toIndentedString(pauseDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    completedCharacterID: ").append(toIndentedString(completedCharacterID)).append("\n");
    sb.append("    successfulRuns: ").append(toIndentedString(successfulRuns)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    startDateDate: ").append(toIndentedString(startDateDate)).append("\n");
    sb.append("    endDateDate: ").append(toIndentedString(endDateDate)).append("\n");
    sb.append("    pauseDateDate: ").append(toIndentedString(pauseDateDate)).append("\n");
    sb.append("    completedDateDate: ").append(toIndentedString(completedDateDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

