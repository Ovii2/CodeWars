package org.example;

import java.io.*;
import java.net.Socket;

public class Solution {
    public static boolean isRegularServer() {
        String testMessage = "abcdef";
        String response = "";

        try (Socket socket = new Socket("localhost", 1111)) {
            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter writer = new BufferedWriter(osw);

            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);

            writer.write(testMessage + "\n");
            writer.flush();

            response = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }

        return response.equals(testMessage);
    }
}
