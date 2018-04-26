/*
 * EveKit Model API Server
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package enterprises.orbital.evekit.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Model data common properties
 */
@ApiModel(description = "Model data common properties")

public class MemberRoleHistory implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("characterID")
  private Integer characterID = null;

  @JsonProperty("changedAt")
  private Long changedAt = null;

  @JsonProperty("issuerID")
  private Integer issuerID = null;

  @JsonProperty("roleType")
  private String roleType = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("old")
  private Boolean old = false;

  @JsonProperty("lifeStartDate")
  private OffsetDateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private OffsetDateTime lifeEndDate = null;

  public MemberRoleHistory cid(Long cid) {
    this.cid = cid;
    return this;
  }

   /**
   * Unique ID
   * @return cid
  **/
  @ApiModelProperty(example = "null", value = "Unique ID")
  public Long getCid() {
    return cid;
  }

  public void setCid(Long cid) {
    this.cid = cid;
  }

  public MemberRoleHistory eveKitVersion(Integer eveKitVersion) {
    this.eveKitVersion = eveKitVersion;
    return this;
  }

   /**
   * EveKit release version
   * @return eveKitVersion
  **/
  @ApiModelProperty(example = "null", value = "EveKit release version")
  public Integer getEveKitVersion() {
    return eveKitVersion;
  }

  public void setEveKitVersion(Integer eveKitVersion) {
    this.eveKitVersion = eveKitVersion;
  }

  public MemberRoleHistory lifeStart(Long lifeStart) {
    this.lifeStart = lifeStart;
    return this;
  }

   /**
   * Model lifeline start (milliseconds UTC)
   * @return lifeStart
  **/
  @ApiModelProperty(example = "null", value = "Model lifeline start (milliseconds UTC)")
  public Long getLifeStart() {
    return lifeStart;
  }

  public void setLifeStart(Long lifeStart) {
    this.lifeStart = lifeStart;
  }

  public MemberRoleHistory lifeEnd(Long lifeEnd) {
    this.lifeEnd = lifeEnd;
    return this;
  }

   /**
   * Model lifeline end (milliseconds UTC), MAX_LONG for live data
   * @return lifeEnd
  **/
  @ApiModelProperty(example = "null", value = "Model lifeline end (milliseconds UTC), MAX_LONG for live data")
  public Long getLifeEnd() {
    return lifeEnd;
  }

  public void setLifeEnd(Long lifeEnd) {
    this.lifeEnd = lifeEnd;
  }

  public MemberRoleHistory characterID(Integer characterID) {
    this.characterID = characterID;
    return this;
  }

   /**
   * Get characterID
   * @return characterID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCharacterID() {
    return characterID;
  }

  public void setCharacterID(Integer characterID) {
    this.characterID = characterID;
  }

  public MemberRoleHistory changedAt(Long changedAt) {
    this.changedAt = changedAt;
    return this;
  }

   /**
   * Get changedAt
   * @return changedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChangedAt() {
    return changedAt;
  }

  public void setChangedAt(Long changedAt) {
    this.changedAt = changedAt;
  }

  public MemberRoleHistory issuerID(Integer issuerID) {
    this.issuerID = issuerID;
    return this;
  }

   /**
   * Get issuerID
   * @return issuerID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIssuerID() {
    return issuerID;
  }

  public void setIssuerID(Integer issuerID) {
    this.issuerID = issuerID;
  }

  public MemberRoleHistory roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

   /**
   * Get roleType
   * @return roleType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRoleType() {
    return roleType;
  }

  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  public MemberRoleHistory roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public MemberRoleHistory old(Boolean old) {
    this.old = old;
    return this;
  }

   /**
   * Get old
   * @return old
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getOld() {
    return old;
  }

  public void setOld(Boolean old) {
    this.old = old;
  }

  public MemberRoleHistory lifeStartDate(OffsetDateTime lifeStartDate) {
    this.lifeStartDate = lifeStartDate;
    return this;
  }

   /**
   * lifeStart Date
   * @return lifeStartDate
  **/
  @ApiModelProperty(example = "null", value = "lifeStart Date")
  public OffsetDateTime getLifeStartDate() {
    return lifeStartDate;
  }

  public void setLifeStartDate(OffsetDateTime lifeStartDate) {
    this.lifeStartDate = lifeStartDate;
  }

  public MemberRoleHistory lifeEndDate(OffsetDateTime lifeEndDate) {
    this.lifeEndDate = lifeEndDate;
    return this;
  }

   /**
   * lifeEnd Date
   * @return lifeEndDate
  **/
  @ApiModelProperty(example = "null", value = "lifeEnd Date")
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
    MemberRoleHistory memberRoleHistory = (MemberRoleHistory) o;
    return Objects.equals(this.cid, memberRoleHistory.cid) &&
        Objects.equals(this.eveKitVersion, memberRoleHistory.eveKitVersion) &&
        Objects.equals(this.lifeStart, memberRoleHistory.lifeStart) &&
        Objects.equals(this.lifeEnd, memberRoleHistory.lifeEnd) &&
        Objects.equals(this.characterID, memberRoleHistory.characterID) &&
        Objects.equals(this.changedAt, memberRoleHistory.changedAt) &&
        Objects.equals(this.issuerID, memberRoleHistory.issuerID) &&
        Objects.equals(this.roleType, memberRoleHistory.roleType) &&
        Objects.equals(this.roleName, memberRoleHistory.roleName) &&
        Objects.equals(this.old, memberRoleHistory.old) &&
        Objects.equals(this.lifeStartDate, memberRoleHistory.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, memberRoleHistory.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, characterID, changedAt, issuerID, roleType, roleName, old, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberRoleHistory {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    characterID: ").append(toIndentedString(characterID)).append("\n");
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    issuerID: ").append(toIndentedString(issuerID)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    old: ").append(toIndentedString(old)).append("\n");
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
