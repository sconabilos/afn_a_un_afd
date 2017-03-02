/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * screen.java
 *
 * Created on 01/11/2010, 11:21:03 AM
 * autores: Pablo Aguilar, Lenin Gordillo, Angel Valdez, Carlos Vivanco
 */
package afntoafdd.view;

import nfdtoafd.module.Automaton;
import nfdtoafd.module.Transformer;
import java.util.TreeSet;

/**
 *
 * @author Fabricio
 */
public class screen extends javax.swing.JFrame {

    /** Creates new form pantalla */
    public screen() {
        z.setNombre("automate");

        Integer numEstados = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Entrez le nombre d'états"));
        z.setnumEstados(numEstados);
        z.setEstadoInicial(0);


        int estFinales = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Entrez le nombre d'états finaux"));
        for (int i = 0; i < estFinales; i++) {
            int estadoFinal = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Entrez état final"));
            z.addEstadoFinal(estadoFinal);
        }

        int alf = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Entrez le nombre de lettres de l'alphabet"));
        for (int i = 0; i < alf; i++) {
            z.addLetraAlfabeto(javax.swing.JOptionPane.showInputDialog("Entrez lettre"));
        }

        initComponents();

        this.txtNumEstados.setText(numEstados.toString());
        this.txtestFinales.setText(z.getestadoFinal().toString());
        this.txtAlfabeto.setText(z.getAlfabeto().toString());



    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtestFinales = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNumEstados = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtAlfabeto = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumEstados1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtestFinales1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtAlfabeto1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Determination d'un automate d'etat fini ");
        jScrollPane3.setViewportView(jTextArea3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Virtual DJ", 0, 14)); // NOI18N
        jLabel1.setText("Automate fini non déterministe");

        jLabel2.setText("# Les états:");

        jLabel4.setText("Les états finaux:");

        txtestFinales.setText("Nul");

        jButton1.setText("Transformer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtNumEstados.setText("Nul");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setText("Alphabet :");

        txtAlfabeto.setText("Nul");

        jButton3.setText("Ajouter transition");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setFont(new java.awt.Font("Virtual DJ", 0, 14)); // NOI18N
        jLabel3.setText("Automate fini déterministe");

        jLabel6.setText("# Les états:");

        txtNumEstados1.setText("Nul");

        jLabel7.setText("Les états finaux:");

        txtestFinales1.setText("Nul");

        jLabel8.setText("Alphabet :");

        txtAlfabeto1.setText("Nul");

        jTextField1.setText("Determination d'un automate d'etat fini ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("Encadré par : • Mr. BADDI YOUSSEF ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("Réalisé par :  •\t EL Mahiri Nabil •Hicham Mamouni Alaoui ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5)
                                .addComponent(txtNumEstados1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtestFinales1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAlfabeto1))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(399, 399, 399))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(txtNumEstados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtestFinales)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumEstados)
                            .addComponent(jLabel4)
                            .addComponent(txtestFinales)
                            .addComponent(jLabel5)
                            .addComponent(txtAlfabeto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(205, 205, 205)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNumEstados1)
                            .addComponent(jLabel7)
                            .addComponent(txtestFinales1)
                            .addComponent(jLabel8)
                            .addComponent(txtAlfabeto1)))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        trans = new Transformer().minimizar(z);
        tabla2();
        this.txtNumEstados1.setText(String.valueOf(trans.getnumEstados()));
        this.txtAlfabeto1.setText(trans.getAlfabeto().toString());
        this.txtestFinales1.setText(trans.getestadoFinal().toString());
    }//GEN-LAST:event_jButton1ActionPerformed
    public void tabla1() {
        tabla1 = "\t" + z.getAlfabeto().toString() + "\n";

        for (int i = 0; i < z.getTablaTransiciones().length; i++) {
            for (int j = 0; j < z.getTablaTransiciones()[i].length; j++) {
                if (j == 0) {
                    tabla1 = tabla1 + i + "\t" + (z.getTablaTransiciones()[i][j].toString());
                } else {

                    tabla1 = tabla1 + (z.getTablaTransiciones()[i][j].toString());
                }
            }
            tabla1 = tabla1 + "\n";
        }
        this.jTextArea1.setText(tabla1);
    }

    public void tabla2() {
        tabla2 = "\t" + trans.getAlfabeto().toString() + "\n";
        TreeSet<Integer> table = new TreeSet<Integer>();
        table.add(0);

        for (int i = 0; i < trans.getTablaTransiciones().length; i++) {
            for (int j = 0; j < trans.getTablaTransiciones()[i].length; j++) {
                if (trans.getTablaTransiciones()[i][j].isEmpty()) {
                    trans.getTablaTransiciones()[i][j] = table;
                }
            }
        }



        for (int i = 0; i < trans.getTablaTransiciones().length; i++) {
            for (int j = 0; j < trans.getTablaTransiciones()[i].length; j++) {
                if (j == 0) {
                    tabla2 = tabla2 + i + "\t" + (trans.getTablaTransiciones()[i][j].toString());
                } else {

                    tabla2 = tabla2 + (trans.getTablaTransiciones()[i][j].toString());
                }
            }
            tabla2 = tabla2 + "\n";
        }
        this.jTextArea2.setText(tabla2);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int ei = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Entrez état initial"));
        String transi = javax.swing.JOptionPane.showInputDialog("Entrez transition");
        int ef = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Entrez état final"));
        z.addTransicion(ei, transi, ef);
        tabla1();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new screen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel txtAlfabeto;
    private javax.swing.JLabel txtAlfabeto1;
    private javax.swing.JLabel txtNumEstados;
    private javax.swing.JLabel txtNumEstados1;
    private javax.swing.JLabel txtestFinales;
    private javax.swing.JLabel txtestFinales1;
    // End of variables declaration//GEN-END:variables
    public static Automaton z = new Automaton();
    String tabla1 = "";
    public Automaton trans = new Automaton();
    String tabla2 = "";
}
