package Eventos.Concierto;

import Base.Marketing;

public class MarketingConcierto implements Marketing{
    @Override
    public void gestionar_marketing() {
        System.out.println("Marketing concierto");
        // TODO Auto-generated method stub
        Marketing.super.gestionar_marketing();
    }
    
}
