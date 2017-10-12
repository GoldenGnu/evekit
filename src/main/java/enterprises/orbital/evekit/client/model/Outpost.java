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
import java.math.BigDecimal;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Model data common properties
 */
@ApiModel(description = "Model data common properties")

public class Outpost implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("stationID")
  private Long stationID = null;

  @JsonProperty("ownerID")
  private Long ownerID = null;

  @JsonProperty("stationName")
  private String stationName = null;

  @JsonProperty("solarSystemID")
  private Integer solarSystemID = null;

  @JsonProperty("dockingCostPerShipVolume")
  private BigDecimal dockingCostPerShipVolume = null;

  @JsonProperty("officeRentalCost")
  private BigDecimal officeRentalCost = null;

  @JsonProperty("stationTypeID")
  private Integer stationTypeID = null;

  @JsonProperty("reprocessingEfficiency")
  private Double reprocessingEfficiency = null;

  @JsonProperty("reprocessingStationTake")
  private Double reprocessingStationTake = null;

  @JsonProperty("standingOwnerID")
  private Long standingOwnerID = null;

  @JsonProperty("x")
  private Long x = null;

  @JsonProperty("y")
  private Long y = null;

  @JsonProperty("z")
  private Long z = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  public Outpost cid(Long cid) {
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

  public Outpost eveKitVersion(Integer eveKitVersion) {
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

  public Outpost lifeStart(Long lifeStart) {
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

  public Outpost lifeEnd(Long lifeEnd) {
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

  public Outpost stationID(Long stationID) {
    this.stationID = stationID;
    return this;
  }

   /**
   * Get stationID
   * @return stationID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStationID() {
    return stationID;
  }

  public void setStationID(Long stationID) {
    this.stationID = stationID;
  }

  public Outpost ownerID(Long ownerID) {
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

  public Outpost stationName(String stationName) {
    this.stationName = stationName;
    return this;
  }

   /**
   * Get stationName
   * @return stationName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStationName() {
    return stationName;
  }

  public void setStationName(String stationName) {
    this.stationName = stationName;
  }

  public Outpost solarSystemID(Integer solarSystemID) {
    this.solarSystemID = solarSystemID;
    return this;
  }

   /**
   * Get solarSystemID
   * @return solarSystemID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSolarSystemID() {
    return solarSystemID;
  }

  public void setSolarSystemID(Integer solarSystemID) {
    this.solarSystemID = solarSystemID;
  }

  public Outpost dockingCostPerShipVolume(BigDecimal dockingCostPerShipVolume) {
    this.dockingCostPerShipVolume = dockingCostPerShipVolume;
    return this;
  }

   /**
   * Get dockingCostPerShipVolume
   * @return dockingCostPerShipVolume
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getDockingCostPerShipVolume() {
    return dockingCostPerShipVolume;
  }

  public void setDockingCostPerShipVolume(BigDecimal dockingCostPerShipVolume) {
    this.dockingCostPerShipVolume = dockingCostPerShipVolume;
  }

  public Outpost officeRentalCost(BigDecimal officeRentalCost) {
    this.officeRentalCost = officeRentalCost;
    return this;
  }

   /**
   * Get officeRentalCost
   * @return officeRentalCost
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getOfficeRentalCost() {
    return officeRentalCost;
  }

  public void setOfficeRentalCost(BigDecimal officeRentalCost) {
    this.officeRentalCost = officeRentalCost;
  }

  public Outpost stationTypeID(Integer stationTypeID) {
    this.stationTypeID = stationTypeID;
    return this;
  }

   /**
   * Get stationTypeID
   * @return stationTypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStationTypeID() {
    return stationTypeID;
  }

  public void setStationTypeID(Integer stationTypeID) {
    this.stationTypeID = stationTypeID;
  }

  public Outpost reprocessingEfficiency(Double reprocessingEfficiency) {
    this.reprocessingEfficiency = reprocessingEfficiency;
    return this;
  }

   /**
   * Get reprocessingEfficiency
   * @return reprocessingEfficiency
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getReprocessingEfficiency() {
    return reprocessingEfficiency;
  }

  public void setReprocessingEfficiency(Double reprocessingEfficiency) {
    this.reprocessingEfficiency = reprocessingEfficiency;
  }

  public Outpost reprocessingStationTake(Double reprocessingStationTake) {
    this.reprocessingStationTake = reprocessingStationTake;
    return this;
  }

   /**
   * Get reprocessingStationTake
   * @return reprocessingStationTake
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getReprocessingStationTake() {
    return reprocessingStationTake;
  }

  public void setReprocessingStationTake(Double reprocessingStationTake) {
    this.reprocessingStationTake = reprocessingStationTake;
  }

  public Outpost standingOwnerID(Long standingOwnerID) {
    this.standingOwnerID = standingOwnerID;
    return this;
  }

   /**
   * Get standingOwnerID
   * @return standingOwnerID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getStandingOwnerID() {
    return standingOwnerID;
  }

  public void setStandingOwnerID(Long standingOwnerID) {
    this.standingOwnerID = standingOwnerID;
  }

  public Outpost x(Long x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getX() {
    return x;
  }

  public void setX(Long x) {
    this.x = x;
  }

  public Outpost y(Long y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getY() {
    return y;
  }

  public void setY(Long y) {
    this.y = y;
  }

  public Outpost z(Long z) {
    this.z = z;
    return this;
  }

   /**
   * Get z
   * @return z
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getZ() {
    return z;
  }

  public void setZ(Long z) {
    this.z = z;
  }

  public Outpost lifeStartDate(DateTime lifeStartDate) {
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

  public Outpost lifeEndDate(DateTime lifeEndDate) {
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
    Outpost outpost = (Outpost) o;
    return Objects.equals(this.cid, outpost.cid) &&
        Objects.equals(this.eveKitVersion, outpost.eveKitVersion) &&
        Objects.equals(this.lifeStart, outpost.lifeStart) &&
        Objects.equals(this.lifeEnd, outpost.lifeEnd) &&
        Objects.equals(this.stationID, outpost.stationID) &&
        Objects.equals(this.ownerID, outpost.ownerID) &&
        Objects.equals(this.stationName, outpost.stationName) &&
        Objects.equals(this.solarSystemID, outpost.solarSystemID) &&
        Objects.equals(this.dockingCostPerShipVolume, outpost.dockingCostPerShipVolume) &&
        Objects.equals(this.officeRentalCost, outpost.officeRentalCost) &&
        Objects.equals(this.stationTypeID, outpost.stationTypeID) &&
        Objects.equals(this.reprocessingEfficiency, outpost.reprocessingEfficiency) &&
        Objects.equals(this.reprocessingStationTake, outpost.reprocessingStationTake) &&
        Objects.equals(this.standingOwnerID, outpost.standingOwnerID) &&
        Objects.equals(this.x, outpost.x) &&
        Objects.equals(this.y, outpost.y) &&
        Objects.equals(this.z, outpost.z) &&
        Objects.equals(this.lifeStartDate, outpost.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, outpost.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, stationID, ownerID, stationName, solarSystemID, dockingCostPerShipVolume, officeRentalCost, stationTypeID, reprocessingEfficiency, reprocessingStationTake, standingOwnerID, x, y, z, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Outpost {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    stationID: ").append(toIndentedString(stationID)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    stationName: ").append(toIndentedString(stationName)).append("\n");
    sb.append("    solarSystemID: ").append(toIndentedString(solarSystemID)).append("\n");
    sb.append("    dockingCostPerShipVolume: ").append(toIndentedString(dockingCostPerShipVolume)).append("\n");
    sb.append("    officeRentalCost: ").append(toIndentedString(officeRentalCost)).append("\n");
    sb.append("    stationTypeID: ").append(toIndentedString(stationTypeID)).append("\n");
    sb.append("    reprocessingEfficiency: ").append(toIndentedString(reprocessingEfficiency)).append("\n");
    sb.append("    reprocessingStationTake: ").append(toIndentedString(reprocessingStationTake)).append("\n");
    sb.append("    standingOwnerID: ").append(toIndentedString(standingOwnerID)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

