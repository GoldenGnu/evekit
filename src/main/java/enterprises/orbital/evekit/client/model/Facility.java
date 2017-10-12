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

public class Facility implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("facilityID")
  private Long facilityID = null;

  @JsonProperty("typeID")
  private Integer typeID = null;

  @JsonProperty("typeName")
  private String typeName = null;

  @JsonProperty("solarSystemID")
  private Integer solarSystemID = null;

  @JsonProperty("solarSystemName")
  private String solarSystemName = null;

  @JsonProperty("regionID")
  private Integer regionID = null;

  @JsonProperty("regionName")
  private String regionName = null;

  @JsonProperty("starbaseModifier")
  private Integer starbaseModifier = null;

  @JsonProperty("tax")
  private Double tax = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  public Facility cid(Long cid) {
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

  public Facility eveKitVersion(Integer eveKitVersion) {
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

  public Facility lifeStart(Long lifeStart) {
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

  public Facility lifeEnd(Long lifeEnd) {
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

  public Facility facilityID(Long facilityID) {
    this.facilityID = facilityID;
    return this;
  }

   /**
   * Get facilityID
   * @return facilityID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getFacilityID() {
    return facilityID;
  }

  public void setFacilityID(Long facilityID) {
    this.facilityID = facilityID;
  }

  public Facility typeID(Integer typeID) {
    this.typeID = typeID;
    return this;
  }

   /**
   * Get typeID
   * @return typeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTypeID() {
    return typeID;
  }

  public void setTypeID(Integer typeID) {
    this.typeID = typeID;
  }

  public Facility typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Facility solarSystemID(Integer solarSystemID) {
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

  public Facility solarSystemName(String solarSystemName) {
    this.solarSystemName = solarSystemName;
    return this;
  }

   /**
   * Get solarSystemName
   * @return solarSystemName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSolarSystemName() {
    return solarSystemName;
  }

  public void setSolarSystemName(String solarSystemName) {
    this.solarSystemName = solarSystemName;
  }

  public Facility regionID(Integer regionID) {
    this.regionID = regionID;
    return this;
  }

   /**
   * Get regionID
   * @return regionID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRegionID() {
    return regionID;
  }

  public void setRegionID(Integer regionID) {
    this.regionID = regionID;
  }

  public Facility regionName(String regionName) {
    this.regionName = regionName;
    return this;
  }

   /**
   * Get regionName
   * @return regionName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRegionName() {
    return regionName;
  }

  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }

  public Facility starbaseModifier(Integer starbaseModifier) {
    this.starbaseModifier = starbaseModifier;
    return this;
  }

   /**
   * Get starbaseModifier
   * @return starbaseModifier
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStarbaseModifier() {
    return starbaseModifier;
  }

  public void setStarbaseModifier(Integer starbaseModifier) {
    this.starbaseModifier = starbaseModifier;
  }

  public Facility tax(Double tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public Facility lifeStartDate(DateTime lifeStartDate) {
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

  public Facility lifeEndDate(DateTime lifeEndDate) {
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
    Facility facility = (Facility) o;
    return Objects.equals(this.cid, facility.cid) &&
        Objects.equals(this.eveKitVersion, facility.eveKitVersion) &&
        Objects.equals(this.lifeStart, facility.lifeStart) &&
        Objects.equals(this.lifeEnd, facility.lifeEnd) &&
        Objects.equals(this.facilityID, facility.facilityID) &&
        Objects.equals(this.typeID, facility.typeID) &&
        Objects.equals(this.typeName, facility.typeName) &&
        Objects.equals(this.solarSystemID, facility.solarSystemID) &&
        Objects.equals(this.solarSystemName, facility.solarSystemName) &&
        Objects.equals(this.regionID, facility.regionID) &&
        Objects.equals(this.regionName, facility.regionName) &&
        Objects.equals(this.starbaseModifier, facility.starbaseModifier) &&
        Objects.equals(this.tax, facility.tax) &&
        Objects.equals(this.lifeStartDate, facility.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, facility.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, facilityID, typeID, typeName, solarSystemID, solarSystemName, regionID, regionName, starbaseModifier, tax, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facility {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    facilityID: ").append(toIndentedString(facilityID)).append("\n");
    sb.append("    typeID: ").append(toIndentedString(typeID)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    solarSystemID: ").append(toIndentedString(solarSystemID)).append("\n");
    sb.append("    solarSystemName: ").append(toIndentedString(solarSystemName)).append("\n");
    sb.append("    regionID: ").append(toIndentedString(regionID)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    starbaseModifier: ").append(toIndentedString(starbaseModifier)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
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

