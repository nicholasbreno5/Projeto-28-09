package projeto.modelo;

public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        Veiculo(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + getModelo() + " está acelerando.");
    }

    @Override
    public String toString() {
        return super.toString() + " - Portas: " + quantidadePortas;
    }
}