package cursoBr.abstracao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Geometria");

        Circulo circulo = new Circulo();
        System.out.println("Circulo");
        System.out.print("Area: " + circulo.area());
        System.out.println("\nPerimetro: " + circulo.perimetro());

        System.out.println("-------------------------");
        Quadrado quadrado = new Quadrado();
        System.out.println("Quadrado");
        System.out.println("Area: " + quadrado.area());
        System.out.print("Perimetro: " + quadrado.perimetro());
    }
}
