package bridge;

import java.util.List;
import model.ItemRelatorio;

public class ExportadorPDF implements Exportador {

    @Override
    public void exportar(String titulo, List<ItemRelatorio> itens, double total) {
        System.out.println("=== EXPORTANDO PDF ===");
        System.out.println("Título: " + titulo);
        System.out.println("Itens:");

        for (ItemRelatorio item : itens) {
            System.out.println("- " + item.getDescricao() + " | R$ " + item.getValor());
        }

        System.out.println("Total: R$ " + total);
        System.out.println("======================");
    }
}