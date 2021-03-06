/*
 * EveKit Model API Server
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
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

public class Structure implements Serializable {
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

  public static final String SERIALIZED_NAME_STRUCTURE_I_D = "structureID";
  @SerializedName(SERIALIZED_NAME_STRUCTURE_I_D)
  private Long structureID;

  public static final String SERIALIZED_NAME_CORPORATION_I_D = "corporationID";
  @SerializedName(SERIALIZED_NAME_CORPORATION_I_D)
  private Integer corporationID;

  public static final String SERIALIZED_NAME_FUEL_EXPIRES = "fuelExpires";
  @SerializedName(SERIALIZED_NAME_FUEL_EXPIRES)
  private Long fuelExpires;

  public static final String SERIALIZED_NAME_NEXT_REINFORCE_APPLY = "nextReinforceApply";
  @SerializedName(SERIALIZED_NAME_NEXT_REINFORCE_APPLY)
  private Long nextReinforceApply;

  public static final String SERIALIZED_NAME_NEXT_REINFORCE_HOUR = "nextReinforceHour";
  @SerializedName(SERIALIZED_NAME_NEXT_REINFORCE_HOUR)
  private Integer nextReinforceHour;

  public static final String SERIALIZED_NAME_NEXT_REINFORCE_WEEKDAY = "nextReinforceWeekday";
  @SerializedName(SERIALIZED_NAME_NEXT_REINFORCE_WEEKDAY)
  private Integer nextReinforceWeekday;

  public static final String SERIALIZED_NAME_PROFILE_I_D = "profileID";
  @SerializedName(SERIALIZED_NAME_PROFILE_I_D)
  private Integer profileID;

  public static final String SERIALIZED_NAME_REINFORCE_HOUR = "reinforceHour";
  @SerializedName(SERIALIZED_NAME_REINFORCE_HOUR)
  private Integer reinforceHour;

  public static final String SERIALIZED_NAME_REINFORCE_WEEKDAY = "reinforceWeekday";
  @SerializedName(SERIALIZED_NAME_REINFORCE_WEEKDAY)
  private Integer reinforceWeekday;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATE_TIMER_END = "stateTimerEnd";
  @SerializedName(SERIALIZED_NAME_STATE_TIMER_END)
  private Long stateTimerEnd;

  public static final String SERIALIZED_NAME_STATE_TIMER_START = "stateTimerStart";
  @SerializedName(SERIALIZED_NAME_STATE_TIMER_START)
  private Long stateTimerStart;

  public static final String SERIALIZED_NAME_SYSTEM_I_D = "systemID";
  @SerializedName(SERIALIZED_NAME_SYSTEM_I_D)
  private Integer systemID;

  public static final String SERIALIZED_NAME_TYPE_I_D = "typeID";
  @SerializedName(SERIALIZED_NAME_TYPE_I_D)
  private Integer typeID;

  public static final String SERIALIZED_NAME_UNANCHORS_AT = "unanchorsAt";
  @SerializedName(SERIALIZED_NAME_UNANCHORS_AT)
  private Long unanchorsAt;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_FUEL_EXPIRES_DATE = "fuelExpiresDate";
  @SerializedName(SERIALIZED_NAME_FUEL_EXPIRES_DATE)
  private OffsetDateTime fuelExpiresDate;

  public static final String SERIALIZED_NAME_NEXT_REINFORCE_APPLY_DATE = "nextReinforceApplyDate";
  @SerializedName(SERIALIZED_NAME_NEXT_REINFORCE_APPLY_DATE)
  private OffsetDateTime nextReinforceApplyDate;

  public static final String SERIALIZED_NAME_STATE_TIMER_END_DATE = "stateTimerEndDate";
  @SerializedName(SERIALIZED_NAME_STATE_TIMER_END_DATE)
  private OffsetDateTime stateTimerEndDate;

  public static final String SERIALIZED_NAME_STATE_TIMER_START_DATE = "stateTimerStartDate";
  @SerializedName(SERIALIZED_NAME_STATE_TIMER_START_DATE)
  private OffsetDateTime stateTimerStartDate;

  public static final String SERIALIZED_NAME_UNANCHORS_AT_DATE = "unanchorsAtDate";
  @SerializedName(SERIALIZED_NAME_UNANCHORS_AT_DATE)
  private OffsetDateTime unanchorsAtDate;

  public Structure cid(Long cid) {
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

  public Structure eveKitVersion(Integer eveKitVersion) {
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

  public Structure lifeStart(Long lifeStart) {
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

  public Structure lifeEnd(Long lifeEnd) {
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

  public Structure structureID(Long structureID) {
    this.structureID = structureID;
    return this;
  }

   /**
   * Get structureID
   * @return structureID
  **/
  @ApiModelProperty(value = "")
  public Long getStructureID() {
    return structureID;
  }

  public void setStructureID(Long structureID) {
    this.structureID = structureID;
  }

  public Structure corporationID(Integer corporationID) {
    this.corporationID = corporationID;
    return this;
  }

   /**
   * Get corporationID
   * @return corporationID
  **/
  @ApiModelProperty(value = "")
  public Integer getCorporationID() {
    return corporationID;
  }

  public void setCorporationID(Integer corporationID) {
    this.corporationID = corporationID;
  }

  public Structure fuelExpires(Long fuelExpires) {
    this.fuelExpires = fuelExpires;
    return this;
  }

   /**
   * Get fuelExpires
   * @return fuelExpires
  **/
  @ApiModelProperty(value = "")
  public Long getFuelExpires() {
    return fuelExpires;
  }

  public void setFuelExpires(Long fuelExpires) {
    this.fuelExpires = fuelExpires;
  }

  public Structure nextReinforceApply(Long nextReinforceApply) {
    this.nextReinforceApply = nextReinforceApply;
    return this;
  }

   /**
   * Get nextReinforceApply
   * @return nextReinforceApply
  **/
  @ApiModelProperty(value = "")
  public Long getNextReinforceApply() {
    return nextReinforceApply;
  }

  public void setNextReinforceApply(Long nextReinforceApply) {
    this.nextReinforceApply = nextReinforceApply;
  }

  public Structure nextReinforceHour(Integer nextReinforceHour) {
    this.nextReinforceHour = nextReinforceHour;
    return this;
  }

   /**
   * Get nextReinforceHour
   * @return nextReinforceHour
  **/
  @ApiModelProperty(value = "")
  public Integer getNextReinforceHour() {
    return nextReinforceHour;
  }

  public void setNextReinforceHour(Integer nextReinforceHour) {
    this.nextReinforceHour = nextReinforceHour;
  }

  public Structure nextReinforceWeekday(Integer nextReinforceWeekday) {
    this.nextReinforceWeekday = nextReinforceWeekday;
    return this;
  }

   /**
   * Get nextReinforceWeekday
   * @return nextReinforceWeekday
  **/
  @ApiModelProperty(value = "")
  public Integer getNextReinforceWeekday() {
    return nextReinforceWeekday;
  }

  public void setNextReinforceWeekday(Integer nextReinforceWeekday) {
    this.nextReinforceWeekday = nextReinforceWeekday;
  }

  public Structure profileID(Integer profileID) {
    this.profileID = profileID;
    return this;
  }

   /**
   * Get profileID
   * @return profileID
  **/
  @ApiModelProperty(value = "")
  public Integer getProfileID() {
    return profileID;
  }

  public void setProfileID(Integer profileID) {
    this.profileID = profileID;
  }

  public Structure reinforceHour(Integer reinforceHour) {
    this.reinforceHour = reinforceHour;
    return this;
  }

   /**
   * Get reinforceHour
   * @return reinforceHour
  **/
  @ApiModelProperty(value = "")
  public Integer getReinforceHour() {
    return reinforceHour;
  }

  public void setReinforceHour(Integer reinforceHour) {
    this.reinforceHour = reinforceHour;
  }

  public Structure reinforceWeekday(Integer reinforceWeekday) {
    this.reinforceWeekday = reinforceWeekday;
    return this;
  }

   /**
   * Get reinforceWeekday
   * @return reinforceWeekday
  **/
  @ApiModelProperty(value = "")
  public Integer getReinforceWeekday() {
    return reinforceWeekday;
  }

  public void setReinforceWeekday(Integer reinforceWeekday) {
    this.reinforceWeekday = reinforceWeekday;
  }

  public Structure state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Structure stateTimerEnd(Long stateTimerEnd) {
    this.stateTimerEnd = stateTimerEnd;
    return this;
  }

   /**
   * Get stateTimerEnd
   * @return stateTimerEnd
  **/
  @ApiModelProperty(value = "")
  public Long getStateTimerEnd() {
    return stateTimerEnd;
  }

  public void setStateTimerEnd(Long stateTimerEnd) {
    this.stateTimerEnd = stateTimerEnd;
  }

  public Structure stateTimerStart(Long stateTimerStart) {
    this.stateTimerStart = stateTimerStart;
    return this;
  }

   /**
   * Get stateTimerStart
   * @return stateTimerStart
  **/
  @ApiModelProperty(value = "")
  public Long getStateTimerStart() {
    return stateTimerStart;
  }

  public void setStateTimerStart(Long stateTimerStart) {
    this.stateTimerStart = stateTimerStart;
  }

  public Structure systemID(Integer systemID) {
    this.systemID = systemID;
    return this;
  }

   /**
   * Get systemID
   * @return systemID
  **/
  @ApiModelProperty(value = "")
  public Integer getSystemID() {
    return systemID;
  }

  public void setSystemID(Integer systemID) {
    this.systemID = systemID;
  }

  public Structure typeID(Integer typeID) {
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

  public Structure unanchorsAt(Long unanchorsAt) {
    this.unanchorsAt = unanchorsAt;
    return this;
  }

   /**
   * Get unanchorsAt
   * @return unanchorsAt
  **/
  @ApiModelProperty(value = "")
  public Long getUnanchorsAt() {
    return unanchorsAt;
  }

  public void setUnanchorsAt(Long unanchorsAt) {
    this.unanchorsAt = unanchorsAt;
  }

  public Structure lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public Structure lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public Structure fuelExpiresDate(OffsetDateTime fuelExpiresDate) {
    this.fuelExpiresDate = fuelExpiresDate;
    return this;
  }

   /**
   * fuelExpires Date
   * @return fuelExpiresDate
  **/
  @ApiModelProperty(value = "fuelExpires Date")
  public OffsetDateTime getFuelExpiresDate() {
    return fuelExpiresDate;
  }

  public void setFuelExpiresDate(OffsetDateTime fuelExpiresDate) {
    this.fuelExpiresDate = fuelExpiresDate;
  }

  public Structure nextReinforceApplyDate(OffsetDateTime nextReinforceApplyDate) {
    this.nextReinforceApplyDate = nextReinforceApplyDate;
    return this;
  }

   /**
   * nextReinforceApply Date
   * @return nextReinforceApplyDate
  **/
  @ApiModelProperty(value = "nextReinforceApply Date")
  public OffsetDateTime getNextReinforceApplyDate() {
    return nextReinforceApplyDate;
  }

  public void setNextReinforceApplyDate(OffsetDateTime nextReinforceApplyDate) {
    this.nextReinforceApplyDate = nextReinforceApplyDate;
  }

  public Structure stateTimerEndDate(OffsetDateTime stateTimerEndDate) {
    this.stateTimerEndDate = stateTimerEndDate;
    return this;
  }

   /**
   * stateTimerEnd Date
   * @return stateTimerEndDate
  **/
  @ApiModelProperty(value = "stateTimerEnd Date")
  public OffsetDateTime getStateTimerEndDate() {
    return stateTimerEndDate;
  }

  public void setStateTimerEndDate(OffsetDateTime stateTimerEndDate) {
    this.stateTimerEndDate = stateTimerEndDate;
  }

  public Structure stateTimerStartDate(OffsetDateTime stateTimerStartDate) {
    this.stateTimerStartDate = stateTimerStartDate;
    return this;
  }

   /**
   * stateTimerStart Date
   * @return stateTimerStartDate
  **/
  @ApiModelProperty(value = "stateTimerStart Date")
  public OffsetDateTime getStateTimerStartDate() {
    return stateTimerStartDate;
  }

  public void setStateTimerStartDate(OffsetDateTime stateTimerStartDate) {
    this.stateTimerStartDate = stateTimerStartDate;
  }

  public Structure unanchorsAtDate(OffsetDateTime unanchorsAtDate) {
    this.unanchorsAtDate = unanchorsAtDate;
    return this;
  }

   /**
   * unanchorsAt Date
   * @return unanchorsAtDate
  **/
  @ApiModelProperty(value = "unanchorsAt Date")
  public OffsetDateTime getUnanchorsAtDate() {
    return unanchorsAtDate;
  }

  public void setUnanchorsAtDate(OffsetDateTime unanchorsAtDate) {
    this.unanchorsAtDate = unanchorsAtDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Structure structure = (Structure) o;
    return Objects.equals(this.cid, structure.cid) &&
        Objects.equals(this.eveKitVersion, structure.eveKitVersion) &&
        Objects.equals(this.lifeStart, structure.lifeStart) &&
        Objects.equals(this.lifeEnd, structure.lifeEnd) &&
        Objects.equals(this.structureID, structure.structureID) &&
        Objects.equals(this.corporationID, structure.corporationID) &&
        Objects.equals(this.fuelExpires, structure.fuelExpires) &&
        Objects.equals(this.nextReinforceApply, structure.nextReinforceApply) &&
        Objects.equals(this.nextReinforceHour, structure.nextReinforceHour) &&
        Objects.equals(this.nextReinforceWeekday, structure.nextReinforceWeekday) &&
        Objects.equals(this.profileID, structure.profileID) &&
        Objects.equals(this.reinforceHour, structure.reinforceHour) &&
        Objects.equals(this.reinforceWeekday, structure.reinforceWeekday) &&
        Objects.equals(this.state, structure.state) &&
        Objects.equals(this.stateTimerEnd, structure.stateTimerEnd) &&
        Objects.equals(this.stateTimerStart, structure.stateTimerStart) &&
        Objects.equals(this.systemID, structure.systemID) &&
        Objects.equals(this.typeID, structure.typeID) &&
        Objects.equals(this.unanchorsAt, structure.unanchorsAt) &&
        Objects.equals(this.lifeStartDate, structure.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, structure.lifeEndDate) &&
        Objects.equals(this.fuelExpiresDate, structure.fuelExpiresDate) &&
        Objects.equals(this.nextReinforceApplyDate, structure.nextReinforceApplyDate) &&
        Objects.equals(this.stateTimerEndDate, structure.stateTimerEndDate) &&
        Objects.equals(this.stateTimerStartDate, structure.stateTimerStartDate) &&
        Objects.equals(this.unanchorsAtDate, structure.unanchorsAtDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, structureID, corporationID, fuelExpires, nextReinforceApply, nextReinforceHour, nextReinforceWeekday, profileID, reinforceHour, reinforceWeekday, state, stateTimerEnd, stateTimerStart, systemID, typeID, unanchorsAt, lifeStartDate, lifeEndDate, fuelExpiresDate, nextReinforceApplyDate, stateTimerEndDate, stateTimerStartDate, unanchorsAtDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Structure {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    structureID: ").append(toIndentedString(structureID)).append("\n");
    sb.append("    corporationID: ").append(toIndentedString(corporationID)).append("\n");
    sb.append("    fuelExpires: ").append(toIndentedString(fuelExpires)).append("\n");
    sb.append("    nextReinforceApply: ").append(toIndentedString(nextReinforceApply)).append("\n");
    sb.append("    nextReinforceHour: ").append(toIndentedString(nextReinforceHour)).append("\n");
    sb.append("    nextReinforceWeekday: ").append(toIndentedString(nextReinforceWeekday)).append("\n");
    sb.append("    profileID: ").append(toIndentedString(profileID)).append("\n");
    sb.append("    reinforceHour: ").append(toIndentedString(reinforceHour)).append("\n");
    sb.append("    reinforceWeekday: ").append(toIndentedString(reinforceWeekday)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    stateTimerEnd: ").append(toIndentedString(stateTimerEnd)).append("\n");
    sb.append("    stateTimerStart: ").append(toIndentedString(stateTimerStart)).append("\n");
    sb.append("    systemID: ").append(toIndentedString(systemID)).append("\n");
    sb.append("    typeID: ").append(toIndentedString(typeID)).append("\n");
    sb.append("    unanchorsAt: ").append(toIndentedString(unanchorsAt)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    fuelExpiresDate: ").append(toIndentedString(fuelExpiresDate)).append("\n");
    sb.append("    nextReinforceApplyDate: ").append(toIndentedString(nextReinforceApplyDate)).append("\n");
    sb.append("    stateTimerEndDate: ").append(toIndentedString(stateTimerEndDate)).append("\n");
    sb.append("    stateTimerStartDate: ").append(toIndentedString(stateTimerStartDate)).append("\n");
    sb.append("    unanchorsAtDate: ").append(toIndentedString(unanchorsAtDate)).append("\n");
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

