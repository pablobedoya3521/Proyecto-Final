/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista.VentanaAdminFlota;

import Controlador.ControladorEmpresa;
import Excepciones.ExcepcionBusVacio;
import Excepciones.ExcepcionIdDeViajeEnUso;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Bus;
import Modelo.Empresa;
import Modelo.Viaje;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class VentanaRegistroViajesAdminFlota extends javax.swing.JFrame {
    private ControladorEmpresa controladorEmpresa;
    private Empresa empresa;
  
    public VentanaRegistroViajesAdminFlota(Empresa empresa) {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        pack(); 
       this.controladorEmpresa=new ControladorEmpresa(empresa);
       this.empresa=empresa;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOrigen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGuardarViajes = new javax.swing.JButton();
        btnBuscarViaje = new javax.swing.JButton();
        btnEliminarViaje = new javax.swing.JButton();
        btnModificarViaje = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoraDeSalida = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHoraDeLlegada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorViaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Origen");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro Viajes");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora De Salida");

        btnGuardarViajes.setText("Guardar");
        btnGuardarViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarViajesActionPerformed(evt);
            }
        });

        btnBuscarViaje.setText("Buscar");
        btnBuscarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarViajeActionPerformed(evt);
            }
        });

        btnEliminarViaje.setText("Eliminar");
        btnEliminarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarViajeActionPerformed(evt);
            }
        });

        btnModificarViaje.setText("Modificar");
        btnModificarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarViajeActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Destino");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hora De Llegada");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bus");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor Viaje");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnBuscarViaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarViaje)
                .addGap(173, 173, 173))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnGuardarViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolver)
                                    .addComponent(btnEliminarViaje)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtHoraDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtHoraDeLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtHoraDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraDeLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnGuardarViajes)
                .addGap(28, 28, 28)
                .addComponent(btnEliminarViaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarViaje)
                    .addComponent(btnModificarViaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarViajesActionPerformed
        try{
            String id=txtId.getText();
            String origen=txtOrigen.getText();
            String destino=txtDestino.getText();
            String horaDeSalida=txtHoraDeSalida.getText();
            String horaDeLlegada=txtHoraDeLlegada.getText();
            String placa=txtBus.getText();
            double valorViaje=Double.parseDouble(txtValorViaje.getText());
            
            if (txtId.getText().isEmpty()||txtOrigen.getText().isEmpty() || txtDestino.getText().isEmpty() || 
                txtHoraDeSalida.getText().isEmpty() || txtHoraDeLlegada.getText().isEmpty()||
                txtBus.getText().isEmpty() || txtValorViaje.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
                return;
            }
            
            Bus bus=controladorEmpresa.buscarBus(placa);

            Viaje viaje=new Viaje (id,origen,destino,horaDeSalida,horaDeLlegada,bus,valorViaje);
            
                controladorEmpresa.guardarViaje(viaje);
                JOptionPane.showMessageDialog(null, "Viaje guardado correctamente");
                bus.cambiarEstado();
                limpiarCampos(); 
        }catch(ExcepcionIdDeViajeEnUso | ExcepcionBusVacio ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        }
    }//GEN-LAST:event_btnGuardarViajesActionPerformed

    
    private void btnBuscarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarViajeActionPerformed
        try{
        String id = txtId.getText();
        if (txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }
        Viaje respuesta = controladorEmpresa.buscarViaje(id);
        txtId.setText(respuesta.getId());
        txtOrigen.setText(respuesta.getOrigen());
        txtDestino.setText(respuesta.getDestino());
        txtHoraDeSalida.setText(respuesta.getHoraDeSalida());
        txtHoraDeLlegada.setText(respuesta.getHoraDeLlegada());
        txtBus.setText(respuesta.getBus().getPlaca());
        txtValorViaje.setText(String.valueOf(respuesta.getPrecioViaje()));
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        } catch (ExcepcionViajeVacio ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarViajeActionPerformed

    private void btnEliminarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarViajeActionPerformed
        try{
        String id = txtId.getText();
            if (txtId.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
                return;
            }
            controladorEmpresa.eliminarViaje(id);
            JOptionPane.showMessageDialog(null, "Se eliminó el viaje");
            limpiarCampos();
       } catch (ExcepcionViajeVacio ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
       }
    }//GEN-LAST:event_btnEliminarViajeActionPerformed

    private void btnModificarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarViajeActionPerformed
        try{
            String id =txtId.getText();
            String origen=txtOrigen.getText();
            String destino=txtDestino.getText();
            String horaDeSalida=txtHoraDeSalida.getText();
            String horaDeLlegada=txtHoraDeLlegada.getText();
            String placa=txtBus.getText();
            double valorViaje=Double.parseDouble(txtValorViaje.getText()); 
            
            if (txtId.getText().isEmpty()||txtOrigen.getText().isEmpty() || txtDestino.getText().isEmpty() || 
               txtHoraDeSalida.getText().isEmpty() || txtHoraDeLlegada.getText().isEmpty()||
               txtBus.getText().isEmpty() || txtValorViaje.getText().isEmpty()) {
               JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
               return;
            }
            
            Bus bus=controladorEmpresa.buscarBus(placa);
        
            Viaje viaje=new Viaje(id,origen,destino,horaDeSalida,horaDeLlegada,bus,valorViaje);
            controladorEmpresa.modificarViaje(viaje);
            JOptionPane.showMessageDialog(null, "Viaje modificado correctamente");

        
        }catch (NumberFormatException ex) {
             JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        }catch (ExcepcionBusVacio | ExcepcionViajeVacio ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarViajeActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaPrincipalAdminFlota cambio=new VentanaPrincipalAdminFlota(this.empresa);
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        
    }//GEN-LAST:event_txtIdActionPerformed
    
    public void limpiarCampos(){
        txtId.setText("");
        txtOrigen.setText("");
        txtDestino.setText("");
        txtHoraDeSalida.setText("");
        txtHoraDeLlegada.setText("");
        txtBus.setText("");
        txtValorViaje.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarViaje;
    private javax.swing.JButton btnEliminarViaje;
    private javax.swing.JButton btnGuardarViajes;
    private javax.swing.JButton btnModificarViaje;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBus;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtHoraDeLlegada;
    private javax.swing.JTextField txtHoraDeSalida;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtValorViaje;
    // End of variables declaration//GEN-END:variables

}
