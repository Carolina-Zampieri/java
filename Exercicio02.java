import java.util.Scanner;

public class Exercicio02{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double raio, altura, V;

        //Entrada
        System.out.print("Digite o raio do cilindro:");
        raio = teclado.nextDouble();
        System.out.print("Digite a altura do cilindro:");
        altura = teclado.nextDouble();

        //processamento
        V = 3.14 * raio * raio * altura;

        //saída (formatada)
        System.out.printf("O volume do cilindro vale %.3f cm3\n", V );

        teclado.close();
    }
}