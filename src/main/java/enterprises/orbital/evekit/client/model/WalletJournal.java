/**
 * EveKit Model API Server
 * 
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package enterprises.orbital.evekit.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.joda.time.DateTime;


/**
 * Model data common properties
 */
@ApiModel(description = "Model data common properties")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T15:58:15.972+02:00")
public class WalletJournal   {
  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("accountKey")
  private Integer accountKey = null;

  @JsonProperty("refID")
  private Long refID = null;

  @JsonProperty("date")
  private Long date = null;

  @JsonProperty("refTypeID")
  private Integer refTypeID = null;

  @JsonProperty("ownerName1")
  private String ownerName1 = null;

  @JsonProperty("ownerID1")
  private Long ownerID1 = null;

  @JsonProperty("ownerName2")
  private String ownerName2 = null;

  @JsonProperty("ownerID2")
  private Long ownerID2 = null;

  @JsonProperty("argName1")
  private String argName1 = null;

  @JsonProperty("argID1")
  private Long argID1 = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("taxReceiverID")
  private Long taxReceiverID = null;

  @JsonProperty("taxAmount")
  private BigDecimal taxAmount = null;

  @JsonProperty("owner1TypeID")
  private Integer owner1TypeID = null;

  @JsonProperty("owner2TypeID")
  private Integer owner2TypeID = null;

  @JsonProperty("lifeStartDate")
  private DateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private DateTime lifeEndDate = null;

  @JsonProperty("dateDate")
  private DateTime dateDate = null;

  public WalletJournal cid(Long cid) {
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

  public WalletJournal eveKitVersion(Integer eveKitVersion) {
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

  public WalletJournal lifeStart(Long lifeStart) {
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

  public WalletJournal lifeEnd(Long lifeEnd) {
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

  public WalletJournal accountKey(Integer accountKey) {
    this.accountKey = accountKey;
    return this;
  }

   /**
   * Get accountKey
   * @return accountKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(Integer accountKey) {
    this.accountKey = accountKey;
  }

  public WalletJournal refID(Long refID) {
    this.refID = refID;
    return this;
  }

   /**
   * Get refID
   * @return refID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getRefID() {
    return refID;
  }

  public void setRefID(Long refID) {
    this.refID = refID;
  }

  public WalletJournal date(Long date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public WalletJournal refTypeID(Integer refTypeID) {
    this.refTypeID = refTypeID;
    return this;
  }

   /**
   * Get refTypeID
   * @return refTypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRefTypeID() {
    return refTypeID;
  }

  public void setRefTypeID(Integer refTypeID) {
    this.refTypeID = refTypeID;
  }

  public WalletJournal ownerName1(String ownerName1) {
    this.ownerName1 = ownerName1;
    return this;
  }

   /**
   * Get ownerName1
   * @return ownerName1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerName1() {
    return ownerName1;
  }

  public void setOwnerName1(String ownerName1) {
    this.ownerName1 = ownerName1;
  }

  public WalletJournal ownerID1(Long ownerID1) {
    this.ownerID1 = ownerID1;
    return this;
  }

   /**
   * Get ownerID1
   * @return ownerID1
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getOwnerID1() {
    return ownerID1;
  }

  public void setOwnerID1(Long ownerID1) {
    this.ownerID1 = ownerID1;
  }

  public WalletJournal ownerName2(String ownerName2) {
    this.ownerName2 = ownerName2;
    return this;
  }

   /**
   * Get ownerName2
   * @return ownerName2
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerName2() {
    return ownerName2;
  }

  public void setOwnerName2(String ownerName2) {
    this.ownerName2 = ownerName2;
  }

  public WalletJournal ownerID2(Long ownerID2) {
    this.ownerID2 = ownerID2;
    return this;
  }

   /**
   * Get ownerID2
   * @return ownerID2
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getOwnerID2() {
    return ownerID2;
  }

  public void setOwnerID2(Long ownerID2) {
    this.ownerID2 = ownerID2;
  }

  public WalletJournal argName1(String argName1) {
    this.argName1 = argName1;
    return this;
  }

   /**
   * Get argName1
   * @return argName1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getArgName1() {
    return argName1;
  }

  public void setArgName1(String argName1) {
    this.argName1 = argName1;
  }

  public WalletJournal argID1(Long argID1) {
    this.argID1 = argID1;
    return this;
  }

   /**
   * Get argID1
   * @return argID1
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getArgID1() {
    return argID1;
  }

  public void setArgID1(Long argID1) {
    this.argID1 = argID1;
  }

  public WalletJournal amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public WalletJournal balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public WalletJournal reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public WalletJournal taxReceiverID(Long taxReceiverID) {
    this.taxReceiverID = taxReceiverID;
    return this;
  }

   /**
   * Get taxReceiverID
   * @return taxReceiverID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTaxReceiverID() {
    return taxReceiverID;
  }

  public void setTaxReceiverID(Long taxReceiverID) {
    this.taxReceiverID = taxReceiverID;
  }

  public WalletJournal taxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public BigDecimal getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(BigDecimal taxAmount) {
    this.taxAmount = taxAmount;
  }

  public WalletJournal owner1TypeID(Integer owner1TypeID) {
    this.owner1TypeID = owner1TypeID;
    return this;
  }

   /**
   * Get owner1TypeID
   * @return owner1TypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOwner1TypeID() {
    return owner1TypeID;
  }

  public void setOwner1TypeID(Integer owner1TypeID) {
    this.owner1TypeID = owner1TypeID;
  }

  public WalletJournal owner2TypeID(Integer owner2TypeID) {
    this.owner2TypeID = owner2TypeID;
    return this;
  }

   /**
   * Get owner2TypeID
   * @return owner2TypeID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOwner2TypeID() {
    return owner2TypeID;
  }

  public void setOwner2TypeID(Integer owner2TypeID) {
    this.owner2TypeID = owner2TypeID;
  }

  public WalletJournal lifeStartDate(DateTime lifeStartDate) {
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

  public WalletJournal lifeEndDate(DateTime lifeEndDate) {
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

  public WalletJournal dateDate(DateTime dateDate) {
    this.dateDate = dateDate;
    return this;
  }

   /**
   * date Date
   * @return dateDate
  **/
  @ApiModelProperty(example = "null", value = "date Date")
  public DateTime getDateDate() {
    return dateDate;
  }

  public void setDateDate(DateTime dateDate) {
    this.dateDate = dateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletJournal walletJournal = (WalletJournal) o;
    return Objects.equals(this.cid, walletJournal.cid) &&
        Objects.equals(this.eveKitVersion, walletJournal.eveKitVersion) &&
        Objects.equals(this.lifeStart, walletJournal.lifeStart) &&
        Objects.equals(this.lifeEnd, walletJournal.lifeEnd) &&
        Objects.equals(this.accountKey, walletJournal.accountKey) &&
        Objects.equals(this.refID, walletJournal.refID) &&
        Objects.equals(this.date, walletJournal.date) &&
        Objects.equals(this.refTypeID, walletJournal.refTypeID) &&
        Objects.equals(this.ownerName1, walletJournal.ownerName1) &&
        Objects.equals(this.ownerID1, walletJournal.ownerID1) &&
        Objects.equals(this.ownerName2, walletJournal.ownerName2) &&
        Objects.equals(this.ownerID2, walletJournal.ownerID2) &&
        Objects.equals(this.argName1, walletJournal.argName1) &&
        Objects.equals(this.argID1, walletJournal.argID1) &&
        Objects.equals(this.amount, walletJournal.amount) &&
        Objects.equals(this.balance, walletJournal.balance) &&
        Objects.equals(this.reason, walletJournal.reason) &&
        Objects.equals(this.taxReceiverID, walletJournal.taxReceiverID) &&
        Objects.equals(this.taxAmount, walletJournal.taxAmount) &&
        Objects.equals(this.owner1TypeID, walletJournal.owner1TypeID) &&
        Objects.equals(this.owner2TypeID, walletJournal.owner2TypeID) &&
        Objects.equals(this.lifeStartDate, walletJournal.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, walletJournal.lifeEndDate) &&
        Objects.equals(this.dateDate, walletJournal.dateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, accountKey, refID, date, refTypeID, ownerName1, ownerID1, ownerName2, ownerID2, argName1, argID1, amount, balance, reason, taxReceiverID, taxAmount, owner1TypeID, owner2TypeID, lifeStartDate, lifeEndDate, dateDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletJournal {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
    sb.append("    refID: ").append(toIndentedString(refID)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    refTypeID: ").append(toIndentedString(refTypeID)).append("\n");
    sb.append("    ownerName1: ").append(toIndentedString(ownerName1)).append("\n");
    sb.append("    ownerID1: ").append(toIndentedString(ownerID1)).append("\n");
    sb.append("    ownerName2: ").append(toIndentedString(ownerName2)).append("\n");
    sb.append("    ownerID2: ").append(toIndentedString(ownerID2)).append("\n");
    sb.append("    argName1: ").append(toIndentedString(argName1)).append("\n");
    sb.append("    argID1: ").append(toIndentedString(argID1)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    taxReceiverID: ").append(toIndentedString(taxReceiverID)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    owner1TypeID: ").append(toIndentedString(owner1TypeID)).append("\n");
    sb.append("    owner2TypeID: ").append(toIndentedString(owner2TypeID)).append("\n");
    sb.append("    lifeStartDate: ").append(toIndentedString(lifeStartDate)).append("\n");
    sb.append("    lifeEndDate: ").append(toIndentedString(lifeEndDate)).append("\n");
    sb.append("    dateDate: ").append(toIndentedString(dateDate)).append("\n");
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

