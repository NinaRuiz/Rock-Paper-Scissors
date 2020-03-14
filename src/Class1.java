import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Class1 {
    /** Variable del jugador = lo que elige
     * 1= papel
     * 2= tijeras
     * 3= piedra
     * Pedir la variable
     * Crear una variable random del 1 al 3
     * Crear condicion si variablejugador = variablerandom empate
     * Si variablejugador - variablerandom = -1 gana jugador
     * Si variablejugador - variablerandom = -2 gana jugador
     * Si variablejugador - variablerandom = 1 gana ordenador
     * Si variablejugador - variablerandom = 2 gana ordenador
     */
    public static void main (String [] args) {
        int puntuacionOrdenador = 0;
        int puntuacionJugador = 0;

        boolean seguit = true;
        while (seguit) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Haz tu jugada: \n (1) Papel \n (2) Tijeras \n (3) Piedra");
            String variableJugador = scanner.nextLine();

            int variableRandom = (int) Math.round(Math.random() * 3);

            try {
                if (Integer.parseInt(variableJugador) == variableRandom) {
                    System.out.println("¡¡EMPATE!!");
                } else if (Integer.parseInt(variableJugador) - variableRandom >= -1) {
                    System.out.println("¡¡Ganaste!!");
                    puntuacionJugador++;
                } else {
                    System.out.println("Perdiste :(");
                    puntuacionOrdenador++;
                }
            } catch (Exception e) {
                System.out.println("Introduce el número. ");

            }

            System.out.println("\nJugador: " + puntuacionJugador + "\nOrdenador: " + puntuacionOrdenador);
        }
    }



}