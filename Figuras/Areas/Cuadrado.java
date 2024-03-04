package Areas;


public class Cuadrado extends Area {
    private double l=0;
    public Cuadrado(double l) {
        this.l = l;
    }
    
    @Override
    public void calcular_Area() {
        // TODO Auto-generated method stub
        double area=l*l;
        System.out.println("Área del cuadrado: " + area);
        super.calcular_Area();
    }
}
