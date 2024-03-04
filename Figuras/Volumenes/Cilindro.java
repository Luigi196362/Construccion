package Volumenes;

public class Cilindro extends Volumen{
    
    public Cilindro(double r, double h) {
        this.r = r;
        this.h = h;
    }


    private double r=0;
    private double h=0;


    @Override
    public void calcular_Volumen() {
        // TODO Auto-generated method stub
        double Volumen= Math.PI*Math.pow(r, 2)*h;
        System.out.println("Volumen cilindro: "+Volumen);
        super.calcular_Volumen();
    }
}
