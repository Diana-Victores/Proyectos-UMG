/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hoteleria.vista;

import Hoteleria.datos.GuardarBitacoraDAO;
import Hoteleria.datos.HabitacionesDAO;
import Hoteleria.datos.ObjetosPerdidosDAO;
import Hoteleria.dominio.Habitaciones;
import Hoteleria.dominio.ObjetoPerdido;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import seguridad.vista.GenerarPermisos;
import seguridad.vista.Login;

/**
 *
 * @author leelu
 */
public class Entregar_objeto extends javax.swing.JInternalFrame {
    DefaultTableModel modelo1;
    DefaultTableModel modelo2;
    DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
    String codigoAplicacion="2205";

    /**
     * Creates new form Entregar_objeto
     */
    public Entregar_objeto() {
        initComponents();
        cargar_habitaciones();
        imprimir_Objetos();
        imprimir_Objetos_entregar();
        habilitarAcciones();
    }
    
    public void cargar_habitaciones() {
        id.addItem("Seleccionar...");
        HabitacionesDAO personaDAO = new HabitacionesDAO();
        List<Habitaciones> habitaciones = personaDAO.select();
        for (Habitaciones habitacion : habitaciones) {
            if (habitacion.getEstado_Habitacion()==1) {
            id.addItem(String.valueOf(habitacion.getId_Habitaciones()));   
            }
        }
    }
    
    void habilitarAcciones() {

        var codigoAplicacion = 2205;
        var usuario = Login.usuarioHoteleria;

        BtnMod.setEnabled(false);

        GenerarPermisos permisos = new GenerarPermisos();

        String[] permisosApp = new String[1];

        for (int i = 0; i < 1; i++) {
            permisosApp[i] = permisos.getAccionesAplicacion(codigoAplicacion, usuario)[i];
        }
        if (permisosApp[0].equals("1")) {
            BtnMod.setEnabled(true);
        }
    }
    
    public void imprimir_Objetos() {
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("ID");
        modelo1.addColumn("Habitacion");
        modelo1.addColumn("Ama");
        modelo1.addColumn("Fecha");
        modelo1.addColumn("Objeto");
        tabla.setModel(modelo1);

        centro.setHorizontalAlignment(JLabel.CENTER);
        tabla.getColumnModel().getColumn(0).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(1).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(2).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(3).setCellRenderer(centro);
        tabla.getColumnModel().getColumn(4).setCellRenderer(centro);

        tabla.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
    }
    
    public void imprimir_Objetos_entregar() {
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("ID");
        modelo2.addColumn("Habitacion");
        modelo2.addColumn("Ama");
        modelo2.addColumn("Fecha");
        modelo2.addColumn("Objeto");
        tabla2.setModel(modelo2);

        centro.setHorizontalAlignment(JLabel.CENTER);
        tabla2.getColumnModel().getColumn(0).setCellRenderer(centro);
        tabla2.getColumnModel().getColumn(1).setCellRenderer(centro);
        tabla2.getColumnModel().getColumn(2).setCellRenderer(centro);
        tabla2.getColumnModel().getColumn(3).setCellRenderer(centro);
        tabla2.getColumnModel().getColumn(4).setCellRenderer(centro);
        
        tabla2.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla2.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabla2.getColumnModel().getColumn(2).setPreferredWidth(50);
        tabla2.getColumnModel().getColumn(3).setPreferredWidth(50);
        tabla2.getColumnModel().getColumn(4).setPreferredWidth(50);
    }
    
    private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
    }
    
    private void limpiar(){
        txt_nombre.setText("");
        txt_dpi.setText("");
        id.setSelectedItem("Seleccionar...");
        imprimir_Objetos();
        imprimir_Objetos_entregar();
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
        id = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_dpi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnAsignarUno = new javax.swing.JButton();
        btnAsignarTodo = new javax.swing.JButton();
        btnQuitarUno = new javax.swing.JButton();
        btnQuitarTodo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        BtnMod = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Entregar Objeto Perdido");
        setVisible(true);

        jLabel1.setText("Habitacion:");

        jButton1.setText("CARGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Identificacion:");

        jLabel3.setText("Nombre:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Objetos Encontrados"));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAsignarUno.setText(">");
        btnAsignarUno.setEnabled(false);
        btnAsignarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarUnoActionPerformed(evt);
            }
        });

        btnAsignarTodo.setText(">>");
        btnAsignarTodo.setEnabled(false);
        btnAsignarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTodoActionPerformed(evt);
            }
        });

        btnQuitarUno.setText("<");
        btnQuitarUno.setEnabled(false);
        btnQuitarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarUnoActionPerformed(evt);
            }
        });

        btnQuitarTodo.setText("<<");
        btnQuitarTodo.setEnabled(false);
        btnQuitarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarTodoActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("A entregar"));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnMod.setText("ENTREGAR");
        BtnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModActionPerformed(evt);
            }
        });

        jButton7.setText("?");

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_dpi))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_nombre)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAsignarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAsignarUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuitarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuitarUno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAsignarUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAsignarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitarUno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitarTodo))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnMod)
                    .addComponent(jButton7)
                    .addComponent(jButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String combobox=id.getSelectedItem().toString();
        int validar=Integer.parseInt(combobox);        
        String datos[] = new String[5];
        ObjetosPerdidosDAO dao = new ObjetosPerdidosDAO();
        List<ObjetoPerdido> personas = dao.select();
        for (ObjetoPerdido persona : personas) {
            if (validar==Integer.parseInt(persona.getHabitacion())) {
                if (persona.getEstado().equals("1")) {
                    
                
            datos[0] = persona.getIdobjeto();
            datos[1] = persona.getHabitacion();
            datos[2] = persona.getAma();
            datos[3] = persona.getFecha();
            datos[4] = persona.getObjeto();
            
            modelo1.addRow(datos);
            tabla.setModel(modelo1);
            btnAsignarUno.setEnabled(true);
            btnAsignarTodo.setEnabled(true);
            btnQuitarUno.setEnabled(true);
            btnQuitarTodo.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAsignarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarUnoActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tabla.getSelectedRow();
        if (1 == 1) {
            if (filaSeleccionada >= 0) {
                String Vector[] = new String[5];
                Vector[0] = tabla.getValueAt(filaSeleccionada, 0).toString();
                Vector[1] = tabla.getValueAt(filaSeleccionada, 1).toString();
                Vector[2] = tabla.getValueAt(filaSeleccionada, 2).toString();
                Vector[3] = tabla.getValueAt(filaSeleccionada, 3).toString();
                Vector[4] = tabla.getValueAt(filaSeleccionada, 4).toString();
                modelo2.addRow(Vector);
                modelo1.removeRow(filaSeleccionada);
            }
        }
    }//GEN-LAST:event_btnAsignarUnoActionPerformed

    private void btnAsignarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTodoActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tabla.getRowCount(); i++) {
            String Vector[] = new String[5];
            Vector[0] = tabla.getValueAt(i, 0).toString();
            Vector[1] = tabla.getValueAt(i, 1).toString();
            Vector[2] = tabla.getValueAt(i, 2).toString();
            Vector[3] = tabla.getValueAt(i, 3).toString();
            Vector[4] = tabla.getValueAt(i, 4).toString();
            modelo2.addRow(Vector);
        }
        imprimir_Objetos();
    }//GEN-LAST:event_btnAsignarTodoActionPerformed

    private void BtnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModActionPerformed
        // TODO add your handling code here:
        if (Entregar_objeto.isNumeric(id.getSelectedItem().toString())) {
            if (id.getSelectedItem().toString().length()!=0&&txt_dpi.getText().length()!=0&&
                    txt_nombre.getText().length()!=0) {
        ObjetosPerdidosDAO modulosDAO = new ObjetosPerdidosDAO();
        String Vector[]=new String[5];
            ObjetoPerdido moduloInsertar = new ObjetoPerdido();
            for (int i = 0; i < tabla2.getRowCount(); i++) {
             
           
           Vector[0]=(String) tabla2.getValueAt(i, 0);
           Vector[1]=(String) tabla2.getValueAt(i, 1);
           Vector[2]=(String) tabla2.getValueAt(i, 2);
           Vector[3]=(String) tabla2.getValueAt(i, 3);
           Vector[4]=(String) tabla2.getValueAt(i, 4);
            
            moduloInsertar.setIdobjeto(Vector[0]);           
            moduloInsertar.setAma(Vector[2]);
            moduloInsertar.setHabitacion(Vector[1]);
            moduloInsertar.setFecha(Vector[3]);
            moduloInsertar.setObjeto(Vector[4]);
            moduloInsertar.setDpi(txt_dpi.getText());
            moduloInsertar.setNombre(txt_nombre.getText());
            moduloInsertar.setEstado("2");
            
            modulosDAO.update(moduloInsertar);   
        }
            
            JOptionPane.showMessageDialog(null, "Modulo registrado correctamente");
            GuardarBitacoraDAO guardarBitacora = new GuardarBitacoraDAO();
            guardarBitacora.GuardarEnBitacora("Modificacion", (codigoAplicacion), Login.usuarioHoteleria);
            }else{
            JOptionPane.showMessageDialog(null, "Existen campos vacios, por favor revise y llene los campos");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una habitacion");
        }
        limpiar();
    }//GEN-LAST:event_BtnModActionPerformed

    private void btnQuitarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarUnoActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = tabla2.getSelectedRow();
        if (1 == 1) {
            if (filaSeleccionada >= 0) {
                String Vector[] = new String[5];
                Vector[0] = tabla2.getValueAt(filaSeleccionada, 0).toString();
                Vector[1] = tabla2.getValueAt(filaSeleccionada, 1).toString();
                Vector[2] = tabla2.getValueAt(filaSeleccionada, 2).toString();
                Vector[3] = tabla2.getValueAt(filaSeleccionada, 3).toString();
                Vector[4] = tabla2.getValueAt(filaSeleccionada, 4).toString();
                modelo1.addRow(Vector);
                modelo2.removeRow(filaSeleccionada);
            }
        }
    }//GEN-LAST:event_btnQuitarUnoActionPerformed

    private void btnQuitarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarTodoActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tabla2.getRowCount(); i++) {
            String Vector[] = new String[5];
            Vector[0] = tabla2.getValueAt(i, 0).toString();
            Vector[1] = tabla2.getValueAt(i, 1).toString();
            Vector[2] = tabla2.getValueAt(i, 2).toString();
            Vector[3] = tabla2.getValueAt(i, 3).toString();
            Vector[4] = tabla2.getValueAt(i, 4).toString();
            modelo1.addRow(Vector);
        }
        imprimir_Objetos();
    }//GEN-LAST:event_btnQuitarTodoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMod;
    private javax.swing.JButton btnAsignarTodo;
    private javax.swing.JButton btnAsignarUno;
    private javax.swing.JButton btnQuitarTodo;
    private javax.swing.JButton btnQuitarUno;
    private javax.swing.JComboBox<String> id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField txt_dpi;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
