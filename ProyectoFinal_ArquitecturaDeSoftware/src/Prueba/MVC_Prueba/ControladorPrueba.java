package Prueba.MVC_Prueba;

import Framework.Framework;
import Framework.Transacciones;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrueba implements ActionListener {
    private VistaPrueba prueba;

    public ControladorPrueba(VistaPrueba prueba) {
        this.prueba = prueba;

        this.prueba.getHolaButton().addActionListener(this);
        this.prueba.getAdiosButton().addActionListener(this);
        this.prueba.getNavidadButton().addActionListener(this);
        this.prueba.getConsolaButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (prueba.getHolaButton() == e.getSource()) {
                Framework frame = new Framework();
                Transacciones t = frame.getTransaccion("HolaMundo");
                t.execute("Hola Mundo");
            }
        } catch (NullPointerException exc) {
            System.out.println("La transacción es inexistente" + exc.getMessage());
        }

        try {
            if (prueba.getAdiosButton() == e.getSource()) {
                Framework frame = new Framework();
                Transacciones t = frame.getTransaccion("AdiosMundo");
                t.execute("Adios Mundo");
            }
        } catch (NullPointerException exc) {
            System.out.println("La transacción es inexistente" + exc.getMessage());
        }

        try {
            if (prueba.getNavidadButton() == e.getSource()) {
                Framework frame = new Framework();
                Transacciones t = frame.getTransaccion("FelizNavidad");
                t.execute("Feliz Navidad");
            }
        } catch (NullPointerException exc) {
            System.out.println("La transacción es inexistente" + exc.getMessage());
        }

        try {
            if (prueba.getConsolaButton() == e.getSource()) {
                Framework frame = new Framework();
                Transacciones t = frame.getTransaccion("HolaConsola");
                t.execute("Hola Consola");
            }
        } catch (NullPointerException exc) {
            System.out.println("La transacción es inexistente" + exc.getMessage());
        }

    }
}
