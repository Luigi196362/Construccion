package Base;

public abstract class Eventos {
    private String nombre;
    private int fecha;

    public Eventos(String nombre, int fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFecha() {
        return fecha;
    }
    
}
