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

public class ContractBid implements Serializable {
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

  public static final String SERIALIZED_NAME_BID_I_D = "bidID";
  @SerializedName(SERIALIZED_NAME_BID_I_D)
  private Integer bidID;

  public static final String SERIALIZED_NAME_CONTRACT_I_D = "contractID";
  @SerializedName(SERIALIZED_NAME_CONTRACT_I_D)
  private Integer contractID;

  public static final String SERIALIZED_NAME_BIDDER_I_D = "bidderID";
  @SerializedName(SERIALIZED_NAME_BIDDER_I_D)
  private Integer bidderID;

  public static final String SERIALIZED_NAME_DATE_BID = "dateBid";
  @SerializedName(SERIALIZED_NAME_DATE_BID)
  private Long dateBid;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_DATE_BID_DATE = "dateBidDate";
  @SerializedName(SERIALIZED_NAME_DATE_BID_DATE)
  private OffsetDateTime dateBidDate;

  public ContractBid cid(Long cid) {
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

  public ContractBid eveKitVersion(Integer eveKitVersion) {
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

  public ContractBid lifeStart(Long lifeStart) {
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

  public ContractBid lifeEnd(Long lifeEnd) {
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

  public ContractBid bidID(Integer bidID) {
    this.bidID = bidID;
    return this;
  }

   /**
   * Get bidID
   * @return bidID
  **/
  @ApiModelProperty(value = "")
  public Integer getBidID() {
    return bidID;
  }

  public void setBidID(Integer bidID) {
    this.bidID = bidID;
  }

  public ContractBid contractID(Integer contractID) {
    this.contractID = contractID;
    return this;
  }

   /**
   * Get contractID
   * @return contractID
  **/
  @ApiModelProperty(value = "")
  public Integer getContractID() {
    return contractID;
  }

  public void setContractID(Integer contractID) {
    this.contractID = contractID;
  }

  public ContractBid bidderID(Integer bidderID) {
    this.bidderID = bidderID;
    return this;
  }

   /**
   * Get bidderID
   * @return bidderID
  **/
  @ApiModelProperty(value = "")
  public Integer getBidderID() {
    return bidderID;
  }

  public void setBidderID(Integer bidderID) {
    this.bidderID = bidderID;
  }

  public ContractBid dateBid(Long dateBid) {
    this.dateBid = dateBid;
    return this;
  }

   /**
   * Get dateBid
   * @return dateBid
  **/
  @ApiModelProperty(value = "")
  public Long getDateBid() {
    return dateBid;
  }

  public void setDateBid(Long dateBid) {
    this.dateBid = dateBid;
  }

  public ContractBid amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public ContractBid lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public ContractBid lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public ContractBid dateBidDate(OffsetDateTime dateBidDate) {
    this.dateBidDate = dateBidDate;
    return this;
  }

   /**
   * dateBid Date
   * @return dateBidDate
  **/
  @ApiModelProperty(value = "dateBid Date")
  public OffsetDateTime getDateBidDate() {
    return dateBidDate;
  }

  public void setDateBidDate(OffsetDateTime dateBidDate) {
    this.dateBidDate = dateBidDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractBid contractBid = (ContractBid) o;
    return Objects.equals(this.cid, contractBid.cid) &&
        Objects.equals(this.eveKitVersion, contractBid.eveKitVersion) &&
        Objects.equals(this.lifeStart, contractBid.lifeStart) &&
        Objects.equals(this.lifeEnd, contractBid.lifeEnd) &&
        Objects.equals(this.bidID, contractBid.bidID) &&
        Objects.equals(this.contractID, contractBid.contractID) &&
        Objects.equals(this.bidderID, contractBid.bidderID) &&
        Objects.equals(this.dateBid, contractBid.dateBid) &&
        Objects.equals(this.amount, contractBid.amount) &&
        Objects.equals(this.lifeStartDate, contractBid.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, contractBid.lifeEndDate) &&
        Objects.equals(this.dateBidDate, contractBid.dateBidDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, bidID, contractID, bidderID, dateBid, amount, lifeStartDate, lifeEndDate, dateBidDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractBid {\n");
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    bidID: ").append(toIndentedString(bidID)).append("\n");
    sb.append("    contractID: ").append(toIndentedString(contractID)).append("\n");
    sb.append("    bidderID: ").append(toIndentedString(bidderID)).append("\n");
    sb.append("    dateBid: ").append(toIndentedString(dateBid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    dateBidDate: ").append(toIndentedString(dateBidDate)).append("\n");
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

