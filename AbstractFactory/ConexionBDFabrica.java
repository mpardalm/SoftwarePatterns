package AbstractFactory;

import Factory.BaseDatosGenerica;
import Factory.BaseDatosMySQL;
import Factory.BaseDatosOracle;
import Factory.BaseDatosSQLServer;

/**
 * ConexionBDFabrica
 */
public class ConexionBDFabrica implements FabricaAbstracta{
    @Override
    public BaseDatosGenerica getDB (String baseDatos) {
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

    @Override
    public IConexionRest getREST (String area) {
        return null;
    }
    
}