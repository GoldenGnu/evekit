# evekit

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>enterprises.orbital.evekit</groupId>
    <artifactId>evekit</artifactId>
    <version>2.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "enterprises.orbital.evekit:evekit:2.1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/evekit-2.1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import enterprises.orbital.evekit.client.invoker.*;
import enterprises.orbital.evekit.client.invoker.auth.*;
import enterprises.orbital.evekit.client.invoker.model.*;
import enterprises.orbital.evekit.client.api.AccessKeyApi;

import java.io.File;
import java.util.*;

public class AccessKeyApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://evekit-model.orbital.enterprises//api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessKeyApi* | [**getKeyInfo**](docs/AccessKeyApi.md#getKeyInfo) | **GET** /ws/v1/accesskey/key_info | Get information about an access key
*AccessKeyApi* | [**getMaskList**](docs/AccessKeyApi.md#getMaskList) | **GET** /ws/v1/accesskey/mask_list | Get access key mask list constants
*CharacterApi* | [**getAccountStatus**](docs/CharacterApi.md#getAccountStatus) | **GET** /ws/v1/char/account_status | Get account status(es)
*CharacterApi* | [**getBalances**](docs/CharacterApi.md#getBalances) | **GET** /ws/v1/char/balance | Get character sheet balance
*CharacterApi* | [**getCalendarEventAttendees**](docs/CharacterApi.md#getCalendarEventAttendees) | **GET** /ws/v1/char/calendar_event_attendees | Get calendar event attendees
*CharacterApi* | [**getChannelMembers**](docs/CharacterApi.md#getChannelMembers) | **GET** /ws/v1/char/channel_member | Get chat channel members
*CharacterApi* | [**getChannels**](docs/CharacterApi.md#getChannels) | **GET** /ws/v1/char/channel | Get character chat channels
*CharacterApi* | [**getCharacterSheets**](docs/CharacterApi.md#getCharacterSheets) | **GET** /ws/v1/char/sheet | Get character sheet
*CharacterApi* | [**getCloneJumpTimers**](docs/CharacterApi.md#getCloneJumpTimers) | **GET** /ws/v1/char/clone_jump_timer | Get character clone jump timers
*CharacterApi* | [**getContactNotifications**](docs/CharacterApi.md#getContactNotifications) | **GET** /ws/v1/char/contact_notification | Get character contact notifications
*CharacterApi* | [**getImplants**](docs/CharacterApi.md#getImplants) | **GET** /ws/v1/char/implant | Get character implants
*CharacterApi* | [**getJumpCloneImplants**](docs/CharacterApi.md#getJumpCloneImplants) | **GET** /ws/v1/char/jump_clone_implant | Get character jump clone implants
*CharacterApi* | [**getJumpClones**](docs/CharacterApi.md#getJumpClones) | **GET** /ws/v1/char/jump_clone | Get character jump clones
*CharacterApi* | [**getJumpTimers**](docs/CharacterApi.md#getJumpTimers) | **GET** /ws/v1/char/jump_timer | Get character jump timers
*CharacterApi* | [**getMailMessageBodies**](docs/CharacterApi.md#getMailMessageBodies) | **GET** /ws/v1/char/mail_message_body | Get character mail message bodies
*CharacterApi* | [**getMailMessages**](docs/CharacterApi.md#getMailMessages) | **GET** /ws/v1/char/mail_message | Get character mail messages (not bodies)
*CharacterApi* | [**getMailingLists**](docs/CharacterApi.md#getMailingLists) | **GET** /ws/v1/char/mailing_list | Get character mailing lists
*CharacterApi* | [**getMedals**](docs/CharacterApi.md#getMedals) | **GET** /ws/v1/char/medal | Get character medals
*CharacterApi* | [**getNotificationBodies**](docs/CharacterApi.md#getNotificationBodies) | **GET** /ws/v1/char/notification_body | Get character notification bodies
*CharacterApi* | [**getNotifications**](docs/CharacterApi.md#getNotifications) | **GET** /ws/v1/char/notification | Get character notifications (not bodies)
*CharacterApi* | [**getPlanetaryColonies**](docs/CharacterApi.md#getPlanetaryColonies) | **GET** /ws/v1/char/planetary_colony | Get planetary colonies
*CharacterApi* | [**getPlanetaryLinks**](docs/CharacterApi.md#getPlanetaryLinks) | **GET** /ws/v1/char/planetary_link | Get planetary links
*CharacterApi* | [**getPlanetaryPins**](docs/CharacterApi.md#getPlanetaryPins) | **GET** /ws/v1/char/planetary_pin | Get planetary pins
*CharacterApi* | [**getPlanetaryRoutes**](docs/CharacterApi.md#getPlanetaryRoutes) | **GET** /ws/v1/char/planetary_route | Get planetary routes
*CharacterApi* | [**getResearchAgents**](docs/CharacterApi.md#getResearchAgents) | **GET** /ws/v1/char/research_agent | Get character research agents
*CharacterApi* | [**getRoles**](docs/CharacterApi.md#getRoles) | **GET** /ws/v1/char/role | Get character roles
*CharacterApi* | [**getSkills**](docs/CharacterApi.md#getSkills) | **GET** /ws/v1/char/skill | Get character skills
*CharacterApi* | [**getSkillsInQueue**](docs/CharacterApi.md#getSkillsInQueue) | **GET** /ws/v1/char/skill_queue | Get character skill queue
*CharacterApi* | [**getSkillsInTraining**](docs/CharacterApi.md#getSkillsInTraining) | **GET** /ws/v1/char/skill_in_training | Get character skill in training
*CharacterApi* | [**getTitles**](docs/CharacterApi.md#getTitles) | **GET** /ws/v1/char/title | Get character titles
*CharacterApi* | [**getUpcomingCalendarEvents**](docs/CharacterApi.md#getUpcomingCalendarEvents) | **GET** /ws/v1/char/calendar_events | Get upcoming calendar events
*CommonApi* | [**getAccountBalance**](docs/CommonApi.md#getAccountBalance) | **GET** /ws/v1/common/account_balance | Get account balance(s)
*CommonApi* | [**getAssets**](docs/CommonApi.md#getAssets) | **GET** /ws/v1/common/asset | Get assets
*CommonApi* | [**getBlueprints**](docs/CommonApi.md#getBlueprints) | **GET** /ws/v1/common/blueprint | Get blueprints
*CommonApi* | [**getBookmarks**](docs/CommonApi.md#getBookmarks) | **GET** /ws/v1/common/bookmark | Get bookmarks
*CommonApi* | [**getContactLabels**](docs/CommonApi.md#getContactLabels) | **GET** /ws/v1/common/contact_label | Get contact labels
*CommonApi* | [**getContacts**](docs/CommonApi.md#getContacts) | **GET** /ws/v1/common/contact | Get contacts
*CommonApi* | [**getContractBids**](docs/CommonApi.md#getContractBids) | **GET** /ws/v1/common/contract_bid | Get contract bids
*CommonApi* | [**getContractItems**](docs/CommonApi.md#getContractItems) | **GET** /ws/v1/common/contract_item | Get contract items
*CommonApi* | [**getContracts**](docs/CommonApi.md#getContracts) | **GET** /ws/v1/common/contract | Get contracts
*CommonApi* | [**getFacWarStats**](docs/CommonApi.md#getFacWarStats) | **GET** /ws/v1/common/fac_war_stats | Get faction war statistics
*CommonApi* | [**getIndustryJobs**](docs/CommonApi.md#getIndustryJobs) | **GET** /ws/v1/common/industry_job | Get industry jobs
*CommonApi* | [**getJournalEntries**](docs/CommonApi.md#getJournalEntries) | **GET** /ws/v1/common/wallet_journal | Get wallet journal entries
*CommonApi* | [**getKillAttackers**](docs/CommonApi.md#getKillAttackers) | **GET** /ws/v1/common/kill_attacker | Get kill attackers
*CommonApi* | [**getKillItems**](docs/CommonApi.md#getKillItems) | **GET** /ws/v1/common/kill_item | Get kill items
*CommonApi* | [**getKillVictims**](docs/CommonApi.md#getKillVictims) | **GET** /ws/v1/common/kill_victim | Get kill victims
*CommonApi* | [**getKills**](docs/CommonApi.md#getKills) | **GET** /ws/v1/common/kill | Get kills
*CommonApi* | [**getLocations**](docs/CommonApi.md#getLocations) | **GET** /ws/v1/common/location | Get locations
*CommonApi* | [**getMarketOrders**](docs/CommonApi.md#getMarketOrders) | **GET** /ws/v1/common/market_order | Get market orders
*CommonApi* | [**getStandings**](docs/CommonApi.md#getStandings) | **GET** /ws/v1/common/standing | Get standings)
*CommonApi* | [**getWalletTransactions**](docs/CommonApi.md#getWalletTransactions) | **GET** /ws/v1/common/wallet_transaction | Get wallet transactions
*CorporationApi* | [**getContainerLogs**](docs/CorporationApi.md#getContainerLogs) | **GET** /ws/v1/corp/container_log | Get container log records
*CorporationApi* | [**getCorporationMedals**](docs/CorporationApi.md#getCorporationMedals) | **GET** /ws/v1/corp/medal | Get corporation medals
*CorporationApi* | [**getCorporationSheet**](docs/CorporationApi.md#getCorporationSheet) | **GET** /ws/v1/corp/sheet | Get corporation sheet
*CorporationApi* | [**getCorporationTitles**](docs/CorporationApi.md#getCorporationTitles) | **GET** /ws/v1/corp/title | Get corporation titles
*CorporationApi* | [**getCustomsOffices**](docs/CorporationApi.md#getCustomsOffices) | **GET** /ws/v1/corp/customs_office | Get corporation customs offices
*CorporationApi* | [**getDivisions**](docs/CorporationApi.md#getDivisions) | **GET** /ws/v1/corp/division | Get corporation divisions
*CorporationApi* | [**getFacilities**](docs/CorporationApi.md#getFacilities) | **GET** /ws/v1/corp/facility | Get corporation facilities
*CorporationApi* | [**getFuel**](docs/CorporationApi.md#getFuel) | **GET** /ws/v1/corp/fuel | Get corporation starbase fuel levels
*CorporationApi* | [**getMemberMedals**](docs/CorporationApi.md#getMemberMedals) | **GET** /ws/v1/corp/member_medal | Get medals awarded to corporation members
*CorporationApi* | [**getMemberSecurity**](docs/CorporationApi.md#getMemberSecurity) | **GET** /ws/v1/corp/member_security | Get corporation member security settings
*CorporationApi* | [**getMemberSecurityLog**](docs/CorporationApi.md#getMemberSecurityLog) | **GET** /ws/v1/corp/member_security_log | Get corporation member security log entries
*CorporationApi* | [**getMemberTracking**](docs/CorporationApi.md#getMemberTracking) | **GET** /ws/v1/corp/member_tracking | Get member tracking information
*CorporationApi* | [**getOutpostServiceDetails**](docs/CorporationApi.md#getOutpostServiceDetails) | **GET** /ws/v1/corp/outpost_service_detail | Get corporation outpost service detail
*CorporationApi* | [**getOutposts**](docs/CorporationApi.md#getOutposts) | **GET** /ws/v1/corp/outpost | Get corporation outposts
*CorporationApi* | [**getRoles**](docs/CorporationApi.md#getRoles) | **GET** /ws/v1/corp/role | Get corporation title roles
*CorporationApi* | [**getSecurityRoles**](docs/CorporationApi.md#getSecurityRoles) | **GET** /ws/v1/corp/security_role | Get corporation security roles
*CorporationApi* | [**getSecurityTitles**](docs/CorporationApi.md#getSecurityTitles) | **GET** /ws/v1/corp/security_title | Get corporation security titles
*CorporationApi* | [**getShareholders**](docs/CorporationApi.md#getShareholders) | **GET** /ws/v1/corp/shareholder | Get corporation shareholders
*CorporationApi* | [**getStarbaseDetails**](docs/CorporationApi.md#getStarbaseDetails) | **GET** /ws/v1/corp/starbase_detail | Get corporation starbase details
*CorporationApi* | [**getStarbases**](docs/CorporationApi.md#getStarbases) | **GET** /ws/v1/corp/starbase | Get corporation starbases
*MetaApi* | [**getMetaDataValue**](docs/MetaApi.md#getMetaDataValue) | **GET** /ws/v1/meta/meta/{cid}/{key} | Get meta data value.  A value of null indicates key was not set on this object.
*MetaApi* | [**getMetaDataValues**](docs/MetaApi.md#getMetaDataValues) | **GET** /ws/v1/meta/meta/{cid} | Get all meta data values for the given model object.
*MetaApi* | [**removeMetaDataValue**](docs/MetaApi.md#removeMetaDataValue) | **DELETE** /ws/v1/meta/meta/{cid}/{key} | Delete meta data value.
*MetaApi* | [**removeMetaDataValues**](docs/MetaApi.md#removeMetaDataValues) | **DELETE** /ws/v1/meta/meta/{cid} | Delete all meta data values for the given model object.
*MetaApi* | [**setMetaDataValue**](docs/MetaApi.md#setMetaDataValue) | **PUT** /ws/v1/meta/meta/{cid}/{key}/{value} | Set meta data value.  If a value already exists for this key, then it is silently over-written.  Null keys or values are not allowed.


## Documentation for Models

 - [AccountBalance](docs/AccountBalance.md)
 - [AccountStatus](docs/AccountStatus.md)
 - [Asset](docs/Asset.md)
 - [Blueprint](docs/Blueprint.md)
 - [Bookmark](docs/Bookmark.md)
 - [CalendarEventAttendee](docs/CalendarEventAttendee.md)
 - [CharacterContactNotification](docs/CharacterContactNotification.md)
 - [CharacterMailMessage](docs/CharacterMailMessage.md)
 - [CharacterMailMessageBody](docs/CharacterMailMessageBody.md)
 - [CharacterMedal](docs/CharacterMedal.md)
 - [CharacterNotification](docs/CharacterNotification.md)
 - [CharacterNotificationBody](docs/CharacterNotificationBody.md)
 - [CharacterRole](docs/CharacterRole.md)
 - [CharacterSheet](docs/CharacterSheet.md)
 - [CharacterSheetBalance](docs/CharacterSheetBalance.md)
 - [CharacterSheetClone](docs/CharacterSheetClone.md)
 - [CharacterSheetJump](docs/CharacterSheetJump.md)
 - [CharacterSkill](docs/CharacterSkill.md)
 - [CharacterSkillInTraining](docs/CharacterSkillInTraining.md)
 - [CharacterTitle](docs/CharacterTitle.md)
 - [ChatChannel](docs/ChatChannel.md)
 - [ChatChannelMember](docs/ChatChannelMember.md)
 - [Contact](docs/Contact.md)
 - [ContactLabel](docs/ContactLabel.md)
 - [ContainerLog](docs/ContainerLog.md)
 - [Contract](docs/Contract.md)
 - [ContractBid](docs/ContractBid.md)
 - [ContractItem](docs/ContractItem.md)
 - [CorporationMedal](docs/CorporationMedal.md)
 - [CorporationMemberMedal](docs/CorporationMemberMedal.md)
 - [CorporationSheet](docs/CorporationSheet.md)
 - [CorporationTitle](docs/CorporationTitle.md)
 - [CustomsOffice](docs/CustomsOffice.md)
 - [Division](docs/Division.md)
 - [FacWarStats](docs/FacWarStats.md)
 - [Facility](docs/Facility.md)
 - [Fuel](docs/Fuel.md)
 - [Implant](docs/Implant.md)
 - [IndustryJob](docs/IndustryJob.md)
 - [JumpClone](docs/JumpClone.md)
 - [JumpCloneImplant](docs/JumpCloneImplant.md)
 - [KeyInfo](docs/KeyInfo.md)
 - [Kill](docs/Kill.md)
 - [KillAttacker](docs/KillAttacker.md)
 - [KillItem](docs/KillItem.md)
 - [KillVictim](docs/KillVictim.md)
 - [Location](docs/Location.md)
 - [MailingList](docs/MailingList.md)
 - [MarketOrder](docs/MarketOrder.md)
 - [MaskList](docs/MaskList.md)
 - [MemberSecurity](docs/MemberSecurity.md)
 - [MemberSecurityLog](docs/MemberSecurityLog.md)
 - [MemberTracking](docs/MemberTracking.md)
 - [MetaData](docs/MetaData.md)
 - [Outpost](docs/Outpost.md)
 - [OutpostServiceDetail](docs/OutpostServiceDetail.md)
 - [PlanetaryColony](docs/PlanetaryColony.md)
 - [PlanetaryLink](docs/PlanetaryLink.md)
 - [PlanetaryPin](docs/PlanetaryPin.md)
 - [PlanetaryRoute](docs/PlanetaryRoute.md)
 - [ResearchAgent](docs/ResearchAgent.md)
 - [Role](docs/Role.md)
 - [SecurityRole](docs/SecurityRole.md)
 - [SecurityTitle](docs/SecurityTitle.md)
 - [ServiceError](docs/ServiceError.md)
 - [Shareholder](docs/Shareholder.md)
 - [SkillInQueue](docs/SkillInQueue.md)
 - [Standing](docs/Standing.md)
 - [Starbase](docs/Starbase.md)
 - [StarbaseDetail](docs/StarbaseDetail.md)
 - [UpcomingCalendarEvent](docs/UpcomingCalendarEvent.md)
 - [WalletJournal](docs/WalletJournal.md)
 - [WalletTransaction](docs/WalletTransaction.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



