package academy.devdojo.maratonajava.javacore.Aula010ModificadorFinal.test;

import academy.devdojo.maratonajava.javacore.Aula010ModificadorFinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.Aula010ModificadorFinal.domain.Comprador;
public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        Carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);

    }
}
