import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public Pedido() {
        this.itensForaCaixa = new HashSet<>();
        this.itensDentroCaixa = new HashSet<>();
    }

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder("\tFora da caixa:\n");
        for(ItemPedido itemPedido : itensForaCaixa){
            retorno.append("\t\t- ").append(itemPedido.getTipo()).append(" ").append(itemPedido.getNome()).append("\n");
        }

        retorno.append("\tDentro da caixa:\n");
        for(ItemPedido itemPedido : itensDentroCaixa){
            retorno.append("\t\t- ").append(itemPedido.getTipo()).append(" ").append(itemPedido.getNome()).append("\n");
        }

        return retorno.toString();
    }
}
