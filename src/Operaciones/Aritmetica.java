package Operaciones;

public class Aritmetica {

    //atributos de la clase
    int a;
    int b;

    //constructor vacio
    public Aritmetica() {
        System.out.println("ejecutando constructor");
    }
   //constructor con arg
    public Aritmetica( int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("ejecutando constructor con arg");
    }
    //metodos
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);

    }

    public int sumarConRetorno() {
        return a + b;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        return sumarConRetorno();
    }
}
