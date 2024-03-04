package Areas;

public class Circulo extends Area {
    private double r=0;
    public Circulo(double r) {
        this.r = r;
    }
    
    @Override
    public void calcular_Area() {
        // TODO Auto-generated method stub

        double area = Math.PI*Math.pow(r, 2);
        System.out.println("Área del circulo: " + area);
        super.calcular_Area();
    }
}
