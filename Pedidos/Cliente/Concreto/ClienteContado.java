package Cliente.Concreto;
import Cliente.Cliente;
import Pedido.Pedido;
import Pedido.Concreto.PedidoContado;
public class ClienteContado extends Cliente 
{ 
    protected Pedido creaPedido(double importe) 
    { 
        return new PedidoContado(importe); 
    } 
}
