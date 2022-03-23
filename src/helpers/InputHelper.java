package helpers;

import entities.Endereco;

import java.util.Scanner;

public class InputHelper {

    public static Integer lerID(String mensagem) {
        System.out.println(mensagem);

        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.nextLine());
    }

    public static String lerTexto(String mensagem) {

        System.out.println(mensagem);

        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
