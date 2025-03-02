import java.util.Scanner;

public class MenuTaller {

    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        imprimirMenu();

        do {

            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    calculadora();
                    break;
                case 1:
                    calcularTriangulo();
                    break;
                case 2:
                    precioImpresiones();
                    break;
                case 3:
                    tablaMulti();
                    break;
                case 4:
                    encontrarCocienteResiduo();
                    break;
                case 5:
                    System.out.println("Has terminado el programa.");
                    break;
                default: System.out.println("Opcion no valida, intente nuevamente.");
            }

        }while (opcion != 5);

    }

//-------- METODOS DEL MENU DE HERRAMIENTAS/PROGRAMAS ------------

    private static void imprimirMenu() {
        System.out.println("--------- MENU TALLER ----------");
        System.out.println("0. Calculadora");
        System.out.println("1. Calcular el area de un triangulo");
        System.out.println("2. Precio de las fotocopias");
        System.out.println("3. Mostrar la tabla de multiplicar");
        System.out.println("4. Encontrar cociente y residuo");
        System.out.println("5. Salir");
        System.out.println("--------- MENU TALLER ----------");
    }

    private static void calculadora() {

        final Scanner sc = new Scanner(System.in);
        int option;
        float result;
        int num1, num2;
        float num3, num4 = 0;

        do {

            imprimirMenuCalc();

            System.out.println("Ingrese una opcion: ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Sumar dos numeros");

                    System.out.println("Ingrese el primer valor: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo valor: ");
                    num2 = sc.nextInt();

                    result = sumar(num1, num2);
                    System.out.println("El resultado de la suma es: " + num1 + " +  " + num2 + " = " + result);
                    break;
                case 2:
                    System.out.println("Restar dos numeros");

                    System.out.println("Ingrese el primer valor: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo valor: ");
                    num2 = sc.nextInt();

                    result = restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + num1 + " + 0" + num2 + " = " + result);
                    break;
                case 3:
                    System.out.println("Multiplicar dos numeros");

                    System.out.println("Ingrese el primer valor: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo valor: ");
                    num2 = sc.nextInt();

                    result = multiplicar(num1, num2);
                    System.out.println("El resultado de la multiplicacion es: " + num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    System.out.println("Dividir dos numeros");

                    System.out.println("Ingrese el primer valor: ");
                    num3 = sc.nextFloat();

                    while (num4 == 0) {
                        System.out.println("Ingrese el segundo valor: ");
                        num4 = sc.nextFloat();

                        if (num4 != 0) {
                            result = dividir(num3, num4);
                            System.out.println("El resultado de la division es: " + num3 + " / " + num4 + " = " + result);
                            break;
                        } else {
                            System.out.println("No se puede dividir entre cero");
                        }
                    }

                    break;
                case 5:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 5);
    }

    // 0. FUNCIONES Y PROCEDIMIENTOS DE LA CALCULADORA

    public static void imprimirMenuCalc() {
        System.out.println("-------- MENU --------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("-------- MENU --------");
    }

    public static int sumar(int num1, int num2) {
        return (num1 + num2);
    }

    public static int restar(int num1, int num2) {
        return (num1 - num2);
    }

    public static int multiplicar(int num1, int num2) {
        return (num1 * num2);
    }

    public static float dividir(float num3, float num4) {
        return (num3 / num4);
    }

    // 0. --------------------------------------------

    private static void calcularTriangulo() {

    }

    // 1. FUNCIONES Y PROCEDIMIENTOS DE CALCULAR EL AREA DE UN TRIANGULO

    // 1. --------------------------------------------------------------

    private static void precioImpresiones() {
        Scanner sc = new Scanner(System.in);



    }

    // 2. FUNCIONES Y PROCEDIMIENTOS DE LOS PRECIOS DE LAS IMPRESIONES

    // 2. --------------------------------------------------------------

    private static void tablaMulti() {

    }

    // 3. FUNCIONES Y PROCEDIMIENTOS DE LA IMPRESION DE LAS TABLAS DE MULTIPLICACION

    // 3. --------------------------------------------------------------

    private static void encontrarCocienteResiduo() {

    }

    // 4. FUNCIONES Y PROCEDIMIENTOS DE ENCONTRAR EL COCIENTE Y EL RESIDUO

    // 4. --------------------------------------------------------------


    //----------FIN DE LOS METODOS-----------------
}
