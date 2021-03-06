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

public class CharacterSheetJump implements Serializable {
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

  public static final String SERIALIZED_NAME_JUMP_ACTIVATION = "jumpActivation";
  @SerializedName(SERIALIZED_NAME_JUMP_ACTIVATION)
  private Long jumpActivation;

  public static final String SERIALIZED_NAME_JUMP_FATIGUE = "jumpFatigue";
  @SerializedName(SERIALIZED_NAME_JUMP_FATIGUE)
  private Long jumpFatigue;

  public static final String SERIALIZED_NAME_JUMP_LAST_UPDATE = "jumpLastUpdate";
  @SerializedName(SERIALIZED_NAME_JUMP_LAST_UPDATE)
  private Long jumpLastUpdate;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_JUMP_ACTIVATION_DATE = "jumpActivationDate";
  @SerializedName(SERIALIZED_NAME_JUMP_ACTIVATION_DATE)
  private OffsetDateTime jumpActivationDate;

  public static final String SERIALIZED_NAME_JUMP_FATIGUE_DATE = "jumpFatigueDate";
  @SerializedName(SERIALIZED_NAME_JUMP_FATIGUE_DATE)
  private OffsetDateTime jumpFatigueDate;

  public static final String SERIALIZED_NAME_JUMP_LAST_UPDATE_DATE = "jumpLastUpdateDate";
  @SerializedName(SERIALIZED_NAME_JUMP_LAST_UPDATE_DATE)
  private OffsetDateTime jumpLastUpdateDate;

  public CharacterSheetJump cid(Long cid) {
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

  public CharacterSheetJump eveKitVersion(Integer eveKitVersion) {
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

  public CharacterSheetJump lifeStart(Long lifeStart) {
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

  public CharacterSheetJump lifeEnd(Long lifeEnd) {
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

  public CharacterSheetJump jumpActivation(Long jumpActivation) {
    this.jumpActivation = jumpActivation;
    return this;
  }

   /**
   * Get jumpActivation
   * @return jumpActivation
  **/
  @ApiModelProperty(value = "")
  public Long getJumpActivation() {
    return jumpActivation;
  }

  public void setJumpActivation(Long jumpActivation) {
    this.jumpActivation = jumpActivation;
  }

  public CharacterSheetJump jumpFatigue(Long jumpFatigue) {
    this.jumpFatigue = jumpFatigue;
    return this;
  }

   /**
   * Get jumpFatigue
   * @return jumpFatigue
  **/
  @ApiModelProperty(value = "")
  public Long getJumpFatigue() {
    return jumpFatigue;
  }

  public void setJumpFatigue(Long jumpFatigue) {
    this.jumpFatigue = jumpFatigue;
  }

  public CharacterSheetJump jumpLastUpdate(Long jumpLastUpdate) {
    this.jumpLastUpdate = jumpLastUpdate;
    return this;
  }

   /**
   * Get jumpLastUpdate
   * @return jumpLastUpdate
  **/
  @ApiModelProperty(value = "")
  public Long getJumpLastUpdate() {
    return jumpLastUpdate;
  }

  public void setJumpLastUpdate(Long jumpLastUpdate) {
    this.jumpLastUpdate = jumpLastUpdate;
  }

  public CharacterSheetJump lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public CharacterSheetJump lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public CharacterSheetJump jumpActivationDate(OffsetDateTime jumpActivationDate) {
    this.jumpActivationDate = jumpActivationDate;
    return this;
  }

   /**
   * jumpActivation Date
   * @return jumpActivationDate
  **/
  @ApiModelProperty(value = "jumpActivation Date")
  public OffsetDateTime getJumpActivationDate() {
    return jumpActivationDate;
  }

  public void setJumpActivationDate(OffsetDateTime jumpActivationDate) {
    this.jumpActivationDate = jumpActivationDate;
  }

  public CharacterSheetJump jumpFatigueDate(OffsetDateTime jumpFatigueDate) {
    this.jumpFatigueDate = jumpFatigueDate;
    return this;
  }

   /**
   * jumpFatigue Date
   * @return jumpFatigueDate
  **/
  @ApiModelProperty(value = "jumpFatigue Date")
  public OffsetDateTime getJumpFatigueDate() {
    return jumpFatigueDate;
  }

  public void setJumpFatigueDate(OffsetDateTime jumpFatigueDate) {
    this.jumpFatigueDate = jumpFatigueDate;
  }

  public CharacterSheetJump jumpLastUpdateDate(OffsetDateTime jumpLastUpdateDate) {
    this.jumpLastUpdateDate = jumpLastUpdateDate;
    return this;
  }

   /**
   * jumpLastUpdate Date
   * @return jumpLastUpdateDate
  **/
  @ApiModelProperty(value = "jumpLastUpdate Date")
  public OffsetDateTime getJumpLastUpdateDate() {
    return jumpLastUpdateDate;
  }

  public void setJumpLastUpdateDate(OffsetDateTime jumpLastUpdateDate) {
    this.jumpLastUpdateDate = jumpLastUpdateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterSheetJump characterSheetJump = (CharacterSheetJump) o;
    return Objects.equals(this.cid, characterSheetJump.cid) &&
        Objects.equals(this.eveKitVersion, characterSheetJump.eveKitVersion) &&
        Objects.equals(this.lifeStart, characterSheetJump.lifeStart) &&
        Objects.equals(this.lifeEnd, characterSheetJump.lifeEnd) &&
        Objects.equals(this.jumpActivation, characterSheetJump.jumpActivation) &&
        Objects.equals(this.jumpFatigue, characterSheetJump.jumpFatigue) &&
        Objects.equals(this.jumpLastUpdate, characterSheetJump.jumpLastUpdate) &&
        Objects.equals(this.lifeStartDate, characterSheetJump.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, characterSheetJump.lifeEndDate) &&
        Objects.equals(this.jumpActivationDate, characterSheetJump.jumpActivationDate) &&
        Objects.equals(this.jumpFatigueDate, characterSheetJump.jumpFatigueDate) &&
        Objects.equals(this.jumpLastUpdateDate, characterSheetJump.jumpLastUpdateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, jumpActivation, jumpFatigue, jumpLastUpdate, lifeStartDate, lifeEndDate, jumpActivationDate, jumpFatigueDate, jumpLastUpdateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterSheetJump {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    jumpActivation: ").append(toIndentedString(jumpActivation)).append("\n");
    sb.append("    jumpFatigue: ").append(toIndentedString(jumpFatigue)).append("\n");
    sb.append("    jumpLastUpdate: ").append(toIndentedString(jumpLastUpdate)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    jumpActivationDate: ").append(toIndentedString(jumpActivationDate)).append("\n");
    sb.append("    jumpFatigueDate: ").append(toIndentedString(jumpFatigueDate)).append("\n");
    sb.append("    jumpLastUpdateDate: ").append(toIndentedString(jumpLastUpdateDate)).append("\n");
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

