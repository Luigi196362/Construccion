package Eventos.Conferencia;

import Base.Eventos;
import Base.Finanzas;
import Base.Logistica;
import Base.Marketing;
import Base.Planificador;

public class Conferencia extends Eventos  {
private Finanzas finanzas;
private Logistica logistica;
private Marketing marketing;
private Planificador planificador; 

    public Conferencia(String nombre, int fecha) {
        super(nombre, fecha);
        this.finanzas=new FinanzasConferencia();
        this.logistica=new LogisticaConferencia();
        this.marketing= new MarketingConferencia();
        this.planificador=new PlanificadorConferencia();
        //TODO Auto-generated constructor stub
    }

    public void organizar_conferencia(){
        finanzas.manejar_finanzas();
        logistica.organizar_logistica();
        marketing.gestionar_marketing();
        planificador.planificar_evento();
    }
    
}
