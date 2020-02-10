package AbstractFactory;

import Factory.BaseDatosGenerica;

/**
 * AppAbstractFactory
 */
public class AppAbstractFactory {
    public static void main(String[] args) {
        FabricaAbstracta fabricaAbs = new ConexionBDFabrica();
        BaseDatosGenerica baseDatosGenerica = fabricaAbs.getDB("1");

        System.out.println(baseDatosGenerica.cadenaConexion());

        FabricaAbstracta fAbstracta = new ConexionRESTFabrica();
        IConexionRest iConexionRest = fAbstracta.getREST("COMPRAS");

        iConexionRest.leerURL("google");
    }
}