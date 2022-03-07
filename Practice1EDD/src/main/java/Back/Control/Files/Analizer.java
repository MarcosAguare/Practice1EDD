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
    private ListDin errors = new ListDin();

    public void readArchive(String path) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File(path));
            while (scan.hasNext()) {
                addToList(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file");
        } finally {
            if (scan != null) {
                scan.close();
            }
        }

    }

    private void addToList(String line) {
        try {
            String[] parts = line.split(",");
            Double mount = Double.valueOf(parts[1]);
            int[] horses = {Integer.valueOf(parts[2]), Integer.valueOf(parts[3]),
                Integer.valueOf(parts[4]), Integer.valueOf(parts[5]), Integer.valueOf(parts[6]),
                Integer.valueOf(parts[7]), Integer.valueOf(parts[8]), Integer.valueOf(parts[9]),
                Integer.valueOf(parts[10]), Integer.valueOf(parts[11])};
            Bet bet = new Bet(horses, mount, LocalDate.now(), 0, parts[0].trim(), false);
            list.addStart(bet);
        } catch (Exception e) {
            
        }
    }

    public ListDin getList() {
        return list;
    }

    public void setList(ListDin list) {
        this.list = list;
    }

}
