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

public class CharacterSheet implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("characterID")
  private Long characterID = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("corporationID")
  private Long corporationID = null;

  @JsonProperty("corporationName")
  private String corporationName = null;

  @JsonProperty("race")
  private String race = null;

  @JsonProperty("doB")
  private Long doB = null;

  @JsonProperty("bloodlineID")
  private Integer bloodlineID = null;

  @JsonProperty("bloodline")
  private String bloodline = null;

  @JsonProperty("ancestryID")
  private Integer ancestryID = null;

  @JsonProperty("ancestry")
  private String ancestry = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("allianceName")
  private String allianceName = null;

  @JsonProperty("allianceID")
  private Long allianceID = null;

  @JsonProperty("factionName")
  private String factionName = null;

  @JsonProperty("factionID")
  private Long factionID = null;

  @JsonProperty("intelligence")
  private Integer intelligence = null;

  @JsonProperty("memory")
  private Integer memory = null;

  @JsonProperty("charisma")
  private Integer charisma = null;

  @JsonProperty("perception")
  private Integer perception = null;

  @JsonProperty("willpower")
  private Integer willpower = null;

  @JsonProperty("homeStationID")
  private Long homeStationID = null;

  @JsonProperty("lastRespecDate")
  private Long lastRespecDate = null;

  @JsonProperty("lastTimedRespec")
  private Long lastTimedRespec = null;

  @JsonProperty("freeRespecs")
  private Integer freeRespecs = null;

  @JsonProperty("freeSkillPoints")
  private Long freeSkillPoints = null;

  @JsonProperty("remoteStationDate")
  private Long remoteStationDate = null;

  @JsonProperty("lifeStartDate")
  private OffsetDateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private OffsetDateTime lifeEndDate = null;

  @JsonProperty("doBDate")
  private OffsetDateTime doBDate = null;

  @JsonProperty("lastRespecDateDate")
  private OffsetDateTime lastRespecDateDate = null;

  @JsonProperty("lastTimedRespecDate")
  private OffsetDateTime lastTimedRespecDate = null;

  @JsonProperty("remoteStationDateDate")
  private OffsetDateTime remoteStationDateDate = null;

  public CharacterSheet cid(Long cid) {
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

  public CharacterSheet eveKitVersion(Integer eveKitVersion) {
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

  public CharacterSheet lifeStart(Long lifeStart) {
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

  public CharacterSheet lifeEnd(Long lifeEnd) {
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

  public CharacterSheet characterID(Long characterID) {
    this.characterID = characterID;
    return this;
  }

   /**
   * Get characterID
   * @return characterID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCharacterID() {
    return characterID;
  }

  public void setCharacterID(Long characterID) {
    this.characterID = characterID;
  }

  public CharacterSheet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CharacterSheet corporationID(Long corporationID) {
    this.corporationID = corporationID;
    return this;
  }

   /**
   * Get corporationID
   * @return corporationID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCorporationID() {
    return corporationID;
  }

  public void setCorporationID(Long corporationID) {
    this.corporationID = corporationID;
  }

  public CharacterSheet corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

   /**
   * Get corporationName
   * @return corporationName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public CharacterSheet race(String race) {
    this.race = race;
    return this;
  }

   /**
   * Get race
   * @return race
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public CharacterSheet doB(Long doB) {
    this.doB = doB;
    return this;
  }

   /**
   * Get doB
   * @return doB
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDoB() {
    return doB;
  }

  public void setDoB(Long doB) {
    this.doB = doB;
  }

  public CharacterSheet bloodlineID(Integer bloodlineID) {
    this.bloodlineID = bloodlineID;
    return this;
  }

   /**
   * Get bloodlineID
   * @return bloodlineID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getBloodlineID() {
    return bloodlineID;
  }

  public void setBloodlineID(Integer bloodlineID) {
    this.bloodlineID = bloodlineID;
  }

  public CharacterSheet bloodline(String bloodline) {
    this.bloodline = bloodline;
    return this;
  }

   /**
   * Get bloodline
   * @return bloodline
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBloodline() {
    return bloodline;
  }

  public void setBloodline(String bloodline) {
    this.bloodline = bloodline;
  }

  public CharacterSheet ancestryID(Integer ancestryID) {
    this.ancestryID = ancestryID;
    return this;
  }

   /**
   * Get ancestryID
   * @return ancestryID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAncestryID() {
    return ancestryID;
  }

  public void setAncestryID(Integer ancestryID) {
    this.ancestryID = ancestryID;
  }

  public CharacterSheet ancestry(String ancestry) {
    this.ancestry = ancestry;
    return this;
  }

   /**
   * Get ancestry
   * @return ancestry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAncestry() {
    return ancestry;
  }

  public void setAncestry(String ancestry) {
    this.ancestry = ancestry;
  }

  public CharacterSheet gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public CharacterSheet allianceName(String allianceName) {
    this.allianceName = allianceName;
    return this;
  }

   /**
   * Get allianceName
   * @return allianceName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAllianceName() {
    return allianceName;
  }

  public void setAllianceName(String allianceName) {
    this.allianceName = allianceName;
  }

  public CharacterSheet allianceID(Long allianceID) {
    this.allianceID = allianceID;
    return this;
  }

   /**
   * Get allianceID
   * @return allianceID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAllianceID() {
    return allianceID;
  }

  public void setAllianceID(Long allianceID) {
    this.allianceID = allianceID;
  }

  public CharacterSheet factionName(String factionName) {
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

  public CharacterSheet factionID(Long factionID) {
    this.factionID = factionID;
    return this;
  }

   /**
   * Get factionID
   * @return factionID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFactionID() {
    return factionID;
  }

  public void setFactionID(Long factionID) {
    this.factionID = factionID;
  }

  public CharacterSheet intelligence(Integer intelligence) {
    this.intelligence = intelligence;
    return this;
  }

   /**
   * Get intelligence
   * @return intelligence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(Integer intelligence) {
    this.intelligence = intelligence;
  }

  public CharacterSheet memory(Integer memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMemory() {
    return memory;
  }

  public void setMemory(Integer memory) {
    this.memory = memory;
  }

  public CharacterSheet charisma(Integer charisma) {
    this.charisma = charisma;
    return this;
  }

   /**
   * Get charisma
   * @return charisma
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCharisma() {
    return charisma;
  }

  public void setCharisma(Integer charisma) {
    this.charisma = charisma;
  }

  public CharacterSheet perception(Integer perception) {
    this.perception = perception;
    return this;
  }

   /**
   * Get perception
   * @return perception
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPerception() {
    return perception;
  }

  public void setPerception(Integer perception) {
    this.perception = perception;
  }

  public CharacterSheet willpower(Integer willpower) {
    this.willpower = willpower;
    return this;
  }

   /**
   * Get willpower
   * @return willpower
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getWillpower() {
    return willpower;
  }

  public void setWillpower(Integer willpower) {
    this.willpower = willpower;
  }

  public CharacterSheet homeStationID(Long homeStationID) {
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

  public CharacterSheet lastRespecDate(Long lastRespecDate) {
    this.lastRespecDate = lastRespecDate;
    return this;
  }

   /**
   * Get lastRespecDate
   * @return lastRespecDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLastRespecDate() {
    return lastRespecDate;
  }

  public void setLastRespecDate(Long lastRespecDate) {
    this.lastRespecDate = lastRespecDate;
  }

  public CharacterSheet lastTimedRespec(Long lastTimedRespec) {
    this.lastTimedRespec = lastTimedRespec;
    return this;
  }

   /**
   * Get lastTimedRespec
   * @return lastTimedRespec
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLastTimedRespec() {
    return lastTimedRespec;
  }

  public void setLastTimedRespec(Long lastTimedRespec) {
    this.lastTimedRespec = lastTimedRespec;
  }

  public CharacterSheet freeRespecs(Integer freeRespecs) {
    this.freeRespecs = freeRespecs;
    return this;
  }

   /**
   * Get freeRespecs
   * @return freeRespecs
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFreeRespecs() {
    return freeRespecs;
  }

  public void setFreeRespecs(Integer freeRespecs) {
    this.freeRespecs = freeRespecs;
  }

  public CharacterSheet freeSkillPoints(Long freeSkillPoints) {
    this.freeSkillPoints = freeSkillPoints;
    return this;
  }

   /**
   * Get freeSkillPoints
   * @return freeSkillPoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFreeSkillPoints() {
    return freeSkillPoints;
  }

  public void setFreeSkillPoints(Long freeSkillPoints) {
    this.freeSkillPoints = freeSkillPoints;
  }

  public CharacterSheet remoteStationDate(Long remoteStationDate) {
    this.remoteStationDate = remoteStationDate;
    return this;
  }

   /**
   * Get remoteStationDate
   * @return remoteStationDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRemoteStationDate() {
    return remoteStationDate;
  }

  public void setRemoteStationDate(Long remoteStationDate) {
    this.remoteStationDate = remoteStationDate;
  }

  public CharacterSheet lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public CharacterSheet lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public CharacterSheet doBDate(OffsetDateTime doBDate) {
    this.doBDate = doBDate;
    return this;
  }

   /**
   * doB Date
   * @return doBDate
  **/
  @ApiModelProperty(example = "null", value = "doB Date")
  public OffsetDateTime getDoBDate() {
    return doBDate;
  }

  public void setDoBDate(OffsetDateTime doBDate) {
    this.doBDate = doBDate;
  }

  public CharacterSheet lastRespecDateDate(OffsetDateTime lastRespecDateDate) {
    this.lastRespecDateDate = lastRespecDateDate;
    return this;
  }

   /**
   * lastRespecDate Date
   * @return lastRespecDateDate
  **/
  @ApiModelProperty(example = "null", value = "lastRespecDate Date")
  public OffsetDateTime getLastRespecDateDate() {
    return lastRespecDateDate;
  }

  public void setLastRespecDateDate(OffsetDateTime lastRespecDateDate) {
    this.lastRespecDateDate = lastRespecDateDate;
  }

  public CharacterSheet lastTimedRespecDate(OffsetDateTime lastTimedRespecDate) {
    this.lastTimedRespecDate = lastTimedRespecDate;
    return this;
  }

   /**
   * lastTimedRespec Date
   * @return lastTimedRespecDate
  **/
  @ApiModelProperty(example = "null", value = "lastTimedRespec Date")
  public OffsetDateTime getLastTimedRespecDate() {
    return lastTimedRespecDate;
  }

  public void setLastTimedRespecDate(OffsetDateTime lastTimedRespecDate) {
    this.lastTimedRespecDate = lastTimedRespecDate;
  }

  public CharacterSheet remoteStationDateDate(OffsetDateTime remoteStationDateDate) {
    this.remoteStationDateDate = remoteStationDateDate;
    return this;
  }

   /**
   * remoteStationDate Date
   * @return remoteStationDateDate
  **/
  @ApiModelProperty(example = "null", value = "remoteStationDate Date")
  public OffsetDateTime getRemoteStationDateDate() {
    return remoteStationDateDate;
  }

  public void setRemoteStationDateDate(OffsetDateTime remoteStationDateDate) {
    this.remoteStationDateDate = remoteStationDateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterSheet characterSheet = (CharacterSheet) o;
    return Objects.equals(this.cid, characterSheet.cid) &&
        Objects.equals(this.eveKitVersion, characterSheet.eveKitVersion) &&
        Objects.equals(this.lifeStart, characterSheet.lifeStart) &&
        Objects.equals(this.lifeEnd, characterSheet.lifeEnd) &&
        Objects.equals(this.characterID, characterSheet.characterID) &&
        Objects.equals(this.name, characterSheet.name) &&
        Objects.equals(this.corporationID, characterSheet.corporationID) &&
        Objects.equals(this.corporationName, characterSheet.corporationName) &&
        Objects.equals(this.race, characterSheet.race) &&
        Objects.equals(this.doB, characterSheet.doB) &&
        Objects.equals(this.bloodlineID, characterSheet.bloodlineID) &&
        Objects.equals(this.bloodline, characterSheet.bloodline) &&
        Objects.equals(this.ancestryID, characterSheet.ancestryID) &&
        Objects.equals(this.ancestry, characterSheet.ancestry) &&
        Objects.equals(this.gender, characterSheet.gender) &&
        Objects.equals(this.allianceName, characterSheet.allianceName) &&
        Objects.equals(this.allianceID, characterSheet.allianceID) &&
        Objects.equals(this.factionName, characterSheet.factionName) &&
        Objects.equals(this.factionID, characterSheet.factionID) &&
        Objects.equals(this.intelligence, characterSheet.intelligence) &&
        Objects.equals(this.memory, characterSheet.memory) &&
        Objects.equals(this.charisma, characterSheet.charisma) &&
        Objects.equals(this.perception, characterSheet.perception) &&
        Objects.equals(this.willpower, characterSheet.willpower) &&
        Objects.equals(this.homeStationID, characterSheet.homeStationID) &&
        Objects.equals(this.lastRespecDate, characterSheet.lastRespecDate) &&
        Objects.equals(this.lastTimedRespec, characterSheet.lastTimedRespec) &&
        Objects.equals(this.freeRespecs, characterSheet.freeRespecs) &&
        Objects.equals(this.freeSkillPoints, characterSheet.freeSkillPoints) &&
        Objects.equals(this.remoteStationDate, characterSheet.remoteStationDate) &&
        Objects.equals(this.lifeStartDate, characterSheet.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, characterSheet.lifeEndDate) &&
        Objects.equals(this.doBDate, characterSheet.doBDate) &&
        Objects.equals(this.lastRespecDateDate, characterSheet.lastRespecDateDate) &&
        Objects.equals(this.lastTimedRespecDate, characterSheet.lastTimedRespecDate) &&
        Objects.equals(this.remoteStationDateDate, characterSheet.remoteStationDateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, characterID, name, corporationID, corporationName, race, doB, bloodlineID, bloodline, ancestryID, ancestry, gender, allianceName, allianceID, factionName, factionID, intelligence, memory, charisma, perception, willpower, homeStationID, lastRespecDate, lastTimedRespec, freeRespecs, freeSkillPoints, remoteStationDate, lifeStartDate, lifeEndDate, doBDate, lastRespecDateDate, lastTimedRespecDate, remoteStationDateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterSheet {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    characterID: ").append(toIndentedString(characterID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    corporationID: ").append(toIndentedString(corporationID)).append("\n");
    sb.append("    corporationName: ").append(toIndentedString(corporationName)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    doB: ").append(toIndentedString(doB)).append("\n");
    sb.append("    bloodlineID: ").append(toIndentedString(bloodlineID)).append("\n");
    sb.append("    bloodline: ").append(toIndentedString(bloodline)).append("\n");
    sb.append("    ancestryID: ").append(toIndentedString(ancestryID)).append("\n");
    sb.append("    ancestry: ").append(toIndentedString(ancestry)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    allianceName: ").append(toIndentedString(allianceName)).append("\n");
    sb.append("    allianceID: ").append(toIndentedString(allianceID)).append("\n");
    sb.append("    factionName: ").append(toIndentedString(factionName)).append("\n");
    sb.append("    factionID: ").append(toIndentedString(factionID)).append("\n");
    sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
    sb.append("    perception: ").append(toIndentedString(perception)).append("\n");
    sb.append("    willpower: ").append(toIndentedString(willpower)).append("\n");
    sb.append("    homeStationID: ").append(toIndentedString(homeStationID)).append("\n");
    sb.append("    lastRespecDate: ").append(toIndentedString(lastRespecDate)).append("\n");
    sb.append("    lastTimedRespec: ").append(toIndentedString(lastTimedRespec)).append("\n");
    sb.append("    freeRespecs: ").append(toIndentedString(freeRespecs)).append("\n");
    sb.append("    freeSkillPoints: ").append(toIndentedString(freeSkillPoints)).append("\n");
    sb.append("    remoteStationDate: ").append(toIndentedString(remoteStationDate)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    doBDate: ").append(toIndentedString(doBDate)).append("\n");
    sb.append("    lastRespecDateDate: ").append(toIndentedString(lastRespecDateDate)).append("\n");
    sb.append("    lastTimedRespecDate: ").append(toIndentedString(lastTimedRespecDate)).append("\n");
    sb.append("    remoteStationDateDate: ").append(toIndentedString(remoteStationDateDate)).append("\n");
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

