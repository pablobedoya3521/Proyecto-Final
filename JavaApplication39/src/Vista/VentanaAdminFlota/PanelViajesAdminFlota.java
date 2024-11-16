/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.VentanaAdminFlota;

import Controlador.ControladorEmpresa;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Empresa;
import Modelo.Viaje;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelViajesAdminFlota extends javax.swing.JPanel {
    private ControladorEmpresa controladorEmpresa;

    public PanelViajesAdminFlota(Empresa empresa) {
        initComponents();
        this.controladorEmpresa=new ControladorEmpresa(empresa);
        llenarTabla();
    }
    
    
    private void llenarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Placa de bus", "Precio", "Origen", "Destino", "Hora de salida", "Hora de llegada","Fecha de salida","Fecha de llegada", "Fecha de creacion" });
        for (int i = 0; i < controladorEmpresa.getEmpresa().getListaViajes().size(); i++) {
            model.addRow(new Object[]{
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getId(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getBus().getPlaca(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getPrecioViaje(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getOrigen(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getDestino(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getHoraDeSalida(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getHoraDeLlegada(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getFechaSalida(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getFechaLLegada(),
                controladorEmpresa.getEmpresa().getListaViajes().get(i).getFechaCreacion(),
            });
        }
        tablaViajes.setModel(model);
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
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaViajes = new javax.swing.JTable();

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

        jPanel4.setBackground(new java.awt.Color(153, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Viajes disponibles");

        jLabel2.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(52, 52, 52)
                        .addComponent(btnEliminar))
                    .addComponent(jLabel2))
                .addContainerGap(539, Short.MAX_VALUE))
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
                    .addComponent(btnEliminar))
                .addGap(13, 13, 13))
        );

        tablaViajes.setBackground(new java.awt.Color(0, 0, 0));
        tablaViajes.setForeground(new java.awt.Color(255, 255, 255));
        tablaViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        jScrollPane1.setViewportView(tablaViajes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(742, 742, 742)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(743, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(438, 438, 438)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(441, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       try{
            String id = txtBuscar.getText();
            if (txtBuscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
                return;
            }
            Viaje respuesta = controladorEmpresa.buscarViaje(id);
            String mensaje = "<html><body style='width: 250px; padding: 5px;'>" +
                    "<h2 style='color: #1a5f7a;'>Información del Bus</h2>" +
                    "<hr>" +
                    "<b>ID del viaje:</b> " + respuesta.getId() + "<br><br>" +
                    "<b>Placa del bus:</b> " + respuesta.getBus().getPlaca()+ "<br><br>" +
                    "<b>Precio del viaje:</b> " + respuesta.getPrecioViaje() + "<br><br>" +
                    "<b>Origen:</b> " + respuesta.getOrigen() + "<br><br>" +
                    "<b>Destino:</b> " + respuesta.getDestino() + "<br><br>" +
                    "<b>Hora de salida:</b> " + respuesta.getHoraDeSalida() + "<br><br>" +
                    "<b>Hora de llegada:</b> " + respuesta.getHoraDeLlegada()+ "<br><br>" +
                    "<b>Fecha de salida:</b> " + respuesta.getFechaSalida() + "<br><br>" +
                    "<b>Fecha de llegada:</b> " + respuesta.getFechaLLegada() + "<br><br>" +
                    "<b>Fecha de creacion:</b> " + respuesta.getFechaCreacion() + "<br><br>" +
                    "</body></html>";
    
            JOptionPane.showMessageDialog(null, mensaje, "Detalles del Bus", JOptionPane.INFORMATION_MESSAGE);
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        } catch (ExcepcionViajeVacio ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try{
            String id = txtBuscar.getText();
            if (txtBuscar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
                return;
            }
            
            
            int confirmacion = JOptionPane.showConfirmDialog(null,"¿Está seguro de eliminar el viaje con ID " + id + "?","Confirmar eliminación",JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                controladorEmpresa.eliminarViaje(id);
                limpiarCampos();
                llenarTabla();
                JOptionPane.showMessageDialog(null, "Viaje eliminado correctamente");
            }
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
        } catch (ExcepcionViajeVacio ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaViajes;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
