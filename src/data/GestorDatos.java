package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase GestorDatos que lee el archivo de datos y crea objetos Tour
 */
public class GestorDatos {

    /**
     * Lee el archivo .txt y retorna un ArrayList con los objetos Tour
     */
    public ArrayList<Tour> cargarTours(String rutaArchivo) {  /*Lista donde se almacenarán los objetos Tour */
        ArrayList<Tour> listaTours = new ArrayList<>();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            /* Recorrer cada línea del archivo */
            while ((linea = lector.readLine()) != null) {
                /* Ignorar líneas vacías */
                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] datos = linea.split(";");

                /* Verificar que la línea tenga exactamente 3 campos */
                if (datos.length == 3) {
                    String nombreTour = datos[0].trim();       /* Nombre del tour */
                    String duracion   = datos[1].trim();       /* Duración del tour */
                    double valor      = Double.parseDouble(datos[2].trim()); /* Valor del tour */

                    /* Crear objeto Tour y agregarlo a la lista */
                    Tour tour = new Tour(nombreTour, duracion, valor);
                    listaTours.add(tour);
                }
            }

            /* Cerrar el archivo */
            lector.close();

        } catch (IOException e) {
            /* Mostrar mensaje de error si no se puede leer el archivo */
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}