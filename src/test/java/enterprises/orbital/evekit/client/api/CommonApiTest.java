/*
 * EveKit Model API Server
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package enterprises.orbital.evekit.client.api;

import enterprises.orbital.evekit.client.ApiException;
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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommonApi
 */
@Ignore
public class CommonApiTest {

    private final CommonApi api = new CommonApi();

    
    /**
     * Get account balance(s)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountBalanceTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String division = null;
        String balance = null;
        List<AccountBalance> response = api.getAccountBalance(accessKey, accessCred, at, contid, maxresults, reverse, division, balance);

        // TODO: test validations
    }
    
    /**
     * Get assets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAssetsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String itemID = null;
        String locationID = null;
        String locationType = null;
        String locationFlag = null;
        String typeID = null;
        String quantity = null;
        String singleton = null;
        String blueprintType = null;
        List<Asset> response = api.getAssets(accessKey, accessCred, at, contid, maxresults, reverse, itemID, locationID, locationType, locationFlag, typeID, quantity, singleton, blueprintType);

        // TODO: test validations
    }
    
    /**
     * Get blueprints
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBlueprintsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String itemID = null;
        String locationID = null;
        String locationFlag = null;
        String typeID = null;
        String quantity = null;
        String timeEfficiency = null;
        String materialEfficiency = null;
        String runs = null;
        List<Blueprint> response = api.getBlueprints(accessKey, accessCred, at, contid, maxresults, reverse, itemID, locationID, locationFlag, typeID, quantity, timeEfficiency, materialEfficiency, runs);

        // TODO: test validations
    }
    
    /**
     * Get bookmarks
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBookmarksTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String folderID = null;
        String folderName = null;
        String folderCreatorID = null;
        String bookmarkID = null;
        String bookmarkCreatorID = null;
        String created = null;
        String itemID = null;
        String typeID = null;
        String locationID = null;
        String x = null;
        String y = null;
        String z = null;
        String memo = null;
        String note = null;
        List<Bookmark> response = api.getBookmarks(accessKey, accessCred, at, contid, maxresults, reverse, folderID, folderName, folderCreatorID, bookmarkID, bookmarkCreatorID, created, itemID, typeID, locationID, x, y, z, memo, note);

        // TODO: test validations
    }
    
    /**
     * Get contact labels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactLabelsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String list = null;
        String labelID = null;
        String name = null;
        List<ContactLabel> response = api.getContactLabels(accessKey, accessCred, at, contid, maxresults, reverse, list, labelID, name);

        // TODO: test validations
    }
    
    /**
     * Get contacts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String list = null;
        String contactID = null;
        String standing = null;
        String contactType = null;
        String inWatchlist = null;
        String isBlocked = null;
        String labelID = null;
        List<Contact> response = api.getContacts(accessKey, accessCred, at, contid, maxresults, reverse, list, contactID, standing, contactType, inWatchlist, isBlocked, labelID);

        // TODO: test validations
    }
    
    /**
     * Get contract bids
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContractBidsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String bidID = null;
        String contractID = null;
        String bidderID = null;
        String dateBid = null;
        String amount = null;
        List<ContractBid> response = api.getContractBids(accessKey, accessCred, at, contid, maxresults, reverse, bidID, contractID, bidderID, dateBid, amount);

        // TODO: test validations
    }
    
    /**
     * Get contract items
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContractItemsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String contractID = null;
        String recordID = null;
        String typeID = null;
        String quantity = null;
        String rawQuantity = null;
        String singleton = null;
        String included = null;
        List<ContractItem> response = api.getContractItems(accessKey, accessCred, at, contid, maxresults, reverse, contractID, recordID, typeID, quantity, rawQuantity, singleton, included);

        // TODO: test validations
    }
    
    /**
     * Get contracts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContractsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String contractID = null;
        String issuerID = null;
        String issuerCorpID = null;
        String assigneeID = null;
        String acceptorID = null;
        String startStationID = null;
        String endStationID = null;
        String type = null;
        String status = null;
        String title = null;
        String forCorp = null;
        String availability = null;
        String dateIssued = null;
        String dateExpired = null;
        String dateAccepted = null;
        String numDays = null;
        String dateCompleted = null;
        String price = null;
        String reward = null;
        String collateral = null;
        String buyout = null;
        String volume = null;
        List<Contract> response = api.getContracts(accessKey, accessCred, at, contid, maxresults, reverse, contractID, issuerID, issuerCorpID, assigneeID, acceptorID, startStationID, endStationID, type, status, title, forCorp, availability, dateIssued, dateExpired, dateAccepted, numDays, dateCompleted, price, reward, collateral, buyout, volume);

        // TODO: test validations
    }
    
    /**
     * Get faction war statistics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFacWarStatsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String currentRank = null;
        String enlisted = null;
        String factionID = null;
        String highestRank = null;
        String killsLastWeek = null;
        String killsTotal = null;
        String killsYesterday = null;
        String pilots = null;
        String victoryPointsLastWeek = null;
        String victoryPointsTotal = null;
        String victoryPointsYesterday = null;
        List<FacWarStats> response = api.getFacWarStats(accessKey, accessCred, at, contid, maxresults, reverse, currentRank, enlisted, factionID, highestRank, killsLastWeek, killsTotal, killsYesterday, pilots, victoryPointsLastWeek, victoryPointsTotal, victoryPointsYesterday);

        // TODO: test validations
    }
    
    /**
     * Get industry jobs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIndustryJobsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String jobID = null;
        String installerID = null;
        String facilityID = null;
        String stationID = null;
        String activityID = null;
        String blueprintID = null;
        String blueprintTypeID = null;
        String blueprintLocationID = null;
        String outputLocationID = null;
        String runs = null;
        String cost = null;
        String licensedRuns = null;
        String probability = null;
        String productTypeID = null;
        String status = null;
        String timeInSeconds = null;
        String startDate = null;
        String endDate = null;
        String pauseDate = null;
        String completedDate = null;
        String completedCharacterID = null;
        String successfulRuns = null;
        List<IndustryJob> response = api.getIndustryJobs(accessKey, accessCred, at, contid, maxresults, reverse, jobID, installerID, facilityID, stationID, activityID, blueprintID, blueprintTypeID, blueprintLocationID, outputLocationID, runs, cost, licensedRuns, probability, productTypeID, status, timeInSeconds, startDate, endDate, pauseDate, completedDate, completedCharacterID, successfulRuns);

        // TODO: test validations
    }
    
    /**
     * Get wallet journal entries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJournalEntriesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String division = null;
        String refID = null;
        String date = null;
        String refType = null;
        String firstPartyID = null;
        String firstPartyType = null;
        String secondPartyID = null;
        String secondPartyType = null;
        String argName1 = null;
        String argID1 = null;
        String amount = null;
        String balance = null;
        String reason = null;
        String taxReceiverID = null;
        String taxAmount = null;
        String locationID = null;
        String transactionID = null;
        String npcName = null;
        String npcID = null;
        String destroyedShipTypeID = null;
        String characterID = null;
        String corporationID = null;
        String allianceID = null;
        String jobID = null;
        String contractID = null;
        String systemID = null;
        String planetID = null;
        List<WalletJournal> response = api.getJournalEntries(accessKey, accessCred, at, contid, maxresults, reverse, division, refID, date, refType, firstPartyID, firstPartyType, secondPartyID, secondPartyType, argName1, argID1, amount, balance, reason, taxReceiverID, taxAmount, locationID, transactionID, npcName, npcID, destroyedShipTypeID, characterID, corporationID, allianceID, jobID, contractID, systemID, planetID);

        // TODO: test validations
    }
    
    /**
     * Get kill attackers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKillAttackersTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String killID = null;
        String attackerCharacterID = null;
        String allianceID = null;
        String attackerCorporationID = null;
        String damageDone = null;
        String factionID = null;
        String securityStatus = null;
        String shipTypeID = null;
        String weaponTypeID = null;
        String finalBlow = null;
        List<KillAttacker> response = api.getKillAttackers(accessKey, accessCred, at, contid, maxresults, reverse, killID, attackerCharacterID, allianceID, attackerCorporationID, damageDone, factionID, securityStatus, shipTypeID, weaponTypeID, finalBlow);

        // TODO: test validations
    }
    
    /**
     * Get kill items
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKillItemsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String killID = null;
        String typeID = null;
        String flag = null;
        String qtyDestroyed = null;
        String qtyDropped = null;
        String singleton = null;
        String sequence = null;
        String containerSequence = null;
        List<KillItem> response = api.getKillItems(accessKey, accessCred, at, contid, maxresults, reverse, killID, typeID, flag, qtyDestroyed, qtyDropped, singleton, sequence, containerSequence);

        // TODO: test validations
    }
    
    /**
     * Get kill victims
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKillVictimsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String killID = null;
        String allianceID = null;
        String killCharacterID = null;
        String killCorporationID = null;
        String damageTaken = null;
        String factionID = null;
        String shipTypeID = null;
        String x = null;
        String y = null;
        String z = null;
        List<KillVictim> response = api.getKillVictims(accessKey, accessCred, at, contid, maxresults, reverse, killID, allianceID, killCharacterID, killCorporationID, damageTaken, factionID, shipTypeID, x, y, z);

        // TODO: test validations
    }
    
    /**
     * Get kills
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getKillsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String killID = null;
        String killTime = null;
        String moonID = null;
        String solarSystemID = null;
        String warID = null;
        List<Kill> response = api.getKills(accessKey, accessCred, at, contid, maxresults, reverse, killID, killTime, moonID, solarSystemID, warID);

        // TODO: test validations
    }
    
    /**
     * Get locations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String itemID = null;
        String itemName = null;
        String x = null;
        String y = null;
        String z = null;
        List<Location> response = api.getLocations(accessKey, accessCred, at, contid, maxresults, reverse, itemID, itemName, x, y, z);

        // TODO: test validations
    }
    
    /**
     * Get market orders
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMarketOrdersTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String orderID = null;
        String walletDivision = null;
        String bid = null;
        String charID = null;
        String duration = null;
        String escrow = null;
        String issued = null;
        String minVolume = null;
        String orderState = null;
        String price = null;
        String orderRange = null;
        String typeID = null;
        String volEntered = null;
        String volRemaining = null;
        String regionID = null;
        String locationID = null;
        String isCorp = null;
        List<MarketOrder> response = api.getMarketOrders(accessKey, accessCred, at, contid, maxresults, reverse, orderID, walletDivision, bid, charID, duration, escrow, issued, minVolume, orderState, price, orderRange, typeID, volEntered, volRemaining, regionID, locationID, isCorp);

        // TODO: test validations
    }
    
    /**
     * Get standings)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStandingsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String standingEntity = null;
        String fromID = null;
        String standing = null;
        List<Standing> response = api.getStandings(accessKey, accessCred, at, contid, maxresults, reverse, standingEntity, fromID, standing);

        // TODO: test validations
    }
    
    /**
     * Get wallet transactions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWalletTransactionsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String division = null;
        String transactionID = null;
        String date = null;
        String quantity = null;
        String typeID = null;
        String price = null;
        String clientID = null;
        String locationID = null;
        String isBuy = null;
        String isPersonal = null;
        String journalTransactionID = null;
        List<WalletTransaction> response = api.getWalletTransactions(accessKey, accessCred, at, contid, maxresults, reverse, division, transactionID, date, quantity, typeID, price, clientID, locationID, isBuy, isPersonal, journalTransactionID);

        // TODO: test validations
    }
    
}
