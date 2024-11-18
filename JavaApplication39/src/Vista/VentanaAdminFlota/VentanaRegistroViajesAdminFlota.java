/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista.VentanaAdminFlota;

import Controlador.ControladorEmpresa;
import Excepciones.ExcepcionBusNoDisponible;
import Excepciones.ExcepcionBusVacio;
import Excepciones.ExcepcionIdDeViajeEnUso;
import Excepciones.ExcepcionViajeVacio;
import Modelo.Bus;
import Modelo.Empresa;
import Modelo.Viaje;
import Validador.ValidarDisponibilidadDeBus;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;

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

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGuardarViajes = new javax.swing.JButton();
        btnBuscarViaje = new javax.swing.JButton();
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtFechaSalida = new com.toedter.calendar.JCalendar();
        txtFechaLlegada = new com.toedter.calendar.JCalendar();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

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

        btnModificarViaje.setText("Modificar");
        btnModificarViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarViajeActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(51, 0, 0));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Destino");

        txtHoraDeSalida.setText("Hora:Minutos");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de salida");

        txtHoraDeLlegada.setText("Hora:Minutos");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bus");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor Viaje");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hora De Llegada");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha de llegada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(87, 87, 87))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel8)))
                                .addGap(75, 75, 75)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoraDeLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBuscarViaje)
                        .addGap(46, 46, 46)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnModificarViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGuardarViajes, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraDeSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraDeLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnGuardarViajes)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarViaje)
                    .addComponent(btnBuscarViaje)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnVolver)
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        VentanaPrincipalAdminFlota cambio=new VentanaPrincipalAdminFlota(this.empresa);
        cambio.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarViajeActionPerformed
       try {
        String id = txtId.getText();
        String destino = txtDestino.getText();
        String horaDeSalidaStr = txtHoraDeSalida.getText();
        String horaDeLlegadaStr = txtHoraDeLlegada.getText();
        String placa = txtBus.getText();
        double valorViaje = Double.parseDouble(txtValorViaje.getText());

        // Validar campos vacíos
        if (id.isEmpty() || destino.isEmpty() || horaDeSalidaStr.isEmpty() || 
            horaDeLlegadaStr.isEmpty() || placa.isEmpty() || txtValorViaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }

        // Obtener las fechas del JCalendar
        java.util.Date fechaSalidaUtil = txtFechaSalida.getDate();
        java.util.Date fechaLlegadaUtil = txtFechaLlegada.getDate();
        
        // Convertir de java.util.Date a LocalDate
        LocalDate fechaSalida = fechaSalidaUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaLlegada = fechaLlegadaUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Convertir String a LocalTime
        LocalTime horaDeSalida = LocalTime.parse(horaDeSalidaStr);
        LocalTime horaDeLlegada = LocalTime.parse(horaDeLlegadaStr);

        Bus bus = controladorEmpresa.buscarBus(placa);

        // Crear el objeto Viaje
        Viaje viaje = new Viaje(id, destino, horaDeSalida, horaDeLlegada, fechaSalida, fechaLlegada, bus, valorViaje);
        controladorEmpresa.modificarViaje(viaje);
        JOptionPane.showMessageDialog(null, "Viaje modificado correctamente");

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
    } catch (DateTimeParseException ex) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese fechas y horas en el formato correcto.");
    } catch (ExcepcionBusVacio | ExcepcionViajeVacio ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }//GEN-LAST:event_btnModificarViajeActionPerformed

    private void btnBuscarViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarViajeActionPerformed
        try {
        String id = txtBuscar.getText();
        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }

        Viaje respuesta = controladorEmpresa.buscarViaje(id);
        
        // Formateador solo para las horas
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        // Establecer los valores en los campos de texto
        txtBus.setText(respuesta.getBus().getPlaca());
        txtDestino.setText(respuesta.getDestino());
        txtHoraDeLlegada.setText(respuesta.getHoraDeLlegada().format(timeFormatter));
        txtHoraDeSalida.setText(respuesta.getHoraDeSalida().format(timeFormatter));
        txtValorViaje.setText(String.valueOf(respuesta.getPrecioViaje()));
        txtId.setText(respuesta.getId());

        // Convertir LocalDate a java.util.Date para el JCalendar
        Date fechaSalidaUtil = Date.from(respuesta.getFechaSalida()
            .atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date fechaLlegadaUtil = Date.from(respuesta.getFechaLLegada()
            .atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Establecer las fechas en los JCalendar
        txtFechaSalida.setDate(fechaSalidaUtil);
        txtFechaLlegada.setDate(fechaLlegadaUtil);

    } catch (ExcepcionViajeVacio ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }//GEN-LAST:event_btnBuscarViajeActionPerformed

    private void btnGuardarViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarViajesActionPerformed
         try {
        String id = txtId.getText();
        String destino = txtDestino.getText();
        String horaDeSalidaStr = txtHoraDeSalida.getText();
        String horaDeLlegadaStr = txtHoraDeLlegada.getText();
        String placa = txtBus.getText();
        double valorViaje = Double.parseDouble(txtValorViaje.getText());

        // Validar campos vacíos
        if (id.isEmpty() || destino.isEmpty() || 
            horaDeSalidaStr.isEmpty() || horaDeLlegadaStr.isEmpty() ||
            placa.isEmpty() || txtValorViaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos.");
            return;
        }

        // Obtener las fechas del JCalendar
        java.util.Date fechaSalidaUtil = txtFechaSalida.getDate();
        java.util.Date fechaLlegadaUtil = txtFechaLlegada.getDate();
        
        // Convertir de java.util.Date a LocalDate
        LocalDate fechaSalida = fechaSalidaUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaLlegada = fechaLlegadaUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Convertir String a LocalTime
        LocalTime horaDeSalida = LocalTime.parse(horaDeSalidaStr);
        LocalTime horaDeLlegada = LocalTime.parse(horaDeLlegadaStr);

        Bus bus = controladorEmpresa.buscarBus(placa);

        // Crear el objeto Viaje
        Viaje viaje = new Viaje(id, destino, horaDeSalida, horaDeLlegada, fechaSalida, fechaLlegada, bus, valorViaje);
        ValidarDisponibilidadDeBus validarBus = new ValidarDisponibilidadDeBus();
        validarBus.validarDisponibilidadDeBus(this.empresa, viaje);
        controladorEmpresa.guardarViaje(viaje);
        JOptionPane.showMessageDialog(null, "Viaje guardado correctamente");
        limpiarCampos();
    } catch (ExcepcionIdDeViajeEnUso | ExcepcionBusVacio | ExcepcionBusNoDisponible ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos en los campos numéricos.");
    } catch (DateTimeParseException ex) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese fechas y horas en el formato correcto.");
    }
    }//GEN-LAST:event_btnGuardarViajesActionPerformed

        
public void limpiarCampos(){
    txtId.setText("");
    txtDestino.setText("");
    txtHoraDeSalida.setText("");
    txtHoraDeLlegada.setText("");
    txtBus.setText("");
    txtValorViaje.setText("");
    // Establecer la fecha actual en los JCalendar
    Date fechaActual = new Date();
    txtFechaSalida.setDate(fechaActual);
    txtFechaLlegada.setDate(fechaActual);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarViaje;
    private javax.swing.JButton btnGuardarViajes;
    private javax.swing.JButton btnModificarViaje;
    private javax.swing.JButton btnVolver;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBus;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDestino;
    private com.toedter.calendar.JCalendar txtFechaLlegada;
    private com.toedter.calendar.JCalendar txtFechaSalida;
    private javax.swing.JTextField txtHoraDeLlegada;
    private javax.swing.JTextField txtHoraDeSalida;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtValorViaje;
    // End of variables declaration//GEN-END:variables

}