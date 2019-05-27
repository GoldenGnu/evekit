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

public class FleetInfo implements Serializable {
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

  public static final String SERIALIZED_NAME_FLEET_I_D = "fleetID";
  @SerializedName(SERIALIZED_NAME_FLEET_I_D)
  private Long fleetID;

  public static final String SERIALIZED_NAME_MOTD = "motd";
  @SerializedName(SERIALIZED_NAME_MOTD)
  private String motd;

  public static final String SERIALIZED_NAME_FREE_MOVE = "freeMove";
  @SerializedName(SERIALIZED_NAME_FREE_MOVE)
  private Boolean freeMove = false;

  public static final String SERIALIZED_NAME_VOICE_ENABLED = "voiceEnabled";
  @SerializedName(SERIALIZED_NAME_VOICE_ENABLED)
  private Boolean voiceEnabled = false;

  public static final String SERIALIZED_NAME_REGISTERED = "registered";
  @SerializedName(SERIALIZED_NAME_REGISTERED)
  private Boolean registered = false;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public FleetInfo cid(Long cid) {
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

  public FleetInfo eveKitVersion(Integer eveKitVersion) {
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

  public FleetInfo lifeStart(Long lifeStart) {
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

  public FleetInfo lifeEnd(Long lifeEnd) {
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

  public FleetInfo fleetID(Long fleetID) {
    this.fleetID = fleetID;
    return this;
  }

   /**
   * Get fleetID
   * @return fleetID
  **/
  @ApiModelProperty(value = "")
  public Long getFleetID() {
    return fleetID;
  }

  public void setFleetID(Long fleetID) {
    this.fleetID = fleetID;
  }

  public FleetInfo motd(String motd) {
    this.motd = motd;
    return this;
  }

   /**
   * Get motd
   * @return motd
  **/
  @ApiModelProperty(value = "")
  public String getMotd() {
    return motd;
  }

  public void setMotd(String motd) {
    this.motd = motd;
  }

  public FleetInfo freeMove(Boolean freeMove) {
    this.freeMove = freeMove;
    return this;
  }

   /**
   * Get freeMove
   * @return freeMove
  **/
  @ApiModelProperty(value = "")
  public Boolean getFreeMove() {
    return freeMove;
  }

  public void setFreeMove(Boolean freeMove) {
    this.freeMove = freeMove;
  }

  public FleetInfo voiceEnabled(Boolean voiceEnabled) {
    this.voiceEnabled = voiceEnabled;
    return this;
  }

   /**
   * Get voiceEnabled
   * @return voiceEnabled
  **/
  @ApiModelProperty(value = "")
  public Boolean getVoiceEnabled() {
    return voiceEnabled;
  }

  public void setVoiceEnabled(Boolean voiceEnabled) {
    this.voiceEnabled = voiceEnabled;
  }

  public FleetInfo registered(Boolean registered) {
    this.registered = registered;
    return this;
  }

   /**
   * Get registered
   * @return registered
  **/
  @ApiModelProperty(value = "")
  public Boolean getRegistered() {
    return registered;
  }

  public void setRegistered(Boolean registered) {
    this.registered = registered;
  }

  public FleetInfo lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public FleetInfo lifeEndDate(OffsetDateTime lifeEndDate) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FleetInfo fleetInfo = (FleetInfo) o;
    return Objects.equals(this.cid, fleetInfo.cid) &&
        Objects.equals(this.eveKitVersion, fleetInfo.eveKitVersion) &&
        Objects.equals(this.lifeStart, fleetInfo.lifeStart) &&
        Objects.equals(this.lifeEnd, fleetInfo.lifeEnd) &&
        Objects.equals(this.fleetID, fleetInfo.fleetID) &&
        Objects.equals(this.motd, fleetInfo.motd) &&
        Objects.equals(this.freeMove, fleetInfo.freeMove) &&
        Objects.equals(this.voiceEnabled, fleetInfo.voiceEnabled) &&
        Objects.equals(this.registered, fleetInfo.registered) &&
        Objects.equals(this.lifeStartDate, fleetInfo.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, fleetInfo.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, fleetID, motd, freeMove, voiceEnabled, registered, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FleetInfo {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    fleetID: ").append(toIndentedString(fleetID)).append("\n");
    sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
    sb.append("    freeMove: ").append(toIndentedString(freeMove)).append("\n");
    sb.append("    voiceEnabled: ").append(toIndentedString(voiceEnabled)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
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

