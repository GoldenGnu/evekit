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

public class CharacterSheetSkillPoints implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("totalSkillPoints")
  private Long totalSkillPoints = null;

  @JsonProperty("unallocatedSkillPoints")
  private Integer unallocatedSkillPoints = null;

  @JsonProperty("lifeStartDate")
  private OffsetDateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private OffsetDateTime lifeEndDate = null;

  public CharacterSheetSkillPoints cid(Long cid) {
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

  public CharacterSheetSkillPoints eveKitVersion(Integer eveKitVersion) {
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

  public CharacterSheetSkillPoints lifeStart(Long lifeStart) {
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

  public CharacterSheetSkillPoints lifeEnd(Long lifeEnd) {
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

  public CharacterSheetSkillPoints totalSkillPoints(Long totalSkillPoints) {
    this.totalSkillPoints = totalSkillPoints;
    return this;
  }

   /**
   * Get totalSkillPoints
   * @return totalSkillPoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotalSkillPoints() {
    return totalSkillPoints;
  }

  public void setTotalSkillPoints(Long totalSkillPoints) {
    this.totalSkillPoints = totalSkillPoints;
  }

  public CharacterSheetSkillPoints unallocatedSkillPoints(Integer unallocatedSkillPoints) {
    this.unallocatedSkillPoints = unallocatedSkillPoints;
    return this;
  }

   /**
   * Get unallocatedSkillPoints
   * @return unallocatedSkillPoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUnallocatedSkillPoints() {
    return unallocatedSkillPoints;
  }

  public void setUnallocatedSkillPoints(Integer unallocatedSkillPoints) {
    this.unallocatedSkillPoints = unallocatedSkillPoints;
  }

  public CharacterSheetSkillPoints lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public CharacterSheetSkillPoints lifeEndDate(OffsetDateTime lifeEndDate) {
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
    CharacterSheetSkillPoints characterSheetSkillPoints = (CharacterSheetSkillPoints) o;
    return Objects.equals(this.cid, characterSheetSkillPoints.cid) &&
        Objects.equals(this.eveKitVersion, characterSheetSkillPoints.eveKitVersion) &&
        Objects.equals(this.lifeStart, characterSheetSkillPoints.lifeStart) &&
        Objects.equals(this.lifeEnd, characterSheetSkillPoints.lifeEnd) &&
        Objects.equals(this.totalSkillPoints, characterSheetSkillPoints.totalSkillPoints) &&
        Objects.equals(this.unallocatedSkillPoints, characterSheetSkillPoints.unallocatedSkillPoints) &&
        Objects.equals(this.lifeStartDate, characterSheetSkillPoints.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, characterSheetSkillPoints.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, totalSkillPoints, unallocatedSkillPoints, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterSheetSkillPoints {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    totalSkillPoints: ").append(toIndentedString(totalSkillPoints)).append("\n");
    sb.append("    unallocatedSkillPoints: ").append(toIndentedString(unallocatedSkillPoints)).append("\n");
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
