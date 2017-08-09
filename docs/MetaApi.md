# MetaApi

All URIs are relative to *https://evekit-model.orbital.enterprises//api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetaDataValue**](MetaApi.md#getMetaDataValue) | **GET** /ws/v1/meta/meta/{cid}/{key} | Get meta data value.  A value of null indicates key was not set on this object.
[**getMetaDataValues**](MetaApi.md#getMetaDataValues) | **GET** /ws/v1/meta/meta/{cid} | Get all meta data values for the given model object.
[**removeMetaDataValue**](MetaApi.md#removeMetaDataValue) | **DELETE** /ws/v1/meta/meta/{cid}/{key} | Delete meta data value.
[**removeMetaDataValues**](MetaApi.md#removeMetaDataValues) | **DELETE** /ws/v1/meta/meta/{cid} | Delete all meta data values for the given model object.
[**setMetaDataValue**](MetaApi.md#setMetaDataValue) | **PUT** /ws/v1/meta/meta/{cid}/{key}/{value} | Set meta data value.  If a value already exists for this key, then it is silently over-written.  Null keys or values are not allowed.


<a name="getMetaDataValue"></a>
# **getMetaDataValue**
> MetaData getMetaDataValue(accessKey, accessCred, cid, key)

Get meta data value.  A value of null indicates key was not set on this object.



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.MetaApi;


MetaApi apiInstance = new MetaApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
Long cid = 789L; // Long | Model object ID
String key = "key_example"; // String | Meta-data key
try {
    MetaData result = apiInstance.getMetaDataValue(accessKey, accessCred, cid, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getMetaDataValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **cid** | **Long**| Model object ID |
 **key** | **String**| Meta-data key |

### Return type

[**MetaData**](MetaData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetaDataValues"></a>
# **getMetaDataValues**
> List&lt;MetaData&gt; getMetaDataValues(accessKey, accessCred, cid)

Get all meta data values for the given model object.



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.MetaApi;


MetaApi apiInstance = new MetaApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
Long cid = 789L; // Long | Model object ID
try {
    List<MetaData> result = apiInstance.getMetaDataValues(accessKey, accessCred, cid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getMetaDataValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **cid** | **Long**| Model object ID |

### Return type

[**List&lt;MetaData&gt;**](MetaData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeMetaDataValue"></a>
# **removeMetaDataValue**
> removeMetaDataValue(accessKey, accessCred, cid, key)

Delete meta data value.



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.MetaApi;


MetaApi apiInstance = new MetaApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
Long cid = 789L; // Long | Model object ID
String key = "key_example"; // String | Meta-data key
try {
    apiInstance.removeMetaDataValue(accessKey, accessCred, cid, key);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#removeMetaDataValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **cid** | **Long**| Model object ID |
 **key** | **String**| Meta-data key |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeMetaDataValues"></a>
# **removeMetaDataValues**
> removeMetaDataValues(accessKey, accessCred, cid)

Delete all meta data values for the given model object.



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.MetaApi;


MetaApi apiInstance = new MetaApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
Long cid = 789L; // Long | Model object ID
try {
    apiInstance.removeMetaDataValues(accessKey, accessCred, cid);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#removeMetaDataValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **cid** | **Long**| Model object ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setMetaDataValue"></a>
# **setMetaDataValue**
> setMetaDataValue(accessKey, accessCred, cid, key, value)

Set meta data value.  If a value already exists for this key, then it is silently over-written.  Null keys or values are not allowed.



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.MetaApi;


MetaApi apiInstance = new MetaApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
Long cid = 789L; // Long | Model object ID
String key = "key_example"; // String | Meta-data key
String value = "value_example"; // String | Meta-data value
try {
    apiInstance.setMetaDataValue(accessKey, accessCred, cid, key, value);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#setMetaDataValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |
 **cid** | **Long**| Model object ID |
 **key** | **String**| Meta-data key |
 **value** | **String**| Meta-data value |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

