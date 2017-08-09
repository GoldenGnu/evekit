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
public class ChatChannelMember   {
  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("channelID")
  private Long channelID = null;

  @JsonProperty("category")
  private String category = null;

  @JsonProperty("accessorID")
  private Long accessorID = null;

  @JsonProperty("accessorName")
  private String accessorName = null;

  @JsonProperty("untilWhen")
  private Long untilWhen = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  @JsonProperty("untilWhenDate")
  private DateTime untilWhenDate = null;

  public ChatChannelMember cid(Long cid) {
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

  public ChatChannelMember eveKitVersion(Integer eveKitVersion) {
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

  public ChatChannelMember lifeStart(Long lifeStart) {
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

  public ChatChannelMember lifeEnd(Long lifeEnd) {
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

  public ChatChannelMember channelID(Long channelID) {
    this.channelID = channelID;
    return this;
  }

   /**
   * Get channelID
   * @return channelID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getChannelID() {
    return channelID;
  }

  public void setChannelID(Long channelID) {
    this.channelID = channelID;
  }

  public ChatChannelMember category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ChatChannelMember accessorID(Long accessorID) {
    this.accessorID = accessorID;
    return this;
  }

   /**
   * Get accessorID
   * @return accessorID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getAccessorID() {
    return accessorID;
  }

  public void setAccessorID(Long accessorID) {
    this.accessorID = accessorID;
  }

  public ChatChannelMember accessorName(String accessorName) {
    this.accessorName = accessorName;
    return this;
  }

   /**
   * Get accessorName
   * @return accessorName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAccessorName() {
    return accessorName;
  }

  public void setAccessorName(String accessorName) {
    this.accessorName = accessorName;
  }

  public ChatChannelMember untilWhen(Long untilWhen) {
    this.untilWhen = untilWhen;
    return this;
  }

   /**
   * Get untilWhen
   * @return untilWhen
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUntilWhen() {
    return untilWhen;
  }

  public void setUntilWhen(Long untilWhen) {
    this.untilWhen = untilWhen;
  }

  public ChatChannelMember reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ChatChannelMember lifeStartDate(DateTime lifeStartDate) {
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

  public ChatChannelMember lifeEndDate(DateTime lifeEndDate) {
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

  public ChatChannelMember untilWhenDate(DateTime untilWhenDate) {
    this.untilWhenDate = untilWhenDate;
    return this;
  }

   /**
   * untilWhen Date
   * @return untilWhenDate
  **/
  @ApiModelProperty(example = "null", value = "untilWhen Date")
  public DateTime getUntilWhenDate() {
    return untilWhenDate;
  }

  public void setUntilWhenDate(DateTime untilWhenDate) {
    this.untilWhenDate = untilWhenDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatChannelMember chatChannelMember = (ChatChannelMember) o;
    return Objects.equals(this.cid, chatChannelMember.cid) &&
        Objects.equals(this.eveKitVersion, chatChannelMember.eveKitVersion) &&
        Objects.equals(this.lifeStart, chatChannelMember.lifeStart) &&
        Objects.equals(this.lifeEnd, chatChannelMember.lifeEnd) &&
        Objects.equals(this.channelID, chatChannelMember.channelID) &&
        Objects.equals(this.category, chatChannelMember.category) &&
        Objects.equals(this.accessorID, chatChannelMember.accessorID) &&
        Objects.equals(this.accessorName, chatChannelMember.accessorName) &&
        Objects.equals(this.untilWhen, chatChannelMember.untilWhen) &&
        Objects.equals(this.reason, chatChannelMember.reason) &&
        Objects.equals(this.lifeStartDate, chatChannelMember.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, chatChannelMember.lifeEndDate) &&
        Objects.equals(this.untilWhenDate, chatChannelMember.untilWhenDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, channelID, category, accessorID, accessorName, untilWhen, reason, lifeStartDate, lifeEndDate, untilWhenDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatChannelMember {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    channelID: ").append(toIndentedString(channelID)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    accessorID: ").append(toIndentedString(accessorID)).append("\n");
    sb.append("    accessorName: ").append(toIndentedString(accessorName)).append("\n");
    sb.append("    untilWhen: ").append(toIndentedString(untilWhen)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    untilWhenDate: ").append(toIndentedString(untilWhenDate)).append("\n");
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

