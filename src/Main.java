import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("===== ARSENAL =====");
        Arma a1 = new Arma();
        Arma a2 = new Arma("Mjolnir");
        Arma a3 = new Arma("Escudo", 40);
        a1.mostrar();
        a2.mostrar();
        a3.mostrar();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del arma: ");
        String nombre = sc.nextLine();
        System.out.print("Tipo: ");
        String tipo = sc.nextLine();
        System.out.print("Dano (prueba -20 o 250): ");
        int dano = sc.nextInt();
        Arma a4 = new Arma(nombre, tipo, dano);
        a4.mostrar();
        sc.close();
    }
}
