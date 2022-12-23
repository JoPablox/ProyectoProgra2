
package com.mycompany.creditoproyectoprogra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author JPabloA
 */
public class PanelCredito extends javax.swing.JPanel {

    /**
     * Creates new form PanelCredito
     */
    public PanelCredito() {
        initComponents();
        File archivo1;
        FileWriter escribir;
        PrintWriter linea;
        archivo1 = new File("C:\\Users\\JPabloA\\Desktop\\datosCreditos.txt");
        if (!archivo1.exists()){
            try{
                archivo1.createNewFile();
                escribir = new FileWriter(archivo1, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
                
            }
            catch(IOException e){
                
            }
        }
        else{
            try{
                escribir = new FileWriter(archivo1, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            }
            catch(IOException e){
                
            }
        }
        File archivo2;
        archivo2 = new File("C:\\Users\\JPabloA\\Desktop\\datosMovimientos.txt");
        if (!archivo2.exists()){
            try{
                archivo2.createNewFile();
                escribir = new FileWriter(archivo2, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
                
            }
            catch(IOException e){
                
            }
        }
        else{
            try{
                escribir = new FileWriter(archivo2, true);
                linea = new PrintWriter(escribir);
                linea.close();
                escribir.close();
            }
            catch(IOException e){
                
            }
        }
            
    }
/*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(650, 600));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Visualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Credito", "Nombre Propietario", "Monto Inicial", "Estado Actual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 610, 241));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Pantalla Panel de Credito");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 320, 30));

        jLabel2.setText("Movimentos de Credito");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel3.setText("Creditos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        jButton2.setText("Visuallizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, -1));

        jLabel4.setText("Ingrese el Credito a buscar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 600));
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
*/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTbusqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboEstado = new javax.swing.JComboBox<>();
        jTMontoInicial = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTIdPropietario = new javax.swing.JTextField();
        jTIdCredito = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTidMovimiento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTMonto = new javax.swing.JTextField();
        jComboTipo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(650, 600));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Visualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jTablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID Credito", "ID Propietario", "Monto Inicial", "Estado Actual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaDatos);
        if (jTablaDatos.getColumnModel().getColumnCount() > 0) {
            jTablaDatos.getColumnModel().getColumn(0).setResizable(false);
            jTablaDatos.getColumnModel().getColumn(1).setResizable(false);
            jTablaDatos.getColumnModel().getColumn(2).setResizable(false);
            jTablaDatos.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 610, 241));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Pantalla Panel de Credito");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 320, 30));

        jLabel2.setText("Movimentos de Credito");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));
        jPanel1.add(jTbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 120, -1));

        jLabel4.setText("Ingrese el Credito a buscar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Agregar Credito");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel8.setText("Estado");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Denegado", "En Estudio" }));
        jComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboEstadoActionPerformed(evt);
            }
        });
        jPanel2.add(jComboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 120, -1));

        jTMontoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMontoInicialActionPerformed(evt);
            }
        });
        jPanel2.add(jTMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 120, -1));

        jLabel7.setText("Monto Inicial");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setText("ID Propietario");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jTIdPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdPropietarioActionPerformed(evt);
            }
        });
        jPanel2.add(jTIdPropietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 120, -1));
        jPanel2.add(jTIdCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 120, -1));

        jLabel5.setText("ID Credito");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel13.setText("Agregar Cuenta Credito");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 250, 280));

        jLabel9.setText("Agregar Movimiento al Credito");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jLabel10.setText("Id Movimiento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        jTidMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidMovimientoActionPerformed(evt);
            }
        });
        jPanel1.add(jTidMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 120, -1));

        jLabel11.setText("Monto");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        jTMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMontoActionPerformed(evt);
            }
        });
        jPanel1.add(jTMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 120, -1));

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago", "Extrafinanciamiento" }));
        jPanel1.add(jComboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 120, -1));

        jLabel12.setText("Tipo");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        jButton4.setText("Agregar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                String texto = jTbusqueda.getText();
        File archivo;
        try{
            final BufferedReader hola = new BufferedReader(new FileReader("C:\\Users\\JPabloA\\Desktop\\datosCreditos.txt"));
            String line = "";
            boolean encontrado=false;
            while ((line = hola.readLine())!= null){
                String[] datos = line.split(";");
                if(datos[0].equals(texto)){                    
                    DefaultTableModel model = (DefaultTableModel) jTablaDatos.getModel();
                    model.removeRow(0);
                    model.addRow(datos);
                    jTablaDatos.setModel(model);
                    jTbusqueda.setText("");
                    encontrado=true;
                    break;
                }
                
            }
            hola.close();
            if(encontrado==false){
                JOptionPane.showMessageDialog(null, "Debito no encontrado");
                jTbusqueda.setText("");
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboEstadoActionPerformed

    private void jTIdPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdPropietarioActionPerformed

    private void jTMontoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMontoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMontoInicialActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("C:\\Users\\JPabloA\\Desktop\\datosCreditos.txt");
        
        try{
            archivo.createNewFile();
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.print(jTIdCredito.getText()+";");
            linea.print(jTIdPropietario.getText()+";");
            linea.print(jTMontoInicial.getText()+";");
            linea.print(jComboEstado.getSelectedItem().toString());
            linea.println("");
            linea.close();
            escribir.close();
            jTIdCredito.setText("");
            jTIdPropietario.setText("");
            jTMontoInicial.setText("");
            jComboEstado.setSelectedIndex(0);
        }
        catch(IOException e){
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMontoActionPerformed

    private void jTidMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidMovimientoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("C:\\Users\\JPabloA\\Desktop\\datosMovimientos.txt");
        
        try{
            String datoBusqueda=jTbusqueda.getText();
            System.out.println(datoBusqueda);
            if(datoBusqueda!=""){
                if(BusquedaArchivo(datoBusqueda)==true){
                    archivo.createNewFile();
                    escribir = new FileWriter(archivo, true);
                    linea = new PrintWriter(escribir);
                    linea.print(jTidMovimiento.getText()+";");
                    linea.print(jTMonto.getText()+";");
                    linea.print(jComboTipo.getSelectedItem().toString());
                    linea.println("");
                    linea.close();
                    escribir.close();
                    jTidMovimiento.setText("");
                    jTMonto.setText("");
                }
                else{
                     JOptionPane.showMessageDialog(null, "Credito no encontrado");
                     jTbusqueda.setText("");
                }
                
            }
            else{
              JOptionPane.showMessageDialog(null, "Espacio de Credito vacio");  
            }
            

        }
        catch(IOException e){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private boolean BusquedaArchivo(String i) throws FileNotFoundException, IOException{
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("C:\\Users\\JPabloA\\Desktop\\datosCreditos.txt");
        final BufferedReader hola = new BufferedReader(new FileReader("C:\\Users\\JPabloA\\Desktop\\datosCreditos.txt"));
            String line = "";
        while((line = hola.readLine())!= null){
            String[] datos = line.split(";");
            System.out.println(i + " == " + datos[0]);
            if(i.equals(datos[0])){
                return true;
            }
                
        }
        return false;
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboEstado;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTIdCredito;
    private javax.swing.JTextField jTIdPropietario;
    private javax.swing.JTextField jTMonto;
    private javax.swing.JTextField jTMontoInicial;
    private javax.swing.JTable jTablaDatos;
    private javax.swing.JTextField jTbusqueda;
    private javax.swing.JTextField jTidMovimiento;
    // End of variables declaration//GEN-END:variables
}