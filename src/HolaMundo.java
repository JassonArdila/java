
import java.util.Scanner;

//mi clase en java
public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("escribe el titulo");
        var titulo = consola.nextLine();
        System.out.println("resultado = " + titulo + " " + usuario);
        

    }
}
