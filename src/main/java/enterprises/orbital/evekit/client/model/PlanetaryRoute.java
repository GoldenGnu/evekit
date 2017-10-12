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
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Model data common properties
 */
@ApiModel(description = "Model data common properties")

public class PlanetaryRoute implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("planetID")
  private Long planetID = null;

  @JsonProperty("routeID")
  private Long routeID = null;

  @JsonProperty("sourcePinID")
  private Long sourcePinID = null;

  @JsonProperty("destinationPinID")
  private Long destinationPinID = null;

  @JsonProperty("contentTypeID")
  private Integer contentTypeID = null;

  @JsonProperty("contentTypeName")
  private String contentTypeName = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("waypoint1")
  private Long waypoint1 = null;

  @JsonProperty("waypoint2")
  private Long waypoint2 = null;

  @JsonProperty("waypoint3")
  private Long waypoint3 = null;

  @JsonProperty("waypoint4")
  private Long waypoint4 = null;

  @JsonProperty("waypoint5")
  private Long waypoint5 = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  public PlanetaryRoute cid(Long cid) {
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

  public PlanetaryRoute eveKitVersion(Integer eveKitVersion) {
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

  public PlanetaryRoute lifeStart(Long lifeStart) {
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

  public PlanetaryRoute lifeEnd(Long lifeEnd) {
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

  public PlanetaryRoute planetID(Long planetID) {
    this.planetID = planetID;
    return this;
  }

   /**
   * Get planetID
   * @return planetID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPlanetID() {
    return planetID;
  }

  public void setPlanetID(Long planetID) {
    this.planetID = planetID;
  }

  public PlanetaryRoute routeID(Long routeID) {
    this.routeID = routeID;
    return this;
  }

   /**
   * Get routeID
   * @return routeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRouteID() {
    return routeID;
  }

  public void setRouteID(Long routeID) {
    this.routeID = routeID;
  }

  public PlanetaryRoute sourcePinID(Long sourcePinID) {
    this.sourcePinID = sourcePinID;
    return this;
  }

   /**
   * Get sourcePinID
   * @return sourcePinID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSourcePinID() {
    return sourcePinID;
  }

  public void setSourcePinID(Long sourcePinID) {
    this.sourcePinID = sourcePinID;
  }

  public PlanetaryRoute destinationPinID(Long destinationPinID) {
    this.destinationPinID = destinationPinID;
    return this;
  }

   /**
   * Get destinationPinID
   * @return destinationPinID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDestinationPinID() {
    return destinationPinID;
  }

  public void setDestinationPinID(Long destinationPinID) {
    this.destinationPinID = destinationPinID;
  }

  public PlanetaryRoute contentTypeID(Integer contentTypeID) {
    this.contentTypeID = contentTypeID;
    return this;
  }

   /**
   * Get contentTypeID
   * @return contentTypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContentTypeID() {
    return contentTypeID;
  }

  public void setContentTypeID(Integer contentTypeID) {
    this.contentTypeID = contentTypeID;
  }

  public PlanetaryRoute contentTypeName(String contentTypeName) {
    this.contentTypeName = contentTypeName;
    return this;
  }

   /**
   * Get contentTypeName
   * @return contentTypeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContentTypeName() {
    return contentTypeName;
  }

  public void setContentTypeName(String contentTypeName) {
    this.contentTypeName = contentTypeName;
  }

  public PlanetaryRoute quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PlanetaryRoute waypoint1(Long waypoint1) {
    this.waypoint1 = waypoint1;
    return this;
  }

   /**
   * Get waypoint1
   * @return waypoint1
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getWaypoint1() {
    return waypoint1;
  }

  public void setWaypoint1(Long waypoint1) {
    this.waypoint1 = waypoint1;
  }

  public PlanetaryRoute waypoint2(Long waypoint2) {
    this.waypoint2 = waypoint2;
    return this;
  }

   /**
   * Get waypoint2
   * @return waypoint2
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getWaypoint2() {
    return waypoint2;
  }

  public void setWaypoint2(Long waypoint2) {
    this.waypoint2 = waypoint2;
  }

  public PlanetaryRoute waypoint3(Long waypoint3) {
    this.waypoint3 = waypoint3;
    return this;
  }

   /**
   * Get waypoint3
   * @return waypoint3
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getWaypoint3() {
    return waypoint3;
  }

  public void setWaypoint3(Long waypoint3) {
    this.waypoint3 = waypoint3;
  }

  public PlanetaryRoute waypoint4(Long waypoint4) {
    this.waypoint4 = waypoint4;
    return this;
  }

   /**
   * Get waypoint4
   * @return waypoint4
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getWaypoint4() {
    return waypoint4;
  }

  public void setWaypoint4(Long waypoint4) {
    this.waypoint4 = waypoint4;
  }

  public PlanetaryRoute waypoint5(Long waypoint5) {
    this.waypoint5 = waypoint5;
    return this;
  }

   /**
   * Get waypoint5
   * @return waypoint5
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getWaypoint5() {
    return waypoint5;
  }

  public void setWaypoint5(Long waypoint5) {
    this.waypoint5 = waypoint5;
  }

  public PlanetaryRoute lifeStartDate(DateTime lifeStartDate) {
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

  public PlanetaryRoute lifeEndDate(DateTime lifeEndDate) {
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
    PlanetaryRoute planetaryRoute = (PlanetaryRoute) o;
    return Objects.equals(this.cid, planetaryRoute.cid) &&
        Objects.equals(this.eveKitVersion, planetaryRoute.eveKitVersion) &&
        Objects.equals(this.lifeStart, planetaryRoute.lifeStart) &&
        Objects.equals(this.lifeEnd, planetaryRoute.lifeEnd) &&
        Objects.equals(this.planetID, planetaryRoute.planetID) &&
        Objects.equals(this.routeID, planetaryRoute.routeID) &&
        Objects.equals(this.sourcePinID, planetaryRoute.sourcePinID) &&
        Objects.equals(this.destinationPinID, planetaryRoute.destinationPinID) &&
        Objects.equals(this.contentTypeID, planetaryRoute.contentTypeID) &&
        Objects.equals(this.contentTypeName, planetaryRoute.contentTypeName) &&
        Objects.equals(this.quantity, planetaryRoute.quantity) &&
        Objects.equals(this.waypoint1, planetaryRoute.waypoint1) &&
        Objects.equals(this.waypoint2, planetaryRoute.waypoint2) &&
        Objects.equals(this.waypoint3, planetaryRoute.waypoint3) &&
        Objects.equals(this.waypoint4, planetaryRoute.waypoint4) &&
        Objects.equals(this.waypoint5, planetaryRoute.waypoint5) &&
        Objects.equals(this.lifeStartDate, planetaryRoute.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, planetaryRoute.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, planetID, routeID, sourcePinID, destinationPinID, contentTypeID, contentTypeName, quantity, waypoint1, waypoint2, waypoint3, waypoint4, waypoint5, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanetaryRoute {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    planetID: ").append(toIndentedString(planetID)).append("\n");
    sb.append("    routeID: ").append(toIndentedString(routeID)).append("\n");
    sb.append("    sourcePinID: ").append(toIndentedString(sourcePinID)).append("\n");
    sb.append("    destinationPinID: ").append(toIndentedString(destinationPinID)).append("\n");
    sb.append("    contentTypeID: ").append(toIndentedString(contentTypeID)).append("\n");
    sb.append("    contentTypeName: ").append(toIndentedString(contentTypeName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    waypoint1: ").append(toIndentedString(waypoint1)).append("\n");
    sb.append("    waypoint2: ").append(toIndentedString(waypoint2)).append("\n");
    sb.append("    waypoint3: ").append(toIndentedString(waypoint3)).append("\n");
    sb.append("    waypoint4: ").append(toIndentedString(waypoint4)).append("\n");
    sb.append("    waypoint5: ").append(toIndentedString(waypoint5)).append("\n");
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

