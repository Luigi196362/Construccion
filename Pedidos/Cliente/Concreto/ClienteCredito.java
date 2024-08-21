package Cliente.Concreto;
import Cliente.Cliente;
import Pedido.Pedido;
import Pedido.Concreto.PedidoCredito;

public class ClienteCredito extends Cliente 
{ 
    protected Pedido creaPedido(double importe) 
    { 
        return new PedidoCredito(importe); 
    } 
}