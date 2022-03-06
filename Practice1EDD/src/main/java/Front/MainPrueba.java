package Front;

import Back.Control.Files.Analizer;

/**
 *
 * @author aguare
 */
public class MainPrueba {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Analizer a = new Analizer();
        a.readArchive("/home/aguare/Downloads/testFile.csv");
        System.out.println("Tiempo -> " + ((System.currentTimeMillis() - startTime) / 1000d) + " s");
    }
}
