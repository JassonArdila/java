
package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a=2;
        aritmetica1.b=3;
        aritmetica1.sumar();
        
        var resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
         
        resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println(" resultado de sumar con argumentos = " +  resultado);
    }
}
