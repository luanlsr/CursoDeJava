package Condicionais;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;
import java.util.Scanner;

public class IfElseDesafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do dia da semana: ");
        String dia = entrada.next();

        if(dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        }  else if (dia.equalsIgnoreCase("segunda-feira")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("Terça-feira")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("Quarta-feira")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("Quinta-feira")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("Sexta-feira")) {
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("Sábado")) {
            System.out.println(7);
        }

//        String diaDaSemana = JOptionPane.showInputDialog("Qual o dia de semana?");
//
//        switch (diaDaSemana) {
//            case "1": {
//                System.out.println("Domingo");
//                break;
//            }
//            case "2": {
//                System.out.println("Segunda-feira");
//                break;
//            }
//            case "3": {
//                System.out.println("Terça-feira");
//                break;
//            }
//            case "4": {
//                System.out.println("Quarta-feira");
//                break;
//            }
//            case "5": {
//                System.out.println("Quinta-feira");
//                break;
//            }
//            case "6": {
//                System.out.println("Sexta-feira");
//                break;
//            }
//            case "7": {
//                System.out.println("Sábado");
//                break;
//            }
//            default: {
//                System.out.println("número inválido!");
//            }
//        }

    }
}
