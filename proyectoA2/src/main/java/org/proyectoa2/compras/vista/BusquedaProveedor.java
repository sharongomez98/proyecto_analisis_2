/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.compras.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.marcos.dto.Compra;
import org.marcos.dto.Proveedor;
import org.proyectoa2.compras.controlador.ManejoCompra;
import org.proyectoa2.compras.controlador.ModeloCompras;

/**
 *
 * @author marvin <lopez.marvin9 at gmail.com>
 */
public class BusquedaProveedor extends javax.swing.JFrame {
    private final ManejoCompra manejoCompra;
    private DetallesCompra detallesCompra;
    
    /**
     * Creates new form BusquedaProveedor
     */
    public BusquedaProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        manejoCompra = new ManejoCompra();
        manejoCompra.listarCompras((DefaultTableModel) tablaCompras.getModel());
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
        tablaCompras = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        campoProveedor = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonDetalle = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Busqueda de compras por proveedor");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "Fecha", "Proveedor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCompras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 710, 320));

        jLabel2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        jLabel2.setText("Nombre Proveedor");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, 20));
        getContentPane().add(campoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 200, 30));

        botonBuscar.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        botonDetalle.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        botonDetalle.setText("Ver Detalle");
        botonDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetalleActionPerformed(evt);
            }
        });
        getContentPane().add(botonDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        botonCancelar.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (campoProveedor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un Proveedor valido", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(null, "El proveedor es correcto?", "Confirmar Busqueda", JOptionPane.YES_NO_OPTION) == 0) {
                String nombre = campoProveedor.getText();
                ModeloCompras modeloCompras = new ModeloCompras();
                Compra compra = new Compra();
                Proveedor proveedor = new Proveedor();
                proveedor.setNombreProveedor(nombre);
                compra.setProveedor(proveedor);
                DefaultTableModel modelo = (DefaultTableModel) tablaCompras.getModel();
                modelo.setRowCount(0);
                tablaCompras.setModel(modelo);
                modelo = modeloCompras.ModeloCompras("Proveedor", compra, (DefaultTableModel) tablaCompras.getModel());
                if (modelo.getRowCount() <= 0) {
                    JOptionPane.showMessageDialog(null, "No se encontro el proveedor", "Error", JOptionPane.INFORMATION_MESSAGE);
                    manejoCompra.listarCompras((DefaultTableModel) tablaCompras.getModel());
                } else {
                    tablaCompras.setModel(modelo);
                }
                this.campoProveedor.setText("");
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetalleActionPerformed
        boolean b = false;
        for (int i = 0; i < tablaCompras.getRowCount(); i++) {
            if (tablaCompras.isRowSelected(i) == true) {
                b = true;
            }
        }
        if (b == true) {
            if (JOptionPane.showConfirmDialog(null, "El proveedor seleccionado es correcto?", "Mostrar Detalle", JOptionPane.YES_NO_OPTION) == 0) {
                String factura = (String) tablaCompras.getValueAt(tablaCompras.getSelectedRow(), 0);
                detallesCompra = new DetallesCompra(factura);
                detallesCompra.setVisible(true);
                DefaultTableModel modelo = (DefaultTableModel) tablaCompras.getModel();
                modelo.setRowCount(0);
                tablaCompras.setModel(modelo);
                manejoCompra.listarCompras((DefaultTableModel) tablaCompras.getModel());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor de la tabla para ver el detalle de esa compra", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonDetalleActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BusquedaProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonDetalle;
    private javax.swing.JTextField campoProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCompras;
    // End of variables declaration//GEN-END:variables
}
