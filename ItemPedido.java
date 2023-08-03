
package pedido;


public class ItemPedido {
    public Produto prod;
    public int qtde;
    
    
    public ItemPedido(int qtde){
        this.qtde = qtde;
    }

    public ItemPedido() {
    }
    public void print(){
        System.out.println("****** ItemPedido ******");
        System.out.println("Quantidade: "+this.qtde);
        if(this.prod != null)
            System.out.println("Produto \n Codigo: "+ this.prod.getCodigo()+"\n Valor: "+ this.prod.getValor()+"\n Descrição: "+ this.prod.getDescr());
        else
            System.out.println("Nao existe produto associado no itemPedido");
    }
    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
}
