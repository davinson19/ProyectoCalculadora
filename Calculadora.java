package ProyectoCalculadora;

public class Calculadora {
    public int num1, num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
        return num1 + num2;
    }

    public int resta() {
        return num1 - num2;
    }

    public int multiplicacion() {
        return num1 * num2;
    }

    public int division() {
        return num1 / num2;
    }

    public void realizarOperacion(int operacion) {
        switch (operacion) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}
