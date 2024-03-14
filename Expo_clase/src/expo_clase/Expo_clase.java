/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expo_clase;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */

/*
    Bienvenido al simulador de Aeropuerto.
    presentado por: Javier Reyes 12111252

 * Este programa simula el funcionamiento básico de un aeropuerto,
 * permitiendo gestionar vuelos, comidas y tiendas, e iniciar el proceso de embarque.
 * Utiliza arreglos para almacenar la información y proporciona una interfaz interactiva
 * para que el usuario seleccione comidas y tiendas antes del embarque.
*/

public class Expo_clase {
    private Vuelo[] vuelos;
    private int numeroDeVuelos;
    private int numeroDePuertas;
    private String[] comidas;
    private String[] tiendas;

    /*
   1. Clase Expo_clase:
    El constructor Expo_clase inicializa un objeto Expo_clase con un número específico de vuelos y puertas.
    */
    
    
    public Expo_clase(int numeroDeVuelos ,int numeroDePuertas) {
        this.numeroDeVuelos = numeroDeVuelos;
        this.numeroDePuertas = numeroDePuertas;
        this.vuelos = new Vuelo[numeroDeVuelos];
        this.comidas = new String[0];
        this.tiendas = new String[0];;
    }

    /*
    El método agregarVuelo permite agregar un vuelo al aeropuerto en una posición específica del arreglo de vuelos.
    */
    
    public void agregarVuelo(Vuelo vuelo, int indice) {
        if (indice >= 0 && indice < numeroDeVuelos) {
            vuelos[indice] = vuelo;
        } else {
            System.out.println("Índice de vuelo inválido.");
        }
    }

    public void agregarComida(String comida) {
        String[] nuevoComidas = new String[comidas.length + 1];
        for (int i = 0; i < comidas.length; i++) {
            nuevoComidas[i] = comidas[i];
        }
        nuevoComidas[comidas.length] = comida;
        comidas = nuevoComidas;
    }

    /*
    Los métodos agregarComida y agregarTienda agregan una nueva comida o tienda al arreglo respectivo.
    */
    
    public void agregarTienda(String tienda) {
        String[] nuevaTiendas = new String[tiendas.length + 1];
        for (int i = 0; i < tiendas.length; i++) {
            nuevaTiendas[i] = tiendas[i];
        }
        nuevaTiendas[tiendas.length] = tienda;
        tiendas = nuevaTiendas;
    }

    /*
    El método iniciarEmbarque simula el proceso de embarque para cada vuelo.
    Dentro de iniciarEmbarque, se utiliza un bucle for-each para iterar sobre los vuelos.
    */
    
    // la segunda clase continua en -> vuelo
    
    /*
    3. Métodos agregarComida y agregarTienda:

    Estos métodos agregan una nueva comida o tienda al arreglo respectivo.
    Se crean nuevos arreglos con el tamaño adecuado para almacenar los elementos existentes más el nuevo elemento.
    Se copian los elementos existentes al nuevo arreglo.
    Se agrega el nuevo elemento al final del nuevo arreglo.
    */
    
    public void iniciarEmbarque() {
        Random rand = new Random();
        Scanner comida = new Scanner(System.in);

        for (Vuelo vuelo : vuelos) {
            System.out.println("Iniciando embarque para el vuelo número: " + vuelo.getNumero());
            System.out.println("Presiona Enter para confirmar tu selección y continuar.");

            int horaDeVuelo = rand.nextInt(17) + 6; // Entre 6 y 22 horas para simular vuelos diurnos
            System.out.println("Hora de vuelo: " + horaDeVuelo + " horas");
            horaDeVuelo--; // Restar una hora mientras espera el vuelo

            System.out.println("Comidas disponibles:");
            for (int i = 0; i < comidas.length; i++) {
                System.out.println((i + 1) + ". " + comidas[i]);
            }
            
            int seleccionComida;
            do {
                System.out.print("Selecciona una comida: ");
                seleccionComida = comida.nextInt();
                if (seleccionComida < 1 || seleccionComida > comidas.length) {
                    System.out.println("Error: selección inválida. Por favor, seleccione nuevamente.");
                }
            } while (seleccionComida < 1 || seleccionComida > comidas.length);
            System.out.println("Has seleccionado: " + comidas[seleccionComida - 1]);

            

            System.out.println("Tiendas disponibles:");
            for (int i = 0; i < tiendas.length; i++) {
                System.out.println((i + 1) + ". " + tiendas[i]);
            }
            
            int seleccionTienda;
            do {
                System.out.print("Selecciona una tienda: ");
                seleccionTienda = comida.nextInt();
                if (seleccionTienda < 1 || seleccionTienda > tiendas.length) {
                    System.out.println("Error: selección inválida. Por favor, seleccione nuevamente.");
                }
            } while (seleccionTienda < 1 || seleccionTienda > tiendas.length);
            System.out.println("Has seleccionado: " + tiendas[seleccionTienda - 1]);

            System.out.println("Embarque para el vuelo número " + vuelo.getNumero() + " completado.\n");
            
        }
    }

    /*
   Para cada vuelo, se muestra información como el número de vuelo, 
   la hora de vuelo (generada aleatoriamente y decrementada en una hora), las comidas disponibles y las tiendas disponibles.
   Se utiliza un objeto Random para generar la hora de vuelo aleatoriamente.
   Se utiliza un objeto Scanner para obtener la entrada del usuario al seleccionar comidas y tiendas.
   */

   /*
   4. Método iniciarEmbarque:
   Este método simula el proceso de embarque para cada vuelo en el aeropuerto.

   Utiliza un bucle for-each para iterar sobre los vuelos.

   Para cada vuelo, muestra información relevante como el número de vuelo, 
   la hora de vuelo (generada aleatoriamente y decrementada en una hora), 
   las comidas disponibles y las tiendas disponibles.

   Utiliza objetos Random y Scanner para generar aleatoriamente la hora de vuelo 
   y obtener la entrada del usuario al seleccionar comidas y tiendas, respectivamente.
   */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Expo_clase aeropuerto = new Expo_clase(3,5);

        aeropuerto.agregarComida("Sandwich");
        aeropuerto.agregarComida("Pizza");
        aeropuerto.agregarComida("Ensalada");

        aeropuerto.agregarTienda("Duty Free");
        aeropuerto.agregarTienda("Librería");
        aeropuerto.agregarTienda("Electrónica");

        aeropuerto.agregarVuelo(new Vuelo("BA123", "Boeing"), 0);
        aeropuerto.agregarVuelo(new Vuelo("AA456", "Airbus"), 1);
        aeropuerto.agregarVuelo(new Vuelo("LH789", "Boeing"), 2);

        aeropuerto.iniciarEmbarque();

    }
    
}
/*
En resumen, en este programa, se ha creado una simulación básica de un aeropuerto,
permitiendo gestionar vuelos, comidas y tiendas, e iniciar el proceso de embarque.
Se han utilizado arreglos para almacenar la información y en el cual proporciona una interfaz interactiva
para que el usuario seleccione comidas y tiendas antes del embarque, 
mientras va restando su tiempo de espera en cada tipo de vuelo.
*/