import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        CreatingAnArrayFile file = new CreatingAnArrayFile();
        MergingFiles mergingFiles = new MergingFiles();

        try {
            file.addFile("in1.txt");
            file.addFile("in2.txt");
            mergingFiles.mergeFiles("in1.txt", "in2.txt");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        RandomNumberGenerator arrayDigits = new RandomNumberGenerator();
        PrintFile printFile = new PrintFile();

        try {
            arrayDigits.addFile("30digits.txt", 30);
            printFile.print("30digits.txt");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}