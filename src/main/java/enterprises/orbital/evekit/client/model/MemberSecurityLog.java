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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Model data common properties
 */
@ApiModel(description = "Model data common properties")

public class MemberSecurityLog implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("changeTime")
  private Long changeTime = null;

  @JsonProperty("changedCharacterID")
  private Long changedCharacterID = null;

  @JsonProperty("changedCharacterName")
  private String changedCharacterName = null;

  @JsonProperty("issuerID")
  private Long issuerID = null;

  @JsonProperty("issuerName")
  private String issuerName = null;

  @JsonProperty("roleLocationType")
  private String roleLocationType = null;

  @JsonProperty("oldRoles")
  private List<Long> oldRoles = new ArrayList<Long>();

  @JsonProperty("newRoles")
  private List<Long> newRoles = new ArrayList<Long>();

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  @JsonProperty("changeTimeDate")
  private DateTime changeTimeDate = null;

  public MemberSecurityLog cid(Long cid) {
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

  public MemberSecurityLog eveKitVersion(Integer eveKitVersion) {
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

  public MemberSecurityLog lifeStart(Long lifeStart) {
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

  public MemberSecurityLog lifeEnd(Long lifeEnd) {
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

  public MemberSecurityLog changeTime(Long changeTime) {
    this.changeTime = changeTime;
    return this;
  }

   /**
   * Get changeTime
   * @return changeTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChangeTime() {
    return changeTime;
  }

  public void setChangeTime(Long changeTime) {
    this.changeTime = changeTime;
  }

  public MemberSecurityLog changedCharacterID(Long changedCharacterID) {
    this.changedCharacterID = changedCharacterID;
    return this;
  }

   /**
   * Get changedCharacterID
   * @return changedCharacterID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChangedCharacterID() {
    return changedCharacterID;
  }

  public void setChangedCharacterID(Long changedCharacterID) {
    this.changedCharacterID = changedCharacterID;
  }

  public MemberSecurityLog changedCharacterName(String changedCharacterName) {
    this.changedCharacterName = changedCharacterName;
    return this;
  }

   /**
   * Get changedCharacterName
   * @return changedCharacterName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChangedCharacterName() {
    return changedCharacterName;
  }

  public void setChangedCharacterName(String changedCharacterName) {
    this.changedCharacterName = changedCharacterName;
  }

  public MemberSecurityLog issuerID(Long issuerID) {
    this.issuerID = issuerID;
    return this;
  }

   /**
   * Get issuerID
   * @return issuerID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getIssuerID() {
    return issuerID;
  }

  public void setIssuerID(Long issuerID) {
    this.issuerID = issuerID;
  }

  public MemberSecurityLog issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

   /**
   * Get issuerName
   * @return issuerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIssuerName() {
    return issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }

  public MemberSecurityLog roleLocationType(String roleLocationType) {
    this.roleLocationType = roleLocationType;
    return this;
  }

   /**
   * Get roleLocationType
   * @return roleLocationType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRoleLocationType() {
    return roleLocationType;
  }

  public void setRoleLocationType(String roleLocationType) {
    this.roleLocationType = roleLocationType;
  }

  public MemberSecurityLog oldRoles(List<Long> oldRoles) {
    this.oldRoles = oldRoles;
    return this;
  }

  public MemberSecurityLog addOldRolesItem(Long oldRolesItem) {
    this.oldRoles.add(oldRolesItem);
    return this;
  }

   /**
   * Get oldRoles
   * @return oldRoles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getOldRoles() {
    return oldRoles;
  }

  public void setOldRoles(List<Long> oldRoles) {
    this.oldRoles = oldRoles;
  }

  public MemberSecurityLog newRoles(List<Long> newRoles) {
    this.newRoles = newRoles;
    return this;
  }

  public MemberSecurityLog addNewRolesItem(Long newRolesItem) {
    this.newRoles.add(newRolesItem);
    return this;
  }

   /**
   * Get newRoles
   * @return newRoles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getNewRoles() {
    return newRoles;
  }

  public void setNewRoles(List<Long> newRoles) {
    this.newRoles = newRoles;
  }

  public MemberSecurityLog lifeStartDate(DateTime lifeStartDate) {
    this.lifeStartDate = lifeStartDate;
    return this;
  }

   /**
   * lifeStart Date
   * @return lifeStartDate
  **/
  @ApiModelProperty(example = "null", value = "lifeStart Date")
  public DateTime getLifeStartDate() {
    return lifeStartDate;
  }

  public void setLifeStartDate(DateTime lifeStartDate) {
    this.lifeStartDate = lifeStartDate;
  }

  public MemberSecurityLog lifeEndDate(DateTime lifeEndDate) {
    this.lifeEndDate = lifeEndDate;
    return this;
  }

   /**
   * lifeEnd Date
   * @return lifeEndDate
  **/
  @ApiModelProperty(example = "null", value = "lifeEnd Date")
  public DateTime getLifeEndDate() {
    return lifeEndDate;
  }

  public void setLifeEndDate(DateTime lifeEndDate) {
    this.lifeEndDate = lifeEndDate;
  }

  public MemberSecurityLog changeTimeDate(DateTime changeTimeDate) {
    this.changeTimeDate = changeTimeDate;
    return this;
  }

   /**
   * changeTime Date
   * @return changeTimeDate
  **/
  @ApiModelProperty(example = "null", value = "changeTime Date")
  public DateTime getChangeTimeDate() {
    return changeTimeDate;
  }

  public void setChangeTimeDate(DateTime changeTimeDate) {
    this.changeTimeDate = changeTimeDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSecurityLog memberSecurityLog = (MemberSecurityLog) o;
    return Objects.equals(this.cid, memberSecurityLog.cid) &&
        Objects.equals(this.eveKitVersion, memberSecurityLog.eveKitVersion) &&
        Objects.equals(this.lifeStart, memberSecurityLog.lifeStart) &&
        Objects.equals(this.lifeEnd, memberSecurityLog.lifeEnd) &&
        Objects.equals(this.changeTime, memberSecurityLog.changeTime) &&
        Objects.equals(this.changedCharacterID, memberSecurityLog.changedCharacterID) &&
        Objects.equals(this.changedCharacterName, memberSecurityLog.changedCharacterName) &&
        Objects.equals(this.issuerID, memberSecurityLog.issuerID) &&
        Objects.equals(this.issuerName, memberSecurityLog.issuerName) &&
        Objects.equals(this.roleLocationType, memberSecurityLog.roleLocationType) &&
        Objects.equals(this.oldRoles, memberSecurityLog.oldRoles) &&
        Objects.equals(this.newRoles, memberSecurityLog.newRoles) &&
        Objects.equals(this.lifeStartDate, memberSecurityLog.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, memberSecurityLog.lifeEndDate) &&
        Objects.equals(this.changeTimeDate, memberSecurityLog.changeTimeDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, changeTime, changedCharacterID, changedCharacterName, issuerID, issuerName, roleLocationType, oldRoles, newRoles, lifeStartDate, lifeEndDate, changeTimeDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSecurityLog {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    changeTime: ").append(toIndentedString(changeTime)).append("\n");
    sb.append("    changedCharacterID: ").append(toIndentedString(changedCharacterID)).append("\n");
    sb.append("    changedCharacterName: ").append(toIndentedString(changedCharacterName)).append("\n");
    sb.append("    issuerID: ").append(toIndentedString(issuerID)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
    sb.append("    roleLocationType: ").append(toIndentedString(roleLocationType)).append("\n");
    sb.append("    oldRoles: ").append(toIndentedString(oldRoles)).append("\n");
    sb.append("    newRoles: ").append(toIndentedString(newRoles)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    changeTimeDate: ").append(toIndentedString(changeTimeDate)).append("\n");
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

