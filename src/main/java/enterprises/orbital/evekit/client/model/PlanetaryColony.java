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

public class PlanetaryColony implements Serializable {
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

  public static final String SERIALIZED_NAME_PLANET_I_D = "planetID";
  @SerializedName(SERIALIZED_NAME_PLANET_I_D)
  private Integer planetID;

  public static final String SERIALIZED_NAME_SOLAR_SYSTEM_I_D = "solarSystemID";
  @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_I_D)
  private Integer solarSystemID;

  public static final String SERIALIZED_NAME_PLANET_TYPE = "planetType";
  @SerializedName(SERIALIZED_NAME_PLANET_TYPE)
  private String planetType;

  public static final String SERIALIZED_NAME_OWNER_I_D = "ownerID";
  @SerializedName(SERIALIZED_NAME_OWNER_I_D)
  private Long ownerID;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private Long lastUpdate;

  public static final String SERIALIZED_NAME_UPGRADE_LEVEL = "upgradeLevel";
  @SerializedName(SERIALIZED_NAME_UPGRADE_LEVEL)
  private Integer upgradeLevel;

  public static final String SERIALIZED_NAME_NUMBER_OF_PINS = "numberOfPins";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_PINS)
  private Integer numberOfPins;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_LAST_UPDATE_DATE = "lastUpdateDate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_DATE)
  private OffsetDateTime lastUpdateDate;

  public PlanetaryColony cid(Long cid) {
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

  public PlanetaryColony eveKitVersion(Integer eveKitVersion) {
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

  public PlanetaryColony lifeStart(Long lifeStart) {
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

  public PlanetaryColony lifeEnd(Long lifeEnd) {
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

  public PlanetaryColony planetID(Integer planetID) {
    this.planetID = planetID;
    return this;
  }

   /**
   * Get planetID
   * @return planetID
  **/
  @ApiModelProperty(value = "")
  public Integer getPlanetID() {
    return planetID;
  }

  public void setPlanetID(Integer planetID) {
    this.planetID = planetID;
  }

  public PlanetaryColony solarSystemID(Integer solarSystemID) {
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

  public PlanetaryColony planetType(String planetType) {
    this.planetType = planetType;
    return this;
  }

   /**
   * Get planetType
   * @return planetType
  **/
  @ApiModelProperty(value = "")
  public String getPlanetType() {
    return planetType;
  }

  public void setPlanetType(String planetType) {
    this.planetType = planetType;
  }

  public PlanetaryColony ownerID(Long ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Get ownerID
   * @return ownerID
  **/
  @ApiModelProperty(value = "")
  public Long getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(Long ownerID) {
    this.ownerID = ownerID;
  }

  public PlanetaryColony lastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "")
  public Long getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public PlanetaryColony upgradeLevel(Integer upgradeLevel) {
    this.upgradeLevel = upgradeLevel;
    return this;
  }

   /**
   * Get upgradeLevel
   * @return upgradeLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getUpgradeLevel() {
    return upgradeLevel;
  }

  public void setUpgradeLevel(Integer upgradeLevel) {
    this.upgradeLevel = upgradeLevel;
  }

  public PlanetaryColony numberOfPins(Integer numberOfPins) {
    this.numberOfPins = numberOfPins;
    return this;
  }

   /**
   * Get numberOfPins
   * @return numberOfPins
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfPins() {
    return numberOfPins;
  }

  public void setNumberOfPins(Integer numberOfPins) {
    this.numberOfPins = numberOfPins;
  }

  public PlanetaryColony lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public PlanetaryColony lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public PlanetaryColony lastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

   /**
   * lastUpdate Date
   * @return lastUpdateDate
  **/
  @ApiModelProperty(value = "lastUpdate Date")
  public OffsetDateTime getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(OffsetDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanetaryColony planetaryColony = (PlanetaryColony) o;
    return Objects.equals(this.cid, planetaryColony.cid) &&
        Objects.equals(this.eveKitVersion, planetaryColony.eveKitVersion) &&
        Objects.equals(this.lifeStart, planetaryColony.lifeStart) &&
        Objects.equals(this.lifeEnd, planetaryColony.lifeEnd) &&
        Objects.equals(this.planetID, planetaryColony.planetID) &&
        Objects.equals(this.solarSystemID, planetaryColony.solarSystemID) &&
        Objects.equals(this.planetType, planetaryColony.planetType) &&
        Objects.equals(this.ownerID, planetaryColony.ownerID) &&
        Objects.equals(this.lastUpdate, planetaryColony.lastUpdate) &&
        Objects.equals(this.upgradeLevel, planetaryColony.upgradeLevel) &&
        Objects.equals(this.numberOfPins, planetaryColony.numberOfPins) &&
        Objects.equals(this.lifeStartDate, planetaryColony.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, planetaryColony.lifeEndDate) &&
        Objects.equals(this.lastUpdateDate, planetaryColony.lastUpdateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, planetID, solarSystemID, planetType, ownerID, lastUpdate, upgradeLevel, numberOfPins, lifeStartDate, lifeEndDate, lastUpdateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanetaryColony {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    planetID: ").append(toIndentedString(planetID)).append("\n");
    sb.append("    solarSystemID: ").append(toIndentedString(solarSystemID)).append("\n");
    sb.append("    planetType: ").append(toIndentedString(planetType)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    upgradeLevel: ").append(toIndentedString(upgradeLevel)).append("\n");
    sb.append("    numberOfPins: ").append(toIndentedString(numberOfPins)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
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

