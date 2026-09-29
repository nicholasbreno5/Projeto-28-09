package projeto.modelo;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas){
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas(){
        return cilindradas;
    }
    
    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + getModelo() + " está acelerando...");
    }

    @Override
    public String toString() {
        return super.toString() + " - Cilindradas: " + cilindradas + "cc";
    }

}