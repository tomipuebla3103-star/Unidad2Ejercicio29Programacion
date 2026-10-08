//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String[] registros = {
            "Balance Enero",
            "Balance Febrero",
            "Balance Marzo"
    };

    ExploradorFinanciero banco = new ExploradorBancoCentral();
    ExploradorFinanciero agencia = new ExportadorAgenciaTributaria();

    System.out.println("=== Banco Central ===");
    banco.exportarDatos(registros);

    System.out.println();

    System.out.println("=== Agencia Tributaria ===");
    agencia.exportarDatos(registros);

    System.out.println();

    System.out.println("=== Prueba con lista vacia ===");

    String[] registrosVacios = {};

    banco.exportarDatos(registrosVacios);
}
