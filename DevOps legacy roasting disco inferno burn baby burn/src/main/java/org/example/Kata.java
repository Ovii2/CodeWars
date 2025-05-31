package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class Kata {
    public static String roastLegacy(String workloads) {
        List<String> complaints = List.of("slow!", "expensive!", "manual!", "down!", "hostage!", "security!");
        Map<String, Integer> keywordsWithScores = new HashMap<>();
        keywordsWithScores.put("COBOL", 1000);
        keywordsWithScores.put("nonobject", 500);
        keywordsWithScores.put("monolithic", 500);
        keywordsWithScores.put("fax", 100);
        keywordsWithScores.put("modem", 100);
        keywordsWithScores.put("thickclient", 50);
        keywordsWithScores.put("tape", 50);
        keywordsWithScores.put("floppy", 50);
        keywordsWithScores.put("oldschoolIT", 50);

        if (workloads.isEmpty()) {
            return "These guys are already DevOps and in the Cloud and the business is happy!";
        }

        int complaintCounter = countComplaints(complaints, workloads);
        int pointCounter = countPoints(keywordsWithScores, workloads);

        if (complaintCounter == 0 && pointCounter == 0) {
            return "These guys are already DevOps and in the Cloud and the business is happy!";
        }

        return printResult(pointCounter, complaintCounter);
    }

    public static int countComplaints(List<String> complaints, String word) {
        String workloadLower = word.toLowerCase();

        return complaints.stream()
                .mapToInt(complaint -> countOccurrences(workloadLower, complaint))
                .sum();
    }

    public static int countPoints(Map<String, Integer> wordsList, String word) {
        String workloadLower = word.toLowerCase();

        return wordsList.entrySet().stream()
                .mapToInt(entry -> countOccurrences(workloadLower, entry.getKey()) * entry.getValue())
                .sum();
    }

    private static int countOccurrences(String text, String keyword) {
        String lowerText = text.toLowerCase();
        String lowerKeyword = keyword.toLowerCase();

        return (int) IntStream.iterate(0, i -> lowerText.indexOf(lowerKeyword, i) != -1,
                        i -> lowerText.indexOf(lowerKeyword, i) + lowerKeyword.length())
                .count();
    }

    public static String printResult(int pointsCount, int complaintCount) {
        return String.format("Burn baby burn disco inferno %d points earned in this roasting and %d complaints resolved!",
                pointsCount, complaintCount);
    }
}