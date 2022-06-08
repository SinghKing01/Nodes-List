/*

 */
package activitat3;

public class Llista {

    private Node primer; //apuntador al primer element de la llista
    //Constructor. Crea una llista buida

    public Llista() {
        primer = null;
    }
    //Operació per afegir un element al principi de la llista

    public void insereix(int dades) {
        Node nouobjecte;
        nouobjecte = new Node(dades);
        nouobjecte.set_seguent(primer);
        primer = nouobjecte;
    }

    public Node eliminarElementDonat(Node element) throws NodoNoTrobatException, LlistaBuida {

        Node retornar = null;
        
        if (primer != null) {

            if (primer.getInfo() == element.getInfo()) {

                retornar = primer;

                if (primer.get_seguent() == null) {
                    primer = null;
                } else {
                    primer = primer.get_seguent();
                }

            } else {
                int contador = 1;
                Node aux = primer;
                while (aux.get_seguent() != null && aux.get_seguent().getInfo() != element.getInfo()) {

                    aux = aux.get_seguent();
                    contador++;
                }

                if (contador == totalElementos()) {
                    throw new NodoNoTrobatException("L'element introduït no es troba dins la llista");
                } else if (contador == totalElementos() - 1) {
                    retornar = aux.get_seguent();
                    aux.set_seguent(null);
                } else {
                    retornar = aux.get_seguent();
                    aux.set_seguent(aux.get_seguent().get_seguent());
                }

            }
        } else {
            throw new LlistaBuida("La llista esta buida");
        }

        return retornar;
    }

    public Node eliminarElementK(int k) throws NombreMajorTotalExeption, LlistaBuida {
        Node retornar = null;
        if (primer != null) {

            if (k >= totalElementos()) {
                throw new NombreMajorTotalExeption("La posició introduïda és major a la llargaria de la llista");
            } else if (k == 0) {

                retornar = primer;

                if (primer.get_seguent() == null) {
                    primer = null;
                } else {
                    primer = primer.get_seguent();
                }

            } else {

                Node aux = primer;
                int contador = 1;
                while (aux.get_seguent() != null && contador < k) {

                    aux = aux.get_seguent();
                    contador++;
                }
                retornar = aux.get_seguent();
                if (k == totalElementos() - 1) {

                    aux.set_seguent(null);
                } else {

                    aux.set_seguent(aux.get_seguent().get_seguent());
                }

            }

        } else {
            throw new LlistaBuida("La llista esta buida");
        }
        return retornar;
    }

    public String toString() {
        String s = "";

        if (primer != null) {
            Node aux = primer;

            while (aux.get_seguent() != null) {
                s += aux.getInfo() + "\n";
                
                aux = aux.get_seguent();
            }
            
            s += aux.getInfo() + "\n";

        } else {
            s = "La llista esta buida";
        }

        return s + "\nFIN";
    }

    public void crearLlistaOrdenada(Node nounode) {
        if(primer==null){                   //ARREGLAR AIXO
            primer = nounode;
            primer.set_seguent(null);
            
        } else if (primer.getInfo() < nounode.getInfo()) {
            Node aux = primer;

            while (aux.get_seguent() != null && aux.get_seguent().getInfo() < nounode.getInfo()) {

                aux = aux.get_seguent();
            }

            nounode.set_seguent(aux.get_seguent());
            aux.set_seguent(nounode);

        } else {
            Node nouobjecte;
            nouobjecte = new Node(nounode.getInfo());
            nouobjecte.set_seguent(primer);
            primer = nouobjecte;
        }
    }

    public int totalElementos() {
        Node aux = primer;
        int total = 0;

        if (aux != null) {

            while (aux.get_seguent() != null) {
                aux = aux.get_seguent();
                total++;
            }
            total++;

        }
        return total;
    }

}
