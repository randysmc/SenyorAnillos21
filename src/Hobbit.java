public class Hobbit extends Heroes{

    public Hobbit(String nombre){
        super(250,60,nombre);
    }
    @Override
    public void saludar(){
        System.out.println("Hola soy un Hobbit y me llamo " + this.nombre);

    }

}