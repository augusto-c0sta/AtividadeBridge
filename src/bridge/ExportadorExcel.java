package bridge;

import java.util.List;
import model.ItemRelatorio;

public class ExportadorExcel implements Exportador {

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO EXCEL ===");
        System.out.println("[" + titulo + "]");
        System.out.println("descricao;valor");

        for (ItemRelatorio item : itens) {
            System.out.println(item.getDescricao() + ";" + item.getValor());
        }

        System.out.println("TOTAL; " + total);
        System.out.println("======================");
    }
}