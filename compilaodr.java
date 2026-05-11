public class SimuladorRPG {

    // Funcion de combate
    public static double combatir(
            double vidaHero,
            int ataqueHero,
            int defensaHero,
            double vidaEnemigo,
            int ataqueEnemigo) {

        int ronda = 1;

        while (vidaHero > 0 && vidaEnemigo > 0) {

            // Heroe ataca
            vidaEnemigo -= ataqueHero;

            // Enemigo contraataca
            int danoEnemigo = ataqueEnemigo - defensaHero;

            if (danoEnemigo < 1) {
                danoEnemigo = 1;
            }

            vidaHero -= danoEnemigo;

            System.out.println("Ronda " + ronda);
            System.out.println("Heroe: " + vidaHero + " HP");
            System.out.println("Enemigo: " + vidaEnemigo + " HP");
            System.out.println("------------------");

            ronda++;
        }

        // Si el heroe sigue vivo retorna vida positiva
        // Si murio retorna 0 o negativo
        return vidaHero;
    }

    public static void main(String[] args) {

        // HEROE
        String nombreHero = "Guerrero";
        int nivelHero = 2;
        double vidaHero = 80;
        double vidaMax = 80;
        int ataqueHero = 18;
        int defensaHero = 8;

        // ENEMIGOS
        String[] nombres = {"Goblin", "Orco", "Dragon"};
        double[] vidas = {40, 70, 120};
        int[] ataques = {8, 14, 25};

        int enemigosDerrotados = 0;

        // CICLO PRINCIPAL
        for (int i = 0; i < nombres.length; i++) {

            System.out.println("\n=== COMBATE VS " + nombres[i] + " ===");

            vidaHero = combatir(
                    vidaHero,
                    ataqueHero,
                    defensaHero,
                    vidas[i],
                    ataques[i]
            );

            // Verificar si el heroe murio
            if (vidaHero <= 0) {
                System.out.println("El heroe ha muerto. FIN DEL JUEGO");
                break;
            }

            // Enemigo derrotado
            enemigosDerrotados++;

            System.out.println(nombres[i] + " derrotado!");

            // Curacion
            vidaHero += 20;

            if (vidaHero > vidaMax) {
                vidaHero = vidaMax;
            }

            System.out.println("Vida recuperada: " + vidaHero);
        }

        // RESULTADO FINAL
        System.out.println("\n===== RESULTADO FINAL =====");
        System.out.println("Enemigos derrotados: " + enemigosDerrotados);
        System.out.println("Vida restante del heroe: " + vidaHero);

        if (enemigosDerrotados == 3) {
            System.out.println("VICTORIA TOTAL!");
        } else {
            System.out.println("DERROTA...");
        }
    }
}
