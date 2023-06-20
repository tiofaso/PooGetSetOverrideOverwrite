package Exercicio01;

public class Main {
    public static void main(String[] args) {
        Renault renault = new Renault("Kangoo Sportway", 2012, 33258, "cinza", 5);

        System.out.printf("> RENAULT\n");
        renault.mostraCarro();
        renault.partidaMotor(0);
        renault.aceleraMotor(10);
        renault.freiaCarro(5);
        System.out.printf("\n-------------\n\n");

        Fiat fiat = new Fiat("Doblò Adventure", 2012, 46449, "verde", 6);

        System.out.printf("> FIAT\n");
        fiat.mostraCarro();
        fiat.partidaMotor(3);
        fiat.aceleraMotor(12);
        fiat.freiaCarro(6);
        System.out.printf("\n-------------\n\n");

        Hyundai hyundai = new Hyundai("Creta", 2018, 87024, "prata", 4);

        System.out.printf("> HYUNDAI\n");
        hyundai.mostraCarro();
        hyundai.partidaMotor(5);
        hyundai.aceleraMotor(15);
        hyundai.freiaCarro(2);
        System.out.printf("\n-------------\n");

    }//End static
}
