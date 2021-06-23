package cursoBr.abstracao;

final class Quadrado extends Geometria{
    Quadrado(double lado){
        super();
    }

    public Quadrado() {

    }

    @Override
    public double area(){
        return 200;
    }

    @Override
    public double perimetro(){
        return 0;
    }

}
