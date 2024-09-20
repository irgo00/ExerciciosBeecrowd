
import java.util.Scanner;

/**
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A
 * seguir calcule a duração do jogo. Obs: O jogo tem duração mínima de um (1)
 * minuto e duração máxima de 24 horas.
 *
 * Entrada Quatro números inteiros representando a hora de início e fim do jogo.
 *
 * Saída Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)”
 * .
 *
 * @author irgo
 */
public class TempoDeJogo1047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        String[] horarios = entrada.split(" ");
        int horaInicial = Integer.parseInt(horarios[0]);
        int minutoInicial = Integer.parseInt(horarios[1]);
        int horaFinal = Integer.parseInt(horarios[2]);
        int minutoFinal = Integer.parseInt(horarios[3]);

        int duracaoHoras = horaFinal - horaInicial;
        int duracaoMinutos = minutoFinal - minutoInicial;

        // ajuste para quando o jogo começa e termina no mesmo horário
        if (horaInicial == horaFinal && minutoInicial == minutoFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            return;
        }

        // ajuste dos minutos negativos
        if (duracaoMinutos < 0) {
            duracaoMinutos += 60;
            duracaoHoras--;
        }

        // quando o jogo cruza a meia-noite
        if (duracaoHoras < 0) {
            duracaoHoras += 24;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", duracaoHoras, duracaoMinutos);
    }
}

