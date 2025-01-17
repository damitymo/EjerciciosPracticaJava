import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo");

        double radio= scanner.nextDouble();

        double area = Circulo.PI*(radio*radio);

        double perimetro = (Circulo.PI*2)*radio;

        System.out.println("El area del circulo es: " + area);
        System.out.println("El perimetro del circulo es: " + perimetro);

        scanner.close();

    }
}