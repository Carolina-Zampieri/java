import java.util.Scanner;

public class Exercicio03{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salarioMinimo, valor1Kw, qtdKw, valorTotal, valorComDesconto;

        //Entrada
        System.out.print("Digite o valor do salário mínimo:");
        salarioMinimo = teclado.nextDouble();
        System.out.print("Digite a quantidade de Kw gastos:");
        qtdKw = teclado.nextDouble();

        //processamento
        // parte 1 - saber quanto custa 1 kw
        valor1Kw = salarioMinimo / 7 / 100;

        //parte 2 - saber o valor da conta total
        valorTotal = qtdKw * valor1Kw;

        //parte 3 - saber o valor com desconto
        valorComDesconto = valorTotal * 0.9;

        //saída
        System.out.printf("O valor de 1Kw é R$ %.2f\n", valor1Kw);
        System.out.printf("O valor total da conta é R$ %.2f\n", valorTotal);
        System.out.printf("O valor com desconto é R$ %2.f\n", valorComDesconto);

        teclado.close();
    }
}