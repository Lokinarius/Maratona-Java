package academy.devdojo.maratonajava.javacore.Aula016Wrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 130;
        char charP = 'M';
        boolean booleanP = false;

        // Tranformando tipos em classes
        // Tipos primitivos continuam tendo a preferencia
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // outboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 130.0;
        Character charW = 'M';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        System.out.println(Character.isDigit('A'));


    }
}
