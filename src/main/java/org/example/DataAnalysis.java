package org.example;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

public class DataAnalysis implements Serializable {

    public void analyzeData(List<AccidentRecord> records) {
        if (records == null || records.isEmpty()) {
            System.out.println("No data to analyze.");
            return;
        }

        // Example analytics
        analyzeAccidentFrequencyByDay(records);
        analyzeCollisionTypes(records);
        // Add more analysis methods as needed
    }

    private void analyzeAccidentFrequencyByDay(List<AccidentRecord> records) {
        System.out.println("Analyzing Accident Frequency by Day...");

        Map<Integer, Long> accidentsByDay = records.stream()
                .collect(Collectors.groupingBy(AccidentRecord::getAccidentDay, Collectors.counting()));

        accidentsByDay.forEach((day, count) ->
                System.out.println("Day " + day + " has " + count + " accidents."));
    }

    private void analyzeCollisionTypes(List<AccidentRecord> records) {
        System.out.println("Analyzing Collision Types...");

        Map<Integer, Long> collisionTypeCount = records.stream()
                .collect(Collectors.groupingBy(AccidentRecord::getCollisionType, Collectors.counting()));

        collisionTypeCount.forEach((type, count) ->
                System.out.println("Collision Type " + type + " occurred " + count + " times."));
    }

}
