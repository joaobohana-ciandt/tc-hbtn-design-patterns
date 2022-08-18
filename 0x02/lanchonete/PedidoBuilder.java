public class PedidoBuilder extends PedidoAbstractBuilder{
    private Pedido pedido = new Pedido();

    public Pedido build(){
        return pedido;
    }

    @Override
    void setLanche(TipoLanche tipo) {
        ItemPedido lanche = new ItemPedido(TipoItemPedido.LANCHE, tipo.name());
        pedido.adicionarItemDentroCaixa(lanche);
    }

    @Override
    void setBatata(TamanhoBatata tamanho) {
        ItemPedido batata = new ItemPedido(TipoItemPedido.BATATA, tamanho.name());
        pedido.adicionarItemDentroCaixa(batata);
    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        ItemPedido brinde = new ItemPedido(TipoItemPedido.BRINDE, tipo.name());
        pedido.adicionarItemDentroCaixa(brinde);
    }

    @Override
    void setBebida(TipoBebida tipo) {
        ItemPedido bebida = new ItemPedido(TipoItemPedido.BEBIDA, tipo.name());
        pedido.adicionarItemForaCaixa(bebida);
    }
}
