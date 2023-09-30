import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class MergingFiles {

    ArrayList<Integer> inputArray1 = new ArrayList<>();
    ArrayList<Integer> inputArray2 = new ArrayList<>();

    public void mergeFiles(String name1, String name2) throws IOException {

        FileInputStream fileIn1 = null;
        FileInputStream fileIn2 = null;
        FileOutputStream fileOut = null;

        try {
            fileIn1 = new FileInputStream(name1);
            fileIn2 = new FileInputStream(name2);
            int tmp;

            while ((tmp = fileIn1.read()) != -1) {
                inputArray1.add(tmp);
            }
            while ((tmp = fileIn2.read()) != -1) {
                inputArray2.add(tmp);
            }

            inputArray1.addAll(inputArray2);
            inputArray1.sort(new Comparator<Integer>() {
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });

            fileOut = new FileOutputStream("out.txt");
            for (int array : inputArray1) {
                fileOut.write(array);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            if (fileIn1 != null) {
                fileIn1.close();
            }
            if (fileIn2 != null) {
                fileIn2.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
