package practica1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Chiva
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double resultat;
        String operacio;
        boolean continuar = false;
        double num1, num2;

        do {
            System.out.print("Introdueix el primer nombre: ");
            num1 = sc.nextDouble();

            System.out.println("Operació? (+)");
            System.out.println("          (-)");
            System.out.println("          (x)");
            System.out.println("          (/)");
            System.out.println("          (*)");
            System.out.println("          (%)");
            operacio = sc.next();

            System.out.print("Introdueix el segon nombre: ");
            num2 = sc.nextDouble();

            switch (operacio) {
                case "+":
                    resultat = sumar(num1, num2);
                    break;
                case "-":
                    resultat = restar(num1, num2);
                    break;
                case "x":
                case "X":
                    resultat = multiplicar(num1, num2);
                    break;
                case "/":
                    resultat = dividir(num1, num2);
                    break;
                case "*":
                    resultat = potencia(num1, num2);
                    break;
                case "%":
                    resultat = residu(num1, num2);
                    break;
                default:
                    resultat = 0;
            }

            System.out.println("(" + num1 + ") " + operacio + " (" + num2 + ")" + " = " + resultat);
            System.out.println("Vols continuar operant? [s/n]");
            sc.nextLine(); // Consumir el salto de línea después de nextDouble()
            continuar = sc.nextLine().equalsIgnoreCase("S");

        } while (continuar);

        sc.close();
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        Scanner sc = new Scanner(System.in); // Crear un nuevo Scanner dentro del método
        double resultat;
        while (num2 == 0) {
            System.err.println("Error: No es pot dividir per zero. Introdueix un altre valor:");
            num2 = sc.nextDouble();
        }
        sc.close(); // Cerrar el Scanner al final del método
        resultat = num1 / num2;
        return resultat;
    }

    public static double residu(double num1, double num2) {
        return num1 % num2;
    }

    public static double potencia(double num1, double num2) {
        return Math.pow(num1, num2);
        //La función Math.pow() devuelve la base elevada al exponente

    }
}
