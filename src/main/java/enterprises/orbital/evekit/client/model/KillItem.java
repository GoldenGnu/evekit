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

public class KillItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cid")
  private Long cid = null;

  @JsonProperty("eveKitVersion")
  private Integer eveKitVersion = null;

  @JsonProperty("lifeStart")
  private Long lifeStart = null;

  @JsonProperty("lifeEnd")
  private Long lifeEnd = null;

  @JsonProperty("killID")
  private Integer killID = null;

  @JsonProperty("typeID")
  private Integer typeID = null;

  @JsonProperty("flag")
  private Integer flag = null;

  @JsonProperty("qtyDestroyed")
  private Long qtyDestroyed = null;

  @JsonProperty("qtyDropped")
  private Long qtyDropped = null;

  @JsonProperty("singleton")
  private Integer singleton = null;

  @JsonProperty("sequence")
  private Integer sequence = null;

  @JsonProperty("containerSequence")
  private Integer containerSequence = null;

  @JsonProperty("lifeStartDate")
  private OffsetDateTime lifeStartDate = null;

  @JsonProperty("lifeEndDate")
  private OffsetDateTime lifeEndDate = null;

  public KillItem cid(Long cid) {
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

  public KillItem eveKitVersion(Integer eveKitVersion) {
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

  public KillItem lifeStart(Long lifeStart) {
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

  public KillItem lifeEnd(Long lifeEnd) {
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

  public KillItem killID(Integer killID) {
    this.killID = killID;
    return this;
  }

   /**
   * Get killID
   * @return killID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getKillID() {
    return killID;
  }

  public void setKillID(Integer killID) {
    this.killID = killID;
  }

  public KillItem typeID(Integer typeID) {
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

  public KillItem flag(Integer flag) {
    this.flag = flag;
    return this;
  }

   /**
   * Get flag
   * @return flag
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public KillItem qtyDestroyed(Long qtyDestroyed) {
    this.qtyDestroyed = qtyDestroyed;
    return this;
  }

   /**
   * Get qtyDestroyed
   * @return qtyDestroyed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getQtyDestroyed() {
    return qtyDestroyed;
  }

  public void setQtyDestroyed(Long qtyDestroyed) {
    this.qtyDestroyed = qtyDestroyed;
  }

  public KillItem qtyDropped(Long qtyDropped) {
    this.qtyDropped = qtyDropped;
    return this;
  }

   /**
   * Get qtyDropped
   * @return qtyDropped
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getQtyDropped() {
    return qtyDropped;
  }

  public void setQtyDropped(Long qtyDropped) {
    this.qtyDropped = qtyDropped;
  }

  public KillItem singleton(Integer singleton) {
    this.singleton = singleton;
    return this;
  }

   /**
   * Get singleton
   * @return singleton
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSingleton() {
    return singleton;
  }

  public void setSingleton(Integer singleton) {
    this.singleton = singleton;
  }

  public KillItem sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public KillItem containerSequence(Integer containerSequence) {
    this.containerSequence = containerSequence;
    return this;
  }

   /**
   * Get containerSequence
   * @return containerSequence
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContainerSequence() {
    return containerSequence;
  }

  public void setContainerSequence(Integer containerSequence) {
    this.containerSequence = containerSequence;
  }

  public KillItem lifeStartDate(OffsetDateTime lifeStartDate) {
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

  public KillItem lifeEndDate(OffsetDateTime lifeEndDate) {
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
    KillItem killItem = (KillItem) o;
    return Objects.equals(this.cid, killItem.cid) &&
        Objects.equals(this.eveKitVersion, killItem.eveKitVersion) &&
        Objects.equals(this.lifeStart, killItem.lifeStart) &&
        Objects.equals(this.lifeEnd, killItem.lifeEnd) &&
        Objects.equals(this.killID, killItem.killID) &&
        Objects.equals(this.typeID, killItem.typeID) &&
        Objects.equals(this.flag, killItem.flag) &&
        Objects.equals(this.qtyDestroyed, killItem.qtyDestroyed) &&
        Objects.equals(this.qtyDropped, killItem.qtyDropped) &&
        Objects.equals(this.singleton, killItem.singleton) &&
        Objects.equals(this.sequence, killItem.sequence) &&
        Objects.equals(this.containerSequence, killItem.containerSequence) &&
        Objects.equals(this.lifeStartDate, killItem.lifeStartDate) &&
        Objects.equals(this.lifeEndDate, killItem.lifeEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cid, eveKitVersion, lifeStart, lifeEnd, killID, typeID, flag, qtyDestroyed, qtyDropped, singleton, sequence, containerSequence, lifeStartDate, lifeEndDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KillItem {\n");
    
    sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
    sb.append("    eveKitVersion: ").append(toIndentedString(eveKitVersion)).append("\n");
    sb.append("    lifeStart: ").append(toIndentedString(lifeStart)).append("\n");
    sb.append("    lifeEnd: ").append(toIndentedString(lifeEnd)).append("\n");
    sb.append("    killID: ").append(toIndentedString(killID)).append("\n");
    sb.append("    typeID: ").append(toIndentedString(typeID)).append("\n");
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    qtyDestroyed: ").append(toIndentedString(qtyDestroyed)).append("\n");
    sb.append("    qtyDropped: ").append(toIndentedString(qtyDropped)).append("\n");
    sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    containerSequence: ").append(toIndentedString(containerSequence)).append("\n");
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

