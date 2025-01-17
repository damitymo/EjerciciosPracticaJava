import java.util.Scanner;

public class Main {

        public static double suma(double a, double b) {
        return a + b;
    }

        public static double resta(double a, double b) {
        return a - b;
    }

        public static double multiplicacion(double a, double b) {
        return a * b;
    }

       public static double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Ingrese el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Seleccione la operación que desea realizar:");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: División");
            System.out.print("Ingrese el número de la operación: ");
            int opcion = scanner.nextInt();

            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = suma(numero1, numero2);
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2:
                    resultado = resta(numero1, numero2);
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3:
                    resultado = multiplicacion(numero1, numero2);
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4:
                    resultado = division(numero1, numero2);
                    System.out.println("El resultado de la división es: " + resultado);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
