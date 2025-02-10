package academy.devdojo.maratonajava.javacore.Aula017Strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concat(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String "+(fim - inicio)+"ms");
    }

    private static void concat(int tamanho){
        String texto = "";
        for(int i = 0; i < tamanho; i++){
            texto +=i;
        }
    }
}
