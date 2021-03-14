public class Juego{

	private Heroes ejercitoHeroes[]; //creamos el arreglo heroes y bestias
	private Bestias ejercitoBestias[];

	private static int cantidad = 5;

	public Juego(){
		ejercitoHeroes = new Heroes[cantidad];
		ejercitoBestias = new Bestias[cantidad];

	}

	public void jugar(){
		System.out.println("Bienvenido al juegaso");
		this.inicializarHeroes();
		Dado.tirarDado(15,50,3);
		Dado.tirarDado(0,1000,8);
		//this.inicializarBestias();

		//this.presentarse(ejercitoHeroes);
		//this.presentarse(ejercitoBestias);
	}

	public void inicializarHeroes(){
		
		ejercitoHeroes[0] = new Elfo("a");
		ejercitoHeroes[1] = new Elfo("b");
		ejercitoHeroes[2] = new Hobbit("c");
		ejercitoHeroes[3] = new Hobbit("d");
		ejercitoHeroes[4] = new Humano("e");
	}

	public void inicializarBestias(){
		ejercitoBestias[0] = new Orco("gh");
		ejercitoBestias[1] = new Orco("fg");
		ejercitoBestias[2] = new Orco("df");
		ejercitoBestias[3] = new Trasgo("sd");
		ejercitoBestias[4] = new Trasgo("as");

	}

	public void presentarse(Personajes ejercito[]){
		if(ejercito.length > 0){
			System.out.println("presentando ejercito de " + (ejercito[0] instanceof Bestias? "Bestias" : "Heroes") +"m");

			for (int i=0; i<ejercito.length; i++){
				ejercito[i].saludar();
			}
		}

	}
}