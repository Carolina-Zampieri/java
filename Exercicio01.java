import java.util.Scanner;

public class Exercicio01{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int numeroOriginal, c, d, u, resto;
        int nuvoNumero;

        //Entrada de dados
        System.out.println("Digite um numero de 3 digitos");
        numeroOriginal = teclado.nextInt();

        //Processamento
        c = numeroOriginal / 100;     //ex: 234 / 100 = 2, portanto c = 2
        resto = numeroOriginal % 100; //ex: 234 % 100 =34, portanto resto = 34
        d =  resto / 10;              //ex: 34 / 10 = 3, portanto d = 3
        u = resto % 10;               //ex: 34 % 10 = 4, portanto u = 4;

        nuvoNumero = u * 100 + d * 10 + c;

        //Saída
        System.out.println("O novo numero vale: " + nuvoNumero);

        teclado.close();
    }
}