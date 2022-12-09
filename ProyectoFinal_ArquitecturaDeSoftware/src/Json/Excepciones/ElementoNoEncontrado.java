package Json.Excepciones;

import javax.swing.*;

public class ElementoNoEncontrado extends Exception {

    public ElementoNoEncontrado(String message) {
        super(message);
        JOptionPane.showMessageDialog(null, "Error: " + message, "ERROR", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }
}
