package fatec.poo.model;

/* 
@authors Carlos,
@authors Gustavo,
@authors Nataly;
*/

public class ItemPedido {
    private int sequencia;
    private double qtdeVendida;
    private Pedido pedido;
    private Produto produto;
    
    public ItemPedido(int sequencia, double qtdeVendida, Produto produto) {
        this.sequencia = sequencia;
        this.qtdeVendida = qtdeVendida;
        this.produto = produto;
    }
    
    public void setQtdeVendida(double qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public int getSequencia() {
        return sequencia;
    }

    public double getQtdeVendida() {
        return qtdeVendida;
    }
}
