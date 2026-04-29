public class FuncionesRPG {

    // Retorna el daño real (mínimo 1)
    public static int calcularDano(int ataque, int defensa) {
        int dano = ataque - defensa;
        return dano > 0 ? dano : 1;
    }

    // Cura sin pasar del máximo
    public static double aplicarCuracion(double vida, double curacion, double maxVida) {
        double nuevaVida = vida + curacion;
        return nuevaVida > maxVida ? maxVida : nuevaVida;
    }

    // Muestra el estado del personaje
    public static void mostrarEstado(String nombre, double vida, int nivel) {
        System.out.printf("%s [Nv%d] HP: %.0f%n", nombre, nivel, vida);
    }

    // ===== EJERCICIO 4A =====
    // Sube de nivel si tiene suficiente XP
    public static int subirNivel(int xpActual, int xpNecesario, int nivelActual) {

        if (xpActual >= xpNecesario) {
            nivelActual++;
            xpActual = 0;

            System.out.println("¡Nivel alcanzado!");
            System.out.println("Nuevo nivel: " + nivelActual);
            System.out.println("XP reiniciado a: " + xpActual);
        } else {
            System.out.println("No hay suficiente XP para subir nivel.");
        }

        return nivelActual;
    }

    public static void main(String[] args) {

        System.out.println("===== PRUEBA calcularDano =====");
        int dano = calcularDano(20, 8);
        System.out.println("Daño realizado: " + dano);

        System.out.println("\n===== PRUEBA aplicarCuracion =====");
        double vidaCurada = aplicarCuracion(40, 80, 100);
        System.out.println("Vida después de curación: " + vidaCurada);

        System.out.println("\n===== PRUEBA mostrarEstado =====");
        mostrarEstado("Frodo", vidaCurada, 3);

        System.out.println("\n===== PRUEBA subirNivel (110 XP) =====");
        int nuevoNivel1 = subirNivel(110, 100, 3);
        System.out.println("Nivel retornado: " + nuevoNivel1);

        System.out.println("\n===== PRUEBA subirNivel (80 XP) =====");
        int nuevoNivel2 = subirNivel(80, 100, 3);
        System.out.println("Nivel retornado: " + nuevoNivel2);
    }
}
