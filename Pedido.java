package pedido;

public class Pedido {

    private ItemPedido[] itens;
    private double valorTotal;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
        itens = new ItemPedido[1000];
        
        for (int i = 0; i < 1000; i++) {
            itens[0] = new ItemPedido(5);
        }
    }

    public Pedido() {
    }
    public void print(){
      System.out.println("******* Pedido *******");
      System.out.println("Valor total: " +this.valorTotal);
      for(ItemPedido pedido1 : itens )
        System.out.println("Quantidade: " + pedido1.getQtde());
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void adicionarItem(ItemPedido[] itens){
        for (int i = 0; i <= 1000; i++) {
            if (i <= 1000){
                int cont = 0;
                cont++;
                System.out.println("Item: " + itens[i]);
            } else {
                System.out.println("itens inválidos!");
            }    
        }
    }
    
}
