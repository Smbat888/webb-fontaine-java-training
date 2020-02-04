package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) {

//        readContentIntoByteArray(new File("samplefile7.txt"));

//        String output = usingBufferedReader("samplefile7.txt");

        try {
            byte [] bytes = readBytesByPath("samplefile7.txt");
            String output2 = new String(bytes);

            System.out.println("output2 = " + output2);
        } catch (IOException e) {

        }

//        System.out.println(output);

//        System.out.println(readAllBytesJava7("samplefile7.txt"));
    }

    public static String readAllBytesJava7(String filePath) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    private static String usingBufferedReader(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private static String readLineByLineJava8(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

    private static byte[] readContentIntoByteArray(File file) {
        byte[] bFile = new byte[(int) file.length()];


        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            //convert file into array of bytes
            fileInputStream.read(bFile);
            for (int i = 0; i < bFile.length; i++) {
                System.out.print((char) bFile[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bFile;
    }

    public static byte[] readBytesByPath(String filename) throws IOException {
        return Files.readAllBytes(Paths.get(filename));
    }
}
