package Reportes;

import Base.DataReporte;

public class SalesReporter extends DataReporte{

    public SalesReporter(String dataset) {
        super(dataset);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Generate() {
        // TODO Auto-generated method stub
        System.out.println("Generando reporte de "+ this.Dataset+"...");
        super.Generate();
    }
    
}
