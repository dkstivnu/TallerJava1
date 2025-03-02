import java.util.Scanner;

public class MenuTaller {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        elegirOpcion(sc);

    }


//-------- METHODS DEL MENU DE HERRAMIENTAS/PROGRAMAS ------------

    private static void elegirOpcion(Scanner sc) {
        int opcion;
        do {
            imprimirMenu();

            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0:
                    calculadora(sc);
                    break;
                case 1:
                    calcularTriangulo(sc);
                    break;
                case 2:
                    precioImpresiones(sc);
                    break;
                case 3:
                    tablaMulti(sc);
                    break;
                case 4:
                    encontrarCocienteResiduo(sc);
                    break;
                case 5:
                    System.out.println("Has terminado el programa.");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
            }

        } while (opcion != 5);
    }

    private static void imprimirMenu() {
        System.out.println("--------- MENU TALLER ----------");
        System.out.println("0. Calculadora Aritmetica");
        System.out.println("1. Calcular el area de un triangulo");
        System.out.println("2. Precio de las fotocopias");
        System.out.println("3. Mostrar la tabla de multiplicar");
        System.out.println("4. Encontrar cociente y residuo");
        System.out.println("5. Salir");
        System.out.println("--------- MENU TALLER ----------");
    }


    private static void calculadora(Scanner sc) {
        int option;
        float resultDiv;
        int num1, num2, result;
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
                    System.out.println("El resultado de la suma es: " + num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    System.out.println("Restar dos numeros");

                    System.out.println("Ingrese el primer valor: ");
                    num1 = sc.nextInt();
                    System.out.println("Ingrese el segundo valor: ");
                    num2 = sc.nextInt();

                    result = restar(num1, num2);
                    System.out.println("El resultado de la resta es: " + num1 + " - " + num2 + " = " + result);
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
                            resultDiv = dividir(num3, num4);
                            System.out.println("El resultado de la division es: " + num3 + " / " + num4 + " = " + resultDiv);
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

    private static void calcularTriangulo(Scanner sc) {

        float base;
        float altura;
        float resultado;

        System.out.println("Ingrese el valor de la base: ");
        base = sc.nextInt();
        System.out.println("Ingrese el valor de la altura: ");
        altura = sc.nextInt();

        if (validationTriangulo(base, altura)) {
            resultado = area(base, altura);
            System.out.println("La area del triangulo es: " + resultado);
        }
    }

    // 1. FUNCIONES Y PROCEDIMIENTOS DE CALCULAR EL ÁREA DE UN TRIÁNGULO

    private static boolean validationTriangulo(float base, float altura) {
        if (altura < 0) {
            System.out.println("La altura no puede ser negativa");
            return false;
        } else if (base < 0) {
            System.out.println("La base no puede ser negativa");
            return false;
        } else if (altura == 0) {
            System.out.println("La altura no puede ser cero");
            return false;
        } else if (base == 0) {
            System.out.println("La base no puede ser cero");
            return false;
        }
        return true;
    }

    private static float area(float base, float altura) {
        return ((base * altura) / 2);
    }

    // 1. --------------------------------------------------------------

    private static void precioImpresiones(Scanner sc) {

        System.out.println("----- PRECIO DE LAS IMPRESIONES -----");

        int numImpresiones;
        int precio;
        int costoFinal;

        System.out.println("Ingrese el numero de impresiones: ");
        numImpresiones = sc.nextInt();

        if (validationImpresiones(numImpresiones)) {

            precio = calcularPrecio(numImpresiones);

            costoFinal = precio * numImpresiones;

            System.out.println("El costo total por las fotocopias (" + precio + " $/u) es: " + costoFinal + " $");
        }
    }

    // 2. FUNCIONES Y PROCEDIMIENTOS DE LOS PRECIOS DE LAS IMPRESIONES

    private static int calcularPrecio(int numImpresiones) {
        int precio;
        if (numImpresiones <= 100) {
            precio = 200;
        } else if (numImpresiones <= 200) {
            precio = 150;
        } else if (numImpresiones <= 500) {
            precio = 100;
        } else {
            precio = 70;
        }
        return precio;
    }

    private static boolean validationImpresiones(int numImpresiones) {

        if (numImpresiones < 0) {
            System.out.println("El numero de impresiones no puede ser negativo");
            return false;
        } else if (numImpresiones == 0) {
            System.out.println("El numero de impresiones no puede ser cero");
            return false;
        }

        return true;

    }

    // 2. --------------------------------------------------------------

    private static void tablaMulti(Scanner sc) {
        System.out.println("----- TABLA DE MULTIPLICAR -----");
        int numTabla;

        System.out.println("Ingrese el numero de la tabla de multiplicar (1 - 15): ");
        numTabla = sc.nextInt();

        if (validationTabla(numTabla)) {
            imprimirTabla(numTabla);
        }
    }

    // 3. FUNCIONES Y PROCEDIMIENTOS DE LA IMPRESION DE LAS TABLAS DE MULTIPLICACION

    private static boolean validationTabla(int numTabla) {
        if (numTabla == 0) {
            System.out.println("El numero de la tabla no puede ser cero");
            return false;
        } else if (numTabla < 0) {
            System.out.println("El numero de la tabla no puede ser negativo");
            return false;
        }
        return true;
    }

    private static void imprimirTabla(int numTabla) {
        for (int i = 1; !(15 < i); i++) {
            System.out.println(numTabla + " * " + i + " = " + multiplicar(numTabla, i));
        }
    }

    // 3. --------------------------------------------------------------

    private static void encontrarCocienteResiduo(Scanner sc) {
        int dividendo;
        int residuo;
        int divisor;
        int cociente = 0;

        System.out.println("Ingrese el dividendo");
        dividendo = sc.nextInt();
        System.out.println("Ingrese el divisor");
        divisor = sc.nextInt();

        if (validacionDivision(divisor, dividendo)) {
            while (dividendo >= divisor) {
                dividendo -= divisor;
                cociente++;

            }
            residuo = dividendo;
            System.out.println("Cociente:" + cociente);
            System.out.println("Residuo:" + residuo);
        }

    }

    // 4. FUNCIONES Y PROCEDIMIENTOS DE ENCONTRAR EL COCIENTE Y EL RESIDUO

    private static boolean validacionDivision(int divisor, int dividendo) {
        if (divisor <= 0) {
            System.out.println("El divisor debe ser mayor a 0");
            return false;
        } else if (dividendo < 0) {
            System.out.println("El dividendo debe ser mayor a 0");
            return false;
        }
        return true;
    }

    // 4. --------------------------------------------------------------
//----------FIN DE LOS METODOS-----------------
}






