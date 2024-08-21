package Eventos.Concierto;

import Base.Finanzas;

public class FinanzasConcierto implements Finanzas{
    @Override
    public void manejar_finanzas() {
        System.out.println("Finanzas concierto");
        // TODO Auto-generated method stub
        Finanzas.super.manejar_finanzas();
    }
    
}
