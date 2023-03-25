package Caja;

public class Caja {

    //atributos de la clase
    int ancho = 0;
    int alto = 0;
    int profundo = 0;

    // constructor vacio
    public Caja() {
        System.out.println("ejecutando constructor");
    }

    // constructor con arg
    public Caja(int arg1, int arg2, int arg3) {
        this.ancho = arg1;
        this.alto = arg2;
        this.profundo = arg3;
        System.out.println("ejecutando constructor arg");
    }

    //metodo de volumen
    public void volumen() {
        int resultado = ancho * alto * profundo;
        System.out.println("resultado = " + resultado);
    }


    public int volumenConArgumentos(int arg1, int arg2, int arg3) {
        ancho = arg1;
        alto = arg2;
        profundo = arg3;
        return ancho * alto * profundo;
        
    } 
}
