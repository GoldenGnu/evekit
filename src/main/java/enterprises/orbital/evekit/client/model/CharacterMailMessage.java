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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Model data common properties
 */
@ApiModel(description = "Model data common properties")

public class CharacterMailMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("messageID")
  private Long messageID = null;

  @JsonProperty("senderID")
  private Long senderID = null;

  @JsonProperty("senderName")
  private String senderName = null;

  @JsonProperty("toCharacterID")
  private List<Long> toCharacterID = new ArrayList<Long>();

  @JsonProperty("sentDate")
  private Long sentDate = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("toCorpOrAllianceID")
  private Long toCorpOrAllianceID = null;

  @JsonProperty("toListID")
  private List<Long> toListID = new ArrayList<Long>();

  @JsonProperty("msgRead")
  private Boolean msgRead = false;

  @JsonProperty("senderTypeID")
  private Integer senderTypeID = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  @JsonProperty("sentDateDate")
  private DateTime sentDateDate = null;

  public CharacterMailMessage cid(Long cid) {
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

  public CharacterMailMessage eveKitVersion(Integer eveKitVersion) {
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

  public CharacterMailMessage lifeStart(Long lifeStart) {
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

  public CharacterMailMessage lifeEnd(Long lifeEnd) {
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

  public CharacterMailMessage messageID(Long messageID) {
    this.messageID = messageID;
    return this;
  }

   /**
   * Get messageID
   * @return messageID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMessageID() {
    return messageID;
  }

  public void setMessageID(Long messageID) {
    this.messageID = messageID;
  }

  public CharacterMailMessage senderID(Long senderID) {
    this.senderID = senderID;
    return this;
  }

   /**
   * Get senderID
   * @return senderID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSenderID() {
    return senderID;
  }

  public void setSenderID(Long senderID) {
    this.senderID = senderID;
  }

  public CharacterMailMessage senderName(String senderName) {
    this.senderName = senderName;
    return this;
  }

   /**
   * Get senderName
   * @return senderName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }

  public CharacterMailMessage toCharacterID(List<Long> toCharacterID) {
    this.toCharacterID = toCharacterID;
    return this;
  }

  public CharacterMailMessage addToCharacterIDItem(Long toCharacterIDItem) {
    this.toCharacterID.add(toCharacterIDItem);
    return this;
  }

   /**
   * Get toCharacterID
   * @return toCharacterID
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getToCharacterID() {
    return toCharacterID;
  }

  public void setToCharacterID(List<Long> toCharacterID) {
    this.toCharacterID = toCharacterID;
  }

  public CharacterMailMessage sentDate(Long sentDate) {
    this.sentDate = sentDate;
    return this;
  }

   /**
   * Get sentDate
   * @return sentDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSentDate() {
    return sentDate;
  }

  public void setSentDate(Long sentDate) {
    this.sentDate = sentDate;
  }

  public CharacterMailMessage title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CharacterMailMessage toCorpOrAllianceID(Long toCorpOrAllianceID) {
    this.toCorpOrAllianceID = toCorpOrAllianceID;
    return this;
  }

   /**
   * Get toCorpOrAllianceID
   * @return toCorpOrAllianceID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getToCorpOrAllianceID() {
    return toCorpOrAllianceID;
  }

  public void setToCorpOrAllianceID(Long toCorpOrAllianceID) {
    this.toCorpOrAllianceID = toCorpOrAllianceID;
  }

  public CharacterMailMessage toListID(List<Long> toListID) {
    this.toListID = toListID;
    return this;
  }

  public CharacterMailMessage addToListIDItem(Long toListIDItem) {
    this.toListID.add(toListIDItem);
    return this;
  }

   /**
   * Get toListID
   * @return toListID
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getToListID() {
    return toListID;
  }

  public void setToListID(List<Long> toListID) {
    this.toListID = toListID;
  }

  public CharacterMailMessage msgRead(Boolean msgRead) {
    this.msgRead = msgRead;
    return this;
  }

   /**
   * Get msgRead
   * @return msgRead
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMsgRead() {
    return msgRead;
  }

  public void setMsgRead(Boolean msgRead) {
    this.msgRead = msgRead;
  }

  public CharacterMailMessage senderTypeID(Integer senderTypeID) {
    this.senderTypeID = senderTypeID;
    return this;
  }

   /**
   * Get senderTypeID
   * @return senderTypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSenderTypeID() {
    return senderTypeID;
  }

  public void setSenderTypeID(Integer senderTypeID) {
    this.senderTypeID = senderTypeID;
  }

  public CharacterMailMessage lifeStartDate(DateTime lifeStartDate) {
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

  public CharacterMailMessage lifeEndDate(DateTime lifeEndDate) {
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

  public CharacterMailMessage sentDateDate(DateTime sentDateDate) {
    this.sentDateDate = sentDateDate;
    return this;
  }

   /**
   * sentDate Date
   * @return sentDateDate
  **/
  @ApiModelProperty(example = "null", value = "sentDate Date")
  public DateTime getSentDateDate() {
    return sentDateDate;
  }

  public void setSentDateDate(DateTime sentDateDate) {
    this.sentDateDate = sentDateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterMailMessage characterMailMessage = (CharacterMailMessage) o;
    return Objects.equals(this.cid, characterMailMessage.cid) &&
        Objects.equals(this.eveKitVersion, characterMailMessage.eveKitVersion) &&
        Objects.equals(this.lifeStart, characterMailMessage.lifeStart) &&
        Objects.equals(this.lifeEnd, characterMailMessage.lifeEnd) &&
        Objects.equals(this.messageID, characterMailMessage.messageID) &&
        Objects.equals(this.senderID, characterMailMessage.senderID) &&
        Objects.equals(this.senderName, characterMailMessage.senderName) &&
        Objects.equals(this.toCharacterID, characterMailMessage.toCharacterID) &&
        Objects.equals(this.sentDate, characterMailMessage.sentDate) &&
        Objects.equals(this.title, characterMailMessage.title) &&
        Objects.equals(this.toCorpOrAllianceID, characterMailMessage.toCorpOrAllianceID) &&
        Objects.equals(this.toListID, characterMailMessage.toListID) &&
        Objects.equals(this.msgRead, characterMailMessage.msgRead) &&
        Objects.equals(this.senderTypeID, characterMailMessage.senderTypeID) &&
        Objects.equals(this.lifeStartDate, characterMailMessage.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, characterMailMessage.lifeEndDate) &&
        Objects.equals(this.sentDateDate, characterMailMessage.sentDateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, messageID, senderID, senderName, toCharacterID, sentDate, title, toCorpOrAllianceID, toListID, msgRead, senderTypeID, lifeStartDate, lifeEndDate, sentDateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterMailMessage {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    senderID: ").append(toIndentedString(senderID)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    toCharacterID: ").append(toIndentedString(toCharacterID)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    toCorpOrAllianceID: ").append(toIndentedString(toCorpOrAllianceID)).append("\n");
    sb.append("    toListID: ").append(toIndentedString(toListID)).append("\n");
    sb.append("    msgRead: ").append(toIndentedString(msgRead)).append("\n");
    sb.append("    senderTypeID: ").append(toIndentedString(senderTypeID)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    sentDateDate: ").append(toIndentedString(sentDateDate)).append("\n");
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

