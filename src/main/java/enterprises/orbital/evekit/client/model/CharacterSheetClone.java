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

public class CharacterSheetClone implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("cloneJumpDate")
  private Long cloneJumpDate = null;

  @JsonProperty("homeStationID")
  private Long homeStationID = null;

  @JsonProperty("homeStationType")
  private String homeStationType = null;

  @JsonProperty("lastStationChangeDate")
  private Long lastStationChangeDate = null;

  @JsonProperty("lifeStartDate")
  private OffsetDateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private OffsetDateTime lifeEndDate = null;

  @JsonProperty("cloneJumpDateDate")
  private OffsetDateTime cloneJumpDateDate = null;

  @JsonProperty("lastStationChangeDateDate")
  private OffsetDateTime lastStationChangeDateDate = null;

  public CharacterSheetClone cid(Long cid) {
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

  public CharacterSheetClone eveKitVersion(Integer eveKitVersion) {
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

  public CharacterSheetClone lifeStart(Long lifeStart) {
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

  public CharacterSheetClone lifeEnd(Long lifeEnd) {
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

  public CharacterSheetClone cloneJumpDate(Long cloneJumpDate) {
    this.cloneJumpDate = cloneJumpDate;
    return this;
  }

   /**
   * Get cloneJumpDate
   * @return cloneJumpDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCloneJumpDate() {
    return cloneJumpDate;
  }

  public void setCloneJumpDate(Long cloneJumpDate) {
    this.cloneJumpDate = cloneJumpDate;
  }

  public CharacterSheetClone homeStationID(Long homeStationID) {
    this.homeStationID = homeStationID;
    return this;
  }

   /**
   * Get homeStationID
   * @return homeStationID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getHomeStationID() {
    return homeStationID;
  }

  public void setHomeStationID(Long homeStationID) {
    this.homeStationID = homeStationID;
  }

  public CharacterSheetClone homeStationType(String homeStationType) {
    this.homeStationType = homeStationType;
    return this;
  }

   /**
   * Get homeStationType
   * @return homeStationType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHomeStationType() {
    return homeStationType;
  }

  public void setHomeStationType(String homeStationType) {
    this.homeStationType = homeStationType;
  }

  public CharacterSheetClone lastStationChangeDate(Long lastStationChangeDate) {
    this.lastStationChangeDate = lastStationChangeDate;
    return this;
  }

   /**
   * Get lastStationChangeDate
   * @return lastStationChangeDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLastStationChangeDate() {
    return lastStationChangeDate;
  }

  public void setLastStationChangeDate(Long lastStationChangeDate) {
    this.lastStationChangeDate = lastStationChangeDate;
  }

  public CharacterSheetClone lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public CharacterSheetClone lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public CharacterSheetClone cloneJumpDateDate(OffsetDateTime cloneJumpDateDate) {
    this.cloneJumpDateDate = cloneJumpDateDate;
    return this;
  }

   /**
   * cloneJumpDate Date
   * @return cloneJumpDateDate
  **/
  @ApiModelProperty(example = "null", value = "cloneJumpDate Date")
  public OffsetDateTime getCloneJumpDateDate() {
    return cloneJumpDateDate;
  }

  public void setCloneJumpDateDate(OffsetDateTime cloneJumpDateDate) {
    this.cloneJumpDateDate = cloneJumpDateDate;
  }

  public CharacterSheetClone lastStationChangeDateDate(OffsetDateTime lastStationChangeDateDate) {
    this.lastStationChangeDateDate = lastStationChangeDateDate;
    return this;
  }

   /**
   * lastStationChangeDate Date
   * @return lastStationChangeDateDate
  **/
  @ApiModelProperty(example = "null", value = "lastStationChangeDate Date")
  public OffsetDateTime getLastStationChangeDateDate() {
    return lastStationChangeDateDate;
  }

  public void setLastStationChangeDateDate(OffsetDateTime lastStationChangeDateDate) {
    this.lastStationChangeDateDate = lastStationChangeDateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterSheetClone characterSheetClone = (CharacterSheetClone) o;
    return Objects.equals(this.cid, characterSheetClone.cid) &&
        Objects.equals(this.eveKitVersion, characterSheetClone.eveKitVersion) &&
        Objects.equals(this.lifeStart, characterSheetClone.lifeStart) &&
        Objects.equals(this.lifeEnd, characterSheetClone.lifeEnd) &&
        Objects.equals(this.cloneJumpDate, characterSheetClone.cloneJumpDate) &&
        Objects.equals(this.homeStationID, characterSheetClone.homeStationID) &&
        Objects.equals(this.homeStationType, characterSheetClone.homeStationType) &&
        Objects.equals(this.lastStationChangeDate, characterSheetClone.lastStationChangeDate) &&
        Objects.equals(this.lifeStartDate, characterSheetClone.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, characterSheetClone.lifeEndDate) &&
        Objects.equals(this.cloneJumpDateDate, characterSheetClone.cloneJumpDateDate) &&
        Objects.equals(this.lastStationChangeDateDate, characterSheetClone.lastStationChangeDateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, cloneJumpDate, homeStationID, homeStationType, lastStationChangeDate, lifeStartDate, lifeEndDate, cloneJumpDateDate, lastStationChangeDateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterSheetClone {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    cloneJumpDate: ").append(toIndentedString(cloneJumpDate)).append("\n");
    sb.append("    homeStationID: ").append(toIndentedString(homeStationID)).append("\n");
    sb.append("    homeStationType: ").append(toIndentedString(homeStationType)).append("\n");
    sb.append("    lastStationChangeDate: ").append(toIndentedString(lastStationChangeDate)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    cloneJumpDateDate: ").append(toIndentedString(cloneJumpDateDate)).append("\n");
    sb.append("    lastStationChangeDateDate: ").append(toIndentedString(lastStationChangeDateDate)).append("\n");
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

