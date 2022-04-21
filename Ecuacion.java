public class Ecuacion {

    double A, B, C;

    double formula1 = 0, formula2 = 0, formula3 = 0;

    void establecerA(double num1) {
        A = num1;
    }

    double optenerA() {
        return A;
    }

    void establecerB(double num2) {
        B = num2;
    }

    double optenerB() {
        return B;
    }

    void establecerC(double num3) {
        C = num3;
    }

    double optenerC() {
        return C;
    }

    double discriminante() {
        double discriminante;

        discriminante = Math.pow(optenerB(), 2) - (4 * optenerA() * optenerC());

        return discriminante;
    }

}
