import java.util.Scanner;

public class Leitura {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int ValorInteiro;
        float ValorFloat;

        System.out.println("Por favor, digite um valor inteiro");
        ValorInteiro = teclado.nextInt();

        System.out.println("Por favor, digite um valor real");
        ValorFloat = teclado.nextFloat();

        System.out.println("Você digitou os valores " + ValorInteiro + " e " + ValorFloat);
        teclado.close();
    }
}
