/*
 * EveKit Model API Server
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2.0.0
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

public class WalletTransaction implements Serializable {
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

  public static final String SERIALIZED_NAME_DIVISION = "division";
  @SerializedName(SERIALIZED_NAME_DIVISION)
  private Integer division;

  public static final String SERIALIZED_NAME_TRANSACTION_I_D = "transactionID";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_I_D)
  private Long transactionID;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Long date;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_TYPE_I_D = "typeID";
  @SerializedName(SERIALIZED_NAME_TYPE_I_D)
  private Integer typeID;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_CLIENT_I_D = "clientID";
  @SerializedName(SERIALIZED_NAME_CLIENT_I_D)
  private Integer clientID;

  public static final String SERIALIZED_NAME_LOCATION_I_D = "locationID";
  @SerializedName(SERIALIZED_NAME_LOCATION_I_D)
  private Long locationID;

  public static final String SERIALIZED_NAME_JOURNAL_TRANSACTION_I_D = "journalTransactionID";
  @SerializedName(SERIALIZED_NAME_JOURNAL_TRANSACTION_I_D)
  private Long journalTransactionID;

  public static final String SERIALIZED_NAME_BUY = "buy";
  @SerializedName(SERIALIZED_NAME_BUY)
  private Boolean buy = false;

  public static final String SERIALIZED_NAME_PERSONAL = "personal";
  @SerializedName(SERIALIZED_NAME_PERSONAL)
  private Boolean personal = false;

  public static final String SERIALIZED_NAME_LIFE_START_DATE = "lifeStartDate";
  @SerializedName(SERIALIZED_NAME_LIFE_START_DATE)
  private OffsetDateTime lifeStartDate;

  public static final String SERIALIZED_NAME_LIFE_END_DATE = "lifeEndDate";
  @SerializedName(SERIALIZED_NAME_LIFE_END_DATE)
  private OffsetDateTime lifeEndDate;

  public static final String SERIALIZED_NAME_DATE_DATE = "dateDate";
  @SerializedName(SERIALIZED_NAME_DATE_DATE)
  private OffsetDateTime dateDate;

  public static final String SERIALIZED_NAME_ACCOUNT_KEY = "accountKey";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_KEY)
  private Integer accountKey;

  public static final String SERIALIZED_NAME_STATION_I_D = "stationID";
  @SerializedName(SERIALIZED_NAME_STATION_I_D)
  private Long stationID;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private String transactionType;

  public static final String SERIALIZED_NAME_TRANSACTION_FOR = "transactionFor";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_FOR)
  private String transactionFor;

  public WalletTransaction cid(Long cid) {
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

  public WalletTransaction eveKitVersion(Integer eveKitVersion) {
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

  public WalletTransaction lifeStart(Long lifeStart) {
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

  public WalletTransaction lifeEnd(Long lifeEnd) {
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

  public WalletTransaction division(Integer division) {
    this.division = division;
    return this;
  }

   /**
   * Get division
   * @return division
  **/
  @ApiModelProperty(value = "")
  public Integer getDivision() {
    return division;
  }

  public void setDivision(Integer division) {
    this.division = division;
  }

  public WalletTransaction transactionID(Long transactionID) {
    this.transactionID = transactionID;
    return this;
  }

   /**
   * Get transactionID
   * @return transactionID
  **/
  @ApiModelProperty(value = "")
  public Long getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(Long transactionID) {
    this.transactionID = transactionID;
  }

  public WalletTransaction date(Long date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public WalletTransaction quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public WalletTransaction typeID(Integer typeID) {
    this.typeID = typeID;
    return this;
  }

   /**
   * Get typeID
   * @return typeID
  **/
  @ApiModelProperty(value = "")
  public Integer getTypeID() {
    return typeID;
  }

  public void setTypeID(Integer typeID) {
    this.typeID = typeID;
  }

  public WalletTransaction price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public WalletTransaction clientID(Integer clientID) {
    this.clientID = clientID;
    return this;
  }

   /**
   * Get clientID
   * @return clientID
  **/
  @ApiModelProperty(value = "")
  public Integer getClientID() {
    return clientID;
  }

  public void setClientID(Integer clientID) {
    this.clientID = clientID;
  }

  public WalletTransaction locationID(Long locationID) {
    this.locationID = locationID;
    return this;
  }

   /**
   * Get locationID
   * @return locationID
  **/
  @ApiModelProperty(value = "")
  public Long getLocationID() {
    return locationID;
  }

  public void setLocationID(Long locationID) {
    this.locationID = locationID;
  }

  public WalletTransaction journalTransactionID(Long journalTransactionID) {
    this.journalTransactionID = journalTransactionID;
    return this;
  }

   /**
   * Get journalTransactionID
   * @return journalTransactionID
  **/
  @ApiModelProperty(value = "")
  public Long getJournalTransactionID() {
    return journalTransactionID;
  }

  public void setJournalTransactionID(Long journalTransactionID) {
    this.journalTransactionID = journalTransactionID;
  }

  public WalletTransaction buy(Boolean buy) {
    this.buy = buy;
    return this;
  }

   /**
   * Get buy
   * @return buy
  **/
  @ApiModelProperty(value = "")
  public Boolean getBuy() {
    return buy;
  }

  public void setBuy(Boolean buy) {
    this.buy = buy;
  }

  public WalletTransaction personal(Boolean personal) {
    this.personal = personal;
    return this;
  }

   /**
   * Get personal
   * @return personal
  **/
  @ApiModelProperty(value = "")
  public Boolean getPersonal() {
    return personal;
  }

  public void setPersonal(Boolean personal) {
    this.personal = personal;
  }

  public WalletTransaction lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public WalletTransaction lifeEndDate(OffsetDateTime lifeEndDate) {
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

  public WalletTransaction dateDate(OffsetDateTime dateDate) {
    this.dateDate = dateDate;
    return this;
  }

   /**
   * date Date
   * @return dateDate
  **/
  @ApiModelProperty(value = "date Date")
  public OffsetDateTime getDateDate() {
    return dateDate;
  }

  public void setDateDate(OffsetDateTime dateDate) {
    this.dateDate = dateDate;
  }

  public WalletTransaction accountKey(Integer accountKey) {
    this.accountKey = accountKey;
    return this;
  }

   /**
   * *DEPRECATED* accountKey
   * @return accountKey
  **/
  @ApiModelProperty(value = "*DEPRECATED* accountKey")
  public Integer getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(Integer accountKey) {
    this.accountKey = accountKey;
  }

  public WalletTransaction stationID(Long stationID) {
    this.stationID = stationID;
    return this;
  }

   /**
   * *DEPRECATED* stationID
   * @return stationID
  **/
  @ApiModelProperty(value = "*DEPRECATED* stationID")
  public Long getStationID() {
    return stationID;
  }

  public void setStationID(Long stationID) {
    this.stationID = stationID;
  }

  public WalletTransaction transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * *DEPRECATED* transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "*DEPRECATED* transactionType")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public WalletTransaction transactionFor(String transactionFor) {
    this.transactionFor = transactionFor;
    return this;
  }

   /**
   * *DEPRECATED* transactionFor
   * @return transactionFor
  **/
  @ApiModelProperty(value = "*DEPRECATED* transactionFor")
  public String getTransactionFor() {
    return transactionFor;
  }

  public void setTransactionFor(String transactionFor) {
    this.transactionFor = transactionFor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransaction walletTransaction = (WalletTransaction) o;
    return Objects.equals(this.cid, walletTransaction.cid) &&
        Objects.equals(this.eveKitVersion, walletTransaction.eveKitVersion) &&
        Objects.equals(this.lifeStart, walletTransaction.lifeStart) &&
        Objects.equals(this.lifeEnd, walletTransaction.lifeEnd) &&
        Objects.equals(this.division, walletTransaction.division) &&
        Objects.equals(this.transactionID, walletTransaction.transactionID) &&
        Objects.equals(this.date, walletTransaction.date) &&
        Objects.equals(this.quantity, walletTransaction.quantity) &&
        Objects.equals(this.typeID, walletTransaction.typeID) &&
        Objects.equals(this.price, walletTransaction.price) &&
        Objects.equals(this.clientID, walletTransaction.clientID) &&
        Objects.equals(this.locationID, walletTransaction.locationID) &&
        Objects.equals(this.journalTransactionID, walletTransaction.journalTransactionID) &&
        Objects.equals(this.buy, walletTransaction.buy) &&
        Objects.equals(this.personal, walletTransaction.personal) &&
        Objects.equals(this.lifeStartDate, walletTransaction.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, walletTransaction.lifeEndDate) &&
        Objects.equals(this.dateDate, walletTransaction.dateDate) &&
        Objects.equals(this.accountKey, walletTransaction.accountKey) &&
        Objects.equals(this.stationID, walletTransaction.stationID) &&
        Objects.equals(this.transactionType, walletTransaction.transactionType) &&
        Objects.equals(this.transactionFor, walletTransaction.transactionFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, division, transactionID, date, quantity, typeID, price, clientID, locationID, journalTransactionID, buy, personal, lifeStartDate, lifeEndDate, dateDate, accountKey, stationID, transactionType, transactionFor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransaction {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    transactionID: ").append(toIndentedString(transactionID)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    typeID: ").append(toIndentedString(typeID)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    clientID: ").append(toIndentedString(clientID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    journalTransactionID: ").append(toIndentedString(journalTransactionID)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    personal: ").append(toIndentedString(personal)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    dateDate: ").append(toIndentedString(dateDate)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    stationID: ").append(toIndentedString(stationID)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    transactionFor: ").append(toIndentedString(transactionFor)).append("\n");
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

