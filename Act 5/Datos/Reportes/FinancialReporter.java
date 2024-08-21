package Reportes;

import Base.DataReporte;

public class FinancialReporter extends DataReporte{

    public FinancialReporter(String dataset) {
        super(dataset);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Generate() {
        System.out.println("Generando reporte de "+ this.Dataset+"...");
        // TODO Auto-generated method stub
        super.Generate();
    }
    
}
