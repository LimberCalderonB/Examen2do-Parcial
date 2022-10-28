public class Items {
  String item;
  String nombreItem;
  int cantidadSolicitada;
  Double mediadaItem;
  Double valorUnitario;
  Double valorTotal;

    public Items(String item, String nombreItem, int cantidadSolicitada, Double mediadaItem, Double valorUnitario, Double valorTotal) {
        this.item = item;
        this.nombreItem = nombreItem;
        this.cantidadSolicitada = cantidadSolicitada;
        this.mediadaItem = mediadaItem;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }
}
