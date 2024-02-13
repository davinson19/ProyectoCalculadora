package ProyectoCalculadora;

import java.util.Scanner;

public class pruebaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        Calculadora calculadora = new Calculadora(num1, num2);
        System.out.println("Ingrese la operación a realizar: ");
        int operacion = sc.nextInt();
        calculadora.realizarOperacion(operacion);
        sc.close();
    }
}
