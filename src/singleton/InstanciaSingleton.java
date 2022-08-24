package singleton;

/**
 *
 * @author Miguel Castro
 */
public class InstanciaSingleton {

    private static InstanciaSingleton instancia;

    private InstanciaSingleton() {

        System.out.println("instância única...");
    }

    public static InstanciaSingleton getInstancia() {

        if (instancia == null) {
            instancia = new InstanciaSingleton();
        }

        return instancia;
    }
}
