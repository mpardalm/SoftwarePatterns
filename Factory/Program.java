package Factory;

/**
 * Program
 */
public class Program {
    public static void main(String[] args) {
        Configuración configuración = new Configuración();
        BaseDatosGenerica baseDatosGenerica = configuración.crearConexion(Configuración.SQL_SERVER);
        System.out.println(baseDatosGenerica.cadenaConexion());
    }
}