/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.ventas.vista;

/**
 *
 * @author marcos
 */
public class CobrarOrdenForm extends javax.swing.JFrame {

    /**
     * Creates new form CobrarOrdenForm
     */
    public CobrarOrdenForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etiquetaDesokegarTotal = new javax.swing.JLabel();
        textoNit = new javax.swing.JTextField();
        textoCliente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        botonConfirmarPago = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        textoCantidadCancelar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(553, 377));
        setPreferredSize(new java.awt.Dimension(553, 377));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setText("Saldo");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jRadioButton2.setText("Efectivo");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jLabel1.setText("Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel2.setText("NIT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("Total");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        etiquetaDesokegarTotal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        etiquetaDesokegarTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(etiquetaDesokegarTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 270, 40));

        textoNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNitActionPerformed(evt);
            }
        });
        getContentPane().add(textoNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 270, -1));
        getContentPane().add(textoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 270, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 10, 310));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setText("Forma de Pago");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        botonConfirmarPago.setText("Confirmar Pago");
        getContentPane().add(botonConfirmarPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        botonCancelar.setText("Cancelar");
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 130, -1));
        getContentPane().add(textoCantidadCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 270, 30));

        jLabel6.setText("Cantidad a Cancelar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNitActionPerformed

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
            java.util.logging.Logger.getLogger(CobrarOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CobrarOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CobrarOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CobrarOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CobrarOrdenForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConfirmarPago;
    private javax.swing.JLabel etiquetaDesokegarTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textoCantidadCancelar;
    private javax.swing.JTextField textoCliente;
    private javax.swing.JTextField textoNit;
    // End of variables declaration//GEN-END:variables
}