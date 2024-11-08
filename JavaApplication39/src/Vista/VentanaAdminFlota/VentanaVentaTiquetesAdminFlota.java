/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.VentanaAdminFlota;

import Controlador.ControladorEmpresa;
import Controlador.ControladorRegistro;
import Excepciones.ExcepcionCodigoEnUso;
import Excepciones.ExcepcionUsuarioNoEncontrado;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Cliente;
import Modelo.Tiquete;
import Modelo.Viaje;
import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class VentanaVentaTiquetesAdminFlota extends javax.swing.JFrame {
    private ControladorEmpresa controladorEmpresa;
    private ControladorRegistro controladorRegistro;
    /**
     * Creates new form VentanaVentaTiquetesAdminFlota
     */
    public VentanaVentaTiquetesAdminFlota() {
        initComponents();
        this.controladorEmpresa=new ControladorEmpresa();
        this.controladorRegistro= new ControladorRegistro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdViaje = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtFechaCompra = new javax.swing.JTextField();
        txtCantidadTiquetes = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Venta de Tiquetes");

        txtIdViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdViajeActionPerformed(evt);
            }
        });

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtFechaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCompraActionPerformed(evt);
            }
        });

        txtCantidadTiquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadTiquetesActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar Tiquete");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar Tiquete");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IdViaje");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha De Compra");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Codigo");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cantidad");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar)
                            .addComponent(btnVender)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(498, 498, 498)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolver)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnBuscar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidadTiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(328, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(505, 505, 505))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(454, 454, 454))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(15, 15, 15)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(txtIdViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtCantidadTiquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnVender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(btnModificar)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void txtIdViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdViajeActionPerformed

    }//GEN-LAST:event_txtIdViajeActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtFechaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCompraActionPerformed

    private void txtCantidadTiquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadTiquetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadTiquetesActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
         try{
        String codigo=txtCodigo.getText();
        String idViaje=txtIdViaje.getText();
        int cantidad=Integer.parseInt(txtCantidadTiquetes.getText());
        String correo=txtCliente.getText();
        String fechaCompra=txtFechaCompra.getText();
        if (txtCodigo.getText().isEmpty()||txtIdViaje.getText().isEmpty() || txtCantidadTiquetes.getText().isEmpty() || 
            txtCliente.getText().isEmpty() || txtFechaCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }
        Viaje viaje=controladorEmpresa.buscarViaje(idViaje);
        Cliente cliente=controladorRegistro.buscarCliente(correo);
        Tiquete tiquete=new Tiquete(codigo,viaje,cliente,cantidad,fechaCompra);
        if(viaje.getBus().getNumAsientos()<=0){
            JOptionPane.showMessageDialog(null, "No hay mas puestos disponibles");
            return;
        }
        controladorEmpresa.guardarTiquete(tiquete);
        JOptionPane.showMessageDialog(null, "Tiquete vendido");
            
        } catch(ExcepcionCodigoEnUso|ExcepcionViajeVacio | ExcepcionUsuarioNoEncontrado ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
        String codigo=txtCodigo.getText();
        if (txtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }
        Tiquete aux=controladorEmpresa.buscarTiquete(codigo);
        if(aux != null){
            txtIdViaje.setText(aux.getViaje().getId());
            txtCantidadTiquetes.setText(String.valueOf(aux.getCantidad()));
            txtCliente.setText(aux.getCliente().getCedula());
            txtFechaCompra.setText(aux.getFechaDeCompra());
        }
      } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
      }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
        String codigo = txtCodigo.getText();
        if (txtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }
        boolean respuesta=controladorEmpresa.eliminarTiquete(codigo);
        if(respuesta){
            JOptionPane.showMessageDialog(null, "Se eliminó el tiquete");
            limpiarCampos();

        } else{
            JOptionPane.showMessageDialog(null, "No se eliminó el viaje");
        }
       } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try{
        String codigo =txtCodigo.getText();
        String idViaje=txtIdViaje.getText();
        int cantidad=Integer.parseInt(txtCantidadTiquetes.getText());
        String correo=txtCliente.getText();
        String fechaDeCompra=txtFechaCompra.getText(); 
         if (txtCodigo.getText().isEmpty()||txtIdViaje.getText().isEmpty() || txtCantidadTiquetes.getText().isEmpty() || 
            txtCliente.getText().isEmpty() || txtFechaCompra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
         }
        Viaje viaje=controladorEmpresa.buscarViaje(idViaje);
        Cliente cliente=controladorRegistro.buscarCliente(correo);
        Tiquete tiquete=new Tiquete(codigo,viaje,cliente,cantidad,fechaDeCompra);
        controladorEmpresa.guardarTiquete(tiquete);
        JOptionPane.showMessageDialog(null, "Tiquete vendido");
            
        } catch(ExcepcionCodigoEnUso|ExcepcionViajeVacio | ExcepcionUsuarioNoEncontrado ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaPrincipalAdminFlota cambio=new VentanaPrincipalAdminFlota();
        cambio.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed
    
    
    public void limpiarCampos(){
        txtCodigo.setText("");
        txtIdViaje.setText("");
        txtCantidadTiquetes.setText("");
        txtCliente.setText("");
        txtFechaCompra.setText("");
    
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCantidadTiquetes;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFechaCompra;
    private javax.swing.JTextField txtIdViaje;
    // End of variables declaration//GEN-END:variables
}
