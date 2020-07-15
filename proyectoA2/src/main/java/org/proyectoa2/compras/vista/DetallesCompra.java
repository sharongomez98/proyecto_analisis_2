/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.compras.vista;

import javax.swing.table.DefaultTableModel;
import org.marcos.dto.Compra;
import org.proyectoa2.compras.controlador.ManejoDetalleCompra;

/**
 *
 * @author malopez
 */
public class DetallesCompra extends javax.swing.JFrame {
    private ManejoDetalleCompra manejoDetalleCompra;
    private Compra compra;
    
    /**
     * Creates new form DetalleCompra
     */
    public DetallesCompra() {
        initComponents();
    }
    
    public DetallesCompra(String factura) {
        initComponents();
        this.setLocationRelativeTo(null);
        manejoDetalleCompra = new ManejoDetalleCompra();
        compra = new Compra();
        visualizar(factura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleCompra = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        campoFactura = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoFecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoProveedor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoTotal = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(615, 525));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Detalle de Compra");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        tablaDetalleCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Insumo", "Precio", "Cantidad", "Sub-Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDetalleCompra.setEnabled(false);
        jScrollPane1.setViewportView(tablaDetalleCompra);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 560, 210));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel2.setText("No. Factura");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        campoFactura.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(campoFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, 30));

        jLabel4.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel4.setText("Fecha");
        jLabel4.setFocusable(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        campoFecha.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(campoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 130, 30));

        jLabel6.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel6.setText("Proveedor");
        jLabel6.setFocusable(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        campoProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(campoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 170, 30));

        jLabel8.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        jLabel8.setText("Total");
        jLabel8.setFocusable(false);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        campoTotal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(campoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 130, 30));

        botonSalir.setText("Cancelar");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(DetallesCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DetallesCompra().setVisible(true);
            }
        });
    }

    private void visualizar(String factura) {
        compra = manejoDetalleCompra.listarDatos(factura);
        this.campoFactura.setText(factura);
        this.campoFecha.setText(compra.getFecha().toString());
        this.campoProveedor.setText(compra.getProveedor().getNombreProveedor());
        DefaultTableModel modelo = manejoDetalleCompra.listarDetalle((DefaultTableModel) this.tablaDetalleCompra.getModel(), compra.getIdCompra());
        this.tablaDetalleCompra.setModel(modelo);
        this.campoTotal.setText(String.valueOf(compra.getTotal()));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel campoFactura;
    private javax.swing.JLabel campoFecha;
    private javax.swing.JLabel campoProveedor;
    private javax.swing.JLabel campoTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalleCompra;
    // End of variables declaration//GEN-END:variables
}