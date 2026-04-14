package relatorio;

import java.util.ArrayList;
import java.util.List;

import bridge.Exportador;
import model.ItemRelatorio;

public abstract class Relatorio {

    protected Exportador exportador;
    protected List<ItemRelatorio> itens;

    public Relatorio(Exportador exportador) {
        this.exportador = exportador;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemRelatorio item) {
        itens.add(item);
    }

    protected double calcularTotal(List<ItemRelatorio> lista) {
        double total = 0;
        for (ItemRelatorio item : lista) {
            total += item.getValor();
        }
        return total;
    }

    protected List<ItemRelatorio> filtrarItensDetalhados(boolean detalhado) {
        List<ItemRelatorio> filtrados = new ArrayList<>();

        for (ItemRelatorio item : itens) {
            if (detalhado || item.getValor() >= 100) {
                filtrados.add(item);
            }
        }

        return filtrados;
    }

    public abstract void gerar(boolean detalhado);
}