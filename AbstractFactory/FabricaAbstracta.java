/**
 * FabricaAbstracta
 */
public interface FabricaAbstracta {
    BaseDatosGenerica getDB (String dataBaseName);
    IConexionRest getREST (String area);
}