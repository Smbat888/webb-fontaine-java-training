package fileio.fileio.homework;

/**
 * Created by: Hmayak Atayan on 22 December, 2019
 */
public class Main {
    static private String path = "Hamo/src";
    static private String path2 = "Hamo/src/copiedFIleName.txt";
    static String desktopPath = "C:/Users/Hmayak/Desktop";
    static private String textFile = "example 2.txt";

    public static void main(String[] args) {
        DataRepo dataRepo = new DataRepo();

        // exercise 1
        dataRepo.printAllDirectories(path);
        System.out.println("--------------------------------------------");

        //exercise 2
        dataRepo.getFileFormat(desktopPath, ".txt");
        System.out.println("--------------------------------------------");

        //exercise 3
        dataRepo.isExist(path);
        System.out.println("---------------------------------------------");

        //exercise 4
        dataRepo.canRead(path);
        dataRepo.canWrite(path);
        System.out.println("---------------------------------------------");

        //exercise 5
        dataRepo.getSizeBytes(path);
        dataRepo.getSizeByKiloBytes(path);
        dataRepo.getSizeByMegaBytes(path);
        System.out.println("---------------------------------------------");

        //exercise 6
        dataRepo.storeContentLineByLine("example 2.txt");
        for (String row : dataRepo.storeContentLineByLine(textFile)
        ) {
            System.out.println(row);
        }
        System.out.println("---------------------------------------------");

        //exercise 7
        dataRepo.countLines("example 2.txt");
        System.out.println("---------------------------------------------");

        //exercise 8
        dataRepo.readThenWriteIntoAnotherFile(textFile, "example7.txt");
        System.out.println("---------------------------------------------");

        //exercise 9
        //delete created file in exercise 8
        dataRepo.deleteFile("example7.txt");
        dataRepo.copyFile(path,textFile, path2);
    }
}
