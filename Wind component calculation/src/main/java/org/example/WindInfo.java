package org.example;

public class WindInfo {
    public static String message(String rwy, int windDirection, int windSpeed) {
        int runWayHeading = Integer.parseInt(rwy.substring(0, 2)) * 10;
        int angleInDegrees = getAngleInDegrees(windDirection, runWayHeading);
        double angleInRadians = Math.toRadians(angleInDegrees);

        double crossWind = Math.round(Math.sin(angleInRadians) * windSpeed);
        double headWind = Math.round(Math.cos(angleInRadians) * windSpeed);
        String crossWindDirection = crossWind < 0 ? "left" : "right";
        String headOrTail = headWind < 0 ? "Tail" : "Head";
        return "%swind %.0f knots. Crosswind %.0f knots from your %s.".formatted(headOrTail, Math.abs(headWind), Math.abs(crossWind), crossWindDirection);
    }

    private static int getAngleInDegrees(int windDirection, int runWayHeading) {
        int angleInDegrees = windDirection - runWayHeading;
        if (angleInDegrees > 180) {
            angleInDegrees -= 360;
        } else if (angleInDegrees < -180) {
            angleInDegrees += 360;
        }
        return angleInDegrees;
    }
}
