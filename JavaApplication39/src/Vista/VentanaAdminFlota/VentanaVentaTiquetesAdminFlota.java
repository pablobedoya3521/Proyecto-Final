/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.VentanaAdminFlota;

import Controlador.ControladorEmpresa;
import Controlador.ControladorRegistro;
import Controlador.ControladorViaje;
import Excepciones.ExcepcionAsientosInsuficientes;
import Excepciones.ExcepcionCodigoTiqueteEnUso;
import Excepciones.ExcepcionTiqueteVacio;
import Excepciones.ExcepcionUsuarioNoEncontrado;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Cliente;
import Modelo.Empresa;
import Modelo.Tiquete;
import Modelo.Usuario;
import Modelo.Viaje;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class VentanaVentaTiquetesAdminFlota extends javax.swing.JFrame {
    private ControladorEmpresa controladorEmpresa;
    private ControladorRegistro controladorRegistro;
    private Empresa empresa;

    public VentanaVentaTiquetesAdminFlota(Empresa empresa) {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        pack(); 
        this.controladorRegistro= new ControladorRegistro();
        this.controladorEmpresa=new ControladorEmpresa(empresa);
        this.empresa=empresa;
        txtFecha.setText(String.valueOf(obtenerFecha()));
        txtHora.setText(String.valueOf(obtenerHora()));
    }
    
    private LocalDate obtenerFecha(){
        return LocalDate.now();
    }
    
    private String obtenerHora(){
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdViaje = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venta de Tiquetes");

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID de viaje");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Correo de cliente");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad de asientos");

        btnVolver.setText("Regresar");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de compra");

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora de compra");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)
                        .addGap(55, 55, 55)
                        .addComponent(btnVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(btnModificar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(txtIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnVender)
                    .addComponent(btnModificar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
try {
        String idViaje = txtIdViaje.getText();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        String correo = txtCliente.getText();
        
        if (txtIdViaje.getText().isEmpty() || txtCantidad.getText().isEmpty() || 
            txtCliente.getText().isEmpty() || txtFecha.getText().isEmpty() || txtHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }
        
        Viaje viaje = controladorEmpresa.buscarViaje(idViaje); // Busco el viaje
        if (viaje.getBus().getNumAsientos() <= 0) {
            JOptionPane.showMessageDialog(null, "No hay más puestos disponibles");
            return;
        }
        
        Usuario usuario = controladorRegistro.buscar(correo); // Busco el cliente
        if (!(usuario instanceof Cliente)) {
            throw new ExcepcionUsuarioNoEncontrado();
        }
        
        Cliente cliente = (Cliente) usuario; // Uso el cliente para la instancia
        ControladorViaje controladorViaje = new ControladorViaje(viaje); // Creo el controlador
        Tiquete tiquete = new Tiquete(viaje, cliente, cantidad); // Creo el tiquete
        controladorViaje.guardarTiquete(tiquete); // Guardar el tiquete
        cliente.guardarCompraTiquete(tiquete); // Guardar el tiquete también en el cliente
        JOptionPane.showMessageDialog(null, "Tiquete vendido");
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
    } catch (ExcepcionViajeVacio | ExcepcionUsuarioNoEncontrado | ExcepcionCodigoTiqueteEnUso | ExcepcionAsientosInsuficientes ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       VentanaPrincipalAdminFlota cambio=new VentanaPrincipalAdminFlota(this.empresa);
       cambio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{    
            int codigoTiquete =Integer.parseInt(txtBuscar.getText());
            if (txtBuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor complete el campo de la placa.");
                return;
            }
            Viaje viaje = new Viaje();
            Tiquete respuesta = viaje.buscarTiquete(codigoTiquete);
            
            txtIdViaje.setText(respuesta.getViaje().getId());
            txtCliente.setText(respuesta.getCliente().getCorreo());
            txtCantidad.setText(String.valueOf(respuesta.getCantidad()));
            txtFecha.setText(String.valueOf(respuesta.getFechaDeCompra()));
            txtHora.setText(String.valueOf(respuesta.getHoraDeCompra()));
            
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        }catch (ExcepcionTiqueteVacio ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
            String idViaje=txtIdViaje.getText();
            int cantidad=Integer.parseInt(txtCantidad.getText());
            String correo=txtCliente.getText();
            
                if (txtIdViaje.getText().isEmpty() || txtCantidad.getText().isEmpty() || 
                    txtCliente.getText().isEmpty() || txtFecha.getText().isEmpty() || txtHora.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
                    return;
                }
                
        Viaje viaje=controladorEmpresa.buscarViaje(idViaje);//busco el viaje
        if(viaje.getBus().getNumAsientos()<=0){
            JOptionPane.showMessageDialog(null, "No hay mas puestos disponibles");
            return;
        }
         Usuario usuario = controladorRegistro.buscar(correo);//busco el cliente
         if(!(usuario instanceof Cliente)){
             throw new ExcepcionUsuarioNoEncontrado();
         }
        Cliente cliente =(Cliente) usuario; //uso el cliente para la instancia
        Tiquete tiquete = new Tiquete(viaje, cliente, cantidad);//creo el tiquete
        ControladorViaje controladorViaje = new ControladorViaje(viaje); //creo el controlador
        controladorViaje.modificarTiquete(tiquete);//guardo el tiquete
        cliente.guardarCompraTiquete(tiquete);//le guardo el tiquete tambien al cliente
        JOptionPane.showMessageDialog(null, "Tiquete modificado");
            
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        } catch (ExcepcionViajeVacio | ExcepcionUsuarioNoEncontrado | ExcepcionTiqueteVacio ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed
    
    
    public void limpiarCampos(){
        txtIdViaje.setText("");
        txtCantidad.setText("");
        txtCliente.setText("");
        txtFecha.setText("");
        txtHora.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIdViaje;
    // End of variables declaration//GEN-END:variables
}
