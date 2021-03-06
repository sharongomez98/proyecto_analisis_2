/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.proyectoa2.inventario.controlador.listar;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.marcos.dto.Inventario;
import static org.marcos.sql.InventarioSql.LEXISTENCIA;
import org.proyectoa2.inventario.controlador.Tabla;
import org.proyectoa2.inventario.interfaces.Opcion;

/**
 *
 * @author Gilda
 */
public class Revision_existencia implements Opcion {

    @Override
    public DefaultTableModel Crear(Inventario inventario) {
        DefaultTableModel modelo = new DefaultTableModel();
        Tabla t = new Tabla();
        modelo = t.getModelo();
        try {

            ResultSet rs = LEXISTENCIA(inventario.getExistencia());

            while (rs.next()) {
                // Se crea un array que será una de las filas de la tabla.
                Object[] fila = new Object[7]; // Hay tres columnas en la tabla

                // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                }
                // Se añade al modelo la fila completa.
                modelo.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Revision_existencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;

    }

}


