
import java.util.Scanner;

/**
 * Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis
 * (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de
 * 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas
 * necessárias.
 *
 * Entrada O arquivo de entrada contém um valor inteiro N maior que 0 e menor
 * que 1000000.
 *
 * Saída Imprima o valor lido e, em seguida, a quantidade mínima de notas de
 * cada tipo necessárias, conforme o exemplo fornecido. Não esqueça de imprimir
 * o fim de linha após cada linha, caso contrário seu programa apresentará a
 * mensagem: “Presentation Error”.
 *
 * @author mazoi
 */
public class QuantidadeCedulas1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notasCem = 0;
        int notasCinquenta = 0;
        int notasVinte = 0;
        int notasDez = 0;
        int notasCinco = 0;
        int notasDois = 0;
        int notasUm = 0;

        int valor = sc.nextInt();

        int valorDecrementar = valor;

        while (valorDecrementar >= 100) {
            valorDecrementar -= 100;
            notasCem++;
        }

        while (valorDecrementar >= 50) {
            valorDecrementar -= 50;
            notasCinquenta++;
        }

        while (valorDecrementar >= 20) {
            valorDecrementar -= 20;
            notasVinte++;
        }

        while (valorDecrementar >= 10) {
            valorDecrementar -= 10;
            notasDez++;
        }

        while (valorDecrementar >= 5) {
            valorDecrementar -= 5;
            notasCinco++;
        }

        while (valorDecrementar >= 2) {
            valorDecrementar -= 2;
            notasDois++;
        }

        while (valorDecrementar >= 1) {
            valorDecrementar -= 1;
            notasUm++;
        }

        System.out.println(valor);
        System.out.println(notasCem + " nota(s) de R$ 100,00");
        System.out.println(notasCinquenta + " nota(s) de R$ 50,00");
        System.out.println(notasVinte + " nota(s) de R$ 20,00");
        System.out.println(notasDez + " nota(s) de R$ 10,00");
        System.out.println(notasCinco + " nota(s) de R$ 5,00");
        System.out.println(notasDois + " nota(s) de R$ 2,00");
        System.out.println(notasUm + " nota(s) de R$ 1,00");
    }
}
