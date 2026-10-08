public class ExploradorBancoCentral extends ExploradorFinanciero{
    public void exportarDatos(String[] registros) {

        if (validarRegistros(registros)) {

            System.out.println("Iniciando exportacion al Banco Central...");

            for (int i = 0; i < registros.length; i++) {
                System.out.println("Enviando: " + registros[i]);
            }

            System.out.println("Transferencia al Banco Central finalizada.");
        }
    }
}
