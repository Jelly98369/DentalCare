// Model for implement adapter

package adapter;

public class VecchioTrattamento {
    private String nome;
    private double prezzo;

    public VecchioTrattamento(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
