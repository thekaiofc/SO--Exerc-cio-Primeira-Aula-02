package View;

import java.util.Scanner;
import Controller.Texto;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instanciando a classe de controle
        Texto controller = new Texto();

        System.out.println("Digite um texto separado por ponto e vírgula (;):");
        String texto = sc.nextLine();

        int quantidade = controller.contarPartes(texto);

        System.out.println("Quantidade de partes no texto: " + quantidade);

        sc.close();
    }
}