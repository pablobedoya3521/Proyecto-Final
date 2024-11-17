/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista.VentanasCliente;

import Excepciones.ExcepcionAsientosInsuficientes;
import Excepciones.ExcepcionCodigoReservaEnUso;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Caseta;
import Modelo.Cliente;
import Modelo.Reserva;
import Modelo.Viaje;
import Persistencia.SerializadoraCaseta;
import Util.Lista;
import Validador.Buscador;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelViajesDisponiblesCliente extends javax.swing.JPanel {
    private Caseta[][] casetas;
    private SerializadoraCaseta serializadoraCaseta;
    private Cliente cliente;
    
    public PanelViajesDisponiblesCliente(Cliente cliente) {
        initComponents();
        this.serializadoraCaseta=new SerializadoraCaseta();
        this.casetas=serializadoraCaseta.leerObjeto();
        this.cliente=cliente;
        llenarTabla();
    }
    
    private void llenarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Placa de bus", "ID", "Precio", "Origen", "Destino", "Hora de salida", "Hora de llegada", "Fecha de creacion", "Empresa" });
        
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if(casetas[i][j].getEmpresa()!=null){
                    for (int k = 0; k < casetas[i][j].getEmpresa().getListaViajes().size(); k++) {
                        model.addRow(new Object[]{
                            casetas[i][j].getEmpresa().getListaViajes().get(k).getBus().getPlaca(),
                            casetas[i][j].getEmpresa().getListaViajes().get(i).getId(),
                            casetas[i][j].getEmpresa().getListaViajes().get(i).getPrecioViaje(),
                            casetas[i][j].getEmpresa().getListaViajes().get(i).getOrigen(),
                            casetas[i][j].getEmpresa().getListaViajes().get(i).getDestino(),
                            casetas[i][j].getEmpresa().getListaViajes().get(i).getHoraDeSalida(),
                            casetas[i][j].getEmpresa().getListaViajes().get(i).getHoraDeLlegada(),
                            casetas[i][j].getEmpresa().getListaViajes().get(i).getFechaCreacion(),
                            casetas[i][j].getEmpresa().getNombreEmpresa()
                        });
                    }
                }
            }
        }
        
        tablaViajes.setModel(model);
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
        btnReservar = new javax.swing.JButton();
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

        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(37, 37, 37)
                        .addComponent(btnReservar))
                    .addComponent(jLabel2))
                .addContainerGap(482, Short.MAX_VALUE))
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
                    .addComponent(btnReservar))
                .addGap(13, 13, 13))
        );

        tablaViajes.setBackground(new java.awt.Color(0, 0, 0));
        tablaViajes.setForeground(new java.awt.Color(255, 255, 255));
        tablaViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
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
                .addGap(0, 84, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(754, 754, 754)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(755, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(381, 381, 381)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(501, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String referencia = txtBuscar.getText();
        Buscador buscador = new Buscador();
        Lista<Viaje> listaViajes=buscador.buscar(referencia);
        if(listaViajes.isEmpty()){
            JOptionPane.showMessageDialog(null, "No se encontró ningun registro");
            return;
        }
        llenarTabla2(listaViajes);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        String idViaje = txtBuscar.getText();
        boolean viajeEncontrado = false;
        Viaje viajeSeleccionado = null; 

        for (int i = 0; i < casetas.length && !viajeEncontrado; i++) {
            for (int j = 0; j < casetas[i].length && !viajeEncontrado; j++) {
                if (casetas[i][j].getEmpresa() != null) {
                    try {
                        Viaje viaje = casetas[i][j].getEmpresa().buscarViaje(idViaje);
                        if (viaje != null) {
                            viajeEncontrado = true;
                            viajeSeleccionado = viaje;
                        }
                    } catch (ExcepcionViajeVacio ex) {
                        continue;
                    }
                }
            }  
        }


        if (viajeEncontrado && viajeSeleccionado != null) {

            String mensaje = "<html><body style='width: 250px; padding: 5px;'>" +
                        "<h2 style='color: #1a5f7a;'>Información del Bus</h2>" +
                        "<hr>" +
                        "<b>ID del viaje:</b> " + viajeSeleccionado.getId() + "<br><br>" +
                        "<b>Placa del bus:</b> " + viajeSeleccionado.getBus().getPlaca()+ "<br><br>" +
                        "<b>Precio del viaje:</b> " + viajeSeleccionado.getPrecioViaje() + "<br><br>" +
                        "<b>Origen:</b> " + viajeSeleccionado.getOrigen() + "<br><br>" +
                        "<b>Destino:</b> " + viajeSeleccionado.getDestino() + "<br><br>" +
                        "<b>Hora de salida:</b> " + viajeSeleccionado.getHoraDeSalida() + "<br><br>" +
                        "<b>Hora de llegada:</b> " + viajeSeleccionado.getHoraDeLlegada()+ "<br><br>" +
                        "<b>Fecha de salida:</b> " + viajeSeleccionado.getFechaSalida() + "<br><br>" +
                        "<b>Fecha de llegada:</b> " + viajeSeleccionado.getFechaLLegada() + "<br><br>" +
                        "<b>Fecha de creacion:</b> " + viajeSeleccionado.getFechaCreacion() + "<br><br>" +
                            "<b>Cuantos tiquetes desea comprar?:</b> "+
                        "</body></html>";
            String input = JOptionPane.showInputDialog(null, mensaje, "Reservar Tiquetes", JOptionPane.QUESTION_MESSAGE);

            int cantidadTiquetes = Integer.parseInt(input);
                if (cantidadTiquetes > 0) {
                    try{
                        Reserva reserva = new Reserva(idViaje,this.cliente, viajeSeleccionado, cantidadTiquetes);
                        cliente.guardarReserva(reserva);
                        viajeSeleccionado.guardarReserva(reserva);
                        JOptionPane.showMessageDialog(null, "Reserva solicitada correctamente");
                    } catch (ExcepcionCodigoReservaEnUso | ExcepcionAsientosInsuficientes ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    } 
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido de tiquetes.", "Error", JOptionPane.ERROR_MESSAGE);
                }

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el viaje.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void llenarTabla2(Lista<Viaje> listaViajes) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Placa de bus", "ID", "Precio", "Origen", "Destino", "Hora de salida", "Hora de llegada", "Fecha de creacion", "Empresa" });

        for (int i = 0; i < listaViajes.size(); i++) {
            Viaje viaje = listaViajes.get(i);
            String nombreEmpresa = buscarEmpresaDelViaje(viaje);
                model.addRow(new Object[]{
                    viaje.getBus().getPlaca(),
                    viaje.getId(),
                    viaje.getPrecioViaje(),
                    viaje.getOrigen(),
                    viaje.getDestino(),
                    viaje.getHoraDeSalida(),
                    viaje.getHoraDeLlegada(),
                    viaje.getFechaCreacion(),
                    nombreEmpresa
                 });
        }

        tablaViajes.setModel(model);
    }

    private String buscarEmpresaDelViaje(Viaje viaje) {
        for (int i = 0; i < casetas.length; i++) {
            for (int j = 0; j < casetas[i].length; j++) {
                if (casetas[i][j].getEmpresa() != null) {
                    for (int k = 0; k < casetas[i][j].getEmpresa().getListaViajes().size(); k++) {
                        if (casetas[i][j].getEmpresa().getListaViajes().get(k).getId().equals(viaje.getId())) {
                            return casetas[i][j].getEmpresa().getNombreEmpresa();
                        }
                    }
                }
            }
        }
        return "Empresa no encontrada"; // Por si no se encuentra la empresa
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnReservar;
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