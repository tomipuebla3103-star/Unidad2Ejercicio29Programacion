public  abstract class ExploradorFinanciero {
    public boolean validarRegistros(String[] registros) {

        if (registros == null || registros.length == 0) {
            System.out.println("No hay registros para exportar.");
            return false;
        }

        return true;
    }

    public abstract void exportarDatos(String[] registros);
}
