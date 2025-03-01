import java.util.Scanner;

public class MenuTaller {

    public static void main(String[] args) {
        int opcion;

        Scanner sc = new Scanner(System.in);

        printMenu();

        System.out.print("Elige una opcion: ");
        opcion = sc.nextInt();


        switch (opcion) {
            case 0:

                break;
            case 1:

                break;
            case 2:

                break;

            case 3:

                break;
            case 4:

                break;

            case 5:

                break;
            default:
        }


    }

    private static void printMenu() {
        System.out.println("--------- MENU TALLER ----------");
        System.out.println("0. Calculadora");
        System.out.println("1. Calcular el area de un triangulo");
        System.out.println("2. Precio de las fotocopias");
        System.out.println("3. Mostrar la tabla de multiplicar");
        System.out.println("4. Encontrar cociente y residuo");
        System.out.println("5. Salir");
        System.out.println("--------- MENU TALLER ----------");
    }

}
