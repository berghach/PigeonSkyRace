package com.example.PigeonsVoyageurs.calculator;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.OptionalDouble;

public class Calculator {
    private static final double EARTH_RADIUS = 6378.1370;

    public static double calculateDistance(double startLat, double startLong, double endLat, double endLong) {
        double dLat = Math.toRadians(startLat - endLat);
        double dLong = Math.toRadians(startLong - endLong);

        double startLatRad = Math.toRadians(startLat);
        double endLatRad = Math.toRadians(endLat);

        double a = haversine(dLat) + Math.cos(startLatRad) * Math.cos(endLatRad) * haversine(dLong);

        return 2 * EARTH_RADIUS * Math.asin(Math.sqrt(a));

    }
    private static double haversine(double val) {
        return Math.pow(Math.sin(val / 2), 2);
    }

    public static LocalTime calculateFlightDuration(Date date1, Date date2) {
        Duration duration = Duration.between(date1.toInstant(), date2.toInstant());
        Duration absDuration = duration.abs();
        return LocalTime.ofSecondOfDay(absDuration.getSeconds());
    }

    public static double distanceAvg(List<Double> distances){
            OptionalDouble optionalAvg = distances.stream().mapToDouble(Double::doubleValue).average();
            return optionalAvg.orElseThrow(NullPointerException::new);
    }
    public static double distanceCoefficient(double traveledDistance, double distanceAvg){
        if (traveledDistance == 0){
            throw new IllegalArgumentException("The traveled distance can not be null");
        }else {
            return distanceAvg / traveledDistance;
        }
    }
    public static double flightSpeed(double traveledDistance, double flightDuration, double distanceCoefficient){
        if (flightDuration == 0){
            throw new IllegalArgumentException("The flight duration can not be null");
        }else {
            return (traveledDistance / flightDuration) * distanceCoefficient;
        }
    }
}
