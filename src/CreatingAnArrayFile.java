import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class CreatingAnArrayFile {

    Random random = new Random();

    public void addFile(String name) throws IOException {

        FileOutputStream fileOut = null;

        try {
            int i = 0;
            int item;
            fileOut = new FileOutputStream(name);
            while (i < 1000){
                item = random.nextInt(1, 100000);
                fileOut.write(item);
                i++;
            }

        } finally {
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
