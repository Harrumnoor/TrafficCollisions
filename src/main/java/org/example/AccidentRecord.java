package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccidentRecord {
    @JsonProperty("OBJECTID")
    private long objectId;

    @JsonProperty("ACCIDENTNUM")
    private String accidentNum;

    @JsonProperty("ACCIDENTDATE")
    private long accidentDate;

    @JsonProperty("ACCIDENT_YEAR")
    private int accidentYear;

    @JsonProperty("ACCIDENT_MONTH")
    private int accidentMonth;

    @JsonProperty("ACCIDENT_DAY")
    private int accidentDay;

    @JsonProperty("ACCIDENT_HOUR")
    private int accidentHour;

    @JsonProperty("ACCIDENT_MINUTE")
    private int accidentMinute;

    @JsonProperty("ACCIDENT_SECOND")
    private int accidentSecond;

    @JsonProperty("ACCIDENT_WEEKDAY")
    private String accidentWeekday;

    @JsonProperty("XCOORD")
    private double xCoord;

    @JsonProperty("YCOORD")
    private double yCoord;

    @JsonProperty("LONGITUDE")
    private double longitude;

    @JsonProperty("LATITUDE")
    private double latitude;

    @JsonProperty("ACCIDENTLOCATION")
    private String accidentLocation;

    @JsonProperty("COLLISIONTYPE")
    private int collisionType;

    @JsonProperty("CLASSIFICATIONOFACCIDENT")
    private String classificationOfAccident;

    @JsonProperty("IMPACTLOCATION")
    private String impactLocation;

    @JsonProperty("INITIALDIRECTIONOFTRAVELONE")
    private String initialDirectionOfTravelOne;

    @JsonProperty("INITIALDIRECTIONOFTRAVELTWO")
    private String initialDirectionOfTravelTwo;

    @JsonProperty("INITIALIMPACTTYPE")
    private String initialImpactType;

    @JsonProperty("INTTRAFFICCONTROL")
    private String intTrafficControl;

    @JsonProperty("LIGHT")
    private String light;

    @JsonProperty("LIGHTFORREPORT")
    private String lightForReport;

    @JsonProperty("ROADJURISDICTION")
    private String roadJurisdiction;

    @JsonProperty("TRAFFICCONTROL")
    private String trafficControl;

    @JsonProperty("TRAFFICCONTROLCONDITION")
    private String trafficControlCondition;

    @JsonProperty("THRULANENO")
    private int thruLaneNo;

    @JsonProperty("NORTHBOUNDDISOBEYCOUNT")
    private int northboundDisobeyCount;

    @JsonProperty("SOUTHBOUNDDISOBEYCOUNT")
    private int southboundDisobeyCount;

    @JsonProperty("PEDESTRIANINVOLVED")
    private boolean pedestrianInvolved;

    @JsonProperty("CYCLISTINVOLVED")
    private boolean cyclistInvolved;

    @JsonProperty("MOTORCYCLISTINVOLVED")
    private boolean motorcyclistInvolved;

    @JsonProperty("ENVIRONMENTCONDITION1")
    private String environmentCondition1;

    @JsonProperty("ENVIRONMENTCONDITION2")
    private String environmentCondition2;

    @JsonProperty("SELFREPORTED")
    private boolean selfReported;

    @JsonProperty("XMLIMPORTNOTES")
    private String xmlImportNotes;

    @JsonProperty("LASTEDITEDDATE")
    private String lastEditedDate;

    @JsonProperty("GlobalID")
    private String globalId;

    // Getters and setters

    public long getObjectId() {
        return objectId;
    }

    public void setObjectId(long objectId) {
        this.objectId = objectId;
    }

    public String getAccidentNum() {
        if((accidentNum!=null))
        return accidentNum;
        return "";
    }

    public void setAccidentNum(String accidentNum) {
        this.accidentNum = accidentNum;
    }

    public long getAccidentDate() {

        return accidentDate;
    }

    public void setAccidentDate(long accidentDate) {
        this.accidentDate = accidentDate;
    }

    public int getAccidentYear() {
        return accidentYear;
    }

    public void setAccidentYear(int accidentYear) {
        this.accidentYear = accidentYear;
    }

    public int getAccidentMonth() {
        return accidentMonth;
    }

    public void setAccidentMonth(int accidentMonth) {
        this.accidentMonth = accidentMonth;
    }

    public int getAccidentDay() {
        return accidentDay;
    }

    public void setAccidentDay(int accidentDay) {
        this.accidentDay = accidentDay;
    }

    public int getAccidentHour() {
        return accidentHour;
    }

    public void setAccidentHour(int accidentHour) {
        this.accidentHour = accidentHour;
    }

    public int getAccidentMinute() {
        return accidentMinute;
    }

    public void setAccidentMinute(int accidentMinute) {
        this.accidentMinute = accidentMinute;
    }

    public int getAccidentSecond() {
        return accidentSecond;
    }

    public void setAccidentSecond(int accidentSecond) {
        this.accidentSecond = accidentSecond;
    }

    public String getAccidentWeekday() {
        return accidentWeekday;
    }

    public void setAccidentWeekday(String accidentWeekday) {
        this.accidentWeekday = accidentWeekday;
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getAccidentLocation() {
        return accidentLocation;
    }

    public void setAccidentLocation(String accidentLocation) {
        this.accidentLocation = accidentLocation;
    }

    public int getCollisionType() {
        return collisionType;
    }

    public void setCollisionType(int collisionType) {
        this.collisionType = collisionType;
    }

    public String getClassificationOfAccident() {
        return classificationOfAccident;
    }

    public void setClassificationOfAccident(String classificationOfAccident) {
        this.classificationOfAccident = classificationOfAccident;
    }

    public String getImpactLocation() {
        return impactLocation;
    }

    public void setImpactLocation(String impactLocation) {
        this.impactLocation = impactLocation;
    }

    public String getInitialDirectionOfTravelOne() {
        return initialDirectionOfTravelOne;
    }

    public void setInitialDirectionOfTravelOne(String initialDirectionOfTravelOne) {
        this.initialDirectionOfTravelOne = initialDirectionOfTravelOne;
    }

    public String getInitialDirectionOfTravelTwo() {
        return initialDirectionOfTravelTwo;
    }

    public void setInitialDirectionOfTravelTwo(String initialDirectionOfTravelTwo) {
        this.initialDirectionOfTravelTwo = initialDirectionOfTravelTwo;
    }

    public String getInitialImpactType() {
        return initialImpactType;
    }

    public void setInitialImpactType(String initialImpactType) {
        this.initialImpactType = initialImpactType;
    }

    public String getIntTrafficControl() {
        return intTrafficControl;
    }

    public void setIntTrafficControl(String intTrafficControl) {
        this.intTrafficControl = intTrafficControl;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getLightForReport() {
        return lightForReport;
    }

    public void setLightForReport(String lightForReport) {
        this.lightForReport = lightForReport;
    }

    public String getRoadJurisdiction() {
        return roadJurisdiction;
    }

    public void setRoadJurisdiction(String roadJurisdiction) {
        this.roadJurisdiction = roadJurisdiction;
    }

    public String getTrafficControl() {
        return trafficControl;
    }

    public void setTrafficControl(String trafficControl) {
        this.trafficControl = trafficControl;
    }

    public String getTrafficControlCondition() {
        return trafficControlCondition;
    }

    public void setTrafficControlCondition(String trafficControlCondition) {
        this.trafficControlCondition = trafficControlCondition;
    }

    public int getThruLaneNo() {
        return thruLaneNo;
    }

    public void setThruLaneNo(int thruLaneNo) {
        this.thruLaneNo = thruLaneNo;
    }

    public int getNorthboundDisobeyCount() {
        return northboundDisobeyCount;
    }

    public void setNorthboundDisobeyCount(int northboundDisobeyCount) {
        this.northboundDisobeyCount = northboundDisobeyCount;
    }

    public int getSouthboundDisobeyCount() {
        return southboundDisobeyCount;
    }

    public void setSouthboundDisobeyCount(int southboundDisobeyCount) {
        this.southboundDisobeyCount = southboundDisobeyCount;
    }

    public boolean isPedestrianInvolved() {
        return pedestrianInvolved;
    }

    public void setPedestrianInvolved(boolean pedestrianInvolved) {
        this.pedestrianInvolved = pedestrianInvolved;
    }

    public boolean isCyclistInvolved() {
        return cyclistInvolved;
    }

    public void setCyclistInvolved(boolean cyclistInvolved) {
        this.cyclistInvolved = cyclistInvolved;
    }

    public boolean isMotorcyclistInvolved() {
        return motorcyclistInvolved;
    }

    public void setMotorcyclistInvolved(boolean motorcyclistInvolved) {
        this.motorcyclistInvolved = motorcyclistInvolved;
    }

    public String getEnvironmentCondition1() {
        return environmentCondition1;
    }

    public void setEnvironmentCondition1(String environmentCondition1) {
        this.environmentCondition1 = environmentCondition1;
    }

    public String getEnvironmentCondition2() {
        return environmentCondition2;
    }

    public void setEnvironmentCondition2(String environmentCondition2) {
        this.environmentCondition2 = environmentCondition2;
    }

    public boolean isSelfReported() {
        return selfReported;
    }

    public void setSelfReported(boolean selfReported) {
        this.selfReported = selfReported;
    }

    public String getXmlImportNotes() {
        return xmlImportNotes;
    }

    public void setXmlImportNotes(String xmlImportNotes) {
        this.xmlImportNotes = xmlImportNotes;
    }

    public String getLastEditedDate() {
        return lastEditedDate;
    }

    public void setLastEditedDate(String lastEditedDate) {
        this.lastEditedDate = lastEditedDate;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    @Override
    public String toString() {
        return "AccidentRecord{" +
                "ObjectID = " +objectId +
                "accidentYear=" + accidentYear +
                ", accidentMonth=" + accidentMonth +
                ", accidentDay=" + accidentDay +
                ", accidentHour=" + accidentHour +
                ", accidentWeekday='" + accidentWeekday + '\'' +
                ", accidentLocation='" + accidentLocation + '\'' +
                ", collisionType=" + collisionType +
                ", classificationOfAccident='" + classificationOfAccident + '\'' +
                ", impactLocation='" + impactLocation + '\'' +
                ", initialImpactType='" + initialImpactType + '\'' +
                ", intTrafficControl='" + intTrafficControl + '\'' +
                ", light='" + light + '\'' +
                ", lightForReport='" + lightForReport + '\'' +
                ", roadJurisdiction='" + roadJurisdiction + '\'' +
                ", trafficControl='" + trafficControl + '\'' +
                ", trafficControlCondition='" + trafficControlCondition + '\'' +
                ", thruLaneNo=" + thruLaneNo +
                ", northboundDisobeyCount=" + northboundDisobeyCount +
                ", southboundDisobeyCount=" + southboundDisobeyCount +
                ", pedestrianInvolved=" + pedestrianInvolved +
                ", cyclistInvolved=" + cyclistInvolved +
                ", motorcyclistInvolved=" + motorcyclistInvolved +
                ", environmentCondition1='" + environmentCondition1 + '\'' +
                ", environmentCondition2='" + environmentCondition2 + '\'' +
                ", selfReported=" + selfReported +
                '}';
    }
}
