package Areas;

public class Triangulo extends Area {
    private double Base=10;
    private double Altura=20;

    public Triangulo(double Base,double Altura){
        this.Base=Base;
        this.Altura=Altura;
    }


    @Override 

    public void calcular_Area() {
        // TODO Auto-generated method stub
        double area = (this.Base * this.Altura) / 2.0;
        System.out.println("Área del triángulo: " + area);
        super.calcular_Area();
    }
}
