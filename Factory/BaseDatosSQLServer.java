/**
 * BaseDatosSQLServer
 */
public class BaseDatosSQLServer implements BaseDatosGenerica {
    
    @Override
    public String cadenaConexion(){
        return "Conexión a SQL Server";
    }
}