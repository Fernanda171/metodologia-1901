/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButton;
/**
 *
 * @author T-107
 */
public class PresentacionTest extends javax.swing.JFrame {

    JRadioButton radios[];
    Opcion[] opciones;
    Pregunta p1;
    /**
     * Creates new form PresentacionTest
     */
    public PresentacionTest() {
        initComponents();
        setLocationRelativeTo(this);
        
        //Generamos en un arreglo los radio button visuales
        radios=new JRadioButton[5];
        opciones=new Opcion[5];
        radios[0]=radioOp1;
        radios[1]=radioOp2;
        radios[2]=radioOp3;
        radios[3]=radioOp4;
        radios[4]=radioOp5;
        
         Opcion op1=new Opcion("Quesadillas",false);
        //System.out.println("Tu titulo es "+op1.titulo);
        //System.out.println("Es correcta "+op1.correcta);
        Opcion op2=new Opcion("Grasa",false);
        Opcion op3=new Opcion("Azucar",true);
        Opcion op4=new Opcion("Contaminacion",false);
        Opcion op5=new Opcion("La Sal",false);
        
        opciones[0]=op1;
        opciones[1]=op2;
        opciones[2]=op3;
        opciones[3]=op4;
        opciones[4]=op5;  
//Así se arma un arreglo
    
        p1=new Pregunta("Esta es la princial causa del cancer", opciones);
        //Llenamos el modelo con los valores correctos en la interfaz de usuario
        etiquetaTitulo.setText(p1.titulo);
        for(int i=0;i<radios.length;i++){
            radios[i].setText(p1.opciones[i].titulo);
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        etiquetaTitulo = new javax.swing.JLabel();
        radioOp1 = new javax.swing.JRadioButton();
        radioOp2 = new javax.swing.JRadioButton();
        radioOp3 = new javax.swing.JRadioButton();
        radioOp4 = new javax.swing.JRadioButton();
        radioOp5 = new javax.swing.JRadioButton();
        checarRespuesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTitulo.setText("jLabel2");

        buttonGroup1.add(radioOp1);
        radioOp1.setText("jRadioButton1");
        radioOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOp1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioOp2);
        radioOp2.setText("jRadioButton2");

        buttonGroup1.add(radioOp3);
        radioOp3.setText("jRadioButton3");

        buttonGroup1.add(radioOp4);
        radioOp4.setText("jRadioButton4");

        buttonGroup1.add(radioOp5);
        radioOp5.setText("jRadioButton5");

        checarRespuesta.setText("Checar Respuesta");
        checarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarRespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioOp5)
                            .addComponent(radioOp4)
                            .addComponent(radioOp3)
                            .addComponent(radioOp2)
                            .addComponent(radioOp1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(checarRespuesta)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaTitulo)
                .addGap(26, 26, 26)
                .addComponent(radioOp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioOp2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioOp3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioOp4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioOp5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checarRespuesta)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOp1ActionPerformed

    private void checarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarRespuestaActionPerformed

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
      
        // JOptionPane.showConfirmDialog(this,""+evaluar(p1,radios[indiceSeleccionado]));
        
    }//GEN-LAST:event_checarRespuestaActionPerformed

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
            java.util.logging.Logger.getLogger(PresentacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresentacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresentacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresentacionTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentacionTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checarRespuesta;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton radioOp1;
    private javax.swing.JRadioButton radioOp2;
    private javax.swing.JRadioButton radioOp3;
    private javax.swing.JRadioButton radioOp4;
    private javax.swing.JRadioButton radioOp5;
    // End of variables declaration//GEN-END:variables
//public boolean evaluar(Pregunta p1, JRadioButton r){
  //  boolean correcta=false;
    //for(int i=0;i<p1.opciones.length;i++){
      //  if(p1.opciones[i].titulo.equals(r.getText())){
        //    if(p1.opciones[i].correcta){
           // correcta=true;
            //break;
        //}
    //}
    //}
    //return correcta;
//}
    public boolean evaluar(Pregunta p1, int indiceSeleccionado){
        boolean correcta=false;
        if(p1.opciones[indiceSeleccionado].correcta){
            correcta=true;
        }
        return correcta;
    }    
}
