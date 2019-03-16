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

public class SkillInQueue implements Serializable {
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

  public static final String SERIALIZED_NAME_END_S_P = "endSP";
  @SerializedName(SERIALIZED_NAME_END_S_P)
  private Integer endSP;

  public static final String SERIALIZED_NAME_END_TIME = "endTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_QUEUE_POSITION = "queuePosition";
  @SerializedName(SERIALIZED_NAME_QUEUE_POSITION)
  private Integer queuePosition;

  public static final String SERIALIZED_NAME_START_S_P = "startSP";
  @SerializedName(SERIALIZED_NAME_START_S_P)
  private Integer startSP;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime;

  public static final String SERIALIZED_NAME_TYPE_I_D = "typeID";
  @SerializedName(SERIALIZED_NAME_TYPE_I_D)
  private Integer typeID;

  public static final String SERIALIZED_NAME_TRAINING_START_S_P = "trainingStartSP";
  @SerializedName(SERIALIZED_NAME_TRAINING_START_S_P)
  private Integer trainingStartSP;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_END_TIME_DATE = "endTimeDate";
  @SerializedName(SERIALIZED_NAME_END_TIME_DATE)
  private OffsetDateTime endTimeDate;

  public static final String SERIALIZED_NAME_START_TIME_DATE = "startTimeDate";
  @SerializedName(SERIALIZED_NAME_START_TIME_DATE)
  private OffsetDateTime startTimeDate;

  public SkillInQueue cid(Long cid) {
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

  public SkillInQueue eveKitVersion(Integer eveKitVersion) {
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

  public SkillInQueue lifeStart(Long lifeStart) {
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

  public SkillInQueue lifeEnd(Long lifeEnd) {
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

  public SkillInQueue endSP(Integer endSP) {
    this.endSP = endSP;
    return this;
  }

   /**
   * Get endSP
   * @return endSP
  **/
  @ApiModelProperty(value = "")
  public Integer getEndSP() {
    return endSP;
  }

  public void setEndSP(Integer endSP) {
    this.endSP = endSP;
  }

  public SkillInQueue endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public SkillInQueue level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public SkillInQueue queuePosition(Integer queuePosition) {
    this.queuePosition = queuePosition;
    return this;
  }

   /**
   * Get queuePosition
   * @return queuePosition
  **/
  @ApiModelProperty(value = "")
  public Integer getQueuePosition() {
    return queuePosition;
  }

  public void setQueuePosition(Integer queuePosition) {
    this.queuePosition = queuePosition;
  }

  public SkillInQueue startSP(Integer startSP) {
    this.startSP = startSP;
    return this;
  }

   /**
   * Get startSP
   * @return startSP
  **/
  @ApiModelProperty(value = "")
  public Integer getStartSP() {
    return startSP;
  }

  public void setStartSP(Integer startSP) {
    this.startSP = startSP;
  }

  public SkillInQueue startTime(Long startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public Long getStartTime() {
    return startTime;
  }

  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }

  public SkillInQueue typeID(Integer typeID) {
    this.typeID = typeID;
    return this;
  }

   /**
   * Get typeID
   * @return typeID
  **/
  @ApiModelProperty(value = "")
  public Integer getTypeID() {
    return typeID;
  }

  public void setTypeID(Integer typeID) {
    this.typeID = typeID;
  }

  public SkillInQueue trainingStartSP(Integer trainingStartSP) {
    this.trainingStartSP = trainingStartSP;
    return this;
  }

   /**
   * Get trainingStartSP
   * @return trainingStartSP
  **/
  @ApiModelProperty(value = "")
  public Integer getTrainingStartSP() {
    return trainingStartSP;
  }

  public void setTrainingStartSP(Integer trainingStartSP) {
    this.trainingStartSP = trainingStartSP;
  }

  public SkillInQueue lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public SkillInQueue lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public SkillInQueue endTimeDate(OffsetDateTime endTimeDate) {
    this.endTimeDate = endTimeDate;
    return this;
  }

   /**
   * endTime Date
   * @return endTimeDate
  **/
  @ApiModelProperty(value = "endTime Date")
  public OffsetDateTime getEndTimeDate() {
    return endTimeDate;
  }

  public void setEndTimeDate(OffsetDateTime endTimeDate) {
    this.endTimeDate = endTimeDate;
  }

  public SkillInQueue startTimeDate(OffsetDateTime startTimeDate) {
    this.startTimeDate = startTimeDate;
    return this;
  }

   /**
   * startTime Date
   * @return startTimeDate
  **/
  @ApiModelProperty(value = "startTime Date")
  public OffsetDateTime getStartTimeDate() {
    return startTimeDate;
  }

  public void setStartTimeDate(OffsetDateTime startTimeDate) {
    this.startTimeDate = startTimeDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillInQueue skillInQueue = (SkillInQueue) o;
    return Objects.equals(this.cid, skillInQueue.cid) &&
        Objects.equals(this.eveKitVersion, skillInQueue.eveKitVersion) &&
        Objects.equals(this.lifeStart, skillInQueue.lifeStart) &&
        Objects.equals(this.lifeEnd, skillInQueue.lifeEnd) &&
        Objects.equals(this.endSP, skillInQueue.endSP) &&
        Objects.equals(this.endTime, skillInQueue.endTime) &&
        Objects.equals(this.level, skillInQueue.level) &&
        Objects.equals(this.queuePosition, skillInQueue.queuePosition) &&
        Objects.equals(this.startSP, skillInQueue.startSP) &&
        Objects.equals(this.startTime, skillInQueue.startTime) &&
        Objects.equals(this.typeID, skillInQueue.typeID) &&
        Objects.equals(this.trainingStartSP, skillInQueue.trainingStartSP) &&
        Objects.equals(this.lifeStartDate, skillInQueue.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, skillInQueue.lifeEndDate) &&
        Objects.equals(this.endTimeDate, skillInQueue.endTimeDate) &&
        Objects.equals(this.startTimeDate, skillInQueue.startTimeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, endSP, endTime, level, queuePosition, startSP, startTime, typeID, trainingStartSP, lifeStartDate, lifeEndDate, endTimeDate, startTimeDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillInQueue {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    endSP: ").append(toIndentedString(endSP)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    queuePosition: ").append(toIndentedString(queuePosition)).append("\n");
    sb.append("    startSP: ").append(toIndentedString(startSP)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    typeID: ").append(toIndentedString(typeID)).append("\n");
    sb.append("    trainingStartSP: ").append(toIndentedString(trainingStartSP)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    endTimeDate: ").append(toIndentedString(endTimeDate)).append("\n");
    sb.append("    startTimeDate: ").append(toIndentedString(startTimeDate)).append("\n");
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

