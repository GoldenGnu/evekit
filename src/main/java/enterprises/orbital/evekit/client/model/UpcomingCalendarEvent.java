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

public class UpcomingCalendarEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("eventDate")
  private Long eventDate = null;

  @JsonProperty("eventID")
  private Long eventID = null;

  @JsonProperty("eventText")
  private String eventText = null;

  @JsonProperty("eventTitle")
  private String eventTitle = null;

  @JsonProperty("ownerID")
  private Long ownerID = null;

  @JsonProperty("ownerName")
  private String ownerName = null;

  @JsonProperty("response")
  private String response = null;

  @JsonProperty("important")
  private Boolean important = false;

  @JsonProperty("ownerTypeID")
  private Integer ownerTypeID = null;

  @JsonProperty("lifeStartDate")
  private OffsetDateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private OffsetDateTime lifeEndDate = null;

  @JsonProperty("eventDateDate")
  private OffsetDateTime eventDateDate = null;

  public UpcomingCalendarEvent cid(Long cid) {
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

  public UpcomingCalendarEvent eveKitVersion(Integer eveKitVersion) {
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

  public UpcomingCalendarEvent lifeStart(Long lifeStart) {
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

  public UpcomingCalendarEvent lifeEnd(Long lifeEnd) {
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

  public UpcomingCalendarEvent duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public UpcomingCalendarEvent eventDate(Long eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Get eventDate
   * @return eventDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEventDate() {
    return eventDate;
  }

  public void setEventDate(Long eventDate) {
    this.eventDate = eventDate;
  }

  public UpcomingCalendarEvent eventID(Long eventID) {
    this.eventID = eventID;
    return this;
  }

   /**
   * Get eventID
   * @return eventID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEventID() {
    return eventID;
  }

  public void setEventID(Long eventID) {
    this.eventID = eventID;
  }

  public UpcomingCalendarEvent eventText(String eventText) {
    this.eventText = eventText;
    return this;
  }

   /**
   * Get eventText
   * @return eventText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEventText() {
    return eventText;
  }

  public void setEventText(String eventText) {
    this.eventText = eventText;
  }

  public UpcomingCalendarEvent eventTitle(String eventTitle) {
    this.eventTitle = eventTitle;
    return this;
  }

   /**
   * Get eventTitle
   * @return eventTitle
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEventTitle() {
    return eventTitle;
  }

  public void setEventTitle(String eventTitle) {
    this.eventTitle = eventTitle;
  }

  public UpcomingCalendarEvent ownerID(Long ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Get ownerID
   * @return ownerID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(Long ownerID) {
    this.ownerID = ownerID;
  }

  public UpcomingCalendarEvent ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * Get ownerName
   * @return ownerName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public UpcomingCalendarEvent response(String response) {
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public UpcomingCalendarEvent important(Boolean important) {
    this.important = important;
    return this;
  }

   /**
   * Get important
   * @return important
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getImportant() {
    return important;
  }

  public void setImportant(Boolean important) {
    this.important = important;
  }

  public UpcomingCalendarEvent ownerTypeID(Integer ownerTypeID) {
    this.ownerTypeID = ownerTypeID;
    return this;
  }

   /**
   * Get ownerTypeID
   * @return ownerTypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOwnerTypeID() {
    return ownerTypeID;
  }

  public void setOwnerTypeID(Integer ownerTypeID) {
    this.ownerTypeID = ownerTypeID;
  }

  public UpcomingCalendarEvent lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public UpcomingCalendarEvent lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public UpcomingCalendarEvent eventDateDate(OffsetDateTime eventDateDate) {
    this.eventDateDate = eventDateDate;
    return this;
  }

   /**
   * eventDate Date
   * @return eventDateDate
  **/
  @ApiModelProperty(example = "null", value = "eventDate Date")
  public OffsetDateTime getEventDateDate() {
    return eventDateDate;
  }

  public void setEventDateDate(OffsetDateTime eventDateDate) {
    this.eventDateDate = eventDateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpcomingCalendarEvent upcomingCalendarEvent = (UpcomingCalendarEvent) o;
    return Objects.equals(this.cid, upcomingCalendarEvent.cid) &&
        Objects.equals(this.eveKitVersion, upcomingCalendarEvent.eveKitVersion) &&
        Objects.equals(this.lifeStart, upcomingCalendarEvent.lifeStart) &&
        Objects.equals(this.lifeEnd, upcomingCalendarEvent.lifeEnd) &&
        Objects.equals(this.duration, upcomingCalendarEvent.duration) &&
        Objects.equals(this.eventDate, upcomingCalendarEvent.eventDate) &&
        Objects.equals(this.eventID, upcomingCalendarEvent.eventID) &&
        Objects.equals(this.eventText, upcomingCalendarEvent.eventText) &&
        Objects.equals(this.eventTitle, upcomingCalendarEvent.eventTitle) &&
        Objects.equals(this.ownerID, upcomingCalendarEvent.ownerID) &&
        Objects.equals(this.ownerName, upcomingCalendarEvent.ownerName) &&
        Objects.equals(this.response, upcomingCalendarEvent.response) &&
        Objects.equals(this.important, upcomingCalendarEvent.important) &&
        Objects.equals(this.ownerTypeID, upcomingCalendarEvent.ownerTypeID) &&
        Objects.equals(this.lifeStartDate, upcomingCalendarEvent.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, upcomingCalendarEvent.lifeEndDate) &&
        Objects.equals(this.eventDateDate, upcomingCalendarEvent.eventDateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, duration, eventDate, eventID, eventText, eventTitle, ownerID, ownerName, response, important, ownerTypeID, lifeStartDate, lifeEndDate, eventDateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpcomingCalendarEvent {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    eventText: ").append(toIndentedString(eventText)).append("\n");
    sb.append("    eventTitle: ").append(toIndentedString(eventTitle)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    important: ").append(toIndentedString(important)).append("\n");
    sb.append("    ownerTypeID: ").append(toIndentedString(ownerTypeID)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    eventDateDate: ").append(toIndentedString(eventDateDate)).append("\n");
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

