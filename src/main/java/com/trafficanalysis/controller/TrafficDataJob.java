package com.trafficanalysis.controller;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.connector.jdbc.JdbcConnectionOptions;
import org.apache.flink.connector.jdbc.JdbcSink;
import org.apache.flink.connector.jdbc.JdbcStatementBuilder;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.example.AccidentRecord;
import org.example.ApiSourceFunction;


public class TrafficDataJob {

    public static void main(String[] args) throws Exception {
        // Set up the execution environment
        Configuration configuration = new Configuration();
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment(configuration);
        env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(configuration);
        // Add a source function to your data stream
        DataStream<AccidentRecord> trafficDataStream = env.addSource(new ApiSourceFunction()).setParallelism(1);

        // Define JDBC sink
        SinkFunction<AccidentRecord> jdbcSink = JdbcSink.sink(
                "INSERT INTO accidentsRecordsTable (AccidentNum, AccidentYear, AccidentMonth, AccidentDay, AccidentHour, AccidentWeekday, AccidentLocation, CollisionType, ClassificationOfAccident, ImpactLocation, InitialImpactType, IntTrafficControl, Light, LightForReport, RoadJurisdiction, TrafficControl, TrafficControlCondition, ThruLaneNo, NorthboundDisobeyCount, SouthboundDisobeyCount, PedestrianInvolved, CyclistInvolved, MotorcyclistInvolved, EnvironmentCondition1, EnvironmentCondition2) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) " +
                        "ON DUPLICATE KEY UPDATE AccidentYear = VALUES(AccidentYear), AccidentMonth = VALUES(AccidentMonth), AccidentDay = VALUES(AccidentDay), AccidentHour = VALUES(AccidentHour), AccidentWeekday = VALUES(AccidentWeekday), AccidentLocation = VALUES(AccidentLocation), CollisionType = VALUES(CollisionType), ClassificationOfAccident = VALUES(ClassificationOfAccident), ImpactLocation = VALUES(ImpactLocation), InitialImpactType = VALUES(InitialImpactType), IntTrafficControl = VALUES(IntTrafficControl), Light = VALUES(Light), LightForReport = VALUES(LightForReport), RoadJurisdiction = VALUES(RoadJurisdiction), TrafficControl = VALUES(TrafficControl), TrafficControlCondition = VALUES(TrafficControlCondition), ThruLaneNo = VALUES(ThruLaneNo), NorthboundDisobeyCount = VALUES(NorthboundDisobeyCount), SouthboundDisobeyCount = VALUES(SouthboundDisobeyCount), PedestrianInvolved = VALUES(PedestrianInvolved), CyclistInvolved = VALUES(CyclistInvolved), MotorcyclistInvolved = VALUES(MotorcyclistInvolved), EnvironmentCondition1 = VALUES(EnvironmentCondition1), EnvironmentCondition2 = VALUES(EnvironmentCondition2)",
                (JdbcStatementBuilder<AccidentRecord>) (statement, accidentRecord) -> {
                    statement.setString(1, accidentRecord.getAccidentNum());
                    statement.setInt(2, accidentRecord.getAccidentYear());
                    statement.setInt(3, accidentRecord.getAccidentMonth());
                    statement.setInt(4, accidentRecord.getAccidentDay());
                    statement.setInt(5, accidentRecord.getAccidentHour());
                    statement.setString(6, accidentRecord.getAccidentWeekday());
                    statement.setString(7, accidentRecord.getAccidentLocation());
                    statement.setInt(8, accidentRecord.getCollisionType());
                    statement.setString(9, accidentRecord.getClassificationOfAccident());
                    statement.setString(10, accidentRecord.getImpactLocation());
                    statement.setString(11, accidentRecord.getInitialImpactType());
                    statement.setString(12, accidentRecord.getIntTrafficControl());
                    statement.setString(13, accidentRecord.getLight());
                    statement.setString(14, accidentRecord.getLightForReport());
                    statement.setString(15, accidentRecord.getRoadJurisdiction());
                    statement.setString(16, accidentRecord.getTrafficControl());
                    statement.setString(17, accidentRecord.getTrafficControlCondition());
                    statement.setInt(18, accidentRecord.getThruLaneNo());
                    statement.setInt(19, accidentRecord.getNorthboundDisobeyCount());
                    statement.setInt(20, accidentRecord.getSouthboundDisobeyCount());
                    statement.setBoolean(21, accidentRecord.isPedestrianInvolved());
                    statement.setBoolean(22, accidentRecord.isCyclistInvolved());
                    statement.setBoolean(23, accidentRecord.isMotorcyclistInvolved());
                    statement.setString(24, accidentRecord.getEnvironmentCondition1());
                    statement.setString(25, accidentRecord.getEnvironmentCondition2());
                    }
                ,
                new JdbcConnectionOptions.JdbcConnectionOptionsBuilder()
                        .withUrl("jdbc:mysql://127.0.0.1:3306/AccidentRecords")
                        .withDriverName("com.mysql.cj.jdbc.Driver")
                        .withUsername("root")
                        .withPassword("Lolipop:P123")
                        .build()
        );

        // Add the JDBC sink to the data stream
        trafficDataStream.addSink(jdbcSink).setParallelism(1);

        // Execute the job
        env.execute("Traffic Collision Data Job");
    }
}




