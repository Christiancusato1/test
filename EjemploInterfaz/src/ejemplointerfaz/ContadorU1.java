/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplointerfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ContadorU1 extends javax.swing.JFrame {

    /**
     * Creates new form ContadorU1
     */
    public ContadorU1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Input = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        AbrirMultiplicador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jLabel1.setText("Contador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 80, 20));

        jLabel2.setText("Valor del contador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        contador.setText("0");
        getContentPane().add(contador, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 60, -1));

        jLabel4.setText("Ingrese numero");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });
        getContentPane().add(Input, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 70, -1));

        jButton1.setText("Sumar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jButton2.setText("restar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        AbrirMultiplicador.setText("Abrir Multiplicador ");
        AbrirMultiplicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirMultiplicadorActionPerformed(evt);
            }
        });
        getContentPane().add(AbrirMultiplicador, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int num;
     try{
         num = Integer.parseInt(Input.getText());
         Contador counter = Global.getCounter();
         counter.sumar(num);
         contador.setText(Integer.toString(counter.getNumber()));
         Global.setCounter(counter);
         Input.setText("");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"No es un numero");
    
         
     }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int num;
     try{
         num = Integer.parseInt(Input.getText());
         Contador counter = Global.getCounter();
         counter.restar(num);
         contador.setText(Integer.toString(counter.getNumber()));
         Global.setCounter(counter);
         Input.setText("");
     }catch(Exception e){
         JOptionPane.showMessageDialog(null,"No es un numero");
     }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AbrirMultiplicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirMultiplicadorActionPerformed
    this.setVisible(false);
    MultiplicadorU1 Multiplicador = new MultiplicadorU1();
    Multiplicador.setVisible(true);
    
    }//GEN-LAST:event_AbrirMultiplicadorActionPerformed

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
            java.util.logging.Logger.getLogger(ContadorU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContadorU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContadorU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContadorU1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContadorU1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirMultiplicador;
    private javax.swing.JTextField Input;
    private javax.swing.JLabel contador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
