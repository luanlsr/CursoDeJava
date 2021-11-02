package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite o símbolo da operação que deseja fazer: + - / * ");
        String op = entrada.next();

        //Lógica
        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : 0;
        resultado = "/".equals(op) ? num1 / num2 : 0;
        resultado = "*".equals(op) ? num1 * num2 : 0;

        System.out.printf("%.1f %s %.1f = %.1f", num1, op, num2, resultado);
        entrada.close();
    }
}
