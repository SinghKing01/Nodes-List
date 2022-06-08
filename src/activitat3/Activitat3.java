package activitat3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Activitat3 extends JFrame {

    private JFrame jF;

    private Llista nodes;
    private Llista lliures;

    private static JMenuBar menuBar;
    private static JMenu jMInserir;
    private static JMenu jMEliminarValor;
    private static JMenu jMEliminarK;
    private static JMenu jMLlistat;

    private static JPanel jPInserir;
    private static JPanel jPEliminarValor;
    private static JPanel jPEliminarK;
    private static JPanel jPLlistat;

    private static JLabel jLInserir;
    private static JLabel jLElimValor;
    private static JLabel jLElimK;
    private static JLabel jLLlistaNode;
    private static JLabel jLLlistaLliures;
    private static JLabel errorLabel1;
    private static JLabel errorLabel2;

    private static JTextField jTFInserir;
    private static JTextField jTFElimValor;
    private static JTextField jTFElimK;
    private static JTextArea jTALlistaNodes;
    private static JTextArea jTALlistaLliures;

    private static JButton jBInserir;
    private static JButton jBElimValor;
    private static JButton jBElimK;

    public Activitat3() {
        nodes = new Llista();
        lliures = new Llista();
        initComponents();
    }

    public static void main(String[] args) {

        Activitat3 a3 = new Activitat3();
        // initComponents();
    }

    public void initComponents() {

        jF = new JFrame("Llistes");
        jF.setResizable(false);

        Font fuente = new Font("Ariel", 1, 12);
// <editor-fold defaultstate="collapsed" desc="Inicialització Menu">
        menuBar = new JMenuBar();
        jMInserir = new JMenu("Inserir");
        jMEliminarValor = new JMenu("Elimina per valor");
        jMEliminarK = new JMenu("Eliminar K-node");
        jMLlistat = new JMenu("Llistes");
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Inicialització JPanels">
        jPInserir = new JPanel(null);
        jPEliminarValor = new JPanel(null);
        jPEliminarK = new JPanel(null);
        jPLlistat = new JPanel(null);
        // </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Inicialització JLabels">
        jLInserir = new JLabel("Introdueix dada del node a introduir:");
        jLElimValor = new JLabel("Introdueix dada del node a eliminar:");
        jLElimK = new JLabel("Introdueix número del node (k)");
        jLLlistaNode = new JLabel("Llista de nodes:");
        jLLlistaLliures = new JLabel("Llista de lliures:");
        errorLabel1 = new JLabel();
        errorLabel2 = new JLabel();
        errorLabel1.setFont(fuente);
        errorLabel2.setFont(fuente);
        errorLabel1.setForeground(Color.red);
        errorLabel2.setForeground(Color.red);
        errorLabel1.setVisible(false);
        errorLabel2.setVisible(false);
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Inicialització JTextField">
        jTFInserir = new JTextField("");
        jTFElimValor = new JTextField("");
        jTFElimK = new JTextField("");
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Inicialització JTextAreas">
        jTALlistaNodes = new JTextArea("");
        jTALlistaLliures = new JTextArea("");
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Inicialització JButtons">
        jBInserir = new JButton("Aceptar");
        jBElimValor = new JButton("Aceptar");
        jBElimK = new JButton("Aceptar");
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Tamanys i Layout">
        jF.setSize(600, 500);
        jF.getContentPane().setLayout(null);
        jF.setLocationRelativeTo(null);
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Crear Menu">
        jF.setJMenuBar(menuBar);

        menuBar.add(jMInserir);
        jMInserir.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

                clearFields();
                jPInserir.setVisible(true);
                jPEliminarValor.setVisible(false);
                jPEliminarK.setVisible(false);
                jPLlistat.setVisible(false);
                System.out.println("a");
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        menuBar.add(jMEliminarValor);
        jMEliminarValor.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

                clearFields();
                jPInserir.setVisible(false);
                jPEliminarValor.setVisible(true);
                jPEliminarK.setVisible(false);
                jPLlistat.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        menuBar.add(jMEliminarK);
        jMEliminarK.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

                clearFields();
                jPInserir.setVisible(false);
                jPEliminarValor.setVisible(false);
                jPEliminarK.setVisible(true);
                jPLlistat.setVisible(false);

            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });

        menuBar.add(jMLlistat);
        jMLlistat.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {

                jPInserir.setVisible(false);
                jPEliminarValor.setVisible(false);
                jPEliminarK.setVisible(false);
                jPLlistat.setVisible(true);
                jTALlistaNodes.setText(nodes.toString());
                jTALlistaLliures.setText(lliures.toString());

            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {
            }
        });
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Crear Crear nou node">
        jPInserir.setSize(600, 500);
        jLInserir.setBounds(20, 20, 250, 50);
        jTFInserir.setBounds(300, 20, 250, 50);
        jBInserir.setBounds(250, 100, 100, 50);

        jBInserir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    nodes.crearLlistaOrdenada(new Node(Integer.parseInt(jTFInserir.getText())));
                } catch (NumberFormatException nfe) {
                    System.out.println("ERROR");
                }
                jTFInserir.setText("");
            }

        });

        jPInserir.add(jLInserir);
        jPInserir.add(jTFInserir);
        jPInserir.add(jBInserir);
        jF.add(jPInserir);

// </editor-fold>      
// <editor-fold defaultstate="collapsed" desc="Crear Eliminar per Valor">
        jPEliminarValor.setSize(600, 500);

        jLElimValor.setBounds(20, 20, 250, 50);
        jPEliminarValor.add(jLElimValor);
        jTFElimValor.setBounds(300, 20, 250, 50);
        jPEliminarValor.add(jTFElimValor);
        jBElimValor.setBounds(250, 100, 100, 50);
        jPEliminarValor.add(jBElimValor);

        errorLabel1.setBounds(310, 50, 250, 50);
        jPEliminarValor.add(errorLabel1);

        jBElimValor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    errorLabel1.setVisible(false);
                    int dades = Integer.parseInt(jTFElimValor.getText());
                    lliures.crearLlistaOrdenada(nodes.eliminarElementDonat(new Node(dades)));
                } catch (NodoNoTrobatException ex) {
                    errorLabel1.setText("Error: Node no trobat.");
                    errorLabel1.setVisible(true);
                } catch (LlistaBuida ex) {
                    errorLabel1.setText("Error: Llista buida.");
                    errorLabel1.setVisible(true);
                } catch (NumberFormatException nfe) {
                    System.out.println("ERROR");
                }
                jTFElimValor.setText("");
            }

        });

        jF.add(jPEliminarValor);
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Crear Eliminar per posició">
        jPEliminarK.setSize(600, 500);

        jLElimK.setBounds(20, 20, 250, 50);
        jPEliminarK.add(jLElimK);
        jTFElimK.setBounds(300, 20, 250, 50);
        jPEliminarK.add(jTFElimK);
        jBElimK.setBounds(250, 100, 100, 50);
        jPEliminarK.add(jBElimK);

        errorLabel2.setBounds(310, 50, 250, 50);
        jPEliminarK.add(errorLabel2);

        jBElimK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    errorLabel2.setVisible(false);
                    int dades = Integer.parseInt(jTFElimK.getText());
                    lliures.crearLlistaOrdenada(nodes.eliminarElementK(dades));
                } catch (NombreMajorTotalExeption ex) {
                    errorLabel2.setText("Error: K > Nombre nodes.");
                    errorLabel2.setVisible(true);
                } catch (LlistaBuida ex) {
                    errorLabel2.setText("Error: Llista buida.");
                    errorLabel2.setVisible(true);
                } catch (NumberFormatException nfe) {
                    System.out.println("ERROR");
                }

                jTFElimK.setText("");
            }

        });

        jF.add(jPEliminarK);
// </editor-fold>
// <editor-fold defaultstate="collapsed" desc="Crear Mostrar llistes">
        jPLlistat.setSize(600, 500);

        jLLlistaNode.setBounds(15, 5, 250, 50);
        jLLlistaLliures.setBounds(330, 5, 250, 50);
        jPLlistat.add(jLLlistaNode);
        jPLlistat.add(jLLlistaLliures);

        jTALlistaNodes.setBounds(15, 40, 250, 300);
        jTALlistaNodes.setEditable(false);
        jPLlistat.add(jTALlistaNodes);
        jTALlistaLliures.setBounds(330, 40, 250, 300);
        jTALlistaLliures.setEditable(false);
        jPLlistat.add(jTALlistaLliures);

        jF.add(jPLlistat);
// </editor-fold>

        jPInserir.setVisible(false);
        jPEliminarValor.setVisible(false);
        jPEliminarK.setVisible(false);
        jPLlistat.setVisible(false);

        jF.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jF.setVisible(true);

    }

    private void clearFields() {
        jTFInserir.setText("");
        jTFElimValor.setText("");
        jTFElimK.setText("");
        jTALlistaNodes.setText("");
        jTALlistaLliures.setText("");

    }
}
