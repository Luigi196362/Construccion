package Volumenes;

public class Esfera extends Volumen{

    public Esfera(double r) {
        this.r = r;
    }
    private double r=0;
    @Override
    public void calcular_Volumen() {
        // TODO Auto-generated method stub

        double Volumen = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        System.out.println("Volumen Esfera: "+Volumen);
        super.calcular_Volumen();
    }
}
