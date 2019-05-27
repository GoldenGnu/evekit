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

public class UpcomingCalendarEvent implements Serializable {
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

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_EVENT_DATE = "eventDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE)
  private Long eventDate;

  public static final String SERIALIZED_NAME_EVENT_I_D = "eventID";
  @SerializedName(SERIALIZED_NAME_EVENT_I_D)
  private Integer eventID;

  public static final String SERIALIZED_NAME_EVENT_TEXT = "eventText";
  @SerializedName(SERIALIZED_NAME_EVENT_TEXT)
  private String eventText;

  public static final String SERIALIZED_NAME_EVENT_TITLE = "eventTitle";
  @SerializedName(SERIALIZED_NAME_EVENT_TITLE)
  private String eventTitle;

  public static final String SERIALIZED_NAME_OWNER_I_D = "ownerID";
  @SerializedName(SERIALIZED_NAME_OWNER_I_D)
  private Integer ownerID;

  public static final String SERIALIZED_NAME_OWNER_NAME = "ownerName";
  @SerializedName(SERIALIZED_NAME_OWNER_NAME)
  private String ownerName;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private String response;

  public static final String SERIALIZED_NAME_IMPORTANCE = "importance";
  @SerializedName(SERIALIZED_NAME_IMPORTANCE)
  private Integer importance;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "ownerType";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_EVENT_DATE_DATE = "eventDateDate";
  @SerializedName(SERIALIZED_NAME_EVENT_DATE_DATE)
  private OffsetDateTime eventDateDate;

  public UpcomingCalendarEvent cid(Long cid) {
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

  public UpcomingCalendarEvent eveKitVersion(Integer eveKitVersion) {
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

  public UpcomingCalendarEvent lifeStart(Long lifeStart) {
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

  public UpcomingCalendarEvent lifeEnd(Long lifeEnd) {
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

  public UpcomingCalendarEvent duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public Long getEventDate() {
    return eventDate;
  }

  public void setEventDate(Long eventDate) {
    this.eventDate = eventDate;
  }

  public UpcomingCalendarEvent eventID(Integer eventID) {
    this.eventID = eventID;
    return this;
  }

   /**
   * Get eventID
   * @return eventID
  **/
  @ApiModelProperty(value = "")
  public Integer getEventID() {
    return eventID;
  }

  public void setEventID(Integer eventID) {
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public String getEventTitle() {
    return eventTitle;
  }

  public void setEventTitle(String eventTitle) {
    this.eventTitle = eventTitle;
  }

  public UpcomingCalendarEvent ownerID(Integer ownerID) {
    this.ownerID = ownerID;
    return this;
  }

   /**
   * Get ownerID
   * @return ownerID
  **/
  @ApiModelProperty(value = "")
  public Integer getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(Integer ownerID) {
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public UpcomingCalendarEvent importance(Integer importance) {
    this.importance = importance;
    return this;
  }

   /**
   * Get importance
   * @return importance
  **/
  @ApiModelProperty(value = "")
  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public UpcomingCalendarEvent ownerType(String ownerType) {
    this.ownerType = ownerType;
    return this;
  }

   /**
   * Get ownerType
   * @return ownerType
  **/
  @ApiModelProperty(value = "")
  public String getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }

  public UpcomingCalendarEvent lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public UpcomingCalendarEvent lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public UpcomingCalendarEvent eventDateDate(OffsetDateTime eventDateDate) {
    this.eventDateDate = eventDateDate;
    return this;
  }

   /**
   * eventDate Date
   * @return eventDateDate
  **/
  @ApiModelProperty(value = "eventDate Date")
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
        Objects.equals(this.importance, upcomingCalendarEvent.importance) &&
        Objects.equals(this.ownerType, upcomingCalendarEvent.ownerType) &&
        Objects.equals(this.lifeStartDate, upcomingCalendarEvent.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, upcomingCalendarEvent.lifeEndDate) &&
        Objects.equals(this.eventDateDate, upcomingCalendarEvent.eventDateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, duration, eventDate, eventID, eventText, eventTitle, ownerID, ownerName, response, importance, ownerType, lifeStartDate, lifeEndDate, eventDateDate);
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
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
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

