/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat3;

public class Node {

    private int info; //informació del node
    private Node seguent; //apuntador al següent node de la llista
//Constructor. Crea un nou node

    public Node(int dades) {
        info = dades;
        seguent = null;
    }
//Operació per enllaçar un node amb un de referenciat per apuntador

    public void set_seguent(Node apuntador) {
        seguent = apuntador;
    }
    
    public Node get_seguent(){
        return seguent;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

}
