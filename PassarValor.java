
package pedido;


public class PassarValor {
    
    public static void main(String[] args) {
        Produto pro1 = new Produto(50, 25.00, "caderno");
        ItemPedido pedido1 = new ItemPedido(7);
        ItemPedido pedido2 = new ItemPedido(5);
        ItemPedido pedido3 = new ItemPedido(2);
        Pedido ped = new Pedido( 12.45);
        Pedido ped1 = new Pedido(23.43);
        
        pedido1.setProd(pro1);
        pedido2.setProd(pro1);
        ped.setItens(new ItemPedido[]{pedido1,pedido2});
        System.out.println("\n");
        
        //System.out.println("Item: " + ped1.adicionarItem();
        //ped1.adicionarItem(new ItemPedido[]{pedido3});
        pro1.print();
        System.out.println("\n");
        pedido1.print();
        System.out.println("\n");
        pedido2.print();
        System.out.println();
        ped.print();
        System.out.println("\n");
        
        
     
        
    }
    
    
    
}
