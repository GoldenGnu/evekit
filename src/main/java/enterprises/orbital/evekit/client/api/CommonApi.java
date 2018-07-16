package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.ApiException;
import enterprises.orbital.evekit.client.ApiClient;
import enterprises.orbital.evekit.client.Configuration;
import enterprises.orbital.evekit.client.Pair;

import javax.ws.rs.core.GenericType;

import enterprises.orbital.evekit.client.model.AccountBalance;
import enterprises.orbital.evekit.client.model.Asset;
import enterprises.orbital.evekit.client.model.Blueprint;
import enterprises.orbital.evekit.client.model.Bookmark;
import enterprises.orbital.evekit.client.model.Contact;
import enterprises.orbital.evekit.client.model.ContactLabel;
import enterprises.orbital.evekit.client.model.Contract;
import enterprises.orbital.evekit.client.model.ContractBid;
import enterprises.orbital.evekit.client.model.ContractItem;
import enterprises.orbital.evekit.client.model.FacWarStats;
import enterprises.orbital.evekit.client.model.IndustryJob;
import enterprises.orbital.evekit.client.model.Kill;
import enterprises.orbital.evekit.client.model.KillAttacker;
import enterprises.orbital.evekit.client.model.KillItem;
import enterprises.orbital.evekit.client.model.KillVictim;
import enterprises.orbital.evekit.client.model.Location;
import enterprises.orbital.evekit.client.model.MarketOrder;
import enterprises.orbital.evekit.client.model.ServiceError;
import enterprises.orbital.evekit.client.model.Standing;
import enterprises.orbital.evekit.client.model.WalletJournal;
import enterprises.orbital.evekit.client.model.WalletTransaction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CommonApi {
  private ApiClient apiClient;

  public CommonApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CommonApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get account balance(s)
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param division Division selector (optional, default to { any: true })
   * @param balance Balance selector (optional, default to { any: true })
   * @return List&lt;AccountBalance&gt;
   * @throws ApiException if fails to make API call
   */
  public List<AccountBalance> getAccountBalance(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String division, String balance) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getAccountBalance");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getAccountBalance");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/account_balance".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "division", division));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "balance", balance));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<AccountBalance>> localVarReturnType = new GenericType<List<AccountBalance>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get assets
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param itemID Asset item ID selector (optional, default to { any: true })
   * @param locationID Asset location ID selector (optional, default to { any: true })
   * @param locationType Asset location type selector (optional, default to { any: true })
   * @param locationFlag Asset location flag selector (optional, default to { any: true })
   * @param typeID Asset type ID selector (optional, default to { any: true })
   * @param quantity Asset quantity selector (optional, default to { any: true })
   * @param singleton Asset is singleton selector (optional, default to { any: true })
   * @param blueprintType Asset blueprint type selector (optional, default to { any: true })
   * @param blueprintCopy Asset blueprint copy selector (optional, default to { any: true })
   * @return List&lt;Asset&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Asset> getAssets(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String itemID, String locationID, String locationType, String locationFlag, String typeID, String quantity, String singleton, String blueprintType, String blueprintCopy) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getAssets");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getAssets");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/asset".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationType", locationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationFlag", locationFlag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "singleton", singleton));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "blueprintType", blueprintType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "blueprintCopy", blueprintCopy));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Asset>> localVarReturnType = new GenericType<List<Asset>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get blueprints
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param itemID Blueprint item ID selector (optional, default to { any: true })
   * @param locationID Blueprint location ID selector (optional, default to { any: true })
   * @param locationFlag Blueprint location flag selector (optional, default to { any: true })
   * @param typeID Blueprint type ID selector (optional, default to { any: true })
   * @param quantity Blueprint quantity selector (optional, default to { any: true })
   * @param timeEfficiency Blueprint time efficiency selector (optional, default to { any: true })
   * @param materialEfficiency Blueprint material efficiency selector (optional, default to { any: true })
   * @param runs Blueprint runs selector (optional, default to { any: true })
   * @return List&lt;Blueprint&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Blueprint> getBlueprints(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String itemID, String locationID, String locationFlag, String typeID, String quantity, String timeEfficiency, String materialEfficiency, String runs) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getBlueprints");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getBlueprints");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/blueprint".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationFlag", locationFlag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeEfficiency", timeEfficiency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "materialEfficiency", materialEfficiency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "runs", runs));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Blueprint>> localVarReturnType = new GenericType<List<Blueprint>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get bookmarks
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param folderID Bookmark folder ID selector (optional, default to { any: true })
   * @param folderName Bookmark folder name selector (optional, default to { any: true })
   * @param folderCreatorID Bookmark folder creator ID selector (optional, default to { any: true })
   * @param bookmarkID Bookmark ID selector (optional, default to { any: true })
   * @param bookmarkCreatorID Bookmark creator ID selector (optional, default to { any: true })
   * @param created Bookmark created selector (optional, default to { any: true })
   * @param itemID Bookmark item ID selector (optional, default to { any: true })
   * @param typeID Bookmark type ID selector (optional, default to { any: true })
   * @param locationID Bookmark location ID selector (optional, default to { any: true })
   * @param x Bookmark x coordinate selector (optional, default to { any: true })
   * @param y Bookmark y coordinate selector (optional, default to { any: true })
   * @param z Bookmark z coordinate selector (optional, default to { any: true })
   * @param memo Bookmark memo selector (optional, default to { any: true })
   * @param note Bookmark note selector (optional, default to { any: true })
   * @return List&lt;Bookmark&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Bookmark> getBookmarks(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String folderID, String folderName, String folderCreatorID, String bookmarkID, String bookmarkCreatorID, String created, String itemID, String typeID, String locationID, String x, String y, String z, String memo, String note) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getBookmarks");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getBookmarks");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/bookmark".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folderID", folderID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folderName", folderName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "folderCreatorID", folderCreatorID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bookmarkID", bookmarkID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bookmarkCreatorID", bookmarkCreatorID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemID", itemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "x", x));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "y", y));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "z", z));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "memo", memo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "note", note));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Bookmark>> localVarReturnType = new GenericType<List<Bookmark>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get contact labels
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param list Contact list selector (optional, default to { any: true })
   * @param labelID Contact label ID selector (optional, default to { any: true })
   * @param name Contact label name selector (optional, default to { any: true })
   * @return List&lt;ContactLabel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ContactLabel> getContactLabels(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String list, String labelID, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getContactLabels");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getContactLabels");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/contact_label".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "list", list));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "labelID", labelID));
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

    GenericType<List<ContactLabel>> localVarReturnType = new GenericType<List<ContactLabel>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get contacts
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param list Contact list selector (optional, default to { any: true })
   * @param contactID Contact ID selector (optional, default to { any: true })
   * @param standing Contact standing selector (optional, default to { any: true })
   * @param contactType Contact type selector (optional, default to { any: true })
   * @param inWatchlist Contact in watch list selector (optional, default to { any: true })
   * @param isBlocked Contact is blocked selector (optional, default to { any: true })
   * @param labelID Contact label selector (optional, default to { any: true })
   * @return List&lt;Contact&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Contact> getContacts(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String list, String contactID, String standing, String contactType, String inWatchlist, String isBlocked, String labelID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getContacts");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getContacts");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/contact".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "list", list));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contactID", contactID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standing", standing));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contactType", contactType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inWatchlist", inWatchlist));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isBlocked", isBlocked));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "labelID", labelID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Contact>> localVarReturnType = new GenericType<List<Contact>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get contract bids
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param bidID Contract bid ID selector (optional, default to { any: true })
   * @param contractID Contract ID selector (optional, default to { any: true })
   * @param bidderID Contract bid bidder ID selector (optional, default to { any: true })
   * @param dateBid Contract bid date selector (optional, default to { any: true })
   * @param amount Contract bid amount selector (optional, default to { any: true })
   * @return List&lt;ContractBid&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ContractBid> getContractBids(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String bidID, String contractID, String bidderID, String dateBid, String amount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getContractBids");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getContractBids");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/contract_bid".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bidID", bidID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contractID", contractID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bidderID", bidderID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateBid", dateBid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ContractBid>> localVarReturnType = new GenericType<List<ContractBid>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get contract items
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param contractID Contract ID selector (optional, default to { any: true })
   * @param recordID Contract item record ID selector (optional, default to { any: true })
   * @param typeID Contract item type ID selector (optional, default to { any: true })
   * @param quantity Contract item quantity selector (optional, default to { any: true })
   * @param rawQuantity Contract item raw quantity selector (optional, default to { any: true })
   * @param singleton Contract item singleton selector (optional, default to { any: true })
   * @param included Contract item included selector (optional, default to { any: true })
   * @return List&lt;ContractItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ContractItem> getContractItems(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String contractID, String recordID, String typeID, String quantity, String rawQuantity, String singleton, String included) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getContractItems");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getContractItems");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/contract_item".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contractID", contractID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recordID", recordID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rawQuantity", rawQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "singleton", singleton));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "included", included));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ContractItem>> localVarReturnType = new GenericType<List<ContractItem>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get contracts
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param contractID Contract ID selector (optional, default to { any: true })
   * @param issuerID Contract issuer ID selector (optional, default to { any: true })
   * @param issuerCorpID Contract issuer corporation ID selector (optional, default to { any: true })
   * @param assigneeID Contract assignee ID selector (optional, default to { any: true })
   * @param acceptorID Contract acceptor ID selector (optional, default to { any: true })
   * @param startStationID Contract start station ID selector (optional, default to { any: true })
   * @param endStationID Contract end station ID selector (optional, default to { any: true })
   * @param type Contract type selector (optional, default to { any: true })
   * @param status Contract status selector (optional, default to { any: true })
   * @param title Contract title selector (optional, default to { any: true })
   * @param forCorp Contract for corporation selector (optional, default to { any: true })
   * @param availability Contract availability selector (optional, default to { any: true })
   * @param dateIssued Contract date issued selector (optional, default to { any: true })
   * @param dateExpired Contract date expired selector (optional, default to { any: true })
   * @param dateAccepted Contract date accepted selector (optional, default to { any: true })
   * @param numDays Contract duration (days) selector (optional, default to { any: true })
   * @param dateCompleted Contract date completed selector (optional, default to { any: true })
   * @param price Contract price selector (optional, default to { any: true })
   * @param reward Contract reward value selector (optional, default to { any: true })
   * @param collateral Contract collateral value selector (optional, default to { any: true })
   * @param buyout Contract buyout price selector (optional, default to { any: true })
   * @param volume Contract volume selector (optional, default to { any: true })
   * @return List&lt;Contract&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Contract> getContracts(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String contractID, String issuerID, String issuerCorpID, String assigneeID, String acceptorID, String startStationID, String endStationID, String type, String status, String title, String forCorp, String availability, String dateIssued, String dateExpired, String dateAccepted, String numDays, String dateCompleted, String price, String reward, String collateral, String buyout, String volume) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getContracts");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getContracts");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/contract".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contractID", contractID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issuerID", issuerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issuerCorpID", issuerCorpID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assigneeID", assigneeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "acceptorID", acceptorID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startStationID", startStationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endStationID", endStationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "forCorp", forCorp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "availability", availability));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateIssued", dateIssued));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateExpired", dateExpired));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateAccepted", dateAccepted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "numDays", numDays));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dateCompleted", dateCompleted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reward", reward));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateral", collateral));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "buyout", buyout));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "volume", volume));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Contract>> localVarReturnType = new GenericType<List<Contract>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get faction war statistics
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param currentRank Faction war statistics current rank selector (optional, default to { any: true })
   * @param enlisted Faction war statistics enlisted indicator selector (optional, default to { any: true })
   * @param factionID Faction war statistics faction ID selector (optional, default to { any: true })
   * @param highestRank Faction war statistics highest rank selector (optional, default to { any: true })
   * @param killsLastWeek Faction war statistics kill last week selector (optional, default to { any: true })
   * @param killsTotal Faction war statistics total kills selector (optional, default to { any: true })
   * @param killsYesterday Faction war statistics kills yesterday selector (optional, default to { any: true })
   * @param pilots Faction war statistics pilot count selector (optional, default to { any: true })
   * @param victoryPointsLastWeek Faction war statistics victory points last week selector (optional, default to { any: true })
   * @param victoryPointsTotal Faction war statistics victory points total selector (optional, default to { any: true })
   * @param victoryPointsYesterday Faction war statistics victory points yesterday selector (optional, default to { any: true })
   * @return List&lt;FacWarStats&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FacWarStats> getFacWarStats(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String currentRank, String enlisted, String factionID, String highestRank, String killsLastWeek, String killsTotal, String killsYesterday, String pilots, String victoryPointsLastWeek, String victoryPointsTotal, String victoryPointsYesterday) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFacWarStats");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFacWarStats");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/fac_war_stats".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentRank", currentRank));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enlisted", enlisted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factionID", factionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "highestRank", highestRank));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killsLastWeek", killsLastWeek));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killsTotal", killsTotal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killsYesterday", killsYesterday));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pilots", pilots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "victoryPointsLastWeek", victoryPointsLastWeek));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "victoryPointsTotal", victoryPointsTotal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "victoryPointsYesterday", victoryPointsYesterday));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<FacWarStats>> localVarReturnType = new GenericType<List<FacWarStats>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get industry jobs
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param jobID Industry job ID selector (optional, default to { any: true })
   * @param installerID Industry job installer ID selector (optional, default to { any: true })
   * @param facilityID Industry job facility ID selector (optional, default to { any: true })
   * @param stationID Industry job station ID selector (optional, default to { any: true })
   * @param activityID Industry job activity ID selector (optional, default to { any: true })
   * @param blueprintID Industry job blueprint ID selector (optional, default to { any: true })
   * @param blueprintTypeID Industry job blueprint type ID selector (optional, default to { any: true })
   * @param blueprintLocationID Industry job blueprint location ID selector (optional, default to { any: true })
   * @param outputLocationID Industry job output location ID selector (optional, default to { any: true })
   * @param runs Industry job runs selector (optional, default to { any: true })
   * @param cost Industry job cost selector (optional, default to { any: true })
   * @param licensedRuns Industry job licensed runs selector (optional, default to { any: true })
   * @param probability Industry job probability selector (optional, default to { any: true })
   * @param productTypeID Industry job product type ID selector (optional, default to { any: true })
   * @param status Industry job status selector (optional, default to { any: true })
   * @param timeInSeconds Industry job time in seconds selector (optional, default to { any: true })
   * @param startDate Industry job start date selector (optional, default to { any: true })
   * @param endDate Industry job end date selector (optional, default to { any: true })
   * @param pauseDate Industry job pause date selector (optional, default to { any: true })
   * @param completedDate Industry job completed date selector (optional, default to { any: true })
   * @param completedCharacterID Industry job completed character ID selector (optional, default to { any: true })
   * @param successfulRuns Industry job successful runs selector (optional, default to { any: true })
   * @return List&lt;IndustryJob&gt;
   * @throws ApiException if fails to make API call
   */
  public List<IndustryJob> getIndustryJobs(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String jobID, String installerID, String facilityID, String stationID, String activityID, String blueprintID, String blueprintTypeID, String blueprintLocationID, String outputLocationID, String runs, String cost, String licensedRuns, String probability, String productTypeID, String status, String timeInSeconds, String startDate, String endDate, String pauseDate, String completedDate, String completedCharacterID, String successfulRuns) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getIndustryJobs");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getIndustryJobs");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/industry_job".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jobID", jobID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "installerID", installerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "facilityID", facilityID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationID", stationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "activityID", activityID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "blueprintID", blueprintID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "blueprintTypeID", blueprintTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "blueprintLocationID", blueprintLocationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "outputLocationID", outputLocationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "runs", runs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cost", cost));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "licensedRuns", licensedRuns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "probability", probability));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productTypeID", productTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeInSeconds", timeInSeconds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pauseDate", pauseDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "completedDate", completedDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "completedCharacterID", completedCharacterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "successfulRuns", successfulRuns));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<IndustryJob>> localVarReturnType = new GenericType<List<IndustryJob>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get wallet journal entries
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param division Wallet journal division selector (optional, default to { any: true })
   * @param refID Journal entry ref ID selector (optional, default to { any: true })
   * @param date Journal entry date selector (optional, default to { any: true })
   * @param refType Journal entry ref type selector (optional, default to { any: true })
   * @param firstPartyID Journal entry first party ID selector (optional, default to { any: true })
   * @param secondPartyID Journal entry second party ID selector (optional, default to { any: true })
   * @param argName1 Journal entry argument name selector (optional, default to { any: true })
   * @param argID1 Journal entry argument ID selector (optional, default to { any: true })
   * @param amount Journal entry amount selector (optional, default to { any: true })
   * @param balance Journal entry balance selector (optional, default to { any: true })
   * @param reason Journal entry reason selector (optional, default to { any: true })
   * @param taxReceiverID Journal entry tax receiver ID selector (optional, default to { any: true })
   * @param taxAmount Journal entry tax amount selector (optional, default to { any: true })
   * @param contextID Context ID selector (optional, default to { any: true })
   * @param contextType Context type selector (optional, default to { any: true })
   * @param description Description selector (optional, default to { any: true })
   * @return List&lt;WalletJournal&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WalletJournal> getJournalEntries(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String division, String refID, String date, String refType, String firstPartyID, String secondPartyID, String argName1, String argID1, String amount, String balance, String reason, String taxReceiverID, String taxAmount, String contextID, String contextType, String description) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getJournalEntries");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getJournalEntries");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/wallet_journal".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "division", division));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refID", refID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "refType", refType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "firstPartyID", firstPartyID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "secondPartyID", secondPartyID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "argName1", argName1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "argID1", argID1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "balance", balance));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reason", reason));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxReceiverID", taxReceiverID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taxAmount", taxAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contextID", contextID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contextType", contextType));
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

    GenericType<List<WalletJournal>> localVarReturnType = new GenericType<List<WalletJournal>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get kill attackers
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param killID Kill ID selector (optional, default to { any: true })
   * @param attackerCharacterID Kill attacker character ID selector (optional, default to { any: true })
   * @param allianceID Kill attacker alliance ID selector (optional, default to { any: true })
   * @param attackerCorporationID Kill attacker corporation ID selector (optional, default to { any: true })
   * @param damageDone Kill attacker damage done selector (optional, default to { any: true })
   * @param factionID Kill attacker faction ID selector (optional, default to { any: true })
   * @param securityStatus Kill attacker security status selector (optional, default to { any: true })
   * @param shipTypeID Kill attacker ship type ID selector (optional, default to { any: true })
   * @param weaponTypeID Kill attacker weapon type ID selector (optional, default to { any: true })
   * @param finalBlow Kill attacker final blow selector (optional, default to { any: true })
   * @return List&lt;KillAttacker&gt;
   * @throws ApiException if fails to make API call
   */
  public List<KillAttacker> getKillAttackers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String killID, String attackerCharacterID, String allianceID, String attackerCorporationID, String damageDone, String factionID, String securityStatus, String shipTypeID, String weaponTypeID, String finalBlow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getKillAttackers");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getKillAttackers");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/kill_attacker".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killID", killID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attackerCharacterID", attackerCharacterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allianceID", allianceID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attackerCorporationID", attackerCorporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "damageDone", damageDone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factionID", factionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "securityStatus", securityStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipTypeID", shipTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "weaponTypeID", weaponTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "finalBlow", finalBlow));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<KillAttacker>> localVarReturnType = new GenericType<List<KillAttacker>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get kill items
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param killID Kill ID selector (optional, default to { any: true })
   * @param typeID Kill item type ID selector (optional, default to { any: true })
   * @param flag Kill item flag selector (optional, default to { any: true })
   * @param qtyDestroyed Kill item quantity destroyed selector (optional, default to { any: true })
   * @param qtyDropped Kill item quantity dropped selector (optional, default to { any: true })
   * @param singleton Kill item singleton selector (optional, default to { any: true })
   * @param sequence Kill item sequence selector (optional, default to { any: true })
   * @param containerSequence Kill item container sequence selector (optional, default to { any: true })
   * @return List&lt;KillItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<KillItem> getKillItems(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String killID, String typeID, String flag, String qtyDestroyed, String qtyDropped, String singleton, String sequence, String containerSequence) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getKillItems");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getKillItems");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/kill_item".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killID", killID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flag", flag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "qtyDestroyed", qtyDestroyed));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "qtyDropped", qtyDropped));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "singleton", singleton));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sequence", sequence));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "containerSequence", containerSequence));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<KillItem>> localVarReturnType = new GenericType<List<KillItem>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get kill victims
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param killID Kill ID selector (optional, default to { any: true })
   * @param allianceID Kill victim alliance ID selector (optional, default to { any: true })
   * @param killCharacterID Kill victim character ID selector (optional, default to { any: true })
   * @param killCorporationID Kill victim corporation ID selector (optional, default to { any: true })
   * @param damageTaken Kill victim damage taken selector (optional, default to { any: true })
   * @param factionID Kill victim faction ID selector (optional, default to { any: true })
   * @param shipTypeID Kill victim ship type ID selector (optional, default to { any: true })
   * @param x Kill X position selector (optional, default to { any: true })
   * @param y Kill Y position selector (optional, default to { any: true })
   * @param z Kill Z position selector (optional, default to { any: true })
   * @return List&lt;KillVictim&gt;
   * @throws ApiException if fails to make API call
   */
  public List<KillVictim> getKillVictims(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String killID, String allianceID, String killCharacterID, String killCorporationID, String damageTaken, String factionID, String shipTypeID, String x, String y, String z) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getKillVictims");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getKillVictims");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/kill_victim".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killID", killID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allianceID", allianceID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killCharacterID", killCharacterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killCorporationID", killCorporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "damageTaken", damageTaken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factionID", factionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipTypeID", shipTypeID));
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

    GenericType<List<KillVictim>> localVarReturnType = new GenericType<List<KillVictim>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get kills
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param killID Kill ID selector (optional, default to { any: true })
   * @param killTime Kill time selector (optional, default to { any: true })
   * @param moonID Kill moon ID selector (optional, default to { any: true })
   * @param solarSystemID Kill solar system ID selector (optional, default to { any: true })
   * @param warID War ID selector (optional, default to { any: true })
   * @return List&lt;Kill&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Kill> getKills(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String killID, String killTime, String moonID, String solarSystemID, String warID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getKills");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getKills");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/kill".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killID", killID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "killTime", killTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "moonID", moonID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "warID", warID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Kill>> localVarReturnType = new GenericType<List<Kill>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get locations
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param itemID Location item ID selector (optional, default to { any: true })
   * @param itemName Location item name selector (optional, default to { any: true })
   * @param x Location X position selector (optional, default to { any: true })
   * @param y Location Y position selector (optional, default to { any: true })
   * @param z Location Z position selector (optional, default to { any: true })
   * @return List&lt;Location&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Location> getLocations(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String itemID, String itemName, String x, String y, String z) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getLocations");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getLocations");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/location".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "itemName", itemName));
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

    GenericType<List<Location>> localVarReturnType = new GenericType<List<Location>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get market orders
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param orderID Market order ID selector (optional, default to { any: true })
   * @param walletDivision Market order wallet division selector (optional, default to { any: true })
   * @param bid Market order bid indicator selector (optional, default to { any: true })
   * @param charID Market order character ID selector (optional, default to { any: true })
   * @param duration Market order duration selector (optional, default to { any: true })
   * @param escrow Market order escrow selector (optional, default to { any: true })
   * @param issued Market order issue date selector (optional, default to { any: true })
   * @param issuedBy Market order issued by selector (optional, default to { any: true })
   * @param minVolume Market order min volume selector (optional, default to { any: true })
   * @param orderState Market order state selector (optional, default to { any: true })
   * @param price Market order price selector (optional, default to { any: true })
   * @param orderRange Market order range selector (optional, default to { any: true })
   * @param typeID Market order type ID selector (optional, default to { any: true })
   * @param volEntered Market order volume entered selector (optional, default to { any: true })
   * @param volRemaining Market order volume remaining selector (optional, default to { any: true })
   * @param regionID Market order region ID selector (optional, default to { any: true })
   * @param locationID Market order location ID selector (optional, default to { any: true })
   * @param isCorp Market order is corporation selector (optional, default to { any: true })
   * @return List&lt;MarketOrder&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MarketOrder> getMarketOrders(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String orderID, String walletDivision, String bid, String charID, String duration, String escrow, String issued, String issuedBy, String minVolume, String orderState, String price, String orderRange, String typeID, String volEntered, String volRemaining, String regionID, String locationID, String isCorp) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMarketOrders");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMarketOrders");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/market_order".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderID", orderID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletDivision", walletDivision));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bid", bid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "charID", charID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "escrow", escrow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issued", issued));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issuedBy", issuedBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "minVolume", minVolume));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderState", orderState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderRange", orderRange));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "volEntered", volEntered));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "volRemaining", volRemaining));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "regionID", regionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isCorp", isCorp));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MarketOrder>> localVarReturnType = new GenericType<List<MarketOrder>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get standings)
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param standingEntity Standing entity selector (optional, default to { any: true })
   * @param fromID Standing from ID selector (optional, default to { any: true })
   * @param standing Standing value selector (optional, default to { any: true })
   * @return List&lt;Standing&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Standing> getStandings(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String standingEntity, String fromID, String standing) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getStandings");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getStandings");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/standing".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standingEntity", standingEntity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromID", fromID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standing", standing));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Standing>> localVarReturnType = new GenericType<List<Standing>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get wallet transactions
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param division Wallet division selector (optional, default to { any: true })
   * @param transactionID Transaction ID selector (optional, default to { any: true })
   * @param date Transaction date selector (optional, default to { any: true })
   * @param quantity Transaction quantity selector (optional, default to { any: true })
   * @param typeID Transaction type ID selector (optional, default to { any: true })
   * @param price Transaction price selector (optional, default to { any: true })
   * @param clientID Transaction client ID selector (optional, default to { any: true })
   * @param locationID Transaction location ID selector (optional, default to { any: true })
   * @param isBuy Transaction isBuy selector (optional, default to { any: true })
   * @param isPersonal Transaction isPersonal selector (optional, default to { any: true })
   * @param journalTransactionID Journal transaction ID selector (optional, default to { any: true })
   * @return List&lt;WalletTransaction&gt;
   * @throws ApiException if fails to make API call
   */
  public List<WalletTransaction> getWalletTransactions(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String division, String transactionID, String date, String quantity, String typeID, String price, String clientID, String locationID, String isBuy, String isPersonal, String journalTransactionID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getWalletTransactions");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getWalletTransactions");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/common/wallet_transaction".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "division", division));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionID", transactionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientID", clientID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isBuy", isBuy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isPersonal", isPersonal));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "journalTransactionID", journalTransactionID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<WalletTransaction>> localVarReturnType = new GenericType<List<WalletTransaction>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
