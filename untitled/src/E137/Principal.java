package E137;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();

   static Scanner entrada = new Scanner(System.in);



    public static void main(String[] args) {
        rellenarPoligono();
        mostrarResultado();


    }


    public static void rellenarPoligono(){
        int opcion;
        char respuesta;

        do{
            do{
                System.out.println("Digite que poligono desea: ");
                System.out.println("1. Triagulo");
                System.out.println("2. Rectagulo");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();
            }while (opcion<1 || opcion>2);

            switch (opcion){
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRectagulo();
                    break;


            }
            System.out.println("\nDesea introducir otro poligono (s/n): ");
            respuesta = entrada.next().charAt(0);
            System.out.println("");

        }while (respuesta=='s' || respuesta=='S');
    }


    public static void llenarTriangulo(){
        double lado1;
        double lado2;
        double lado3;

        System.out.println("\nDigite el lado1 del triangulo: ");
        lado1= entrada.nextDouble();
        System.out.println("\nDigite el lado2 del triangulo: ");
        lado2=entrada.nextDouble();
        System.out.println("\nDigite el lado3 del triangulo: ");
        lado3= entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);
        poligono.add(triangulo);
    }

    public static void llenarRectagulo(){
        int lado1, lado2;
        System.out.println("\nDigite el lado1 del rectangulo: ");
        lado1= entrada.nextInt();
        System.out.println("\nDigite el lado2 del rectangulo: ");
        lado2=entrada.nextInt();


        Rectangulo rectangulo = new Rectangulo(lado1,lado2);
        poligono.add(rectangulo);
    }


    public static void mostrarResultado(){
        for (Poligono poli:poligono) {
            System.out.println(poli.toString());
            System.out.println("Area ="+poli.area());
            System.out.println("");
        }

    }
}
