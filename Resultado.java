
public class Resultado {

    public static void main(String[] args) {

        double raiz1 = 0, raiz2 = 0, raiz3 = 0;

        Ecuacion respuesta = new Ecuacion();

        respuesta.establecerA(1);
        respuesta.establecerB(2);
        respuesta.establecerC(1);

        System.out.println("A=" + respuesta.optenerA());
        System.out.println("B=" + respuesta.optenerB());
        System.out.println("C=" + respuesta.optenerC());

        System.out.println("ECUACION CUADRATICA :");
        System.out
                .println((int) respuesta.optenerA() + "x^2 + " + (int) respuesta.optenerB() + "x + "
                        + (int) respuesta.optenerC());

        System.out.println("Solucion :");

        System.out.println("Discriminante :" + respuesta.discriminante());

        if (respuesta.discriminante() > 0) {
            raiz1 = ((-respuesta.optenerB()) + respuesta.discriminante()) / (2 * respuesta.optenerA());
            raiz2 = ((-respuesta.optenerB()) + respuesta.discriminante()) / (2 * respuesta.optenerA());

            System.out.println("Tiene dos soluciones distintas:");

            System.out.println("raiz 1=" + raiz1);
            System.out.println("raiz 2=" + raiz2);

        } else if (respuesta.discriminante() == 0) {
            raiz3 = -respuesta.optenerB() / (2 * respuesta.optenerA());

            System.out.println("Tiene una solucion doble:");

            System.out.println("Respuesta=" + raiz3);

        } else if (respuesta.discriminante() < 0) {
            System.out.println("La ecuacion cuadratica no tiene solucion...");
        }
    }
}
