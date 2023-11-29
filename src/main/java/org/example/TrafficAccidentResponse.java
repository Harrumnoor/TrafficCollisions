package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Date;

public class TrafficAccidentResponse {
    private TrafficAccidentFeature[] features;

    // Getters and setters
    public TrafficAccidentFeature[] getFeatures() {
        return features;
    }

    public void setFeatures(TrafficAccidentFeature[] features) {
        this.features = features;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class TrafficAccidentFeature {
        private TrafficAccidentAttributes attributes;
        private TrafficAccidentGeometry geometry;

        // Getters and setters
        public TrafficAccidentAttributes getAttributes() {
            return attributes;
        }

        public void setAttributes(TrafficAccidentAttributes attributes) {
            this.attributes = attributes;
        }

        public TrafficAccidentGeometry getGeometry() {
            return geometry;
        }

        public void setGeometry(TrafficAccidentGeometry geometry) {
            this.geometry = geometry;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class TrafficAccidentAttributes {
        private int objectId;
        private String accidentNum;
        private Date accidentDate;
        private int accidentYear;
        private int accidentMonth;
        private int accidentDay;
        private int accidentHour;
        private int accidentMinute;
        private int accidentSecond;
        private String accidentWeekday;
        private double xCoord;
        private double yCoord;
        private double longitude;
        private double latitude;
        private String accidentLocation;
        private int collisionType;
        private String classificationOfAccident;
        private String impactLocation;
        private String initialDirectionOfTravelOne;
        private String initialDirectionOfTravelTwo;
        private String initialImpactType;
        private String intTrafficControl;
        private String light;
        private String lightForReport;
        private String roadJurisdiction;
        private String trafficControl;
        private String trafficControlCondition;
        private int thruLaneNo;
        private int northboundDisobeyCount;
        private int southboundDisobeyCount;
        private String pedestrianInvolved;
        private String cyclistInvolved;
        private String motorcyclistInvolved;
        private String environmentCondition1;
        private String environmentCondition2;
        private String selfReported;
        private String xmlImportNotes;
        private String lastEditedDate;
        private String globalId;
        // Example getters and setters for OBJECTID and ACCIDENTNUM
        public int getObjectId() { return objectId; }
        public void setObjectId(int objectId) { this.objectId = objectId; }

        // accidentNum
        public String getAccidentNum() { return accidentNum; }
        public void setAccidentNum(String accidentNum) { this.accidentNum = accidentNum; }

        // accidentDate
        public Date getAccidentDate() { return accidentDate; }
        public void setAccidentDate(Date accidentDate) { this.accidentDate = accidentDate; }

        // accidentYear
        public int getAccidentYear() { return accidentYear; }
        public void setAccidentYear(int accidentYear) { this.accidentYear = accidentYear; }

        // accidentMonth
        public int getAccidentMonth() { return accidentMonth; }
        public void setAccidentMonth(int accidentMonth) { this.accidentMonth = accidentMonth; }

        // accidentDay
        public int getAccidentDay() { return accidentDay; }
        public void setAccidentDay(int accidentDay) { this.accidentDay = accidentDay; }

        // accidentHour
        public int getAccidentHour() { return accidentHour; }
        public void setAccidentHour(int accidentHour) { this.accidentHour = accidentHour; }

        // accidentMinute
        public int getAccidentMinute() { return accidentMinute; }
        public void setAccidentMinute(int accidentMinute) { this.accidentMinute = accidentMinute; }

        // accidentSecond
        public int getAccidentSecond() { return accidentSecond; }
        public void setAccidentSecond(int accidentSecond) { this.accidentSecond = accidentSecond; }

        // accidentWeekday
        public String getAccidentWeekday() { return accidentWeekday; }
        public void setAccidentWeekday(String accidentWeekday) { this.accidentWeekday = accidentWeekday; }

        // xCoord
        public double getXCoord() { return xCoord; }
        public void setXCoord(double xCoord) { this.xCoord = xCoord; }

        // yCoord
        public double getYCoord() { return yCoord; }
        public void setYCoord(double yCoord) { this.yCoord = yCoord; }

        // longitude
        public double getLongitude() { return longitude; }
        public void setLongitude(double longitude) { this.longitude = longitude; }

        // latitude
        public double getLatitude() { return latitude; }
        public void setLatitude(double latitude) { this.latitude = latitude; }

        // accidentLocation
        public String getAccidentLocation() { return accidentLocation; }
        public void setAccidentLocation(String accidentLocation) { this.accidentLocation = accidentLocation; }

        // collisionType
        public int getCollisionType() { return collisionType; }
        public void setCollisionType(int collisionType) { this.collisionType = collisionType; }

        // classificationOfAccident
        public String getClassificationOfAccident() { return classificationOfAccident; }
        public void setClassificationOfAccident(String classificationOfAccident) { this.classificationOfAccident = classificationOfAccident; }

        // impactLocation
        public String getImpactLocation() { return impactLocation; }
        public void setImpactLocation(String impactLocation) { this.impactLocation = impactLocation; }

        // initialDirectionOfTravelOne
        public String getInitialDirectionOfTravelOne() { return initialDirectionOfTravelOne; }
        public void setInitialDirectionOfTravelOne(String initialDirectionOfTravelOne) { this.initialDirectionOfTravelOne = initialDirectionOfTravelOne; }

        // initialDirectionOfTravelTwo
        public String getInitialDirectionOfTravelTwo() { return initialDirectionOfTravelTwo; }
        public void setInitialDirectionOfTravelTwo(String initialDirectionOfTravelTwo) { this.initialDirectionOfTravelTwo = initialDirectionOfTravelTwo; }

        // initialImpactType
        public String getInitialImpactType() { return initialImpactType; }
        public void setInitialImpactType(String initialImpactType) { this.initialImpactType = initialImpactType; }

        // intTrafficControl
        public String getIntTrafficControl() { return intTrafficControl; }
        public void setIntTrafficControl(String intTrafficControl) { this.intTrafficControl = intTrafficControl; }

        // light
        public String getLight() { return light; }
        public void setLight(String light) { this.light = light; }

        // lightForReport
        public String getLightForReport() { return lightForReport; }
        public void setLightForReport(String lightForReport) { this.lightForReport = lightForReport; }

        // roadJurisdiction
        public String getRoadJurisdiction() { return roadJurisdiction; }
        public void setRoadJurisdiction(String roadJurisdiction) { this.roadJurisdiction = roadJurisdiction; }

        // trafficControl
        public String getTrafficControl() { return trafficControl; }
        public void setTrafficControl(String trafficControl) { this.trafficControl = trafficControl; }

        // trafficControlCondition
        public String getTrafficControlCondition() { return trafficControlCondition; }
        public void setTrafficControlCondition(String trafficControlCondition) { this.trafficControlCondition = trafficControlCondition; }

        // thruLaneNo
        public int getThruLaneNo() { return thruLaneNo; }
        public void setThruLaneNo(int thruLaneNo) { this.thruLaneNo = thruLaneNo; }

        // northboundDisobeyCount
        public int getNorthboundDisobeyCount() { return northboundDisobeyCount; }
        public void setNorthboundDisobeyCount(int northboundDisobeyCount) { this.northboundDisobeyCount = northboundDisobeyCount; }

        // southboundDisobeyCount
        public int getSouthboundDisobeyCount() { return southboundDisobeyCount; }
        public void setSouthboundDisobeyCount(int southboundDisobeyCount) { this.southboundDisobeyCount = southboundDisobeyCount; }

        // pedestrianInvolved
        public String getPedestrianInvolved() { return pedestrianInvolved; }
        public void setPedestrianInvolved(String pedestrianInvolved) { this.pedestrianInvolved = pedestrianInvolved; }

        // cyclistInvolved
        public String getCyclistInvolved() { return cyclistInvolved; }
        public void setCyclistInvolved(String cyclistInvolved) { this.cyclistInvolved = cyclistInvolved; }

        // motorcyclistInvolved
        public String getMotorcyclistInvolved() { return motorcyclistInvolved; }
        public void setMotorcyclistInvolved(String motorcyclistInvolved) { this.motorcyclistInvolved = motorcyclistInvolved; }

        // environmentCondition1
        public String getEnvironmentCondition1() { return environmentCondition1; }
        public void setEnvironmentCondition1(String environmentCondition1) { this.environmentCondition1 = environmentCondition1; }

        // environmentCondition2
        public String getEnvironmentCondition2() { return environmentCondition2; }
        public void setEnvironmentCondition2(String environmentCondition2) { this.environmentCondition2 = environmentCondition2; }

        // selfReported
        public String getSelfReported() { return selfReported; }
        public void setSelfReported(String selfReported) { this.selfReported = selfReported; }

        // xmlImportNotes
        public String getXmlImportNotes() { return xmlImportNotes; }
        public void setXmlImportNotes(String xmlImportNotes) { this.xmlImportNotes = xmlImportNotes; }

        // lastEditedDate
        public String getLastEditedDate() { return lastEditedDate; }
        public void setLastEditedDate(String lastEditedDate) { this.lastEditedDate = lastEditedDate; }

        // globalId
        public String getGlobalId() { return globalId; }
        public void setGlobalId(String globalId) { this.globalId = globalId; }

        // Add the rest of the getters and setters for all attributes
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    static class TrafficAccidentGeometry {
        private double x;
        private double y;

        // Getters and setters
        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }

}
