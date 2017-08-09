# CorporationApi

All URIs are relative to *https://evekit-model.orbital.enterprises//api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContainerLogs**](CorporationApi.md#getContainerLogs) | **GET** /ws/v1/corp/container_log | Get container log records
[**getCorporationMedals**](CorporationApi.md#getCorporationMedals) | **GET** /ws/v1/corp/medal | Get corporation medals
[**getCorporationSheet**](CorporationApi.md#getCorporationSheet) | **GET** /ws/v1/corp/sheet | Get corporation sheet
[**getCorporationTitles**](CorporationApi.md#getCorporationTitles) | **GET** /ws/v1/corp/title | Get corporation titles
[**getCustomsOffices**](CorporationApi.md#getCustomsOffices) | **GET** /ws/v1/corp/customs_office | Get corporation customs offices
[**getDivisions**](CorporationApi.md#getDivisions) | **GET** /ws/v1/corp/division | Get corporation divisions
[**getFacilities**](CorporationApi.md#getFacilities) | **GET** /ws/v1/corp/facility | Get corporation facilities
[**getFuel**](CorporationApi.md#getFuel) | **GET** /ws/v1/corp/fuel | Get corporation starbase fuel levels
[**getMemberMedals**](CorporationApi.md#getMemberMedals) | **GET** /ws/v1/corp/member_medal | Get medals awarded to corporation members
[**getMemberSecurity**](CorporationApi.md#getMemberSecurity) | **GET** /ws/v1/corp/member_security | Get corporation member security settings
[**getMemberSecurityLog**](CorporationApi.md#getMemberSecurityLog) | **GET** /ws/v1/corp/member_security_log | Get corporation member security log entries
[**getMemberTracking**](CorporationApi.md#getMemberTracking) | **GET** /ws/v1/corp/member_tracking | Get member tracking information
[**getOutpostServiceDetails**](CorporationApi.md#getOutpostServiceDetails) | **GET** /ws/v1/corp/outpost_service_detail | Get corporation outpost service detail
[**getOutposts**](CorporationApi.md#getOutposts) | **GET** /ws/v1/corp/outpost | Get corporation outposts
[**getRoles**](CorporationApi.md#getRoles) | **GET** /ws/v1/corp/role | Get corporation title roles
[**getSecurityRoles**](CorporationApi.md#getSecurityRoles) | **GET** /ws/v1/corp/security_role | Get corporation security roles
[**getSecurityTitles**](CorporationApi.md#getSecurityTitles) | **GET** /ws/v1/corp/security_title | Get corporation security titles
[**getShareholders**](CorporationApi.md#getShareholders) | **GET** /ws/v1/corp/shareholder | Get corporation shareholders
[**getStarbaseDetails**](CorporationApi.md#getStarbaseDetails) | **GET** /ws/v1/corp/starbase_detail | Get corporation starbase details
[**getStarbases**](CorporationApi.md#getStarbases) | **GET** /ws/v1/corp/starbase | Get corporation starbases


<a name="getContainerLogs"></a>
# **getContainerLogs**
> List&lt;ContainerLog&gt; getContainerLogs(accessKey, accessCred, at, contid, maxresults, reverse, logTime, action, actorID, actorName, flag, itemID, itemTypeID, locationID, newConfiguration, oldConfiguration, passwordType, quantity, typeID)

Get container log records



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String logTime = "{ any: true }"; // String | Corporation container log time selector
String action = "{ any: true }"; // String | Corporation container log action selector
String actorID = "{ any: true }"; // String | Corporation container log actor ID selector
String actorName = "{ any: true }"; // String | Corporation container log actor name selector
String flag = "{ any: true }"; // String | Corporation container log flag selector
String itemID = "{ any: true }"; // String | Corporation container log item ID selector
String itemTypeID = "{ any: true }"; // String | Corporation container log item type ID selector
String locationID = "{ any: true }"; // String | Corporation container log location ID selector
String newConfiguration = "{ any: true }"; // String | Corporation container log new configuration selector
String oldConfiguration = "{ any: true }"; // String | Corporation container log old configuration selector
String passwordType = "{ any: true }"; // String | Corporation container log password type selector
String quantity = "{ any: true }"; // String | Corporation container log quantity selector
String typeID = "{ any: true }"; // String | Corporation container log type ID selector
try {
    List<ContainerLog> result = apiInstance.getContainerLogs(accessKey, accessCred, at, contid, maxresults, reverse, logTime, action, actorID, actorName, flag, itemID, itemTypeID, locationID, newConfiguration, oldConfiguration, passwordType, quantity, typeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getContainerLogs");
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
 **logTime** | **String**| Corporation container log time selector | [optional] [default to { any: true }]
 **action** | **String**| Corporation container log action selector | [optional] [default to { any: true }]
 **actorID** | **String**| Corporation container log actor ID selector | [optional] [default to { any: true }]
 **actorName** | **String**| Corporation container log actor name selector | [optional] [default to { any: true }]
 **flag** | **String**| Corporation container log flag selector | [optional] [default to { any: true }]
 **itemID** | **String**| Corporation container log item ID selector | [optional] [default to { any: true }]
 **itemTypeID** | **String**| Corporation container log item type ID selector | [optional] [default to { any: true }]
 **locationID** | **String**| Corporation container log location ID selector | [optional] [default to { any: true }]
 **newConfiguration** | **String**| Corporation container log new configuration selector | [optional] [default to { any: true }]
 **oldConfiguration** | **String**| Corporation container log old configuration selector | [optional] [default to { any: true }]
 **passwordType** | **String**| Corporation container log password type selector | [optional] [default to { any: true }]
 **quantity** | **String**| Corporation container log quantity selector | [optional] [default to { any: true }]
 **typeID** | **String**| Corporation container log type ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;ContainerLog&gt;**](ContainerLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationMedals"></a>
# **getCorporationMedals**
> List&lt;CorporationMedal&gt; getCorporationMedals(accessKey, accessCred, at, contid, maxresults, reverse, medalID, description, title, created, creatorID)

Get corporation medals



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String medalID = "{ any: true }"; // String | Corporation medal ID selector
String description = "{ any: true }"; // String | Corporation medal description selector
String title = "{ any: true }"; // String | Corporation medal title selector
String created = "{ any: true }"; // String | Corporation medal created date selector
String creatorID = "{ any: true }"; // String | Corporation medal creator ID selector
try {
    List<CorporationMedal> result = apiInstance.getCorporationMedals(accessKey, accessCred, at, contid, maxresults, reverse, medalID, description, title, created, creatorID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationMedals");
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
 **medalID** | **String**| Corporation medal ID selector | [optional] [default to { any: true }]
 **description** | **String**| Corporation medal description selector | [optional] [default to { any: true }]
 **title** | **String**| Corporation medal title selector | [optional] [default to { any: true }]
 **created** | **String**| Corporation medal created date selector | [optional] [default to { any: true }]
 **creatorID** | **String**| Corporation medal creator ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CorporationMedal&gt;**](CorporationMedal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationSheet"></a>
# **getCorporationSheet**
> List&lt;CorporationSheet&gt; getCorporationSheet(accessKey, accessCred, at, contid, maxresults, reverse, allianceID, allianceName, ceoID, ceoName, corporationID, corporationName, description, logoColor1, logoColor2, logoColor3, logoGraphicID, logoShape1, logoShape2, logoShape3, memberCount, memberLimit, shares, stationID, stationName, taxRate, ticker, url)

Get corporation sheet



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String allianceID = "{ any: true }"; // String | Corporation alliance ID selector
String allianceName = "{ any: true }"; // String | Corporation alliance name selector
String ceoID = "{ any: true }"; // String | Corporation CEO ID selector
String ceoName = "{ any: true }"; // String | Corporation CEO name selector
String corporationID = "{ any: true }"; // String | Corporation ID selector
String corporationName = "{ any: true }"; // String | Corporation name selector
String description = "{ any: true }"; // String | Corporation description selector
String logoColor1 = "{ any: true }"; // String | Corporation first logo color selector
String logoColor2 = "{ any: true }"; // String | Corporation second logo color selector
String logoColor3 = "{ any: true }"; // String | Corporation third logo color selector
String logoGraphicID = "{ any: true }"; // String | Corporation logo graphic ID selector
String logoShape1 = "{ any: true }"; // String | Corporation first logo shape selector
String logoShape2 = "{ any: true }"; // String | Corporation second logo shape selector
String logoShape3 = "{ any: true }"; // String | Corporation third logo shape selector
String memberCount = "{ any: true }"; // String | Corporation member count selector
String memberLimit = "{ any: true }"; // String | Corporation member limit selector
String shares = "{ any: true }"; // String | Corporation shares selector
String stationID = "{ any: true }"; // String | Corporation station ID selector
String stationName = "{ any: true }"; // String | Corporation station name selector
String taxRate = "{ any: true }"; // String | Corporation tax rate selector
String ticker = "{ any: true }"; // String | Corporation ticker selector
String url = "{ any: true }"; // String | Corporation URL selector
try {
    List<CorporationSheet> result = apiInstance.getCorporationSheet(accessKey, accessCred, at, contid, maxresults, reverse, allianceID, allianceName, ceoID, ceoName, corporationID, corporationName, description, logoColor1, logoColor2, logoColor3, logoGraphicID, logoShape1, logoShape2, logoShape3, memberCount, memberLimit, shares, stationID, stationName, taxRate, ticker, url);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationSheet");
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
 **allianceID** | **String**| Corporation alliance ID selector | [optional] [default to { any: true }]
 **allianceName** | **String**| Corporation alliance name selector | [optional] [default to { any: true }]
 **ceoID** | **String**| Corporation CEO ID selector | [optional] [default to { any: true }]
 **ceoName** | **String**| Corporation CEO name selector | [optional] [default to { any: true }]
 **corporationID** | **String**| Corporation ID selector | [optional] [default to { any: true }]
 **corporationName** | **String**| Corporation name selector | [optional] [default to { any: true }]
 **description** | **String**| Corporation description selector | [optional] [default to { any: true }]
 **logoColor1** | **String**| Corporation first logo color selector | [optional] [default to { any: true }]
 **logoColor2** | **String**| Corporation second logo color selector | [optional] [default to { any: true }]
 **logoColor3** | **String**| Corporation third logo color selector | [optional] [default to { any: true }]
 **logoGraphicID** | **String**| Corporation logo graphic ID selector | [optional] [default to { any: true }]
 **logoShape1** | **String**| Corporation first logo shape selector | [optional] [default to { any: true }]
 **logoShape2** | **String**| Corporation second logo shape selector | [optional] [default to { any: true }]
 **logoShape3** | **String**| Corporation third logo shape selector | [optional] [default to { any: true }]
 **memberCount** | **String**| Corporation member count selector | [optional] [default to { any: true }]
 **memberLimit** | **String**| Corporation member limit selector | [optional] [default to { any: true }]
 **shares** | **String**| Corporation shares selector | [optional] [default to { any: true }]
 **stationID** | **String**| Corporation station ID selector | [optional] [default to { any: true }]
 **stationName** | **String**| Corporation station name selector | [optional] [default to { any: true }]
 **taxRate** | **String**| Corporation tax rate selector | [optional] [default to { any: true }]
 **ticker** | **String**| Corporation ticker selector | [optional] [default to { any: true }]
 **url** | **String**| Corporation URL selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CorporationSheet&gt;**](CorporationSheet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationTitles"></a>
# **getCorporationTitles**
> List&lt;CorporationTitle&gt; getCorporationTitles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, titleName, grantableRoles, grantableRolesAtBase, grantableRolesAtHQ, grantableRolesAtOther, roles, rolesAtBase, rolesAtHQ, rolesAtOther)

Get corporation titles



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String titleID = "{ any: true }"; // String | Corporation title ID selector
String titleName = "{ any: true }"; // String | Corporation title name selector
String grantableRoles = "{ any: true }"; // String | Corporation title grantable roles selector
String grantableRolesAtBase = "{ any: true }"; // String | Corporation title grantable roles at base selector
String grantableRolesAtHQ = "{ any: true }"; // String | Corporation title grantable roles at HQ selector
String grantableRolesAtOther = "{ any: true }"; // String | Corporation title grantable roles at other selector
String roles = "{ any: true }"; // String | Corporation title roles selector
String rolesAtBase = "{ any: true }"; // String | Corporation title roles at base selector
String rolesAtHQ = "{ any: true }"; // String | Corporation title roles at HQ selector
String rolesAtOther = "{ any: true }"; // String | Corporation title roles at other selector
try {
    List<CorporationTitle> result = apiInstance.getCorporationTitles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, titleName, grantableRoles, grantableRolesAtBase, grantableRolesAtHQ, grantableRolesAtOther, roles, rolesAtBase, rolesAtHQ, rolesAtOther);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCorporationTitles");
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
 **titleID** | **String**| Corporation title ID selector | [optional] [default to { any: true }]
 **titleName** | **String**| Corporation title name selector | [optional] [default to { any: true }]
 **grantableRoles** | **String**| Corporation title grantable roles selector | [optional] [default to { any: true }]
 **grantableRolesAtBase** | **String**| Corporation title grantable roles at base selector | [optional] [default to { any: true }]
 **grantableRolesAtHQ** | **String**| Corporation title grantable roles at HQ selector | [optional] [default to { any: true }]
 **grantableRolesAtOther** | **String**| Corporation title grantable roles at other selector | [optional] [default to { any: true }]
 **roles** | **String**| Corporation title roles selector | [optional] [default to { any: true }]
 **rolesAtBase** | **String**| Corporation title roles at base selector | [optional] [default to { any: true }]
 **rolesAtHQ** | **String**| Corporation title roles at HQ selector | [optional] [default to { any: true }]
 **rolesAtOther** | **String**| Corporation title roles at other selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CorporationTitle&gt;**](CorporationTitle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomsOffices"></a>
# **getCustomsOffices**
> List&lt;CustomsOffice&gt; getCustomsOffices(accessKey, accessCred, at, contid, maxresults, reverse, itemID, solarSystemID, solarSystemName, reinforceHour, allowAlliance, allowStandings, standingLevel, taxRateAlliance, taxRateCorp, taxRateStandingHigh, taxRateStandingGood, taxRateStandingNeutral, taxRateStandingBad, taxRateStandingHorrible)

Get corporation customs offices



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String itemID = "{ any: true }"; // String | Customs office item ID selector
String solarSystemID = "{ any: true }"; // String | Customs office solar system ID selector
String solarSystemName = "{ any: true }"; // String | Customs office solar system name selector
String reinforceHour = "{ any: true }"; // String | Customs office reinforce hour selector
String allowAlliance = "{ any: true }"; // String | Customs office allow alliance selector
String allowStandings = "{ any: true }"; // String | Customs office allow standings selector
String standingLevel = "{ any: true }"; // String | Customs office standing level selector
String taxRateAlliance = "{ any: true }"; // String | Customs office tax rate alliance selector
String taxRateCorp = "{ any: true }"; // String | Customs office tax rate corporation selector
String taxRateStandingHigh = "{ any: true }"; // String | Customs office tax rate standing high selector
String taxRateStandingGood = "{ any: true }"; // String | Customs office tax rate standing good selector
String taxRateStandingNeutral = "{ any: true }"; // String | Customs office tax rate standing neutral selector
String taxRateStandingBad = "{ any: true }"; // String | Customs office tax rate standing bad selector
String taxRateStandingHorrible = "{ any: true }"; // String | Customs office tax rate standing horrible selector
try {
    List<CustomsOffice> result = apiInstance.getCustomsOffices(accessKey, accessCred, at, contid, maxresults, reverse, itemID, solarSystemID, solarSystemName, reinforceHour, allowAlliance, allowStandings, standingLevel, taxRateAlliance, taxRateCorp, taxRateStandingHigh, taxRateStandingGood, taxRateStandingNeutral, taxRateStandingBad, taxRateStandingHorrible);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getCustomsOffices");
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
 **itemID** | **String**| Customs office item ID selector | [optional] [default to { any: true }]
 **solarSystemID** | **String**| Customs office solar system ID selector | [optional] [default to { any: true }]
 **solarSystemName** | **String**| Customs office solar system name selector | [optional] [default to { any: true }]
 **reinforceHour** | **String**| Customs office reinforce hour selector | [optional] [default to { any: true }]
 **allowAlliance** | **String**| Customs office allow alliance selector | [optional] [default to { any: true }]
 **allowStandings** | **String**| Customs office allow standings selector | [optional] [default to { any: true }]
 **standingLevel** | **String**| Customs office standing level selector | [optional] [default to { any: true }]
 **taxRateAlliance** | **String**| Customs office tax rate alliance selector | [optional] [default to { any: true }]
 **taxRateCorp** | **String**| Customs office tax rate corporation selector | [optional] [default to { any: true }]
 **taxRateStandingHigh** | **String**| Customs office tax rate standing high selector | [optional] [default to { any: true }]
 **taxRateStandingGood** | **String**| Customs office tax rate standing good selector | [optional] [default to { any: true }]
 **taxRateStandingNeutral** | **String**| Customs office tax rate standing neutral selector | [optional] [default to { any: true }]
 **taxRateStandingBad** | **String**| Customs office tax rate standing bad selector | [optional] [default to { any: true }]
 **taxRateStandingHorrible** | **String**| Customs office tax rate standing horrible selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CustomsOffice&gt;**](CustomsOffice.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDivisions"></a>
# **getDivisions**
> List&lt;Division&gt; getDivisions(accessKey, accessCred, at, contid, maxresults, reverse, wallet, accountKey, description)

Get corporation divisions



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String wallet = "{ any: true }"; // String | Division wallet indicator selector
String accountKey = "{ any: true }"; // String | Division account key selector
String description = "{ any: true }"; // String | Division description selector
try {
    List<Division> result = apiInstance.getDivisions(accessKey, accessCred, at, contid, maxresults, reverse, wallet, accountKey, description);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getDivisions");
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
 **wallet** | **String**| Division wallet indicator selector | [optional] [default to { any: true }]
 **accountKey** | **String**| Division account key selector | [optional] [default to { any: true }]
 **description** | **String**| Division description selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Division&gt;**](Division.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFacilities"></a>
# **getFacilities**
> List&lt;Facility&gt; getFacilities(accessKey, accessCred, at, contid, maxresults, reverse, facilityID, typeID, typeName, solarSystemID, solarSystemName, regionID, regionName, starbaseModifier, tax)

Get corporation facilities



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String facilityID = "{ any: true }"; // String | Facility ID selector
String typeID = "{ any: true }"; // String | Facility type ID selector
String typeName = "{ any: true }"; // String | Facility type name selector
String solarSystemID = "{ any: true }"; // String | Facility solar system ID selector
String solarSystemName = "{ any: true }"; // String | Facility solar system name selector
String regionID = "{ any: true }"; // String | Facility region ID selector
String regionName = "{ any: true }"; // String | Facility region name selector
String starbaseModifier = "{ any: true }"; // String | Facility starbase modifier selector
String tax = "{ any: true }"; // String | Facility tax selector
try {
    List<Facility> result = apiInstance.getFacilities(accessKey, accessCred, at, contid, maxresults, reverse, facilityID, typeID, typeName, solarSystemID, solarSystemName, regionID, regionName, starbaseModifier, tax);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getFacilities");
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
 **facilityID** | **String**| Facility ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Facility type ID selector | [optional] [default to { any: true }]
 **typeName** | **String**| Facility type name selector | [optional] [default to { any: true }]
 **solarSystemID** | **String**| Facility solar system ID selector | [optional] [default to { any: true }]
 **solarSystemName** | **String**| Facility solar system name selector | [optional] [default to { any: true }]
 **regionID** | **String**| Facility region ID selector | [optional] [default to { any: true }]
 **regionName** | **String**| Facility region name selector | [optional] [default to { any: true }]
 **starbaseModifier** | **String**| Facility starbase modifier selector | [optional] [default to { any: true }]
 **tax** | **String**| Facility tax selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Facility&gt;**](Facility.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFuel"></a>
# **getFuel**
> List&lt;Fuel&gt; getFuel(accessKey, accessCred, at, contid, maxresults, reverse, itemID, typeID, quantity)

Get corporation starbase fuel levels



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String itemID = "{ any: true }"; // String | Fuel item ID selector
String typeID = "{ any: true }"; // String | Fuel type ID selector
String quantity = "{ any: true }"; // String | Fuel quantity selector
try {
    List<Fuel> result = apiInstance.getFuel(accessKey, accessCred, at, contid, maxresults, reverse, itemID, typeID, quantity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getFuel");
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
 **itemID** | **String**| Fuel item ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Fuel type ID selector | [optional] [default to { any: true }]
 **quantity** | **String**| Fuel quantity selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Fuel&gt;**](Fuel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMemberMedals"></a>
# **getMemberMedals**
> List&lt;CorporationMemberMedal&gt; getMemberMedals(accessKey, accessCred, at, contid, maxresults, reverse, medalID, characterID, issued, issuerID, reason, status)

Get medals awarded to corporation members



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String medalID = "{ any: true }"; // String | Member medal ID selector
String characterID = "{ any: true }"; // String | Member medal character ID selector
String issued = "{ any: true }"; // String | Member medal issued date selector
String issuerID = "{ any: true }"; // String | Member medal issuer ID selector
String reason = "{ any: true }"; // String | Member medal reason selector
String status = "{ any: true }"; // String | Member medal status selector
try {
    List<CorporationMemberMedal> result = apiInstance.getMemberMedals(accessKey, accessCred, at, contid, maxresults, reverse, medalID, characterID, issued, issuerID, reason, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getMemberMedals");
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
 **medalID** | **String**| Member medal ID selector | [optional] [default to { any: true }]
 **characterID** | **String**| Member medal character ID selector | [optional] [default to { any: true }]
 **issued** | **String**| Member medal issued date selector | [optional] [default to { any: true }]
 **issuerID** | **String**| Member medal issuer ID selector | [optional] [default to { any: true }]
 **reason** | **String**| Member medal reason selector | [optional] [default to { any: true }]
 **status** | **String**| Member medal status selector | [optional] [default to { any: true }]

### Return type

[**List&lt;CorporationMemberMedal&gt;**](CorporationMemberMedal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMemberSecurity"></a>
# **getMemberSecurity**
> List&lt;MemberSecurity&gt; getMemberSecurity(accessKey, accessCred, at, contid, maxresults, reverse, characterID, name, grantableRoles, grantableRolesAtBase, grantableRolesAtHQ, grantableRolesAtOther, roles, rolesAtBase, rolesAtHQ, rolesAtOther, titles)

Get corporation member security settings



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String characterID = "{ any: true }"; // String | Member security character ID selector
String name = "{ any: true }"; // String | Member security character name selector
String grantableRoles = "{ any: true }"; // String | Member security grantable roles selector
String grantableRolesAtBase = "{ any: true }"; // String | Member security grantable roles at base selector
String grantableRolesAtHQ = "{ any: true }"; // String | Member security grantable roles at HQ selector
String grantableRolesAtOther = "{ any: true }"; // String | Member security grantable roles at other selector
String roles = "{ any: true }"; // String | Member security roles selector
String rolesAtBase = "{ any: true }"; // String | Member security roles at base selector
String rolesAtHQ = "{ any: true }"; // String | Member security roles at HQ selector
String rolesAtOther = "{ any: true }"; // String | Member security roles at other selector
String titles = "{ any: true }"; // String | Member security titles selector
try {
    List<MemberSecurity> result = apiInstance.getMemberSecurity(accessKey, accessCred, at, contid, maxresults, reverse, characterID, name, grantableRoles, grantableRolesAtBase, grantableRolesAtHQ, grantableRolesAtOther, roles, rolesAtBase, rolesAtHQ, rolesAtOther, titles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getMemberSecurity");
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
 **characterID** | **String**| Member security character ID selector | [optional] [default to { any: true }]
 **name** | **String**| Member security character name selector | [optional] [default to { any: true }]
 **grantableRoles** | **String**| Member security grantable roles selector | [optional] [default to { any: true }]
 **grantableRolesAtBase** | **String**| Member security grantable roles at base selector | [optional] [default to { any: true }]
 **grantableRolesAtHQ** | **String**| Member security grantable roles at HQ selector | [optional] [default to { any: true }]
 **grantableRolesAtOther** | **String**| Member security grantable roles at other selector | [optional] [default to { any: true }]
 **roles** | **String**| Member security roles selector | [optional] [default to { any: true }]
 **rolesAtBase** | **String**| Member security roles at base selector | [optional] [default to { any: true }]
 **rolesAtHQ** | **String**| Member security roles at HQ selector | [optional] [default to { any: true }]
 **rolesAtOther** | **String**| Member security roles at other selector | [optional] [default to { any: true }]
 **titles** | **String**| Member security titles selector | [optional] [default to { any: true }]

### Return type

[**List&lt;MemberSecurity&gt;**](MemberSecurity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMemberSecurityLog"></a>
# **getMemberSecurityLog**
> List&lt;MemberSecurityLog&gt; getMemberSecurityLog(accessKey, accessCred, at, contid, maxresults, reverse, changeTime, changedCharacterID, changedCharacterName, issuerID, issuerName, roleLocationType, oldRoles, newRoles)

Get corporation member security log entries



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String changeTime = "{ any: true }"; // String | Member security log change time selector
String changedCharacterID = "{ any: true }"; // String | Member security log changed character ID selector
String changedCharacterName = "{ any: true }"; // String | Member security log changed character name selector
String issuerID = "{ any: true }"; // String | Member security log issuer ID selector
String issuerName = "{ any: true }"; // String | Member security log issuer name selector
String roleLocationType = "{ any: true }"; // String | Member security log role location type selector
String oldRoles = "{ any: true }"; // String | Member security log old roles selector
String newRoles = "{ any: true }"; // String | Member security log new roles selector
try {
    List<MemberSecurityLog> result = apiInstance.getMemberSecurityLog(accessKey, accessCred, at, contid, maxresults, reverse, changeTime, changedCharacterID, changedCharacterName, issuerID, issuerName, roleLocationType, oldRoles, newRoles);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getMemberSecurityLog");
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
 **changeTime** | **String**| Member security log change time selector | [optional] [default to { any: true }]
 **changedCharacterID** | **String**| Member security log changed character ID selector | [optional] [default to { any: true }]
 **changedCharacterName** | **String**| Member security log changed character name selector | [optional] [default to { any: true }]
 **issuerID** | **String**| Member security log issuer ID selector | [optional] [default to { any: true }]
 **issuerName** | **String**| Member security log issuer name selector | [optional] [default to { any: true }]
 **roleLocationType** | **String**| Member security log role location type selector | [optional] [default to { any: true }]
 **oldRoles** | **String**| Member security log old roles selector | [optional] [default to { any: true }]
 **newRoles** | **String**| Member security log new roles selector | [optional] [default to { any: true }]

### Return type

[**List&lt;MemberSecurityLog&gt;**](MemberSecurityLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMemberTracking"></a>
# **getMemberTracking**
> List&lt;MemberTracking&gt; getMemberTracking(accessKey, accessCred, at, contid, maxresults, reverse, characterID, base, baseID, grantableRoles, location, locationID, logoffDateTime, logonDateTime, name, roles, shipType, shipTypeID, startDateTime, title)

Get member tracking information



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String characterID = "{ any: true }"; // String | Member character ID selector
String base = "{ any: true }"; // String | Member base selector
String baseID = "{ any: true }"; // String | Member base ID selector
String grantableRoles = "{ any: true }"; // String | Member grantable roles selector
String location = "{ any: true }"; // String | Member location selector
String locationID = "{ any: true }"; // String | Member location ID selector
String logoffDateTime = "{ any: true }"; // String | Member logoff time selector
String logonDateTime = "{ any: true }"; // String | Member logon time selector
String name = "{ any: true }"; // String | Member name selector
String roles = "{ any: true }"; // String | Member roles selector
String shipType = "{ any: true }"; // String | Member ship type selector
String shipTypeID = "{ any: true }"; // String | Member ship type ID selector
String startDateTime = "{ any: true }"; // String | Member start time selector
String title = "{ any: true }"; // String | Member title selector
try {
    List<MemberTracking> result = apiInstance.getMemberTracking(accessKey, accessCred, at, contid, maxresults, reverse, characterID, base, baseID, grantableRoles, location, locationID, logoffDateTime, logonDateTime, name, roles, shipType, shipTypeID, startDateTime, title);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getMemberTracking");
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
 **characterID** | **String**| Member character ID selector | [optional] [default to { any: true }]
 **base** | **String**| Member base selector | [optional] [default to { any: true }]
 **baseID** | **String**| Member base ID selector | [optional] [default to { any: true }]
 **grantableRoles** | **String**| Member grantable roles selector | [optional] [default to { any: true }]
 **location** | **String**| Member location selector | [optional] [default to { any: true }]
 **locationID** | **String**| Member location ID selector | [optional] [default to { any: true }]
 **logoffDateTime** | **String**| Member logoff time selector | [optional] [default to { any: true }]
 **logonDateTime** | **String**| Member logon time selector | [optional] [default to { any: true }]
 **name** | **String**| Member name selector | [optional] [default to { any: true }]
 **roles** | **String**| Member roles selector | [optional] [default to { any: true }]
 **shipType** | **String**| Member ship type selector | [optional] [default to { any: true }]
 **shipTypeID** | **String**| Member ship type ID selector | [optional] [default to { any: true }]
 **startDateTime** | **String**| Member start time selector | [optional] [default to { any: true }]
 **title** | **String**| Member title selector | [optional] [default to { any: true }]

### Return type

[**List&lt;MemberTracking&gt;**](MemberTracking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutpostServiceDetails"></a>
# **getOutpostServiceDetails**
> List&lt;OutpostServiceDetail&gt; getOutpostServiceDetails(accessKey, accessCred, at, contid, maxresults, reverse, stationID, serviceName, ownerID, minStanding, surchargePerBadStanding, discountPerGoodStanding)

Get corporation outpost service detail



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String stationID = "{ any: true }"; // String | Outpost service detail station ID selector
String serviceName = "{ any: true }"; // String | Outpost service detail service name selector
String ownerID = "{ any: true }"; // String | Outpost service owner ID selector
String minStanding = "{ any: true }"; // String | Outpost service minimum standing selector
String surchargePerBadStanding = "{ any: true }"; // String | Outpost service surcharge per bad standing selector
String discountPerGoodStanding = "{ any: true }"; // String | Outpost service discount per good standing selector
try {
    List<OutpostServiceDetail> result = apiInstance.getOutpostServiceDetails(accessKey, accessCred, at, contid, maxresults, reverse, stationID, serviceName, ownerID, minStanding, surchargePerBadStanding, discountPerGoodStanding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getOutpostServiceDetails");
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
 **stationID** | **String**| Outpost service detail station ID selector | [optional] [default to { any: true }]
 **serviceName** | **String**| Outpost service detail service name selector | [optional] [default to { any: true }]
 **ownerID** | **String**| Outpost service owner ID selector | [optional] [default to { any: true }]
 **minStanding** | **String**| Outpost service minimum standing selector | [optional] [default to { any: true }]
 **surchargePerBadStanding** | **String**| Outpost service surcharge per bad standing selector | [optional] [default to { any: true }]
 **discountPerGoodStanding** | **String**| Outpost service discount per good standing selector | [optional] [default to { any: true }]

### Return type

[**List&lt;OutpostServiceDetail&gt;**](OutpostServiceDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutposts"></a>
# **getOutposts**
> List&lt;Outpost&gt; getOutposts(accessKey, accessCred, at, contid, maxresults, reverse, stationID, ownerID, stationName, solarSystemID, dockingCostPerShipVolume, officeRentalCost, stationTypeID, reprocessingEfficiency, reprocessingStationTake, standingOwnerID, x, y, z)

Get corporation outposts



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String stationID = "{ any: true }"; // String | Outpost station ID selector
String ownerID = "{ any: true }"; // String | Outpost owner ID selector
String stationName = "{ any: true }"; // String | Outpost station name selector
String solarSystemID = "{ any: true }"; // String | Outpost solar system ID selector
String dockingCostPerShipVolume = "{ any: true }"; // String | Outpost docking cost per ship volume selector
String officeRentalCost = "{ any: true }"; // String | Outpost office rental cost selector
String stationTypeID = "{ any: true }"; // String | Outpost station type ID selector
String reprocessingEfficiency = "{ any: true }"; // String | Outpost reprocessing efficiency selector
String reprocessingStationTake = "{ any: true }"; // String | Outpost reprocessing station take selector
String standingOwnerID = "{ any: true }"; // String | Outpost standing owner ID selector
String x = "{ any: true }"; // String | Outpost x coordinate selector
String y = "{ any: true }"; // String | Outpost y coordinate selector
String z = "{ any: true }"; // String | Outpost z coordinate selector
try {
    List<Outpost> result = apiInstance.getOutposts(accessKey, accessCred, at, contid, maxresults, reverse, stationID, ownerID, stationName, solarSystemID, dockingCostPerShipVolume, officeRentalCost, stationTypeID, reprocessingEfficiency, reprocessingStationTake, standingOwnerID, x, y, z);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getOutposts");
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
 **stationID** | **String**| Outpost station ID selector | [optional] [default to { any: true }]
 **ownerID** | **String**| Outpost owner ID selector | [optional] [default to { any: true }]
 **stationName** | **String**| Outpost station name selector | [optional] [default to { any: true }]
 **solarSystemID** | **String**| Outpost solar system ID selector | [optional] [default to { any: true }]
 **dockingCostPerShipVolume** | **String**| Outpost docking cost per ship volume selector | [optional] [default to { any: true }]
 **officeRentalCost** | **String**| Outpost office rental cost selector | [optional] [default to { any: true }]
 **stationTypeID** | **String**| Outpost station type ID selector | [optional] [default to { any: true }]
 **reprocessingEfficiency** | **String**| Outpost reprocessing efficiency selector | [optional] [default to { any: true }]
 **reprocessingStationTake** | **String**| Outpost reprocessing station take selector | [optional] [default to { any: true }]
 **standingOwnerID** | **String**| Outpost standing owner ID selector | [optional] [default to { any: true }]
 **x** | **String**| Outpost x coordinate selector | [optional] [default to { any: true }]
 **y** | **String**| Outpost y coordinate selector | [optional] [default to { any: true }]
 **z** | **String**| Outpost z coordinate selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Outpost&gt;**](Outpost.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRoles"></a>
# **getRoles**
> List&lt;Role&gt; getRoles(accessKey, accessCred, at, contid, maxresults, reverse, roleID, roleDescription, roleName)

Get corporation title roles



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String roleID = "{ any: true }"; // String | Corporation tile role ID selector
String roleDescription = "{ any: true }"; // String | Corporation title role description selector
String roleName = "{ any: true }"; // String | Corporation title role name selector
try {
    List<Role> result = apiInstance.getRoles(accessKey, accessCred, at, contid, maxresults, reverse, roleID, roleDescription, roleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getRoles");
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
 **roleID** | **String**| Corporation tile role ID selector | [optional] [default to { any: true }]
 **roleDescription** | **String**| Corporation title role description selector | [optional] [default to { any: true }]
 **roleName** | **String**| Corporation title role name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Role&gt;**](Role.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityRoles"></a>
# **getSecurityRoles**
> List&lt;SecurityRole&gt; getSecurityRoles(accessKey, accessCred, at, contid, maxresults, reverse, roleID, roleName)

Get corporation security roles



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String roleID = "{ any: true }"; // String | Security role ID selector
String roleName = "{ any: true }"; // String | Security role name selector
try {
    List<SecurityRole> result = apiInstance.getSecurityRoles(accessKey, accessCred, at, contid, maxresults, reverse, roleID, roleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getSecurityRoles");
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
 **roleID** | **String**| Security role ID selector | [optional] [default to { any: true }]
 **roleName** | **String**| Security role name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;SecurityRole&gt;**](SecurityRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSecurityTitles"></a>
# **getSecurityTitles**
> List&lt;SecurityTitle&gt; getSecurityTitles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, titleName)

Get corporation security titles



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String titleID = "{ any: true }"; // String | Security title ID selector
String titleName = "{ any: true }"; // String | Security title name selector
try {
    List<SecurityTitle> result = apiInstance.getSecurityTitles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, titleName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getSecurityTitles");
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
 **titleID** | **String**| Security title ID selector | [optional] [default to { any: true }]
 **titleName** | **String**| Security title name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;SecurityTitle&gt;**](SecurityTitle.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getShareholders"></a>
# **getShareholders**
> List&lt;Shareholder&gt; getShareholders(accessKey, accessCred, at, contid, maxresults, reverse, shareholderID, isCorporation, shareholderCorporationID, shareholderCorporationName, shareholderName, shares)

Get corporation shareholders



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String shareholderID = "{ any: true }"; // String | Shareholder ID selector
String isCorporation = "{ any: true }"; // String | Shareholder is corporation selector
String shareholderCorporationID = "{ any: true }"; // String | Shareholder corporation ID selector
String shareholderCorporationName = "{ any: true }"; // String | Shareholder corporation name selector
String shareholderName = "{ any: true }"; // String | Shareholder name selector
String shares = "{ any: true }"; // String | Shareholder shares selector
try {
    List<Shareholder> result = apiInstance.getShareholders(accessKey, accessCred, at, contid, maxresults, reverse, shareholderID, isCorporation, shareholderCorporationID, shareholderCorporationName, shareholderName, shares);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getShareholders");
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
 **shareholderID** | **String**| Shareholder ID selector | [optional] [default to { any: true }]
 **isCorporation** | **String**| Shareholder is corporation selector | [optional] [default to { any: true }]
 **shareholderCorporationID** | **String**| Shareholder corporation ID selector | [optional] [default to { any: true }]
 **shareholderCorporationName** | **String**| Shareholder corporation name selector | [optional] [default to { any: true }]
 **shareholderName** | **String**| Shareholder name selector | [optional] [default to { any: true }]
 **shares** | **String**| Shareholder shares selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Shareholder&gt;**](Shareholder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStarbaseDetails"></a>
# **getStarbaseDetails**
> List&lt;StarbaseDetail&gt; getStarbaseDetails(accessKey, accessCred, at, contid, maxresults, reverse, itemID, state, stateTimestamp, onlineTimestamp, usageFlags, deployFlags, allowAllianceMembers, allowCorporationMembers, useStandingsFrom, onAggressionEnabled, onAggressionStanding, onCorporationWarEnabled, onCorporationWarStanding, onStandingDropEnabled, onStandingDropStanding, onStatusDropEnabled, onStatusDropStanding)

Get corporation starbase details



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String itemID = "{ any: true }"; // String | Starbase item ID selector
String state = "{ any: true }"; // String | Starbase details state selector
String stateTimestamp = "{ any: true }"; // String | Starbase details state timestamp selector
String onlineTimestamp = "{ any: true }"; // String | Starbase details online timestamp selector
String usageFlags = "{ any: true }"; // String | Starbase details usage flags selector
String deployFlags = "{ any: true }"; // String | Starbase details deploy flags selector
String allowAllianceMembers = "{ any: true }"; // String | Starbase details allow alliance members enabled selector
String allowCorporationMembers = "{ any: true }"; // String | Starbase details allow corporation members enabled selector
String useStandingsFrom = "{ any: true }"; // String | Starbase details standings from selector
String onAggressionEnabled = "{ any: true }"; // String | Starbase details on aggression enabled selector
String onAggressionStanding = "{ any: true }"; // String | Starbase details standing for aggression selector
String onCorporationWarEnabled = "{ any: true }"; // String | Starbase details on corporation war enabled selector
String onCorporationWarStanding = "{ any: true }"; // String | Starbase details standing for corporation war selector
String onStandingDropEnabled = "{ any: true }"; // String | Starbase details on standing drop enabled selector
String onStandingDropStanding = "{ any: true }"; // String | Starbase details standing for standing drop selector
String onStatusDropEnabled = "{ any: true }"; // String | Starbase details on status drop enabled selector
String onStatusDropStanding = "{ any: true }"; // String | Starbase details standing for status drop selector
try {
    List<StarbaseDetail> result = apiInstance.getStarbaseDetails(accessKey, accessCred, at, contid, maxresults, reverse, itemID, state, stateTimestamp, onlineTimestamp, usageFlags, deployFlags, allowAllianceMembers, allowCorporationMembers, useStandingsFrom, onAggressionEnabled, onAggressionStanding, onCorporationWarEnabled, onCorporationWarStanding, onStandingDropEnabled, onStandingDropStanding, onStatusDropEnabled, onStatusDropStanding);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getStarbaseDetails");
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
 **itemID** | **String**| Starbase item ID selector | [optional] [default to { any: true }]
 **state** | **String**| Starbase details state selector | [optional] [default to { any: true }]
 **stateTimestamp** | **String**| Starbase details state timestamp selector | [optional] [default to { any: true }]
 **onlineTimestamp** | **String**| Starbase details online timestamp selector | [optional] [default to { any: true }]
 **usageFlags** | **String**| Starbase details usage flags selector | [optional] [default to { any: true }]
 **deployFlags** | **String**| Starbase details deploy flags selector | [optional] [default to { any: true }]
 **allowAllianceMembers** | **String**| Starbase details allow alliance members enabled selector | [optional] [default to { any: true }]
 **allowCorporationMembers** | **String**| Starbase details allow corporation members enabled selector | [optional] [default to { any: true }]
 **useStandingsFrom** | **String**| Starbase details standings from selector | [optional] [default to { any: true }]
 **onAggressionEnabled** | **String**| Starbase details on aggression enabled selector | [optional] [default to { any: true }]
 **onAggressionStanding** | **String**| Starbase details standing for aggression selector | [optional] [default to { any: true }]
 **onCorporationWarEnabled** | **String**| Starbase details on corporation war enabled selector | [optional] [default to { any: true }]
 **onCorporationWarStanding** | **String**| Starbase details standing for corporation war selector | [optional] [default to { any: true }]
 **onStandingDropEnabled** | **String**| Starbase details on standing drop enabled selector | [optional] [default to { any: true }]
 **onStandingDropStanding** | **String**| Starbase details standing for standing drop selector | [optional] [default to { any: true }]
 **onStatusDropEnabled** | **String**| Starbase details on status drop enabled selector | [optional] [default to { any: true }]
 **onStatusDropStanding** | **String**| Starbase details standing for status drop selector | [optional] [default to { any: true }]

### Return type

[**List&lt;StarbaseDetail&gt;**](StarbaseDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStarbases"></a>
# **getStarbases**
> List&lt;Starbase&gt; getStarbases(accessKey, accessCred, at, contid, maxresults, reverse, itemID, locationID, moonID, onlineTimestamp, state, stateTimestamp, typeID, standingOwnerID)

Get corporation starbases



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CorporationApi;


CorporationApi apiInstance = new CorporationApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String itemID = "{ any: true }"; // String | Starbase item ID selector
String locationID = "{ any: true }"; // String | Starbase location ID selector
String moonID = "{ any: true }"; // String | Starbase moon ID selector
String onlineTimestamp = "{ any: true }"; // String | Starbase online timestamp selector
String state = "{ any: true }"; // String | Starbase state selector
String stateTimestamp = "{ any: true }"; // String | Starbase state timestamp selector
String typeID = "{ any: true }"; // String | Starbase type ID selector
String standingOwnerID = "{ any: true }"; // String | Starbase standing owner ID selector
try {
    List<Starbase> result = apiInstance.getStarbases(accessKey, accessCred, at, contid, maxresults, reverse, itemID, locationID, moonID, onlineTimestamp, state, stateTimestamp, typeID, standingOwnerID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CorporationApi#getStarbases");
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
 **itemID** | **String**| Starbase item ID selector | [optional] [default to { any: true }]
 **locationID** | **String**| Starbase location ID selector | [optional] [default to { any: true }]
 **moonID** | **String**| Starbase moon ID selector | [optional] [default to { any: true }]
 **onlineTimestamp** | **String**| Starbase online timestamp selector | [optional] [default to { any: true }]
 **state** | **String**| Starbase state selector | [optional] [default to { any: true }]
 **stateTimestamp** | **String**| Starbase state timestamp selector | [optional] [default to { any: true }]
 **typeID** | **String**| Starbase type ID selector | [optional] [default to { any: true }]
 **standingOwnerID** | **String**| Starbase standing owner ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Starbase&gt;**](Starbase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

