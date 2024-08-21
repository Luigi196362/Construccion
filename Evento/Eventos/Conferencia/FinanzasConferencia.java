package Eventos.Conferencia;

import Base.Finanzas;

public class FinanzasConferencia implements Finanzas {

    @Override
    public void manejar_finanzas() {
        // TODO Auto-generated method stub
        System.out.println("Finanzas Conferencia"); 
        Finanzas.super.manejar_finanzas();
    }
    
}
