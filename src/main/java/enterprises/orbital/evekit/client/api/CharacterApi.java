package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.invoker.ApiException;
import enterprises.orbital.evekit.client.invoker.ApiClient;
import enterprises.orbital.evekit.client.invoker.Configuration;
import enterprises.orbital.evekit.client.invoker.Pair;

import javax.ws.rs.core.GenericType;

import enterprises.orbital.evekit.client.model.AccountStatus;
import enterprises.orbital.evekit.client.model.ServiceError;
import enterprises.orbital.evekit.client.model.CharacterSheetBalance;
import enterprises.orbital.evekit.client.model.CalendarEventAttendee;
import enterprises.orbital.evekit.client.model.ChatChannelMember;
import enterprises.orbital.evekit.client.model.ChatChannel;
import enterprises.orbital.evekit.client.model.CharacterSheet;
import enterprises.orbital.evekit.client.model.CharacterSheetClone;
import enterprises.orbital.evekit.client.model.CharacterContactNotification;
import enterprises.orbital.evekit.client.model.Implant;
import enterprises.orbital.evekit.client.model.JumpCloneImplant;
import enterprises.orbital.evekit.client.model.JumpClone;
import enterprises.orbital.evekit.client.model.CharacterSheetJump;
import enterprises.orbital.evekit.client.model.CharacterMailMessageBody;
import enterprises.orbital.evekit.client.model.CharacterMailMessage;
import enterprises.orbital.evekit.client.model.MailingList;
import enterprises.orbital.evekit.client.model.CharacterMedal;
import enterprises.orbital.evekit.client.model.CharacterNotificationBody;
import enterprises.orbital.evekit.client.model.CharacterNotification;
import enterprises.orbital.evekit.client.model.PlanetaryColony;
import enterprises.orbital.evekit.client.model.PlanetaryLink;
import enterprises.orbital.evekit.client.model.PlanetaryPin;
import enterprises.orbital.evekit.client.model.PlanetaryRoute;
import enterprises.orbital.evekit.client.model.ResearchAgent;
import enterprises.orbital.evekit.client.model.CharacterRole;
import enterprises.orbital.evekit.client.model.CharacterSkill;
import enterprises.orbital.evekit.client.model.SkillInQueue;
import enterprises.orbital.evekit.client.model.CharacterSkillInTraining;
import enterprises.orbital.evekit.client.model.CharacterTitle;
import enterprises.orbital.evekit.client.model.UpcomingCalendarEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-01T15:58:15.972+02:00")
public class CharacterApi {
  private ApiClient apiClient;

  public CharacterApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CharacterApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get account status(es)
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param paidUntil Account status paid until selector (optional, default to { any: true })
   * @param createDate Account status create date selector (optional, default to { any: true })
   * @param logonCount Account status logon count selector (optional, default to { any: true })
   * @param logonMinutes Account status logon minutes selector (optional, default to { any: true })
   * @param multiCharacterTraining Account status multi-character training selector (optional, default to { any: true })
   * @return List<AccountStatus>
   * @throws ApiException if fails to make API call
   */
  public List<AccountStatus> getAccountStatus(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String paidUntil, String createDate, String logonCount, String logonMinutes, String multiCharacterTraining) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getAccountStatus");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getAccountStatus");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/account_status".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "paidUntil", paidUntil));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "createDate", createDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logonCount", logonCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logonMinutes", logonMinutes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "multiCharacterTraining", multiCharacterTraining));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<AccountStatus>> localVarReturnType = new GenericType<List<AccountStatus>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character sheet balance
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param balance Balance selector (optional, default to { any: true })
   * @return List<CharacterSheetBalance>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSheetBalance> getBalances(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String balance) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getBalances");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getBalances");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/balance".replaceAll("\\{format\\}","json");

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

    GenericType<List<CharacterSheetBalance>> localVarReturnType = new GenericType<List<CharacterSheetBalance>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get calendar event attendees
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param eventID Calendar event ID selector (optional, default to { any: true })
   * @param characterID Attending character ID selector (optional, default to { any: true })
   * @param characterName Attending character name selector (optional, default to { any: true })
   * @param response Attendee response selector (optional, default to { any: true })
   * @return List<CalendarEventAttendee>
   * @throws ApiException if fails to make API call
   */
  public List<CalendarEventAttendee> getCalendarEventAttendees(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String eventID, String characterID, String characterName, String response) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCalendarEventAttendees");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCalendarEventAttendees");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/calendar_event_attendees".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventID", eventID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterName", characterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "response", response));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CalendarEventAttendee>> localVarReturnType = new GenericType<List<CalendarEventAttendee>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get chat channel members
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param channelID Channel ID selector (optional, default to { any: true })
   * @param category Member category selector (optional, default to { any: true })
   * @param accessorID Member accessor ID selector (optional, default to { any: true })
   * @param accessorName Member accessor name selector (optional, default to { any: true })
   * @param untilWhen Member restriction \&quot;until when\&quot; date selector (optional, default to { any: true })
   * @param reason Member restriction reason selector (optional, default to { any: true })
   * @return List<ChatChannelMember>
   * @throws ApiException if fails to make API call
   */
  public List<ChatChannelMember> getChannelMembers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String channelID, String category, String accessorID, String accessorName, String untilWhen, String reason) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getChannelMembers");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getChannelMembers");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/channel_member".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channelID", channelID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "category", category));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessorID", accessorID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessorName", accessorName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "untilWhen", untilWhen));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reason", reason));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ChatChannelMember>> localVarReturnType = new GenericType<List<ChatChannelMember>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character chat channels
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param channelID Channel ID selector (optional, default to { any: true })
   * @param ownerID Channel owner ID selector (optional, default to { any: true })
   * @param ownerName Channel owner name selector (optional, default to { any: true })
   * @param displayName Channel display name selector (optional, default to { any: true })
   * @param comparisonKey Channel comparison key selector (optional, default to { any: true })
   * @param hasPassword Channel has password selector (optional, default to { any: true })
   * @param motd Channel Message of the Day selector (optional, default to { any: true })
   * @return List<ChatChannel>
   * @throws ApiException if fails to make API call
   */
  public List<ChatChannel> getChannels(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String channelID, String ownerID, String ownerName, String displayName, String comparisonKey, String hasPassword, String motd) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getChannels");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getChannels");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/channel".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "channelID", channelID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerID", ownerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerName", ownerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "displayName", displayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "comparisonKey", comparisonKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hasPassword", hasPassword));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "motd", motd));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ChatChannel>> localVarReturnType = new GenericType<List<ChatChannel>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character sheet
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param characterID Character ID selector (optional, default to { any: true })
   * @param name Name selector (optional, default to { any: true })
   * @param corporationID Corporation ID selector (optional, default to { any: true })
   * @param corporationName Corporation name selector (optional, default to { any: true })
   * @param race Race selector (optional, default to { any: true })
   * @param doB Date of birth selector (optional, default to { any: true })
   * @param bloodlineID Bloodline ID selector (optional, default to { any: true })
   * @param bloodline Bloodline selector (optional, default to { any: true })
   * @param ancestryID Ancestry ID selector (optional, default to { any: true })
   * @param ancestry Ancestry selector (optional, default to { any: true })
   * @param gender Gender selector (optional, default to { any: true })
   * @param allianceName Alliance name selector (optional, default to { any: true })
   * @param allianceID Alliance ID selector (optional, default to { any: true })
   * @param factionName Faction name selector (optional, default to { any: true })
   * @param factionID Faction ID selector (optional, default to { any: true })
   * @param intelligence Intelligence selector (optional, default to { any: true })
   * @param memory Memory selector (optional, default to { any: true })
   * @param charisma Charisma selector (optional, default to { any: true })
   * @param perception Perception selector (optional, default to { any: true })
   * @param willpower Willpower selector (optional, default to { any: true })
   * @param homeStationID Home station ID selector (optional, default to { any: true })
   * @param lastRespecDate Last respec date selector (optional, default to { any: true })
   * @param lastTimedRespec Last timed respec selector (optional, default to { any: true })
   * @param freeRespecs Free respecs selector (optional, default to { any: true })
   * @param freeSkillPoints Free skill points selector (optional, default to { any: true })
   * @param remoteStationDate Remote station date selector (optional, default to { any: true })
   * @return List<CharacterSheet>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSheet> getCharacterSheets(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID, String name, String corporationID, String corporationName, String race, String doB, String bloodlineID, String bloodline, String ancestryID, String ancestry, String gender, String allianceName, String allianceID, String factionName, String factionID, String intelligence, String memory, String charisma, String perception, String willpower, String homeStationID, String lastRespecDate, String lastTimedRespec, String freeRespecs, String freeSkillPoints, String remoteStationDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCharacterSheets");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCharacterSheets");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/sheet".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationID", corporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationName", corporationName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "race", race));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "doB", doB));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bloodlineID", bloodlineID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bloodline", bloodline));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ancestryID", ancestryID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ancestry", ancestry));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allianceName", allianceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allianceID", allianceID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factionName", factionName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factionID", factionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intelligence", intelligence));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "memory", memory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "charisma", charisma));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "perception", perception));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "willpower", willpower));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "homeStationID", homeStationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastRespecDate", lastRespecDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastTimedRespec", lastTimedRespec));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "freeRespecs", freeRespecs));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "freeSkillPoints", freeSkillPoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "remoteStationDate", remoteStationDate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterSheet>> localVarReturnType = new GenericType<List<CharacterSheet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character clone jump timers
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param cloneJumpDate Clone jump date selector (optional, default to { any: true })
   * @return List<CharacterSheetClone>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSheetClone> getCloneJumpTimers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String cloneJumpDate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCloneJumpTimers");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCloneJumpTimers");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/clone_jump_timer".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloneJumpDate", cloneJumpDate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterSheetClone>> localVarReturnType = new GenericType<List<CharacterSheetClone>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character contact notifications
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param notificationID Notification ID selector (optional, default to { any: true })
   * @param senderID Contact notification sender ID selector (optional, default to { any: true })
   * @param senderName Contact notification sender name selector (optional, default to { any: true })
   * @param sentDate Contact notification send date selector (optional, default to { any: true })
   * @param messageData Contact notification message data selector (optional, default to { any: true })
   * @return List<CharacterContactNotification>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterContactNotification> getContactNotifications(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String notificationID, String senderID, String senderName, String sentDate, String messageData) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getContactNotifications");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getContactNotifications");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/contact_notification".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notificationID", notificationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderID", senderID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderName", senderName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentDate", sentDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageData", messageData));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterContactNotification>> localVarReturnType = new GenericType<List<CharacterContactNotification>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character implants
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param typeID Implant type ID selector (optional, default to { any: true })
   * @param typeName Implant type name selector (optional, default to { any: true })
   * @return List<Implant>
   * @throws ApiException if fails to make API call
   */
  public List<Implant> getImplants(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String typeID, String typeName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getImplants");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getImplants");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/implant".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeName", typeName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Implant>> localVarReturnType = new GenericType<List<Implant>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character jump clone implants
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param jumpCloneID Jump clone ID selector (optional, default to { any: true })
   * @param typeID Implant type ID selector (optional, default to { any: true })
   * @param typeName Implant type name selector (optional, default to { any: true })
   * @return List<JumpCloneImplant>
   * @throws ApiException if fails to make API call
   */
  public List<JumpCloneImplant> getJumpCloneImplants(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String jumpCloneID, String typeID, String typeName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getJumpCloneImplants");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getJumpCloneImplants");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/jump_clone_implant".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jumpCloneID", jumpCloneID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeName", typeName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<JumpCloneImplant>> localVarReturnType = new GenericType<List<JumpCloneImplant>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character jump clones
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param jumpCloneID Jump clone ID selector (optional, default to { any: true })
   * @param typeID Jump clone type ID selector (optional, default to { any: true })
   * @param locationID Jump clone location ID selector (optional, default to { any: true })
   * @param cloneName Clone name selector selector (optional, default to { any: true })
   * @return List<JumpClone>
   * @throws ApiException if fails to make API call
   */
  public List<JumpClone> getJumpClones(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String jumpCloneID, String typeID, String locationID, String cloneName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getJumpClones");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getJumpClones");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/jump_clone".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jumpCloneID", jumpCloneID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloneName", cloneName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<JumpClone>> localVarReturnType = new GenericType<List<JumpClone>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character jump timers
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param jumpActivation Jump activation selector (optional, default to { any: true })
   * @param jumpFatigue Jump fatigue selector (optional, default to { any: true })
   * @param jumpLastUpdate Jump last update time selector (optional, default to { any: true })
   * @return List<CharacterSheetJump>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSheetJump> getJumpTimers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String jumpActivation, String jumpFatigue, String jumpLastUpdate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getJumpTimers");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getJumpTimers");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/jump_timer".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jumpActivation", jumpActivation));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jumpFatigue", jumpFatigue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "jumpLastUpdate", jumpLastUpdate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterSheetJump>> localVarReturnType = new GenericType<List<CharacterSheetJump>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character mail message bodies
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param messageID Mail message ID selector (optional, default to { any: true })
   * @param retrieved Mail message body retrieved selector (optional, default to { any: true })
   * @param body Mail message body selector (optional, default to { any: true })
   * @return List<CharacterMailMessageBody>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterMailMessageBody> getMailMessageBodies(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String messageID, String retrieved, String body) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMailMessageBodies");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMailMessageBodies");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/mail_message_body".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageID", messageID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "retrieved", retrieved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "body", body));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterMailMessageBody>> localVarReturnType = new GenericType<List<CharacterMailMessageBody>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character mail messages (not bodies)
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param messageID Message ID selector (optional, default to { any: true })
   * @param senderID Message sender ID selector (optional, default to { any: true })
   * @param senderName Message sender name selector (optional, default to { any: true })
   * @param toCharacterID Message destination character ID selector (optional, default to { any: true })
   * @param sentDate Message send date selector (optional, default to { any: true })
   * @param title Message title selector (optional, default to { any: true })
   * @param toCorpOrAllianceID Message corporation or alliance ID selector (optional, default to { any: true })
   * @param toListID Message destination list ID selector (optional, default to { any: true })
   * @param msgRead Message read selector (optional, default to { any: true })
   * @param senderTypeID Message sender type ID selector (optional, default to { any: true })
   * @return List<CharacterMailMessage>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterMailMessage> getMailMessages(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String messageID, String senderID, String senderName, String toCharacterID, String sentDate, String title, String toCorpOrAllianceID, String toListID, String msgRead, String senderTypeID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMailMessages");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMailMessages");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/mail_message".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageID", messageID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderID", senderID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderName", senderName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toCharacterID", toCharacterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentDate", sentDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toCorpOrAllianceID", toCorpOrAllianceID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toListID", toListID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "msgRead", msgRead));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderTypeID", senderTypeID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterMailMessage>> localVarReturnType = new GenericType<List<CharacterMailMessage>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character mailing lists
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param displayName Mailing list display name selector (optional, default to { any: true })
   * @param listID Mailing list ID selector (optional, default to { any: true })
   * @return List<MailingList>
   * @throws ApiException if fails to make API call
   */
  public List<MailingList> getMailingLists(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String displayName, String listID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMailingLists");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMailingLists");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/mailing_list".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "displayName", displayName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "listID", listID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MailingList>> localVarReturnType = new GenericType<List<MailingList>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character medals
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param description Medal description selector (optional, default to { any: true })
   * @param medalID Medal ID selector (optional, default to { any: true })
   * @param title Medal title selector (optional, default to { any: true })
   * @param corporationID Awarding corporation ID selector (optional, default to { any: true })
   * @param issued Issue date selector (optional, default to { any: true })
   * @param issuerID Issuer ID selector (optional, default to { any: true })
   * @param reason Medal award reason selector (optional, default to { any: true })
   * @param status Medal status selector (optional, default to { any: true })
   * @return List<CharacterMedal>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterMedal> getMedals(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String description, String medalID, String title, String corporationID, String issued, String issuerID, String reason, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMedals");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMedals");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/medal".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "medalID", medalID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationID", corporationID));
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

    GenericType<List<CharacterMedal>> localVarReturnType = new GenericType<List<CharacterMedal>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character notification bodies
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param notificationID Notification ID selector (optional, default to { any: true })
   * @param retrieved Body retrieved selector (optional, default to { any: true })
   * @param text Notification text selector (optional, default to { any: true })
   * @param missing Notification missing selector (optional, default to { any: true })
   * @return List<CharacterNotificationBody>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterNotificationBody> getNotificationBodies(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String notificationID, String retrieved, String text, String missing) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getNotificationBodies");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getNotificationBodies");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/notification_body".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notificationID", notificationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "retrieved", retrieved));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "missing", missing));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterNotificationBody>> localVarReturnType = new GenericType<List<CharacterNotificationBody>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character notifications (not bodies)
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param notificationID Notification ID selector (optional, default to { any: true })
   * @param typeID Notification type ID selector (optional, default to { any: true })
   * @param senderID Notification sender ID selector (optional, default to { any: true })
   * @param sentDate Notification send date selector (optional, default to { any: true })
   * @param msgRead Notification read selector (optional, default to { any: true })
   * @return List<CharacterNotification>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterNotification> getNotifications(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String notificationID, String typeID, String senderID, String sentDate, String msgRead) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getNotifications");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getNotifications");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/notification".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "notificationID", notificationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderID", senderID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentDate", sentDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "msgRead", msgRead));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterNotification>> localVarReturnType = new GenericType<List<CharacterNotification>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get planetary colonies
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param planetID Planet ID selector (optional, default to { any: true })
   * @param solarSystemID Solar system ID selector (optional, default to { any: true })
   * @param solarSystemName Solar system name selector (optional, default to { any: true })
   * @param planetName Planet name selector (optional, default to { any: true })
   * @param planetTypeID Planet type ID selector (optional, default to { any: true })
   * @param planetTypeName Planet type name selector (optional, default to { any: true })
   * @param ownerID Colony owner ID selector (optional, default to { any: true })
   * @param ownerName Colony owner name selector (optional, default to { any: true })
   * @param lastUpdate Colony last update selector (optional, default to { any: true })
   * @param upgradeLevel Colony upgrade level selector (optional, default to { any: true })
   * @param numberOfPins Colony number of pins selector (optional, default to { any: true })
   * @return List<PlanetaryColony>
   * @throws ApiException if fails to make API call
   */
  public List<PlanetaryColony> getPlanetaryColonies(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String planetID, String solarSystemID, String solarSystemName, String planetName, String planetTypeID, String planetTypeName, String ownerID, String ownerName, String lastUpdate, String upgradeLevel, String numberOfPins) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getPlanetaryColonies");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getPlanetaryColonies");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/planetary_colony".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planetID", planetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemName", solarSystemName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planetName", planetName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planetTypeID", planetTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planetTypeName", planetTypeName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerID", ownerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerName", ownerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastUpdate", lastUpdate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "upgradeLevel", upgradeLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "numberOfPins", numberOfPins));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PlanetaryColony>> localVarReturnType = new GenericType<List<PlanetaryColony>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get planetary links
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param planetID Planet ID selector (optional, default to { any: true })
   * @param sourcePinID Link source pin ID selector (optional, default to { any: true })
   * @param destinationPinID Link destination pin ID selector (optional, default to { any: true })
   * @param linkLevel Link level selector (optional, default to { any: true })
   * @return List<PlanetaryLink>
   * @throws ApiException if fails to make API call
   */
  public List<PlanetaryLink> getPlanetaryLinks(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String planetID, String sourcePinID, String destinationPinID, String linkLevel) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getPlanetaryLinks");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getPlanetaryLinks");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/planetary_link".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planetID", planetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourcePinID", sourcePinID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destinationPinID", destinationPinID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "linkLevel", linkLevel));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PlanetaryLink>> localVarReturnType = new GenericType<List<PlanetaryLink>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get planetary pins
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param planetID Planet ID selector (optional, default to { any: true })
   * @param pinID Pin ID selector (optional, default to { any: true })
   * @param typeID Pin type ID selector (optional, default to { any: true })
   * @param typeName Pin type name selector (optional, default to { any: true })
   * @param schematicID Pin schematic ID selector (optional, default to { any: true })
   * @param lastLaunchTime Pin last launch time selector (optional, default to { any: true })
   * @param cycleTime Pin cycle time selector (optional, default to { any: true })
   * @param quantityPerCycle Pin quantity per cycle selector (optional, default to { any: true })
   * @param installTime Pin install time selector (optional, default to { any: true })
   * @param expiryTime Pin expiry time selector (optional, default to { any: true })
   * @param contentTypeID Pin content type ID selector (optional, default to { any: true })
   * @param contentTypeName Pin content type name selector (optional, default to { any: true })
   * @param contentQuantity Pin content quantity selector (optional, default to { any: true })
   * @param longitude Pin longitude selector (optional, default to { any: true })
   * @param latitude Pin latitude selector (optional, default to { any: true })
   * @return List<PlanetaryPin>
   * @throws ApiException if fails to make API call
   */
  public List<PlanetaryPin> getPlanetaryPins(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String planetID, String pinID, String typeID, String typeName, String schematicID, String lastLaunchTime, String cycleTime, String quantityPerCycle, String installTime, String expiryTime, String contentTypeID, String contentTypeName, String contentQuantity, String longitude, String latitude) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getPlanetaryPins");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getPlanetaryPins");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/planetary_pin".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planetID", planetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pinID", pinID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeName", typeName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schematicID", schematicID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastLaunchTime", lastLaunchTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cycleTime", cycleTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantityPerCycle", quantityPerCycle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "installTime", installTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expiryTime", expiryTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentTypeID", contentTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentTypeName", contentTypeName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentQuantity", contentQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PlanetaryPin>> localVarReturnType = new GenericType<List<PlanetaryPin>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get planetary routes
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param planetID Planet ID selector (optional, default to { any: true })
   * @param routeID Route ID selector (optional, default to { any: true })
   * @param sourcePinID Route source pin ID selector (optional, default to { any: true })
   * @param destinationPinID Route destination pin ID selector (optional, default to { any: true })
   * @param contentTypeID Route content type ID selector (optional, default to { any: true })
   * @param contentTypeName Route content type name selector (optional, default to { any: true })
   * @param quantity Route quantity selector (optional, default to { any: true })
   * @param waypoint1 Route waypoint 1 selector (optional, default to { any: true })
   * @param waypoint2 Route waypoint 2 selector (optional, default to { any: true })
   * @param waypoint3 Route waypoint 3 selector (optional, default to { any: true })
   * @param waypoint4 Route waypoint 4 selector (optional, default to { any: true })
   * @param waypoint5 Route waypoint 5 selector (optional, default to { any: true })
   * @return List<PlanetaryRoute>
   * @throws ApiException if fails to make API call
   */
  public List<PlanetaryRoute> getPlanetaryRoutes(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String planetID, String routeID, String sourcePinID, String destinationPinID, String contentTypeID, String contentTypeName, String quantity, String waypoint1, String waypoint2, String waypoint3, String waypoint4, String waypoint5) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getPlanetaryRoutes");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getPlanetaryRoutes");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/planetary_route".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planetID", planetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "routeID", routeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourcePinID", sourcePinID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destinationPinID", destinationPinID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentTypeID", contentTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentTypeName", contentTypeName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "waypoint1", waypoint1));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "waypoint2", waypoint2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "waypoint3", waypoint3));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "waypoint4", waypoint4));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "waypoint5", waypoint5));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PlanetaryRoute>> localVarReturnType = new GenericType<List<PlanetaryRoute>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character research agents
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param agentID Research agent ID selector (optional, default to { any: true })
   * @param currentPoints Agent current points selector (optional, default to { any: true })
   * @param pointsPerDay Agent points per day selector (optional, default to { any: true })
   * @param remainderPoints Agent remainder points selector (optional, default to { any: true })
   * @param researchStartDate Agent research start date selector (optional, default to { any: true })
   * @param skillTypeID Agent skill type ID selector (optional, default to { any: true })
   * @return List<ResearchAgent>
   * @throws ApiException if fails to make API call
   */
  public List<ResearchAgent> getResearchAgents(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String agentID, String currentPoints, String pointsPerDay, String remainderPoints, String researchStartDate, String skillTypeID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getResearchAgents");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getResearchAgents");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/research_agent".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "agentID", agentID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentPoints", currentPoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pointsPerDay", pointsPerDay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "remainderPoints", remainderPoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "researchStartDate", researchStartDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skillTypeID", skillTypeID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<ResearchAgent>> localVarReturnType = new GenericType<List<ResearchAgent>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character roles
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param roleCategory Role category selector (optional, default to { any: true })
   * @param roleID Role ID selector (optional, default to { any: true })
   * @param roleName Role name selector (optional, default to { any: true })
   * @return List<CharacterRole>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterRole> getRoles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String roleCategory, String roleID, String roleName) throws ApiException {
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
    String localVarPath = "/ws/v1/char/role".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleCategory", roleCategory));
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

    GenericType<List<CharacterRole>> localVarReturnType = new GenericType<List<CharacterRole>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character skills
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param typeID Skill type ID selector (optional, default to { any: true })
   * @param level Skill level selector (optional, default to { any: true })
   * @param skillpoints Skill points selector (optional, default to { any: true })
   * @param published Published skill selector (optional, default to { any: true })
   * @return List<CharacterSkill>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSkill> getSkills(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String typeID, String level, String skillpoints, String published) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getSkills");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getSkills");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/skill".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skillpoints", skillpoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "published", published));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterSkill>> localVarReturnType = new GenericType<List<CharacterSkill>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character skill queue
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param endSP Skill ending skill points selector (optional, default to { any: true })
   * @param endTime Skill training end time selector (optional, default to { any: true })
   * @param level Skill training to level selector (optional, default to { any: true })
   * @param queuePosition Queue position selector (optional, default to { any: true })
   * @param startSP Starting skill points selector (optional, default to { any: true })
   * @param startTime Training start time selector (optional, default to { any: true })
   * @param typeID Skill type ID selector (optional, default to { any: true })
   * @return List<SkillInQueue>
   * @throws ApiException if fails to make API call
   */
  public List<SkillInQueue> getSkillsInQueue(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String endSP, String endTime, String level, String queuePosition, String startSP, String startTime, String typeID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getSkillsInQueue");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getSkillsInQueue");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/skill_queue".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endSP", endSP));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "level", level));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "queuePosition", queuePosition));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startSP", startSP));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
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

    GenericType<List<SkillInQueue>> localVarReturnType = new GenericType<List<SkillInQueue>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character skill in training
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param skillInTraining Skill in training selector (optional, default to { any: true })
   * @param currentTrainingQueueTime Current taining queue time selector (optional, default to { any: true })
   * @param trainingStartTime Training start time selector (optional, default to { any: true })
   * @param trainingEndTime Training end time selector (optional, default to { any: true })
   * @param trainingStartSP Training start skill points selector (optional, default to { any: true })
   * @param trainingDestinationSP Training destination skill points selector (optional, default to { any: true })
   * @param trainingToLevel Training to level selector (optional, default to { any: true })
   * @param skillTypeID Skill type ID selector (optional, default to { any: true })
   * @return List<CharacterSkillInTraining>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSkillInTraining> getSkillsInTraining(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String skillInTraining, String currentTrainingQueueTime, String trainingStartTime, String trainingEndTime, String trainingStartSP, String trainingDestinationSP, String trainingToLevel, String skillTypeID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getSkillsInTraining");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getSkillsInTraining");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/skill_in_training".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skillInTraining", skillInTraining));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "currentTrainingQueueTime", currentTrainingQueueTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trainingStartTime", trainingStartTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trainingEndTime", trainingEndTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trainingStartSP", trainingStartSP));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trainingDestinationSP", trainingDestinationSP));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trainingToLevel", trainingToLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skillTypeID", skillTypeID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterSkillInTraining>> localVarReturnType = new GenericType<List<CharacterSkillInTraining>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character titles
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param titleID Character title ID selector (optional, default to { any: true })
   * @param titleName Character title name selector (optional, default to { any: true })
   * @return List<CharacterTitle>
   * @throws ApiException if fails to make API call
   */
  public List<CharacterTitle> getTitles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String titleID, String titleName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getTitles");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getTitles");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/title".replaceAll("\\{format\\}","json");

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

    GenericType<List<CharacterTitle>> localVarReturnType = new GenericType<List<CharacterTitle>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get upcoming calendar events
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param duration Event duration selector (optional, default to { any: true })
   * @param eventDate Event date selector (milliseconds UTC) (optional, default to { any: true })
   * @param eventID Event ID selector (optional, default to { any: true })
   * @param eventText Event text selector (optional, default to { any: true })
   * @param eventTitle Event title selector (optional, default to { any: true })
   * @param ownerID Owner ID selector (optional, default to { any: true })
   * @param ownerName Owner name selector (optional, default to { any: true })
   * @param response Response text selector (optional, default to { any: true })
   * @param important Important flag selector (optional, default to { any: true })
   * @param ownerTypeID Event owner type ID selector (optional, default to { any: true })
   * @return List<UpcomingCalendarEvent>
   * @throws ApiException if fails to make API call
   */
  public List<UpcomingCalendarEvent> getUpcomingCalendarEvents(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String duration, String eventDate, String eventID, String eventText, String eventTitle, String ownerID, String ownerName, String response, String important, String ownerTypeID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getUpcomingCalendarEvents");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getUpcomingCalendarEvents");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/calendar_events".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventDate", eventDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventID", eventID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventText", eventText));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventTitle", eventTitle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerID", ownerID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerName", ownerName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "response", response));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "important", important));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerTypeID", ownerTypeID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<UpcomingCalendarEvent>> localVarReturnType = new GenericType<List<UpcomingCalendarEvent>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
