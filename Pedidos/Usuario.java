import Cliente.Cliente;
import Cliente.Concreto.ClienteContado;
import Cliente.Concreto.ClienteCredito;

public class Usuario 
{ 
    public static void main(String[] args) 
    { 
        Cliente cliente; 
        cliente = new ClienteContado(); 
        cliente.nuevoPedido(2000.0); 
        cliente.nuevoPedido(10000.0); 
        cliente = new ClienteCredito(); 
        cliente.nuevoPedido(2000.0); 
        cliente.nuevoPedido(10000.0); 
    } 
}