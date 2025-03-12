package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int u,rc, num, rm, min, cm, tl;
        Cabina C = new Cabina();
        List<Cabina> llamadas = new ArrayList<>();

        do {
            System.out.println("\n--- Menú ---");
            System.out.println(" ");
            System.out.println("1. Crear cabina telefónica");
            System.out.println("2. Registrar llamada");
            System.out.println("3. Ver información detallada de la cabina");
            System.out.println("4. Ver consolidado total");
            System.out.println("5. Reiniciar cabina");
            System.out.println("6. Salir");
            System.out.println(" ");
            System.out.print("Ingrese la opción: ");
            u = teclado.nextInt();

            switch (u) {
                case 1:
                    System.out.println(" ");
                    System.out.println("Número Cabina:");
                    num=teclado.nextInt();
                    System.out.println("Seleccione tipo de cabina");
                    System.out.println("1. Cabina Local");
                    System.out.println("2. Cabina de Larga distancia");
                    System.out.println("3. Cabina de Celular");
                    rc=teclado.nextInt();
                    System.out.println("Seleccione tipo minuto");
                    System.out.println("1. Minuto Local");
                    System.out.println("2. Minuto a Larga distancia");
                    System.out.println("3. Minuto a Celular");
                    min=teclado.nextInt();
                    System.out.println("Seleccione costo del minuto");
                    System.out.println("1. Minuto de llamada local: $50 ");
                    System.out.println("2. Minuto de llamada a Larga distancia: $350");
                    System.out.println("3. Minuto de llamada a Celular: $150");
                    cm=teclado.nextInt();

                    System.out.println("Cabina #" + num + " creada.");

                    C.crearCabina(num,rc,min,cm);
                    llamadas.add(C);

                    break;

                case 2:
                    System.out.println(" ");
                    System.out.print("Ingrese el número de la cabina: ");
                    num=teclado.nextInt();
                    System.out.print("Ingrese tipo de llamada: ");
                    System.out.println(" ");
                    System.out.println("1. Llamada Local");
                    System.out.println("2. Llamada  a Larga distancia");
                    System.out.println("3. Llamada a Celular");
                    tl=teclado.nextInt();
                    System.out.println("Ingrese cantidad de minutos");
                    min=teclado.nextInt();

                    switch(tl){
                        case 1:
                            C.registroLlamadaLocal(min);
                            break;

                        case 2:
                            C.registroLlamadaLargaDistancia(min);
                            break;
                        case 3:
                            C.registroLlamadaCelular(min);
                            break;

                    }

                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println("Seleccione el número de la cabina de la cúal desea conocer la información");
                    System.out.println("1. Cabina Local");
                    System.out.println("2. Cabina de Larga Distancia");
                    System.out.println("3. Cabina de Celular");
                    num= teclado.nextInt();
                    System.out.println(C.mostrarInformacionDetallada(num));
                    break;

                case 4:
                    System.out.println(" ");
                    System.out.println("Consolidado Total");
                    C.mostrarConsolidadoTotal();
                    break;

                case 5:
                    System.out.println(" ");
                    C.reiniciarCabina();
                    break;
            }

        }  while (u != 6) ;

    }
}