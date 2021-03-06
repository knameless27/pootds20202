/*Implementa la clase Bicicleta , que tiene tres atributos,
velocidadActual , platoActual y piñonActual ,
de tipo entero y cuatro métodos acelerar(),
frenar(), cambiarPlato (int plato), y
cambiarPiñon (int piñon), donde el primero
dobla la velocidad actual, el segundo reduce a la mitad la
velocidad actual, y el tercero y cuarto ajustan el plato y el
piñón actual respectivamente según los parámetros
recibidos. La clase debe tener además un constructor que
inicialice todos los atributos.
Crea dos objetos de la clase bicicleta: miBicicleta y
tuBicicleta
 */
package ejercicioPOO;

public class Bicicleta {
    //Atributo de la clase
    private int velocidadActual;
    private int platoActual;
    private int piñonActual;

    //Constructor
    public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }
    //Metodos get y set

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
/*
En la clase bicicletas, en los métodos setPlatoActual y set PiñonActual, 
programar su compartamiento de la siguiente manera:
- El atributo platoActual solamente puede tener estos valores: 
42, 34 o 24.
- El atributo piñonActual solamente puede tener estos valores: 
11, 13, 15, 18, 21, 24, 28, 32, 36 o 40.   
*/
    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }
    
    
    //Métodos de la clase  
    public void acelerar(){
        velocidadActual=velocidadActual*2;
    }
    public void frenar(){
        velocidadActual=velocidadActual/2;
    }
    public void cambiarPlato(int plato){
        platoActual=plato;
    }
    public void cambiarPiñon(int piñon){
        piñonActual=piñon;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "velocidadActual=" + velocidadActual + ", platoActual=" + platoActual + ", pi\u00f1onActual=" + piñonActual + '}';
    }
    
    
}
