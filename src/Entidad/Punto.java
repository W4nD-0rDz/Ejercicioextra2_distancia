
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Wendy
 */
public class Punto {
    
//ATTRIBUTE    
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
// CONSTRUCTOR
    
    public Punto(){
    }

    public Punto(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la coordenada x del primer punto");
        setX1(leer.nextInt());
        System.out.println("Ingrese la coordenada y del primer punto");
        setY1(leer.nextInt());
        System.out.println("Ingrese la coordenada x del segundo punto");
        setX2(leer.nextInt());
        System.out.println("Ingrese la coordenada y del segundo punto");
        setY2(leer.nextInt());
    }
    
    public double distancia(){
        return Math.round((Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)))*100.0d)/100.0d;
    }

    public void imprimir(){
        System.out.println("Punto1 (" + x1 + "," + y1 +") \nPunto2 (" + getX2() + "," + getY2() + ")"  );
        System.out.println("La distancia entre los dos puntos es " + distancia());
    }  
    
}
