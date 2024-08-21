package Eventos.Conferencia;

import Base.Marketing;

public class MarketingConferencia implements Marketing {

    @Override
    public void gestionar_marketing() {
        // TODO Auto-generated method stub
        System.out.println("Marketing Conferencia");
        Marketing.super.gestionar_marketing();
    }
    
    
}
