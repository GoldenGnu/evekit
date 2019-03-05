package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.ApiException;
import enterprises.orbital.evekit.client.ApiClient;
import enterprises.orbital.evekit.client.Configuration;
import enterprises.orbital.evekit.client.Pair;

import javax.ws.rs.core.GenericType;

import enterprises.orbital.evekit.client.model.ContainerLog;
import enterprises.orbital.evekit.client.model.CorporationMedal;
import enterprises.orbital.evekit.client.model.CorporationMemberMedal;
import enterprises.orbital.evekit.client.model.CorporationSheet;
import enterprises.orbital.evekit.client.model.CorporationTitle;
import enterprises.orbital.evekit.client.model.CorporationTitleRole;
import enterprises.orbital.evekit.client.model.CustomsOffice;
import enterprises.orbital.evekit.client.model.Division;
import enterprises.orbital.evekit.client.model.Facility;
import enterprises.orbital.evekit.client.model.Fuel;
import enterprises.orbital.evekit.client.model.Member;
import enterprises.orbital.evekit.client.model.MemberLimit;
import enterprises.orbital.evekit.client.model.MemberRole;
import enterprises.orbital.evekit.client.model.MemberRoleHistory;
import enterprises.orbital.evekit.client.model.MemberTitle;
import enterprises.orbital.evekit.client.model.MemberTracking;
import enterprises.orbital.evekit.client.model.MiningExtraction;
import enterprises.orbital.evekit.client.model.MiningObservation;
import enterprises.orbital.evekit.client.model.MiningObserver;
import enterprises.orbital.evekit.client.model.ServiceError;
import enterprises.orbital.evekit.client.model.Shareholder;
import enterprises.orbital.evekit.client.model.Starbase;
import enterprises.orbital.evekit.client.model.Structure;
import enterprises.orbital.evekit.client.model.StructureService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CorporationApi {
  private ApiClient apiClient;

  public CorporationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CorporationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get container log records
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param logTime Corporation container log time selector (optional, default to { any: true })
   * @param action Corporation container log action selector (optional, default to { any: true })
   * @param characterID Corporation container log character ID selector (optional, default to { any: true })
   * @param locationFlag Corporation container log location flag selector (optional, default to { any: true })
   * @param containerID Corporation container log container ID selector (optional, default to { any: true })
   * @param containerTypeID Corporation container log container type ID selector (optional, default to { any: true })
   * @param locationID Corporation container log location ID selector (optional, default to { any: true })
   * @param newConfiguration Corporation container log new configuration selector (optional, default to { any: true })
   * @param oldConfiguration Corporation container log old configuration selector (optional, default to { any: true })
   * @param passwordType Corporation container log password type selector (optional, default to { any: true })
   * @param quantity Corporation container log quantity selector (optional, default to { any: true })
   * @param typeID Corporation container log type ID selector (optional, default to { any: true })
   * @return List&lt;ContainerLog&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ContainerLog> getContainerLogs(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String logTime, String action, String characterID, String locationFlag, String containerID, String containerTypeID, String locationID, String newConfiguration, String oldConfiguration, String passwordType, String quantity, String typeID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getContainerLogs");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getContainerLogs");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/container_log".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logTime", logTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "action", action));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationFlag", locationFlag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "containerID", containerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "containerTypeID", containerTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newConfiguration", newConfiguration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oldConfiguration", oldConfiguration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "passwordType", passwordType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ContainerLog>> localVarReturnType = new GenericType<List<ContainerLog>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation medals
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param medalID Corporation medal ID selector (optional, default to { any: true })
   * @param description Corporation medal description selector (optional, default to { any: true })
   * @param title Corporation medal title selector (optional, default to { any: true })
   * @param created Corporation medal created date selector (optional, default to { any: true })
   * @param creatorID Corporation medal creator ID selector (optional, default to { any: true })
   * @return List&lt;CorporationMedal&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CorporationMedal> getCorporationMedals(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String medalID, String description, String title, String created, String creatorID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCorporationMedals");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCorporationMedals");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/medal".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "medalID", medalID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "creatorID", creatorID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CorporationMedal>> localVarReturnType = new GenericType<List<CorporationMedal>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation sheet
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param allianceID Corporation alliance ID selector (optional, default to { any: true })
   * @param ceoID Corporation CEO ID selector (optional, default to { any: true })
   * @param corporationID Corporation ID selector (optional, default to { any: true })
   * @param corporationName Corporation name selector (optional, default to { any: true })
   * @param description Corporation description selector (optional, default to { any: true })
   * @param memberCount Corporation member count selector (optional, default to { any: true })
   * @param shares Corporation shares selector (optional, default to { any: true })
   * @param stationID Corporation station ID selector (optional, default to { any: true })
   * @param taxRate Corporation tax rate selector (optional, default to { any: true })
   * @param ticker Corporation ticker selector (optional, default to { any: true })
   * @param url Corporation URL selector (optional, default to { any: true })
   * @param dateFounded Corporation founding date selector (optional, default to { any: true })
   * @param creatorID Corporation creator ID selector (optional, default to { any: true })
   * @param factionID Corporation faction ID selector (optional, default to { any: true })
   * @param px64x64 Corporation 64x64 image URL selector (optional, default to { any: true })
   * @param px128x128 Corporation 128x128 image URL selector (optional, default to { any: true })
   * @param px256x256 Corporation 256x256 image URL selector (optional, default to { any: true })
   * @param warEligible Corporation war eligible selector (optional, default to { any: true })
   * @return List&lt;CorporationSheet&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CorporationSheet> getCorporationSheet(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String allianceID, String ceoID, String corporationID, String corporationName, String description, String memberCount, String shares, String stationID, String taxRate, String ticker, String url, String dateFounded, String creatorID, String factionID, String px64x64, String px128x128, String px256x256, String warEligible) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCorporationSheet");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCorporationSheet");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/sheet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allianceID", allianceID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ceoID", ceoID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationID", corporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationName", corporationName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberCount", memberCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shares", shares));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationID", stationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRate", taxRate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ticker", ticker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateFounded", dateFounded));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "creatorID", creatorID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factionID", factionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "px64x64", px64x64));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "px128x128", px128x128));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "px256x256", px256x256));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "warEligible", warEligible));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CorporationSheet>> localVarReturnType = new GenericType<List<CorporationSheet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation title roles
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param titleID Corporation title role ID selector (optional, default to { any: true })
   * @param roleName Corporation title role name selector (optional, default to { any: true })
   * @param grantable Corporation title role grantable selector (optional, default to { any: true })
   * @param atHQ Corporation title role at HQ selector (optional, default to { any: true })
   * @param atBase Corporation title role at base selector (optional, default to { any: true })
   * @param atOther Corporation title role at other selector (optional, default to { any: true })
   * @return List&lt;CorporationTitleRole&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CorporationTitleRole> getCorporationTitleRoles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String titleID, String roleName, String grantable, String atHQ, String atBase, String atOther) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCorporationTitleRoles");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCorporationTitleRoles");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/title_role".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "titleID", titleID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleName", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantable", grantable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "atHQ", atHQ));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "atBase", atBase));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "atOther", atOther));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CorporationTitleRole>> localVarReturnType = new GenericType<List<CorporationTitleRole>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation titles
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param titleID Corporation title ID selector (optional, default to { any: true })
   * @param titleName Corporation title name selector (optional, default to { any: true })
   * @return List&lt;CorporationTitle&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CorporationTitle> getCorporationTitles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String titleID, String titleName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCorporationTitles");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCorporationTitles");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/title".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "titleID", titleID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "titleName", titleName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CorporationTitle>> localVarReturnType = new GenericType<List<CorporationTitle>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation customs offices
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param officeID Customs office ID selector (optional, default to { any: true })
   * @param solarSystemID Customs office solar system ID selector (optional, default to { any: true })
   * @param reinforceExitStart Customs office reinforce exit timer start selector (optional, default to { any: true })
   * @param reinforceExitEnd Customs office reinforce exit timer end selector (optional, default to { any: true })
   * @param allowAlliance Customs office allow alliance selector (optional, default to { any: true })
   * @param allowStandings Customs office allow standings selector (optional, default to { any: true })
   * @param standingLevel Customs office standing level selector (optional, default to { any: true })
   * @param taxRateAlliance Customs office tax rate alliance selector (optional, default to { any: true })
   * @param taxRateCorp Customs office tax rate corporation selector (optional, default to { any: true })
   * @param taxRateStandingExcellent Customs office tax rate standing excellent selector (optional, default to { any: true })
   * @param taxRateStandingGood Customs office tax rate standing good selector (optional, default to { any: true })
   * @param taxRateStandingNeutral Customs office tax rate standing neutral selector (optional, default to { any: true })
   * @param taxRateStandingBad Customs office tax rate standing bad selector (optional, default to { any: true })
   * @param taxRateStandingTerrible Customs office tax rate standing terrible selector (optional, default to { any: true })
   * @return List&lt;CustomsOffice&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CustomsOffice> getCustomsOffices(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String officeID, String solarSystemID, String reinforceExitStart, String reinforceExitEnd, String allowAlliance, String allowStandings, String standingLevel, String taxRateAlliance, String taxRateCorp, String taxRateStandingExcellent, String taxRateStandingGood, String taxRateStandingNeutral, String taxRateStandingBad, String taxRateStandingTerrible) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCustomsOffices");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCustomsOffices");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/customs_office".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "officeID", officeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reinforceExitStart", reinforceExitStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reinforceExitEnd", reinforceExitEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowAlliance", allowAlliance));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowStandings", allowStandings));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standingLevel", standingLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateAlliance", taxRateAlliance));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateCorp", taxRateCorp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingExcellent", taxRateStandingExcellent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingGood", taxRateStandingGood));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingNeutral", taxRateStandingNeutral));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingBad", taxRateStandingBad));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingTerrible", taxRateStandingTerrible));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CustomsOffice>> localVarReturnType = new GenericType<List<CustomsOffice>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation divisions
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param wallet Division wallet indicator selector (optional, default to { any: true })
   * @param division Division ID selector (optional, default to { any: true })
   * @param name Division name selector (optional, default to { any: true })
   * @return List&lt;Division&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Division> getDivisions(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String wallet, String division, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getDivisions");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getDivisions");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/division".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wallet", wallet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "division", division));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Division>> localVarReturnType = new GenericType<List<Division>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation facilities
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param facilityID Facility ID selector (optional, default to { any: true })
   * @param typeID Facility type ID selector (optional, default to { any: true })
   * @param solarSystemID Facility solar system ID selector (optional, default to { any: true })
   * @return List&lt;Facility&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Facility> getFacilities(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String facilityID, String typeID, String solarSystemID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFacilities");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFacilities");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/facility".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facilityID", facilityID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Facility>> localVarReturnType = new GenericType<List<Facility>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation starbase fuel levels
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param starbaseID Fuel starbase ID selector (optional, default to { any: true })
   * @param typeID Fuel type ID selector (optional, default to { any: true })
   * @param quantity Fuel quantity selector (optional, default to { any: true })
   * @return List&lt;Fuel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Fuel> getFuel(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String starbaseID, String typeID, String quantity) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFuel");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFuel");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/fuel".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "starbaseID", starbaseID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Fuel>> localVarReturnType = new GenericType<List<Fuel>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation member limit information
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param memberLimit Corporation member limit selector (optional, default to { any: true })
   * @return List&lt;MemberLimit&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MemberLimit> getMemberLimit(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String memberLimit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMemberLimit");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMemberLimit");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/member_limit".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberLimit", memberLimit));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MemberLimit>> localVarReturnType = new GenericType<List<MemberLimit>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get medals awarded to corporation members
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param medalID Member medal ID selector (optional, default to { any: true })
   * @param characterID Member medal character ID selector (optional, default to { any: true })
   * @param issued Member medal issued date selector (optional, default to { any: true })
   * @param issuerID Member medal issuer ID selector (optional, default to { any: true })
   * @param reason Member medal reason selector (optional, default to { any: true })
   * @param status Member medal status selector (optional, default to { any: true })
   * @return List&lt;CorporationMemberMedal&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CorporationMemberMedal> getMemberMedals(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String medalID, String characterID, String issued, String issuerID, String reason, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMemberMedals");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMemberMedals");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/member_medal".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "medalID", medalID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issued", issued));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issuerID", issuerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reason", reason));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CorporationMemberMedal>> localVarReturnType = new GenericType<List<CorporationMemberMedal>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation member role history entries
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param characterID Member role history character ID selector (optional, default to { any: true })
   * @param changedAt Member role history change time selector (optional, default to { any: true })
   * @param issuerID Member role history issuer ID selector (optional, default to { any: true })
   * @param roleType Member role history role type selector (optional, default to { any: true })
   * @param roleName Member role history roel name selector (optional, default to { any: true })
   * @param old Member role history is old selector (optional, default to { any: true })
   * @return List&lt;MemberRoleHistory&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MemberRoleHistory> getMemberRoleHistory(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID, String changedAt, String issuerID, String roleType, String roleName, String old) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMemberRoleHistory");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMemberRoleHistory");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/member_role_history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "changedAt", changedAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issuerID", issuerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleType", roleType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleName", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "old", old));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MemberRoleHistory>> localVarReturnType = new GenericType<List<MemberRoleHistory>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation member roles
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param characterID Member role character ID selector (optional, default to { any: true })
   * @param roleName Member role name selector (optional, default to { any: true })
   * @param grantable Member role grantable selector (optional, default to { any: true })
   * @param atHQ Member role at HQ selector (optional, default to { any: true })
   * @param atBase Member role at base selector (optional, default to { any: true })
   * @param atOther Member role at other selector (optional, default to { any: true })
   * @return List&lt;MemberRole&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MemberRole> getMemberRoles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID, String roleName, String grantable, String atHQ, String atBase, String atOther) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMemberRoles");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMemberRoles");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/member_role".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleName", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantable", grantable));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "atHQ", atHQ));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "atBase", atBase));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "atOther", atOther));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MemberRole>> localVarReturnType = new GenericType<List<MemberRole>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation member titles
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param characterID Corporation member title character ID selector (optional, default to { any: true })
   * @param titleID Corporation member title ID selector (optional, default to { any: true })
   * @return List&lt;MemberTitle&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MemberTitle> getMemberTitles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID, String titleID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMemberTitles");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMemberTitles");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/member_title".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "titleID", titleID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MemberTitle>> localVarReturnType = new GenericType<List<MemberTitle>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get member tracking information
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param characterID Member character ID selector (optional, default to { any: true })
   * @param baseID Member base ID selector (optional, default to { any: true })
   * @param locationID Member location ID selector (optional, default to { any: true })
   * @param logoffDateTime Member logoff time selector (optional, default to { any: true })
   * @param logonDateTime Member logon time selector (optional, default to { any: true })
   * @param shipTypeID Member ship type ID selector (optional, default to { any: true })
   * @param startDateTime Member start time selector (optional, default to { any: true })
   * @return List&lt;MemberTracking&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MemberTracking> getMemberTracking(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID, String baseID, String locationID, String logoffDateTime, String logonDateTime, String shipTypeID, String startDateTime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMemberTracking");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMemberTracking");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/member_tracking".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseID", baseID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoffDateTime", logoffDateTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logonDateTime", logonDateTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipTypeID", shipTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDateTime", startDateTime));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MemberTracking>> localVarReturnType = new GenericType<List<MemberTracking>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation members
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param characterID Corporation character ID selector (optional, default to { any: true })
   * @return List&lt;Member&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Member> getMembers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMembers");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMembers");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/members".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Member>> localVarReturnType = new GenericType<List<Member>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get mining extractions information
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param moonID Moon ID selector (optional, default to { any: true })
   * @param structureID Structure ID selector (optional, default to { any: true })
   * @param extractionStartTime Extraction start time selector (optional, default to { any: true })
   * @param chunkArrivalTime Chunk arrival time selector (optional, default to { any: true })
   * @param naturalDecayTime Natural decay time selector (optional, default to { any: true })
   * @return List&lt;MiningExtraction&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MiningExtraction> getMiningExtractions(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String moonID, String structureID, String extractionStartTime, String chunkArrivalTime, String naturalDecayTime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMiningExtractions");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMiningExtractions");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/mining_extractions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "moonID", moonID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "structureID", structureID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extractionStartTime", extractionStartTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "chunkArrivalTime", chunkArrivalTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "naturalDecayTime", naturalDecayTime));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MiningExtraction>> localVarReturnType = new GenericType<List<MiningExtraction>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get mining observations information
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param observerID Observer ID selector (optional, default to { any: true })
   * @param characterID Character ID selector (optional, default to { any: true })
   * @param typeID Type ID selector (optional, default to { any: true })
   * @param recordedCorporationID Recorded corporation ID selector (optional, default to { any: true })
   * @param quantity Quantity selector (optional, default to { any: true })
   * @param lastUpdated Last updated time selector (optional, default to { any: true })
   * @return List&lt;MiningObservation&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MiningObservation> getMiningObservations(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String observerID, String characterID, String typeID, String recordedCorporationID, String quantity, String lastUpdated) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMiningObservations");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMiningObservations");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/mining_observations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "observerID", observerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordedCorporationID", recordedCorporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastUpdated", lastUpdated));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MiningObservation>> localVarReturnType = new GenericType<List<MiningObservation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get mining observers information
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param observerID Observer ID selector (optional, default to { any: true })
   * @param observerType Observer type selector (optional, default to { any: true })
   * @param lastUpdated Last updated time selector (optional, default to { any: true })
   * @return List&lt;MiningObserver&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MiningObserver> getMiningObservers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String observerID, String observerType, String lastUpdated) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMiningObservers");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMiningObservers");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/mining_observers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "observerID", observerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "observerType", observerType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastUpdated", lastUpdated));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MiningObserver>> localVarReturnType = new GenericType<List<MiningObserver>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation shareholders
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param shareholderID Shareholder ID selector (optional, default to { any: true })
   * @param shareholderType Shareholder type selector (optional, default to { any: true })
   * @param shares Shareholder shares selector (optional, default to { any: true })
   * @return List&lt;Shareholder&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Shareholder> getShareholders(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String shareholderID, String shareholderType, String shares) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getShareholders");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getShareholders");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/shareholder".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shareholderID", shareholderID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shareholderType", shareholderType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shares", shares));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Shareholder>> localVarReturnType = new GenericType<List<Shareholder>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation starbases
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param starbaseID Starbase ID selector (optional, default to { any: true })
   * @param typeID Starbase type ID selector (optional, default to { any: true })
   * @param systemID Starbase system ID selector (optional, default to { any: true })
   * @param moonID Starbase moon ID selector (optional, default to { any: true })
   * @param state Starbase state selector (optional, default to { any: true })
   * @param unanchorAt Starbase unanchor at timestamp selector (optional, default to { any: true })
   * @param reinforcedUntil Starbase reinforced until timestamp selector (optional, default to { any: true })
   * @param onlinedSince Starbase onlined since timestamp selector (optional, default to { any: true })
   * @param fuelBayView Starbase fuel bay view selector (optional, default to { any: true })
   * @param fuelBayTake Starbase fuel bay take selector (optional, default to { any: true })
   * @param anchor Starbase anchor selector (optional, default to { any: true })
   * @param unanchor Starbase unanchor selector (optional, default to { any: true })
   * @param online Starbase online selector (optional, default to { any: true })
   * @param offline Starbase offline selector (optional, default to { any: true })
   * @param allowCorporationMembers Starbase allow corporation members selector (optional, default to { any: true })
   * @param allowAllianceMembers Starbase allow alliance members selector (optional, default to { any: true })
   * @param useAllianceStandings Starbase use alliance standings selector (optional, default to { any: true })
   * @param attackStandingThreshold Starbase attack standing threshold selector (optional, default to { any: true })
   * @param attackSecurityStatusThreshold Starbase attack security status threshold selector (optional, default to { any: true })
   * @param attackIfOtherSecurityStatusDropping Starbase attack if other security status dropping selector (optional, default to { any: true })
   * @param attackIfAtWar Starbase attack if at war selector (optional, default to { any: true })
   * @return List&lt;Starbase&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Starbase> getStarbases(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String starbaseID, String typeID, String systemID, String moonID, String state, String unanchorAt, String reinforcedUntil, String onlinedSince, String fuelBayView, String fuelBayTake, String anchor, String unanchor, String online, String offline, String allowCorporationMembers, String allowAllianceMembers, String useAllianceStandings, String attackStandingThreshold, String attackSecurityStatusThreshold, String attackIfOtherSecurityStatusDropping, String attackIfAtWar) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getStarbases");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getStarbases");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/starbase".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "starbaseID", starbaseID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "systemID", systemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "moonID", moonID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unanchorAt", unanchorAt));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reinforcedUntil", reinforcedUntil));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlinedSince", onlinedSince));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fuelBayView", fuelBayView));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fuelBayTake", fuelBayTake));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "anchor", anchor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unanchor", unanchor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "online", online));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offline", offline));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowCorporationMembers", allowCorporationMembers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowAllianceMembers", allowAllianceMembers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "useAllianceStandings", useAllianceStandings));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attackStandingThreshold", attackStandingThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attackSecurityStatusThreshold", attackSecurityStatusThreshold));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attackIfOtherSecurityStatusDropping", attackIfOtherSecurityStatusDropping));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attackIfAtWar", attackIfAtWar));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Starbase>> localVarReturnType = new GenericType<List<Starbase>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get structure services
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param structureID Structure ID selector (optional, default to { any: true })
   * @param name Structure service name selector (optional, default to { any: true })
   * @param state Structure service state selector (optional, default to { any: true })
   * @return List&lt;StructureService&gt;
   * @throws ApiException if fails to make API call
   */
  public List<StructureService> getStructureServices(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String structureID, String name, String state) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getStructureServices");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getStructureServices");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/structure_services".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "structureID", structureID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<StructureService>> localVarReturnType = new GenericType<List<StructureService>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get structures
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param structureID Structure ID selector (optional, default to { any: true })
   * @param corporationID Structure owning corporation ID selector (optional, default to { any: true })
   * @param fuelExpires Structure fuel expires time selector (optional, default to { any: true })
   * @param nextReinforceApply Structure next reinforce apply time selector (optional, default to { any: true })
   * @param nextReinforceHour Structure next reinforce hour selector (optional, default to { any: true })
   * @param nextReinforceWeekday Structure next reinforce weekday selector (optional, default to { any: true })
   * @param profileID Structure profile ID selector (optional, default to { any: true })
   * @param reinforceHour Structure reinforce hour selector (optional, default to { any: true })
   * @param reinforceWeekday Structure reinforce weekday selector (optional, default to { any: true })
   * @param state Structure state selector (optional, default to { any: true })
   * @param stateTimerEnd Structure state timer end selector (optional, default to { any: true })
   * @param stateTimerStart Structure state timer start selector (optional, default to { any: true })
   * @param systemID Structure system ID selector (optional, default to { any: true })
   * @param typeID Structure type ID selector (optional, default to { any: true })
   * @param unanchorsAt Strcucture &#39;unanchors at&#39; time selector (optional, default to { any: true })
   * @return List&lt;Structure&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Structure> getStructures(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String structureID, String corporationID, String fuelExpires, String nextReinforceApply, String nextReinforceHour, String nextReinforceWeekday, String profileID, String reinforceHour, String reinforceWeekday, String state, String stateTimerEnd, String stateTimerStart, String systemID, String typeID, String unanchorsAt) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getStructures");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getStructures");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/structures".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessKey", accessKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessCred", accessCred));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "at", at));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contid", contid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxresults", maxresults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "structureID", structureID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationID", corporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fuelExpires", fuelExpires));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nextReinforceApply", nextReinforceApply));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nextReinforceHour", nextReinforceHour));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "nextReinforceWeekday", nextReinforceWeekday));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "profileID", profileID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reinforceHour", reinforceHour));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reinforceWeekday", reinforceWeekday));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stateTimerEnd", stateTimerEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stateTimerStart", stateTimerStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "systemID", systemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unanchorsAt", unanchorsAt));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Structure>> localVarReturnType = new GenericType<List<Structure>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
