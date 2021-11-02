package Fundamentos;

import java.util.Arrays;

public class StringType {
    public static void main(String[] args) {
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        System.out.println(s.replace("tarde", "noite"));

        String nome = "Luan";
        String sobrenome = "Ramalho";
        int idade = 30;
        double salario = 4000.987455;

        System.out.printf("O senhor %s %s, de %d anos, recebe o salario de R$%.2f", nome, sobrenome, idade, salario);

    }
}
