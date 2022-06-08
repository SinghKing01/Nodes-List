/*

 */
package activitat3;

public class TratamientoErrores extends Exception {
}


class NodoNoTrobatException extends Exception {
    public NodoNoTrobatException(String s) {
        super(s);
    }
}

class NombreMajorTotalExeption extends Exception {
    public NombreMajorTotalExeption(String s) {
        super(s);
    }
}

class LlistaBuida extends Exception {
    public LlistaBuida(String s) {
        super(s);
    }
}
