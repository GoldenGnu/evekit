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
import java.io.Serializable;

/**
 * MailMessageRecipient
 */

public class MailMessageRecipient implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RECIPIENT_TYPE = "recipientType";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_TYPE)
  private String recipientType;

  public static final String SERIALIZED_NAME_RECIPIENT_I_D = "recipientID";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_I_D)
  private Integer recipientID;

  public MailMessageRecipient recipientType(String recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * Get recipientType
   * @return recipientType
  **/
  @ApiModelProperty(value = "")
  public String getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(String recipientType) {
    this.recipientType = recipientType;
  }

  public MailMessageRecipient recipientID(Integer recipientID) {
    this.recipientID = recipientID;
    return this;
  }

   /**
   * Get recipientID
   * @return recipientID
  **/
  @ApiModelProperty(value = "")
  public Integer getRecipientID() {
    return recipientID;
  }

  public void setRecipientID(Integer recipientID) {
    this.recipientID = recipientID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailMessageRecipient mailMessageRecipient = (MailMessageRecipient) o;
    return Objects.equals(this.recipientType, mailMessageRecipient.recipientType) &&
        Objects.equals(this.recipientID, mailMessageRecipient.recipientID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientType, recipientID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailMessageRecipient {\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    recipientID: ").append(toIndentedString(recipientID)).append("\n");
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

