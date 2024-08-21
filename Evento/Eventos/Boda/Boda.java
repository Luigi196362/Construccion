package Eventos.Boda;

import Base.Eventos;
import Base.Finanzas;
import Base.Logistica;
import Base.Marketing;
import Base.Planificador;

public class Boda extends Eventos{
    private Finanzas finanzas;
    private Logistica logistica;
    private Marketing marketing;
    private Planificador planificador;

public Boda(String nombre, int fecha) {
    super(nombre, fecha);
    this.finanzas = new FinanzasBoda();
    this.logistica = new LogisticaBoda();
    this.marketing= new MarketingBoda();
    this.planificador=new PlanificadorBoda();
}

public void organizar_boda(){
    finanzas.manejar_finanzas();
    logistica.organizar_logistica();
    marketing.gestionar_marketing();
    planificador.planificar_evento();
}

}
