package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        //EJERCICIO 1
       /* String nombreUsuario;
       String apellidoUsuario;
       String edadUsuario;
       int usosTarjeta;
       int compraAseos;
       int compraAlimenticio;
       int compraOtrosProductos;
       int puntajeCredito;
       double totalDescuento;

        System.out.print("Por favor ingrese su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("Por favor ingrese su Apellido: ");
        apellidoUsuario=teclado.nextLine();

        System.out.println("Por favor ingrese su puntaje de credito del 1 al 9: ");
        puntajeCredito=teclado.nextInt();

        System.out.print("Por favor ingrese su edad: ");
        edadUsuario=teclado.next();

        System.out.print("Por favor ingrese cuantas veces uso su tarjeta de credito: ");
        usosTarjeta=teclado.nextInt();

        System.out.print("Por favor ingrese el valor de sus compras de aseo: ");
        compraAseos=teclado.nextInt();

        System.out.print("Por favor ingrese el valor de sus compras alimenticias: ");
        compraAlimenticio=teclado.nextInt();

        System.out.print("Por favor ingrese el valor de sus otras compras: ");
        compraOtrosProductos=teclado.nextInt();

        int totalDeuda=compraAseos+compraAlimenticio+compraOtrosProductos;

        if (puntajeCredito==1){
            totalDescuento=totalDeuda*0.25;
            totalDescuento=totalDeuda-totalDescuento;
            System.out.println("Usuario "+nombreUsuario+" "+ apellidoUsuario+" con edad de: "+edadUsuario+" con un usos de tarjetas de: "+usosTarjeta+" su valor total con el descuento es: "+totalDescuento+" pesos");

        } else if (puntajeCredito==2) {
            totalDescuento=totalDeuda*0.2;
            totalDescuento=totalDeuda-totalDescuento;
            System.out.println("Usuario "+nombreUsuario+" "+ apellidoUsuario+" con edad de: "+edadUsuario+" con un usos de tarjetas de: "+usosTarjeta+" su valor total con el descuento es: "+totalDescuento+" pesos");


        } else if (puntajeCredito==3) {
            totalDescuento=totalDeuda*0.15;
            totalDescuento=totalDeuda-totalDescuento;
            System.out.println("Usuario "+nombreUsuario+" "+ apellidoUsuario+" con edad de: "+edadUsuario+" años con un usos de tarjetas de: "+usosTarjeta+" veces su valor total con el descuento es: "+totalDescuento+"pesos");


        } else if (puntajeCredito==4) {
            totalDescuento=totalDeuda*0.10;
            totalDescuento=totalDeuda-totalDescuento;
            System.out.println("Usuario "+nombreUsuario+" "+ apellidoUsuario+" con edad de: "+edadUsuario+" con un usos de tarjetas de: "+usosTarjeta+" su valor total con el descuento es: "+totalDescuento+" pesos");

        } else if (puntajeCredito==5||puntajeCredito==6||puntajeCredito==7||puntajeCredito==8||puntajeCredito==9) {
            System.out.println("usuario "+nombreUsuario+" Este puntaje no recibe beneficios y su total seria "+totalDeuda+" pesos");
            
        }else {
            System.out.println("usuario "+nombreUsuario+" Estos beneficios no existen");
        }
     */

        //EJERCICIO 2
        String nombreUsuario;
        String apellidoUsuario;
        String cedulaUsuario;
        String ciudadUsuario;
        int cantidadBoletas;
        int valorBoleta=450000;
        int edadUsuario;
        int totalBoleta;

        System.out.print("Para comprar las boletas por favor ingrese su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("ahora ingrese su apellido: ");
        apellidoUsuario=teclado.nextLine();

        System.out.print("ingrese su cedula: ");
        cedulaUsuario=teclado.nextLine();

        System.out.print("ingrese su edad: ");
        edadUsuario=teclado.nextInt();

        System.out.print("de que ciudad las compra: ");
        ciudadUsuario=teclado.next();

        System.out.print("cuantas boletas quiere comprar: ");
        cantidadBoletas=teclado.nextInt();

        if (edadUsuario<18){
            System.out.println("usuario "+nombreUsuario+" Usted no puede comprar boletas por ser menor de edad");

        } else if (cantidadBoletas>4) {
            System.out.println("usuario "+nombreUsuario+" Usted no puede comprar mas de cuatro boletas");

        }
        else {
            totalBoleta=valorBoleta*cantidadBoletas;
            System.out.println("usuario "+nombreUsuario+" "+apellidoUsuario+" con cedula: "+cedulaUsuario+" de la ciudad "+ciudadUsuario+" el total de su boleta seria: "+totalBoleta);
        }

    }
}