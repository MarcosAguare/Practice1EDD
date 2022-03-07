package Front;

import Back.Control.Files.Analizer;
import Back.Control.VerifyBets;

/**
 *
 * @author aguare
 */
public class MainPrueba {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Analizer a = new Analizer();
        a.readArchive("/home/aguare/Downloads/testFile7errors.csv");
        VerifyBets verify = new VerifyBets();
        verify.analizeBets(a.getList());
        a = null;
        System.gc();
        verify.getRejected().showList();
        System.out.println("Tiempo -> " + ((System.currentTimeMillis() - startTime) / 1000d) + " s");
        
    }

}
