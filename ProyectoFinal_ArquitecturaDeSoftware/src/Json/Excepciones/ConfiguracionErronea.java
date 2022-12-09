package Json.Excepciones;

import javax.swing.*;

public class ConfiguracionErronea extends Exception {
    public ConfiguracionErronea() {
        super("El archivo de configración no tiene todas las configuraciones");
        JOptionPane.showMessageDialog(null, "Error: El archivo JSON no cuenta con todas las configuraciones",
                "ERROR", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }
}
