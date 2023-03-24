package Operaciones;

public class Aritmetica {

    //atributos de la clase
    int a;
    int b;

    //metodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);

    }

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos( int arg1,int arg2){
       a=arg1;
       b=arg2;
       return sumarConRetorno();
    }
}
