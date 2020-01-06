package ioexecises;

import java.io.*;

public class CountTheNumberOfLines {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/Gohar Farmanyan/Desktop/doc.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;

        while ((line = reader.readLine()) != null) {
            if (line.equals("")) {
                characterCount += line.length();

                String[] wordList = line.split("\\s+");

                countWord += wordList.length;

                String[] sentenceList = line.split("[!?.:]+");

                sentenceCount += sentenceList.length;
            }
        }

        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
    }
}

