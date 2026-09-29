package projeto.modelo;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando de forma genérica.");
    }

    @Override
    public String toString() {
        return "Veiculo Marca = " + marca + " / Modelo = " + modelo;
    }
}