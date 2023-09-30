import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class RandomNumberGenerator {

    Random random = new Random();

    public void addFile(String name, int size) throws IOException {

        FileOutputStream outputStream = null;

        try {
            int i = 0;
            int digit;
            outputStream = new FileOutputStream(name);
            while (i < size){
                digit = random.nextInt( 1, 101);
                outputStream.write(digit);
                i++;
            }

            } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
