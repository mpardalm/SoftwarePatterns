package AbstractFactory;

import Factory.BaseDatosGenerica;

/**
 * FabricaAbstracta
 */
public interface FabricaAbstracta {
    BaseDatosGenerica getDB (String dataBaseName);
    IConexionRest getREST (String area);
}