/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista.VentanaAdminFlota;

import Controlador.ControladorRegistro;
import Vista.Login;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author sebastian
 */
public class VentanaPrincipalAdminFlota extends javax.swing.JFrame {
    private ControladorRegistro controladorRegistro;
   
    public VentanaPrincipalAdminFlota() {
       LookAndFeelUtil.setLookAndFeel();
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        pack(); 
        this.controladorRegistro=new ControladorRegistro();
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
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btnViaje = new javax.swing.JButton();
        btnTiquete = new javax.swing.JButton();
        btnBus = new javax.swing.JButton();
        btnTiquete1 = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        head = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnTiquetesVendidos = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        btnBuses = new javax.swing.JButton();
        btnViajes = new javax.swing.JButton();
        btnAdministradorFlota = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        Container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(0, 0, 0));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViaje.setBackground(new java.awt.Color(51, 51, 51));
        btnViaje.setForeground(new java.awt.Color(255, 255, 255));
        btnViaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cheque (3).png"))); // NOI18N
        btnViaje.setText("Crear Viaje");
        btnViaje.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnViaje.setBorderPainted(false);
        btnViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnViaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnViaje.setIconTextGap(12);
        btnViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajeActionPerformed(evt);
            }
        });
        menu.add(btnViaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 206, 320, 60));

        btnTiquete.setBackground(new java.awt.Color(51, 51, 51));
        btnTiquete.setForeground(new java.awt.Color(255, 255, 255));
        btnTiquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reservado (1).png"))); // NOI18N
        btnTiquete.setText("Reservar Tiquete");
        btnTiquete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnTiquete.setBorderPainted(false);
        btnTiquete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTiquete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTiquete.setIconTextGap(12);
        btnTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiqueteActionPerformed(evt);
            }
        });
        menu.add(btnTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 320, 60));

        btnBus.setBackground(new java.awt.Color(51, 51, 51));
        btnBus.setForeground(new java.awt.Color(255, 255, 255));
        btnBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/autobus (1).png"))); // NOI18N
        btnBus.setText("Guardar Bus");
        btnBus.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBus.setBorderPainted(false);
        btnBus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBus.setIconTextGap(12);
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        menu.add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 320, 60));

        btnTiquete1.setBackground(new java.awt.Color(51, 51, 51));
        btnTiquete1.setForeground(new java.awt.Color(255, 255, 255));
        btnTiquete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tarjeta-de-credito (1) (1).png"))); // NOI18N
        btnTiquete1.setText("Vender Tiquete");
        btnTiquete1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnTiquete1.setBorderPainted(false);
        btnTiquete1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTiquete1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTiquete1.setIconTextGap(12);
        btnTiquete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiquete1ActionPerformed(evt);
            }
        });
        menu.add(btnTiquete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 320, 60));

        mensaje.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        mensaje.setForeground(new java.awt.Color(204, 0, 204));
        mensaje.setText("Transs-App");
        menu.add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 156, -1));

        head.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnTiquetesVendidos.setBackground(new java.awt.Color(51, 51, 51));
        btnTiquetesVendidos.setForeground(new java.awt.Color(255, 255, 255));
        btnTiquetesVendidos.setText("Tiquetes Vendidos");
        btnTiquetesVendidos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnTiquetesVendidos.setBorderPainted(false);
        btnTiquetesVendidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTiquetesVendidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTiquetesVendidos.setIconTextGap(12);
        btnTiquetesVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiquetesVendidosActionPerformed(evt);
            }
        });

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

        btnBuses.setBackground(new java.awt.Color(51, 51, 51));
        btnBuses.setForeground(new java.awt.Color(255, 255, 255));
        btnBuses.setText("Buses");
        btnBuses.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBuses.setBorderPainted(false);
        btnBuses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuses.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuses.setIconTextGap(12);
        btnBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusesActionPerformed(evt);
            }
        });

        btnViajes.setBackground(new java.awt.Color(51, 51, 51));
        btnViajes.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnBuses, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTiquetesVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTiquetesVendidos)
                    .addComponent(btnDevoluciones)
                    .addComponent(btnReservas)
                    .addComponent(btnBuses)
                    .addComponent(btnViajes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAdministradorFlota.setBackground(new java.awt.Color(51, 51, 51));
        btnAdministradorFlota.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministradorFlota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar (1).png"))); // NOI18N
        btnAdministradorFlota.setText("Administrador Flota");
        btnAdministradorFlota.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAdministradorFlota.setBorderPainted(false);
        btnAdministradorFlota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdministradorFlota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdministradorFlota.setIconTextGap(12);
        btnAdministradorFlota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorFlotaActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setForeground(new java.awt.Color(255, 0, 51));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion (1).png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIconTextGap(12);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(455, 455, 455)
                .addComponent(btnAdministradorFlota, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdministradorFlota, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(headLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Container, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 12, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajeActionPerformed
       VentanaRegistroViajesAdminFlota cambio = new VentanaRegistroViajesAdminFlota();
        cambio.setVisible(true);
    }//GEN-LAST:event_btnViajeActionPerformed

    private void btnTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiqueteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTiqueteActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        VentanaRegistroBusesAdminFlota cambio = new VentanaRegistroBusesAdminFlota();
        cambio.setVisible(true);
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnTiquetesVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiquetesVendidosActionPerformed
        showJPanel(new PanelTiqueteVendidosAdminFlota());
    }//GEN-LAST:event_btnTiquetesVendidosActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        showJPanel(new PanelReservasAdminFlota());
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionesActionPerformed
        showJPanel(new PanelDevolucionesAdminFlota());
    }//GEN-LAST:event_btnDevolucionesActionPerformed

    private void btnBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusesActionPerformed
        showJPanel(new PanelBusesAdminFlota());
    }//GEN-LAST:event_btnBusesActionPerformed

    private void btnAdministradorFlotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorFlotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministradorFlotaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login cambio=new Login();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnTiquete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiquete1ActionPerformed
        VentanaVentaTiquetesAdminFlota cambio=new VentanaVentaTiquetesAdminFlota();
        cambio.setVisible(true);
    }//GEN-LAST:event_btnTiquete1ActionPerformed

    private void btnViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesActionPerformed
       showJPanel(new PanelViajesAdminFlota());
    }//GEN-LAST:event_btnViajesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Container;
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAdministradorFlota;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnBuses;
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTiquete;
    private javax.swing.JButton btnTiquete1;
    private javax.swing.JButton btnTiquetesVendidos;
    private javax.swing.JButton btnViaje;
    private javax.swing.JButton btnViajes;
    private javax.swing.JPanel head;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables

}
