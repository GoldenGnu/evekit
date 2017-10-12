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

public class OutpostServiceDetail implements Serializable {
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

  @JsonProperty("serviceName")
  private String serviceName = null;

  @JsonProperty("ownerID")
  private Long ownerID = null;

  @JsonProperty("minStanding")
  private Double minStanding = null;

  @JsonProperty("surchargePerBadStanding")
  private BigDecimal surchargePerBadStanding = null;

  @JsonProperty("discountPerGoodStanding")
  private BigDecimal discountPerGoodStanding = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  public OutpostServiceDetail cid(Long cid) {
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

  public OutpostServiceDetail eveKitVersion(Integer eveKitVersion) {
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

  public OutpostServiceDetail lifeStart(Long lifeStart) {
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

  public OutpostServiceDetail lifeEnd(Long lifeEnd) {
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

  public OutpostServiceDetail stationID(Long stationID) {
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

  public OutpostServiceDetail serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public OutpostServiceDetail ownerID(Long ownerID) {
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

  public OutpostServiceDetail minStanding(Double minStanding) {
    this.minStanding = minStanding;
    return this;
  }

   /**
   * Get minStanding
   * @return minStanding
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMinStanding() {
    return minStanding;
  }

  public void setMinStanding(Double minStanding) {
    this.minStanding = minStanding;
  }

  public OutpostServiceDetail surchargePerBadStanding(BigDecimal surchargePerBadStanding) {
    this.surchargePerBadStanding = surchargePerBadStanding;
    return this;
  }

   /**
   * Get surchargePerBadStanding
   * @return surchargePerBadStanding
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getSurchargePerBadStanding() {
    return surchargePerBadStanding;
  }

  public void setSurchargePerBadStanding(BigDecimal surchargePerBadStanding) {
    this.surchargePerBadStanding = surchargePerBadStanding;
  }

  public OutpostServiceDetail discountPerGoodStanding(BigDecimal discountPerGoodStanding) {
    this.discountPerGoodStanding = discountPerGoodStanding;
    return this;
  }

   /**
   * Get discountPerGoodStanding
   * @return discountPerGoodStanding
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getDiscountPerGoodStanding() {
    return discountPerGoodStanding;
  }

  public void setDiscountPerGoodStanding(BigDecimal discountPerGoodStanding) {
    this.discountPerGoodStanding = discountPerGoodStanding;
  }

  public OutpostServiceDetail lifeStartDate(DateTime lifeStartDate) {
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

  public OutpostServiceDetail lifeEndDate(DateTime lifeEndDate) {
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
    OutpostServiceDetail outpostServiceDetail = (OutpostServiceDetail) o;
    return Objects.equals(this.cid, outpostServiceDetail.cid) &&
        Objects.equals(this.eveKitVersion, outpostServiceDetail.eveKitVersion) &&
        Objects.equals(this.lifeStart, outpostServiceDetail.lifeStart) &&
        Objects.equals(this.lifeEnd, outpostServiceDetail.lifeEnd) &&
        Objects.equals(this.stationID, outpostServiceDetail.stationID) &&
        Objects.equals(this.serviceName, outpostServiceDetail.serviceName) &&
        Objects.equals(this.ownerID, outpostServiceDetail.ownerID) &&
        Objects.equals(this.minStanding, outpostServiceDetail.minStanding) &&
        Objects.equals(this.surchargePerBadStanding, outpostServiceDetail.surchargePerBadStanding) &&
        Objects.equals(this.discountPerGoodStanding, outpostServiceDetail.discountPerGoodStanding) &&
        Objects.equals(this.lifeStartDate, outpostServiceDetail.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, outpostServiceDetail.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, stationID, serviceName, ownerID, minStanding, surchargePerBadStanding, discountPerGoodStanding, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutpostServiceDetail {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    stationID: ").append(toIndentedString(stationID)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    ownerID: ").append(toIndentedString(ownerID)).append("\n");
    sb.append("    minStanding: ").append(toIndentedString(minStanding)).append("\n");
    sb.append("    surchargePerBadStanding: ").append(toIndentedString(surchargePerBadStanding)).append("\n");
    sb.append("    discountPerGoodStanding: ").append(toIndentedString(discountPerGoodStanding)).append("\n");
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

