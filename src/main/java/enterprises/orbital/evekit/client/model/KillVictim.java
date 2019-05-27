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

public class KillVictim implements Serializable {
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

  public static final String SERIALIZED_NAME_KILL_I_D = "killID";
  @SerializedName(SERIALIZED_NAME_KILL_I_D)
  private Integer killID;

  public static final String SERIALIZED_NAME_ALLIANCE_I_D = "allianceID";
  @SerializedName(SERIALIZED_NAME_ALLIANCE_I_D)
  private Integer allianceID;

  public static final String SERIALIZED_NAME_KILL_CHARACTER_I_D = "killCharacterID";
  @SerializedName(SERIALIZED_NAME_KILL_CHARACTER_I_D)
  private Integer killCharacterID;

  public static final String SERIALIZED_NAME_KILL_CORPORATION_I_D = "killCorporationID";
  @SerializedName(SERIALIZED_NAME_KILL_CORPORATION_I_D)
  private Integer killCorporationID;

  public static final String SERIALIZED_NAME_DAMAGE_TAKEN = "damageTaken";
  @SerializedName(SERIALIZED_NAME_DAMAGE_TAKEN)
  private Integer damageTaken;

  public static final String SERIALIZED_NAME_FACTION_I_D = "factionID";
  @SerializedName(SERIALIZED_NAME_FACTION_I_D)
  private Integer factionID;

  public static final String SERIALIZED_NAME_SHIP_TYPE_I_D = "shipTypeID";
  @SerializedName(SERIALIZED_NAME_SHIP_TYPE_I_D)
  private Integer shipTypeID;

  public static final String SERIALIZED_NAME_X = "x";
  @SerializedName(SERIALIZED_NAME_X)
  private Double x;

  public static final String SERIALIZED_NAME_Y = "y";
  @SerializedName(SERIALIZED_NAME_Y)
  private Double y;

  public static final String SERIALIZED_NAME_Z = "z";
  @SerializedName(SERIALIZED_NAME_Z)
  private Double z;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public KillVictim cid(Long cid) {
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

  public KillVictim eveKitVersion(Integer eveKitVersion) {
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

  public KillVictim lifeStart(Long lifeStart) {
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

  public KillVictim lifeEnd(Long lifeEnd) {
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

  public KillVictim killID(Integer killID) {
    this.killID = killID;
    return this;
  }

   /**
   * Get killID
   * @return killID
  **/
  @ApiModelProperty(value = "")
  public Integer getKillID() {
    return killID;
  }

  public void setKillID(Integer killID) {
    this.killID = killID;
  }

  public KillVictim allianceID(Integer allianceID) {
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

  public KillVictim killCharacterID(Integer killCharacterID) {
    this.killCharacterID = killCharacterID;
    return this;
  }

   /**
   * Get killCharacterID
   * @return killCharacterID
  **/
  @ApiModelProperty(value = "")
  public Integer getKillCharacterID() {
    return killCharacterID;
  }

  public void setKillCharacterID(Integer killCharacterID) {
    this.killCharacterID = killCharacterID;
  }

  public KillVictim killCorporationID(Integer killCorporationID) {
    this.killCorporationID = killCorporationID;
    return this;
  }

   /**
   * Get killCorporationID
   * @return killCorporationID
  **/
  @ApiModelProperty(value = "")
  public Integer getKillCorporationID() {
    return killCorporationID;
  }

  public void setKillCorporationID(Integer killCorporationID) {
    this.killCorporationID = killCorporationID;
  }

  public KillVictim damageTaken(Integer damageTaken) {
    this.damageTaken = damageTaken;
    return this;
  }

   /**
   * Get damageTaken
   * @return damageTaken
  **/
  @ApiModelProperty(value = "")
  public Integer getDamageTaken() {
    return damageTaken;
  }

  public void setDamageTaken(Integer damageTaken) {
    this.damageTaken = damageTaken;
  }

  public KillVictim factionID(Integer factionID) {
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

  public KillVictim shipTypeID(Integer shipTypeID) {
    this.shipTypeID = shipTypeID;
    return this;
  }

   /**
   * Get shipTypeID
   * @return shipTypeID
  **/
  @ApiModelProperty(value = "")
  public Integer getShipTypeID() {
    return shipTypeID;
  }

  public void setShipTypeID(Integer shipTypeID) {
    this.shipTypeID = shipTypeID;
  }

  public KillVictim x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(value = "")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public KillVictim y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(value = "")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public KillVictim z(Double z) {
    this.z = z;
    return this;
  }

   /**
   * Get z
   * @return z
  **/
  @ApiModelProperty(value = "")
  public Double getZ() {
    return z;
  }

  public void setZ(Double z) {
    this.z = z;
  }

  public KillVictim lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public KillVictim lifeEndDate(OffsetDateTime lifeEndDate) {
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
    KillVictim killVictim = (KillVictim) o;
    return Objects.equals(this.cid, killVictim.cid) &&
        Objects.equals(this.eveKitVersion, killVictim.eveKitVersion) &&
        Objects.equals(this.lifeStart, killVictim.lifeStart) &&
        Objects.equals(this.lifeEnd, killVictim.lifeEnd) &&
        Objects.equals(this.killID, killVictim.killID) &&
        Objects.equals(this.allianceID, killVictim.allianceID) &&
        Objects.equals(this.killCharacterID, killVictim.killCharacterID) &&
        Objects.equals(this.killCorporationID, killVictim.killCorporationID) &&
        Objects.equals(this.damageTaken, killVictim.damageTaken) &&
        Objects.equals(this.factionID, killVictim.factionID) &&
        Objects.equals(this.shipTypeID, killVictim.shipTypeID) &&
        Objects.equals(this.x, killVictim.x) &&
        Objects.equals(this.y, killVictim.y) &&
        Objects.equals(this.z, killVictim.z) &&
        Objects.equals(this.lifeStartDate, killVictim.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, killVictim.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, killID, allianceID, killCharacterID, killCorporationID, damageTaken, factionID, shipTypeID, x, y, z, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KillVictim {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    killID: ").append(toIndentedString(killID)).append("\n");
    sb.append("    allianceID: ").append(toIndentedString(allianceID)).append("\n");
    sb.append("    killCharacterID: ").append(toIndentedString(killCharacterID)).append("\n");
    sb.append("    killCorporationID: ").append(toIndentedString(killCorporationID)).append("\n");
    sb.append("    damageTaken: ").append(toIndentedString(damageTaken)).append("\n");
    sb.append("    factionID: ").append(toIndentedString(factionID)).append("\n");
    sb.append("    shipTypeID: ").append(toIndentedString(shipTypeID)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

