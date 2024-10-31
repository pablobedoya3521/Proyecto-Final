/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.VentanaAdminTerminal;

import Controlador.ControladorRegistro;
import Modelo.Caseta;
import Vista.Login;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 *
 * @author juan
 */
public class VentanaPrincipalAdminTerminal extends javax.swing.JFrame {
    private ControladorRegistro controladorRegistro;
    /*private ControladorCasilla controladorCasilla;*/
    JButton[][] botones;
    /**
     * Creates new form VentanaPrincipalTerminal
     */
    public VentanaPrincipalAdminTerminal() {
        LookAndFeelUtil.setLookAndFeel();
        initComponents();
         setLocationRelativeTo(this);
        setResizable(false);
        pack(); 
        botones=new JButton[4][];
        botones[0]=new JButton[5];
        botones[1]=new JButton[2];
        botones[2]= new JButton[2];
        botones[3]=new JButton[2];
        this.controladorRegistro=new ControladorRegistro();
        dibujarBotones();
    }
    
    private void showJPanel(JPanel p){
        p.setSize(1500,430);
        p.setLocation(0,0);

        panelContainer.removeAll();
        panelContainer.add(p,BorderLayout.CENTER);
        panelContainer.revalidate();
        panelContainer.repaint();
    }
    
    private void dibujarBotones(){
        int separado=80;
        int separado1=100;
        int separado2= 740;
        
        int ancho=200;
        int alto=110;
        int texto=1;
        int separadoSuperior=30;
        int separadoSuperior2=60;
        int desplazamientoEspecifico = 40;
        int unPocoMas=65;
        
        for(int i=0; i<botones.length;i++){
            for(int j=0; j<botones[i].length;j++){
                
      if (i == 0) {
                botones[i][j] = new JButton();
                botones[i][j].setBounds(
                    ancho * j + separado,
                    alto * i + separadoSuperior,
                    ancho, alto
                );
            } else if (i == 1 && j > 0) {
                botones[i][j] = new JButton();
                botones[i][j].setBounds(
                    ancho * j + separado1,
                    alto * i + separadoSuperior2,
                    ancho, alto
                );
            } else if (i == 2) {
                botones[i][j] = new JButton();
                // Aplica el desplazamiento solo si j == 0
                int verticalOffset = (j == 0 || j==1) ? desplazamientoEspecifico : 0; 
                botones[i][j].setBounds(
                    ancho * j + separado-verticalOffset,
                    alto * i + (separadoSuperior + unPocoMas ), // Solo ajusta la posición vertical
                    ancho, alto
                );
            } else if (i == 3) {
                int separadoFila3 = 20; // Ajusta el valor según lo necesites
                botones[i][j] = new JButton();
                botones[i][j].setBounds(
                    ancho * j + separado2 + separadoFila3 * j,
                    alto * i + (separadoSuperior2 + unPocoMas),
                    ancho, alto
                );
            } else {
                separado = 80;
                botones[i][j] = new JButton();
                botones[i][j].setBounds(
                    ancho * j + separado,
                    alto * i + separadoSuperior2,
                    ancho, alto
                );
            }
                    
                botones[i][j].setText(String.valueOf(texto));
                panelContainer.add(botones[i][j]);
                texto++;
                separado+=20;
                separado1+=110;
             
            }
        }
    }
    
    /*public void actionPerformed(ActionEvent e){
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (e.getSource().equals(botones[i][j])) {
                  int fila=i;
                    int columna=j;
                    Caseta respuesta= controladorCasillas.entregarAuditorio(fila, columna);
                    RegistroCaseta cambiar = new RegistroCaseta();
                    cambiar.setVisible(true);
                    this.dispose();
                }
            }
        }
    }*/
    
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
        head = new javax.swing.JPanel();
        btnAdministradorFlota = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        panelContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        head.setBackground(new java.awt.Color(0, 0, 0));

        btnAdministradorFlota.setBackground(new java.awt.Color(51, 51, 51));
        btnAdministradorFlota.setForeground(new java.awt.Color(255, 255, 255));
        btnAdministradorFlota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar (1).png"))); // NOI18N
        btnAdministradorFlota.setText("Administrador Terminal");
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
                .addContainerGap(741, Short.MAX_VALUE)
                .addComponent(btnAdministradorFlota, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdministradorFlota, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelContainer.setBackground(new java.awt.Color(51, 51, 51));
        panelContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1245, Short.MAX_VALUE)
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion de Casetas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorFlotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorFlotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministradorFlotaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login cambio=new Login();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnAdministradorFlota;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelContainer;
    // End of variables declaration//GEN-END:variables
}
