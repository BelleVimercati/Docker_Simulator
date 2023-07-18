/*
 * To do:
 * - criar um free()
 */


public class Software {
    String nome;
    int tamanho;


    public Software(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String toString(){
        String saida = "Nome: " + this.nome + " | Tamanho: " + this.tamanho;
        return saida;
    }
}

