package basico;

import java.util.Scanner;
import java.util.Random;
public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aleatorio = new Random().nextInt(100) + 1;
        System.out.println("===JOGO DA ADIVINHAÇÃO===");
        int tentativas = 6;
        while (tentativas != 0){
            System.out.printf("VOCÊ TEM %d TENTATIVAS\n", tentativas);
            System.out.print("DIGITE O SEU PALPITE ENTRE 0 e 100: ");
            if (!teclado.hasNextInt()){
                System.out.println("Digite apenas números inteiros!");
                teclado.nextLine();
                continue;
            }
            int chute = teclado.nextInt();
            if (chute > 100 || chute < 0){
                System.out.println("Números apenas entre 0 e 100!");
                continue;
            }
            if (chute < aleatorio){
                System.out.println("O número é maior que isso!");
                tentativas -= 1;
            }
            if (chute > aleatorio){
                System.out.println("O numero é menor que isso!");
                tentativas -= 1;
            }
            if (chute == aleatorio){
                System.out.println("Acertou Miseravi!!!");
                break;
            }
        }
        if (tentativas == 0){
            System.out.println("Perdeu, mais sorte na próxima!");
            System.out.printf("O número era %d", aleatorio);
        }

    }
}
