package Framework;

import Json.configuraciónJson;
import java.util.HashMap;
import java.util.Map;

public class Framework {
    private Map<String, Transacciones> listaTransacciones = new HashMap<String, Transacciones>();
    configuraciónJson lector;
    String configuracionMVC[][];

    public Framework() {
        lector = new configuraciónJson();
        lector.obtenerConfiguracionesMVC();
        configuracionMVC = lector.getConfiguracionMVC();
        generarTransacciones();
    }

    public void generarTransacciones() {
        for (int i = 0; i < configuracionMVC.length; i++) {
            listaTransacciones.put(configuracionMVC[i][0],
                    new Transacciones(configuracionMVC[i][1], configuracionMVC[i][2], configuracionMVC[i][3]));
        }
    }

    public Transacciones getTransaccion(String nombreTransaccion) {
        return listaTransacciones.get(nombreTransaccion);
    }

}
