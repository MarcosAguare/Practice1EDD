package Back.Control.Files;

import Back.DataEstructure.ListDin;
import Back.DataEstructure.Node;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author aguare
 */
public class Export {

    public void exportCSVRechazed(ArrayList<String> errors) {
        String path = getPath();
        if (path == null) {
            JOptionPane.showMessageDialog(null,
                    "No se pudo guardar el archivo");
        } else {
            path = path.endsWith(".csv") ? path : path + ".csv";
            try {
                File file = new File(path);
                FileWriter writer = new FileWriter(file);
                if (!file.exists()) {
                    file.createNewFile();
                }
                for (String error : errors) {
                    writer.write(error);
                }
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,
                        "No se pudo guardar el archivo");
            }
        }
    }

    public void exportCSV(ListDin bets) {
        String path = getPath();
        if (path == null) {
            JOptionPane.showMessageDialog(null,
                    "No se pudo guardar el archivo");
        } else {
            path = path.endsWith(".csv") ? path : path + ".csv";
            writeToFile(bets, path);
        }
    }

    private String getPath() {
        try {
            JFileChooser fChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos CSV", "csv");
            fChooser.setFileFilter(filter);
            fChooser.showSaveDialog(null);
            File file = fChooser.getSelectedFile();
            return file.getAbsolutePath();
        } catch (Exception e) {
            return null;
        }

    }

    private void writeToFile(ListDin bets, String path) {
        try {
            File file = new File(path);
            FileWriter writer;
            Node current = bets.getFirst();
            if (!file.exists()) {
                file.createNewFile();
            }

            writer = new FileWriter(file);
            while (current != null) {
                String horses = "";
                for (int i = 0; i < current.getElement().getHorses().length; i++) {
                    horses += "," + current.getElement().getHorses()[i];
                }
                writer.write(
                        current.getElement().getBettor_name() + "," + current.getElement().getBet_amount() + horses
                        + "\n");

                current = current.getNext();
            }
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "No se pudo guardar el archivo");
        }
    }

}
