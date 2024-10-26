/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import java.security.Principal;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author sebastian
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        VentanaRegistroUsuario.LookAndFeelUtil.setLookAndFeel();
        initComponents();
        InitStyles();
        setLocationRelativeTo(this);
        setResizable(false);
        pack();        
    }
    
    
    public void InitStyles(){
        mensaje.putClientProperty( "FlatLaf.style", "font: 200% $light.font" );
    }
    
  
    private void showJPanel(JPanel p){
    p.setSize(1500,430);
    p.setLocation(0,0);
    
    Container.removeAll();
    Container.add(p,BorderLayout.CENTER);
    Container.revalidate();
    Container.repaint();
    }
    
        public class LookAndFeelUtil {
    public static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            FlatHighContrastIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
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

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        btnViajes = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        head = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnReservas = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        btnNotificaciones = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnPuntos = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnCliente1 = new javax.swing.JButton();
        Container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1839, 848));

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensaje.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        mensaje.setForeground(new java.awt.Color(204, 0, 204));
        mensaje.setText("Transs-App");
        menu.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 156, -1));

        btnComprar.setBackground(new java.awt.Color(51, 51, 51));
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cheque (3).png"))); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnComprar.setBorderPainted(false);
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnComprar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnComprar.setIconTextGap(12);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        menu.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 206, 330, 60));

        btnReservar.setBackground(new java.awt.Color(51, 51, 51));
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura (1) (1).png"))); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnReservar.setBorderPainted(false);
        btnReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReservar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReservar.setIconTextGap(12);
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        menu.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 330, 60));

        btnViajes.setBackground(new java.awt.Color(51, 51, 51));
        btnViajes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ubicacion (1).png"))); // NOI18N
        btnViajes.setText("Viajes");
        btnViajes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnViajes.setBorderPainted(false);
        btnViajes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnViajes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnViajes.setIconTextGap(12);
        btnViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajesActionPerformed(evt);
            }
        });
        menu.add(btnViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 330, 60));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ubicacion (1).png"))); // NOI18N
        jButton5.setText("Viajes");
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton5.setBorderPainted(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.setIconTextGap(12);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        menu.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 330, 60));

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ubicacion (1).png"))); // NOI18N
        jButton8.setText("Viajes");
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton8.setBorderPainted(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setIconTextGap(12);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        menu.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 146, 330, 60));

        head.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnReservas.setBackground(new java.awt.Color(51, 51, 51));
        btnReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservas.setText("Reservas");
        btnReservas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnReservas.setBorderPainted(false);
        btnReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReservas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReservas.setIconTextGap(12);
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });

        btnDevoluciones.setBackground(new java.awt.Color(51, 51, 51));
        btnDevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        btnDevoluciones.setText("Devoluciones");
        btnDevoluciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnDevoluciones.setBorderPainted(false);
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDevoluciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDevoluciones.setIconTextGap(12);
        btnDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionesActionPerformed(evt);
            }
        });

        btnNotificaciones.setBackground(new java.awt.Color(51, 51, 51));
        btnNotificaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnNotificaciones.setText("Notificaciones");
        btnNotificaciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnNotificaciones.setBorderPainted(false);
        btnNotificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNotificaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNotificaciones.setIconTextGap(12);
        btnNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionesActionPerformed(evt);
            }
        });

        btnCompras.setBackground(new java.awt.Color(51, 51, 51));
        btnCompras.setForeground(new java.awt.Color(255, 255, 255));
        btnCompras.setText("Compras");
        btnCompras.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCompras.setBorderPainted(false);
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompras.setIconTextGap(12);
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNotificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservas)
                    .addComponent(btnNotificaciones)
                    .addComponent(btnDevoluciones)
                    .addComponent(btnCompras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPuntos.setBackground(new java.awt.Color(204, 233, 216));
        btnPuntos.setForeground(new java.awt.Color(51, 204, 0));
        btnPuntos.setText("Puntos:500");
        btnPuntos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCliente.setBackground(new java.awt.Color(51, 51, 51));
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar (1).png"))); // NOI18N
        btnCliente.setText("Ciente");
        btnCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCliente.setBorderPainted(false);
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCliente.setIconTextGap(12);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnCliente1.setBackground(new java.awt.Color(51, 51, 51));
        btnCliente1.setForeground(new java.awt.Color(255, 0, 51));
        btnCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion (1).png"))); // NOI18N
        btnCliente1.setText("Salir");
        btnCliente1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCliente1.setBorderPainted(false);
        btnCliente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCliente1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCliente1.setIconTextGap(12);
        btnCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(466, 466, 466)
                .addComponent(btnPuntos)
                .addGap(66, 66, 66)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPuntos)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Container.setBackground(new java.awt.Color(51, 51, 51));
        Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Container.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1839, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViajesActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        showJPanel(new VentanaPrincipalReservas());
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionesActionPerformed
        showJPanel(new VentanaPrincipalNotificaciones());
    }//GEN-LAST:event_btnNotificacionesActionPerformed

    private void btnDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionesActionPerformed
        showJPanel(new VentanaPrincipalDevoluciones());
    }//GEN-LAST:event_btnDevolucionesActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        showJPanel(new VentanaPrincipalCompras());
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCliente1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCliente1;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnNotificaciones;
    private javax.swing.JButton btnPuntos;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnViajes;
    private javax.swing.JPanel head;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
