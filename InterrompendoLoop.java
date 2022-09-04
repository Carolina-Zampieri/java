import java.util.Scanner;

public class InterrompendoLoop{
    public static void main(String args[]){

        /* for (int contador = 1; contador <= 10; contador++){
            System.out.println("contador = " + contador);
            if (contador == 5){
                break;
            }
        } */

        for (int contador = 1; contador <= 10; contador++){
            if (contador == 5){
                continue;
            }
            System.out.println("Contador = " + contador);
        }

        /*int contador = 1;
        while (contador <= 10){
            if (contador == 5){
                continue;    // -> volta direto pro teste
            }
            System.out.println("Contador = " + contador);
            contador++;
        } */

        System.out.println("Fim do programa");
    }
}