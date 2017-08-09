package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.invoker.ApiException;
import enterprises.orbital.evekit.client.invoker.ApiClient;
import enterprises.orbital.evekit.client.invoker.Configuration;
import enterprises.orbital.evekit.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import enterprises.orbital.evekit.client.model.ContainerLog;
import enterprises.orbital.evekit.client.model.ServiceError;
import enterprises.orbital.evekit.client.model.CorporationMedal;
import enterprises.orbital.evekit.client.model.CorporationSheet;
import enterprises.orbital.evekit.client.model.CorporationTitle;
import enterprises.orbital.evekit.client.model.CustomsOffice;
import enterprises.orbital.evekit.client.model.Division;
import enterprises.orbital.evekit.client.model.Facility;
import enterprises.orbital.evekit.client.model.Fuel;
import enterprises.orbital.evekit.client.model.CorporationMemberMedal;
import enterprises.orbital.evekit.client.model.MemberSecurity;
import enterprises.orbital.evekit.client.model.MemberSecurityLog;
import enterprises.orbital.evekit.client.model.MemberTracking;
import enterprises.orbital.evekit.client.model.OutpostServiceDetail;
import enterprises.orbital.evekit.client.model.Outpost;
import enterprises.orbital.evekit.client.model.Role;
import enterprises.orbital.evekit.client.model.SecurityRole;
import enterprises.orbital.evekit.client.model.SecurityTitle;
import enterprises.orbital.evekit.client.model.Shareholder;
import enterprises.orbital.evekit.client.model.StarbaseDetail;
import enterprises.orbital.evekit.client.model.Starbase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T15:58:15.972+02:00")
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
   * @param actorID Corporation container log actor ID selector (optional, default to { any: true })
   * @param actorName Corporation container log actor name selector (optional, default to { any: true })
   * @param flag Corporation container log flag selector (optional, default to { any: true })
   * @param itemID Corporation container log item ID selector (optional, default to { any: true })
   * @param itemTypeID Corporation container log item type ID selector (optional, default to { any: true })
   * @param locationID Corporation container log location ID selector (optional, default to { any: true })
   * @param newConfiguration Corporation container log new configuration selector (optional, default to { any: true })
   * @param oldConfiguration Corporation container log old configuration selector (optional, default to { any: true })
   * @param passwordType Corporation container log password type selector (optional, default to { any: true })
   * @param quantity Corporation container log quantity selector (optional, default to { any: true })
   * @param typeID Corporation container log type ID selector (optional, default to { any: true })
   * @return List<ContainerLog>
   * @throws ApiException if fails to make API call
   */
  public List<ContainerLog> getContainerLogs(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String logTime, String action, String actorID, String actorName, String flag, String itemID, String itemTypeID, String locationID, String newConfiguration, String oldConfiguration, String passwordType, String quantity, String typeID) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorID", actorID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "actorName", actorName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flag", flag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemID", itemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemTypeID", itemTypeID));
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
   * @return List<CorporationMedal>
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
   * @param allianceName Corporation alliance name selector (optional, default to { any: true })
   * @param ceoID Corporation CEO ID selector (optional, default to { any: true })
   * @param ceoName Corporation CEO name selector (optional, default to { any: true })
   * @param corporationID Corporation ID selector (optional, default to { any: true })
   * @param corporationName Corporation name selector (optional, default to { any: true })
   * @param description Corporation description selector (optional, default to { any: true })
   * @param logoColor1 Corporation first logo color selector (optional, default to { any: true })
   * @param logoColor2 Corporation second logo color selector (optional, default to { any: true })
   * @param logoColor3 Corporation third logo color selector (optional, default to { any: true })
   * @param logoGraphicID Corporation logo graphic ID selector (optional, default to { any: true })
   * @param logoShape1 Corporation first logo shape selector (optional, default to { any: true })
   * @param logoShape2 Corporation second logo shape selector (optional, default to { any: true })
   * @param logoShape3 Corporation third logo shape selector (optional, default to { any: true })
   * @param memberCount Corporation member count selector (optional, default to { any: true })
   * @param memberLimit Corporation member limit selector (optional, default to { any: true })
   * @param shares Corporation shares selector (optional, default to { any: true })
   * @param stationID Corporation station ID selector (optional, default to { any: true })
   * @param stationName Corporation station name selector (optional, default to { any: true })
   * @param taxRate Corporation tax rate selector (optional, default to { any: true })
   * @param ticker Corporation ticker selector (optional, default to { any: true })
   * @param url Corporation URL selector (optional, default to { any: true })
   * @return List<CorporationSheet>
   * @throws ApiException if fails to make API call
   */
  public List<CorporationSheet> getCorporationSheet(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String allianceID, String allianceName, String ceoID, String ceoName, String corporationID, String corporationName, String description, String logoColor1, String logoColor2, String logoColor3, String logoGraphicID, String logoShape1, String logoShape2, String logoShape3, String memberCount, String memberLimit, String shares, String stationID, String stationName, String taxRate, String ticker, String url) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allianceName", allianceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ceoID", ceoID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ceoName", ceoName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationID", corporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationName", corporationName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoColor1", logoColor1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoColor2", logoColor2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoColor3", logoColor3));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoGraphicID", logoGraphicID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoShape1", logoShape1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoShape2", logoShape2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoShape3", logoShape3));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberCount", memberCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "memberLimit", memberLimit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shares", shares));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationID", stationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationName", stationName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRate", taxRate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ticker", ticker));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "url", url));

    
    
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
   * @param grantableRoles Corporation title grantable roles selector (optional, default to { any: true })
   * @param grantableRolesAtBase Corporation title grantable roles at base selector (optional, default to { any: true })
   * @param grantableRolesAtHQ Corporation title grantable roles at HQ selector (optional, default to { any: true })
   * @param grantableRolesAtOther Corporation title grantable roles at other selector (optional, default to { any: true })
   * @param roles Corporation title roles selector (optional, default to { any: true })
   * @param rolesAtBase Corporation title roles at base selector (optional, default to { any: true })
   * @param rolesAtHQ Corporation title roles at HQ selector (optional, default to { any: true })
   * @param rolesAtOther Corporation title roles at other selector (optional, default to { any: true })
   * @return List<CorporationTitle>
   * @throws ApiException if fails to make API call
   */
  public List<CorporationTitle> getCorporationTitles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String titleID, String titleName, String grantableRoles, String grantableRolesAtBase, String grantableRolesAtHQ, String grantableRolesAtOther, String roles, String rolesAtBase, String rolesAtHQ, String rolesAtOther) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRoles", grantableRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRolesAtBase", grantableRolesAtBase));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRolesAtHQ", grantableRolesAtHQ));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRolesAtOther", grantableRolesAtOther));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roles", roles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rolesAtBase", rolesAtBase));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rolesAtHQ", rolesAtHQ));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rolesAtOther", rolesAtOther));

    
    
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
   * @param itemID Customs office item ID selector (optional, default to { any: true })
   * @param solarSystemID Customs office solar system ID selector (optional, default to { any: true })
   * @param solarSystemName Customs office solar system name selector (optional, default to { any: true })
   * @param reinforceHour Customs office reinforce hour selector (optional, default to { any: true })
   * @param allowAlliance Customs office allow alliance selector (optional, default to { any: true })
   * @param allowStandings Customs office allow standings selector (optional, default to { any: true })
   * @param standingLevel Customs office standing level selector (optional, default to { any: true })
   * @param taxRateAlliance Customs office tax rate alliance selector (optional, default to { any: true })
   * @param taxRateCorp Customs office tax rate corporation selector (optional, default to { any: true })
   * @param taxRateStandingHigh Customs office tax rate standing high selector (optional, default to { any: true })
   * @param taxRateStandingGood Customs office tax rate standing good selector (optional, default to { any: true })
   * @param taxRateStandingNeutral Customs office tax rate standing neutral selector (optional, default to { any: true })
   * @param taxRateStandingBad Customs office tax rate standing bad selector (optional, default to { any: true })
   * @param taxRateStandingHorrible Customs office tax rate standing horrible selector (optional, default to { any: true })
   * @return List<CustomsOffice>
   * @throws ApiException if fails to make API call
   */
  public List<CustomsOffice> getCustomsOffices(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String itemID, String solarSystemID, String solarSystemName, String reinforceHour, String allowAlliance, String allowStandings, String standingLevel, String taxRateAlliance, String taxRateCorp, String taxRateStandingHigh, String taxRateStandingGood, String taxRateStandingNeutral, String taxRateStandingBad, String taxRateStandingHorrible) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemID", itemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemName", solarSystemName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reinforceHour", reinforceHour));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowAlliance", allowAlliance));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowStandings", allowStandings));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standingLevel", standingLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateAlliance", taxRateAlliance));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateCorp", taxRateCorp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingHigh", taxRateStandingHigh));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingGood", taxRateStandingGood));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingNeutral", taxRateStandingNeutral));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingBad", taxRateStandingBad));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxRateStandingHorrible", taxRateStandingHorrible));

    
    
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
   * @param accountKey Division account key selector (optional, default to { any: true })
   * @param description Division description selector (optional, default to { any: true })
   * @return List<Division>
   * @throws ApiException if fails to make API call
   */
  public List<Division> getDivisions(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String wallet, String accountKey, String description) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountKey", accountKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));

    
    
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
   * @param typeName Facility type name selector (optional, default to { any: true })
   * @param solarSystemID Facility solar system ID selector (optional, default to { any: true })
   * @param solarSystemName Facility solar system name selector (optional, default to { any: true })
   * @param regionID Facility region ID selector (optional, default to { any: true })
   * @param regionName Facility region name selector (optional, default to { any: true })
   * @param starbaseModifier Facility starbase modifier selector (optional, default to { any: true })
   * @param tax Facility tax selector (optional, default to { any: true })
   * @return List<Facility>
   * @throws ApiException if fails to make API call
   */
  public List<Facility> getFacilities(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String facilityID, String typeID, String typeName, String solarSystemID, String solarSystemName, String regionID, String regionName, String starbaseModifier, String tax) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeName", typeName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemName", solarSystemName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "regionID", regionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "regionName", regionName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "starbaseModifier", starbaseModifier));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tax", tax));

    
    
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
   * @param itemID Fuel item ID selector (optional, default to { any: true })
   * @param typeID Fuel type ID selector (optional, default to { any: true })
   * @param quantity Fuel quantity selector (optional, default to { any: true })
   * @return List<Fuel>
   * @throws ApiException if fails to make API call
   */
  public List<Fuel> getFuel(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String itemID, String typeID, String quantity) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemID", itemID));
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
   * @return List<CorporationMemberMedal>
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
   * Get corporation member security settings
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param characterID Member security character ID selector (optional, default to { any: true })
   * @param name Member security character name selector (optional, default to { any: true })
   * @param grantableRoles Member security grantable roles selector (optional, default to { any: true })
   * @param grantableRolesAtBase Member security grantable roles at base selector (optional, default to { any: true })
   * @param grantableRolesAtHQ Member security grantable roles at HQ selector (optional, default to { any: true })
   * @param grantableRolesAtOther Member security grantable roles at other selector (optional, default to { any: true })
   * @param roles Member security roles selector (optional, default to { any: true })
   * @param rolesAtBase Member security roles at base selector (optional, default to { any: true })
   * @param rolesAtHQ Member security roles at HQ selector (optional, default to { any: true })
   * @param rolesAtOther Member security roles at other selector (optional, default to { any: true })
   * @param titles Member security titles selector (optional, default to { any: true })
   * @return List<MemberSecurity>
   * @throws ApiException if fails to make API call
   */
  public List<MemberSecurity> getMemberSecurity(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID, String name, String grantableRoles, String grantableRolesAtBase, String grantableRolesAtHQ, String grantableRolesAtOther, String roles, String rolesAtBase, String rolesAtHQ, String rolesAtOther, String titles) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMemberSecurity");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMemberSecurity");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/member_security".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRoles", grantableRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRolesAtBase", grantableRolesAtBase));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRolesAtHQ", grantableRolesAtHQ));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRolesAtOther", grantableRolesAtOther));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roles", roles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rolesAtBase", rolesAtBase));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rolesAtHQ", rolesAtHQ));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rolesAtOther", rolesAtOther));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "titles", titles));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MemberSecurity>> localVarReturnType = new GenericType<List<MemberSecurity>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation member security log entries
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param changeTime Member security log change time selector (optional, default to { any: true })
   * @param changedCharacterID Member security log changed character ID selector (optional, default to { any: true })
   * @param changedCharacterName Member security log changed character name selector (optional, default to { any: true })
   * @param issuerID Member security log issuer ID selector (optional, default to { any: true })
   * @param issuerName Member security log issuer name selector (optional, default to { any: true })
   * @param roleLocationType Member security log role location type selector (optional, default to { any: true })
   * @param oldRoles Member security log old roles selector (optional, default to { any: true })
   * @param newRoles Member security log new roles selector (optional, default to { any: true })
   * @return List<MemberSecurityLog>
   * @throws ApiException if fails to make API call
   */
  public List<MemberSecurityLog> getMemberSecurityLog(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String changeTime, String changedCharacterID, String changedCharacterName, String issuerID, String issuerName, String roleLocationType, String oldRoles, String newRoles) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMemberSecurityLog");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMemberSecurityLog");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/member_security_log".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "changeTime", changeTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "changedCharacterID", changedCharacterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "changedCharacterName", changedCharacterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issuerID", issuerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issuerName", issuerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleLocationType", roleLocationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "oldRoles", oldRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newRoles", newRoles));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MemberSecurityLog>> localVarReturnType = new GenericType<List<MemberSecurityLog>>() {};
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
   * @param base Member base selector (optional, default to { any: true })
   * @param baseID Member base ID selector (optional, default to { any: true })
   * @param grantableRoles Member grantable roles selector (optional, default to { any: true })
   * @param location Member location selector (optional, default to { any: true })
   * @param locationID Member location ID selector (optional, default to { any: true })
   * @param logoffDateTime Member logoff time selector (optional, default to { any: true })
   * @param logonDateTime Member logon time selector (optional, default to { any: true })
   * @param name Member name selector (optional, default to { any: true })
   * @param roles Member roles selector (optional, default to { any: true })
   * @param shipType Member ship type selector (optional, default to { any: true })
   * @param shipTypeID Member ship type ID selector (optional, default to { any: true })
   * @param startDateTime Member start time selector (optional, default to { any: true })
   * @param title Member title selector (optional, default to { any: true })
   * @return List<MemberTracking>
   * @throws ApiException if fails to make API call
   */
  public List<MemberTracking> getMemberTracking(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID, String base, String baseID, String grantableRoles, String location, String locationID, String logoffDateTime, String logonDateTime, String name, String roles, String shipType, String shipTypeID, String startDateTime, String title) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "base", base));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseID", baseID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "grantableRoles", grantableRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "location", location));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logoffDateTime", logoffDateTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logonDateTime", logonDateTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roles", roles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipType", shipType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipTypeID", shipTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDateTime", startDateTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));

    
    
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
   * Get corporation outpost service detail
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param stationID Outpost service detail station ID selector (optional, default to { any: true })
   * @param serviceName Outpost service detail service name selector (optional, default to { any: true })
   * @param ownerID Outpost service owner ID selector (optional, default to { any: true })
   * @param minStanding Outpost service minimum standing selector (optional, default to { any: true })
   * @param surchargePerBadStanding Outpost service surcharge per bad standing selector (optional, default to { any: true })
   * @param discountPerGoodStanding Outpost service discount per good standing selector (optional, default to { any: true })
   * @return List<OutpostServiceDetail>
   * @throws ApiException if fails to make API call
   */
  public List<OutpostServiceDetail> getOutpostServiceDetails(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String stationID, String serviceName, String ownerID, String minStanding, String surchargePerBadStanding, String discountPerGoodStanding) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getOutpostServiceDetails");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getOutpostServiceDetails");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/outpost_service_detail".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationID", stationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "serviceName", serviceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerID", ownerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minStanding", minStanding));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "surchargePerBadStanding", surchargePerBadStanding));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "discountPerGoodStanding", discountPerGoodStanding));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<OutpostServiceDetail>> localVarReturnType = new GenericType<List<OutpostServiceDetail>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation outposts
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param stationID Outpost station ID selector (optional, default to { any: true })
   * @param ownerID Outpost owner ID selector (optional, default to { any: true })
   * @param stationName Outpost station name selector (optional, default to { any: true })
   * @param solarSystemID Outpost solar system ID selector (optional, default to { any: true })
   * @param dockingCostPerShipVolume Outpost docking cost per ship volume selector (optional, default to { any: true })
   * @param officeRentalCost Outpost office rental cost selector (optional, default to { any: true })
   * @param stationTypeID Outpost station type ID selector (optional, default to { any: true })
   * @param reprocessingEfficiency Outpost reprocessing efficiency selector (optional, default to { any: true })
   * @param reprocessingStationTake Outpost reprocessing station take selector (optional, default to { any: true })
   * @param standingOwnerID Outpost standing owner ID selector (optional, default to { any: true })
   * @param x Outpost x coordinate selector (optional, default to { any: true })
   * @param y Outpost y coordinate selector (optional, default to { any: true })
   * @param z Outpost z coordinate selector (optional, default to { any: true })
   * @return List<Outpost>
   * @throws ApiException if fails to make API call
   */
  public List<Outpost> getOutposts(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String stationID, String ownerID, String stationName, String solarSystemID, String dockingCostPerShipVolume, String officeRentalCost, String stationTypeID, String reprocessingEfficiency, String reprocessingStationTake, String standingOwnerID, String x, String y, String z) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getOutposts");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getOutposts");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/outpost".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationID", stationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerID", ownerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationName", stationName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dockingCostPerShipVolume", dockingCostPerShipVolume));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "officeRentalCost", officeRentalCost));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationTypeID", stationTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reprocessingEfficiency", reprocessingEfficiency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reprocessingStationTake", reprocessingStationTake));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standingOwnerID", standingOwnerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "x", x));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "y", y));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "z", z));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Outpost>> localVarReturnType = new GenericType<List<Outpost>>() {};
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
   * @param roleID Corporation tile role ID selector (optional, default to { any: true })
   * @param roleDescription Corporation title role description selector (optional, default to { any: true })
   * @param roleName Corporation title role name selector (optional, default to { any: true })
   * @return List<Role>
   * @throws ApiException if fails to make API call
   */
  public List<Role> getRoles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String roleID, String roleDescription, String roleName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getRoles");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getRoles");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/role".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleID", roleID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleDescription", roleDescription));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleName", roleName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Role>> localVarReturnType = new GenericType<List<Role>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation security roles
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param roleID Security role ID selector (optional, default to { any: true })
   * @param roleName Security role name selector (optional, default to { any: true })
   * @return List<SecurityRole>
   * @throws ApiException if fails to make API call
   */
  public List<SecurityRole> getSecurityRoles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String roleID, String roleName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getSecurityRoles");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getSecurityRoles");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/security_role".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleID", roleID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleName", roleName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<SecurityRole>> localVarReturnType = new GenericType<List<SecurityRole>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get corporation security titles
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param titleID Security title ID selector (optional, default to { any: true })
   * @param titleName Security title name selector (optional, default to { any: true })
   * @return List<SecurityTitle>
   * @throws ApiException if fails to make API call
   */
  public List<SecurityTitle> getSecurityTitles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String titleID, String titleName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getSecurityTitles");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getSecurityTitles");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/security_title".replaceAll("\\{format\\}","json");

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

    GenericType<List<SecurityTitle>> localVarReturnType = new GenericType<List<SecurityTitle>>() {};
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
   * @param isCorporation Shareholder is corporation selector (optional, default to { any: true })
   * @param shareholderCorporationID Shareholder corporation ID selector (optional, default to { any: true })
   * @param shareholderCorporationName Shareholder corporation name selector (optional, default to { any: true })
   * @param shareholderName Shareholder name selector (optional, default to { any: true })
   * @param shares Shareholder shares selector (optional, default to { any: true })
   * @return List<Shareholder>
   * @throws ApiException if fails to make API call
   */
  public List<Shareholder> getShareholders(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String shareholderID, String isCorporation, String shareholderCorporationID, String shareholderCorporationName, String shareholderName, String shares) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCorporation", isCorporation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shareholderCorporationID", shareholderCorporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shareholderCorporationName", shareholderCorporationName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shareholderName", shareholderName));
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
   * Get corporation starbase details
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param itemID Starbase item ID selector (optional, default to { any: true })
   * @param state Starbase details state selector (optional, default to { any: true })
   * @param stateTimestamp Starbase details state timestamp selector (optional, default to { any: true })
   * @param onlineTimestamp Starbase details online timestamp selector (optional, default to { any: true })
   * @param usageFlags Starbase details usage flags selector (optional, default to { any: true })
   * @param deployFlags Starbase details deploy flags selector (optional, default to { any: true })
   * @param allowAllianceMembers Starbase details allow alliance members enabled selector (optional, default to { any: true })
   * @param allowCorporationMembers Starbase details allow corporation members enabled selector (optional, default to { any: true })
   * @param useStandingsFrom Starbase details standings from selector (optional, default to { any: true })
   * @param onAggressionEnabled Starbase details on aggression enabled selector (optional, default to { any: true })
   * @param onAggressionStanding Starbase details standing for aggression selector (optional, default to { any: true })
   * @param onCorporationWarEnabled Starbase details on corporation war enabled selector (optional, default to { any: true })
   * @param onCorporationWarStanding Starbase details standing for corporation war selector (optional, default to { any: true })
   * @param onStandingDropEnabled Starbase details on standing drop enabled selector (optional, default to { any: true })
   * @param onStandingDropStanding Starbase details standing for standing drop selector (optional, default to { any: true })
   * @param onStatusDropEnabled Starbase details on status drop enabled selector (optional, default to { any: true })
   * @param onStatusDropStanding Starbase details standing for status drop selector (optional, default to { any: true })
   * @return List<StarbaseDetail>
   * @throws ApiException if fails to make API call
   */
  public List<StarbaseDetail> getStarbaseDetails(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String itemID, String state, String stateTimestamp, String onlineTimestamp, String usageFlags, String deployFlags, String allowAllianceMembers, String allowCorporationMembers, String useStandingsFrom, String onAggressionEnabled, String onAggressionStanding, String onCorporationWarEnabled, String onCorporationWarStanding, String onStandingDropEnabled, String onStandingDropStanding, String onStatusDropEnabled, String onStatusDropStanding) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getStarbaseDetails");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getStarbaseDetails");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/corp/starbase_detail".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemID", itemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stateTimestamp", stateTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlineTimestamp", onlineTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usageFlags", usageFlags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "deployFlags", deployFlags));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowAllianceMembers", allowAllianceMembers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allowCorporationMembers", allowCorporationMembers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "useStandingsFrom", useStandingsFrom));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onAggressionEnabled", onAggressionEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onAggressionStanding", onAggressionStanding));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onCorporationWarEnabled", onCorporationWarEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onCorporationWarStanding", onCorporationWarStanding));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onStandingDropEnabled", onStandingDropEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onStandingDropStanding", onStandingDropStanding));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onStatusDropEnabled", onStatusDropEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onStatusDropStanding", onStatusDropStanding));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<StarbaseDetail>> localVarReturnType = new GenericType<List<StarbaseDetail>>() {};
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
   * @param itemID Starbase item ID selector (optional, default to { any: true })
   * @param locationID Starbase location ID selector (optional, default to { any: true })
   * @param moonID Starbase moon ID selector (optional, default to { any: true })
   * @param onlineTimestamp Starbase online timestamp selector (optional, default to { any: true })
   * @param state Starbase state selector (optional, default to { any: true })
   * @param stateTimestamp Starbase state timestamp selector (optional, default to { any: true })
   * @param typeID Starbase type ID selector (optional, default to { any: true })
   * @param standingOwnerID Starbase standing owner ID selector (optional, default to { any: true })
   * @return List<Starbase>
   * @throws ApiException if fails to make API call
   */
  public List<Starbase> getStarbases(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String itemID, String locationID, String moonID, String onlineTimestamp, String state, String stateTimestamp, String typeID, String standingOwnerID) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemID", itemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "moonID", moonID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlineTimestamp", onlineTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stateTimestamp", stateTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standingOwnerID", standingOwnerID));

    
    
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
}
