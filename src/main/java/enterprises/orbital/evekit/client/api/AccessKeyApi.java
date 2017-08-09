package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.invoker.ApiException;
import enterprises.orbital.evekit.client.invoker.ApiClient;
import enterprises.orbital.evekit.client.invoker.Configuration;
import enterprises.orbital.evekit.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import enterprises.orbital.evekit.client.model.ServiceError;
import enterprises.orbital.evekit.client.model.KeyInfo;
import enterprises.orbital.evekit.client.model.MaskList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T15:58:15.972+02:00")
public class AccessKeyApi {
  private ApiClient apiClient;

  public AccessKeyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccessKeyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get information about an access key
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @return KeyInfo
   * @throws ApiException if fails to make API call
   */
  public KeyInfo getKeyInfo(Integer accessKey, String accessCred) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getKeyInfo");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getKeyInfo");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/accesskey/key_info".replaceAll("\\{format\\}","json");

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

    GenericType<KeyInfo> localVarReturnType = new GenericType<KeyInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get access key mask list constants
   * 
   * @return MaskList
   * @throws ApiException if fails to make API call
   */
  public MaskList getMaskList() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ws/v1/accesskey/mask_list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MaskList> localVarReturnType = new GenericType<MaskList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
