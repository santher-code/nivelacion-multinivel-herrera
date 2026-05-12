public class Principal {

    // Clase Personaje dentro del mismo archivo
    static class Personaje {

        String nombre;
        String clase;
        int nivel;
        double vida;
        double vidaMaxima;
        int ataque;
        int defensa;

        // Constructor
        public Personaje(String nombre, String clase,
                         double vidaMax, int ataque,
                         int defensa) {

            this.nombre = nombre;
            this.clase = clase;
            this.nivel = 1;
            this.vida = vidaMax;
            this.vidaMaxima = vidaMax;
            this.ataque = ataque;
            this.defensa = defensa;
        }

        @Override
        public String toString() {
            return String.format(
                "[%s] %s Nv%d | HP:%.0f/%.0f",
                clase, nombre, nivel, vida, vidaMaxima
            );
        }

        // Ejercicio 1A
        public void mostrarEstado() {

            double porcentaje = (vida / vidaMaxima) * 100;

            int relleno = (int)(porcentaje / 10);

            String barra =
                "#".repeat(relleno) +
                ".".repeat(10 - relleno);

            String estado;

            if (porcentaje <= 0) {
                estado = "MUERTO";
            } else if (porcentaje <= 25) {
                estado = "CRITICO";
            } else if (porcentaje <= 50) {
                estado = "HERIDO";
            } else if (porcentaje <= 75) {
                estado = "ESTABLE";
            } else {
                estado = "SALUDABLE";
            }

            System.out.printf("[%s] %.0f%% - %s%n",
                    barra, porcentaje, estado);
        }
    }

    // Main
    public static void main(String[] args) {

        Personaje guerrero = new Personaje(
                "Aragorn",
                "Guerrero",
                100,
                18,
                12
        );

        Personaje mago = new Personaje(
                "Gandalf",
                "Mago",
                70,
                28,
                5
        );

        Personaje arquero = new Personaje(
                "Legolas",
                "Arquero",
                85,
                22,
                8
        );

        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);

        // Modificar solo un objeto
        guerrero.vida -= 30;

        System.out.println(guerrero.vida);
        System.out.println(mago.vida);

        // Mostrar estado
        guerrero.mostrarEstado();
        mago.mostrarEstado();
        arquero.mostrarEstado();
    }
}
