/*
 * EveKit Model API Server
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
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

public class FacWarStats implements Serializable {
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

  public static final String SERIALIZED_NAME_CURRENT_RANK = "currentRank";
  @SerializedName(SERIALIZED_NAME_CURRENT_RANK)
  private Integer currentRank;

  public static final String SERIALIZED_NAME_ENLISTED = "enlisted";
  @SerializedName(SERIALIZED_NAME_ENLISTED)
  private Long enlisted;

  public static final String SERIALIZED_NAME_FACTION_I_D = "factionID";
  @SerializedName(SERIALIZED_NAME_FACTION_I_D)
  private Integer factionID;

  public static final String SERIALIZED_NAME_HIGHEST_RANK = "highestRank";
  @SerializedName(SERIALIZED_NAME_HIGHEST_RANK)
  private Integer highestRank;

  public static final String SERIALIZED_NAME_KILLS_LAST_WEEK = "killsLastWeek";
  @SerializedName(SERIALIZED_NAME_KILLS_LAST_WEEK)
  private Integer killsLastWeek;

  public static final String SERIALIZED_NAME_KILLS_TOTAL = "killsTotal";
  @SerializedName(SERIALIZED_NAME_KILLS_TOTAL)
  private Integer killsTotal;

  public static final String SERIALIZED_NAME_KILLS_YESTERDAY = "killsYesterday";
  @SerializedName(SERIALIZED_NAME_KILLS_YESTERDAY)
  private Integer killsYesterday;

  public static final String SERIALIZED_NAME_PILOTS = "pilots";
  @SerializedName(SERIALIZED_NAME_PILOTS)
  private Integer pilots;

  public static final String SERIALIZED_NAME_VICTORY_POINTS_LAST_WEEK = "victoryPointsLastWeek";
  @SerializedName(SERIALIZED_NAME_VICTORY_POINTS_LAST_WEEK)
  private Integer victoryPointsLastWeek;

  public static final String SERIALIZED_NAME_VICTORY_POINTS_TOTAL = "victoryPointsTotal";
  @SerializedName(SERIALIZED_NAME_VICTORY_POINTS_TOTAL)
  private Integer victoryPointsTotal;

  public static final String SERIALIZED_NAME_VICTORY_POINTS_YESTERDAY = "victoryPointsYesterday";
  @SerializedName(SERIALIZED_NAME_VICTORY_POINTS_YESTERDAY)
  private Integer victoryPointsYesterday;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_ENLISTED_DATE = "enlistedDate";
  @SerializedName(SERIALIZED_NAME_ENLISTED_DATE)
  private OffsetDateTime enlistedDate;

  public FacWarStats cid(Long cid) {
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

  public FacWarStats eveKitVersion(Integer eveKitVersion) {
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

  public FacWarStats lifeStart(Long lifeStart) {
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

  public FacWarStats lifeEnd(Long lifeEnd) {
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

  public FacWarStats currentRank(Integer currentRank) {
    this.currentRank = currentRank;
    return this;
  }

   /**
   * Get currentRank
   * @return currentRank
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public Integer getFactionID() {
    return factionID;
  }

  public void setFactionID(Integer factionID) {
    this.factionID = factionID;
  }

  public FacWarStats highestRank(Integer highestRank) {
    this.highestRank = highestRank;
    return this;
  }

   /**
   * Get highestRank
   * @return highestRank
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "lifeStart Date")
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
  @ApiModelProperty(value = "lifeEnd Date")
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
  @ApiModelProperty(value = "enlisted Date")
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
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, currentRank, enlisted, factionID, highestRank, killsLastWeek, killsTotal, killsYesterday, pilots, victoryPointsLastWeek, victoryPointsTotal, victoryPointsYesterday, lifeStartDate, lifeEndDate, enlistedDate);
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

