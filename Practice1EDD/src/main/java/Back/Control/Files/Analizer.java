package Back.Control.Files;

import Back.DataEstructure.ListDin;
import Back.Objects.Bet;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author aguare
 */
public class Analizer {

    private ListDin list = new ListDin();

    public void readArchive(String path) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File(path));
            scan.useDelimiter(",");
            int line = 1;
            while (scan.hasNext()) {
                //System.out.println(line + " |\t" + scan.nextLine());
                addToList(scan.nextLine());
                line++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        } finally {
            if (scan != null) {
                scan.close();
                list.showList();
            }
        }

    }

    private void addToList(String line) {
        try {
            System.out.println(line);
            String[] parts = line.split(",");
            Double mount = Double.valueOf(parts[1]);
            int[] horses = {Integer.valueOf(parts[2]), Integer.valueOf(parts[3]),
                Integer.valueOf(parts[4]), Integer.valueOf(parts[5]), Integer.valueOf(parts[6]),
                Integer.valueOf(parts[7]), Integer.valueOf(parts[8]), Integer.valueOf(parts[9]),
                Integer.valueOf(parts[10]), Integer.valueOf(parts[11])};
            Bet bet = new Bet(horses, mount, LocalDate.now(), 0, parts[0], false);
            list.addStart(bet);
        } catch (NumberFormatException e) {
        }
    }
}
