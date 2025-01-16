package academy.devdojo.maratonajava.javacore.Aula015Exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) throws IllegalAccessException {
        divisao(35,0);
        System.out.println("Código finalizado");
    }
    /*
    * @parametro a
    * @parametro b não pode ser zero
    * @return
    * @throws IllegalArgumentException caso b seja zero
    * */
    private static int divisao(int a,int b) throws IllegalAccessException {
        if (b == 0){
            throw new IllegalAccessException("Um número não pode ser dividido por zero");
        }
        return a/b;
    }
}
