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
import enterprises.orbital.evekit.client.model.CalendarEventAttendee;
import enterprises.orbital.evekit.client.model.CharacterContactNotification;
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
import enterprises.orbital.evekit.client.model.Implant;
import enterprises.orbital.evekit.client.model.JumpClone;
import enterprises.orbital.evekit.client.model.JumpCloneImplant;
import enterprises.orbital.evekit.client.model.MailLabel;
import enterprises.orbital.evekit.client.model.MailingList;
import enterprises.orbital.evekit.client.model.PlanetaryColony;
import enterprises.orbital.evekit.client.model.PlanetaryLink;
import enterprises.orbital.evekit.client.model.PlanetaryPin;
import enterprises.orbital.evekit.client.model.PlanetaryRoute;
import enterprises.orbital.evekit.client.model.ResearchAgent;
import enterprises.orbital.evekit.client.model.ServiceError;
import enterprises.orbital.evekit.client.model.SkillInQueue;
import enterprises.orbital.evekit.client.model.UpcomingCalendarEvent;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CharacterApi
 */
@Ignore
public class CharacterApiTest {

    private final CharacterApi api = new CharacterApi();

    
    /**
     * Get calendar event attendees
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCalendarEventAttendeesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String eventID = null;
        String characterID = null;
        String response = null;
        List<CalendarEventAttendee> responses = api.getCalendarEventAttendees(accessKey, accessCred, at, contid, maxresults, reverse, eventID, characterID, response);

        // TODO: test validations
    }
    
    /**
     * Get chat channel members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelMembersTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String channelID = null;
        String category = null;
        String accessorID = null;
        String accessorType = null;
        String untilWhen = null;
        String reason = null;
        List<ChatChannelMember> response = api.getChannelMembers(accessKey, accessCred, at, contid, maxresults, reverse, channelID, category, accessorID, accessorType, untilWhen, reason);

        // TODO: test validations
    }
    
    /**
     * Get character chat channels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChannelsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String channelID = null;
        String ownerID = null;
        String displayName = null;
        String comparisonKey = null;
        String hasPassword = null;
        String motd = null;
        List<ChatChannel> response = api.getChannels(accessKey, accessCred, at, contid, maxresults, reverse, channelID, ownerID, displayName, comparisonKey, hasPassword, motd);

        // TODO: test validations
    }
    
    /**
     * Get character sheet attributes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharacterSheetAttributesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String intelligence = null;
        String memory = null;
        String charisma = null;
        String perception = null;
        String willpower = null;
        String lastRemapDate = null;
        String accruedRemapCooldownDate = null;
        String bonusRemaps = null;
        List<CharacterSheetAttributes> response = api.getCharacterSheetAttributes(accessKey, accessCred, at, contid, maxresults, reverse, intelligence, memory, charisma, perception, willpower, lastRemapDate, accruedRemapCooldownDate, bonusRemaps);

        // TODO: test validations
    }
    
    /**
     * Get character sheet
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharacterSheetsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String characterID = null;
        String name = null;
        String corporationID = null;
        String raceID = null;
        String doB = null;
        String bloodlineID = null;
        String ancestryID = null;
        String gender = null;
        String allianceID = null;
        String factionID = null;
        String description = null;
        String securityStatus = null;
        List<CharacterSheet> response = api.getCharacterSheets(accessKey, accessCred, at, contid, maxresults, reverse, characterID, name, corporationID, raceID, doB, bloodlineID, ancestryID, gender, allianceID, factionID, description, securityStatus);

        // TODO: test validations
    }
    
    /**
     * Get character clone jump timers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCloneJumpTimersTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String cloneJumpDate = null;
        String homeStationID = null;
        String homeStationType = null;
        String lastStationChangeDate = null;
        List<CharacterSheetClone> response = api.getCloneJumpTimers(accessKey, accessCred, at, contid, maxresults, reverse, cloneJumpDate, homeStationID, homeStationType, lastStationChangeDate);

        // TODO: test validations
    }
    
    /**
     * Get character contact notifications
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactNotificationsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String notificationID = null;
        String senderID = null;
        String sentDate = null;
        String standingLevel = null;
        String messageData = null;
        List<CharacterContactNotification> response = api.getContactNotifications(accessKey, accessCred, at, contid, maxresults, reverse, notificationID, senderID, sentDate, standingLevel, messageData);

        // TODO: test validations
    }
    
    /**
     * Get character implants
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getImplantsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String typeID = null;
        List<Implant> response = api.getImplants(accessKey, accessCred, at, contid, maxresults, reverse, typeID);

        // TODO: test validations
    }
    
    /**
     * Get character jump clone implants
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJumpCloneImplantsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String jumpCloneID = null;
        String typeID = null;
        List<JumpCloneImplant> response = api.getJumpCloneImplants(accessKey, accessCred, at, contid, maxresults, reverse, jumpCloneID, typeID);

        // TODO: test validations
    }
    
    /**
     * Get character jump clones
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJumpClonesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String jumpCloneID = null;
        String locationID = null;
        String cloneName = null;
        String locationType = null;
        List<JumpClone> response = api.getJumpClones(accessKey, accessCred, at, contid, maxresults, reverse, jumpCloneID, locationID, cloneName, locationType);

        // TODO: test validations
    }
    
    /**
     * Get character jump timers
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJumpTimersTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String jumpActivation = null;
        String jumpFatigue = null;
        String jumpLastUpdate = null;
        List<CharacterSheetJump> response = api.getJumpTimers(accessKey, accessCred, at, contid, maxresults, reverse, jumpActivation, jumpFatigue, jumpLastUpdate);

        // TODO: test validations
    }
    
    /**
     * Get character location
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLocationTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String solarSystemID = null;
        String stationID = null;
        String structureID = null;
        List<CharacterLocation> response = api.getLocation(accessKey, accessCred, at, contid, maxresults, reverse, solarSystemID, stationID, structureID);

        // TODO: test validations
    }
    
    /**
     * Get character mail labels
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMailLabelsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String labelID = null;
        String unreadCount = null;
        String name = null;
        String color = null;
        List<MailLabel> response = api.getMailLabels(accessKey, accessCred, at, contid, maxresults, reverse, labelID, unreadCount, name, color);

        // TODO: test validations
    }
    
    /**
     * Get character mail messages
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMailMessagesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String messageID = null;
        String senderID = null;
        String sentDate = null;
        String title = null;
        String msgRead = null;
        String labelID = null;
        String recipientType = null;
        String recipientID = null;
        String body = null;
        List<CharacterMailMessage> response = api.getMailMessages(accessKey, accessCred, at, contid, maxresults, reverse, messageID, senderID, sentDate, title, msgRead, labelID, recipientType, recipientID, body);

        // TODO: test validations
    }
    
    /**
     * Get character mailing lists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMailingListsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String displayName = null;
        String listID = null;
        List<MailingList> response = api.getMailingLists(accessKey, accessCred, at, contid, maxresults, reverse, displayName, listID);

        // TODO: test validations
    }
    
    /**
     * Get character medal graphics
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMedalGraphicsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String medalID = null;
        String issued = null;
        String part = null;
        String layer = null;
        String graphic = null;
        String color = null;
        List<CharacterMedalGraphic> response = api.getMedalGraphics(accessKey, accessCred, at, contid, maxresults, reverse, medalID, issued, part, layer, graphic, color);

        // TODO: test validations
    }
    
    /**
     * Get character medals
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMedalsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String description = null;
        String medalID = null;
        String title = null;
        String corporationID = null;
        String issued = null;
        String issuerID = null;
        String reason = null;
        String status = null;
        List<CharacterMedal> response = api.getMedals(accessKey, accessCred, at, contid, maxresults, reverse, description, medalID, title, corporationID, issued, issuerID, reason, status);

        // TODO: test validations
    }
    
    /**
     * Get character notifications (not bodies)
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String notificationID = null;
        String type = null;
        String senderID = null;
        String senderType = null;
        String sentDate = null;
        String msgRead = null;
        String text = null;
        List<CharacterNotification> response = api.getNotifications(accessKey, accessCred, at, contid, maxresults, reverse, notificationID, type, senderID, senderType, sentDate, msgRead, text);

        // TODO: test validations
    }
    
    /**
     * Get character online data
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOnlineTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String online = null;
        String lastLogin = null;
        String lastLogout = null;
        String logins = null;
        List<CharacterOnline> response = api.getOnline(accessKey, accessCred, at, contid, maxresults, reverse, online, lastLogin, lastLogout, logins);

        // TODO: test validations
    }
    
    /**
     * Get planetary colonies
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlanetaryColoniesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String planetID = null;
        String solarSystemID = null;
        String planetType = null;
        String ownerID = null;
        String lastUpdate = null;
        String upgradeLevel = null;
        String numberOfPins = null;
        List<PlanetaryColony> response = api.getPlanetaryColonies(accessKey, accessCred, at, contid, maxresults, reverse, planetID, solarSystemID, planetType, ownerID, lastUpdate, upgradeLevel, numberOfPins);

        // TODO: test validations
    }
    
    /**
     * Get planetary links
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlanetaryLinksTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String planetID = null;
        String sourcePinID = null;
        String destinationPinID = null;
        String linkLevel = null;
        List<PlanetaryLink> response = api.getPlanetaryLinks(accessKey, accessCred, at, contid, maxresults, reverse, planetID, sourcePinID, destinationPinID, linkLevel);

        // TODO: test validations
    }
    
    /**
     * Get planetary pins
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlanetaryPinsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String planetID = null;
        String pinID = null;
        String typeID = null;
        String schematicID = null;
        String lastCycleStart = null;
        String cycleTime = null;
        String quantityPerCycle = null;
        String installTime = null;
        String expiryTime = null;
        String productTypeID = null;
        String longitude = null;
        String latitude = null;
        String headRadius = null;
        String headID = null;
        String headLongitude = null;
        String headLatitude = null;
        String contentTypeID = null;
        String contentAmount = null;
        List<PlanetaryPin> response = api.getPlanetaryPins(accessKey, accessCred, at, contid, maxresults, reverse, planetID, pinID, typeID, schematicID, lastCycleStart, cycleTime, quantityPerCycle, installTime, expiryTime, productTypeID, longitude, latitude, headRadius, headID, headLongitude, headLatitude, contentTypeID, contentAmount);

        // TODO: test validations
    }
    
    /**
     * Get planetary routes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlanetaryRoutesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String planetID = null;
        String routeID = null;
        String sourcePinID = null;
        String destinationPinID = null;
        String contentTypeID = null;
        String quantity = null;
        String waypoint = null;
        List<PlanetaryRoute> response = api.getPlanetaryRoutes(accessKey, accessCred, at, contid, maxresults, reverse, planetID, routeID, sourcePinID, destinationPinID, contentTypeID, quantity, waypoint);

        // TODO: test validations
    }
    
    /**
     * Get character research agents
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getResearchAgentsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String agentID = null;
        String pointsPerDay = null;
        String remainderPoints = null;
        String researchStartDate = null;
        String skillTypeID = null;
        List<ResearchAgent> response = api.getResearchAgents(accessKey, accessCred, at, contid, maxresults, reverse, agentID, pointsPerDay, remainderPoints, researchStartDate, skillTypeID);

        // TODO: test validations
    }
    
    /**
     * Get character roles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRolesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String roleCategory = null;
        String roleName = null;
        List<CharacterRole> response = api.getRoles(accessKey, accessCred, at, contid, maxresults, reverse, roleCategory, roleName);

        // TODO: test validations
    }
    
    /**
     * Get character ship type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShipTypeTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String shipTypeID = null;
        String shipItemID = null;
        String shipName = null;
        List<CharacterShip> response = api.getShipType(accessKey, accessCred, at, contid, maxresults, reverse, shipTypeID, shipItemID, shipName);

        // TODO: test validations
    }
    
    /**
     * Get character skill points
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSkillPointsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String totalSkillPoints = null;
        String unallocatedSkillPoints = null;
        List<CharacterSheetSkillPoints> response = api.getSkillPoints(accessKey, accessCred, at, contid, maxresults, reverse, totalSkillPoints, unallocatedSkillPoints);

        // TODO: test validations
    }
    
    /**
     * Get character skills
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSkillsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String typeID = null;
        String trainedSkillLevel = null;
        String skillpoints = null;
        String activeSkillLevel = null;
        List<CharacterSkill> response = api.getSkills(accessKey, accessCred, at, contid, maxresults, reverse, typeID, trainedSkillLevel, skillpoints, activeSkillLevel);

        // TODO: test validations
    }
    
    /**
     * Get character skill queue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSkillsInQueueTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String endSP = null;
        String endTime = null;
        String level = null;
        String queuePosition = null;
        String startSP = null;
        String startTime = null;
        String typeID = null;
        String trainingStartSP = null;
        List<SkillInQueue> response = api.getSkillsInQueue(accessKey, accessCred, at, contid, maxresults, reverse, endSP, endTime, level, queuePosition, startSP, startTime, typeID, trainingStartSP);

        // TODO: test validations
    }
    
    /**
     * Get character titles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTitlesTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String titleID = null;
        String titleName = null;
        List<CharacterTitle> response = api.getTitles(accessKey, accessCred, at, contid, maxresults, reverse, titleID, titleName);

        // TODO: test validations
    }
    
    /**
     * Get upcoming calendar events
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUpcomingCalendarEventsTest() throws ApiException {
        Integer accessKey = null;
        String accessCred = null;
        String at = null;
        Long contid = null;
        Integer maxresults = null;
        Boolean reverse = null;
        String duration = null;
        String eventDate = null;
        String eventID = null;
        String eventText = null;
        String eventTitle = null;
        String ownerID = null;
        String ownerName = null;
        String response = null;
        String importance = null;
        String ownerType = null;
        List<UpcomingCalendarEvent> responses = api.getUpcomingCalendarEvents(accessKey, accessCred, at, contid, maxresults, reverse, duration, eventDate, eventID, eventText, eventTitle, ownerID, ownerName, response, importance, ownerType);

        // TODO: test validations
    }
    
}
