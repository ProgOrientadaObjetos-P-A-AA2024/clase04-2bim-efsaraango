/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.ArrayList;
import java.util.Scanner;
import paquete2.Arriendo;
import paquete3.*;

public class EjecutorDos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Arriendo> listaArriendos = new ArrayList<>();
        
        System.out.println("Ingrese el numero de Arrendamientos que desea ingresar:");
        int numArredaminto = entrada.nextInt();
        for (int i = 0; i < numArredaminto; i++) {
            System.out.println("Tipo de Arriendo a ingresar\n"
                    + "Ingrese (1) para Arriendo Local Comida: \n"
                    + "Ingrese (2) para Arriendo Local Comercial: \n"
                    + "Ingrese (3) para Arriendo Local Sesiones: ");
            int opcionArriendo = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcionArriendo){
                case 1:
                    System.out.println("Ingrese el nombre del arrendatario: ");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese el cuata Base: ");
                    double arriendoMensual = entrada.nextDouble();
                    
                    ArriendoLocalComida arriendoComida = new ArriendoLocalComida(nombre, arriendoMensual);
                    
                    System.out.println("Ingrese el Iva: ");
                    double iva = entrada.nextDouble();
                    System.out.println("Ingrese el valor del Agua: ");
                    double valorAgua = entrada.nextDouble();
                    System.out.println("Ingrese el valir de la Luz: ");
                    double valorLuz = entrada.nextDouble();
                    
                    entrada.nextLine();
                    
                    arriendoComida.establecerIva(iva);
                    arriendoComida.establecerValorAgua(valorAgua);
                    arriendoComida.establecerValorLuz(valorLuz);
                    
                    listaArriendos.add(arriendoComida);
                    
                     break;
                case 2:
                    System.out.println("Ingrese el nombre del arrendatario: ");
                    String nombre1 = entrada.nextLine();
                    System.out.println("Ingrese la cuota base : ");
                    double coutaBase = entrada.nextDouble();
                    
                    entrada.nextLine();
                    
                    ArriendoLocalComercial arriendoComercial = 
                            new ArriendoLocalComercial(nombre1, coutaBase);
                    
                    System.out.println("Ingrese el valor Adicional Fijo: ");
                    double valorFijo = entrada.nextDouble();
                    
                    entrada.nextLine();
                    
                    arriendoComercial.establecerValorAdicionalFijo(valorFijo);
                    listaArriendos.add(arriendoComercial);
                    
                     break;
                     
               case 3:
                   System.out.println("Ingrese el nombre del arrendatario: ");
                    String nombre2 = entrada.nextLine();
                    System.out.println("Ingrese el cuota Base: ");
                    double cuotaBase2 = entrada.nextDouble();
                    
                    entrada.nextLine();
                    
                    ArriendoLocalSesiones arriendoSesiones = 
                            new ArriendoLocalSesiones(nombre2, cuotaBase2);
                    
                    System.out.println("Ingrese el valor de las Sillas: ");
                    double valorSillas = entrada.nextDouble();
                    System.out.println("Ingrese el valor de Amplificacion");
                    double valorAmplificacion = entrada.nextDouble();
                    
                   arriendoSesiones.establecerValorSillas(valorSillas);
                   arriendoSesiones.establecerValorAmplificacion(valorAmplificacion);
                   
                   listaArriendos.add(arriendoSesiones);
                   break;
                   default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    i--; // Para que no cuente una iteración inválida
                    break;
            
            }
        }
        
        
        
        for (int i = 0; i < listaArriendos.size(); i++) {
            listaArriendos.get(i).establecerArriendoMensual();
            
            
            System.out.println(listaArriendos.get(i));
            System.out.println();
        }
        
        
    
    }
}
