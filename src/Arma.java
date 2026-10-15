public class Arma {
    private String nombre;
    private String tipo;
    private int dano;

    // Constructor principal: el unico que asigna y valida
    public Arma(String nombre, String tipo, int dano) {
        this.nombre = nombre;
        this.tipo = tipo;
        if (dano < 0) {
            this.dano = 0;
        } else if (dano > 100) {
            this.dano = 100;
        } else {
            this.dano = dano;
        }
    }
    // Sobrecarga: cada version delega con this(...) en el principal
    public Arma() {
        this("Sin nombre", "Cuerpo a cuerpo", 0);
    }
    public Arma(String nombre) {
        this(nombre, "Cuerpo a cuerpo", 10);
    }
    public Arma(String nombre, int dano) {
        this(nombre, "Cuerpo a cuerpo", dano);
    }
    public void mostrar() {
        System.out.println(nombre + " [" + tipo + "] dano " + dano);
    }
}