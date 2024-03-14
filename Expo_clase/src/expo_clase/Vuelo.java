/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expo_clase;

/**
 *
 * @author Javier Reyes
 */
public class Vuelo {
    private String numero;
    private String tipoAvion;

    public Vuelo(String numero, String tipoAvion) {
        this.numero = numero;
        this.tipoAvion = tipoAvion;
    }

    public String getNumero() {
        return numero;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }
}
/*
2. Clase Vuelo:

Representa un vuelo con un número y un tipo de avión.
El constructor Vuelo inicializa un objeto Vuelo con un número de vuelo y un tipo de avión.
Los métodos getNumero y getTipoAvion devuelven el número y el tipo de avión del vuelo, respectivamente.
*/