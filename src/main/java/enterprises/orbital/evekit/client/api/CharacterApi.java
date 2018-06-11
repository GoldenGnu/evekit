package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.ApiException;
import enterprises.orbital.evekit.client.ApiClient;
import enterprises.orbital.evekit.client.Configuration;
import enterprises.orbital.evekit.client.Pair;

import javax.ws.rs.core.GenericType;

import enterprises.orbital.evekit.client.model.CalendarEventAttendee;
import enterprises.orbital.evekit.client.model.CharacterContactNotification;
import enterprises.orbital.evekit.client.model.CharacterFleet;
import enterprises.orbital.evekit.client.model.CharacterLocation;
import enterprises.orbital.evekit.client.model.CharacterMailMessage;
import enterprises.orbital.evekit.client.model.CharacterMedal;
import enterprises.orbital.evekit.client.model.CharacterMedalGraphic;
import enterprises.orbital.evekit.client.model.CharacterNotification;
import enterprises.orbital.evekit.client.model.CharacterOnline;
import enterprises.orbital.evekit.client.model.CharacterRole;
import enterprises.orbital.evekit.client.model.CharacterSheet;
import enterprises.orbital.evekit.client.model.CharacterSheetAttributes;
import enterprises.orbital.evekit.client.model.CharacterSheetClone;
import enterprises.orbital.evekit.client.model.CharacterSheetJump;
import enterprises.orbital.evekit.client.model.CharacterSheetSkillPoints;
import enterprises.orbital.evekit.client.model.CharacterShip;
import enterprises.orbital.evekit.client.model.CharacterSkill;
import enterprises.orbital.evekit.client.model.CharacterTitle;
import enterprises.orbital.evekit.client.model.ChatChannel;
import enterprises.orbital.evekit.client.model.ChatChannelMember;
import enterprises.orbital.evekit.client.model.Fitting;
import enterprises.orbital.evekit.client.model.FittingItem;
import enterprises.orbital.evekit.client.model.FleetInfo;
import enterprises.orbital.evekit.client.model.FleetMember;
import enterprises.orbital.evekit.client.model.FleetSquad;
import enterprises.orbital.evekit.client.model.FleetWing;
import enterprises.orbital.evekit.client.model.Implant;
import enterprises.orbital.evekit.client.model.JumpClone;
import enterprises.orbital.evekit.client.model.JumpCloneImplant;
import enterprises.orbital.evekit.client.model.LoyaltyPoints;
import enterprises.orbital.evekit.client.model.MailLabel;
import enterprises.orbital.evekit.client.model.MailingList;
import enterprises.orbital.evekit.client.model.MiningLedger;
import enterprises.orbital.evekit.client.model.Opportunity;
import enterprises.orbital.evekit.client.model.PlanetaryColony;
import enterprises.orbital.evekit.client.model.PlanetaryLink;
import enterprises.orbital.evekit.client.model.PlanetaryPin;
import enterprises.orbital.evekit.client.model.PlanetaryRoute;
import enterprises.orbital.evekit.client.model.ResearchAgent;
import enterprises.orbital.evekit.client.model.ServiceError;
import enterprises.orbital.evekit.client.model.SkillInQueue;
import enterprises.orbital.evekit.client.model.UpcomingCalendarEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
   * @param response Attendee response selector (optional, default to { any: true })
   * @return List&lt;CalendarEventAttendee&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CalendarEventAttendee> getCalendarEventAttendees(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String eventID, String characterID, String response) throws ApiException {
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
   * @param accessorType Member accessor type selector (optional, default to { any: true })
   * @param untilWhen Member restriction \&quot;until when\&quot; date selector (optional, default to { any: true })
   * @param reason Member restriction reason selector (optional, default to { any: true })
   * @return List&lt;ChatChannelMember&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ChatChannelMember> getChannelMembers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String channelID, String category, String accessorID, String accessorType, String untilWhen, String reason) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accessorType", accessorType));
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
   * @param displayName Channel display name selector (optional, default to { any: true })
   * @param comparisonKey Channel comparison key selector (optional, default to { any: true })
   * @param hasPassword Channel has password selector (optional, default to { any: true })
   * @param motd Channel Message of the Day selector (optional, default to { any: true })
   * @return List&lt;ChatChannel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ChatChannel> getChannels(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String channelID, String ownerID, String displayName, String comparisonKey, String hasPassword, String motd) throws ApiException {
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
   * Get character fleets
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param fleetID Fleet ID selector (optional, default to { any: true })
   * @param role Fleet role selector (optional, default to { any: true })
   * @param squadID Fleet squad ID selector (optional, default to { any: true })
   * @param wingID Fleet wing ID selector (optional, default to { any: true })
   * @return List&lt;CharacterFleet&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterFleet> getCharacterFleet(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String fleetID, String role, String squadID, String wingID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCharacterFleet");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCharacterFleet");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/char_fleet".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fleetID", fleetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "squadID", squadID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wingID", wingID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterFleet>> localVarReturnType = new GenericType<List<CharacterFleet>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character sheet attributes
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param intelligence Intelligence selector (optional, default to { any: true })
   * @param memory Memory selector (optional, default to { any: true })
   * @param charisma Charisma selector (optional, default to { any: true })
   * @param perception Perception selector (optional, default to { any: true })
   * @param willpower Willpower selector (optional, default to { any: true })
   * @param lastRemapDate Last remap date selector (optional, default to { any: true })
   * @param accruedRemapCooldownDate Accrued remap cooldown date selector (optional, default to { any: true })
   * @param bonusRemaps Bonus remaps selector (optional, default to { any: true })
   * @return List&lt;CharacterSheetAttributes&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSheetAttributes> getCharacterSheetAttributes(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String intelligence, String memory, String charisma, String perception, String willpower, String lastRemapDate, String accruedRemapCooldownDate, String bonusRemaps) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getCharacterSheetAttributes");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getCharacterSheetAttributes");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/sheet_attributes".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "intelligence", intelligence));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "memory", memory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "charisma", charisma));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "perception", perception));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "willpower", willpower));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastRemapDate", lastRemapDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accruedRemapCooldownDate", accruedRemapCooldownDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bonusRemaps", bonusRemaps));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterSheetAttributes>> localVarReturnType = new GenericType<List<CharacterSheetAttributes>>() {};
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
   * @param raceID Race selector (optional, default to { any: true })
   * @param doB Date of birth selector (optional, default to { any: true })
   * @param bloodlineID Bloodline ID selector (optional, default to { any: true })
   * @param ancestryID Ancestry ID selector (optional, default to { any: true })
   * @param gender Gender selector (optional, default to { any: true })
   * @param allianceID Alliance ID selector (optional, default to { any: true })
   * @param factionID Faction ID selector (optional, default to { any: true })
   * @param description Description selector (optional, default to { any: true })
   * @param securityStatus Security status selector (optional, default to { any: true })
   * @return List&lt;CharacterSheet&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSheet> getCharacterSheets(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String characterID, String name, String corporationID, String raceID, String doB, String bloodlineID, String ancestryID, String gender, String allianceID, String factionID, String description, String securityStatus) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "raceID", raceID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "doB", doB));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bloodlineID", bloodlineID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ancestryID", ancestryID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "allianceID", allianceID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factionID", factionID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "securityStatus", securityStatus));

    
    
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
   * @param homeStationID Home station ID selector (optional, default to { any: true })
   * @param homeStationType Home station type selector (optional, default to { any: true })
   * @param lastStationChangeDate Last station change date selector (optional, default to { any: true })
   * @return List&lt;CharacterSheetClone&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSheetClone> getCloneJumpTimers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String cloneJumpDate, String homeStationID, String homeStationType, String lastStationChangeDate) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "homeStationID", homeStationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "homeStationType", homeStationType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastStationChangeDate", lastStationChangeDate));

    
    
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
   * @param sentDate Contact notification send date selector (optional, default to { any: true })
   * @param standingLevel Contact notification standing level selector (optional, default to { any: true })
   * @param messageData Contact notification message data selector (optional, default to { any: true })
   * @return List&lt;CharacterContactNotification&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterContactNotification> getContactNotifications(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String notificationID, String senderID, String sentDate, String standingLevel, String messageData) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentDate", sentDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "standingLevel", standingLevel));
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
   * Get character ship fitting items
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param fittingID Ship fitting item fitting ID selector (optional, default to { any: true })
   * @param typeID Ship fitting item type ID selector (optional, default to { any: true })
   * @param flag Ship fitting item flag selector (optional, default to { any: true })
   * @param quantity Ship fitting item quantity selector (optional, default to { any: true })
   * @return List&lt;FittingItem&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FittingItem> getFittingItems(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String fittingID, String typeID, String flag, String quantity) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFittingItems");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFittingItems");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/fitting_items".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fittingID", fittingID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "typeID", typeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flag", flag));
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

    GenericType<List<FittingItem>> localVarReturnType = new GenericType<List<FittingItem>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character ship fittings
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param fittingID Ship fitting ID selector (optional, default to { any: true })
   * @param name Ship fitting name selector (optional, default to { any: true })
   * @param description Ship fitting description selector (optional, default to { any: true })
   * @param shipTypeID Ship fitting ship type ID selector (optional, default to { any: true })
   * @return List&lt;Fitting&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Fitting> getFittings(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String fittingID, String name, String description, String shipTypeID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFittings");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFittings");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/fittings".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fittingID", fittingID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "description", description));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipTypeID", shipTypeID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Fitting>> localVarReturnType = new GenericType<List<Fitting>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get fleet info
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param fleetID Fleet ID selector (optional, default to { any: true })
   * @param isFreeMove Fleet &#39;is free move&#39; selector (optional, default to { any: true })
   * @param isRegistered Fleet &#39;is registered&#39; selector (optional, default to { any: true })
   * @param isVoiceEnabled Fleet &#39;is voice enabled&#39; selector (optional, default to { any: true })
   * @param motd Fleet message of the day selector (optional, default to { any: true })
   * @return List&lt;FleetInfo&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FleetInfo> getFleetInfo(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String fleetID, String isFreeMove, String isRegistered, String isVoiceEnabled, String motd) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFleetInfo");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFleetInfo");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/fleet_info".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fleetID", fleetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isFreeMove", isFreeMove));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isRegistered", isRegistered));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isVoiceEnabled", isVoiceEnabled));
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

    GenericType<List<FleetInfo>> localVarReturnType = new GenericType<List<FleetInfo>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get fleet membership info
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param fleetID Fleet member fleet ID selector (optional, default to { any: true })
   * @param characterID Fleet member character ID selector (optional, default to { any: true })
   * @param joinTime Fleet member join time selector (optional, default to { any: true })
   * @param role Fleet member role selector (optional, default to { any: true })
   * @param roleName Fleet member role name selector (optional, default to { any: true })
   * @param shipTypeID Fleet member ship type ID selector (optional, default to { any: true })
   * @param solarSystemID Fleet member solar system ID selector (optional, default to { any: true })
   * @param squadID Fleet member squad ID selector (optional, default to { any: true })
   * @param stationID Fleet member station ID selector (optional, default to { any: true })
   * @param takesFleetWarp Fleet member &#39;takes fleet warp&#39; selector (optional, default to { any: true })
   * @param wingID Fleet member wing ID selector (optional, default to { any: true })
   * @return List&lt;FleetMember&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FleetMember> getFleetMembers(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String fleetID, String characterID, String joinTime, String role, String roleName, String shipTypeID, String solarSystemID, String squadID, String stationID, String takesFleetWarp, String wingID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFleetMembers");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFleetMembers");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/fleet_members".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fleetID", fleetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "characterID", characterID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "joinTime", joinTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role", role));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "roleName", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipTypeID", shipTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "squadID", squadID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationID", stationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "takesFleetWarp", takesFleetWarp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wingID", wingID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<FleetMember>> localVarReturnType = new GenericType<List<FleetMember>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get fleet squad info
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param fleetID Fleet squad fleet ID selector (optional, default to { any: true })
   * @param wingID Fleet squad wing ID selector (optional, default to { any: true })
   * @param squadID Fleet squad ID selector (optional, default to { any: true })
   * @param name Fleet squad name selector (optional, default to { any: true })
   * @return List&lt;FleetSquad&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FleetSquad> getFleetSquads(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String fleetID, String wingID, String squadID, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFleetSquads");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFleetSquads");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/fleet_squads".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fleetID", fleetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wingID", wingID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "squadID", squadID));
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

    GenericType<List<FleetSquad>> localVarReturnType = new GenericType<List<FleetSquad>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get fleet wing info
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param fleetID Fleet wing fleet ID selector (optional, default to { any: true })
   * @param wingID Fleet wing ID selector (optional, default to { any: true })
   * @param name Fleet wing name selector (optional, default to { any: true })
   * @return List&lt;FleetWing&gt;
   * @throws ApiException if fails to make API call
   */
  public List<FleetWing> getFleetWings(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String fleetID, String wingID, String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getFleetWings");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getFleetWings");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/fleet_wings".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fleetID", fleetID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "wingID", wingID));
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

    GenericType<List<FleetWing>> localVarReturnType = new GenericType<List<FleetWing>>() {};
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
   * @return List&lt;Implant&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Implant> getImplants(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String typeID) throws ApiException {
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
   * @return List&lt;JumpCloneImplant&gt;
   * @throws ApiException if fails to make API call
   */
  public List<JumpCloneImplant> getJumpCloneImplants(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String jumpCloneID, String typeID) throws ApiException {
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
   * @param locationID Jump clone location ID selector (optional, default to { any: true })
   * @param cloneName Clone name selector selector (optional, default to { any: true })
   * @param locationType Location type selector (optional, default to { any: true })
   * @return List&lt;JumpClone&gt;
   * @throws ApiException if fails to make API call
   */
  public List<JumpClone> getJumpClones(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String jumpCloneID, String locationID, String cloneName, String locationType) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationID", locationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cloneName", cloneName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "locationType", locationType));

    
    
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
   * @return List&lt;CharacterSheetJump&gt;
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
   * Get character location
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param solarSystemID Solar system ID selector (optional, default to { any: true })
   * @param stationID Station ID selector (optional, default to { any: true })
   * @param structureID Structure ID selector (optional, default to { any: true })
   * @return List&lt;CharacterLocation&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterLocation> getLocation(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String solarSystemID, String stationID, String structureID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getLocation");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getLocation");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/location".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stationID", stationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "structureID", structureID));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterLocation>> localVarReturnType = new GenericType<List<CharacterLocation>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character loyalty points
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param corporationID Corporation ID selector (optional, default to { any: true })
   * @param loyaltyPoints Loyalty points selector (optional, default to { any: true })
   * @return List&lt;LoyaltyPoints&gt;
   * @throws ApiException if fails to make API call
   */
  public List<LoyaltyPoints> getLoyaltyPoints(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String corporationID, String loyaltyPoints) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getLoyaltyPoints");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getLoyaltyPoints");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/loyalty_points".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "corporationID", corporationID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loyaltyPoints", loyaltyPoints));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<LoyaltyPoints>> localVarReturnType = new GenericType<List<LoyaltyPoints>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character mail labels
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param labelID Mail label ID selector (optional, default to { any: true })
   * @param unreadCount Mail label unread count selector (optional, default to { any: true })
   * @param name Mail label name selector (optional, default to { any: true })
   * @param color Mail label color selector (optional, default to { any: true })
   * @return List&lt;MailLabel&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MailLabel> getMailLabels(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String labelID, String unreadCount, String name, String color) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMailLabels");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMailLabels");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/mail_label".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "labelID", labelID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unreadCount", unreadCount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "color", color));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MailLabel>> localVarReturnType = new GenericType<List<MailLabel>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character mail messages
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param messageID Message ID selector (optional, default to { any: true })
   * @param senderID Message sender ID selector (optional, default to { any: true })
   * @param sentDate Message send date selector (optional, default to { any: true })
   * @param title Message title selector (optional, default to { any: true })
   * @param msgRead Message read selector (optional, default to { any: true })
   * @param labelID Message label ID selector (optional, default to { any: true })
   * @param recipientType Message recipient type selector (optional, default to { any: true })
   * @param recipientID Message recipient ID selector (optional, default to { any: true })
   * @param body Message body selector (optional, default to { any: true })
   * @return List&lt;CharacterMailMessage&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterMailMessage> getMailMessages(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String messageID, String senderID, String sentDate, String title, String msgRead, String labelID, String recipientType, String recipientID, String body) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentDate", sentDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "msgRead", msgRead));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "labelID", labelID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientType", recipientType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recipientID", recipientID));
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
   * @return List&lt;MailingList&gt;
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
   * Get character medal graphics
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param medalID Medal ID selector (optional, default to { any: true })
   * @param issued Medal issued selector (optional, default to { any: true })
   * @param part Medal graphic part selector (optional, default to { any: true })
   * @param layer Medal graphic layer selector (optional, default to { any: true })
   * @param graphic Medal graphic name selector (optional, default to { any: true })
   * @param color Medal graphic color selector (optional, default to { any: true })
   * @return List&lt;CharacterMedalGraphic&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterMedalGraphic> getMedalGraphics(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String medalID, String issued, String part, String layer, String graphic, String color) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMedalGraphics");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMedalGraphics");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/medal_graphic".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "issued", issued));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "part", part));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "layer", layer));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "graphic", graphic));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "color", color));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterMedalGraphic>> localVarReturnType = new GenericType<List<CharacterMedalGraphic>>() {};
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
   * @return List&lt;CharacterMedal&gt;
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
   * Get character mining ledger
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param date Date selector (optional, default to { any: true })
   * @param solarSystemID Solar system ID selector (optional, default to { any: true })
   * @param typeID Type ID selector (optional, default to { any: true })
   * @param quantity Quantity selector (optional, default to { any: true })
   * @return List&lt;MiningLedger&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MiningLedger> getMiningLedger(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String date, String solarSystemID, String typeID, String quantity) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getMiningLedger");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getMiningLedger");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/mining_ledger".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "solarSystemID", solarSystemID));
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

    GenericType<List<MiningLedger>> localVarReturnType = new GenericType<List<MiningLedger>>() {};
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
   * @param type Notification type selector (optional, default to { any: true })
   * @param senderID Notification sender ID selector (optional, default to { any: true })
   * @param senderType Notification sender type selector (optional, default to { any: true })
   * @param sentDate Notification send date selector (optional, default to { any: true })
   * @param msgRead Notification read selector (optional, default to { any: true })
   * @param text Notification text selector (optional, default to { any: true })
   * @return List&lt;CharacterNotification&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterNotification> getNotifications(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String notificationID, String type, String senderID, String senderType, String sentDate, String msgRead, String text) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderID", senderID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "senderType", senderType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sentDate", sentDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "msgRead", msgRead));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "text", text));

    
    
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
   * Get character online data
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param online Online selector (optional, default to { any: true })
   * @param lastLogin Last login selector (optional, default to { any: true })
   * @param lastLogout Last logout selector (optional, default to { any: true })
   * @param logins Logins selector (optional, default to { any: true })
   * @return List&lt;CharacterOnline&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterOnline> getOnline(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String online, String lastLogin, String lastLogout, String logins) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getOnline");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getOnline");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/online".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "online", online));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastLogin", lastLogin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastLogout", lastLogout));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "logins", logins));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterOnline>> localVarReturnType = new GenericType<List<CharacterOnline>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get opportunities
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param taskID Opportunity task ID selector (optional, default to { any: true })
   * @param completedAt Opportunity &#39;completed at&#39; time selector (optional, default to { any: true })
   * @return List&lt;Opportunity&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Opportunity> getOpportunities(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String taskID, String completedAt) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getOpportunities");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getOpportunities");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/opportunities".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "taskID", taskID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "completedAt", completedAt));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Opportunity>> localVarReturnType = new GenericType<List<Opportunity>>() {};
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
   * @param planetType Planet type selector (optional, default to { any: true })
   * @param ownerID Colony owner ID selector (optional, default to { any: true })
   * @param lastUpdate Colony last update selector (optional, default to { any: true })
   * @param upgradeLevel Colony upgrade level selector (optional, default to { any: true })
   * @param numberOfPins Colony number of pins selector (optional, default to { any: true })
   * @return List&lt;PlanetaryColony&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PlanetaryColony> getPlanetaryColonies(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String planetID, String solarSystemID, String planetType, String ownerID, String lastUpdate, String upgradeLevel, String numberOfPins) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planetType", planetType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerID", ownerID));
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
   * @return List&lt;PlanetaryLink&gt;
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
   * @param schematicID Pin schematic ID selector (optional, default to { any: true })
   * @param lastCycleStart Pin last cycle start selector (optional, default to { any: true })
   * @param cycleTime Pin cycle time selector (optional, default to { any: true })
   * @param quantityPerCycle Pin quantity per cycle selector (optional, default to { any: true })
   * @param installTime Pin install time selector (optional, default to { any: true })
   * @param expiryTime Pin expiry time selector (optional, default to { any: true })
   * @param productTypeID Pin product type ID selector (optional, default to { any: true })
   * @param longitude Pin longitude selector (optional, default to { any: true })
   * @param latitude Pin latitude selector (optional, default to { any: true })
   * @param headRadius Pin head radius selector (optional, default to { any: true })
   * @param headID Pin head ID selector (optional, default to { any: true })
   * @param headLongitude Pin head longitude selector (optional, default to { any: true })
   * @param headLatitude Pin head latitude selector (optional, default to { any: true })
   * @param contentTypeID Pin content type ID selector (optional, default to { any: true })
   * @param contentAmount Pin content amount selector (optional, default to { any: true })
   * @return List&lt;PlanetaryPin&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PlanetaryPin> getPlanetaryPins(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String planetID, String pinID, String typeID, String schematicID, String lastCycleStart, String cycleTime, String quantityPerCycle, String installTime, String expiryTime, String productTypeID, String longitude, String latitude, String headRadius, String headID, String headLongitude, String headLatitude, String contentTypeID, String contentAmount) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schematicID", schematicID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastCycleStart", lastCycleStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cycleTime", cycleTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantityPerCycle", quantityPerCycle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "installTime", installTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expiryTime", expiryTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productTypeID", productTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "headRadius", headRadius));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "headID", headID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "headLongitude", headLongitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "headLatitude", headLatitude));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentTypeID", contentTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "contentAmount", contentAmount));

    
    
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
   * @param quantity Route quantity selector (optional, default to { any: true })
   * @param waypoint Route waypoint selector (optional, default to { any: true })
   * @return List&lt;PlanetaryRoute&gt;
   * @throws ApiException if fails to make API call
   */
  public List<PlanetaryRoute> getPlanetaryRoutes(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String planetID, String routeID, String sourcePinID, String destinationPinID, String contentTypeID, String quantity, String waypoint) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "waypoint", waypoint));

    
    
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
   * @param pointsPerDay Agent points per day selector (optional, default to { any: true })
   * @param remainderPoints Agent remainder points selector (optional, default to { any: true })
   * @param researchStartDate Agent research start date selector (optional, default to { any: true })
   * @param skillTypeID Agent skill type ID selector (optional, default to { any: true })
   * @return List&lt;ResearchAgent&gt;
   * @throws ApiException if fails to make API call
   */
  public List<ResearchAgent> getResearchAgents(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String agentID, String pointsPerDay, String remainderPoints, String researchStartDate, String skillTypeID) throws ApiException {
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
   * @param roleName Role name selector (optional, default to { any: true })
   * @return List&lt;CharacterRole&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterRole> getRoles(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String roleCategory, String roleName) throws ApiException {
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
   * Get character ship type
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param shipTypeID Ship type ID selector (optional, default to { any: true })
   * @param shipItemID Ship item ID selector (optional, default to { any: true })
   * @param shipName Ship name selector (optional, default to { any: true })
   * @return List&lt;CharacterShip&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterShip> getShipType(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String shipTypeID, String shipItemID, String shipName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getShipType");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getShipType");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/ship_type".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipTypeID", shipTypeID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipItemID", shipItemID));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "shipName", shipName));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterShip>> localVarReturnType = new GenericType<List<CharacterShip>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get character skill points
   * 
   * @param accessKey Model access key (required)
   * @param accessCred Model access credential (required)
   * @param at Model lifeline selector (defaults to current live data) (optional, default to { values: [ "9223372036854775806" ] })
   * @param contid Continuation ID for paged results (optional, default to -1)
   * @param maxresults Maximum number of results to retrieve (optional, default to 1000)
   * @param reverse If true, page backwards (results less than contid) with results in descending order (by cid) (optional, default to false)
   * @param totalSkillPoints Total skill points selector (optional, default to { any: true })
   * @param unallocatedSkillPoints Unallocated skill points selector (optional, default to { any: true })
   * @return List&lt;CharacterSheetSkillPoints&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSheetSkillPoints> getSkillPoints(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String totalSkillPoints, String unallocatedSkillPoints) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accessKey' is set
    if (accessKey == null) {
      throw new ApiException(400, "Missing the required parameter 'accessKey' when calling getSkillPoints");
    }
    
    // verify the required parameter 'accessCred' is set
    if (accessCred == null) {
      throw new ApiException(400, "Missing the required parameter 'accessCred' when calling getSkillPoints");
    }
    
    // create path and map variables
    String localVarPath = "/ws/v1/char/skill_points".replaceAll("\\{format\\}","json");

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "totalSkillPoints", totalSkillPoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "unallocatedSkillPoints", unallocatedSkillPoints));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<CharacterSheetSkillPoints>> localVarReturnType = new GenericType<List<CharacterSheetSkillPoints>>() {};
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
   * @param trainedSkillLevel Trained skill level selector (optional, default to { any: true })
   * @param skillpoints Skill points selector (optional, default to { any: true })
   * @param activeSkillLevel Active skill level selector (optional, default to { any: true })
   * @return List&lt;CharacterSkill&gt;
   * @throws ApiException if fails to make API call
   */
  public List<CharacterSkill> getSkills(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String typeID, String trainedSkillLevel, String skillpoints, String activeSkillLevel) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trainedSkillLevel", trainedSkillLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "skillpoints", skillpoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "activeSkillLevel", activeSkillLevel));

    
    
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
   * @param trainingStartSP Training start skill point selector (optional, default to { any: true })
   * @return List&lt;SkillInQueue&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SkillInQueue> getSkillsInQueue(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String endSP, String endTime, String level, String queuePosition, String startSP, String startTime, String typeID, String trainingStartSP) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trainingStartSP", trainingStartSP));

    
    
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
   * @return List&lt;CharacterTitle&gt;
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
   * @param importance Importance selector (optional, default to { any: true })
   * @param ownerType Event owner type selector (optional, default to { any: true })
   * @return List&lt;UpcomingCalendarEvent&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UpcomingCalendarEvent> getUpcomingCalendarEvents(Integer accessKey, String accessCred, String at, Long contid, Integer maxresults, Boolean reverse, String duration, String eventDate, String eventID, String eventText, String eventTitle, String ownerID, String ownerName, String response, String importance, String ownerType) throws ApiException {
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "importance", importance));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ownerType", ownerType));

    
    
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
