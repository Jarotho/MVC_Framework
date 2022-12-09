package Framework;

import MVC.Modelo;
import Prueba.MVC_Prueba.ModeloPrueba;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Transacciones {

    private Object controlador;
    private Object modelo;
    private String funcion;
    private String modeloNombre;
    private String controlNombre;

    public Transacciones(String controlador, String modelo, String funcion) {
        crearModelo(modelo);
        crearControlador(controlador);
        this.funcion = funcion;
        this.modeloNombre = modelo;
        this.controlNombre = controlador;
    }

    private void crearControlador(String control) {
        try {
            Class controlador = Class.forName(control);
            Class parametros[] = new Class[1];
            parametros[0] = Modelo.class;
            Constructor contructorControlador = controlador.getConstructor(parametros);

            Object parametrosDos[] = new Object[1];
            parametrosDos[0] = (Modelo) modelo;
            this.controlador = contructorControlador.newInstance(parametrosDos);

        } catch (ClassNotFoundException e) {
            System.out.println("La clase controladora no fue encontrada");
        } catch (NoSuchMethodException e) {
            System.out.println("La función del controlador no fue encontrada");
        } catch (InvocationTargetException e) {
            System.out.println("Error en la función constructora: " + e.getCause());
        } catch (InstantiationException e) {
            System.out.println("No se pudo crear una instancia de la clase controladora");
        } catch (IllegalAccessException e) {
            System.out.println("No se pudo acceder a la clase o a la función");
        }
    }

    private void crearModelo(String modelo) {
        try {
            Class modeloPrueba = Class.forName(modelo);
            Constructor modeloContructor = modeloPrueba.getConstructor();
            this.modelo = modeloContructor.newInstance();

        } catch (ClassNotFoundException e) {
            System.out.println("La clase modelo no fue encontrada");
        } catch (NoSuchMethodException e) {
            System.out.println("La función del modelo no fue encontrada");
        } catch (InvocationTargetException e) {
            System.out.println("Error en la función constructora: " + e.getCause());
        } catch (InstantiationException e) {
            System.out.println("No se pudo crear una instancia de la clase modelo");
        } catch (IllegalAccessException e) {
            System.out.println("No se pudo acceder a la clase o a la función");
        }
    }

    public void execute(String texto) {
        Class modeloPrueba = null;
        try {
            modeloPrueba = Class.forName(controlNombre);
            Class parametros[] = new Class[2];
            parametros[0] = String.class;
            parametros[1] = Object.class;
            Method meth = modeloPrueba.getMethod("execute", parametros);

            Object para[] = new Object[2];
            para[0] = funcion;
            para[1] = texto;
            ModeloPrueba mo = new ModeloPrueba();
            meth.invoke(this.controlador, para);
        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo ejecutar la transacción:  No se encontró la clase");
        } catch (NoSuchMethodException e) {
            System.out.println("No se pudo ejecutar la transacción:  No se encontró la función");
        } catch (InvocationTargetException e) {
            System.out.println("No se pudo ejecutar la transacción: Error en la función: " + e.getCause());
        } catch (IllegalAccessException e) {
            System.out.println("No se pudo ejecutar la transacción: No se pudo acceder a la clase o a la función");
        }
    }

}
