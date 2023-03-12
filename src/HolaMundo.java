
import java.util.Scanner;

//mi clase en java
public class HolaMundo {

    public static void main(String args[]) {
        //convertir un tipo string a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad =" + (edad + 1));
      var valorPi= Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        //pedir un valor.
//        var consola = new Scanner(System.in);
//        System.out.println("ingresa tu edad");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
      var caracter = "hola".charAt(2);
        System.out.println("caracter = " + caracter);
    }
}
