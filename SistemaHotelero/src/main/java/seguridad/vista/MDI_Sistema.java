package seguridad.vista;

import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Vásquez
 */
public class MDI_Sistema extends javax.swing.JFrame {

    private Mantenimiento_Modulos formMantenimiento_Modulo;
    private Mantenimiento_Aplicacion formMantenimiento_Aplicacion;

    /**
     * Creates new form MDI_Seguridad
     *
     * @throws java.net.UnknownHostException
     */
    MDI_Components mdi_components = new MDI_Components();

    public MDI_Sistema() throws UnknownHostException {
        initComponents();
        this.setTitle("Usuario: " + "[" + "]" + " \t" + "IP: [" + mdi_components.getIp() + "]");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDesktopPane_Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenu_Archivo = new javax.swing.JMenu();
        JMenuItem_CerrarSesion = new javax.swing.JMenuItem();
        JMenu_Hoteleria = new javax.swing.JMenu();
        JMenu_Comercial = new javax.swing.JMenu();
        JMenu_Finanzas = new javax.swing.JMenu();
        JMenu_Seguridad = new javax.swing.JMenu();
        JMenu_Asignaciones = new javax.swing.JMenu();
        JMenuItem_ApU = new javax.swing.JMenuItem();
        JMenuItem_ApP = new javax.swing.JMenuItem();
        JMenuItem_PU = new javax.swing.JMenuItem();
        JMenuItem_ApM = new javax.swing.JMenuItem();
        JMenuItem_Bitacora = new javax.swing.JMenuItem();
        JMenu_Mantenimientos = new javax.swing.JMenu();
        JMenuItem_Usuarios = new javax.swing.JMenuItem();
        JMenuItem_Aplicaciones = new javax.swing.JMenuItem();
        JMenuItem_Perfiles = new javax.swing.JMenuItem();
        JMenuItem_Modulos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hotelero");
        setResizable(false);

        JDesktopPane_Escritorio.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout JDesktopPane_EscritorioLayout = new javax.swing.GroupLayout(JDesktopPane_Escritorio);
        JDesktopPane_Escritorio.setLayout(JDesktopPane_EscritorioLayout);
        JDesktopPane_EscritorioLayout.setHorizontalGroup(
            JDesktopPane_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        JDesktopPane_EscritorioLayout.setVerticalGroup(
            JDesktopPane_EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        JMenu_Archivo.setText("Archivo");
        JMenu_Archivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenuItem_CerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_CerrarSesion.setText("Cerrar Sesión");
        JMenuItem_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_CerrarSesionActionPerformed(evt);
            }
        });
        JMenu_Archivo.add(JMenuItem_CerrarSesion);

        jMenuBar1.add(JMenu_Archivo);

        JMenu_Hoteleria.setText("Hotelería");
        JMenu_Hoteleria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(JMenu_Hoteleria);

        JMenu_Comercial.setText("Comercial");
        JMenu_Comercial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(JMenu_Comercial);

        JMenu_Finanzas.setText("Finanzas");
        JMenu_Finanzas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuBar1.add(JMenu_Finanzas);

        JMenu_Seguridad.setText("Seguridad");
        JMenu_Seguridad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenu_Asignaciones.setText("Asignaciones");
        JMenu_Asignaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenuItem_ApU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_ApU.setText("Aplicaciones - Usuario");
        JMenu_Asignaciones.add(JMenuItem_ApU);

        JMenuItem_ApP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_ApP.setText("Aplicaciones - Perfiles");
        JMenu_Asignaciones.add(JMenuItem_ApP);

        JMenuItem_PU.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_PU.setText("Perfiles - Usuarios");
        JMenu_Asignaciones.add(JMenuItem_PU);

        JMenuItem_ApM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_ApM.setText("Aplicaciones - Módulos");
        JMenu_Asignaciones.add(JMenuItem_ApM);

        JMenu_Seguridad.add(JMenu_Asignaciones);

        JMenuItem_Bitacora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Bitacora.setText("Bitácora");
        JMenu_Seguridad.add(JMenuItem_Bitacora);

        JMenu_Mantenimientos.setText("Mantenimientos");
        JMenu_Mantenimientos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        JMenuItem_Usuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Usuarios.setText("Usuarios");
        JMenu_Mantenimientos.add(JMenuItem_Usuarios);

        JMenuItem_Aplicaciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Aplicaciones.setText("Aplicaciones");
        JMenuItem_Aplicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_AplicacionesActionPerformed(evt);
            }
        });
        JMenu_Mantenimientos.add(JMenuItem_Aplicaciones);

        JMenuItem_Perfiles.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Perfiles.setText("Perfiles");
        JMenu_Mantenimientos.add(JMenuItem_Perfiles);

        JMenuItem_Modulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JMenuItem_Modulos.setText("Módulos");
        JMenuItem_Modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItem_ModulosActionPerformed(evt);
            }
        });
        JMenu_Mantenimientos.add(JMenuItem_Modulos);

        JMenu_Seguridad.add(JMenu_Mantenimientos);

        jMenuBar1.add(JMenu_Seguridad);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane_Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void JMenuItem_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_CerrarSesionActionPerformed
        /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_JMenuItem_CerrarSesionActionPerformed


    private void JMenuItem_ModulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_ModulosActionPerformed
      formMantenimiento_Modulo = new Mantenimiento_Modulos();
      formMantenimiento_Modulo.setVisible(true);
      JDesktopPane_Escritorio.add(formMantenimiento_Modulo);
    }//GEN-LAST:event_JMenuItem_ModulosActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        formMantenimiento_Modulo = new Mantenimiento_Modulos();
      JDesktopPane_Escritorio.add(formMantenimiento_Modulo);
      

    }//GEN-LAST:event_jMenuItem10ActionPerformed


    private void JMenuItem_AplicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItem_AplicacionesActionPerformed
        formMantenimiento_Aplicacion = new Mantenimiento_Aplicacion();
        formMantenimiento_Aplicacion.setVisible(true);
        JDesktopPane_Escritorio.add(formMantenimiento_Aplicacion);
    }//GEN-LAST:event_JMenuItem_AplicacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDI_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI_Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MDI_Sistema().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MDI_Sistema.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JDesktopPane_Escritorio;
    private javax.swing.JMenuItem JMenuItem_ApM;
    private javax.swing.JMenuItem JMenuItem_ApP;
    private javax.swing.JMenuItem JMenuItem_ApU;
    private javax.swing.JMenuItem JMenuItem_Aplicaciones;
    private javax.swing.JMenuItem JMenuItem_Bitacora;
    private javax.swing.JMenuItem JMenuItem_CerrarSesion;
    private javax.swing.JMenuItem JMenuItem_Modulos;
    private javax.swing.JMenuItem JMenuItem_PU;
    private javax.swing.JMenuItem JMenuItem_Perfiles;
    private javax.swing.JMenuItem JMenuItem_Usuarios;
    private javax.swing.JMenu JMenu_Archivo;
    private javax.swing.JMenu JMenu_Asignaciones;
    private javax.swing.JMenu JMenu_Comercial;
    private javax.swing.JMenu JMenu_Finanzas;
    private javax.swing.JMenu JMenu_Hoteleria;
    private javax.swing.JMenu JMenu_Mantenimientos;
    private javax.swing.JMenu JMenu_Seguridad;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
