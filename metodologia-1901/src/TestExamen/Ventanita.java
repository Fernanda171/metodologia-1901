/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestExamen;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author T-107
 */
public class Ventanita extends javax.swing.JFrame {
int contador=0;
JRadioButton radios[];
   Opcion[] opciones;
   Pregunta p1;
   
    /**
     * Creates new form Ventanita
     */
    public Ventanita() {
        initComponents();
         initComponents();
        setLocationRelativeTo(this);
        
        //Generamos en un arreglo los radio button visuales
        radios=new JRadioButton[4];
        opciones=new Opcion[4];
        radios[0]=radioOp1;
        radios[1]=radioOp2;
        radios[2]=radioOp3;
        radios[3]=radioOp4;
         Opcion op1=new Opcion("Popocatepelt",false);
        //System.out.println("Tu titulo es "+op1.titulo);
        //System.out.println("Es correcta "+op1.correcta);
        Opcion op2=new Opcion("Everest",true);
        Opcion op3=new Opcion("Aconcagua",false);
        Opcion op4=new Opcion("Pico de Orizaba",false);
        opciones[0]=op1;
        opciones[1]=op2;
        opciones[2]=op3;
        opciones[3]=op4;
          p1=new Pregunta("¿Cuál es la montaña más alta del mundo?", opciones);
        //Llenamos el modelo con los valores correctos en la interfaz de usuario
       etiquetaTitulo.setText(p1.titulo);
        for(int i=0;i<radios.length;i++){
            radios[i].setText(p1.opciones[i].titulo);
      
        //Deshabilitamos el boton checar
        siguiente.setEnabled(false);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaContador = new javax.swing.JLabel();
        checar = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        radioOp1 = new javax.swing.JRadioButton();
        radioOp2 = new javax.swing.JRadioButton();
        radioOp3 = new javax.swing.JRadioButton();
        radioOp4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaContador.setText("jLabel1");

        checar.setText("checar");
        checar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarActionPerformed(evt);
            }
        });

        siguiente.setText("siguiente");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        radioOp1.setText("jRadioButton1");
        radioOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOp1ActionPerformed(evt);
            }
        });

        radioOp2.setText("jRadioButton2");

        radioOp3.setText("jRadioButton3");

        radioOp4.setText("jRadioButton4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(checar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(siguiente)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(etiquetaContador))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioOp2)
                            .addComponent(radioOp1)
                            .addComponent(radioOp3)
                            .addComponent(radioOp4))))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(etiquetaContador)
                .addGap(18, 18, 18)
                .addComponent(radioOp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioOp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioOp3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioOp4)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checar)
                    .addComponent(siguiente))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarActionPerformed
        // TODO add your handling code here:
         int indiceSeleccionado=0;
        for(int i=0;i<radios.length;i++){
            if(radios[i].isSelected()){
                indiceSeleccionado=i;
                break;
            }
        }
        System.out.println("Indice"+indiceSeleccionado);
        JOptionPane.showConfirmDialog(this,""+evaluar(p1,indiceSeleccionado));
        contador++;
        etiquetaContador.setText(""+contador);
        checar.setEnabled(false);
        siguiente.setEnabled(true);
    }//GEN-LAST:event_checarActionPerformed

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        siguiente.setEnabled(false);
        checar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_siguienteActionPerformed

    private void radioOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOp1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventanita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventanita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventanita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventanita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checar;
    private javax.swing.JLabel etiquetaContador;
    private javax.swing.JRadioButton radioOp1;
    private javax.swing.JRadioButton radioOp2;
    private javax.swing.JRadioButton radioOp3;
    private javax.swing.JRadioButton radioOp4;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
public boolean evaluar(Pregunta p1, int indiceSeleccionado){
        boolean correcta=false;
        if(p1.opciones[indiceSeleccionado].correcta){
        } else {
            correcta=true;
        }
        return correcta;
    }   
}