public class Orco extends Bestias{

	public Orco (String nombre){
		super(300, 45, nombre);
	}

	@Override
	//sobre escribimos el metodo saludar de la clase personaje
	public void saludar(){
		System.out.println("Soy un orco y todos me la pelan, me llamon: " +this.nombre);
	}
}