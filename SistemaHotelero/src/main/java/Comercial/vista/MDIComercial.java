package Comercial.vista;

import seguridad.vista.*;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Dimension;
import java.io.File;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import seguridad.datos.BitacoraDao;
import seguridad.dominio.Bitacora;

/**
 *
 *
 */
public class MDIComercial extends javax.swing.JFrame {

    private MantenimientoProductos formModulos;
    private MantenimientoProductos MantenimientoProductos;
    private Mantenimiento_Cliente Mantenimiento_Cliente;
    private Mantenimiento_Deudores Mantenimiento_Acreedor;
    private seguridad.vista.FmrBitacora FmrBitacora;
    private MantenimientoProveedor MantenimientoProveedor;
    private Proceso_Factura Proceso_Factura;
   
    private Proceso_Producto Proceso_Producto;
    private ProcesoCompra Compra;
    private FacturaProveedor Factura;
    public static JLabel logo = new JLabel();

    public MDIComercial() throws UnknownHostException {
        initComponents();
        logo(0);

        GenerarPermisos permisos = new GenerarPermisos();
        MDI_Components mdi_Components = new MDI_Components();

        String modulo_nombre = "Comercial";

        this.setTitle("Usuario: " + "[" + Login.usuarioComercial + "]" + " \t" + "IP: [" + mdi_Components.getIp() + "]");
        permisos.getPermisos(modulo_nombre, Login.usuarioComercial);

    }

    public void logo(int activar) {
        Icon icon = new ImageIcon("C:src/main/java/Imagen/2.jpg");
        logo.setSize(300, 300);
        if (icon != null) {
            //Agrega Icono
            logo.setIcon(icon);
        } else {
            //No existe imagen.
        }
        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = logo.getSize();
        logo.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        logo.setVisible(true);
        jdpescritorio.add(logo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        M_ccompras = new javax.swing.JMenu();
        M_venta = new javax.swing.JMenu();
        M_cliente = new javax.swing.JMenuItem();
        M_deudor = new javax.swing.JMenuItem();
        M_compras = new javax.swing.JMenu();
        M_proveedor = new javax.swing.JMenuItem();
        M_inventario = new javax.swing.JMenu();
        M_producto1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        P_ventas = new javax.swing.JMenu();
        P_pedido_factura = new javax.swing.JMenuItem();
        P_compras = new javax.swing.JMenu();
        ProcesoCompra = new javax.swing.JMenuItem();
        FacturaCompras = new javax.swing.JMenuItem();
        P_producto = new javax.swing.JMenu();
        ProcesoInventario = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        cerrar_sesion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hotelero");
        setResizable(false);

        jdpescritorio.setBackground(new java.awt.Color(255, 204, 0));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu1);

        M_ccompras.setText("Catalogos");
        M_ccompras.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        M_venta.setText("Mantenimientos Ventas");

        M_cliente.setText("Mantenimineto Cliente");
        M_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_clienteActionPerformed(evt);
            }
        });
        M_venta.add(M_cliente);

        M_deudor.setText("Mantenimiento Deudor");
        M_deudor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_deudorActionPerformed(evt);
            }
        });
        M_venta.add(M_deudor);

        M_ccompras.add(M_venta);

        M_compras.setText("Mantenimientos Compras");

        M_proveedor.setText("Mantenimiento Proveedor");
        M_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_proveedorActionPerformed(evt);
            }
        });
        M_compras.add(M_proveedor);

        M_ccompras.add(M_compras);

        M_inventario.setText("Mantenimientos Inventarios");

        M_producto1.setText("Mantenimiento Producto");
        M_producto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_producto1ActionPerformed(evt);
            }
        });
        M_inventario.add(M_producto1);

        M_ccompras.add(M_inventario);

        jMenuBar1.add(M_ccompras);

        jMenu4.setText("Procesos");
        jMenu4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        P_ventas.setText("Proseso ventas");

        P_pedido_factura.setText(" Pedido de  Factura");
        P_pedido_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_pedido_facturaActionPerformed(evt);
            }
        });
        P_ventas.add(P_pedido_factura);

        jMenu4.add(P_ventas);

        P_compras.setText("ProcesoCompra");

        ProcesoCompra.setText("TransaccionalCompra");
        ProcesoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoCompraActionPerformed(evt);
            }
        });
        P_compras.add(ProcesoCompra);

        FacturaCompras.setText("Factura Compras");
        FacturaCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaComprasActionPerformed(evt);
            }
        });
        P_compras.add(FacturaCompras);

        jMenu4.add(P_compras);

        P_producto.setText("Proceso Inventario");

        ProcesoInventario.setText("Proceso Inventario");
        ProcesoInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcesoInventarioActionPerformed(evt);
            }
        });
        P_producto.add(ProcesoInventario);

        jMenu4.add(P_producto);

        jMenuBar1.add(jMenu4);

        jMenu12.setText("Informes");
        jMenu12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenu13.setText("Historial");

        jMenuItem1.setText("Bitacora Comercial");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem1);

        jMenu12.add(jMenu13);

        jMenuBar1.add(jMenu12);

        jMenu6.setText("Herramientas");
        jMenu6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Ayuda");
        jMenu7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jMenu11.setText("Ayuda");
        jMenu11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem7.setText("Ayuda Menu");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem7);

        jMenu7.add(jMenu11);

        jMenuBar1.add(jMenu7);

        cerrar_sesion.setText("Cerrar Sesión");
        cerrar_sesion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cerrar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_sesionMouseClicked(evt);
            }
        });
        jMenuBar1.add(cerrar_sesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed


    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void M_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_clienteActionPerformed

        Mantenimiento_Cliente = new Mantenimiento_Cliente();

        jdpescritorio.add(Mantenimiento_Cliente);
        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = Mantenimiento_Cliente.getSize();
        Mantenimiento_Cliente.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Mantenimiento_Cliente.show();
        logo.setVisible(true);
        Mantenimiento_Cliente.setVisible(true);

        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("Acceso ");

        Insertar.setCodigoAplicacion("3001");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_M_clienteActionPerformed

    private void M_deudorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_deudorActionPerformed
        Mantenimiento_Acreedor = new Mantenimiento_Deudores();

        jdpescritorio.add(Mantenimiento_Acreedor);

        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = Mantenimiento_Acreedor.getSize();
        Mantenimiento_Acreedor.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Mantenimiento_Acreedor.show();
        logo.setVisible(true);
        Mantenimiento_Acreedor.setVisible(true);

        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("Acceso  ");

        Insertar.setCodigoAplicacion("3002");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_M_deudorActionPerformed

    private void M_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_proveedorActionPerformed
        MantenimientoProveedor = new MantenimientoProveedor();
        jdpescritorio.add(MantenimientoProveedor);

        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = MantenimientoProveedor.getSize();
        MantenimientoProveedor.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        MantenimientoProveedor.show();
        logo.setVisible(true);
        MantenimientoProveedor.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_M_proveedorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FmrBitacora = new seguridad.vista.FmrBitacora();

        jdpescritorio.add(FmrBitacora);
        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = FmrBitacora.getSize();
        FmrBitacora.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        FmrBitacora.show();
        logo.setVisible(true);
        FmrBitacora.setVisible(true);

        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("Accesso");

        Insertar.setCodigoAplicacion("200");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            if ((new File("src\\main\\java\\Comercial\\reportes\\menu.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\Comercial\\reportes\\menu.chm");
                p.waitFor();
            } else {
                JOptionPane.showMessageDialog(null, "La ayuda no Fue encontrada");
            }
            //System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("ayuda");

        Insertar.setCodigoAplicacion("0000");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void cerrar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_sesionMouseClicked
        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }

        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("cerrar");

        Insertar.setCodigoAplicacion("0");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cerrar_sesionMouseClicked

    private void M_producto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_producto1ActionPerformed
        MantenimientoProductos = new MantenimientoProductos();
        jdpescritorio.add(MantenimientoProductos);

        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = MantenimientoProductos.getSize();
        MantenimientoProductos.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        MantenimientoProductos.show();
        logo.setVisible(true);
        MantenimientoProductos.setVisible(true);
        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("Acceso");

        Insertar.setCodigoAplicacion("3003");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_M_producto1ActionPerformed

    private void FacturaComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaComprasActionPerformed
        // TODO add your handling code here:
        
         FacturaProveedor ip= new FacturaProveedor();
    jdpescritorio.add(ip);
    ip.show();

        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = Factura.getSize();
        Factura.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Factura.show();
        logo.setVisible(true);
        Factura.setVisible(true);
    }//GEN-LAST:event_FacturaComprasActionPerformed

    private void ProcesoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoCompraActionPerformed
        // TODO add your handling code here:
        Compra = new ProcesoCompra();
        jdpescritorio.add(Compra);

        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = Compra.getSize();
        Compra.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Compra.show();
        logo.setVisible(true);
        Compra.setVisible(true);
    }//GEN-LAST:event_ProcesoCompraActionPerformed

    private void P_pedido_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_pedido_facturaActionPerformed

        Proceso_Factura = new Proceso_Factura();
       jdpescritorio.add(Proceso_Factura);

        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = Proceso_Factura.getSize();
        Proceso_Factura.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Proceso_Factura.show();
        logo.setVisible(true);
        Proceso_Factura.setVisible(true);
        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("Acceso");

        Insertar.setCodigoAplicacion("30010");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_P_pedido_facturaActionPerformed

    private void ProcesoInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcesoInventarioActionPerformed
        // TODO add your handling code here:
        Proceso_Producto = new Proceso_Producto();
        jdpescritorio.add(Proceso_Producto);

        Dimension desktopSize = jdpescritorio.getSize();
        Dimension FrameSize = Proceso_Producto.getSize();
        Proceso_Producto.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Proceso_Producto.show();
        logo.setVisible(true);
        Proceso_Producto.setVisible(true);
        BitacoraDao BitacoraDAO = new BitacoraDao();

        Bitacora Insertar = new Bitacora();
        Insertar.setId_Usuario(Login.usuarioComercial);
        Insertar.setAccion("Acceso");

        Insertar.setCodigoAplicacion("3009");
        Insertar.setModulo("3000");

        try {
            BitacoraDAO.insert(Insertar);
        } catch (UnknownHostException ex) {
            Logger.getLogger(Aplicacion_Perfil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ProcesoInventarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MDIComercial().setVisible(true);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MDIComercial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem FacturaCompras;
    public static javax.swing.JMenu M_ccompras;
    public static javax.swing.JMenuItem M_cliente;
    public static javax.swing.JMenu M_compras;
    public static javax.swing.JMenuItem M_deudor;
    public static javax.swing.JMenu M_inventario;
    public static javax.swing.JMenuItem M_producto1;
    public static javax.swing.JMenuItem M_proveedor;
    public static javax.swing.JMenu M_venta;
    public static javax.swing.JMenu P_compras;
    public static javax.swing.JMenuItem P_pedido_factura;
    public static javax.swing.JMenu P_producto;
    public static javax.swing.JMenu P_ventas;
    public static javax.swing.JMenuItem ProcesoCompra;
    public static javax.swing.JMenuItem ProcesoInventario;
    public static javax.swing.JMenu cerrar_sesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    public static javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    public static javax.swing.JDesktopPane jdpescritorio;
    // End of variables declaration//GEN-END:variables
}
