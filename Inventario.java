/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Estudiante
 */
import java.util.ArrayList;

public class Inventario {

public static void main(String[] args)

{
ArrayList<String> inventario = new
ArrayList<>();
inventario.add("Espada de hierro");
inventario.add("Pocion de vida");
inventario.add("Escudo de madera");
inventario.add("Llave dorada");
System.out.println("=== INVENTARIO===");
for (int i = 0; i <inventario.size(); i++) {
System.out.println((i+1)+"."+inventario.get(1+i));

}
// for-each (mas limpio)

for (String item : inventario) {

System.out.println("- " + item);
}
        int xp = 0;
        int nivel = 1;
        int xpNecesario = 100;
        int[] batallas = {20, 35, 15, 40, 30};

        for (int xpGanado : batallas) {   // ? aquí va batallas
            xp += xpGanado;

            System.out.println("Ganaste " + xpGanado + " XP");
            System.out.println("XP actual: " + xp);

            if (xp >= xpNecesario) {      // ? aquí va xpNecesario
                nivel++;
                xp -= xpNecesario;

                System.out.println("¡Subiste a Nivel " + nivel + "!");
                System.out.println("XP restante: " + xp);
            }
        }

        System.out.println("Nivel final: " + nivel);
        System.out.println("XP final: " + xp);
    }
}

