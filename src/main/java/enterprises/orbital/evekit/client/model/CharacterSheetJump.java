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
public class CharacterSheetJump   {
  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("jumpActivation")
  private Long jumpActivation = null;

  @JsonProperty("jumpFatigue")
  private Long jumpFatigue = null;

  @JsonProperty("jumpLastUpdate")
  private Long jumpLastUpdate = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  @JsonProperty("jumpActivationDate")
  private DateTime jumpActivationDate = null;

  @JsonProperty("jumpFatigueDate")
  private DateTime jumpFatigueDate = null;

  @JsonProperty("jumpLastUpdateDate")
  private DateTime jumpLastUpdateDate = null;

  public CharacterSheetJump cid(Long cid) {
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

  public CharacterSheetJump eveKitVersion(Integer eveKitVersion) {
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

  public CharacterSheetJump lifeStart(Long lifeStart) {
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

  public CharacterSheetJump lifeEnd(Long lifeEnd) {
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

  public CharacterSheetJump jumpActivation(Long jumpActivation) {
    this.jumpActivation = jumpActivation;
    return this;
  }

   /**
   * Get jumpActivation
   * @return jumpActivation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getJumpActivation() {
    return jumpActivation;
  }

  public void setJumpActivation(Long jumpActivation) {
    this.jumpActivation = jumpActivation;
  }

  public CharacterSheetJump jumpFatigue(Long jumpFatigue) {
    this.jumpFatigue = jumpFatigue;
    return this;
  }

   /**
   * Get jumpFatigue
   * @return jumpFatigue
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getJumpFatigue() {
    return jumpFatigue;
  }

  public void setJumpFatigue(Long jumpFatigue) {
    this.jumpFatigue = jumpFatigue;
  }

  public CharacterSheetJump jumpLastUpdate(Long jumpLastUpdate) {
    this.jumpLastUpdate = jumpLastUpdate;
    return this;
  }

   /**
   * Get jumpLastUpdate
   * @return jumpLastUpdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getJumpLastUpdate() {
    return jumpLastUpdate;
  }

  public void setJumpLastUpdate(Long jumpLastUpdate) {
    this.jumpLastUpdate = jumpLastUpdate;
  }

  public CharacterSheetJump lifeStartDate(DateTime lifeStartDate) {
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

  public CharacterSheetJump lifeEndDate(DateTime lifeEndDate) {
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

  public CharacterSheetJump jumpActivationDate(DateTime jumpActivationDate) {
    this.jumpActivationDate = jumpActivationDate;
    return this;
  }

   /**
   * jumpActivation Date
   * @return jumpActivationDate
  **/
  @ApiModelProperty(example = "null", value = "jumpActivation Date")
  public DateTime getJumpActivationDate() {
    return jumpActivationDate;
  }

  public void setJumpActivationDate(DateTime jumpActivationDate) {
    this.jumpActivationDate = jumpActivationDate;
  }

  public CharacterSheetJump jumpFatigueDate(DateTime jumpFatigueDate) {
    this.jumpFatigueDate = jumpFatigueDate;
    return this;
  }

   /**
   * jumpFatigue Date
   * @return jumpFatigueDate
  **/
  @ApiModelProperty(example = "null", value = "jumpFatigue Date")
  public DateTime getJumpFatigueDate() {
    return jumpFatigueDate;
  }

  public void setJumpFatigueDate(DateTime jumpFatigueDate) {
    this.jumpFatigueDate = jumpFatigueDate;
  }

  public CharacterSheetJump jumpLastUpdateDate(DateTime jumpLastUpdateDate) {
    this.jumpLastUpdateDate = jumpLastUpdateDate;
    return this;
  }

   /**
   * jumpLastUpdate Date
   * @return jumpLastUpdateDate
  **/
  @ApiModelProperty(example = "null", value = "jumpLastUpdate Date")
  public DateTime getJumpLastUpdateDate() {
    return jumpLastUpdateDate;
  }

  public void setJumpLastUpdateDate(DateTime jumpLastUpdateDate) {
    this.jumpLastUpdateDate = jumpLastUpdateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterSheetJump characterSheetJump = (CharacterSheetJump) o;
    return Objects.equals(this.cid, characterSheetJump.cid) &&
        Objects.equals(this.eveKitVersion, characterSheetJump.eveKitVersion) &&
        Objects.equals(this.lifeStart, characterSheetJump.lifeStart) &&
        Objects.equals(this.lifeEnd, characterSheetJump.lifeEnd) &&
        Objects.equals(this.jumpActivation, characterSheetJump.jumpActivation) &&
        Objects.equals(this.jumpFatigue, characterSheetJump.jumpFatigue) &&
        Objects.equals(this.jumpLastUpdate, characterSheetJump.jumpLastUpdate) &&
        Objects.equals(this.lifeStartDate, characterSheetJump.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, characterSheetJump.lifeEndDate) &&
        Objects.equals(this.jumpActivationDate, characterSheetJump.jumpActivationDate) &&
        Objects.equals(this.jumpFatigueDate, characterSheetJump.jumpFatigueDate) &&
        Objects.equals(this.jumpLastUpdateDate, characterSheetJump.jumpLastUpdateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, jumpActivation, jumpFatigue, jumpLastUpdate, lifeStartDate, lifeEndDate, jumpActivationDate, jumpFatigueDate, jumpLastUpdateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterSheetJump {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    jumpActivation: ").append(toIndentedString(jumpActivation)).append("\n");
    sb.append("    jumpFatigue: ").append(toIndentedString(jumpFatigue)).append("\n");
    sb.append("    jumpLastUpdate: ").append(toIndentedString(jumpLastUpdate)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    jumpActivationDate: ").append(toIndentedString(jumpActivationDate)).append("\n");
    sb.append("    jumpFatigueDate: ").append(toIndentedString(jumpFatigueDate)).append("\n");
    sb.append("    jumpLastUpdateDate: ").append(toIndentedString(jumpLastUpdateDate)).append("\n");
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

