package interfaces.arregloInterface;
import modulos.Empleado;

public interface ArreglosInterface {
    Empleado[] regresarReversa(Empleado[] arreglo)
        throws IllegalArgumentException, IllegalStateException;

    Empleado[] agregarElemento(Empleado[] arreglo, Empleado empleado)
        throws IllegalArgumentException;

    Empleado buscarElemento(Empleado[] arreglo, int posicion)
        throws IllegalArgumentException, IndexOutOfBoundsException;

    Empleado[] eliminarElemento(Empleado[] arreglo, int posicion)
        throws IllegalArgumentException, IndexOutOfBoundsException;
}
