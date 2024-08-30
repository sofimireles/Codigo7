package com.generation;

//Se importaron las utilidades Scanner y HashMap 
import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

    //Se añadio el metodo main para que pudiera correr el codigo 
	public static void main(String[] args) {

    //Se añadio System.in para que el usuario pudiera introducir informacion
	Scanner s = new Scanner(System.in); 

    //Se cambio el tipo de dato ingresado en el HashMap a String
	HashMap<String, String> ca = new HashMap<>(); 

        //Se agregaron los 30 países y capitales mas importantes del mundo 
        //Para que el codio estuviera mas completo 
        ca.put("Canadá", "Ottawa");
        ca.put("Estados Unidos", "Washington D.C.");
        ca.put("México", "Ciudad de México");
        ca.put("Argentina", "Buenos Aires");
        ca.put("Brasil", "Brasilia");
        ca.put("Chile", "Santiago");
        ca.put("Colombia", "Bogotá");
        ca.put("Perú", "Lima");
        ca.put("Venezuela", "Caracas");
        ca.put("Reino Unido", "Londres");
        ca.put("Francia", "París");
        ca.put("Alemania", "Berlín");
        ca.put("Italia", "Roma");
        ca.put("España", "Madrid");
        ca.put("Portugal", "Lisboa");
        ca.put("Rusia", "Moscú");
        ca.put("China", "Pekín");
        ca.put("Japón", "Tokio");
        ca.put("India", "Nueva Delhi");
        ca.put("Australia", "Canberra");
        ca.put("Sudáfrica", "Pretoria");
        ca.put("Egipto", "El Cairo");
        ca.put("Arabia Saudita", "Riad");
        ca.put("Turquía", "Ankara");
        ca.put("Israel", "Jerusalén");
        ca.put("Irán", "Teherán");
        ca.put("Corea del Sur", "Seúl");
        ca.put("Indonesia", "Yakarta");
        ca.put("Tailandia", "Bangkok");
        ca.put("Nueva Zelanda", "Wellington");

        //Se corrijio la redaccion de String 
        String c = "";

        do {
            System.out.println("Escribe el nombre de un país y te diré su capital: ");
            c = s.nextLine();

            //Se añadio IsIgnoreCase
            if (!c.equalsIgnoreCase("salir")) { 
                //Se cambio Value por Key 
            	if (ca.containsKey(c)) {
                    //Se obtuvo la capital del pais mediante un getter que llama al elemento del HasMap
            		System.out.println("La capital de " + c + " es " + ca.get(c));
                } else {
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + c + "?: ");
                    String capital = s.nextLine(); 
                    ca.put(c, capital); 
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
          //Se añadio un while que le faltaba a do  
        } while (!c.equalsIgnoreCase("salir")); 
    }
}

