public class Personajes {

    protected int vida;
    protected int ataque;
    protected int armadura;
    protected String nombre;
    protected boolean esHeroe;

    public Personajes(int vida, int ataque, int armadura, String nombre, boolean esHeroe) {
        this.vida = vida;
        this.ataque = ataque;
        this.armadura = armadura;
        this.nombre = nombre;
        this.esHeroe = esHeroe;
    }

    public void saludar(){
        System.out.println("Hola soy un heroe " +this.nombre);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    /*public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/

    public boolean isEsHeroe() {
        return esHeroe;
    }

    public void setEsHeroe(boolean esHeroe) {
        this.esHeroe = esHeroe;
    }
}