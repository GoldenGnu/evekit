# CommonApi

All URIs are relative to *https://evekit-model.orbital.enterprises//api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountBalance**](CommonApi.md#getAccountBalance) | **GET** /ws/v1/common/account_balance | Get account balance(s)
[**getAssets**](CommonApi.md#getAssets) | **GET** /ws/v1/common/asset | Get assets
[**getBlueprints**](CommonApi.md#getBlueprints) | **GET** /ws/v1/common/blueprint | Get blueprints
[**getBookmarks**](CommonApi.md#getBookmarks) | **GET** /ws/v1/common/bookmark | Get bookmarks
[**getContactLabels**](CommonApi.md#getContactLabels) | **GET** /ws/v1/common/contact_label | Get contact labels
[**getContacts**](CommonApi.md#getContacts) | **GET** /ws/v1/common/contact | Get contacts
[**getContractBids**](CommonApi.md#getContractBids) | **GET** /ws/v1/common/contract_bid | Get contract bids
[**getContractItems**](CommonApi.md#getContractItems) | **GET** /ws/v1/common/contract_item | Get contract items
[**getContracts**](CommonApi.md#getContracts) | **GET** /ws/v1/common/contract | Get contracts
[**getFacWarStats**](CommonApi.md#getFacWarStats) | **GET** /ws/v1/common/fac_war_stats | Get faction war statistics
[**getIndustryJobs**](CommonApi.md#getIndustryJobs) | **GET** /ws/v1/common/industry_job | Get industry jobs
[**getJournalEntries**](CommonApi.md#getJournalEntries) | **GET** /ws/v1/common/wallet_journal | Get wallet journal entries
[**getKillAttackers**](CommonApi.md#getKillAttackers) | **GET** /ws/v1/common/kill_attacker | Get kill attackers
[**getKillItems**](CommonApi.md#getKillItems) | **GET** /ws/v1/common/kill_item | Get kill items
[**getKillVictims**](CommonApi.md#getKillVictims) | **GET** /ws/v1/common/kill_victim | Get kill victims
[**getKills**](CommonApi.md#getKills) | **GET** /ws/v1/common/kill | Get kills
[**getLocations**](CommonApi.md#getLocations) | **GET** /ws/v1/common/location | Get locations
[**getMarketOrders**](CommonApi.md#getMarketOrders) | **GET** /ws/v1/common/market_order | Get market orders
[**getStandings**](CommonApi.md#getStandings) | **GET** /ws/v1/common/standing | Get standings)
[**getWalletTransactions**](CommonApi.md#getWalletTransactions) | **GET** /ws/v1/common/wallet_transaction | Get wallet transactions


<a name="getAccountBalance"></a>
# **getAccountBalance**
> List&lt;AccountBalance&gt; getAccountBalance(accessKey, accessCred, at, contid, maxresults, reverse, accountID, accountKey)

Get account balance(s)



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String accountID = "{ any: true }"; // String | Account ID selector
String accountKey = "{ any: true }"; // String | Account key selector
try {
    List<AccountBalance> result = apiInstance.getAccountBalance(accessKey, accessCred, at, contid, maxresults, reverse, accountID, accountKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getAccountBalance");
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
 **accountID** | **String**| Account ID selector | [optional] [default to { any: true }]
 **accountKey** | **String**| Account key selector | [optional] [default to { any: true }]

### Return type

[**List&lt;AccountBalance&gt;**](AccountBalance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssets"></a>
# **getAssets**
> List&lt;Asset&gt; getAssets(accessKey, accessCred, at, contid, maxresults, reverse, itemID, locationID, typeID, quantity, flag, singleton, rawQuantity, container)

Get assets



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String itemID = "{ any: true }"; // String | Asset item ID selector
String locationID = "{ any: true }"; // String | Asset location ID selector
String typeID = "{ any: true }"; // String | Asset type ID selector
String quantity = "{ any: true }"; // String | Asset quantity selector
String flag = "{ any: true }"; // String | Asset flag selector
String singleton = "{ any: true }"; // String | Asset is singleton selector
String rawQuantity = "{ any: true }"; // String | Asset raw quantity selector
String container = "{ any: true }"; // String | Asset container selector
try {
    List<Asset> result = apiInstance.getAssets(accessKey, accessCred, at, contid, maxresults, reverse, itemID, locationID, typeID, quantity, flag, singleton, rawQuantity, container);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getAssets");
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
 **itemID** | **String**| Asset item ID selector | [optional] [default to { any: true }]
 **locationID** | **String**| Asset location ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Asset type ID selector | [optional] [default to { any: true }]
 **quantity** | **String**| Asset quantity selector | [optional] [default to { any: true }]
 **flag** | **String**| Asset flag selector | [optional] [default to { any: true }]
 **singleton** | **String**| Asset is singleton selector | [optional] [default to { any: true }]
 **rawQuantity** | **String**| Asset raw quantity selector | [optional] [default to { any: true }]
 **container** | **String**| Asset container selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Asset&gt;**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBlueprints"></a>
# **getBlueprints**
> List&lt;Blueprint&gt; getBlueprints(accessKey, accessCred, at, contid, maxresults, reverse, itemID, locationID, typeID, typeName, flagID, quantity, timeEfficiency, materialEfficiency, runs)

Get blueprints



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String itemID = "{ any: true }"; // String | Blueprint item ID selector
String locationID = "{ any: true }"; // String | Blueprint location ID selector
String typeID = "{ any: true }"; // String | Blueprint type ID selector
String typeName = "{ any: true }"; // String | Blueprint type name selector
String flagID = "{ any: true }"; // String | Blueprint flag ID selector
String quantity = "{ any: true }"; // String | Blueprint quantity selector
String timeEfficiency = "{ any: true }"; // String | Blueprint time efficiency selector
String materialEfficiency = "{ any: true }"; // String | Blueprint material efficiency selector
String runs = "{ any: true }"; // String | Blueprint runs selector
try {
    List<Blueprint> result = apiInstance.getBlueprints(accessKey, accessCred, at, contid, maxresults, reverse, itemID, locationID, typeID, typeName, flagID, quantity, timeEfficiency, materialEfficiency, runs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getBlueprints");
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
 **itemID** | **String**| Blueprint item ID selector | [optional] [default to { any: true }]
 **locationID** | **String**| Blueprint location ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Blueprint type ID selector | [optional] [default to { any: true }]
 **typeName** | **String**| Blueprint type name selector | [optional] [default to { any: true }]
 **flagID** | **String**| Blueprint flag ID selector | [optional] [default to { any: true }]
 **quantity** | **String**| Blueprint quantity selector | [optional] [default to { any: true }]
 **timeEfficiency** | **String**| Blueprint time efficiency selector | [optional] [default to { any: true }]
 **materialEfficiency** | **String**| Blueprint material efficiency selector | [optional] [default to { any: true }]
 **runs** | **String**| Blueprint runs selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Blueprint&gt;**](Blueprint.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBookmarks"></a>
# **getBookmarks**
> List&lt;Bookmark&gt; getBookmarks(accessKey, accessCred, at, contid, maxresults, reverse, folderID, folderName, folderCreatorID, bookmarkID, bookmarkCreatorID, created, itemID, typeID, locationID, x, y, z, memo, note)

Get bookmarks



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String folderID = "{ any: true }"; // String | Bookmark folder ID selector
String folderName = "{ any: true }"; // String | Bookmark folder name selector
String folderCreatorID = "{ any: true }"; // String | Bookmark folder creator ID selector
String bookmarkID = "{ any: true }"; // String | Bookmark ID selector
String bookmarkCreatorID = "{ any: true }"; // String | Bookmark creator ID selector
String created = "{ any: true }"; // String | Bookmark created selector
String itemID = "{ any: true }"; // String | Bookmark item ID selector
String typeID = "{ any: true }"; // String | Bookmark type ID selector
String locationID = "{ any: true }"; // String | Bookmark location ID selector
String x = "{ any: true }"; // String | Bookmark x coordinate selector
String y = "{ any: true }"; // String | Bookmark y coordinate selector
String z = "{ any: true }"; // String | Bookmark z coordinate selector
String memo = "{ any: true }"; // String | Bookmark memo selector
String note = "{ any: true }"; // String | Bookmark note selector
try {
    List<Bookmark> result = apiInstance.getBookmarks(accessKey, accessCred, at, contid, maxresults, reverse, folderID, folderName, folderCreatorID, bookmarkID, bookmarkCreatorID, created, itemID, typeID, locationID, x, y, z, memo, note);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getBookmarks");
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
 **folderID** | **String**| Bookmark folder ID selector | [optional] [default to { any: true }]
 **folderName** | **String**| Bookmark folder name selector | [optional] [default to { any: true }]
 **folderCreatorID** | **String**| Bookmark folder creator ID selector | [optional] [default to { any: true }]
 **bookmarkID** | **String**| Bookmark ID selector | [optional] [default to { any: true }]
 **bookmarkCreatorID** | **String**| Bookmark creator ID selector | [optional] [default to { any: true }]
 **created** | **String**| Bookmark created selector | [optional] [default to { any: true }]
 **itemID** | **String**| Bookmark item ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Bookmark type ID selector | [optional] [default to { any: true }]
 **locationID** | **String**| Bookmark location ID selector | [optional] [default to { any: true }]
 **x** | **String**| Bookmark x coordinate selector | [optional] [default to { any: true }]
 **y** | **String**| Bookmark y coordinate selector | [optional] [default to { any: true }]
 **z** | **String**| Bookmark z coordinate selector | [optional] [default to { any: true }]
 **memo** | **String**| Bookmark memo selector | [optional] [default to { any: true }]
 **note** | **String**| Bookmark note selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Bookmark&gt;**](Bookmark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactLabels"></a>
# **getContactLabels**
> List&lt;ContactLabel&gt; getContactLabels(accessKey, accessCred, at, contid, maxresults, reverse, list, labelID, name)

Get contact labels



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String list = "{ any: true }"; // String | Contact list selector
String labelID = "{ any: true }"; // String | Contact label ID selector
String name = "{ any: true }"; // String | Contact label name selector
try {
    List<ContactLabel> result = apiInstance.getContactLabels(accessKey, accessCred, at, contid, maxresults, reverse, list, labelID, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getContactLabels");
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
 **list** | **String**| Contact list selector | [optional] [default to { any: true }]
 **labelID** | **String**| Contact label ID selector | [optional] [default to { any: true }]
 **name** | **String**| Contact label name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;ContactLabel&gt;**](ContactLabel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContacts"></a>
# **getContacts**
> List&lt;Contact&gt; getContacts(accessKey, accessCred, at, contid, maxresults, reverse, list, contactID, contactName, standing, contactTypeID, inWatchlist, labelMask)

Get contacts



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String list = "{ any: true }"; // String | Contact list selector
String contactID = "{ any: true }"; // String | Contact ID selector
String contactName = "{ any: true }"; // String | Contact name selector
String standing = "{ any: true }"; // String | Contact standing selector
String contactTypeID = "{ any: true }"; // String | Contact type ID selector
String inWatchlist = "{ any: true }"; // String | Contact in watch list selector
String labelMask = "{ any: true }"; // String | Contact label mask selector
try {
    List<Contact> result = apiInstance.getContacts(accessKey, accessCred, at, contid, maxresults, reverse, list, contactID, contactName, standing, contactTypeID, inWatchlist, labelMask);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getContacts");
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
 **list** | **String**| Contact list selector | [optional] [default to { any: true }]
 **contactID** | **String**| Contact ID selector | [optional] [default to { any: true }]
 **contactName** | **String**| Contact name selector | [optional] [default to { any: true }]
 **standing** | **String**| Contact standing selector | [optional] [default to { any: true }]
 **contactTypeID** | **String**| Contact type ID selector | [optional] [default to { any: true }]
 **inWatchlist** | **String**| Contact in watch list selector | [optional] [default to { any: true }]
 **labelMask** | **String**| Contact label mask selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContractBids"></a>
# **getContractBids**
> List&lt;ContractBid&gt; getContractBids(accessKey, accessCred, at, contid, maxresults, reverse, bidID, contractID, bidderID, dateBid, amount)

Get contract bids



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String bidID = "{ any: true }"; // String | Contract bid ID selector
String contractID = "{ any: true }"; // String | Contract ID selector
String bidderID = "{ any: true }"; // String | Contract bid bidder ID selector
String dateBid = "{ any: true }"; // String | Contract bid date selector
String amount = "{ any: true }"; // String | Contract bid amount selector
try {
    List<ContractBid> result = apiInstance.getContractBids(accessKey, accessCred, at, contid, maxresults, reverse, bidID, contractID, bidderID, dateBid, amount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getContractBids");
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
 **bidID** | **String**| Contract bid ID selector | [optional] [default to { any: true }]
 **contractID** | **String**| Contract ID selector | [optional] [default to { any: true }]
 **bidderID** | **String**| Contract bid bidder ID selector | [optional] [default to { any: true }]
 **dateBid** | **String**| Contract bid date selector | [optional] [default to { any: true }]
 **amount** | **String**| Contract bid amount selector | [optional] [default to { any: true }]

### Return type

[**List&lt;ContractBid&gt;**](ContractBid.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContractItems"></a>
# **getContractItems**
> List&lt;ContractItem&gt; getContractItems(accessKey, accessCred, at, contid, maxresults, reverse, contractID, recordID, typeID, quantity, rawQuantity, singleton, included)

Get contract items



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String contractID = "{ any: true }"; // String | Contract ID selector
String recordID = "{ any: true }"; // String | Contract item record ID selector
String typeID = "{ any: true }"; // String | Contract item type ID selector
String quantity = "{ any: true }"; // String | Contract item quantity selector
String rawQuantity = "{ any: true }"; // String | Contract item raw quantity selector
String singleton = "{ any: true }"; // String | Contract item singleton selector
String included = "{ any: true }"; // String | Contract item included selector
try {
    List<ContractItem> result = apiInstance.getContractItems(accessKey, accessCred, at, contid, maxresults, reverse, contractID, recordID, typeID, quantity, rawQuantity, singleton, included);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getContractItems");
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
 **contractID** | **String**| Contract ID selector | [optional] [default to { any: true }]
 **recordID** | **String**| Contract item record ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Contract item type ID selector | [optional] [default to { any: true }]
 **quantity** | **String**| Contract item quantity selector | [optional] [default to { any: true }]
 **rawQuantity** | **String**| Contract item raw quantity selector | [optional] [default to { any: true }]
 **singleton** | **String**| Contract item singleton selector | [optional] [default to { any: true }]
 **included** | **String**| Contract item included selector | [optional] [default to { any: true }]

### Return type

[**List&lt;ContractItem&gt;**](ContractItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContracts"></a>
# **getContracts**
> List&lt;Contract&gt; getContracts(accessKey, accessCred, at, contid, maxresults, reverse, contractID, issuerID, issuerCorpID, assigneeID, acceptorID, startStationID, endStationID, type, status, title, forCorp, availability, dateIssued, dateExpired, dateAccepted, numDays, dateCompleted, price, reward, collateral, buyout, volume)

Get contracts



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String contractID = "{ any: true }"; // String | Contract ID selector
String issuerID = "{ any: true }"; // String | Contract issuer ID selector
String issuerCorpID = "{ any: true }"; // String | Contract issuer corporation ID selector
String assigneeID = "{ any: true }"; // String | Contract assignee ID selector
String acceptorID = "{ any: true }"; // String | Contract acceptor ID selector
String startStationID = "{ any: true }"; // String | Contract start station ID selector
String endStationID = "{ any: true }"; // String | Contract end station ID selector
String type = "{ any: true }"; // String | Contract type selector
String status = "{ any: true }"; // String | Contract status selector
String title = "{ any: true }"; // String | Contract title selector
String forCorp = "{ any: true }"; // String | Contract for corporation selector
String availability = "{ any: true }"; // String | Contract availability selector
String dateIssued = "{ any: true }"; // String | Contract date issued selector
String dateExpired = "{ any: true }"; // String | Contract date expired selector
String dateAccepted = "{ any: true }"; // String | Contract date accepted selector
String numDays = "{ any: true }"; // String | Contract duration (days) selector
String dateCompleted = "{ any: true }"; // String | Contract date completed selector
String price = "{ any: true }"; // String | Contract price selector
String reward = "{ any: true }"; // String | Contract reward value selector
String collateral = "{ any: true }"; // String | Contract collateral value selector
String buyout = "{ any: true }"; // String | Contract buyout price selector
String volume = "{ any: true }"; // String | Contract volume selector
try {
    List<Contract> result = apiInstance.getContracts(accessKey, accessCred, at, contid, maxresults, reverse, contractID, issuerID, issuerCorpID, assigneeID, acceptorID, startStationID, endStationID, type, status, title, forCorp, availability, dateIssued, dateExpired, dateAccepted, numDays, dateCompleted, price, reward, collateral, buyout, volume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getContracts");
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
 **contractID** | **String**| Contract ID selector | [optional] [default to { any: true }]
 **issuerID** | **String**| Contract issuer ID selector | [optional] [default to { any: true }]
 **issuerCorpID** | **String**| Contract issuer corporation ID selector | [optional] [default to { any: true }]
 **assigneeID** | **String**| Contract assignee ID selector | [optional] [default to { any: true }]
 **acceptorID** | **String**| Contract acceptor ID selector | [optional] [default to { any: true }]
 **startStationID** | **String**| Contract start station ID selector | [optional] [default to { any: true }]
 **endStationID** | **String**| Contract end station ID selector | [optional] [default to { any: true }]
 **type** | **String**| Contract type selector | [optional] [default to { any: true }]
 **status** | **String**| Contract status selector | [optional] [default to { any: true }]
 **title** | **String**| Contract title selector | [optional] [default to { any: true }]
 **forCorp** | **String**| Contract for corporation selector | [optional] [default to { any: true }]
 **availability** | **String**| Contract availability selector | [optional] [default to { any: true }]
 **dateIssued** | **String**| Contract date issued selector | [optional] [default to { any: true }]
 **dateExpired** | **String**| Contract date expired selector | [optional] [default to { any: true }]
 **dateAccepted** | **String**| Contract date accepted selector | [optional] [default to { any: true }]
 **numDays** | **String**| Contract duration (days) selector | [optional] [default to { any: true }]
 **dateCompleted** | **String**| Contract date completed selector | [optional] [default to { any: true }]
 **price** | **String**| Contract price selector | [optional] [default to { any: true }]
 **reward** | **String**| Contract reward value selector | [optional] [default to { any: true }]
 **collateral** | **String**| Contract collateral value selector | [optional] [default to { any: true }]
 **buyout** | **String**| Contract buyout price selector | [optional] [default to { any: true }]
 **volume** | **String**| Contract volume selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Contract&gt;**](Contract.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFacWarStats"></a>
# **getFacWarStats**
> List&lt;FacWarStats&gt; getFacWarStats(accessKey, accessCred, at, contid, maxresults, reverse, currentRank, enlisted, factionID, factionName, highestRank, killsLastWeek, killsTotal, killsYesterday, pilots, victoryPointsLastWeek, victoryPointsTotal, victoryPointsYesterday)

Get faction war statistics



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String currentRank = "{ any: true }"; // String | Faction war statistics current rank selector
String enlisted = "{ any: true }"; // String | Faction war statistics enlisted indicator selector
String factionID = "{ any: true }"; // String | Faction war statistics faction ID selector
String factionName = "{ any: true }"; // String | Faction war statistics faction name selector
String highestRank = "{ any: true }"; // String | Faction war statistics highest rank selector
String killsLastWeek = "{ any: true }"; // String | Faction war statistics kill last week selector
String killsTotal = "{ any: true }"; // String | Faction war statistics total kills selector
String killsYesterday = "{ any: true }"; // String | Faction war statistics kills yesterday selector
String pilots = "{ any: true }"; // String | Faction war statistics pilot count selector
String victoryPointsLastWeek = "{ any: true }"; // String | Faction war statistics victory points last week selector
String victoryPointsTotal = "{ any: true }"; // String | Faction war statistics victory points total selector
String victoryPointsYesterday = "{ any: true }"; // String | Faction war statistics victory points yesterday selector
try {
    List<FacWarStats> result = apiInstance.getFacWarStats(accessKey, accessCred, at, contid, maxresults, reverse, currentRank, enlisted, factionID, factionName, highestRank, killsLastWeek, killsTotal, killsYesterday, pilots, victoryPointsLastWeek, victoryPointsTotal, victoryPointsYesterday);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getFacWarStats");
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
 **currentRank** | **String**| Faction war statistics current rank selector | [optional] [default to { any: true }]
 **enlisted** | **String**| Faction war statistics enlisted indicator selector | [optional] [default to { any: true }]
 **factionID** | **String**| Faction war statistics faction ID selector | [optional] [default to { any: true }]
 **factionName** | **String**| Faction war statistics faction name selector | [optional] [default to { any: true }]
 **highestRank** | **String**| Faction war statistics highest rank selector | [optional] [default to { any: true }]
 **killsLastWeek** | **String**| Faction war statistics kill last week selector | [optional] [default to { any: true }]
 **killsTotal** | **String**| Faction war statistics total kills selector | [optional] [default to { any: true }]
 **killsYesterday** | **String**| Faction war statistics kills yesterday selector | [optional] [default to { any: true }]
 **pilots** | **String**| Faction war statistics pilot count selector | [optional] [default to { any: true }]
 **victoryPointsLastWeek** | **String**| Faction war statistics victory points last week selector | [optional] [default to { any: true }]
 **victoryPointsTotal** | **String**| Faction war statistics victory points total selector | [optional] [default to { any: true }]
 **victoryPointsYesterday** | **String**| Faction war statistics victory points yesterday selector | [optional] [default to { any: true }]

### Return type

[**List&lt;FacWarStats&gt;**](FacWarStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIndustryJobs"></a>
# **getIndustryJobs**
> List&lt;IndustryJob&gt; getIndustryJobs(accessKey, accessCred, at, contid, maxresults, reverse, jobID, installerID, installerName, facilityID, solarSystemID, solarSystemName, stationID, activityID, blueprintID, blueprintTypeID, blueprintTypeName, blueprintLocationID, outputLocationID, runs, cost, teamID, licensedRuns, probability, productTypeID, productTypeName, status, timeInSeconds, startDate, endDate, pauseDate, completedDate, completedCharacterID, successfulRuns)

Get industry jobs



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String jobID = "{ any: true }"; // String | Industry job ID selector
String installerID = "{ any: true }"; // String | Industry job installer ID selector
String installerName = "{ any: true }"; // String | Industry job installer name selector
String facilityID = "{ any: true }"; // String | Industry job facility ID selector
String solarSystemID = "{ any: true }"; // String | Industry job solar system ID selector
String solarSystemName = "{ any: true }"; // String | Industry job solar system name selector
String stationID = "{ any: true }"; // String | Industry job station ID selector
String activityID = "{ any: true }"; // String | Industry job activity ID selector
String blueprintID = "{ any: true }"; // String | Industry job blueprint ID selector
String blueprintTypeID = "{ any: true }"; // String | Industry job blueprint type ID selector
String blueprintTypeName = "{ any: true }"; // String | Industry job blueprint type name selector
String blueprintLocationID = "{ any: true }"; // String | Industry job blueprint location ID selector
String outputLocationID = "{ any: true }"; // String | Industry job output location ID selector
String runs = "{ any: true }"; // String | Industry job runs selector
String cost = "{ any: true }"; // String | Industry job cost selector
String teamID = "{ any: true }"; // String | Industry job team ID selector
String licensedRuns = "{ any: true }"; // String | Industry job licensed runs selector
String probability = "{ any: true }"; // String | Industry job probability selector
String productTypeID = "{ any: true }"; // String | Industry job product type ID selector
String productTypeName = "{ any: true }"; // String | Industry job product type name selector
String status = "{ any: true }"; // String | Industry job status selector
String timeInSeconds = "{ any: true }"; // String | Industry job time in seconds selector
String startDate = "{ any: true }"; // String | Industry job start date selector
String endDate = "{ any: true }"; // String | Industry job end date selector
String pauseDate = "{ any: true }"; // String | Industry job pause date selector
String completedDate = "{ any: true }"; // String | Industry job completed date selector
String completedCharacterID = "{ any: true }"; // String | Industry job completed character ID selector
String successfulRuns = "{ any: true }"; // String | Industry job successful runs selector
try {
    List<IndustryJob> result = apiInstance.getIndustryJobs(accessKey, accessCred, at, contid, maxresults, reverse, jobID, installerID, installerName, facilityID, solarSystemID, solarSystemName, stationID, activityID, blueprintID, blueprintTypeID, blueprintTypeName, blueprintLocationID, outputLocationID, runs, cost, teamID, licensedRuns, probability, productTypeID, productTypeName, status, timeInSeconds, startDate, endDate, pauseDate, completedDate, completedCharacterID, successfulRuns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getIndustryJobs");
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
 **jobID** | **String**| Industry job ID selector | [optional] [default to { any: true }]
 **installerID** | **String**| Industry job installer ID selector | [optional] [default to { any: true }]
 **installerName** | **String**| Industry job installer name selector | [optional] [default to { any: true }]
 **facilityID** | **String**| Industry job facility ID selector | [optional] [default to { any: true }]
 **solarSystemID** | **String**| Industry job solar system ID selector | [optional] [default to { any: true }]
 **solarSystemName** | **String**| Industry job solar system name selector | [optional] [default to { any: true }]
 **stationID** | **String**| Industry job station ID selector | [optional] [default to { any: true }]
 **activityID** | **String**| Industry job activity ID selector | [optional] [default to { any: true }]
 **blueprintID** | **String**| Industry job blueprint ID selector | [optional] [default to { any: true }]
 **blueprintTypeID** | **String**| Industry job blueprint type ID selector | [optional] [default to { any: true }]
 **blueprintTypeName** | **String**| Industry job blueprint type name selector | [optional] [default to { any: true }]
 **blueprintLocationID** | **String**| Industry job blueprint location ID selector | [optional] [default to { any: true }]
 **outputLocationID** | **String**| Industry job output location ID selector | [optional] [default to { any: true }]
 **runs** | **String**| Industry job runs selector | [optional] [default to { any: true }]
 **cost** | **String**| Industry job cost selector | [optional] [default to { any: true }]
 **teamID** | **String**| Industry job team ID selector | [optional] [default to { any: true }]
 **licensedRuns** | **String**| Industry job licensed runs selector | [optional] [default to { any: true }]
 **probability** | **String**| Industry job probability selector | [optional] [default to { any: true }]
 **productTypeID** | **String**| Industry job product type ID selector | [optional] [default to { any: true }]
 **productTypeName** | **String**| Industry job product type name selector | [optional] [default to { any: true }]
 **status** | **String**| Industry job status selector | [optional] [default to { any: true }]
 **timeInSeconds** | **String**| Industry job time in seconds selector | [optional] [default to { any: true }]
 **startDate** | **String**| Industry job start date selector | [optional] [default to { any: true }]
 **endDate** | **String**| Industry job end date selector | [optional] [default to { any: true }]
 **pauseDate** | **String**| Industry job pause date selector | [optional] [default to { any: true }]
 **completedDate** | **String**| Industry job completed date selector | [optional] [default to { any: true }]
 **completedCharacterID** | **String**| Industry job completed character ID selector | [optional] [default to { any: true }]
 **successfulRuns** | **String**| Industry job successful runs selector | [optional] [default to { any: true }]

### Return type

[**List&lt;IndustryJob&gt;**](IndustryJob.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJournalEntries"></a>
# **getJournalEntries**
> List&lt;WalletJournal&gt; getJournalEntries(accessKey, accessCred, at, contid, maxresults, reverse, accountKey, refID, date, refTypeID, ownerName1, ownerID1, ownerName2, ownerID2, argName1, argID1, amount, balance, reason, taxReceiverID, taxAmount, owner1TypeID, owner2TypeID)

Get wallet journal entries



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String accountKey = "{ any: true }"; // String | Wallet journal account key selector
String refID = "{ any: true }"; // String | Journal entry ref ID selector
String date = "{ any: true }"; // String | Journal entry date selector
String refTypeID = "{ any: true }"; // String | Journal entry ref type ID selector
String ownerName1 = "{ any: true }"; // String | Journal entry first owner name selector
String ownerID1 = "{ any: true }"; // String | Journal entry first owner ID selector
String ownerName2 = "{ any: true }"; // String | Journal entry second owner name selector
String ownerID2 = "{ any: true }"; // String | Journal entry second owner ID selector
String argName1 = "{ any: true }"; // String | Journal entry argument name selector
String argID1 = "{ any: true }"; // String | Journal entry argument ID selector
String amount = "{ any: true }"; // String | Journal entry amount selector
String balance = "{ any: true }"; // String | Journal entry balance selector
String reason = "{ any: true }"; // String | Journal entry reason selector
String taxReceiverID = "{ any: true }"; // String | Journal entry tax receiver ID selector
String taxAmount = "{ any: true }"; // String | Journal entry tax amount selector
String owner1TypeID = "{ any: true }"; // String | First owner type ID selector
String owner2TypeID = "{ any: true }"; // String | Second owner type ID selector
try {
    List<WalletJournal> result = apiInstance.getJournalEntries(accessKey, accessCred, at, contid, maxresults, reverse, accountKey, refID, date, refTypeID, ownerName1, ownerID1, ownerName2, ownerID2, argName1, argID1, amount, balance, reason, taxReceiverID, taxAmount, owner1TypeID, owner2TypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getJournalEntries");
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
 **accountKey** | **String**| Wallet journal account key selector | [optional] [default to { any: true }]
 **refID** | **String**| Journal entry ref ID selector | [optional] [default to { any: true }]
 **date** | **String**| Journal entry date selector | [optional] [default to { any: true }]
 **refTypeID** | **String**| Journal entry ref type ID selector | [optional] [default to { any: true }]
 **ownerName1** | **String**| Journal entry first owner name selector | [optional] [default to { any: true }]
 **ownerID1** | **String**| Journal entry first owner ID selector | [optional] [default to { any: true }]
 **ownerName2** | **String**| Journal entry second owner name selector | [optional] [default to { any: true }]
 **ownerID2** | **String**| Journal entry second owner ID selector | [optional] [default to { any: true }]
 **argName1** | **String**| Journal entry argument name selector | [optional] [default to { any: true }]
 **argID1** | **String**| Journal entry argument ID selector | [optional] [default to { any: true }]
 **amount** | **String**| Journal entry amount selector | [optional] [default to { any: true }]
 **balance** | **String**| Journal entry balance selector | [optional] [default to { any: true }]
 **reason** | **String**| Journal entry reason selector | [optional] [default to { any: true }]
 **taxReceiverID** | **String**| Journal entry tax receiver ID selector | [optional] [default to { any: true }]
 **taxAmount** | **String**| Journal entry tax amount selector | [optional] [default to { any: true }]
 **owner1TypeID** | **String**| First owner type ID selector | [optional] [default to { any: true }]
 **owner2TypeID** | **String**| Second owner type ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;WalletJournal&gt;**](WalletJournal.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKillAttackers"></a>
# **getKillAttackers**
> List&lt;KillAttacker&gt; getKillAttackers(accessKey, accessCred, at, contid, maxresults, reverse, killID, attackerCharacterID, allianceID, allianceName, attackerCharacterName, attackerCorporationID, attackerCorporationName, damageDone, factionID, factionName, securityStatus, shipTypeID, weaponTypeID, finalBlow)

Get kill attackers



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String killID = "{ any: true }"; // String | Kill ID selector
String attackerCharacterID = "{ any: true }"; // String | Kill attacker character ID selector
String allianceID = "{ any: true }"; // String | Kill attacker alliance ID selector
String allianceName = "{ any: true }"; // String | Kill attacker alliance name selector
String attackerCharacterName = "{ any: true }"; // String | Kill attacker character name selector
String attackerCorporationID = "{ any: true }"; // String | Kill attacker corporation ID selector
String attackerCorporationName = "{ any: true }"; // String | Kill attacker corporation name selector
String damageDone = "{ any: true }"; // String | Kill attacker damage done selector
String factionID = "{ any: true }"; // String | Kill attacker faction ID selector
String factionName = "{ any: true }"; // String | Kill attacker faction name selector
String securityStatus = "{ any: true }"; // String | Kill attacker security status selector
String shipTypeID = "{ any: true }"; // String | Kill attacker ship type ID selector
String weaponTypeID = "{ any: true }"; // String | Kill attacker weapon type ID selector
String finalBlow = "{ any: true }"; // String | Kill attacker final blow selector
try {
    List<KillAttacker> result = apiInstance.getKillAttackers(accessKey, accessCred, at, contid, maxresults, reverse, killID, attackerCharacterID, allianceID, allianceName, attackerCharacterName, attackerCorporationID, attackerCorporationName, damageDone, factionID, factionName, securityStatus, shipTypeID, weaponTypeID, finalBlow);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getKillAttackers");
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
 **killID** | **String**| Kill ID selector | [optional] [default to { any: true }]
 **attackerCharacterID** | **String**| Kill attacker character ID selector | [optional] [default to { any: true }]
 **allianceID** | **String**| Kill attacker alliance ID selector | [optional] [default to { any: true }]
 **allianceName** | **String**| Kill attacker alliance name selector | [optional] [default to { any: true }]
 **attackerCharacterName** | **String**| Kill attacker character name selector | [optional] [default to { any: true }]
 **attackerCorporationID** | **String**| Kill attacker corporation ID selector | [optional] [default to { any: true }]
 **attackerCorporationName** | **String**| Kill attacker corporation name selector | [optional] [default to { any: true }]
 **damageDone** | **String**| Kill attacker damage done selector | [optional] [default to { any: true }]
 **factionID** | **String**| Kill attacker faction ID selector | [optional] [default to { any: true }]
 **factionName** | **String**| Kill attacker faction name selector | [optional] [default to { any: true }]
 **securityStatus** | **String**| Kill attacker security status selector | [optional] [default to { any: true }]
 **shipTypeID** | **String**| Kill attacker ship type ID selector | [optional] [default to { any: true }]
 **weaponTypeID** | **String**| Kill attacker weapon type ID selector | [optional] [default to { any: true }]
 **finalBlow** | **String**| Kill attacker final blow selector | [optional] [default to { any: true }]

### Return type

[**List&lt;KillAttacker&gt;**](KillAttacker.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKillItems"></a>
# **getKillItems**
> List&lt;KillItem&gt; getKillItems(accessKey, accessCred, at, contid, maxresults, reverse, killID, typeID, flag, qtyDestroyed, qtyDropped, singleton, sequence, containerSequence)

Get kill items



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String killID = "{ any: true }"; // String | Kill ID selector
String typeID = "{ any: true }"; // String | Kill item type ID selector
String flag = "{ any: true }"; // String | Kill item flag selector
String qtyDestroyed = "{ any: true }"; // String | Kill item quantity destroyed selector
String qtyDropped = "{ any: true }"; // String | Kill item quantity dropped selector
String singleton = "{ any: true }"; // String | Kill item singleton selector
String sequence = "{ any: true }"; // String | Kill item sequence selector
String containerSequence = "{ any: true }"; // String | Kill item container sequence selector
try {
    List<KillItem> result = apiInstance.getKillItems(accessKey, accessCred, at, contid, maxresults, reverse, killID, typeID, flag, qtyDestroyed, qtyDropped, singleton, sequence, containerSequence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getKillItems");
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
 **killID** | **String**| Kill ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Kill item type ID selector | [optional] [default to { any: true }]
 **flag** | **String**| Kill item flag selector | [optional] [default to { any: true }]
 **qtyDestroyed** | **String**| Kill item quantity destroyed selector | [optional] [default to { any: true }]
 **qtyDropped** | **String**| Kill item quantity dropped selector | [optional] [default to { any: true }]
 **singleton** | **String**| Kill item singleton selector | [optional] [default to { any: true }]
 **sequence** | **String**| Kill item sequence selector | [optional] [default to { any: true }]
 **containerSequence** | **String**| Kill item container sequence selector | [optional] [default to { any: true }]

### Return type

[**List&lt;KillItem&gt;**](KillItem.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKillVictims"></a>
# **getKillVictims**
> List&lt;KillVictim&gt; getKillVictims(accessKey, accessCred, at, contid, maxresults, reverse, killID, allianceID, allianceName, killCharacterID, killCharacterName, killCorporationID, killCorporationName, damageTaken, factionID, factionName, shipTypeID)

Get kill victims



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String killID = "{ any: true }"; // String | Kill ID selector
String allianceID = "{ any: true }"; // String | Kill victim alliance ID selector
String allianceName = "{ any: true }"; // String | Kill victim alliance name selector
String killCharacterID = "{ any: true }"; // String | Kill victim character ID selector
String killCharacterName = "{ any: true }"; // String | Kill victim character name selector
String killCorporationID = "{ any: true }"; // String | Kill victim corporation ID selector
String killCorporationName = "{ any: true }"; // String | Kill victim corporation name selector
String damageTaken = "{ any: true }"; // String | Kill victim damage taken selector
String factionID = "{ any: true }"; // String | Kill victim faction ID selector
String factionName = "{ any: true }"; // String | Kill victim faction name selector
String shipTypeID = "{ any: true }"; // String | Kill victim ship type ID selector
try {
    List<KillVictim> result = apiInstance.getKillVictims(accessKey, accessCred, at, contid, maxresults, reverse, killID, allianceID, allianceName, killCharacterID, killCharacterName, killCorporationID, killCorporationName, damageTaken, factionID, factionName, shipTypeID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getKillVictims");
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
 **killID** | **String**| Kill ID selector | [optional] [default to { any: true }]
 **allianceID** | **String**| Kill victim alliance ID selector | [optional] [default to { any: true }]
 **allianceName** | **String**| Kill victim alliance name selector | [optional] [default to { any: true }]
 **killCharacterID** | **String**| Kill victim character ID selector | [optional] [default to { any: true }]
 **killCharacterName** | **String**| Kill victim character name selector | [optional] [default to { any: true }]
 **killCorporationID** | **String**| Kill victim corporation ID selector | [optional] [default to { any: true }]
 **killCorporationName** | **String**| Kill victim corporation name selector | [optional] [default to { any: true }]
 **damageTaken** | **String**| Kill victim damage taken selector | [optional] [default to { any: true }]
 **factionID** | **String**| Kill victim faction ID selector | [optional] [default to { any: true }]
 **factionName** | **String**| Kill victim faction name selector | [optional] [default to { any: true }]
 **shipTypeID** | **String**| Kill victim ship type ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;KillVictim&gt;**](KillVictim.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKills"></a>
# **getKills**
> List&lt;Kill&gt; getKills(accessKey, accessCred, at, contid, maxresults, reverse, killID, killTime, moonID, solarSystemID)

Get kills



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String killID = "{ any: true }"; // String | Kill ID selector
String killTime = "{ any: true }"; // String | Kill time selector
String moonID = "{ any: true }"; // String | Kill moon ID selector
String solarSystemID = "{ any: true }"; // String | Kill solar system ID selector
try {
    List<Kill> result = apiInstance.getKills(accessKey, accessCred, at, contid, maxresults, reverse, killID, killTime, moonID, solarSystemID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getKills");
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
 **killID** | **String**| Kill ID selector | [optional] [default to { any: true }]
 **killTime** | **String**| Kill time selector | [optional] [default to { any: true }]
 **moonID** | **String**| Kill moon ID selector | [optional] [default to { any: true }]
 **solarSystemID** | **String**| Kill solar system ID selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Kill&gt;**](Kill.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLocations"></a>
# **getLocations**
> List&lt;Location&gt; getLocations(accessKey, accessCred, at, contid, maxresults, reverse, itemID, itemName, x, y, z)

Get locations



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String itemID = "{ any: true }"; // String | Location item ID selector
String itemName = "{ any: true }"; // String | Location item name selector
String x = "{ any: true }"; // String | Location X position selector
String y = "{ any: true }"; // String | Location Y position selector
String z = "{ any: true }"; // String | Location Z position selector
try {
    List<Location> result = apiInstance.getLocations(accessKey, accessCred, at, contid, maxresults, reverse, itemID, itemName, x, y, z);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getLocations");
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
 **itemID** | **String**| Location item ID selector | [optional] [default to { any: true }]
 **itemName** | **String**| Location item name selector | [optional] [default to { any: true }]
 **x** | **String**| Location X position selector | [optional] [default to { any: true }]
 **y** | **String**| Location Y position selector | [optional] [default to { any: true }]
 **z** | **String**| Location Z position selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketOrders"></a>
# **getMarketOrders**
> List&lt;MarketOrder&gt; getMarketOrders(accessKey, accessCred, at, contid, maxresults, reverse, orderID, accountKey, bid, charID, duration, escrow, issued, minVolume, orderState, price, orderRange, stationID, typeID, volEntered, volRemaining)

Get market orders



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String orderID = "{ any: true }"; // String | Market order ID selector
String accountKey = "{ any: true }"; // String | Market order account key selector
String bid = "{ any: true }"; // String | Market order bid indicator selector
String charID = "{ any: true }"; // String | Market order character ID selector
String duration = "{ any: true }"; // String | Market order duration selector
String escrow = "{ any: true }"; // String | Market order escrow selector
String issued = "{ any: true }"; // String | Market order issue date selector
String minVolume = "{ any: true }"; // String | Market order min volume selector
String orderState = "{ any: true }"; // String | Market order state selector
String price = "{ any: true }"; // String | Market order price selector
String orderRange = "{ any: true }"; // String | Market order range selector
String stationID = "{ any: true }"; // String | Market order station ID selector
String typeID = "{ any: true }"; // String | Market order type ID selector
String volEntered = "{ any: true }"; // String | Market order volume entered selector
String volRemaining = "{ any: true }"; // String | Market order volume remaining selector
try {
    List<MarketOrder> result = apiInstance.getMarketOrders(accessKey, accessCred, at, contid, maxresults, reverse, orderID, accountKey, bid, charID, duration, escrow, issued, minVolume, orderState, price, orderRange, stationID, typeID, volEntered, volRemaining);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getMarketOrders");
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
 **orderID** | **String**| Market order ID selector | [optional] [default to { any: true }]
 **accountKey** | **String**| Market order account key selector | [optional] [default to { any: true }]
 **bid** | **String**| Market order bid indicator selector | [optional] [default to { any: true }]
 **charID** | **String**| Market order character ID selector | [optional] [default to { any: true }]
 **duration** | **String**| Market order duration selector | [optional] [default to { any: true }]
 **escrow** | **String**| Market order escrow selector | [optional] [default to { any: true }]
 **issued** | **String**| Market order issue date selector | [optional] [default to { any: true }]
 **minVolume** | **String**| Market order min volume selector | [optional] [default to { any: true }]
 **orderState** | **String**| Market order state selector | [optional] [default to { any: true }]
 **price** | **String**| Market order price selector | [optional] [default to { any: true }]
 **orderRange** | **String**| Market order range selector | [optional] [default to { any: true }]
 **stationID** | **String**| Market order station ID selector | [optional] [default to { any: true }]
 **typeID** | **String**| Market order type ID selector | [optional] [default to { any: true }]
 **volEntered** | **String**| Market order volume entered selector | [optional] [default to { any: true }]
 **volRemaining** | **String**| Market order volume remaining selector | [optional] [default to { any: true }]

### Return type

[**List&lt;MarketOrder&gt;**](MarketOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStandings"></a>
# **getStandings**
> List&lt;Standing&gt; getStandings(accessKey, accessCred, at, contid, maxresults, reverse, standingEntity, fromID, fromName, standing)

Get standings)



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String standingEntity = "{ any: true }"; // String | Standing entity selector
String fromID = "{ any: true }"; // String | Standing from ID selector
String fromName = "{ any: true }"; // String | Standing from name selector
String standing = "{ any: true }"; // String | Standing value selector
try {
    List<Standing> result = apiInstance.getStandings(accessKey, accessCred, at, contid, maxresults, reverse, standingEntity, fromID, fromName, standing);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getStandings");
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
 **standingEntity** | **String**| Standing entity selector | [optional] [default to { any: true }]
 **fromID** | **String**| Standing from ID selector | [optional] [default to { any: true }]
 **fromName** | **String**| Standing from name selector | [optional] [default to { any: true }]
 **standing** | **String**| Standing value selector | [optional] [default to { any: true }]

### Return type

[**List&lt;Standing&gt;**](Standing.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWalletTransactions"></a>
# **getWalletTransactions**
> List&lt;WalletTransaction&gt; getWalletTransactions(accessKey, accessCred, at, contid, maxresults, reverse, accountKey, transactionID, date, quantity, typeName, typeID, price, clientID, clientName, stationID, stationName, transactionType, transactionFor, journalTransactionID, clientTypeID, characterID, characterName)

Get wallet transactions



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.CommonApi;


CommonApi apiInstance = new CommonApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
String at = "{ values: [ \"9223372036854775806\" ] }"; // String | Model lifeline selector (defaults to current live data)
Long contid = -1L; // Long | Continuation ID for paged results
Integer maxresults = 1000; // Integer | Maximum number of results to retrieve
Boolean reverse = false; // Boolean | If true, page backwards (results less than contid) with results in descending order (by cid)
String accountKey = "{ any: true }"; // String | Wallet account key selector
String transactionID = "{ any: true }"; // String | Transaction ID selector
String date = "{ any: true }"; // String | Transaction date selector
String quantity = "{ any: true }"; // String | Transaction quantity selector
String typeName = "{ any: true }"; // String | Transaction type name selector
String typeID = "{ any: true }"; // String | Transaction type ID selector
String price = "{ any: true }"; // String | Transaction price selector
String clientID = "{ any: true }"; // String | Transaction client ID selector
String clientName = "{ any: true }"; // String | Transaction client name selector
String stationID = "{ any: true }"; // String | Transaction station ID selector
String stationName = "{ any: true }"; // String | Transaction station name selector
String transactionType = "{ any: true }"; // String | Transaction type selector
String transactionFor = "{ any: true }"; // String | Transaction for selector
String journalTransactionID = "{ any: true }"; // String | Journal transaction ID selector
String clientTypeID = "{ any: true }"; // String | Client type ID selector
String characterID = "{ any: true }"; // String | Character ID selector
String characterName = "{ any: true }"; // String | Character name selector
try {
    List<WalletTransaction> result = apiInstance.getWalletTransactions(accessKey, accessCred, at, contid, maxresults, reverse, accountKey, transactionID, date, quantity, typeName, typeID, price, clientID, clientName, stationID, stationName, transactionType, transactionFor, journalTransactionID, clientTypeID, characterID, characterName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommonApi#getWalletTransactions");
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
 **accountKey** | **String**| Wallet account key selector | [optional] [default to { any: true }]
 **transactionID** | **String**| Transaction ID selector | [optional] [default to { any: true }]
 **date** | **String**| Transaction date selector | [optional] [default to { any: true }]
 **quantity** | **String**| Transaction quantity selector | [optional] [default to { any: true }]
 **typeName** | **String**| Transaction type name selector | [optional] [default to { any: true }]
 **typeID** | **String**| Transaction type ID selector | [optional] [default to { any: true }]
 **price** | **String**| Transaction price selector | [optional] [default to { any: true }]
 **clientID** | **String**| Transaction client ID selector | [optional] [default to { any: true }]
 **clientName** | **String**| Transaction client name selector | [optional] [default to { any: true }]
 **stationID** | **String**| Transaction station ID selector | [optional] [default to { any: true }]
 **stationName** | **String**| Transaction station name selector | [optional] [default to { any: true }]
 **transactionType** | **String**| Transaction type selector | [optional] [default to { any: true }]
 **transactionFor** | **String**| Transaction for selector | [optional] [default to { any: true }]
 **journalTransactionID** | **String**| Journal transaction ID selector | [optional] [default to { any: true }]
 **clientTypeID** | **String**| Client type ID selector | [optional] [default to { any: true }]
 **characterID** | **String**| Character ID selector | [optional] [default to { any: true }]
 **characterName** | **String**| Character name selector | [optional] [default to { any: true }]

### Return type

[**List&lt;WalletTransaction&gt;**](WalletTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

