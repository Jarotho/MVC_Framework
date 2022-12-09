package Prueba;

import Prueba.MVC_Prueba.ControladorPrueba;
import Prueba.MVC_Prueba.VistaPrueba;

public class MainPrueba {

    public static void main(String[] args) {
        VistaPrueba vistaPrueba = new VistaPrueba();
        ControladorPrueba controlador = new ControladorPrueba(vistaPrueba);
        vistaPrueba.setVisible(true);
    }
}
