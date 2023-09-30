import java.io.FileInputStream;
import java.io.IOException;

public class PrintFile {

    int i = 0;
    int sum = 0;

    public void print(String name) throws IOException {

        try (FileInputStream fileIn = new FileInputStream(name)) {
            int item;
            while ((item = fileIn.read()) != -1) {
                System.out.println(item);
                sum += item;
                i++;
            }

            System.out.println("Average: " + sum / i);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
