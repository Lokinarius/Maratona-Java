package academy.devdojo.maratonajava.javacore.Aula011Enumeracao.test;

import academy.devdojo.maratonajava.javacore.Aula011Enumeracao.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Aula011Enumeracao.domain.TipoCliente;

public class ClientTest {
    public static void main(String[] args) {
        // Objetos
        Cliente cliente1 = new Cliente("Makima", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Power Rangers",TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Power",TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("time 7",TipoCliente.PESSOA_JURIDICA);

        // Saída de dados
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
