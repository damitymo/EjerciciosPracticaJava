import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese una frase");

        String frase= scanner.nextLine();

        int cantChar= frase.length();
        System.out.println("La cantidad de Caracteres es: " + cantChar);

        System.out.print("Ingresa la palabra que deseas buscar: ");
        String palabra = scanner.nextLine();

        if (frase.indexOf(palabra) != -1) {
            System.out.println("La palabra \"" + palabra + "\" se encuentra en la frase.");
        } else {
            System.out.println("La palabra \"" + palabra + "\" no se encuentra en la frase.");
        }

        String fraseMinusculas = frase.toLowerCase();
        System.out.println("Frase en minúsculas: " + fraseMinusculas);

        String fraseMayusculas = frase.toUpperCase();
        System.out.println("Frase en mayúsculas: " + fraseMayusculas);

        String primeraPalabra = frase.split(" ")[0];
        System.out.println("Primera palabra de la frase: " + primeraPalabra);


        System.out.print("Ingresa una palabra o frase adicional: ");
        String palabrasAdicionales = scanner.nextLine();
                String nuevaFrase = frase.substring(0,4 )
                + " " + palabrasAdicionales + " "
                + frase.substring(palabrasAdicionales.length()+1);
        System.out.println("Frase con palabras agregadas: " + nuevaFrase);

        scanner.close();
    }
}