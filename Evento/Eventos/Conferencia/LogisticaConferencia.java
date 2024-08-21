package Eventos.Conferencia;

import Base.Logistica;

public class LogisticaConferencia implements Logistica {

    @Override
    public void organizar_logistica() {
        // TODO Auto-generated method stub
        System.out.println("Logistica Conferencia");
        Logistica.super.organizar_logistica();
    }
    
}
