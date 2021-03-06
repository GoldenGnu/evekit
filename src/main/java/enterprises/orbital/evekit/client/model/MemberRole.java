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

public class MemberRole implements Serializable {
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

  public static final String SERIALIZED_NAME_CHARACTER_I_D = "characterID";
  @SerializedName(SERIALIZED_NAME_CHARACTER_I_D)
  private Integer characterID;

  public static final String SERIALIZED_NAME_ROLE_NAME = "roleName";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;

  public static final String SERIALIZED_NAME_GRANTABLE = "grantable";
  @SerializedName(SERIALIZED_NAME_GRANTABLE)
  private Boolean grantable = false;

  public static final String SERIALIZED_NAME_AT_H_Q = "atHQ";
  @SerializedName(SERIALIZED_NAME_AT_H_Q)
  private Boolean atHQ = false;

  public static final String SERIALIZED_NAME_AT_BASE = "atBase";
  @SerializedName(SERIALIZED_NAME_AT_BASE)
  private Boolean atBase = false;

  public static final String SERIALIZED_NAME_AT_OTHER = "atOther";
  @SerializedName(SERIALIZED_NAME_AT_OTHER)
  private Boolean atOther = false;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public MemberRole cid(Long cid) {
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

  public MemberRole eveKitVersion(Integer eveKitVersion) {
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

  public MemberRole lifeStart(Long lifeStart) {
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

  public MemberRole lifeEnd(Long lifeEnd) {
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

  public MemberRole characterID(Integer characterID) {
    this.characterID = characterID;
    return this;
  }

   /**
   * Get characterID
   * @return characterID
  **/
  @ApiModelProperty(value = "")
  public Integer getCharacterID() {
    return characterID;
  }

  public void setCharacterID(Integer characterID) {
    this.characterID = characterID;
  }

  public MemberRole roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(value = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public MemberRole grantable(Boolean grantable) {
    this.grantable = grantable;
    return this;
  }

   /**
   * Get grantable
   * @return grantable
  **/
  @ApiModelProperty(value = "")
  public Boolean getGrantable() {
    return grantable;
  }

  public void setGrantable(Boolean grantable) {
    this.grantable = grantable;
  }

  public MemberRole atHQ(Boolean atHQ) {
    this.atHQ = atHQ;
    return this;
  }

   /**
   * Get atHQ
   * @return atHQ
  **/
  @ApiModelProperty(value = "")
  public Boolean getAtHQ() {
    return atHQ;
  }

  public void setAtHQ(Boolean atHQ) {
    this.atHQ = atHQ;
  }

  public MemberRole atBase(Boolean atBase) {
    this.atBase = atBase;
    return this;
  }

   /**
   * Get atBase
   * @return atBase
  **/
  @ApiModelProperty(value = "")
  public Boolean getAtBase() {
    return atBase;
  }

  public void setAtBase(Boolean atBase) {
    this.atBase = atBase;
  }

  public MemberRole atOther(Boolean atOther) {
    this.atOther = atOther;
    return this;
  }

   /**
   * Get atOther
   * @return atOther
  **/
  @ApiModelProperty(value = "")
  public Boolean getAtOther() {
    return atOther;
  }

  public void setAtOther(Boolean atOther) {
    this.atOther = atOther;
  }

  public MemberRole lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public MemberRole lifeEndDate(OffsetDateTime lifeEndDate) {
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
    MemberRole memberRole = (MemberRole) o;
    return Objects.equals(this.cid, memberRole.cid) &&
        Objects.equals(this.eveKitVersion, memberRole.eveKitVersion) &&
        Objects.equals(this.lifeStart, memberRole.lifeStart) &&
        Objects.equals(this.lifeEnd, memberRole.lifeEnd) &&
        Objects.equals(this.characterID, memberRole.characterID) &&
        Objects.equals(this.roleName, memberRole.roleName) &&
        Objects.equals(this.grantable, memberRole.grantable) &&
        Objects.equals(this.atHQ, memberRole.atHQ) &&
        Objects.equals(this.atBase, memberRole.atBase) &&
        Objects.equals(this.atOther, memberRole.atOther) &&
        Objects.equals(this.lifeStartDate, memberRole.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, memberRole.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, characterID, roleName, grantable, atHQ, atBase, atOther, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberRole {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    characterID: ").append(toIndentedString(characterID)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    grantable: ").append(toIndentedString(grantable)).append("\n");
    sb.append("    atHQ: ").append(toIndentedString(atHQ)).append("\n");
    sb.append("    atBase: ").append(toIndentedString(atBase)).append("\n");
    sb.append("    atOther: ").append(toIndentedString(atOther)).append("\n");
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

