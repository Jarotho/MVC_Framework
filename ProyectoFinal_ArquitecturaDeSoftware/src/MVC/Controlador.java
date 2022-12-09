package MVC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import MVC.Modelo;
import Prueba.MVC_Prueba.ModeloPrueba;

public class Controlador {
    public Modelo modelo;

    public Controlador(Modelo modelo) {
        this.modelo = modelo;
    }

    public void execute(String nombreFuncion, Object parametro) {
        Class modeloDemo = null;
        try {
            modeloDemo = Class.forName(modelo.getClass().getName());
            Class parametros[] = new Class[1];
            parametros[0] = String.class;
            Method meth = modeloDemo.getMethod(nombreFuncion, parametros);

            Object para[] = new Object[1];
            para[0] = parametro;
            ModeloPrueba mo = new ModeloPrueba();
            meth.invoke(this.modelo, para);
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
