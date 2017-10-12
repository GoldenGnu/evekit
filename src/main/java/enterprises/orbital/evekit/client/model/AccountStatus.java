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

public class AccountStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("paidUntil")
  private Long paidUntil = null;

  @JsonProperty("createDate")
  private Long createDate = null;

  @JsonProperty("logonCount")
  private Long logonCount = null;

  @JsonProperty("logonMinutes")
  private Long logonMinutes = null;

  @JsonProperty("multiCharacterTraining")
  private List<Long> multiCharacterTraining = new ArrayList<Long>();

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  @JsonProperty("paidUntilDate")
  private DateTime paidUntilDate = null;

  @JsonProperty("createDateDate")
  private DateTime createDateDate = null;

  public AccountStatus cid(Long cid) {
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

  public AccountStatus eveKitVersion(Integer eveKitVersion) {
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

  public AccountStatus lifeStart(Long lifeStart) {
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

  public AccountStatus lifeEnd(Long lifeEnd) {
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

  public AccountStatus paidUntil(Long paidUntil) {
    this.paidUntil = paidUntil;
    return this;
  }

   /**
   * Get paidUntil
   * @return paidUntil
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPaidUntil() {
    return paidUntil;
  }

  public void setPaidUntil(Long paidUntil) {
    this.paidUntil = paidUntil;
  }

  public AccountStatus createDate(Long createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Long createDate) {
    this.createDate = createDate;
  }

  public AccountStatus logonCount(Long logonCount) {
    this.logonCount = logonCount;
    return this;
  }

   /**
   * Get logonCount
   * @return logonCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLogonCount() {
    return logonCount;
  }

  public void setLogonCount(Long logonCount) {
    this.logonCount = logonCount;
  }

  public AccountStatus logonMinutes(Long logonMinutes) {
    this.logonMinutes = logonMinutes;
    return this;
  }

   /**
   * Get logonMinutes
   * @return logonMinutes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLogonMinutes() {
    return logonMinutes;
  }

  public void setLogonMinutes(Long logonMinutes) {
    this.logonMinutes = logonMinutes;
  }

  public AccountStatus multiCharacterTraining(List<Long> multiCharacterTraining) {
    this.multiCharacterTraining = multiCharacterTraining;
    return this;
  }

  public AccountStatus addMultiCharacterTrainingItem(Long multiCharacterTrainingItem) {
    this.multiCharacterTraining.add(multiCharacterTrainingItem);
    return this;
  }

   /**
   * Get multiCharacterTraining
   * @return multiCharacterTraining
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getMultiCharacterTraining() {
    return multiCharacterTraining;
  }

  public void setMultiCharacterTraining(List<Long> multiCharacterTraining) {
    this.multiCharacterTraining = multiCharacterTraining;
  }

  public AccountStatus lifeStartDate(DateTime lifeStartDate) {
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

  public AccountStatus lifeEndDate(DateTime lifeEndDate) {
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

  public AccountStatus paidUntilDate(DateTime paidUntilDate) {
    this.paidUntilDate = paidUntilDate;
    return this;
  }

   /**
   * paidUntil Date
   * @return paidUntilDate
  **/
  @ApiModelProperty(example = "null", value = "paidUntil Date")
  public DateTime getPaidUntilDate() {
    return paidUntilDate;
  }

  public void setPaidUntilDate(DateTime paidUntilDate) {
    this.paidUntilDate = paidUntilDate;
  }

  public AccountStatus createDateDate(DateTime createDateDate) {
    this.createDateDate = createDateDate;
    return this;
  }

   /**
   * createDate Date
   * @return createDateDate
  **/
  @ApiModelProperty(example = "null", value = "createDate Date")
  public DateTime getCreateDateDate() {
    return createDateDate;
  }

  public void setCreateDateDate(DateTime createDateDate) {
    this.createDateDate = createDateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountStatus accountStatus = (AccountStatus) o;
    return Objects.equals(this.cid, accountStatus.cid) &&
        Objects.equals(this.eveKitVersion, accountStatus.eveKitVersion) &&
        Objects.equals(this.lifeStart, accountStatus.lifeStart) &&
        Objects.equals(this.lifeEnd, accountStatus.lifeEnd) &&
        Objects.equals(this.paidUntil, accountStatus.paidUntil) &&
        Objects.equals(this.createDate, accountStatus.createDate) &&
        Objects.equals(this.logonCount, accountStatus.logonCount) &&
        Objects.equals(this.logonMinutes, accountStatus.logonMinutes) &&
        Objects.equals(this.multiCharacterTraining, accountStatus.multiCharacterTraining) &&
        Objects.equals(this.lifeStartDate, accountStatus.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, accountStatus.lifeEndDate) &&
        Objects.equals(this.paidUntilDate, accountStatus.paidUntilDate) &&
        Objects.equals(this.createDateDate, accountStatus.createDateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, paidUntil, createDate, logonCount, logonMinutes, multiCharacterTraining, lifeStartDate, lifeEndDate, paidUntilDate, createDateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountStatus {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    paidUntil: ").append(toIndentedString(paidUntil)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    logonCount: ").append(toIndentedString(logonCount)).append("\n");
    sb.append("    logonMinutes: ").append(toIndentedString(logonMinutes)).append("\n");
    sb.append("    multiCharacterTraining: ").append(toIndentedString(multiCharacterTraining)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    paidUntilDate: ").append(toIndentedString(paidUntilDate)).append("\n");
    sb.append("    createDateDate: ").append(toIndentedString(createDateDate)).append("\n");
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

