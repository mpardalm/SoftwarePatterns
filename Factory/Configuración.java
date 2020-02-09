/**
 * Configuración
 */
public class Configuración {

    public static final String SQL_SERVER = "1";
    public static final String ORACLE = "2";
    public static final String MY_SQL = "3";

    public BaseDatosGenerica crearConexion(String baseDatos) {
        BaseDatosGenerica baseDatosGenerica = null;

        switch (baseDatos) {
            case "1":
                baseDatosGenerica = new BaseDatosSQLServer();
            break;
            case "2":
                baseDatosGenerica = new BaseDatosOracle();
            break;
            case "3":
                baseDatosGenerica = new BaseDatosMySQL();
            break;
            default:
            System.out.println("ERROR, número no válido");
            break;
        }
        return baseDatosGenerica;
    }
}