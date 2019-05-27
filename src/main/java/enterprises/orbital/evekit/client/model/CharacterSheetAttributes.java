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

public class CharacterSheetAttributes implements Serializable {
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

  public static final String SERIALIZED_NAME_INTELLIGENCE = "intelligence";
  @SerializedName(SERIALIZED_NAME_INTELLIGENCE)
  private Integer intelligence;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Integer memory;

  public static final String SERIALIZED_NAME_CHARISMA = "charisma";
  @SerializedName(SERIALIZED_NAME_CHARISMA)
  private Integer charisma;

  public static final String SERIALIZED_NAME_PERCEPTION = "perception";
  @SerializedName(SERIALIZED_NAME_PERCEPTION)
  private Integer perception;

  public static final String SERIALIZED_NAME_WILLPOWER = "willpower";
  @SerializedName(SERIALIZED_NAME_WILLPOWER)
  private Integer willpower;

  public static final String SERIALIZED_NAME_BONUS_REMAPS = "bonusRemaps";
  @SerializedName(SERIALIZED_NAME_BONUS_REMAPS)
  private Integer bonusRemaps;

  public static final String SERIALIZED_NAME_LAST_REMAP_DATE = "lastRemapDate";
  @SerializedName(SERIALIZED_NAME_LAST_REMAP_DATE)
  private Long lastRemapDate;

  public static final String SERIALIZED_NAME_ACCRUED_REMAP_COOLDOWN_DATE = "accruedRemapCooldownDate";
  @SerializedName(SERIALIZED_NAME_ACCRUED_REMAP_COOLDOWN_DATE)
  private Long accruedRemapCooldownDate;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_LAST_REMAP_DATE_DATE = "lastRemapDateDate";
  @SerializedName(SERIALIZED_NAME_LAST_REMAP_DATE_DATE)
  private OffsetDateTime lastRemapDateDate;

  public static final String SERIALIZED_NAME_ACCRUED_REMAP_COOLDOWN_DATE_DATE = "accruedRemapCooldownDateDate";
  @SerializedName(SERIALIZED_NAME_ACCRUED_REMAP_COOLDOWN_DATE_DATE)
  private OffsetDateTime accruedRemapCooldownDateDate;

  public CharacterSheetAttributes cid(Long cid) {
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

  public CharacterSheetAttributes eveKitVersion(Integer eveKitVersion) {
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

  public CharacterSheetAttributes lifeStart(Long lifeStart) {
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

  public CharacterSheetAttributes lifeEnd(Long lifeEnd) {
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

  public CharacterSheetAttributes intelligence(Integer intelligence) {
    this.intelligence = intelligence;
    return this;
  }

   /**
   * Get intelligence
   * @return intelligence
  **/
  @ApiModelProperty(value = "")
  public Integer getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(Integer intelligence) {
    this.intelligence = intelligence;
  }

  public CharacterSheetAttributes memory(Integer memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @ApiModelProperty(value = "")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public CharacterSheetAttributes charisma(Integer charisma) {
    this.charisma = charisma;
    return this;
  }

   /**
   * Get charisma
   * @return charisma
  **/
  @ApiModelProperty(value = "")
  public Integer getCharisma() {
    return charisma;
  }

  public void setCharisma(Integer charisma) {
    this.charisma = charisma;
  }

  public CharacterSheetAttributes perception(Integer perception) {
    this.perception = perception;
    return this;
  }

   /**
   * Get perception
   * @return perception
  **/
  @ApiModelProperty(value = "")
  public Integer getPerception() {
    return perception;
  }

  public void setPerception(Integer perception) {
    this.perception = perception;
  }

  public CharacterSheetAttributes willpower(Integer willpower) {
    this.willpower = willpower;
    return this;
  }

   /**
   * Get willpower
   * @return willpower
  **/
  @ApiModelProperty(value = "")
  public Integer getWillpower() {
    return willpower;
  }

  public void setWillpower(Integer willpower) {
    this.willpower = willpower;
  }

  public CharacterSheetAttributes bonusRemaps(Integer bonusRemaps) {
    this.bonusRemaps = bonusRemaps;
    return this;
  }

   /**
   * Get bonusRemaps
   * @return bonusRemaps
  **/
  @ApiModelProperty(value = "")
  public Integer getBonusRemaps() {
    return bonusRemaps;
  }

  public void setBonusRemaps(Integer bonusRemaps) {
    this.bonusRemaps = bonusRemaps;
  }

  public CharacterSheetAttributes lastRemapDate(Long lastRemapDate) {
    this.lastRemapDate = lastRemapDate;
    return this;
  }

   /**
   * Get lastRemapDate
   * @return lastRemapDate
  **/
  @ApiModelProperty(value = "")
  public Long getLastRemapDate() {
    return lastRemapDate;
  }

  public void setLastRemapDate(Long lastRemapDate) {
    this.lastRemapDate = lastRemapDate;
  }

  public CharacterSheetAttributes accruedRemapCooldownDate(Long accruedRemapCooldownDate) {
    this.accruedRemapCooldownDate = accruedRemapCooldownDate;
    return this;
  }

   /**
   * Get accruedRemapCooldownDate
   * @return accruedRemapCooldownDate
  **/
  @ApiModelProperty(value = "")
  public Long getAccruedRemapCooldownDate() {
    return accruedRemapCooldownDate;
  }

  public void setAccruedRemapCooldownDate(Long accruedRemapCooldownDate) {
    this.accruedRemapCooldownDate = accruedRemapCooldownDate;
  }

  public CharacterSheetAttributes lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public CharacterSheetAttributes lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public CharacterSheetAttributes lastRemapDateDate(OffsetDateTime lastRemapDateDate) {
    this.lastRemapDateDate = lastRemapDateDate;
    return this;
  }

   /**
   * lastRemapDate Date
   * @return lastRemapDateDate
  **/
  @ApiModelProperty(value = "lastRemapDate Date")
  public OffsetDateTime getLastRemapDateDate() {
    return lastRemapDateDate;
  }

  public void setLastRemapDateDate(OffsetDateTime lastRemapDateDate) {
    this.lastRemapDateDate = lastRemapDateDate;
  }

  public CharacterSheetAttributes accruedRemapCooldownDateDate(OffsetDateTime accruedRemapCooldownDateDate) {
    this.accruedRemapCooldownDateDate = accruedRemapCooldownDateDate;
    return this;
  }

   /**
   * accruedRemapCooldownDate Date
   * @return accruedRemapCooldownDateDate
  **/
  @ApiModelProperty(value = "accruedRemapCooldownDate Date")
  public OffsetDateTime getAccruedRemapCooldownDateDate() {
    return accruedRemapCooldownDateDate;
  }

  public void setAccruedRemapCooldownDateDate(OffsetDateTime accruedRemapCooldownDateDate) {
    this.accruedRemapCooldownDateDate = accruedRemapCooldownDateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterSheetAttributes characterSheetAttributes = (CharacterSheetAttributes) o;
    return Objects.equals(this.cid, characterSheetAttributes.cid) &&
        Objects.equals(this.eveKitVersion, characterSheetAttributes.eveKitVersion) &&
        Objects.equals(this.lifeStart, characterSheetAttributes.lifeStart) &&
        Objects.equals(this.lifeEnd, characterSheetAttributes.lifeEnd) &&
        Objects.equals(this.intelligence, characterSheetAttributes.intelligence) &&
        Objects.equals(this.memory, characterSheetAttributes.memory) &&
        Objects.equals(this.charisma, characterSheetAttributes.charisma) &&
        Objects.equals(this.perception, characterSheetAttributes.perception) &&
        Objects.equals(this.willpower, characterSheetAttributes.willpower) &&
        Objects.equals(this.bonusRemaps, characterSheetAttributes.bonusRemaps) &&
        Objects.equals(this.lastRemapDate, characterSheetAttributes.lastRemapDate) &&
        Objects.equals(this.accruedRemapCooldownDate, characterSheetAttributes.accruedRemapCooldownDate) &&
        Objects.equals(this.lifeStartDate, characterSheetAttributes.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, characterSheetAttributes.lifeEndDate) &&
        Objects.equals(this.lastRemapDateDate, characterSheetAttributes.lastRemapDateDate) &&
        Objects.equals(this.accruedRemapCooldownDateDate, characterSheetAttributes.accruedRemapCooldownDateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, intelligence, memory, charisma, perception, willpower, bonusRemaps, lastRemapDate, accruedRemapCooldownDate, lifeStartDate, lifeEndDate, lastRemapDateDate, accruedRemapCooldownDateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterSheetAttributes {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
    sb.append("    perception: ").append(toIndentedString(perception)).append("\n");
    sb.append("    willpower: ").append(toIndentedString(willpower)).append("\n");
    sb.append("    bonusRemaps: ").append(toIndentedString(bonusRemaps)).append("\n");
    sb.append("    lastRemapDate: ").append(toIndentedString(lastRemapDate)).append("\n");
    sb.append("    accruedRemapCooldownDate: ").append(toIndentedString(accruedRemapCooldownDate)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    lastRemapDateDate: ").append(toIndentedString(lastRemapDateDate)).append("\n");
    sb.append("    accruedRemapCooldownDateDate: ").append(toIndentedString(accruedRemapCooldownDateDate)).append("\n");
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

