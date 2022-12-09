package Prueba.MVC_Prueba;

import MVC.Modelo;

import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ModeloPrueba extends Modelo {
    public ModeloPrueba() {

    }

    public void HolaMundo(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Hola mundo", JOptionPane.WARNING_MESSAGE);
    }

    public void AdiosMundo(String texto) {
        JOptionPane.showMessageDialog(null, texto, "Adios mundo", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }

    public void FelizNavidad(String texto) throws IOException {
        File file = new File("FelizNavidad.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();
        jFrame.setSize(900, 800);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(imageIcon);
        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }

    public void HolaConsola(String texto) {
        System.out.print("\nHola Mundo");
    }
}
