package academy.devdojo.maratonajava.javacore.introducao06modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.introducao06modificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BMW",280);
        Carro carro02 = new Carro("Mercedes",300);
        Carro carro03 = new Carro("Audi",260);

        // Modificando o valor do static
        // O Modificador static altera
        // O valor do static vai afetar todos os objetos
        carro01.setVelocidadeMaxima(180);

        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
