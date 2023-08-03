
package pedido;

public class Produto {
    public int codigo;
    public double valor;
    public String descr;
    
    
    public Produto(int codigo , double valor , String descr ){
        this.codigo = codigo;
        this.valor = valor;
        this.descr = descr;
    }

    public Produto() {
    }
    public void print(){
        System.out.println("*********** Produto **************");
        System.out.println("Codigo: "+ this.codigo);
        System.out.println("Valor: "+ this.valor);
        System.out.println("Descricao: "+ this.descr);
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    
    
}