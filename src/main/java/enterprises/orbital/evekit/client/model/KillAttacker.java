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

public class KillAttacker implements Serializable {
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

  public static final String SERIALIZED_NAME_ATTACKER_CHARACTER_I_D = "attackerCharacterID";
  @SerializedName(SERIALIZED_NAME_ATTACKER_CHARACTER_I_D)
  private Integer attackerCharacterID;

  public static final String SERIALIZED_NAME_ALLIANCE_I_D = "allianceID";
  @SerializedName(SERIALIZED_NAME_ALLIANCE_I_D)
  private Integer allianceID;

  public static final String SERIALIZED_NAME_ATTACKER_CORPORATION_I_D = "attackerCorporationID";
  @SerializedName(SERIALIZED_NAME_ATTACKER_CORPORATION_I_D)
  private Integer attackerCorporationID;

  public static final String SERIALIZED_NAME_DAMAGE_DONE = "damageDone";
  @SerializedName(SERIALIZED_NAME_DAMAGE_DONE)
  private Integer damageDone;

  public static final String SERIALIZED_NAME_FACTION_I_D = "factionID";
  @SerializedName(SERIALIZED_NAME_FACTION_I_D)
  private Integer factionID;

  public static final String SERIALIZED_NAME_SECURITY_STATUS = "securityStatus";
  @SerializedName(SERIALIZED_NAME_SECURITY_STATUS)
  private Float securityStatus;

  public static final String SERIALIZED_NAME_SHIP_TYPE_I_D = "shipTypeID";
  @SerializedName(SERIALIZED_NAME_SHIP_TYPE_I_D)
  private Integer shipTypeID;

  public static final String SERIALIZED_NAME_WEAPON_TYPE_I_D = "weaponTypeID";
  @SerializedName(SERIALIZED_NAME_WEAPON_TYPE_I_D)
  private Integer weaponTypeID;

  public static final String SERIALIZED_NAME_FINAL_BLOW = "finalBlow";
  @SerializedName(SERIALIZED_NAME_FINAL_BLOW)
  private Boolean finalBlow = false;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public KillAttacker cid(Long cid) {
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

  public KillAttacker eveKitVersion(Integer eveKitVersion) {
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

  public KillAttacker lifeStart(Long lifeStart) {
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

  public KillAttacker lifeEnd(Long lifeEnd) {
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

  public KillAttacker killID(Integer killID) {
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

  public KillAttacker attackerCharacterID(Integer attackerCharacterID) {
    this.attackerCharacterID = attackerCharacterID;
    return this;
  }

   /**
   * Get attackerCharacterID
   * @return attackerCharacterID
  **/
  @ApiModelProperty(value = "")
  public Integer getAttackerCharacterID() {
    return attackerCharacterID;
  }

  public void setAttackerCharacterID(Integer attackerCharacterID) {
    this.attackerCharacterID = attackerCharacterID;
  }

  public KillAttacker allianceID(Integer allianceID) {
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

  public KillAttacker attackerCorporationID(Integer attackerCorporationID) {
    this.attackerCorporationID = attackerCorporationID;
    return this;
  }

   /**
   * Get attackerCorporationID
   * @return attackerCorporationID
  **/
  @ApiModelProperty(value = "")
  public Integer getAttackerCorporationID() {
    return attackerCorporationID;
  }

  public void setAttackerCorporationID(Integer attackerCorporationID) {
    this.attackerCorporationID = attackerCorporationID;
  }

  public KillAttacker damageDone(Integer damageDone) {
    this.damageDone = damageDone;
    return this;
  }

   /**
   * Get damageDone
   * @return damageDone
  **/
  @ApiModelProperty(value = "")
  public Integer getDamageDone() {
    return damageDone;
  }

  public void setDamageDone(Integer damageDone) {
    this.damageDone = damageDone;
  }

  public KillAttacker factionID(Integer factionID) {
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

  public KillAttacker securityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
    return this;
  }

   /**
   * Get securityStatus
   * @return securityStatus
  **/
  @ApiModelProperty(value = "")
  public Float getSecurityStatus() {
    return securityStatus;
  }

  public void setSecurityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
  }

  public KillAttacker shipTypeID(Integer shipTypeID) {
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

  public KillAttacker weaponTypeID(Integer weaponTypeID) {
    this.weaponTypeID = weaponTypeID;
    return this;
  }

   /**
   * Get weaponTypeID
   * @return weaponTypeID
  **/
  @ApiModelProperty(value = "")
  public Integer getWeaponTypeID() {
    return weaponTypeID;
  }

  public void setWeaponTypeID(Integer weaponTypeID) {
    this.weaponTypeID = weaponTypeID;
  }

  public KillAttacker finalBlow(Boolean finalBlow) {
    this.finalBlow = finalBlow;
    return this;
  }

   /**
   * Get finalBlow
   * @return finalBlow
  **/
  @ApiModelProperty(value = "")
  public Boolean getFinalBlow() {
    return finalBlow;
  }

  public void setFinalBlow(Boolean finalBlow) {
    this.finalBlow = finalBlow;
  }

  public KillAttacker lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public KillAttacker lifeEndDate(OffsetDateTime lifeEndDate) {
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
    KillAttacker killAttacker = (KillAttacker) o;
    return Objects.equals(this.cid, killAttacker.cid) &&
        Objects.equals(this.eveKitVersion, killAttacker.eveKitVersion) &&
        Objects.equals(this.lifeStart, killAttacker.lifeStart) &&
        Objects.equals(this.lifeEnd, killAttacker.lifeEnd) &&
        Objects.equals(this.killID, killAttacker.killID) &&
        Objects.equals(this.attackerCharacterID, killAttacker.attackerCharacterID) &&
        Objects.equals(this.allianceID, killAttacker.allianceID) &&
        Objects.equals(this.attackerCorporationID, killAttacker.attackerCorporationID) &&
        Objects.equals(this.damageDone, killAttacker.damageDone) &&
        Objects.equals(this.factionID, killAttacker.factionID) &&
        Objects.equals(this.securityStatus, killAttacker.securityStatus) &&
        Objects.equals(this.shipTypeID, killAttacker.shipTypeID) &&
        Objects.equals(this.weaponTypeID, killAttacker.weaponTypeID) &&
        Objects.equals(this.finalBlow, killAttacker.finalBlow) &&
        Objects.equals(this.lifeStartDate, killAttacker.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, killAttacker.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, killID, attackerCharacterID, allianceID, attackerCorporationID, damageDone, factionID, securityStatus, shipTypeID, weaponTypeID, finalBlow, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KillAttacker {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    killID: ").append(toIndentedString(killID)).append("\n");
    sb.append("    attackerCharacterID: ").append(toIndentedString(attackerCharacterID)).append("\n");
    sb.append("    allianceID: ").append(toIndentedString(allianceID)).append("\n");
    sb.append("    attackerCorporationID: ").append(toIndentedString(attackerCorporationID)).append("\n");
    sb.append("    damageDone: ").append(toIndentedString(damageDone)).append("\n");
    sb.append("    factionID: ").append(toIndentedString(factionID)).append("\n");
    sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
    sb.append("    shipTypeID: ").append(toIndentedString(shipTypeID)).append("\n");
    sb.append("    weaponTypeID: ").append(toIndentedString(weaponTypeID)).append("\n");
    sb.append("    finalBlow: ").append(toIndentedString(finalBlow)).append("\n");
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

