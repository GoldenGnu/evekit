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

public class CustomsOffice implements Serializable {
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

  public static final String SERIALIZED_NAME_OFFICE_I_D = "officeID";
  @SerializedName(SERIALIZED_NAME_OFFICE_I_D)
  private Long officeID;

  public static final String SERIALIZED_NAME_SOLAR_SYSTEM_I_D = "solarSystemID";
  @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_I_D)
  private Integer solarSystemID;

  public static final String SERIALIZED_NAME_REINFORCE_EXIT_START = "reinforceExitStart";
  @SerializedName(SERIALIZED_NAME_REINFORCE_EXIT_START)
  private Integer reinforceExitStart;

  public static final String SERIALIZED_NAME_REINFORCE_EXIT_END = "reinforceExitEnd";
  @SerializedName(SERIALIZED_NAME_REINFORCE_EXIT_END)
  private Integer reinforceExitEnd;

  public static final String SERIALIZED_NAME_ALLOW_ALLIANCE = "allowAlliance";
  @SerializedName(SERIALIZED_NAME_ALLOW_ALLIANCE)
  private Boolean allowAlliance = false;

  public static final String SERIALIZED_NAME_ALLOW_STANDINGS = "allowStandings";
  @SerializedName(SERIALIZED_NAME_ALLOW_STANDINGS)
  private Boolean allowStandings = false;

  public static final String SERIALIZED_NAME_STANDING_LEVEL = "standingLevel";
  @SerializedName(SERIALIZED_NAME_STANDING_LEVEL)
  private String standingLevel;

  public static final String SERIALIZED_NAME_TAX_RATE_ALLIANCE = "taxRateAlliance";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_ALLIANCE)
  private Float taxRateAlliance;

  public static final String SERIALIZED_NAME_TAX_RATE_CORP = "taxRateCorp";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_CORP)
  private Float taxRateCorp;

  public static final String SERIALIZED_NAME_TAX_RATE_STANDING_EXCELLENT = "taxRateStandingExcellent";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_STANDING_EXCELLENT)
  private Float taxRateStandingExcellent;

  public static final String SERIALIZED_NAME_TAX_RATE_STANDING_GOOD = "taxRateStandingGood";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_STANDING_GOOD)
  private Float taxRateStandingGood;

  public static final String SERIALIZED_NAME_TAX_RATE_STANDING_NEUTRAL = "taxRateStandingNeutral";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_STANDING_NEUTRAL)
  private Float taxRateStandingNeutral;

  public static final String SERIALIZED_NAME_TAX_RATE_STANDING_BAD = "taxRateStandingBad";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_STANDING_BAD)
  private Float taxRateStandingBad;

  public static final String SERIALIZED_NAME_TAX_RATE_STANDING_TERRIBLE = "taxRateStandingTerrible";
  @SerializedName(SERIALIZED_NAME_TAX_RATE_STANDING_TERRIBLE)
  private Float taxRateStandingTerrible;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public CustomsOffice cid(Long cid) {
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

  public CustomsOffice eveKitVersion(Integer eveKitVersion) {
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

  public CustomsOffice lifeStart(Long lifeStart) {
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

  public CustomsOffice lifeEnd(Long lifeEnd) {
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

  public CustomsOffice officeID(Long officeID) {
    this.officeID = officeID;
    return this;
  }

   /**
   * Get officeID
   * @return officeID
  **/
  @ApiModelProperty(value = "")
  public Long getOfficeID() {
    return officeID;
  }

  public void setOfficeID(Long officeID) {
    this.officeID = officeID;
  }

  public CustomsOffice solarSystemID(Integer solarSystemID) {
    this.solarSystemID = solarSystemID;
    return this;
  }

   /**
   * Get solarSystemID
   * @return solarSystemID
  **/
  @ApiModelProperty(value = "")
  public Integer getSolarSystemID() {
    return solarSystemID;
  }

  public void setSolarSystemID(Integer solarSystemID) {
    this.solarSystemID = solarSystemID;
  }

  public CustomsOffice reinforceExitStart(Integer reinforceExitStart) {
    this.reinforceExitStart = reinforceExitStart;
    return this;
  }

   /**
   * Get reinforceExitStart
   * @return reinforceExitStart
  **/
  @ApiModelProperty(value = "")
  public Integer getReinforceExitStart() {
    return reinforceExitStart;
  }

  public void setReinforceExitStart(Integer reinforceExitStart) {
    this.reinforceExitStart = reinforceExitStart;
  }

  public CustomsOffice reinforceExitEnd(Integer reinforceExitEnd) {
    this.reinforceExitEnd = reinforceExitEnd;
    return this;
  }

   /**
   * Get reinforceExitEnd
   * @return reinforceExitEnd
  **/
  @ApiModelProperty(value = "")
  public Integer getReinforceExitEnd() {
    return reinforceExitEnd;
  }

  public void setReinforceExitEnd(Integer reinforceExitEnd) {
    this.reinforceExitEnd = reinforceExitEnd;
  }

  public CustomsOffice allowAlliance(Boolean allowAlliance) {
    this.allowAlliance = allowAlliance;
    return this;
  }

   /**
   * Get allowAlliance
   * @return allowAlliance
  **/
  @ApiModelProperty(value = "")
  public Boolean getAllowAlliance() {
    return allowAlliance;
  }

  public void setAllowAlliance(Boolean allowAlliance) {
    this.allowAlliance = allowAlliance;
  }

  public CustomsOffice allowStandings(Boolean allowStandings) {
    this.allowStandings = allowStandings;
    return this;
  }

   /**
   * Get allowStandings
   * @return allowStandings
  **/
  @ApiModelProperty(value = "")
  public Boolean getAllowStandings() {
    return allowStandings;
  }

  public void setAllowStandings(Boolean allowStandings) {
    this.allowStandings = allowStandings;
  }

  public CustomsOffice standingLevel(String standingLevel) {
    this.standingLevel = standingLevel;
    return this;
  }

   /**
   * Get standingLevel
   * @return standingLevel
  **/
  @ApiModelProperty(value = "")
  public String getStandingLevel() {
    return standingLevel;
  }

  public void setStandingLevel(String standingLevel) {
    this.standingLevel = standingLevel;
  }

  public CustomsOffice taxRateAlliance(Float taxRateAlliance) {
    this.taxRateAlliance = taxRateAlliance;
    return this;
  }

   /**
   * Get taxRateAlliance
   * @return taxRateAlliance
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRateAlliance() {
    return taxRateAlliance;
  }

  public void setTaxRateAlliance(Float taxRateAlliance) {
    this.taxRateAlliance = taxRateAlliance;
  }

  public CustomsOffice taxRateCorp(Float taxRateCorp) {
    this.taxRateCorp = taxRateCorp;
    return this;
  }

   /**
   * Get taxRateCorp
   * @return taxRateCorp
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRateCorp() {
    return taxRateCorp;
  }

  public void setTaxRateCorp(Float taxRateCorp) {
    this.taxRateCorp = taxRateCorp;
  }

  public CustomsOffice taxRateStandingExcellent(Float taxRateStandingExcellent) {
    this.taxRateStandingExcellent = taxRateStandingExcellent;
    return this;
  }

   /**
   * Get taxRateStandingExcellent
   * @return taxRateStandingExcellent
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRateStandingExcellent() {
    return taxRateStandingExcellent;
  }

  public void setTaxRateStandingExcellent(Float taxRateStandingExcellent) {
    this.taxRateStandingExcellent = taxRateStandingExcellent;
  }

  public CustomsOffice taxRateStandingGood(Float taxRateStandingGood) {
    this.taxRateStandingGood = taxRateStandingGood;
    return this;
  }

   /**
   * Get taxRateStandingGood
   * @return taxRateStandingGood
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRateStandingGood() {
    return taxRateStandingGood;
  }

  public void setTaxRateStandingGood(Float taxRateStandingGood) {
    this.taxRateStandingGood = taxRateStandingGood;
  }

  public CustomsOffice taxRateStandingNeutral(Float taxRateStandingNeutral) {
    this.taxRateStandingNeutral = taxRateStandingNeutral;
    return this;
  }

   /**
   * Get taxRateStandingNeutral
   * @return taxRateStandingNeutral
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRateStandingNeutral() {
    return taxRateStandingNeutral;
  }

  public void setTaxRateStandingNeutral(Float taxRateStandingNeutral) {
    this.taxRateStandingNeutral = taxRateStandingNeutral;
  }

  public CustomsOffice taxRateStandingBad(Float taxRateStandingBad) {
    this.taxRateStandingBad = taxRateStandingBad;
    return this;
  }

   /**
   * Get taxRateStandingBad
   * @return taxRateStandingBad
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRateStandingBad() {
    return taxRateStandingBad;
  }

  public void setTaxRateStandingBad(Float taxRateStandingBad) {
    this.taxRateStandingBad = taxRateStandingBad;
  }

  public CustomsOffice taxRateStandingTerrible(Float taxRateStandingTerrible) {
    this.taxRateStandingTerrible = taxRateStandingTerrible;
    return this;
  }

   /**
   * Get taxRateStandingTerrible
   * @return taxRateStandingTerrible
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRateStandingTerrible() {
    return taxRateStandingTerrible;
  }

  public void setTaxRateStandingTerrible(Float taxRateStandingTerrible) {
    this.taxRateStandingTerrible = taxRateStandingTerrible;
  }

  public CustomsOffice lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public CustomsOffice lifeEndDate(OffsetDateTime lifeEndDate) {
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
    CustomsOffice customsOffice = (CustomsOffice) o;
    return Objects.equals(this.cid, customsOffice.cid) &&
        Objects.equals(this.eveKitVersion, customsOffice.eveKitVersion) &&
        Objects.equals(this.lifeStart, customsOffice.lifeStart) &&
        Objects.equals(this.lifeEnd, customsOffice.lifeEnd) &&
        Objects.equals(this.officeID, customsOffice.officeID) &&
        Objects.equals(this.solarSystemID, customsOffice.solarSystemID) &&
        Objects.equals(this.reinforceExitStart, customsOffice.reinforceExitStart) &&
        Objects.equals(this.reinforceExitEnd, customsOffice.reinforceExitEnd) &&
        Objects.equals(this.allowAlliance, customsOffice.allowAlliance) &&
        Objects.equals(this.allowStandings, customsOffice.allowStandings) &&
        Objects.equals(this.standingLevel, customsOffice.standingLevel) &&
        Objects.equals(this.taxRateAlliance, customsOffice.taxRateAlliance) &&
        Objects.equals(this.taxRateCorp, customsOffice.taxRateCorp) &&
        Objects.equals(this.taxRateStandingExcellent, customsOffice.taxRateStandingExcellent) &&
        Objects.equals(this.taxRateStandingGood, customsOffice.taxRateStandingGood) &&
        Objects.equals(this.taxRateStandingNeutral, customsOffice.taxRateStandingNeutral) &&
        Objects.equals(this.taxRateStandingBad, customsOffice.taxRateStandingBad) &&
        Objects.equals(this.taxRateStandingTerrible, customsOffice.taxRateStandingTerrible) &&
        Objects.equals(this.lifeStartDate, customsOffice.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, customsOffice.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, officeID, solarSystemID, reinforceExitStart, reinforceExitEnd, allowAlliance, allowStandings, standingLevel, taxRateAlliance, taxRateCorp, taxRateStandingExcellent, taxRateStandingGood, taxRateStandingNeutral, taxRateStandingBad, taxRateStandingTerrible, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomsOffice {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    officeID: ").append(toIndentedString(officeID)).append("\n");
    sb.append("    solarSystemID: ").append(toIndentedString(solarSystemID)).append("\n");
    sb.append("    reinforceExitStart: ").append(toIndentedString(reinforceExitStart)).append("\n");
    sb.append("    reinforceExitEnd: ").append(toIndentedString(reinforceExitEnd)).append("\n");
    sb.append("    allowAlliance: ").append(toIndentedString(allowAlliance)).append("\n");
    sb.append("    allowStandings: ").append(toIndentedString(allowStandings)).append("\n");
    sb.append("    standingLevel: ").append(toIndentedString(standingLevel)).append("\n");
    sb.append("    taxRateAlliance: ").append(toIndentedString(taxRateAlliance)).append("\n");
    sb.append("    taxRateCorp: ").append(toIndentedString(taxRateCorp)).append("\n");
    sb.append("    taxRateStandingExcellent: ").append(toIndentedString(taxRateStandingExcellent)).append("\n");
    sb.append("    taxRateStandingGood: ").append(toIndentedString(taxRateStandingGood)).append("\n");
    sb.append("    taxRateStandingNeutral: ").append(toIndentedString(taxRateStandingNeutral)).append("\n");
    sb.append("    taxRateStandingBad: ").append(toIndentedString(taxRateStandingBad)).append("\n");
    sb.append("    taxRateStandingTerrible: ").append(toIndentedString(taxRateStandingTerrible)).append("\n");
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

