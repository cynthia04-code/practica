import interfaces.arregloInterface.ArreglosInterface;
import modulos.Empleado;

public class ManejadorLista implements ArreglosInterface {
    @Override
    public Empleado[] regresarReversa(Empleado[] arreglo) {
        if (arreglo == null) throw new IllegalArgumentException("Arreglo nulo");
        if (arreglo.length == 0) throw new IllegalStateException("Arreglo vacío");
        
        Empleado[] reversa = new Empleado[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            reversa[i] = arreglo[arreglo.length - 1 - i];
        }
        return reversa;
    }

    @Override
    public Empleado[] agregarElemento(Empleado[] arreglo, Empleado empleado) {
        if (arreglo == null) throw new IllegalArgumentException("Arreglo nulo");
        if (empleado == null) throw new IllegalArgumentException("Empleado nulo");

        Empleado[] nuevoArreglo = new Empleado[arreglo.length + 1];
        for (int i = 0; i < arreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i];
        }
        nuevoArreglo[arreglo.length] = empleado;
        return nuevoArreglo;
    }

    @Override
    public Empleado buscarElemento(Empleado[] arreglo, int posicion) {
        if (arreglo == null) throw new IllegalArgumentException("Arreglo nulo");
        if (posicion < 0 || posicion >= arreglo.length) throw new IndexOutOfBoundsException("Posición inválida: " + posicion);
        return arreglo[posicion];
    }

    @Override
    public Empleado[] eliminarElemento(Empleado[] arreglo, int posicion) {
        if (arreglo == null) throw new IllegalArgumentException("Arreglo nulo");
        if (arreglo.length == 0) throw new IllegalStateException("Arreglo vacío");
        if (posicion < 0 || posicion >= arreglo.length) throw new IndexOutOfBoundsException("Posición inválida: " + posicion);

        Empleado[] nuevoArreglo = new Empleado[arreglo.length - 1];
        int nuevoIndice = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (i != posicion) {
                nuevoArreglo[nuevoIndice] = arreglo[i];
                nuevoIndice++;
            }
        }
        return nuevoArreglo;
    }
}
