package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.flink.streaming.api.functions.source.RichParallelSourceFunction;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ApiSourceFunction extends RichParallelSourceFunction<AccidentRecord> {

    private volatile boolean isRunning = true;
    DataAnalysis any = new DataAnalysis();
    private static final String API_URL = "https://services1.arcgis.com/qAo1OsXi67t7XgmS/arcgis/rest/services/Traffic_Collisions/FeatureServer/0/query?where=1%3D1&outFields=ACCIDENTNUM,ACCIDENTDATE,ACCIDENT_YEAR,ACCIDENT_MONTH,ACCIDENT_DAY,ACCIDENT_HOUR,ACCIDENT_MINUTE,ACCIDENT_SECOND,ACCIDENT_WEEKDAY,ACCIDENTLOCATION,COLLISIONTYPE,CLASSIFICATIONOFACCIDENT,IMPACTLOCATION,INITIALDIRECTIONOFTRAVELONE,INITIALDIRECTIONOFTRAVELTWO,INITIALIMPACTTYPE,INTTRAFFICCONTROL,LIGHT,LIGHTFORREPORT,ROADJURISDICTION,TRAFFICCONTROL,TRAFFICCONTROLCONDITION,THRULANENO,NORTHBOUNDDISOBEYCOUNT,SOUTHBOUNDDISOBEYCOUNT,PEDESTRIANINVOLVED,CYCLISTINVOLVED,MOTORCYCLISTINVOLVED,ENVIRONMENTCONDITION1,SELFREPORTED,LASTEDITEDDATE&returnGeometry=false&outSR=4326&f=json";

    @Override
    public void run(SourceContext<AccidentRecord> ctx) throws Exception {
            HttpResponse response = makeApiRequest(API_URL);
            AccidentRecord[] trafficDataArray = parseResponse(response);
            // Process and emit records
            for (AccidentRecord data : trafficDataArray) {
                ctx.collect(data);
            }
    }
        @Override public void cancel() {
        isRunning = false;
    }

    private HttpResponse makeApiRequest(String apiUrl) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(apiUrl);
        return httpClient.execute(request);
    }

    private AccidentRecord[] parseResponse(HttpResponse response) throws IOException {
        if (response == null) {
            throw new IllegalArgumentException("Response must not be null");
        }
        AccidentRecord[] accidentRecords = null;
        try {
            HttpEntity entity = response.getEntity();
            if (entity == null) {
                throw new IOException("Response entity is null");
            }

            String result = EntityUtils.toString(entity);
            JsonObject rootObject = JsonParser.parseString(result).getAsJsonObject();
            JsonArray featuresArray = rootObject.getAsJsonArray("features");
            if (featuresArray == null) {
                throw new IOException("Features array is missing in the JSON response");
            }

            accidentRecords = new AccidentRecord[featuresArray.size()];

            for (int i = 0; i < featuresArray.size(); i++) {
                JsonElement featureElement = featuresArray.get(i);
                if (featureElement == null || !featureElement.isJsonObject()) {
                    continue; // Skip if the element is null or not a JSON object
                }

                JsonObject attributesObject = featureElement.getAsJsonObject().getAsJsonObject("attributes");
                if (attributesObject == null) {
                    continue; // Skip if the attributes object is null
                }

                AccidentRecord record = new AccidentRecord();

                // Check if each attribute exists before accessing it
                if (attributesObject.has("ACCIDENT_YEAR")) {
                    record.setAccidentYear(attributesObject.get("ACCIDENT_YEAR").getAsInt());
                }
                if (attributesObject.has("ACCIDENTNUM")) {
                    record.setAccidentNum(attributesObject.get("ACCIDENTNUM").getAsString());
                }
                if (attributesObject.has("ACCIDENTDATE")) {
                    record.setAccidentDate(attributesObject.get("ACCIDENTDATE").getAsLong());
                }
                if (attributesObject.has("ACCIDENT_YEAR")) {
                    record.setAccidentYear(attributesObject.get("ACCIDENT_YEAR").getAsInt());
                }
                if (attributesObject.has("ACCIDENT_MONTH")) {
                    record.setAccidentMonth(attributesObject.get("ACCIDENT_MONTH").getAsInt());
                }
                if (attributesObject.has("ACCIDENT_DAY")) {
                    record.setAccidentDay(attributesObject.get("ACCIDENT_DAY").getAsInt());
                }
                if (attributesObject.has("ACCIDENT_HOUR")) {
                    record.setAccidentHour(attributesObject.get("ACCIDENT_HOUR").getAsInt());
                }
                if (attributesObject.has("ACCIDENT_MINUTE")) {
                    record.setAccidentMinute(attributesObject.get("ACCIDENT_MINUTE").getAsInt());
                }

                if (attributesObject.has("ACCIDENT_SECOND")) {
                    record.setAccidentSecond(attributesObject.get("ACCIDENT_SECOND").getAsInt());
                }
                if (attributesObject.has("ACCIDENT_WEEKDAY")) {
                    record.setAccidentWeekday(attributesObject.get("ACCIDENT_WEEKDAY").getAsString());
                }
                if (attributesObject.has("XCOORD")) {
                    record.setxCoord(attributesObject.get("XCOORD").getAsDouble());
                }
                if (attributesObject.has("YCOORD")) {
                    record.setyCoord(attributesObject.get("YCOORD").getAsDouble());
                }
                if (attributesObject.has("LONGITUDE")) {
                    record.setLongitude(attributesObject.get("LONGITUDE").getAsDouble());
                }
                if (attributesObject.has("LATITUDE")) {
                    record.setLatitude(attributesObject.get("LATITUDE").getAsDouble());
                }
                if (attributesObject.has("ACCIDENTLOCATION")) {
                    record.setAccidentLocation(attributesObject.get("ACCIDENTLOCATION").getAsString());
                }
                if (attributesObject.has("COLLISIONTYPE")) {
                    record.setCollisionType(attributesObject.get("COLLISIONTYPE").getAsInt());
                }
                if (attributesObject.has("CLASSIFICATIONOFACCIDENT")) {
                    record.setClassificationOfAccident(attributesObject.get("CLASSIFICATIONOFACCIDENT").getAsString());
                }
                if (attributesObject.has("IMPACTLOCATION")) {
                    record.setImpactLocation(attributesObject.get("IMPACTLOCATION").getAsString());
                }
                if (attributesObject.has("INITIALDIRECTIONOFTRAVELONE")) {
                    record.setInitialDirectionOfTravelOne(attributesObject.get("INITIALDIRECTIONOFTRAVELONE").getAsString());
                }
                if (attributesObject.has("INITIALDIRECTIONOFTRAVELTWO")) {
                    record.setInitialDirectionOfTravelTwo(attributesObject.get("INITIALDIRECTIONOFTRAVELTWO").getAsString());
                }
                if (attributesObject.has("LIGHT")) {
                    record.setLight(attributesObject.get("LIGHT").getAsString());
                }
                if (attributesObject.has("LIGHTFORREPORT")) {
                    record.setLightForReport(attributesObject.get("LIGHTFORREPORT").getAsString());
                }
                if (attributesObject.has("ROADJURISDICTION")) {
                    record.setRoadJurisdiction(attributesObject.get("ROADJURISDICTION").getAsString());
                }
                if (attributesObject.has("TRAFFICCONTROL")) {
                    record.setTrafficControl(attributesObject.get("TRAFFICCONTROL").getAsString());
                }
                if (attributesObject.has("TRAFFICCONTROLCONDITION")) {
                    record.setTrafficControlCondition(attributesObject.get("TRAFFICCONTROLCONDITION").getAsString());
                }
                if (attributesObject.has("THRULANENO")) {
                    record.setThruLaneNo(attributesObject.get("THRULANENO").getAsInt());
                }
                if (attributesObject.has("NORTHBOUNDDISOBEYCOUNT")) {
                    record.setNorthboundDisobeyCount(attributesObject.get("NORTHBOUNDDISOBEYCOUNT").getAsInt());
                }
                if (attributesObject.has("SOUTHBOUNDDISOBEYCOUNT")) {
                    record.setSouthboundDisobeyCount(attributesObject.get("SOUTHBOUNDDISOBEYCOUNT").getAsInt());
                }
                if (attributesObject.has("PEDESTRIANINVOLVED")) {
                    record.setPedestrianInvolved(attributesObject.get("PEDESTRIANINVOLVED").getAsBoolean());
                }
                if (attributesObject.has("CYCLISTINVOLVED")) {
                    record.setCyclistInvolved(attributesObject.get("CYCLISTINVOLVED").getAsBoolean());
                }
                if (attributesObject.has("MOTORCYCLISTINVOLVED")) {
                    record.setMotorcyclistInvolved(attributesObject.get("MOTORCYCLISTINVOLVED").getAsBoolean());
                }
                if (attributesObject.has("ENVIRONMENTCONDITION1")) {
                    record.setEnvironmentCondition1(attributesObject.get("ENVIRONMENTCONDITION1").getAsString());
                }
                if (attributesObject.has("ENVIRONMENTCONDITION2")) {
                    record.setEnvironmentCondition2(attributesObject.get("ENVIRONMENTCONDITION2").getAsString());
                }
                if (attributesObject.has("SELFREPORTED")) {
                    record.setSelfReported(attributesObject.get("SELFREPORTED").getAsBoolean());
                }
                if (attributesObject.has("XMLIMPORTNOTES")) {
                    record.setXmlImportNotes(attributesObject.get("XMLIMPORTNOTES").getAsString());
                }
                if (attributesObject.has("LASTEDITEDDATE")) {
                    record.setLastEditedDate(attributesObject.get("LASTEDITEDDATE").getAsString());
                }
                if (attributesObject.has("GlobalID")) {
                    record.setGlobalId(attributesObject.get("GlobalID").getAsString());
                }
                accidentRecords[i] = record;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return accidentRecords;
    }





}



