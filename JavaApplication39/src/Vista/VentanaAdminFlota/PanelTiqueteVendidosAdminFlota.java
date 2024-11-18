/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.VentanaAdminFlota;

import Controlador.ControladorEmpresa;
import Excepciones.ExcepcionTiqueteVacio;
import Modelo.Cliente;
import Modelo.Empresa;
import Modelo.Tiquete;
import Modelo.Viaje;
import Util.Lista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelTiqueteVendidosAdminFlota extends javax.swing.JPanel {
    private ControladorEmpresa controladorEmpresa;

    public PanelTiqueteVendidosAdminFlota(Empresa empresa) {
        initComponents();
        this.controladorEmpresa=new ControladorEmpresa(empresa);
        llenarTabla();
    }
    
    private void llenarTabla() {
         DefaultTableModel model = new DefaultTableModel();
         model.setColumnIdentifiers(new Object[]{"Codigo", "Cliente", "Fecha de compra", "Hora de compra", "Destino de viaje", "Cantidad de tiquetes", "Precio de tiquete", "Total"});

         Lista<Viaje> listaViajes = controladorEmpresa.getEmpresa().getListaViajes();
        if (listaViajes != null) {
            for (int m = 0; m < listaViajes.size(); m++) {
                Viaje viaje = listaViajes.get(m);
                if (viaje != null && viaje.getListaTiquetes() != null) {
                    Lista<Tiquete> listaTiquetes = viaje.getListaTiquetes();
                    for (int i = 0; i < listaTiquetes.size(); i++) {
                        Tiquete tiquete = listaTiquetes.get(i);
                        if (tiquete != null && tiquete.getCliente() != null) {
                            model.addRow(new Object[]{
                                 tiquete.getCodigoTiquete(),
                                 tiquete.getCliente().getNombre(),
                                 tiquete.getFechaDeCompra(),
                                 tiquete.getHoraDeCompra(),
                                 tiquete.getViaje().getDestino(),
                                 tiquete.getCantidad(),
                                 tiquete.getViaje().getPrecioViaje(),
                                 tiquete.getCantidad()*tiquete.getViaje().getPrecioViaje()
                            });
                        }
                    }
                }
            }
        }

         tablaTiquetesVendidos.setModel(model);
     }
    
    private void limpiarCampos(){
        txtBuscar.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCancelarTiquete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTiquetesVendidos = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText(" Tiquetes vendidos");

        jLabel2.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelarTiquete.setText("Cancelar tiquete");
        btnCancelarTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTiqueteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(48, 48, 48)
                        .addComponent(btnCancelarTiquete)))
                .addContainerGap(561, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelarTiquete))
                .addGap(13, 13, 13))
        );

        tablaTiquetesVendidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tablaTiquetesVendidos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1269, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(730, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            int codigoTiquete =Integer.parseInt(txtBuscar.getText());
            if (txtBuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor complete el campo de la placa.");
                return;
            }
            Viaje viaje = new Viaje();
            Tiquete respuesta = viaje.buscarTiquete(codigoTiquete);
            limpiarCampos();
            
            String mensaje = "<html><body style='width: 250px; padding: 5px;'>" +
                    "<h2 style='color: #1a5f7a;'>Información del Bus</h2>" +
                    "<hr>" +
                    "<b>Codigo del tiquete:</b> " + respuesta.getCodigoTiquete() + "<br><br>" +
                    "<b>Correo de cliente:</b> " + respuesta.getCliente().getCorreo() + "<br><br>" +
                    "<b>Fecha de compra:</b> " + respuesta.getFechaDeCompra() + "<br><br>" +
                    "<b>Hora de compra:</b> " + respuesta.getHoraDeCompra() + "<br><br>" +
                    "<b>Destino de viaje:</b> " + respuesta.getViaje().getDestino() + "<br><br>" +
                    "<b>Cantidad de asientos:</b> " + respuesta.getCantidad() + "<br><br>" +
                    "</body></html>";
    
            JOptionPane.showMessageDialog(null, mensaje, "Detalles del Tiquete", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        }catch (ExcepcionTiqueteVacio ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTiqueteActionPerformed
        try {
            int codigoTiquete = Integer.parseInt(txtBuscar.getText());
            if (txtBuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor complete el campo de la placa.");
                return;
            }

            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el Tiquete con el código: " + codigoTiquete + "?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                Viaje viaje = new Viaje();
                Tiquete tiqueteAEliminar = viaje.buscarTiquete(codigoTiquete); // Busca el tiquete a eliminar

                if (tiqueteAEliminar != null ) {
                    tiqueteAEliminar.getViaje().actualizarEstado();
                    if(tiqueteAEliminar.getViaje().getEstado().equals("En Curso") || tiqueteAEliminar.getViaje().getEstado().equals("Finalizado")){
                        JOptionPane.showMessageDialog(null, "No se puede cancelar este tiquete.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    Cliente cliente = tiqueteAEliminar.getCliente(); // Obtiene el cliente que compró el tiquete
                    cliente.eliminarCompraTiquete(codigoTiquete); // Llama al método para eliminar el tiquete del cliente
                    
                    viaje.eliminarTiquete(codigoTiquete); // Elimina el tiquete del viaje
                    limpiarCampos();
                    llenarTabla();
                    JOptionPane.showMessageDialog(null, "Tiquete eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el tiquete");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        } catch (ExcepcionTiqueteVacio ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnCancelarTiqueteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarTiquete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTiquetesVendidos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}