package tooyn.src.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteIntoFile {

    public static void main(String[] args) {
        try {
            usingPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void usingBufferedWritter() throws IOException {
        String fileContent = "just text to write.";

        BufferedWriter writer = new BufferedWriter(new FileWriter("samplefile1.txt"));
        writer.write(fileContent);
        writer.close();
    }

    public static void usingFileWriter() throws IOException {
        String fileContent = "just text to write.";

        FileWriter fileWriter = new FileWriter("samplefile2.txt");
        fileWriter.write(fileContent);
        fileWriter.close();
    }

    public static void usingPrintWriter() throws IOException {
        String fileContent = "just text to write.";

        FileWriter fileWriter = new FileWriter("samplefile3.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(fileContent);
        printWriter.printf(" Blog name is %s", "howtodoinjava.com");
        printWriter.close();
    }

    public static void usingFileOutputStream() throws IOException {
        String fileContent = "just text to write.";

        FileOutputStream outputStream = new FileOutputStream("samplefile4.txt");
        byte[] strToBytes = fileContent.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();
    }

    public static void usingDataOutputStream() throws IOException {
        String fileContent = "just text to write.";

        FileOutputStream outputStream = new FileOutputStream("samplefile5.txt");
        DataOutputStream dataOutStream = new DataOutputStream(new BufferedOutputStream(outputStream));
        dataOutStream.writeUTF(fileContent);

        dataOutStream.close();
    }

    public static void usingFileChannel() throws IOException {
        String fileContent = "just text to write.";

        RandomAccessFile stream = new RandomAccessFile("samplefile6.txt", "rw");
        FileChannel channel = stream.getChannel();
        byte[] strBytes = fileContent.getBytes();
        ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
        buffer.put(strBytes);
        buffer.flip();
        channel.write(buffer);
        stream.close();
        channel.close();
    }

    public static void usingPath() throws IOException {
        String fileContent = "just text to write.";

        Path path = Paths.get("samplefile7.txt");

        Files.write(path, fileContent.getBytes());
    }

}
