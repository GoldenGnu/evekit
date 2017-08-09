# CharacterApi

All URIs are relative to *https://evekit-model.orbital.enterprises//api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountStatus**](CharacterApi.md#getAccountStatus) | **GET** /ws/v1/char/account_status | Get account status(es)
[**getBalances**](CharacterApi.md#getBalances) | **GET** /ws/v1/char/balance | Get character sheet balance
[**getCalendarEventAttendees**](CharacterApi.md#getCalendarEventAttendees) | **GET** /ws/v1/char/calendar_event_attendees | Get calendar event attendees
[**getChannelMembers**](CharacterApi.md#getChannelMembers) | **GET** /ws/v1/char/channel_member | Get chat channel members
[**getChannels**](CharacterApi.md#getChannels) | **GET** /ws/v1/char/channel | Get character chat channels
[**getCharacterSheets**](CharacterApi.md#getCharacterSheets) | **GET** /ws/v1/char/sheet | Get character sheet
[**getCloneJumpTimers**](CharacterApi.md#getCloneJumpTimers) | **GET** /ws/v1/char/clone_jump_timer | Get character clone jump timers
[**getContactNotifications**](CharacterApi.md#getContactNotifications) | **GET** /ws/v1/char/contact_notification | Get character contact notifications
[**getImplants**](CharacterApi.md#getImplants) | **GET** /ws/v1/char/implant | Get character implants
[**getJumpCloneImplants**](CharacterApi.md#getJumpCloneImplants) | **GET** /ws/v1/char/jump_clone_implant | Get character jump clone implants
[**getJumpClones**](CharacterApi.md#getJumpClones) | **GET** /ws/v1/char/jump_clone | Get character jump clones
[**getJumpTimers**](CharacterApi.md#getJumpTimers) | **GET** /ws/v1/char/jump_timer | Get character jump timers
[**getMailMessageBodies**](CharacterApi.md#getMailMessageBodies) | **GET** /ws/v1/char/mail_message_body | Get character mail message bodies
[**getMailMessages**](CharacterApi.md#getMailMessages) | **GET** /ws/v1/char/mail_message | Get character mail messages (not bodies)
[**getMailingLists**](CharacterApi.md#getMailingLists) | **GET** /ws/v1/char/mailing_list | Get character mailing lists
[**getMedals**](CharacterApi.md#getMedals) | **GET** /ws/v1/char/medal | Get character medals
[**getNotificationBodies**](CharacterApi.md#getNotificationBodies) | **GET** /ws/v1/char/notification_body | Get character notification bodies
[**getNotifications**](CharacterApi.md#getNotifications) | **GET** /ws/v1/char/notification | Get character notifications (not bodies)
[**getPlanetaryColonies**](CharacterApi.md#getPlanetaryColonies) | **GET** /ws/v1/char/planetary_colony | Get planetary colonies
[**getPlanetaryLinks**](CharacterApi.md#getPlanetaryLinks) | **GET** /ws/v1/char/planetary_link | Get planetary links
[**getPlanetaryPins**](CharacterApi.md#getPlanetaryPins) | **GET** /ws/v1/char/planetary_pin | Get planetary pins
[**getPlanetaryRoutes**](CharacterApi.md#getPlanetaryRoutes) | **GET** /ws/v1/char/planetary_route | Get planetary routes
[**getResearchAgents**](CharacterApi.md#getResearchAgents) | **GET** /ws/v1/char/research_agent | Get character research agents
[**getRoles**](CharacterApi.md#getRoles) | **GET** /ws/v1/char/role | Get character roles
[**getSkills**](CharacterApi.md#getSkills) | **GET** /ws/v1/char/skill | Get character skills
[**getSkillsInQueue**](CharacterApi.md#getSkillsInQueue) | **GET** /ws/v1/char/skill_queue | Get character skill queue
[**getSkillsInTraining**](CharacterApi.md#getSkillsInTraining) | **GET** /ws/v1/char/skill_in_training | Get character skill in training
[**getTitles**](CharacterApi.md#getTitles) | **GET** /ws/v1/char/title | Get character titles
[**getUpcomingCalendarEvents**](CharacterApi.md#getUpcomingCalendarEvents) | **GET** /ws/v1/char/calendar_events | Get upcoming calendar events


<a name="getAccountStatus"></a>
# **getAccountStatus**
> List&lt;AccountStatus&gt; getAccountStatus(accessKey, accessCred, at, contid, maxresults, reverse, paidUntil, createDate, logonCount, logonMinutes, multiCharacterTraining)

Get account status(es)



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String paidUntil = "{ any: true }"; // String | Account status paid until selector
String createDate = "{ any: true }"; // String | Account status create date selector
String logonCount = "{ any: true }"; // String | Account status logon count selector
String logonMinutes = "{ any: true }"; // String | Account status logon minutes selector
String multiCharacterTraining = "{ any: true }"; // String | Account status multi-character training selector
try {
    List<AccountStatus> result = apiInstance.getAccountStatus(accessKey, accessCred, at, contid, maxresults, reverse, paidUntil, createDate, logonCount, logonMinutes, multiCharacterTraining);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getAccountStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **paidUntil** | **String**| Account status paid until selector | [optional] [default to { any: true }]
 **createDate** | **String**| Account status create date selector | [optional] [default to { any: true }]
 **logonCount** | **String**| Account status logon count selector | [optional] [default to { any: true }]
 **logonMinutes** | **String**| Account status logon minutes selector | [optional] [default to { any: true }]
 **multiCharacterTraining** | **String**| Account status multi-character training selector | [optional] [default to { any: true }]

### Return type

[**List&lt;AccountStatus&gt;**](AccountStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBalances"></a>
# **getBalances**
> List&lt;CharacterSheetBalance&gt; getBalances(accessKey, accessCred, at, contid, maxresults, reverse, balance)

Get character sheet balance



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String balance = "{ any: true }"; // String | Balance selector
try {
    List<CharacterSheetBalance> result = apiInstance.getBalances(accessKey, accessCred, at, contid, maxresults, reverse, balance);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **balance** | **String**| Balance selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterSheetBalance&gt;**](CharacterSheetBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCalendarEventAttendees"></a>
# **getCalendarEventAttendees**
> List&lt;CalendarEventAttendee&gt; getCalendarEventAttendees(accessKey, accessCred, at, contid, maxresults, reverse, eventID, characterID, characterName, response)

Get calendar event attendees



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String eventID = "{ any: true }"; // String | Calendar event ID selector
String characterID = "{ any: true }"; // String | Attending character ID selector
String characterName = "{ any: true }"; // String | Attending character name selector
String response = "{ any: true }"; // String | Attendee response selector
try {
    List<CalendarEventAttendee> result = apiInstance.getCalendarEventAttendees(accessKey, accessCred, at, contid, maxresults, reverse, eventID, characterID, characterName, response);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getCalendarEventAttendees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **eventID** | **String**| Calendar event ID selector | [optional] [default to { any: true }]
 **characterID** | **String**| Attending character ID selector | [optional] [default to { any: true }]
 **characterName** | **String**| Attending character name selector | [optional] [default to { any: true }]
 **response** | **String**| Attendee response selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CalendarEventAttendee&gt;**](CalendarEventAttendee.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannelMembers"></a>
# **getChannelMembers**
> List&lt;ChatChannelMember&gt; getChannelMembers(accessKey, accessCred, at, contid, maxresults, reverse, channelID, category, accessorID, accessorName, untilWhen, reason)

Get chat channel members



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String channelID = "{ any: true }"; // String | Channel ID selector
String category = "{ any: true }"; // String | Member category selector
String accessorID = "{ any: true }"; // String | Member accessor ID selector
String accessorName = "{ any: true }"; // String | Member accessor name selector
String untilWhen = "{ any: true }"; // String | Member restriction \"until when\" date selector
String reason = "{ any: true }"; // String | Member restriction reason selector
try {
    List<ChatChannelMember> result = apiInstance.getChannelMembers(accessKey, accessCred, at, contid, maxresults, reverse, channelID, category, accessorID, accessorName, untilWhen, reason);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getChannelMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **channelID** | **String**| Channel ID selector | [optional] [default to { any: true }]
 **category** | **String**| Member category selector | [optional] [default to { any: true }]
 **accessorID** | **String**| Member accessor ID selector | [optional] [default to { any: true }]
 **accessorName** | **String**| Member accessor name selector | [optional] [default to { any: true }]
 **untilWhen** | **String**| Member restriction \&quot;until when\&quot; date selector | [optional] [default to { any: true }]
 **reason** | **String**| Member restriction reason selector | [optional] [default to { any: true }]

### Return type

[**List&lt;ChatChannelMember&gt;**](ChatChannelMember.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChannels"></a>
# **getChannels**
> List&lt;ChatChannel&gt; getChannels(accessKey, accessCred, at, contid, maxresults, reverse, channelID, ownerID, ownerName, displayName, comparisonKey, hasPassword, motd)

Get character chat channels



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String channelID = "{ any: true }"; // String | Channel ID selector
String ownerID = "{ any: true }"; // String | Channel owner ID selector
String ownerName = "{ any: true }"; // String | Channel owner name selector
String displayName = "{ any: true }"; // String | Channel display name selector
String comparisonKey = "{ any: true }"; // String | Channel comparison key selector
String hasPassword = "{ any: true }"; // String | Channel has password selector
String motd = "{ any: true }"; // String | Channel Message of the Day selector
try {
    List<ChatChannel> result = apiInstance.getChannels(accessKey, accessCred, at, contid, maxresults, reverse, channelID, ownerID, ownerName, displayName, comparisonKey, hasPassword, motd);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **channelID** | **String**| Channel ID selector | [optional] [default to { any: true }]
 **ownerID** | **String**| Channel owner ID selector | [optional] [default to { any: true }]
 **ownerName** | **String**| Channel owner name selector | [optional] [default to { any: true }]
 **displayName** | **String**| Channel display name selector | [optional] [default to { any: true }]
 **comparisonKey** | **String**| Channel comparison key selector | [optional] [default to { any: true }]
 **hasPassword** | **String**| Channel has password selector | [optional] [default to { any: true }]
 **motd** | **String**| Channel Message of the Day selector | [optional] [default to { any: true }]

### Return type

[**List&lt;ChatChannel&gt;**](ChatChannel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharacterSheets"></a>
# **getCharacterSheets**
> List&lt;CharacterSheet&gt; getCharacterSheets(accessKey, accessCred, at, contid, maxresults, reverse, characterID, name, corporationID, corporationName, race, doB, bloodlineID, bloodline, ancestryID, ancestry, gender, allianceName, allianceID, factionName, factionID, intelligence, memory, charisma, perception, willpower, homeStationID, lastRespecDate, lastTimedRespec, freeRespecs, freeSkillPoints, remoteStationDate)

Get character sheet



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String characterID = "{ any: true }"; // String | Character ID selector
String name = "{ any: true }"; // String | Name selector
String corporationID = "{ any: true }"; // String | Corporation ID selector
String corporationName = "{ any: true }"; // String | Corporation name selector
String race = "{ any: true }"; // String | Race selector
String doB = "{ any: true }"; // String | Date of birth selector
String bloodlineID = "{ any: true }"; // String | Bloodline ID selector
String bloodline = "{ any: true }"; // String | Bloodline selector
String ancestryID = "{ any: true }"; // String | Ancestry ID selector
String ancestry = "{ any: true }"; // String | Ancestry selector
String gender = "{ any: true }"; // String | Gender selector
String allianceName = "{ any: true }"; // String | Alliance name selector
String allianceID = "{ any: true }"; // String | Alliance ID selector
String factionName = "{ any: true }"; // String | Faction name selector
String factionID = "{ any: true }"; // String | Faction ID selector
String intelligence = "{ any: true }"; // String | Intelligence selector
String memory = "{ any: true }"; // String | Memory selector
String charisma = "{ any: true }"; // String | Charisma selector
String perception = "{ any: true }"; // String | Perception selector
String willpower = "{ any: true }"; // String | Willpower selector
String homeStationID = "{ any: true }"; // String | Home station ID selector
String lastRespecDate = "{ any: true }"; // String | Last respec date selector
String lastTimedRespec = "{ any: true }"; // String | Last timed respec selector
String freeRespecs = "{ any: true }"; // String | Free respecs selector
String freeSkillPoints = "{ any: true }"; // String | Free skill points selector
String remoteStationDate = "{ any: true }"; // String | Remote station date selector
try {
    List<CharacterSheet> result = apiInstance.getCharacterSheets(accessKey, accessCred, at, contid, maxresults, reverse, characterID, name, corporationID, corporationName, race, doB, bloodlineID, bloodline, ancestryID, ancestry, gender, allianceName, allianceID, factionName, factionID, intelligence, memory, charisma, perception, willpower, homeStationID, lastRespecDate, lastTimedRespec, freeRespecs, freeSkillPoints, remoteStationDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getCharacterSheets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **characterID** | **String**| Character ID selector | [optional] [default to { any: true }]
 **name** | **String**| Name selector | [optional] [default to { any: true }]
 **corporationID** | **String**| Corporation ID selector | [optional] [default to { any: true }]
 **corporationName** | **String**| Corporation name selector | [optional] [default to { any: true }]
 **race** | **String**| Race selector | [optional] [default to { any: true }]
 **doB** | **String**| Date of birth selector | [optional] [default to { any: true }]
 **bloodlineID** | **String**| Bloodline ID selector | [optional] [default to { any: true }]
 **bloodline** | **String**| Bloodline selector | [optional] [default to { any: true }]
 **ancestryID** | **String**| Ancestry ID selector | [optional] [default to { any: true }]
 **ancestry** | **String**| Ancestry selector | [optional] [default to { any: true }]
 **gender** | **String**| Gender selector | [optional] [default to { any: true }]
 **allianceName** | **String**| Alliance name selector | [optional] [default to { any: true }]
 **allianceID** | **String**| Alliance ID selector | [optional] [default to { any: true }]
 **factionName** | **String**| Faction name selector | [optional] [default to { any: true }]
 **factionID** | **String**| Faction ID selector | [optional] [default to { any: true }]
 **intelligence** | **String**| Intelligence selector | [optional] [default to { any: true }]
 **memory** | **String**| Memory selector | [optional] [default to { any: true }]
 **charisma** | **String**| Charisma selector | [optional] [default to { any: true }]
 **perception** | **String**| Perception selector | [optional] [default to { any: true }]
 **willpower** | **String**| Willpower selector | [optional] [default to { any: true }]
 **homeStationID** | **String**| Home station ID selector | [optional] [default to { any: true }]
 **lastRespecDate** | **String**| Last respec date selector | [optional] [default to { any: true }]
 **lastTimedRespec** | **String**| Last timed respec selector | [optional] [default to { any: true }]
 **freeRespecs** | **String**| Free respecs selector | [optional] [default to { any: true }]
 **freeSkillPoints** | **String**| Free skill points selector | [optional] [default to { any: true }]
 **remoteStationDate** | **String**| Remote station date selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterSheet&gt;**](CharacterSheet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCloneJumpTimers"></a>
# **getCloneJumpTimers**
> List&lt;CharacterSheetClone&gt; getCloneJumpTimers(accessKey, accessCred, at, contid, maxresults, reverse, cloneJumpDate)

Get character clone jump timers



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String cloneJumpDate = "{ any: true }"; // String | Clone jump date selector
try {
    List<CharacterSheetClone> result = apiInstance.getCloneJumpTimers(accessKey, accessCred, at, contid, maxresults, reverse, cloneJumpDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getCloneJumpTimers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **cloneJumpDate** | **String**| Clone jump date selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterSheetClone&gt;**](CharacterSheetClone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactNotifications"></a>
# **getContactNotifications**
> List&lt;CharacterContactNotification&gt; getContactNotifications(accessKey, accessCred, at, contid, maxresults, reverse, notificationID, senderID, senderName, sentDate, messageData)

Get character contact notifications



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String notificationID = "{ any: true }"; // String | Notification ID selector
String senderID = "{ any: true }"; // String | Contact notification sender ID selector
String senderName = "{ any: true }"; // String | Contact notification sender name selector
String sentDate = "{ any: true }"; // String | Contact notification send date selector
String messageData = "{ any: true }"; // String | Contact notification message data selector
try {
    List<CharacterContactNotification> result = apiInstance.getContactNotifications(accessKey, accessCred, at, contid, maxresults, reverse, notificationID, senderID, senderName, sentDate, messageData);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getContactNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **notificationID** | **String**| Notification ID selector | [optional] [default to { any: true }]
 **senderID** | **String**| Contact notification sender ID selector | [optional] [default to { any: true }]
 **senderName** | **String**| Contact notification sender name selector | [optional] [default to { any: true }]
 **sentDate** | **String**| Contact notification send date selector | [optional] [default to { any: true }]
 **messageData** | **String**| Contact notification message data selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterContactNotification&gt;**](CharacterContactNotification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getImplants"></a>
# **getImplants**
> List&lt;Implant&gt; getImplants(accessKey, accessCred, at, contid, maxresults, reverse, typeID, typeName)

Get character implants



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String typeID = "{ any: true }"; // String | Implant type ID selector
String typeName = "{ any: true }"; // String | Implant type name selector
try {
    List<Implant> result = apiInstance.getImplants(accessKey, accessCred, at, contid, maxresults, reverse, typeID, typeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getImplants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **typeID** | **String**| Implant type ID selector | [optional] [default to { any: true }]
 **typeName** | **String**| Implant type name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Implant&gt;**](Implant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJumpCloneImplants"></a>
# **getJumpCloneImplants**
> List&lt;JumpCloneImplant&gt; getJumpCloneImplants(accessKey, accessCred, at, contid, maxresults, reverse, jumpCloneID, typeID, typeName)

Get character jump clone implants



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String jumpCloneID = "{ any: true }"; // String | Jump clone ID selector
String typeID = "{ any: true }"; // String | Implant type ID selector
String typeName = "{ any: true }"; // String | Implant type name selector
try {
    List<JumpCloneImplant> result = apiInstance.getJumpCloneImplants(accessKey, accessCred, at, contid, maxresults, reverse, jumpCloneID, typeID, typeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getJumpCloneImplants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **jumpCloneID** | **String**| Jump clone ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Implant type ID selector | [optional] [default to { any: true }]
 **typeName** | **String**| Implant type name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;JumpCloneImplant&gt;**](JumpCloneImplant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJumpClones"></a>
# **getJumpClones**
> List&lt;JumpClone&gt; getJumpClones(accessKey, accessCred, at, contid, maxresults, reverse, jumpCloneID, typeID, locationID, cloneName)

Get character jump clones



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String jumpCloneID = "{ any: true }"; // String | Jump clone ID selector
String typeID = "{ any: true }"; // String | Jump clone type ID selector
String locationID = "{ any: true }"; // String | Jump clone location ID selector
String cloneName = "{ any: true }"; // String | Clone name selector selector
try {
    List<JumpClone> result = apiInstance.getJumpClones(accessKey, accessCred, at, contid, maxresults, reverse, jumpCloneID, typeID, locationID, cloneName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getJumpClones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **jumpCloneID** | **String**| Jump clone ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Jump clone type ID selector | [optional] [default to { any: true }]
 **locationID** | **String**| Jump clone location ID selector | [optional] [default to { any: true }]
 **cloneName** | **String**| Clone name selector selector | [optional] [default to { any: true }]

### Return type

[**List&lt;JumpClone&gt;**](JumpClone.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJumpTimers"></a>
# **getJumpTimers**
> List&lt;CharacterSheetJump&gt; getJumpTimers(accessKey, accessCred, at, contid, maxresults, reverse, jumpActivation, jumpFatigue, jumpLastUpdate)

Get character jump timers



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String jumpActivation = "{ any: true }"; // String | Jump activation selector
String jumpFatigue = "{ any: true }"; // String | Jump fatigue selector
String jumpLastUpdate = "{ any: true }"; // String | Jump last update time selector
try {
    List<CharacterSheetJump> result = apiInstance.getJumpTimers(accessKey, accessCred, at, contid, maxresults, reverse, jumpActivation, jumpFatigue, jumpLastUpdate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getJumpTimers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **jumpActivation** | **String**| Jump activation selector | [optional] [default to { any: true }]
 **jumpFatigue** | **String**| Jump fatigue selector | [optional] [default to { any: true }]
 **jumpLastUpdate** | **String**| Jump last update time selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterSheetJump&gt;**](CharacterSheetJump.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMailMessageBodies"></a>
# **getMailMessageBodies**
> List&lt;CharacterMailMessageBody&gt; getMailMessageBodies(accessKey, accessCred, at, contid, maxresults, reverse, messageID, retrieved, body)

Get character mail message bodies



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String messageID = "{ any: true }"; // String | Mail message ID selector
String retrieved = "{ any: true }"; // String | Mail message body retrieved selector
String body = "{ any: true }"; // String | Mail message body selector
try {
    List<CharacterMailMessageBody> result = apiInstance.getMailMessageBodies(accessKey, accessCred, at, contid, maxresults, reverse, messageID, retrieved, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getMailMessageBodies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **messageID** | **String**| Mail message ID selector | [optional] [default to { any: true }]
 **retrieved** | **String**| Mail message body retrieved selector | [optional] [default to { any: true }]
 **body** | **String**| Mail message body selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterMailMessageBody&gt;**](CharacterMailMessageBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMailMessages"></a>
# **getMailMessages**
> List&lt;CharacterMailMessage&gt; getMailMessages(accessKey, accessCred, at, contid, maxresults, reverse, messageID, senderID, senderName, toCharacterID, sentDate, title, toCorpOrAllianceID, toListID, msgRead, senderTypeID)

Get character mail messages (not bodies)



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String messageID = "{ any: true }"; // String | Message ID selector
String senderID = "{ any: true }"; // String | Message sender ID selector
String senderName = "{ any: true }"; // String | Message sender name selector
String toCharacterID = "{ any: true }"; // String | Message destination character ID selector
String sentDate = "{ any: true }"; // String | Message send date selector
String title = "{ any: true }"; // String | Message title selector
String toCorpOrAllianceID = "{ any: true }"; // String | Message corporation or alliance ID selector
String toListID = "{ any: true }"; // String | Message destination list ID selector
String msgRead = "{ any: true }"; // String | Message read selector
String senderTypeID = "{ any: true }"; // String | Message sender type ID selector
try {
    List<CharacterMailMessage> result = apiInstance.getMailMessages(accessKey, accessCred, at, contid, maxresults, reverse, messageID, senderID, senderName, toCharacterID, sentDate, title, toCorpOrAllianceID, toListID, msgRead, senderTypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getMailMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **messageID** | **String**| Message ID selector | [optional] [default to { any: true }]
 **senderID** | **String**| Message sender ID selector | [optional] [default to { any: true }]
 **senderName** | **String**| Message sender name selector | [optional] [default to { any: true }]
 **toCharacterID** | **String**| Message destination character ID selector | [optional] [default to { any: true }]
 **sentDate** | **String**| Message send date selector | [optional] [default to { any: true }]
 **title** | **String**| Message title selector | [optional] [default to { any: true }]
 **toCorpOrAllianceID** | **String**| Message corporation or alliance ID selector | [optional] [default to { any: true }]
 **toListID** | **String**| Message destination list ID selector | [optional] [default to { any: true }]
 **msgRead** | **String**| Message read selector | [optional] [default to { any: true }]
 **senderTypeID** | **String**| Message sender type ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterMailMessage&gt;**](CharacterMailMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMailingLists"></a>
# **getMailingLists**
> List&lt;MailingList&gt; getMailingLists(accessKey, accessCred, at, contid, maxresults, reverse, displayName, listID)

Get character mailing lists



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String displayName = "{ any: true }"; // String | Mailing list display name selector
String listID = "{ any: true }"; // String | Mailing list ID selector
try {
    List<MailingList> result = apiInstance.getMailingLists(accessKey, accessCred, at, contid, maxresults, reverse, displayName, listID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getMailingLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **displayName** | **String**| Mailing list display name selector | [optional] [default to { any: true }]
 **listID** | **String**| Mailing list ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;MailingList&gt;**](MailingList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMedals"></a>
# **getMedals**
> List&lt;CharacterMedal&gt; getMedals(accessKey, accessCred, at, contid, maxresults, reverse, description, medalID, title, corporationID, issued, issuerID, reason, status)

Get character medals



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String description = "{ any: true }"; // String | Medal description selector
String medalID = "{ any: true }"; // String | Medal ID selector
String title = "{ any: true }"; // String | Medal title selector
String corporationID = "{ any: true }"; // String | Awarding corporation ID selector
String issued = "{ any: true }"; // String | Issue date selector
String issuerID = "{ any: true }"; // String | Issuer ID selector
String reason = "{ any: true }"; // String | Medal award reason selector
String status = "{ any: true }"; // String | Medal status selector
try {
    List<CharacterMedal> result = apiInstance.getMedals(accessKey, accessCred, at, contid, maxresults, reverse, description, medalID, title, corporationID, issued, issuerID, reason, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getMedals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **description** | **String**| Medal description selector | [optional] [default to { any: true }]
 **medalID** | **String**| Medal ID selector | [optional] [default to { any: true }]
 **title** | **String**| Medal title selector | [optional] [default to { any: true }]
 **corporationID** | **String**| Awarding corporation ID selector | [optional] [default to { any: true }]
 **issued** | **String**| Issue date selector | [optional] [default to { any: true }]
 **issuerID** | **String**| Issuer ID selector | [optional] [default to { any: true }]
 **reason** | **String**| Medal award reason selector | [optional] [default to { any: true }]
 **status** | **String**| Medal status selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterMedal&gt;**](CharacterMedal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNotificationBodies"></a>
# **getNotificationBodies**
> List&lt;CharacterNotificationBody&gt; getNotificationBodies(accessKey, accessCred, at, contid, maxresults, reverse, notificationID, retrieved, text, missing)

Get character notification bodies



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String notificationID = "{ any: true }"; // String | Notification ID selector
String retrieved = "{ any: true }"; // String | Body retrieved selector
String text = "{ any: true }"; // String | Notification text selector
String missing = "{ any: true }"; // String | Notification missing selector
try {
    List<CharacterNotificationBody> result = apiInstance.getNotificationBodies(accessKey, accessCred, at, contid, maxresults, reverse, notificationID, retrieved, text, missing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getNotificationBodies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **notificationID** | **String**| Notification ID selector | [optional] [default to { any: true }]
 **retrieved** | **String**| Body retrieved selector | [optional] [default to { any: true }]
 **text** | **String**| Notification text selector | [optional] [default to { any: true }]
 **missing** | **String**| Notification missing selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterNotificationBody&gt;**](CharacterNotificationBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNotifications"></a>
# **getNotifications**
> List&lt;CharacterNotification&gt; getNotifications(accessKey, accessCred, at, contid, maxresults, reverse, notificationID, typeID, senderID, sentDate, msgRead)

Get character notifications (not bodies)



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String notificationID = "{ any: true }"; // String | Notification ID selector
String typeID = "{ any: true }"; // String | Notification type ID selector
String senderID = "{ any: true }"; // String | Notification sender ID selector
String sentDate = "{ any: true }"; // String | Notification send date selector
String msgRead = "{ any: true }"; // String | Notification read selector
try {
    List<CharacterNotification> result = apiInstance.getNotifications(accessKey, accessCred, at, contid, maxresults, reverse, notificationID, typeID, senderID, sentDate, msgRead);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **notificationID** | **String**| Notification ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Notification type ID selector | [optional] [default to { any: true }]
 **senderID** | **String**| Notification sender ID selector | [optional] [default to { any: true }]
 **sentDate** | **String**| Notification send date selector | [optional] [default to { any: true }]
 **msgRead** | **String**| Notification read selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterNotification&gt;**](CharacterNotification.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlanetaryColonies"></a>
# **getPlanetaryColonies**
> List&lt;PlanetaryColony&gt; getPlanetaryColonies(accessKey, accessCred, at, contid, maxresults, reverse, planetID, solarSystemID, solarSystemName, planetName, planetTypeID, planetTypeName, ownerID, ownerName, lastUpdate, upgradeLevel, numberOfPins)

Get planetary colonies



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String planetID = "{ any: true }"; // String | Planet ID selector
String solarSystemID = "{ any: true }"; // String | Solar system ID selector
String solarSystemName = "{ any: true }"; // String | Solar system name selector
String planetName = "{ any: true }"; // String | Planet name selector
String planetTypeID = "{ any: true }"; // String | Planet type ID selector
String planetTypeName = "{ any: true }"; // String | Planet type name selector
String ownerID = "{ any: true }"; // String | Colony owner ID selector
String ownerName = "{ any: true }"; // String | Colony owner name selector
String lastUpdate = "{ any: true }"; // String | Colony last update selector
String upgradeLevel = "{ any: true }"; // String | Colony upgrade level selector
String numberOfPins = "{ any: true }"; // String | Colony number of pins selector
try {
    List<PlanetaryColony> result = apiInstance.getPlanetaryColonies(accessKey, accessCred, at, contid, maxresults, reverse, planetID, solarSystemID, solarSystemName, planetName, planetTypeID, planetTypeName, ownerID, ownerName, lastUpdate, upgradeLevel, numberOfPins);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getPlanetaryColonies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **planetID** | **String**| Planet ID selector | [optional] [default to { any: true }]
 **solarSystemID** | **String**| Solar system ID selector | [optional] [default to { any: true }]
 **solarSystemName** | **String**| Solar system name selector | [optional] [default to { any: true }]
 **planetName** | **String**| Planet name selector | [optional] [default to { any: true }]
 **planetTypeID** | **String**| Planet type ID selector | [optional] [default to { any: true }]
 **planetTypeName** | **String**| Planet type name selector | [optional] [default to { any: true }]
 **ownerID** | **String**| Colony owner ID selector | [optional] [default to { any: true }]
 **ownerName** | **String**| Colony owner name selector | [optional] [default to { any: true }]
 **lastUpdate** | **String**| Colony last update selector | [optional] [default to { any: true }]
 **upgradeLevel** | **String**| Colony upgrade level selector | [optional] [default to { any: true }]
 **numberOfPins** | **String**| Colony number of pins selector | [optional] [default to { any: true }]

### Return type

[**List&lt;PlanetaryColony&gt;**](PlanetaryColony.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlanetaryLinks"></a>
# **getPlanetaryLinks**
> List&lt;PlanetaryLink&gt; getPlanetaryLinks(accessKey, accessCred, at, contid, maxresults, reverse, planetID, sourcePinID, destinationPinID, linkLevel)

Get planetary links



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String planetID = "{ any: true }"; // String | Planet ID selector
String sourcePinID = "{ any: true }"; // String | Link source pin ID selector
String destinationPinID = "{ any: true }"; // String | Link destination pin ID selector
String linkLevel = "{ any: true }"; // String | Link level selector
try {
    List<PlanetaryLink> result = apiInstance.getPlanetaryLinks(accessKey, accessCred, at, contid, maxresults, reverse, planetID, sourcePinID, destinationPinID, linkLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getPlanetaryLinks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **planetID** | **String**| Planet ID selector | [optional] [default to { any: true }]
 **sourcePinID** | **String**| Link source pin ID selector | [optional] [default to { any: true }]
 **destinationPinID** | **String**| Link destination pin ID selector | [optional] [default to { any: true }]
 **linkLevel** | **String**| Link level selector | [optional] [default to { any: true }]

### Return type

[**List&lt;PlanetaryLink&gt;**](PlanetaryLink.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlanetaryPins"></a>
# **getPlanetaryPins**
> List&lt;PlanetaryPin&gt; getPlanetaryPins(accessKey, accessCred, at, contid, maxresults, reverse, planetID, pinID, typeID, typeName, schematicID, lastLaunchTime, cycleTime, quantityPerCycle, installTime, expiryTime, contentTypeID, contentTypeName, contentQuantity, longitude, latitude)

Get planetary pins



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String planetID = "{ any: true }"; // String | Planet ID selector
String pinID = "{ any: true }"; // String | Pin ID selector
String typeID = "{ any: true }"; // String | Pin type ID selector
String typeName = "{ any: true }"; // String | Pin type name selector
String schematicID = "{ any: true }"; // String | Pin schematic ID selector
String lastLaunchTime = "{ any: true }"; // String | Pin last launch time selector
String cycleTime = "{ any: true }"; // String | Pin cycle time selector
String quantityPerCycle = "{ any: true }"; // String | Pin quantity per cycle selector
String installTime = "{ any: true }"; // String | Pin install time selector
String expiryTime = "{ any: true }"; // String | Pin expiry time selector
String contentTypeID = "{ any: true }"; // String | Pin content type ID selector
String contentTypeName = "{ any: true }"; // String | Pin content type name selector
String contentQuantity = "{ any: true }"; // String | Pin content quantity selector
String longitude = "{ any: true }"; // String | Pin longitude selector
String latitude = "{ any: true }"; // String | Pin latitude selector
try {
    List<PlanetaryPin> result = apiInstance.getPlanetaryPins(accessKey, accessCred, at, contid, maxresults, reverse, planetID, pinID, typeID, typeName, schematicID, lastLaunchTime, cycleTime, quantityPerCycle, installTime, expiryTime, contentTypeID, contentTypeName, contentQuantity, longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getPlanetaryPins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **planetID** | **String**| Planet ID selector | [optional] [default to { any: true }]
 **pinID** | **String**| Pin ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Pin type ID selector | [optional] [default to { any: true }]
 **typeName** | **String**| Pin type name selector | [optional] [default to { any: true }]
 **schematicID** | **String**| Pin schematic ID selector | [optional] [default to { any: true }]
 **lastLaunchTime** | **String**| Pin last launch time selector | [optional] [default to { any: true }]
 **cycleTime** | **String**| Pin cycle time selector | [optional] [default to { any: true }]
 **quantityPerCycle** | **String**| Pin quantity per cycle selector | [optional] [default to { any: true }]
 **installTime** | **String**| Pin install time selector | [optional] [default to { any: true }]
 **expiryTime** | **String**| Pin expiry time selector | [optional] [default to { any: true }]
 **contentTypeID** | **String**| Pin content type ID selector | [optional] [default to { any: true }]
 **contentTypeName** | **String**| Pin content type name selector | [optional] [default to { any: true }]
 **contentQuantity** | **String**| Pin content quantity selector | [optional] [default to { any: true }]
 **longitude** | **String**| Pin longitude selector | [optional] [default to { any: true }]
 **latitude** | **String**| Pin latitude selector | [optional] [default to { any: true }]

### Return type

[**List&lt;PlanetaryPin&gt;**](PlanetaryPin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlanetaryRoutes"></a>
# **getPlanetaryRoutes**
> List&lt;PlanetaryRoute&gt; getPlanetaryRoutes(accessKey, accessCred, at, contid, maxresults, reverse, planetID, routeID, sourcePinID, destinationPinID, contentTypeID, contentTypeName, quantity, waypoint1, waypoint2, waypoint3, waypoint4, waypoint5)

Get planetary routes



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String planetID = "{ any: true }"; // String | Planet ID selector
String routeID = "{ any: true }"; // String | Route ID selector
String sourcePinID = "{ any: true }"; // String | Route source pin ID selector
String destinationPinID = "{ any: true }"; // String | Route destination pin ID selector
String contentTypeID = "{ any: true }"; // String | Route content type ID selector
String contentTypeName = "{ any: true }"; // String | Route content type name selector
String quantity = "{ any: true }"; // String | Route quantity selector
String waypoint1 = "{ any: true }"; // String | Route waypoint 1 selector
String waypoint2 = "{ any: true }"; // String | Route waypoint 2 selector
String waypoint3 = "{ any: true }"; // String | Route waypoint 3 selector
String waypoint4 = "{ any: true }"; // String | Route waypoint 4 selector
String waypoint5 = "{ any: true }"; // String | Route waypoint 5 selector
try {
    List<PlanetaryRoute> result = apiInstance.getPlanetaryRoutes(accessKey, accessCred, at, contid, maxresults, reverse, planetID, routeID, sourcePinID, destinationPinID, contentTypeID, contentTypeName, quantity, waypoint1, waypoint2, waypoint3, waypoint4, waypoint5);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getPlanetaryRoutes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **planetID** | **String**| Planet ID selector | [optional] [default to { any: true }]
 **routeID** | **String**| Route ID selector | [optional] [default to { any: true }]
 **sourcePinID** | **String**| Route source pin ID selector | [optional] [default to { any: true }]
 **destinationPinID** | **String**| Route destination pin ID selector | [optional] [default to { any: true }]
 **contentTypeID** | **String**| Route content type ID selector | [optional] [default to { any: true }]
 **contentTypeName** | **String**| Route content type name selector | [optional] [default to { any: true }]
 **quantity** | **String**| Route quantity selector | [optional] [default to { any: true }]
 **waypoint1** | **String**| Route waypoint 1 selector | [optional] [default to { any: true }]
 **waypoint2** | **String**| Route waypoint 2 selector | [optional] [default to { any: true }]
 **waypoint3** | **String**| Route waypoint 3 selector | [optional] [default to { any: true }]
 **waypoint4** | **String**| Route waypoint 4 selector | [optional] [default to { any: true }]
 **waypoint5** | **String**| Route waypoint 5 selector | [optional] [default to { any: true }]

### Return type

[**List&lt;PlanetaryRoute&gt;**](PlanetaryRoute.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResearchAgents"></a>
# **getResearchAgents**
> List&lt;ResearchAgent&gt; getResearchAgents(accessKey, accessCred, at, contid, maxresults, reverse, agentID, currentPoints, pointsPerDay, remainderPoints, researchStartDate, skillTypeID)

Get character research agents



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String agentID = "{ any: true }"; // String | Research agent ID selector
String currentPoints = "{ any: true }"; // String | Agent current points selector
String pointsPerDay = "{ any: true }"; // String | Agent points per day selector
String remainderPoints = "{ any: true }"; // String | Agent remainder points selector
String researchStartDate = "{ any: true }"; // String | Agent research start date selector
String skillTypeID = "{ any: true }"; // String | Agent skill type ID selector
try {
    List<ResearchAgent> result = apiInstance.getResearchAgents(accessKey, accessCred, at, contid, maxresults, reverse, agentID, currentPoints, pointsPerDay, remainderPoints, researchStartDate, skillTypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getResearchAgents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **agentID** | **String**| Research agent ID selector | [optional] [default to { any: true }]
 **currentPoints** | **String**| Agent current points selector | [optional] [default to { any: true }]
 **pointsPerDay** | **String**| Agent points per day selector | [optional] [default to { any: true }]
 **remainderPoints** | **String**| Agent remainder points selector | [optional] [default to { any: true }]
 **researchStartDate** | **String**| Agent research start date selector | [optional] [default to { any: true }]
 **skillTypeID** | **String**| Agent skill type ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;ResearchAgent&gt;**](ResearchAgent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRoles"></a>
# **getRoles**
> List&lt;CharacterRole&gt; getRoles(accessKey, accessCred, at, contid, maxresults, reverse, roleCategory, roleID, roleName)

Get character roles



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String roleCategory = "{ any: true }"; // String | Role category selector
String roleID = "{ any: true }"; // String | Role ID selector
String roleName = "{ any: true }"; // String | Role name selector
try {
    List<CharacterRole> result = apiInstance.getRoles(accessKey, accessCred, at, contid, maxresults, reverse, roleCategory, roleID, roleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **roleCategory** | **String**| Role category selector | [optional] [default to { any: true }]
 **roleID** | **String**| Role ID selector | [optional] [default to { any: true }]
 **roleName** | **String**| Role name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterRole&gt;**](CharacterRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSkills"></a>
# **getSkills**
> List&lt;CharacterSkill&gt; getSkills(accessKey, accessCred, at, contid, maxresults, reverse, typeID, level, skillpoints, published)

Get character skills



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String typeID = "{ any: true }"; // String | Skill type ID selector
String level = "{ any: true }"; // String | Skill level selector
String skillpoints = "{ any: true }"; // String | Skill points selector
String published = "{ any: true }"; // String | Published skill selector
try {
    List<CharacterSkill> result = apiInstance.getSkills(accessKey, accessCred, at, contid, maxresults, reverse, typeID, level, skillpoints, published);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getSkills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **typeID** | **String**| Skill type ID selector | [optional] [default to { any: true }]
 **level** | **String**| Skill level selector | [optional] [default to { any: true }]
 **skillpoints** | **String**| Skill points selector | [optional] [default to { any: true }]
 **published** | **String**| Published skill selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterSkill&gt;**](CharacterSkill.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSkillsInQueue"></a>
# **getSkillsInQueue**
> List&lt;SkillInQueue&gt; getSkillsInQueue(accessKey, accessCred, at, contid, maxresults, reverse, endSP, endTime, level, queuePosition, startSP, startTime, typeID)

Get character skill queue



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String endSP = "{ any: true }"; // String | Skill ending skill points selector
String endTime = "{ any: true }"; // String | Skill training end time selector
String level = "{ any: true }"; // String | Skill training to level selector
String queuePosition = "{ any: true }"; // String | Queue position selector
String startSP = "{ any: true }"; // String | Starting skill points selector
String startTime = "{ any: true }"; // String | Training start time selector
String typeID = "{ any: true }"; // String | Skill type ID selector
try {
    List<SkillInQueue> result = apiInstance.getSkillsInQueue(accessKey, accessCred, at, contid, maxresults, reverse, endSP, endTime, level, queuePosition, startSP, startTime, typeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getSkillsInQueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **endSP** | **String**| Skill ending skill points selector | [optional] [default to { any: true }]
 **endTime** | **String**| Skill training end time selector | [optional] [default to { any: true }]
 **level** | **String**| Skill training to level selector | [optional] [default to { any: true }]
 **queuePosition** | **String**| Queue position selector | [optional] [default to { any: true }]
 **startSP** | **String**| Starting skill points selector | [optional] [default to { any: true }]
 **startTime** | **String**| Training start time selector | [optional] [default to { any: true }]
 **typeID** | **String**| Skill type ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;SkillInQueue&gt;**](SkillInQueue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSkillsInTraining"></a>
# **getSkillsInTraining**
> List&lt;CharacterSkillInTraining&gt; getSkillsInTraining(accessKey, accessCred, at, contid, maxresults, reverse, skillInTraining, currentTrainingQueueTime, trainingStartTime, trainingEndTime, trainingStartSP, trainingDestinationSP, trainingToLevel, skillTypeID)

Get character skill in training



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String skillInTraining = "{ any: true }"; // String | Skill in training selector
String currentTrainingQueueTime = "{ any: true }"; // String | Current taining queue time selector
String trainingStartTime = "{ any: true }"; // String | Training start time selector
String trainingEndTime = "{ any: true }"; // String | Training end time selector
String trainingStartSP = "{ any: true }"; // String | Training start skill points selector
String trainingDestinationSP = "{ any: true }"; // String | Training destination skill points selector
String trainingToLevel = "{ any: true }"; // String | Training to level selector
String skillTypeID = "{ any: true }"; // String | Skill type ID selector
try {
    List<CharacterSkillInTraining> result = apiInstance.getSkillsInTraining(accessKey, accessCred, at, contid, maxresults, reverse, skillInTraining, currentTrainingQueueTime, trainingStartTime, trainingEndTime, trainingStartSP, trainingDestinationSP, trainingToLevel, skillTypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getSkillsInTraining");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **skillInTraining** | **String**| Skill in training selector | [optional] [default to { any: true }]
 **currentTrainingQueueTime** | **String**| Current taining queue time selector | [optional] [default to { any: true }]
 **trainingStartTime** | **String**| Training start time selector | [optional] [default to { any: true }]
 **trainingEndTime** | **String**| Training end time selector | [optional] [default to { any: true }]
 **trainingStartSP** | **String**| Training start skill points selector | [optional] [default to { any: true }]
 **trainingDestinationSP** | **String**| Training destination skill points selector | [optional] [default to { any: true }]
 **trainingToLevel** | **String**| Training to level selector | [optional] [default to { any: true }]
 **skillTypeID** | **String**| Skill type ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterSkillInTraining&gt;**](CharacterSkillInTraining.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTitles"></a>
# **getTitles**
> List&lt;CharacterTitle&gt; getTitles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, titleName)

Get character titles



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String titleID = "{ any: true }"; // String | Character title ID selector
String titleName = "{ any: true }"; // String | Character title name selector
try {
    List<CharacterTitle> result = apiInstance.getTitles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, titleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getTitles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **titleID** | **String**| Character title ID selector | [optional] [default to { any: true }]
 **titleName** | **String**| Character title name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CharacterTitle&gt;**](CharacterTitle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpcomingCalendarEvents"></a>
# **getUpcomingCalendarEvents**
> List&lt;UpcomingCalendarEvent&gt; getUpcomingCalendarEvents(accessKey, accessCred, at, contid, maxresults, reverse, duration, eventDate, eventID, eventText, eventTitle, ownerID, ownerName, response, important, ownerTypeID)

Get upcoming calendar events



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CharacterApi;


CharacterApi apiInstance = new CharacterApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String duration = "{ any: true }"; // String | Event duration selector
String eventDate = "{ any: true }"; // String | Event date selector (milliseconds UTC)
String eventID = "{ any: true }"; // String | Event ID selector
String eventText = "{ any: true }"; // String | Event text selector
String eventTitle = "{ any: true }"; // String | Event title selector
String ownerID = "{ any: true }"; // String | Owner ID selector
String ownerName = "{ any: true }"; // String | Owner name selector
String response = "{ any: true }"; // String | Response text selector
String important = "{ any: true }"; // String | Important flag selector
String ownerTypeID = "{ any: true }"; // String | Event owner type ID selector
try {
    List<UpcomingCalendarEvent> result = apiInstance.getUpcomingCalendarEvents(accessKey, accessCred, at, contid, maxresults, reverse, duration, eventDate, eventID, eventText, eventTitle, ownerID, ownerName, response, important, ownerTypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CharacterApi#getUpcomingCalendarEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **at** | **String**| Model lifeline selector (defaults to current live data) | [optional] [default to { values: [ &quot;9223372036854775806&quot; ] }]
 **contid** | **Long**| Continuation ID for paged results | [optional] [default to -1]
 **maxresults** | **Integer**| Maximum number of results to retrieve | [optional] [default to 1000]
 **reverse** | **Boolean**| If true, page backwards (results less than contid) with results in descending order (by cid) | [optional] [default to false]
 **duration** | **String**| Event duration selector | [optional] [default to { any: true }]
 **eventDate** | **String**| Event date selector (milliseconds UTC) | [optional] [default to { any: true }]
 **eventID** | **String**| Event ID selector | [optional] [default to { any: true }]
 **eventText** | **String**| Event text selector | [optional] [default to { any: true }]
 **eventTitle** | **String**| Event title selector | [optional] [default to { any: true }]
 **ownerID** | **String**| Owner ID selector | [optional] [default to { any: true }]
 **ownerName** | **String**| Owner name selector | [optional] [default to { any: true }]
 **response** | **String**| Response text selector | [optional] [default to { any: true }]
 **important** | **String**| Important flag selector | [optional] [default to { any: true }]
 **ownerTypeID** | **String**| Event owner type ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;UpcomingCalendarEvent&gt;**](UpcomingCalendarEvent.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

