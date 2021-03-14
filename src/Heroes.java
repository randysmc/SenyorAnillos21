public class Heroes extends Personajes {

    private static int ataqueMaximo =100;

    public Heroes(int vida, int armadura, String nombre ) {
        super(vida, ataqueMaximo, armadura, nombre,true);
    }

    @Override
    public void saludar(){
    	System.out.println("Hola soy un heroe " +this.nombre);
    }
}