/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.VentanasCliente;

import Excepciones.ExcepcionReservaVacia;
import Modelo.Cliente;
import Modelo.Reserva;
import Modelo.Viaje;
import Util.Lista;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelReservasCliente extends javax.swing.JPanel {
    private Cliente cliente;
    public PanelReservasCliente(Cliente cliente) {
        initComponents();
        this.cliente=cliente;
        llenarTabla();
    }
    
    private void llenarTabla(){
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Estado", "ID de viaje", "Destino de viaje", "Fecha de reserva", "Hora de reserva", "Cantidad de tiquetes", "Precio viaje", "Total a pagar"});
        for (int i = 0; i < cliente.getListaReservas().size(); i++) {
            model.addRow(new Object[]{
               cliente.getListaReservas().get(i).isEstado()==true? "Activo": "Inactivo",
               cliente.getListaReservas().get(i).getViaje().getId(),
               cliente.getListaReservas().get(i).getViaje().getDestino(),
               cliente.getListaReservas().get(i).getFechaDeReserva(),
               cliente.getListaReservas().get(i).getHoraDeReserva(),
               cliente.getListaReservas().get(i).getCantidadDeTiquetes(),
               cliente.getListaReservas().get(i).getViaje().getPrecioViaje(),
               cliente.getListaReservas().get(i).getCantidadDeTiquetes()*cliente.getListaReservas().get(i).getViaje().getPrecioViaje(),
            });
        }
        tablaReservas.setModel(model);
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
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCancelarReserva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();

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

        jPanel4.setBackground(new java.awt.Color(0, 0, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Reservas tiquetes");

        jLabel8.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelarReserva.setText("Cancelar reserva");
        btnCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBuscar)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelarReserva))
                    .addComponent(jLabel8))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)
                            .addComponent(btnCancelarReserva)))
                    .addComponent(jLabel1))
                .addGap(12, 12, 12))
        );

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(tablaReservas);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(737, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(737, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(868, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigoReserva = txtBuscar.getText();
        Reserva reservaEncontrada= null;
        
        
           Lista<Reserva> reservasCliente = cliente.getListaReservas();
           for (int i = 0; i < reservasCliente.size(); i++) {
               Reserva reserva = reservasCliente.get(i);
               if (reserva.getCodigo().equals(codigoReserva)) {
                   reservaEncontrada = reserva;
                   break;
               }
           }

        if(reservaEncontrada==null){
            JOptionPane.showMessageDialog(null, "Reserva no encontrada, los siento");
            return;
        }
        
         String mensaje = "<html><body style='width: 250px; padding: 5px;'>" +
                        "<h2 style='color: #1a5f7a;'>Información del Bus</h2>" +
                        "<hr>" +
                        "<b>ID de reserva:</b> " + reservaEncontrada.getCodigo() + "<br><br>" +
                        "<b>Cliente:</b> " + reservaEncontrada.getCliente().getCorreo()+ "<br><br>" +
                        "<b>Fecha de reserva:</b> " + reservaEncontrada.getFechaDeReserva() + "<br><br>" +
                        "<b>Hora de reserva:</b> " + reservaEncontrada.getHoraDeReserva() + "<br><br>" +
                        "<b>Cantidad de tiquetes:</b> " + reservaEncontrada.getCantidadDeTiquetes() + "<br><br>" +
                        "<b>Destino de viaje:</b> " + reservaEncontrada.getViaje().getDestino() + "<br><br>" +
                        "<b>Precio de viaje:</b> " + reservaEncontrada.getViaje().getPrecioViaje()+ "<br><br>" +
                        "<b>Total a pagar:</b> " + reservaEncontrada.getViaje().getPrecioViaje()*reservaEncontrada.getCantidadDeTiquetes() + "<br><br>" +
                        "</body></html>";
            JOptionPane.showMessageDialog(null, mensaje, "Detalles de la reserva", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReservaActionPerformed
       try {
                 String codigoReserva = txtBuscar.getText();
        
        // Buscar la reserva en la lista de reservas del cliente
        Reserva reservaEncontrada = null;
        Lista<Reserva> reservasCliente = cliente.getListaReservas();
        
        for (int i = 0; i < reservasCliente.size(); i++) {
            Reserva reserva = reservasCliente.get(i);
            if (reserva.getCodigo().equals(codigoReserva)) {
                reservaEncontrada = reserva;
                break;
            }
        }

        if (reservaEncontrada == null) {
            JOptionPane.showMessageDialog(null, "Reserva no encontrada");
            return;
        }

            if(!(reservaEncontrada.getViaje().getEstado().equals("En Curso") || reservaEncontrada.getViaje().getEstado().equals("Finalizado"))){
                    // Eliminar la reserva tanto del cliente como del viaje original
                Cliente cliente = reservaEncontrada.getCliente();
                cliente.eliminarReserva(codigoReserva);
                reservaEncontrada.getViaje().eliminarReserva(codigoReserva);
                JOptionPane.showMessageDialog(null, "Reserva cancelada correctamente");
                llenarTabla(); // Actualizar la tabla después de cancelar
            }else{
                JOptionPane.showMessageDialog(null, "No se puede cancelar esta reserva.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch (ExcepcionReservaVacia ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnCancelarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
