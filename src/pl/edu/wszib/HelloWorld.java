package pl.edu.wszib;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int i;
        i=12;
        if (i<=2 || i>=11){
            System.out.println("Now it's Winter!");
        } else if (i>=4 && i<6){
            System.out.println("Now it's Spring!");
        } else if (i<=8 && i>=6){
            System.out.println("Now it's Summer!");
        } else if (i<=11 || i>=9){
            System.out.println("Now it's Autumn!");
        }

    }
}
