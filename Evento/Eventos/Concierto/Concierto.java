package Eventos.Concierto;

import Base.Eventos;
import Base.Finanzas;
import Base.Logistica;
import Base.Marketing;
import Base.Planificador;

public class Concierto extends Eventos{
    private Finanzas finanzas;
    private Logistica logistica;
    private Marketing marketing;
    private Planificador planificador; 

    public Concierto(String nombre, int fecha) {
        super(nombre, fecha);
        this.finanzas= new FinanzasConcierto();
        this.logistica=new LogisticaConcierto();
        this.marketing = new MarketingConcierto(); 
        this.planificador= new PlanificadorConcierto();
        //TODO Auto-generated constructor stub
    }

    public void organizar_concierto(){
        finanzas.manejar_finanzas();
        logistica.organizar_logistica();
        marketing.gestionar_marketing();
        planificador.planificar_evento();

    }
}
