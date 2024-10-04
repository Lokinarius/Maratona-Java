package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        // Carro 1
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Uno";
        carro.ano = 2021;
        //Carro 2
        Carro carro2 = new Carro();
        carro2.marca = "Toyota";
        carro2.modelo = "Corolla";
        carro2.ano = 2022;
        //Saída de dados
        //Carro 1
        System.out.println("Carro 1");
        System.out.println("\nMarca: " + carro.marca);
        System.out.println("\nModelo: " + carro.modelo);
        System.out.println("\nAno: " + carro.ano);
        //Carro 2
        System.out.println("Carro 2");
        System.out.println("\nMarca: " + carro2.marca);
        System.out.println("\nModelo: " + carro2.modelo);
        System.out.println("\nAno: " + carro2.ano);
    }
}
