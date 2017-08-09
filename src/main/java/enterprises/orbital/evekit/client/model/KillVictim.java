/**
 * EveKit Model API Server
 * 
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package enterprises.orbital.evekit.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Model data common properties
 */
@ApiModel(description = "Model data common properties")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T15:58:15.972+02:00")
public class KillVictim   {
  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("killID")
  private Long killID = null;

  @JsonProperty("allianceID")
  private Long allianceID = null;

  @JsonProperty("allianceName")
  private String allianceName = null;

  @JsonProperty("killCharacterID")
  private Long killCharacterID = null;

  @JsonProperty("killCharacterName")
  private String killCharacterName = null;

  @JsonProperty("killCorporationID")
  private Long killCorporationID = null;

  @JsonProperty("killCorporationName")
  private String killCorporationName = null;

  @JsonProperty("damageTaken")
  private Long damageTaken = null;

  @JsonProperty("factionID")
  private Long factionID = null;

  @JsonProperty("factionName")
  private String factionName = null;

  @JsonProperty("shipTypeID")
  private Integer shipTypeID = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  public KillVictim cid(Long cid) {
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

  public KillVictim eveKitVersion(Integer eveKitVersion) {
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

  public KillVictim lifeStart(Long lifeStart) {
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

  public KillVictim lifeEnd(Long lifeEnd) {
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

  public KillVictim killID(Long killID) {
    this.killID = killID;
    return this;
  }

   /**
   * Get killID
   * @return killID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getKillID() {
    return killID;
  }

  public void setKillID(Long killID) {
    this.killID = killID;
  }

  public KillVictim allianceID(Long allianceID) {
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

  public KillVictim allianceName(String allianceName) {
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

  public KillVictim killCharacterID(Long killCharacterID) {
    this.killCharacterID = killCharacterID;
    return this;
  }

   /**
   * Get killCharacterID
   * @return killCharacterID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getKillCharacterID() {
    return killCharacterID;
  }

  public void setKillCharacterID(Long killCharacterID) {
    this.killCharacterID = killCharacterID;
  }

  public KillVictim killCharacterName(String killCharacterName) {
    this.killCharacterName = killCharacterName;
    return this;
  }

   /**
   * Get killCharacterName
   * @return killCharacterName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKillCharacterName() {
    return killCharacterName;
  }

  public void setKillCharacterName(String killCharacterName) {
    this.killCharacterName = killCharacterName;
  }

  public KillVictim killCorporationID(Long killCorporationID) {
    this.killCorporationID = killCorporationID;
    return this;
  }

   /**
   * Get killCorporationID
   * @return killCorporationID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getKillCorporationID() {
    return killCorporationID;
  }

  public void setKillCorporationID(Long killCorporationID) {
    this.killCorporationID = killCorporationID;
  }

  public KillVictim killCorporationName(String killCorporationName) {
    this.killCorporationName = killCorporationName;
    return this;
  }

   /**
   * Get killCorporationName
   * @return killCorporationName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKillCorporationName() {
    return killCorporationName;
  }

  public void setKillCorporationName(String killCorporationName) {
    this.killCorporationName = killCorporationName;
  }

  public KillVictim damageTaken(Long damageTaken) {
    this.damageTaken = damageTaken;
    return this;
  }

   /**
   * Get damageTaken
   * @return damageTaken
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDamageTaken() {
    return damageTaken;
  }

  public void setDamageTaken(Long damageTaken) {
    this.damageTaken = damageTaken;
  }

  public KillVictim factionID(Long factionID) {
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

  public KillVictim factionName(String factionName) {
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

  public KillVictim shipTypeID(Integer shipTypeID) {
    this.shipTypeID = shipTypeID;
    return this;
  }

   /**
   * Get shipTypeID
   * @return shipTypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getShipTypeID() {
    return shipTypeID;
  }

  public void setShipTypeID(Integer shipTypeID) {
    this.shipTypeID = shipTypeID;
  }

  public KillVictim lifeStartDate(DateTime lifeStartDate) {
    this.lifeStartDate = lifeStartDate;
    return this;
  }

   /**
   * lifeStart Date
   * @return lifeStartDate
  **/
  @ApiModelProperty(example = "null", value = "lifeStart Date")
  public DateTime getLifeStartDate() {
    return lifeStartDate;
  }

  public void setLifeStartDate(DateTime lifeStartDate) {
    this.lifeStartDate = lifeStartDate;
  }

  public KillVictim lifeEndDate(DateTime lifeEndDate) {
    this.lifeEndDate = lifeEndDate;
    return this;
  }

   /**
   * lifeEnd Date
   * @return lifeEndDate
  **/
  @ApiModelProperty(example = "null", value = "lifeEnd Date")
  public DateTime getLifeEndDate() {
    return lifeEndDate;
  }

  public void setLifeEndDate(DateTime lifeEndDate) {
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
        Objects.equals(this.allianceName, killVictim.allianceName) &&
        Objects.equals(this.killCharacterID, killVictim.killCharacterID) &&
        Objects.equals(this.killCharacterName, killVictim.killCharacterName) &&
        Objects.equals(this.killCorporationID, killVictim.killCorporationID) &&
        Objects.equals(this.killCorporationName, killVictim.killCorporationName) &&
        Objects.equals(this.damageTaken, killVictim.damageTaken) &&
        Objects.equals(this.factionID, killVictim.factionID) &&
        Objects.equals(this.factionName, killVictim.factionName) &&
        Objects.equals(this.shipTypeID, killVictim.shipTypeID) &&
        Objects.equals(this.lifeStartDate, killVictim.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, killVictim.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, killID, allianceID, allianceName, killCharacterID, killCharacterName, killCorporationID, killCorporationName, damageTaken, factionID, factionName, shipTypeID, lifeStartDate, lifeEndDate);
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
    sb.append("    allianceName: ").append(toIndentedString(allianceName)).append("\n");
    sb.append("    killCharacterID: ").append(toIndentedString(killCharacterID)).append("\n");
    sb.append("    killCharacterName: ").append(toIndentedString(killCharacterName)).append("\n");
    sb.append("    killCorporationID: ").append(toIndentedString(killCorporationID)).append("\n");
    sb.append("    killCorporationName: ").append(toIndentedString(killCorporationName)).append("\n");
    sb.append("    damageTaken: ").append(toIndentedString(damageTaken)).append("\n");
    sb.append("    factionID: ").append(toIndentedString(factionID)).append("\n");
    sb.append("    factionName: ").append(toIndentedString(factionName)).append("\n");
    sb.append("    shipTypeID: ").append(toIndentedString(shipTypeID)).append("\n");
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

