package tp1;

public class Main {
    public static void main(String[] args) {
        Persona constructor = new Persona("manolo",23);
        Persona constructorVacio= new Persona();
        System.out.println(constructorVacio);
        System.out.println(constructor);
    }
}
