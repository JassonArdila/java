package Caja;

public class PruebaDeVolumen {

    public static void main(String[] args) {
        Caja caja1 = new Caja();
        System.out.println("caja1.ancho = " + caja1.ancho);
        System.out.println("caja1.alto = " + caja1.alto);
        System.out.println("caja1.profundo = " + caja1.profundo);

        Caja caja2 = new Caja(3, 2, 6);
        System.out.println("caja2.ancho = " + caja2.ancho);
        System.out.println("caja2.alto = " + caja2.alto);
        System.out.println("caja2.profundo = " + caja2.profundo);
        System.out.println("resultado de volumen = " + caja2.ancho * caja2.alto * caja2.profundo);
    }
}
