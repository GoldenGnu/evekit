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

public class CorporationSheet implements Serializable {
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

  public static final String SERIALIZED_NAME_ALLIANCE_I_D = "allianceID";
  @SerializedName(SERIALIZED_NAME_ALLIANCE_I_D)
  private Integer allianceID;

  public static final String SERIALIZED_NAME_CEO_I_D = "ceoID";
  @SerializedName(SERIALIZED_NAME_CEO_I_D)
  private Integer ceoID;

  public static final String SERIALIZED_NAME_CORPORATION_I_D = "corporationID";
  @SerializedName(SERIALIZED_NAME_CORPORATION_I_D)
  private Long corporationID;

  public static final String SERIALIZED_NAME_CORPORATION_NAME = "corporationName";
  @SerializedName(SERIALIZED_NAME_CORPORATION_NAME)
  private String corporationName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_MEMBER_COUNT = "memberCount";
  @SerializedName(SERIALIZED_NAME_MEMBER_COUNT)
  private Integer memberCount;

  public static final String SERIALIZED_NAME_SHARES = "shares";
  @SerializedName(SERIALIZED_NAME_SHARES)
  private Long shares;

  public static final String SERIALIZED_NAME_STATION_I_D = "stationID";
  @SerializedName(SERIALIZED_NAME_STATION_I_D)
  private Integer stationID;

  public static final String SERIALIZED_NAME_TAX_RATE = "taxRate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private Float taxRate;

  public static final String SERIALIZED_NAME_TICKER = "ticker";
  @SerializedName(SERIALIZED_NAME_TICKER)
  private String ticker;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_DATE_FOUNDED = "dateFounded";
  @SerializedName(SERIALIZED_NAME_DATE_FOUNDED)
  private Long dateFounded;

  public static final String SERIALIZED_NAME_CREATOR_I_D = "creatorID";
  @SerializedName(SERIALIZED_NAME_CREATOR_I_D)
  private Integer creatorID;

  public static final String SERIALIZED_NAME_FACTION_I_D = "factionID";
  @SerializedName(SERIALIZED_NAME_FACTION_I_D)
  private Integer factionID;

  public static final String SERIALIZED_NAME_PX64X64 = "px64x64";
  @SerializedName(SERIALIZED_NAME_PX64X64)
  private String px64x64;

  public static final String SERIALIZED_NAME_PX128X128 = "px128x128";
  @SerializedName(SERIALIZED_NAME_PX128X128)
  private String px128x128;

  public static final String SERIALIZED_NAME_PX256X256 = "px256x256";
  @SerializedName(SERIALIZED_NAME_PX256X256)
  private String px256x256;

  public static final String SERIALIZED_NAME_WAR_ELIGIBLE = "warEligible";
  @SerializedName(SERIALIZED_NAME_WAR_ELIGIBLE)
  private Boolean warEligible = false;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_DATE_FOUNDED_DATE = "dateFoundedDate";
  @SerializedName(SERIALIZED_NAME_DATE_FOUNDED_DATE)
  private OffsetDateTime dateFoundedDate;

  public CorporationSheet cid(Long cid) {
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

  public CorporationSheet eveKitVersion(Integer eveKitVersion) {
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

  public CorporationSheet lifeStart(Long lifeStart) {
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

  public CorporationSheet lifeEnd(Long lifeEnd) {
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

  public CorporationSheet allianceID(Integer allianceID) {
    this.allianceID = allianceID;
    return this;
  }

   /**
   * Get allianceID
   * @return allianceID
  **/
  @ApiModelProperty(value = "")
  public Integer getAllianceID() {
    return allianceID;
  }

  public void setAllianceID(Integer allianceID) {
    this.allianceID = allianceID;
  }

  public CorporationSheet ceoID(Integer ceoID) {
    this.ceoID = ceoID;
    return this;
  }

   /**
   * Get ceoID
   * @return ceoID
  **/
  @ApiModelProperty(value = "")
  public Integer getCeoID() {
    return ceoID;
  }

  public void setCeoID(Integer ceoID) {
    this.ceoID = ceoID;
  }

  public CorporationSheet corporationID(Long corporationID) {
    this.corporationID = corporationID;
    return this;
  }

   /**
   * Get corporationID
   * @return corporationID
  **/
  @ApiModelProperty(value = "")
  public Long getCorporationID() {
    return corporationID;
  }

  public void setCorporationID(Long corporationID) {
    this.corporationID = corporationID;
  }

  public CorporationSheet corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

   /**
   * Get corporationName
   * @return corporationName
  **/
  @ApiModelProperty(value = "")
  public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public CorporationSheet description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CorporationSheet memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Get memberCount
   * @return memberCount
  **/
  @ApiModelProperty(value = "")
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public CorporationSheet shares(Long shares) {
    this.shares = shares;
    return this;
  }

   /**
   * Get shares
   * @return shares
  **/
  @ApiModelProperty(value = "")
  public Long getShares() {
    return shares;
  }

  public void setShares(Long shares) {
    this.shares = shares;
  }

  public CorporationSheet stationID(Integer stationID) {
    this.stationID = stationID;
    return this;
  }

   /**
   * Get stationID
   * @return stationID
  **/
  @ApiModelProperty(value = "")
  public Integer getStationID() {
    return stationID;
  }

  public void setStationID(Integer stationID) {
    this.stationID = stationID;
  }

  public CorporationSheet taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @ApiModelProperty(value = "")
  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public CorporationSheet ticker(String ticker) {
    this.ticker = ticker;
    return this;
  }

   /**
   * Get ticker
   * @return ticker
  **/
  @ApiModelProperty(value = "")
  public String getTicker() {
    return ticker;
  }

  public void setTicker(String ticker) {
    this.ticker = ticker;
  }

  public CorporationSheet url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CorporationSheet dateFounded(Long dateFounded) {
    this.dateFounded = dateFounded;
    return this;
  }

   /**
   * Get dateFounded
   * @return dateFounded
  **/
  @ApiModelProperty(value = "")
  public Long getDateFounded() {
    return dateFounded;
  }

  public void setDateFounded(Long dateFounded) {
    this.dateFounded = dateFounded;
  }

  public CorporationSheet creatorID(Integer creatorID) {
    this.creatorID = creatorID;
    return this;
  }

   /**
   * Get creatorID
   * @return creatorID
  **/
  @ApiModelProperty(value = "")
  public Integer getCreatorID() {
    return creatorID;
  }

  public void setCreatorID(Integer creatorID) {
    this.creatorID = creatorID;
  }

  public CorporationSheet factionID(Integer factionID) {
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

  public CorporationSheet px64x64(String px64x64) {
    this.px64x64 = px64x64;
    return this;
  }

   /**
   * Get px64x64
   * @return px64x64
  **/
  @ApiModelProperty(value = "")
  public String getPx64x64() {
    return px64x64;
  }

  public void setPx64x64(String px64x64) {
    this.px64x64 = px64x64;
  }

  public CorporationSheet px128x128(String px128x128) {
    this.px128x128 = px128x128;
    return this;
  }

   /**
   * Get px128x128
   * @return px128x128
  **/
  @ApiModelProperty(value = "")
  public String getPx128x128() {
    return px128x128;
  }

  public void setPx128x128(String px128x128) {
    this.px128x128 = px128x128;
  }

  public CorporationSheet px256x256(String px256x256) {
    this.px256x256 = px256x256;
    return this;
  }

   /**
   * Get px256x256
   * @return px256x256
  **/
  @ApiModelProperty(value = "")
  public String getPx256x256() {
    return px256x256;
  }

  public void setPx256x256(String px256x256) {
    this.px256x256 = px256x256;
  }

  public CorporationSheet warEligible(Boolean warEligible) {
    this.warEligible = warEligible;
    return this;
  }

   /**
   * Get warEligible
   * @return warEligible
  **/
  @ApiModelProperty(value = "")
  public Boolean getWarEligible() {
    return warEligible;
  }

  public void setWarEligible(Boolean warEligible) {
    this.warEligible = warEligible;
  }

  public CorporationSheet lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public CorporationSheet lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public CorporationSheet dateFoundedDate(OffsetDateTime dateFoundedDate) {
    this.dateFoundedDate = dateFoundedDate;
    return this;
  }

   /**
   * dateFounded Date
   * @return dateFoundedDate
  **/
  @ApiModelProperty(value = "dateFounded Date")
  public OffsetDateTime getDateFoundedDate() {
    return dateFoundedDate;
  }

  public void setDateFoundedDate(OffsetDateTime dateFoundedDate) {
    this.dateFoundedDate = dateFoundedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporationSheet corporationSheet = (CorporationSheet) o;
    return Objects.equals(this.cid, corporationSheet.cid) &&
        Objects.equals(this.eveKitVersion, corporationSheet.eveKitVersion) &&
        Objects.equals(this.lifeStart, corporationSheet.lifeStart) &&
        Objects.equals(this.lifeEnd, corporationSheet.lifeEnd) &&
        Objects.equals(this.allianceID, corporationSheet.allianceID) &&
        Objects.equals(this.ceoID, corporationSheet.ceoID) &&
        Objects.equals(this.corporationID, corporationSheet.corporationID) &&
        Objects.equals(this.corporationName, corporationSheet.corporationName) &&
        Objects.equals(this.description, corporationSheet.description) &&
        Objects.equals(this.memberCount, corporationSheet.memberCount) &&
        Objects.equals(this.shares, corporationSheet.shares) &&
        Objects.equals(this.stationID, corporationSheet.stationID) &&
        Objects.equals(this.taxRate, corporationSheet.taxRate) &&
        Objects.equals(this.ticker, corporationSheet.ticker) &&
        Objects.equals(this.url, corporationSheet.url) &&
        Objects.equals(this.dateFounded, corporationSheet.dateFounded) &&
        Objects.equals(this.creatorID, corporationSheet.creatorID) &&
        Objects.equals(this.factionID, corporationSheet.factionID) &&
        Objects.equals(this.px64x64, corporationSheet.px64x64) &&
        Objects.equals(this.px128x128, corporationSheet.px128x128) &&
        Objects.equals(this.px256x256, corporationSheet.px256x256) &&
        Objects.equals(this.warEligible, corporationSheet.warEligible) &&
        Objects.equals(this.lifeStartDate, corporationSheet.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, corporationSheet.lifeEndDate) &&
        Objects.equals(this.dateFoundedDate, corporationSheet.dateFoundedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, allianceID, ceoID, corporationID, corporationName, description, memberCount, shares, stationID, taxRate, ticker, url, dateFounded, creatorID, factionID, px64x64, px128x128, px256x256, warEligible, lifeStartDate, lifeEndDate, dateFoundedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporationSheet {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    allianceID: ").append(toIndentedString(allianceID)).append("\n");
    sb.append("    ceoID: ").append(toIndentedString(ceoID)).append("\n");
    sb.append("    corporationID: ").append(toIndentedString(corporationID)).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    stationID: ").append(toIndentedString(stationID)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    dateFounded: ").append(toIndentedString(dateFounded)).append("\n");
    sb.append("    creatorID: ").append(toIndentedString(creatorID)).append("\n");
    sb.append("    factionID: ").append(toIndentedString(factionID)).append("\n");
    sb.append("    px64x64: ").append(toIndentedString(px64x64)).append("\n");
    sb.append("    px128x128: ").append(toIndentedString(px128x128)).append("\n");
    sb.append("    px256x256: ").append(toIndentedString(px256x256)).append("\n");
    sb.append("    warEligible: ").append(toIndentedString(warEligible)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    dateFoundedDate: ").append(toIndentedString(dateFoundedDate)).append("\n");
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

