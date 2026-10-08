public class ExportadorAgenciaTributaria extends ExploradorFinanciero{
    public void exportarDatos(String[] registros) {

        if (validarRegistros(registros)) {

            System.out.println("Iniciando exportacion a la Agencia Tributaria...");

            for (int i = 0; i < registros.length; i++) {
                System.out.println("Enviando: " + registros[i]);
            }

            System.out.println("Transferencia a la Agencia Tributaria finalizada.");
        }
    }
}
