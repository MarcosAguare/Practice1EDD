package Back.Control.Files;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author aguare
 */
public class Analizer {

    public void readArchive(String path) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File(path));
            scan.useDelimiter(",");
            int line = 1;
            while (scan.hasNext()) {
                System.out.println(line + " |\t" + scan.nextLine());
                line++;
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }
}
