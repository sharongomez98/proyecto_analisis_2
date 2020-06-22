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
public class AtenderOrdenForm extends javax.swing.JFrame {
    private VisualizarDetallesPlatilloForm visualizarDetalles;
    /**
     * Creates new form AtenderOrdenForm
     */
    public AtenderOrdenForm() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetallesOrden = new javax.swing.JTable();
        botonVerDetallesPlatillo = new javax.swing.JButton();
        botonMarcarAtendido = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        etiquetaDetallesOrden = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(746, 563));
        setPreferredSize(new java.awt.Dimension(746, 563));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDetallesOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Platillo", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tablaDetallesOrden);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 132, 710, 390));

        botonVerDetallesPlatillo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botonVerDetallesPlatillo.setText("Ver Detalles del Platillo");
        botonVerDetallesPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDetallesPlatilloActionPerformed(evt);
            }
        });
        getContentPane().add(botonVerDetallesPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        botonMarcarAtendido.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botonMarcarAtendido.setText("Marcar como Atendida");
        getContentPane().add(botonMarcarAtendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 220, -1));

        botonRegresar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        botonRegresar.setText("Regresar");
        getContentPane().add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 220, -1));

        etiquetaDetallesOrden.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        etiquetaDetallesOrden.setText("Detalles de Orden");
        getContentPane().add(etiquetaDetallesOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerDetallesPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDetallesPlatilloActionPerformed
        // TODO add your handling code here:
        this.visualizarDetalles = new VisualizarDetallesPlatilloForm();
        this.visualizarDetalles.setVisible(true);
    }//GEN-LAST:event_botonVerDetallesPlatilloActionPerformed

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
            java.util.logging.Logger.getLogger(AtenderOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtenderOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtenderOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtenderOrdenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtenderOrdenForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMarcarAtendido;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JButton botonVerDetallesPlatillo;
    private javax.swing.JLabel etiquetaDetallesOrden;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetallesOrden;
    // End of variables declaration//GEN-END:variables
}
