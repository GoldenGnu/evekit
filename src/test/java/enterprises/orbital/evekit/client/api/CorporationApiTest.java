/*
 * EveKit Model API Server
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.ApiException;
import enterprises.orbital.evekit.client.model.ContainerLog;
import enterprises.orbital.evekit.client.model.CorporationMedal;
import enterprises.orbital.evekit.client.model.CorporationMemberMedal;
import enterprises.orbital.evekit.client.model.CorporationSheet;
import enterprises.orbital.evekit.client.model.CorporationTitle;
import enterprises.orbital.evekit.client.model.CorporationTitleRole;
import enterprises.orbital.evekit.client.model.CustomsOffice;
import enterprises.orbital.evekit.client.model.Division;
import enterprises.orbital.evekit.client.model.Facility;
import enterprises.orbital.evekit.client.model.Fuel;
import enterprises.orbital.evekit.client.model.Member;
import enterprises.orbital.evekit.client.model.MemberLimit;
import enterprises.orbital.evekit.client.model.MemberRole;
import enterprises.orbital.evekit.client.model.MemberRoleHistory;
import enterprises.orbital.evekit.client.model.MemberTitle;
import enterprises.orbital.evekit.client.model.MemberTracking;
import enterprises.orbital.evekit.client.model.MiningExtraction;
import enterprises.orbital.evekit.client.model.MiningObservation;
import enterprises.orbital.evekit.client.model.MiningObserver;
import enterprises.orbital.evekit.client.model.ServiceError;
import enterprises.orbital.evekit.client.model.Shareholder;
import enterprises.orbital.evekit.client.model.Starbase;
import enterprises.orbital.evekit.client.model.Structure;
import enterprises.orbital.evekit.client.model.StructureService;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CorporationApi
 */
@Ignore
public class CorporationApiTest {

    private final CorporationApi api = new CorporationApi();

    
    /**
     * Get container log records
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContainerLogsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String logTime = null;
        String action = null;
        String characterID = null;
        String locationFlag = null;
        String containerID = null;
        String containerTypeID = null;
        String locationID = null;
        String newConfiguration = null;
        String oldConfiguration = null;
        String passwordType = null;
        String quantity = null;
        String typeID = null;
        List<ContainerLog> response = api.getContainerLogs(accessKey, accessCred, at, contid, maxresults, reverse, logTime, action, characterID, locationFlag, containerID, containerTypeID, locationID, newConfiguration, oldConfiguration, passwordType, quantity, typeID);

        // TODO: test validations
    }
    
    /**
     * Get corporation medals
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationMedalsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String medalID = null;
        String description = null;
        String title = null;
        String created = null;
        String creatorID = null;
        List<CorporationMedal> response = api.getCorporationMedals(accessKey, accessCred, at, contid, maxresults, reverse, medalID, description, title, created, creatorID);

        // TODO: test validations
    }
    
    /**
     * Get corporation sheet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationSheetTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String allianceID = null;
        String ceoID = null;
        String corporationID = null;
        String corporationName = null;
        String description = null;
        String memberCount = null;
        String shares = null;
        String stationID = null;
        String taxRate = null;
        String ticker = null;
        String url = null;
        String dateFounded = null;
        String creatorID = null;
        String factionID = null;
        String px64x64 = null;
        String px128x128 = null;
        String px256x256 = null;
        String warEligible = null;
        List<CorporationSheet> response = api.getCorporationSheet(accessKey, accessCred, at, contid, maxresults, reverse, allianceID, ceoID, corporationID, corporationName, description, memberCount, shares, stationID, taxRate, ticker, url, dateFounded, creatorID, factionID, px64x64, px128x128, px256x256, warEligible);

        // TODO: test validations
    }
    
    /**
     * Get corporation title roles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationTitleRolesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String titleID = null;
        String roleName = null;
        String grantable = null;
        String atHQ = null;
        String atBase = null;
        String atOther = null;
        List<CorporationTitleRole> response = api.getCorporationTitleRoles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, roleName, grantable, atHQ, atBase, atOther);

        // TODO: test validations
    }
    
    /**
     * Get corporation titles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationTitlesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String titleID = null;
        String titleName = null;
        List<CorporationTitle> response = api.getCorporationTitles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, titleName);

        // TODO: test validations
    }
    
    /**
     * Get corporation customs offices
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomsOfficesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String officeID = null;
        String solarSystemID = null;
        String reinforceExitStart = null;
        String reinforceExitEnd = null;
        String allowAlliance = null;
        String allowStandings = null;
        String standingLevel = null;
        String taxRateAlliance = null;
        String taxRateCorp = null;
        String taxRateStandingExcellent = null;
        String taxRateStandingGood = null;
        String taxRateStandingNeutral = null;
        String taxRateStandingBad = null;
        String taxRateStandingTerrible = null;
        List<CustomsOffice> response = api.getCustomsOffices(accessKey, accessCred, at, contid, maxresults, reverse, officeID, solarSystemID, reinforceExitStart, reinforceExitEnd, allowAlliance, allowStandings, standingLevel, taxRateAlliance, taxRateCorp, taxRateStandingExcellent, taxRateStandingGood, taxRateStandingNeutral, taxRateStandingBad, taxRateStandingTerrible);

        // TODO: test validations
    }
    
    /**
     * Get corporation divisions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDivisionsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String wallet = null;
        String division = null;
        String name = null;
        List<Division> response = api.getDivisions(accessKey, accessCred, at, contid, maxresults, reverse, wallet, division, name);

        // TODO: test validations
    }
    
    /**
     * Get corporation facilities
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFacilitiesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String facilityID = null;
        String typeID = null;
        String solarSystemID = null;
        List<Facility> response = api.getFacilities(accessKey, accessCred, at, contid, maxresults, reverse, facilityID, typeID, solarSystemID);

        // TODO: test validations
    }
    
    /**
     * Get corporation starbase fuel levels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFuelTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String starbaseID = null;
        String typeID = null;
        String quantity = null;
        List<Fuel> response = api.getFuel(accessKey, accessCred, at, contid, maxresults, reverse, starbaseID, typeID, quantity);

        // TODO: test validations
    }
    
    /**
     * Get corporation member limit information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberLimitTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String memberLimit = null;
        List<MemberLimit> response = api.getMemberLimit(accessKey, accessCred, at, contid, maxresults, reverse, memberLimit);

        // TODO: test validations
    }
    
    /**
     * Get medals awarded to corporation members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberMedalsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String medalID = null;
        String characterID = null;
        String issued = null;
        String issuerID = null;
        String reason = null;
        String status = null;
        List<CorporationMemberMedal> response = api.getMemberMedals(accessKey, accessCred, at, contid, maxresults, reverse, medalID, characterID, issued, issuerID, reason, status);

        // TODO: test validations
    }
    
    /**
     * Get corporation member role history entries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberRoleHistoryTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String characterID = null;
        String changedAt = null;
        String issuerID = null;
        String roleType = null;
        String roleName = null;
        String old = null;
        List<MemberRoleHistory> response = api.getMemberRoleHistory(accessKey, accessCred, at, contid, maxresults, reverse, characterID, changedAt, issuerID, roleType, roleName, old);

        // TODO: test validations
    }
    
    /**
     * Get corporation member roles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberRolesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String characterID = null;
        String roleName = null;
        String grantable = null;
        String atHQ = null;
        String atBase = null;
        String atOther = null;
        List<MemberRole> response = api.getMemberRoles(accessKey, accessCred, at, contid, maxresults, reverse, characterID, roleName, grantable, atHQ, atBase, atOther);

        // TODO: test validations
    }
    
    /**
     * Get corporation member titles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberTitlesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String characterID = null;
        String titleID = null;
        List<MemberTitle> response = api.getMemberTitles(accessKey, accessCred, at, contid, maxresults, reverse, characterID, titleID);

        // TODO: test validations
    }
    
    /**
     * Get member tracking information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberTrackingTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String characterID = null;
        String baseID = null;
        String locationID = null;
        String logoffDateTime = null;
        String logonDateTime = null;
        String shipTypeID = null;
        String startDateTime = null;
        List<MemberTracking> response = api.getMemberTracking(accessKey, accessCred, at, contid, maxresults, reverse, characterID, baseID, locationID, logoffDateTime, logonDateTime, shipTypeID, startDateTime);

        // TODO: test validations
    }
    
    /**
     * Get corporation members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMembersTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String characterID = null;
        List<Member> response = api.getMembers(accessKey, accessCred, at, contid, maxresults, reverse, characterID);

        // TODO: test validations
    }
    
    /**
     * Get mining extractions information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMiningExtractionsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String moonID = null;
        String structureID = null;
        String extractionStartTime = null;
        String chunkArrivalTime = null;
        String naturalDecayTime = null;
        List<MiningExtraction> response = api.getMiningExtractions(accessKey, accessCred, at, contid, maxresults, reverse, moonID, structureID, extractionStartTime, chunkArrivalTime, naturalDecayTime);

        // TODO: test validations
    }
    
    /**
     * Get mining observations information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMiningObservationsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String observerID = null;
        String characterID = null;
        String typeID = null;
        String recordedCorporationID = null;
        String quantity = null;
        String lastUpdated = null;
        List<MiningObservation> response = api.getMiningObservations(accessKey, accessCred, at, contid, maxresults, reverse, observerID, characterID, typeID, recordedCorporationID, quantity, lastUpdated);

        // TODO: test validations
    }
    
    /**
     * Get mining observers information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMiningObserversTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String observerID = null;
        String observerType = null;
        String lastUpdated = null;
        List<MiningObserver> response = api.getMiningObservers(accessKey, accessCred, at, contid, maxresults, reverse, observerID, observerType, lastUpdated);

        // TODO: test validations
    }
    
    /**
     * Get corporation shareholders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShareholdersTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String shareholderID = null;
        String shareholderType = null;
        String shares = null;
        List<Shareholder> response = api.getShareholders(accessKey, accessCred, at, contid, maxresults, reverse, shareholderID, shareholderType, shares);

        // TODO: test validations
    }
    
    /**
     * Get corporation starbases
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStarbasesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String starbaseID = null;
        String typeID = null;
        String systemID = null;
        String moonID = null;
        String state = null;
        String unanchorAt = null;
        String reinforcedUntil = null;
        String onlinedSince = null;
        String fuelBayView = null;
        String fuelBayTake = null;
        String anchor = null;
        String unanchor = null;
        String online = null;
        String offline = null;
        String allowCorporationMembers = null;
        String allowAllianceMembers = null;
        String useAllianceStandings = null;
        String attackStandingThreshold = null;
        String attackSecurityStatusThreshold = null;
        String attackIfOtherSecurityStatusDropping = null;
        String attackIfAtWar = null;
        List<Starbase> response = api.getStarbases(accessKey, accessCred, at, contid, maxresults, reverse, starbaseID, typeID, systemID, moonID, state, unanchorAt, reinforcedUntil, onlinedSince, fuelBayView, fuelBayTake, anchor, unanchor, online, offline, allowCorporationMembers, allowAllianceMembers, useAllianceStandings, attackStandingThreshold, attackSecurityStatusThreshold, attackIfOtherSecurityStatusDropping, attackIfAtWar);

        // TODO: test validations
    }
    
    /**
     * Get structure services
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStructureServicesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String structureID = null;
        String name = null;
        String state = null;
        List<StructureService> response = api.getStructureServices(accessKey, accessCred, at, contid, maxresults, reverse, structureID, name, state);

        // TODO: test validations
    }
    
    /**
     * Get structures
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStructuresTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String structureID = null;
        String corporationID = null;
        String fuelExpires = null;
        String nextReinforceApply = null;
        String nextReinforceHour = null;
        String nextReinforceWeekday = null;
        String profileID = null;
        String reinforceHour = null;
        String reinforceWeekday = null;
        String state = null;
        String stateTimerEnd = null;
        String stateTimerStart = null;
        String systemID = null;
        String typeID = null;
        String unanchorsAt = null;
        List<Structure> response = api.getStructures(accessKey, accessCred, at, contid, maxresults, reverse, structureID, corporationID, fuelExpires, nextReinforceApply, nextReinforceHour, nextReinforceWeekday, profileID, reinforceHour, reinforceWeekday, state, stateTimerEnd, stateTimerStart, systemID, typeID, unanchorsAt);

        // TODO: test validations
    }
    
}
