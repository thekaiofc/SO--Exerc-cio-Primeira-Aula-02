package Controller;

public class Texto {

    // Construtor
    public Texto() {
        super(); //para construtor vazio
    }

    // Méetodo que recebe um texto, divide com split e retorna a quantidade de partes
    public int contarPartes(String texto) {

        String[] partes = texto.split(";");

        // Retornando o tamanho do vetor gerado
        return partes.length;
    }
}