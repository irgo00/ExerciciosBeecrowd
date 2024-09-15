
/**
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. 
 * Utilize a fórmula: a+b+abs(a-b))/2
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
 * Um segundo passo, portanto é necessário para chegar no resultado esperado.
 * 
 * Entrada
 * O arquivo de entrada contém três valores inteiros.
 * 
 * Saída
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 */

import static java.lang.Math.abs;
import java.util.Scanner;


public class MaiorNumero1013 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String valores = sc.nextLine();
        
        //split separa cada valor de uma string em uma posição do vetor, 
        //quebrando a string assim que encontrar o que estiver nos parênteses, no caso, o espaço
        String vetorValores[] = valores.split(" ");
        
        int a = Integer.parseInt(vetorValores[0]);
        int b = Integer.parseInt(vetorValores[1]);
        int c = Integer.parseInt(vetorValores[2]);
        
        int maiorAB = (a+b+abs(a-b))/2; //abs calcula o valor absoluto da diferença entre dois números
        
        int maiorTotal = (maiorAB+c+abs(maiorAB-c))/2;
        
        System.out.println(maiorTotal+" eh o maior");
    }
}
