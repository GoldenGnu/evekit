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
import java.util.ArrayList;
import java.util.List;
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
  private Integer planetID = null;

  @JsonProperty("routeID")
  private Long routeID = null;

  @JsonProperty("sourcePinID")
  private Long sourcePinID = null;

  @JsonProperty("destinationPinID")
  private Long destinationPinID = null;

  @JsonProperty("contentTypeID")
  private Integer contentTypeID = null;

  @JsonProperty("quantity")
  private Float quantity = null;

  @JsonProperty("waypoints")
  private List<Long> waypoints = new ArrayList<Long>();

  @JsonProperty("lifeStartDate")
  private OffsetDateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private OffsetDateTime lifeEndDate = null;

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

  public PlanetaryRoute planetID(Integer planetID) {
    this.planetID = planetID;
    return this;
  }

   /**
   * Get planetID
   * @return planetID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPlanetID() {
    return planetID;
  }

  public void setPlanetID(Integer planetID) {
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

  public PlanetaryRoute quantity(Float quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Float getQuantity() {
    return quantity;
  }

  public void setQuantity(Float quantity) {
    this.quantity = quantity;
  }

  public PlanetaryRoute waypoints(List<Long> waypoints) {
    this.waypoints = waypoints;
    return this;
  }

  public PlanetaryRoute addWaypointsItem(Long waypointsItem) {
    this.waypoints.add(waypointsItem);
    return this;
  }

   /**
   * Get waypoints
   * @return waypoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getWaypoints() {
    return waypoints;
  }

  public void setWaypoints(List<Long> waypoints) {
    this.waypoints = waypoints;
  }

  public PlanetaryRoute lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public PlanetaryRoute lifeEndDate(OffsetDateTime lifeEndDate) {
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
        Objects.equals(this.quantity, planetaryRoute.quantity) &&
        Objects.equals(this.waypoints, planetaryRoute.waypoints) &&
        Objects.equals(this.lifeStartDate, planetaryRoute.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, planetaryRoute.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, planetID, routeID, sourcePinID, destinationPinID, contentTypeID, quantity, waypoints, lifeStartDate, lifeEndDate);
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
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
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

