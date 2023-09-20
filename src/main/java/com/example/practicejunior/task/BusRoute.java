package com.example.practicejunior.task;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BusRoute {

    private List<String> busStopList = new ArrayList<>();
    private List<Integer> timeIntervalList = new ArrayList<>();

    public void addBusStop(String newBusStop, Integer timeIntervalBetweenLastAndNewStop) {
        busStopList.add(newBusStop);
        timeIntervalList.add(timeIntervalBetweenLastAndNewStop);

    }

    public String getRout(String from, String to) {
        StringBuilder stringBuilder = new StringBuilder();
        int travelTime = 0;
        for (int i = busStopList.indexOf(from); i <= busStopList.indexOf(to); i++) {
            stringBuilder.append(busStopList.get(i)).append("-");
            travelTime += timeIntervalList.get(i);
        }
        return stringBuilder.append("\nTime travel: ").append(travelTime).toString();
    }
}
