package academy.devdojo.maratonajava.introducao;
public class Aula006EstruturasDeRepeticao04Ex {
    // Dado o valor um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 80000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("O carro pode ser parcelado em " + parcela + " vezes com um valor de parcela de R$" + valorParcela);
        }
    }
}
