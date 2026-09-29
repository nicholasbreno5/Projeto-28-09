package projeto;
import java.util.ArrayList;
import java.util.List;

import projeto.modelo.Carro;
import projeto.modelo.Moto;
import projeto.modelo.Veiculo;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<>();

        frota.add(new Carro("Toyota", "Corolla", 4));
        frota.add(new Carro("Honda", "Civic", 4));
        frota.add(new Carro("FIAT", "Palio", 4));
        frota.add(new Moto("Honda", "CG", 160));
        frota.add(new Moto("Yamaha", "XJ6", 600));
        frota.add(new Moto("Honda", "Sahara", 300));

        System.out.println("Test Drive");

        for(Veiculo veiculo:frota){

            System.out.println(veiculo.toString());
            veiculo.acelerar();

        }
    }
}