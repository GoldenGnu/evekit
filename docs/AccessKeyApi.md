# AccessKeyApi

All URIs are relative to *https://evekit-model.orbital.enterprises//api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getKeyInfo**](AccessKeyApi.md#getKeyInfo) | **GET** /ws/v1/accesskey/key_info | Get information about an access key
[**getMaskList**](AccessKeyApi.md#getMaskList) | **GET** /ws/v1/accesskey/mask_list | Get access key mask list constants


<a name="getKeyInfo"></a>
# **getKeyInfo**
> KeyInfo getKeyInfo(accessKey, accessCred)

Get information about an access key



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.AccessKeyApi;


AccessKeyApi apiInstance = new AccessKeyApi();
Integer accessKey = 56; // Integer | Model access key
String accessCred = "accessCred_example"; // String | Model access credential
try {
    KeyInfo result = apiInstance.getKeyInfo(accessKey, accessCred);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessKeyApi#getKeyInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKey** | **Integer**| Model access key |
 **accessCred** | **String**| Model access credential |

### Return type

[**KeyInfo**](KeyInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMaskList"></a>
# **getMaskList**
> MaskList getMaskList()

Get access key mask list constants



### Example
```java
// Import classes:
//import enterprises.orbital.evekit.client.invoker.ApiException;
//import enterprises.orbital.evekit.client.api.AccessKeyApi;


AccessKeyApi apiInstance = new AccessKeyApi();
try {
    MaskList result = apiInstance.getMaskList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessKeyApi#getMaskList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MaskList**](MaskList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

