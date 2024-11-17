/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.VentanaAdminFlota;

import Controlador.ControladorEmpresa;
import Controlador.ControladorViaje;
import Excepciones.ExcepcionAsientosInsuficientes;
import Excepciones.ExcepcionCodigoTiqueteEnUso;
import Excepciones.ExcepcionReservaVacia;
import Modelo.Cliente;
import Modelo.Empresa;
import Modelo.Reserva;
import Modelo.Tiquete;
import Modelo.Viaje;
import Util.Lista;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelReservasAdminFlota extends javax.swing.JPanel {
    private Empresa empresa;
    private ControladorEmpresa controladorEmpresa;

    public PanelReservasAdminFlota(Empresa empresa) {
        initComponents();
        this.controladorEmpresa= new ControladorEmpresa(empresa);
        this.empresa=controladorEmpresa.getEmpresa();
        llenarTabla();
    }
    
    private void llenarTabla() {
         DefaultTableModel model = new DefaultTableModel();
         model.setColumnIdentifiers(new Object[]{
             "Codigo de reserva", "Correo de cliente", "Nombre de cliente", 
             "Fecha de reserva", "Hora de reserva", "Cantidad de tiquetes", 
             "Precio viaje", "Destino", "Total a pagar"
         });

         for (int i = 0; i < empresa.getListaViajes().size(); i++) {
             Viaje viaje = empresa.getListaViajes().get(i);

             if (viaje != null && viaje.getListaReservas() != null) {
                 // Iterar sobre las reservas de cada viaje
                 for (int j = 0; j < viaje.getListaReservas().size(); j++) {
                     Reserva reserva = viaje.getListaReservas().get(j);

                     if (reserva != null && reserva.getCliente() != null) {
                         model.addRow(new Object[]{
                             reserva.getCodigo(),                     // Codigo de reserva
                             reserva.getCliente().getCorreo(),       // Correo de cliente
                             reserva.getCliente().getNombre(),       // Nombre de cliente
                             reserva.getFechaDeReserva(),            // Fecha de reserva
                             reserva.getHoraDeReserva(),             // Hora de reserva
                             reserva.getCantidadDeTiquetes(),        // Cantidad de tiquetes
                             viaje.getPrecioViaje(),                 // Precio viaje
                             viaje.getDestino(),                     // Destino
                             viaje.getPrecioViaje() * reserva.getCantidadDeTiquetes() // Total a pagar
                        });
                    }
                }
            }
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
        btnCancelar = new javax.swing.JButton();
        btnEfectuar = new javax.swing.JButton();
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

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("Viajes reservados");

        jLabel8.setText("Buscar");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEfectuar.setText("Efectuar");
        btnEfectuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(153, 153, 153)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnBuscar)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEfectuar))
                    .addComponent(jLabel8))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEfectuar))
                .addGap(13, 13, 13))
        );

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 243, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1254, Short.MAX_VALUE)))
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
                    .addContainerGap(734, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEfectuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuarActionPerformed
        String codigoReserva = txtBuscar.getText();
        Reserva reservaEncontrada= null;
        Lista<Viaje> listaViajes= empresa.getListaViajes();
        for (int i = 0; i < listaViajes.size(); i++) {
            Viaje viaje = listaViajes.get(i);
            Lista<Reserva> listaReservas = viaje.getListaReservas();
            for (int j = 0; j < listaReservas.size(); j++) {
                Reserva reserva = listaReservas.get(j);
                if(reserva.getCodigo().equals(codigoReserva)){
                    reservaEncontrada=reserva;
                }
            }
        }
        
        if(reservaEncontrada==null){
            JOptionPane.showMessageDialog(null, "Reserva no encontrada, los siento");
            return;
        }
        try{
        Viaje viaje = reservaEncontrada.getViaje();
        Cliente cliente = reservaEncontrada.getCliente();
        int cantidad= reservaEncontrada.getCantidadDeTiquetes();
        ControladorViaje controladorViaje= new ControladorViaje(viaje);
        controladorViaje.eliminarReserva(codigoReserva);
        cliente.eliminarReserva(codigoReserva);
        Tiquete tiquete = new Tiquete(viaje, cliente, cantidad);
        controladorViaje.guardarTiquete(tiquete);
        cliente.guardarCompraTiquete(tiquete);
        JOptionPane.showMessageDialog(null, "Reserva efectiva correctamente");
        llenarTabla();
        } catch (ExcepcionCodigoTiqueteEnUso | ExcepcionAsientosInsuficientes | ExcepcionReservaVacia ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_btnEfectuarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigoReserva = txtBuscar.getText();
        Reserva reservaEncontrada= null;
        Lista<Viaje> listaViajes= empresa.getListaViajes();
        for (int i = 0; i < listaViajes.size(); i++) {
            Viaje viaje = listaViajes.get(i);
            Lista<Reserva> listaReservas = viaje.getListaReservas();
            for (int j = 0; j < listaReservas.size(); j++) {
                Reserva reserva = listaReservas.get(j);
                if(reserva.getCodigo().equals(codigoReserva)){
                    reservaEncontrada=reserva;
                }
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        try {
            String codigoReserva = txtBuscar.getText();

            Reserva reservaEncontrada = null;
            Viaje viajeEncontrado = null;
            Lista<Viaje> listaViajes = empresa.getListaViajes();

            // Buscar la reserva y el viaje correspondiente
            for (int i = 0; i < listaViajes.size(); i++) {
                Viaje viaje = listaViajes.get(i);
                Lista<Reserva> listaReservas = viaje.getListaReservas();
                for (int j = 0; j < listaReservas.size(); j++) {
                    Reserva reserva = listaReservas.get(j);
                    if (reserva.getCodigo().equals(codigoReserva)) {
                        reservaEncontrada = reserva;
                        viajeEncontrado = viaje;
                        break;
                    }
                }
                if (reservaEncontrada != null) break;
            }

            if (reservaEncontrada == null) {
                JOptionPane.showMessageDialog(null, "Reserva no encontrada");
                return;
            }

            if(!(reservaEncontrada.getViaje().getEstado().equals("En Curso") || reservaEncontrada.getViaje().getEstado().equals("Finalizado"))){
                    // Eliminar la reserva tanto del cliente como del viaje original
                Cliente cliente = reservaEncontrada.getCliente();
                cliente.eliminarReserva(codigoReserva);
                viajeEncontrado.eliminarReserva(codigoReserva);

                JOptionPane.showMessageDialog(null, "Reserva cancelada correctamente");
                llenarTabla(); // Actualizar la tabla después de cancelar
            }else{
                JOptionPane.showMessageDialog(null, "No se puede cancelar esta reserva.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch (ExcepcionReservaVacia ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEfectuar;
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