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

public class FacWarStats implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("currentRank")
  private Integer currentRank = null;

  @JsonProperty("enlisted")
  private Long enlisted = null;

  @JsonProperty("factionID")
  private Integer factionID = null;

  @JsonProperty("factionName")
  private String factionName = null;

  @JsonProperty("highestRank")
  private Integer highestRank = null;

  @JsonProperty("killsLastWeek")
  private Integer killsLastWeek = null;

  @JsonProperty("killsTotal")
  private Integer killsTotal = null;

  @JsonProperty("killsYesterday")
  private Integer killsYesterday = null;

  @JsonProperty("pilots")
  private Integer pilots = null;

  @JsonProperty("victoryPointsLastWeek")
  private Integer victoryPointsLastWeek = null;

  @JsonProperty("victoryPointsTotal")
  private Integer victoryPointsTotal = null;

  @JsonProperty("victoryPointsYesterday")
  private Integer victoryPointsYesterday = null;

  @JsonProperty("lifeStartDate")
  private OffsetDateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private OffsetDateTime lifeEndDate = null;

  @JsonProperty("enlistedDate")
  private OffsetDateTime enlistedDate = null;

  public FacWarStats cid(Long cid) {
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

  public FacWarStats eveKitVersion(Integer eveKitVersion) {
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

  public FacWarStats lifeStart(Long lifeStart) {
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

  public FacWarStats lifeEnd(Long lifeEnd) {
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

  public FacWarStats currentRank(Integer currentRank) {
    this.currentRank = currentRank;
    return this;
  }

   /**
   * Get currentRank
   * @return currentRank
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCurrentRank() {
    return currentRank;
  }

  public void setCurrentRank(Integer currentRank) {
    this.currentRank = currentRank;
  }

  public FacWarStats enlisted(Long enlisted) {
    this.enlisted = enlisted;
    return this;
  }

   /**
   * Get enlisted
   * @return enlisted
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEnlisted() {
    return enlisted;
  }

  public void setEnlisted(Long enlisted) {
    this.enlisted = enlisted;
  }

  public FacWarStats factionID(Integer factionID) {
    this.factionID = factionID;
    return this;
  }

   /**
   * Get factionID
   * @return factionID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFactionID() {
    return factionID;
  }

  public void setFactionID(Integer factionID) {
    this.factionID = factionID;
  }

  public FacWarStats factionName(String factionName) {
    this.factionName = factionName;
    return this;
  }

   /**
   * Get factionName
   * @return factionName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFactionName() {
    return factionName;
  }

  public void setFactionName(String factionName) {
    this.factionName = factionName;
  }

  public FacWarStats highestRank(Integer highestRank) {
    this.highestRank = highestRank;
    return this;
  }

   /**
   * Get highestRank
   * @return highestRank
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getHighestRank() {
    return highestRank;
  }

  public void setHighestRank(Integer highestRank) {
    this.highestRank = highestRank;
  }

  public FacWarStats killsLastWeek(Integer killsLastWeek) {
    this.killsLastWeek = killsLastWeek;
    return this;
  }

   /**
   * Get killsLastWeek
   * @return killsLastWeek
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getKillsLastWeek() {
    return killsLastWeek;
  }

  public void setKillsLastWeek(Integer killsLastWeek) {
    this.killsLastWeek = killsLastWeek;
  }

  public FacWarStats killsTotal(Integer killsTotal) {
    this.killsTotal = killsTotal;
    return this;
  }

   /**
   * Get killsTotal
   * @return killsTotal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getKillsTotal() {
    return killsTotal;
  }

  public void setKillsTotal(Integer killsTotal) {
    this.killsTotal = killsTotal;
  }

  public FacWarStats killsYesterday(Integer killsYesterday) {
    this.killsYesterday = killsYesterday;
    return this;
  }

   /**
   * Get killsYesterday
   * @return killsYesterday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getKillsYesterday() {
    return killsYesterday;
  }

  public void setKillsYesterday(Integer killsYesterday) {
    this.killsYesterday = killsYesterday;
  }

  public FacWarStats pilots(Integer pilots) {
    this.pilots = pilots;
    return this;
  }

   /**
   * Get pilots
   * @return pilots
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPilots() {
    return pilots;
  }

  public void setPilots(Integer pilots) {
    this.pilots = pilots;
  }

  public FacWarStats victoryPointsLastWeek(Integer victoryPointsLastWeek) {
    this.victoryPointsLastWeek = victoryPointsLastWeek;
    return this;
  }

   /**
   * Get victoryPointsLastWeek
   * @return victoryPointsLastWeek
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getVictoryPointsLastWeek() {
    return victoryPointsLastWeek;
  }

  public void setVictoryPointsLastWeek(Integer victoryPointsLastWeek) {
    this.victoryPointsLastWeek = victoryPointsLastWeek;
  }

  public FacWarStats victoryPointsTotal(Integer victoryPointsTotal) {
    this.victoryPointsTotal = victoryPointsTotal;
    return this;
  }

   /**
   * Get victoryPointsTotal
   * @return victoryPointsTotal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getVictoryPointsTotal() {
    return victoryPointsTotal;
  }

  public void setVictoryPointsTotal(Integer victoryPointsTotal) {
    this.victoryPointsTotal = victoryPointsTotal;
  }

  public FacWarStats victoryPointsYesterday(Integer victoryPointsYesterday) {
    this.victoryPointsYesterday = victoryPointsYesterday;
    return this;
  }

   /**
   * Get victoryPointsYesterday
   * @return victoryPointsYesterday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getVictoryPointsYesterday() {
    return victoryPointsYesterday;
  }

  public void setVictoryPointsYesterday(Integer victoryPointsYesterday) {
    this.victoryPointsYesterday = victoryPointsYesterday;
  }

  public FacWarStats lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public FacWarStats lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public FacWarStats enlistedDate(OffsetDateTime enlistedDate) {
    this.enlistedDate = enlistedDate;
    return this;
  }

   /**
   * enlisted Date
   * @return enlistedDate
  **/
  @ApiModelProperty(example = "null", value = "enlisted Date")
  public OffsetDateTime getEnlistedDate() {
    return enlistedDate;
  }

  public void setEnlistedDate(OffsetDateTime enlistedDate) {
    this.enlistedDate = enlistedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacWarStats facWarStats = (FacWarStats) o;
    return Objects.equals(this.cid, facWarStats.cid) &&
        Objects.equals(this.eveKitVersion, facWarStats.eveKitVersion) &&
        Objects.equals(this.lifeStart, facWarStats.lifeStart) &&
        Objects.equals(this.lifeEnd, facWarStats.lifeEnd) &&
        Objects.equals(this.currentRank, facWarStats.currentRank) &&
        Objects.equals(this.enlisted, facWarStats.enlisted) &&
        Objects.equals(this.factionID, facWarStats.factionID) &&
        Objects.equals(this.factionName, facWarStats.factionName) &&
        Objects.equals(this.highestRank, facWarStats.highestRank) &&
        Objects.equals(this.killsLastWeek, facWarStats.killsLastWeek) &&
        Objects.equals(this.killsTotal, facWarStats.killsTotal) &&
        Objects.equals(this.killsYesterday, facWarStats.killsYesterday) &&
        Objects.equals(this.pilots, facWarStats.pilots) &&
        Objects.equals(this.victoryPointsLastWeek, facWarStats.victoryPointsLastWeek) &&
        Objects.equals(this.victoryPointsTotal, facWarStats.victoryPointsTotal) &&
        Objects.equals(this.victoryPointsYesterday, facWarStats.victoryPointsYesterday) &&
        Objects.equals(this.lifeStartDate, facWarStats.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, facWarStats.lifeEndDate) &&
        Objects.equals(this.enlistedDate, facWarStats.enlistedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, currentRank, enlisted, factionID, factionName, highestRank, killsLastWeek, killsTotal, killsYesterday, pilots, victoryPointsLastWeek, victoryPointsTotal, victoryPointsYesterday, lifeStartDate, lifeEndDate, enlistedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacWarStats {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    currentRank: ").append(toIndentedString(currentRank)).append("\n");
    sb.append("    enlisted: ").append(toIndentedString(enlisted)).append("\n");
    sb.append("    factionID: ").append(toIndentedString(factionID)).append("\n");
    sb.append("    factionName: ").append(toIndentedString(factionName)).append("\n");
    sb.append("    highestRank: ").append(toIndentedString(highestRank)).append("\n");
    sb.append("    killsLastWeek: ").append(toIndentedString(killsLastWeek)).append("\n");
    sb.append("    killsTotal: ").append(toIndentedString(killsTotal)).append("\n");
    sb.append("    killsYesterday: ").append(toIndentedString(killsYesterday)).append("\n");
    sb.append("    pilots: ").append(toIndentedString(pilots)).append("\n");
    sb.append("    victoryPointsLastWeek: ").append(toIndentedString(victoryPointsLastWeek)).append("\n");
    sb.append("    victoryPointsTotal: ").append(toIndentedString(victoryPointsTotal)).append("\n");
    sb.append("    victoryPointsYesterday: ").append(toIndentedString(victoryPointsYesterday)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    enlistedDate: ").append(toIndentedString(enlistedDate)).append("\n");
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

