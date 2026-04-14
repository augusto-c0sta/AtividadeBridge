package relatorio;

import java.util.List;

import bridge.Exportador;
import model.ItemRelatorio;

public class RelatorioVendas extends Relatorio {

    public RelatorioVendas(Exportador exportador) {
        super(exportador);
    }

    @Override
    public void gerar(boolean detalhado) {
        String titulo = "Relatório de Vendas";

        List<ItemRelatorio> filtrados = filtrarItensDetalhados(detalhado);
        double total = calcularTotal(filtrados);

        exportador.exportar(titulo, filtrados, total);
    }
}