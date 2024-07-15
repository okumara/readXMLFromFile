package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            // Specify the path to the XML file
            String filePath = "./src/main/resources/REQ_01.xml";

            // Read the file into a string
            String content = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

            // Print the content
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
