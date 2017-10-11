package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.ApiException;
import enterprises.orbital.evekit.client.ApiClient;
import enterprises.orbital.evekit.client.Configuration;
import enterprises.orbital.evekit.client.Pair;

import javax.ws.rs.core.GenericType;

import enterprises.orbital.evekit.client.model.MetaData;
import enterprises.orbital.evekit.client.model.ServiceError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MetaApi {
  private ApiClient apiClient;

  public MetaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get meta data value.  A value of null indicates key was not set on this object.
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param cid Model object ID (required)
   * @param key Meta-data key (required)
   * @return MetaData
   * @throws ApiException if fails to make API call
   */
  public MetaData getMetaDataValue(Integer accessKey, String accessCred, Long cid, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMetaDataValue");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMetaDataValue");
    }
    
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getMetaDataValue");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling getMetaDataValue");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/meta/meta/{cid}/{key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MetaData> localVarReturnType = new GenericType<MetaData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all meta data values for the given model object.
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param cid Model object ID (required)
   * @return List&lt;MetaData&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MetaData> getMetaDataValues(Integer accessKey, String accessCred, Long cid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMetaDataValues");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMetaDataValues");
    }
    
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling getMetaDataValues");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/meta/meta/{cid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MetaData>> localVarReturnType = new GenericType<List<MetaData>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete meta data value.
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param cid Model object ID (required)
   * @param key Meta-data key (required)
   * @throws ApiException if fails to make API call
   */
  public void removeMetaDataValue(Integer accessKey, String accessCred, Long cid, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling removeMetaDataValue");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling removeMetaDataValue");
    }
    
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling removeMetaDataValue");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling removeMetaDataValue");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/meta/meta/{cid}/{key}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete all meta data values for the given model object.
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param cid Model object ID (required)
   * @throws ApiException if fails to make API call
   */
  public void removeMetaDataValues(Integer accessKey, String accessCred, Long cid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling removeMetaDataValues");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling removeMetaDataValues");
    }
    
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling removeMetaDataValues");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/meta/meta/{cid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Set meta data value.  If a value already exists for this key, then it is silently over-written.  Null keys or values are not allowed.
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param cid Model object ID (required)
   * @param key Meta-data key (required)
   * @param value Meta-data value (required)
   * @throws ApiException if fails to make API call
   */
  public void setMetaDataValue(Integer accessKey, String accessCred, Long cid, String key, String value) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling setMetaDataValue");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling setMetaDataValue");
    }
    
    // verify the required parameter 'cid' is set
    if (cid == null) {
      throw new ApiException(400, "Missing the required parameter 'cid' when calling setMetaDataValue");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling setMetaDataValue");
    }
    
    // verify the required parameter 'value' is set
    if (value == null) {
      throw new ApiException(400, "Missing the required parameter 'value' when calling setMetaDataValue");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/meta/meta/{cid}/{key}/{value}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "cid" + "\\}", apiClient.escapeString(cid.toString()))
      .replaceAll("\\{" + "key" + "\\}", apiClient.escapeString(key.toString()))
      .replaceAll("\\{" + "value" + "\\}", apiClient.escapeString(value.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
