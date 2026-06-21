public class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting (Automatic)
        int myInt = 9;
        double myDouble = myInt;

        System.out.println("Widening Casting:");
        System.out.println("int value: " + myInt);
        System.out.println("double value: " + myDouble);

        // Narrowing Casting (Manual)
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;

        System.out.println("\nNarrowing Casting:");
        System.out.println("double value: " + myDouble2);
        System.out.println("int value: " + myInt2);
    }
}
