package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/**
 * Clase principal que carga los tours desde archivo,
 * recorre la colección y aplica filtros de búsqueda
 */
public class Main {
    public static void main(String[] args) {

        /* Crear instancia del gestor de datos */
        GestorDatos gestor = new GestorDatos();

        /* Cargar los tours desde el archivo .txt */
        ArrayList<Tour> listaTours = gestor.cargarTours("resources/data.txt");

        /* 1. RECORRIDO: mostrar todos los tours disponibles */
        System.out.println(" CATÁLOGO COMPLETO DE TOURS - LLANQUIHUE TOUR ");
        for (Tour tour : listaTours) {
            System.out.println("• " + tour.toString());
        }

        /*2. FILTRADO: mostrar solo los tours con valor menor a $30.000 */
        System.out.println(" TOURS CON VALOR MENOR A $30.000 ");
        ArrayList<Tour> toursFiltrados = new ArrayList<>();

        for (Tour tour : listaTours) {
            /* Condición de filtro: valor menor a 30000 pesos */
            if (tour.getValor() < 30000) {
                toursFiltrados.add(tour);
            }
        }

        /* Mostrar los resultados filtrados */
        if (toursFiltrados.isEmpty()) {
            System.out.println("No se encontraron tours buscados.");
        } else {
            for (Tour tour : toursFiltrados) {
                System.out.println("• " + tour.toString());
            }
        }

        /* 3. BÚSQUEDA: encontrar un tour específico por nombre */
        System.out.println("BÚSQUEDA DE TOUR: 'Premium'");
        String nombreBuscado = "Premium";
        boolean encontrado = false;

        for (Tour tour : listaTours) {
            /* Comparar nombre ignorando mayúsculas y minúsculas */
            if (tour.getTour().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Tour encontrado: " + tour.toString());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el tour '" + nombreBuscado + "'.");
        }
    }
}
