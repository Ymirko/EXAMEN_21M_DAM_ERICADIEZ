import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Buenos días Ceinmark, soy Erica Diez");
        System.out.println("\nIntroduce un número para averiguar si es primo o no: ");
        
        int numero = scanner.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
            ArrayList<Integer> divisores = obtenerDivisores(numero);
            System.out.print("Los divisores del " + numero + " son: ");
            for (int i = 0; i < divisores.size(); i++) {
                if (i == divisores.size() - 1) {
                    System.out.print("y " + divisores.get(i));
                } else {
                    System.out.print(divisores.get(i) + ", ");
                }
            }
        }
        
        scanner.close();
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static ArrayList<Integer> obtenerDivisores(int numero) {
        ArrayList<Integer> divisores = new ArrayList<>();
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
}