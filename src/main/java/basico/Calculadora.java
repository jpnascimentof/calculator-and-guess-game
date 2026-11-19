package basico;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.println("====Calculadora====");
            System.out.println("Digite 1 para somar.");
            System.out.println("Digite 2 para subtrair.");
            System.out.println("Digite 3 para multiplicar.");
            System.out.println("Digite 4 para dividir.");
            System.out.println("Digite 5 para sair.");
            System.out.println("=========//=========");
            if (!teclado.hasNextInt()) {
                System.out.println("Erro: digite uma opção válida.");
                teclado.nextLine();
                continue;
            }
            int opcao = teclado.nextInt();
            teclado.nextLine();
            if (opcao < 1 || opcao > 5) {
                System.out.println("Opção inválida! Digite um número entre 1 e 5.");
                continue;
            }
            if (opcao == 5) {
                break;
            }
            System.out.println("Digite o primeiro numero: ");
            if (!teclado.hasNextDouble()) {
                System.out.println("Opção Inválida! Digite apenas números");
                teclado.nextLine();
                continue;
            }
            double a = teclado.nextDouble();
            teclado.nextLine();
            System.out.println("Digite o segundo numero: ");
            if (!teclado.hasNextDouble()) {
                System.out.println("Opção Inválida! Digite apenas números");
                teclado.nextLine();
                continue;
            }
            double b = teclado.nextDouble();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("A soma é: " + (a + b));
                    break;
                case 2:
                    System.out.println("A subtração é: " + (a - b));
                    break;
                case 3:
                    System.out.println("A multiplicação é: " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Opção Inválida! Digite outro número");
                    } else {
                        System.out.printf("A divisão é: %.2f\n", (a / b));
                    }
            }
        }
        teclado.close();
    }
}
