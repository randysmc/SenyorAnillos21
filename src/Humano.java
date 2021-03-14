public class Humano extends Heroes{

	public Humano(String nombre){
		super(180, 75, nombre);
	}

	@Override
	public void saludar(){
		System.out.println("soy el mamalon, todos me la pelan, mi nombre es: " +this.nombre);
	}
}