/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto4;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Bito
 */
public class reto4 extends javax.swing.JFrame {
    
    public List<String> nombre1 = new ArrayList<String>();
    public List<Double> irca1 = new ArrayList<Double>();

    /**
     * Creates new form frmreto4
     */
    public reto4() {
        initComponents();
        tfIdResul.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        tfNombreIng = new javax.swing.JTextField();
        tfIdIng = new javax.swing.JTextField();
        tfMunicipioIng = new javax.swing.JTextField();
        tfTipoAguaIng = new javax.swing.JTextField();
        tfTipoCuerpoIng = new javax.swing.JTextField();
        tfIrcaIng = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObtener = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taProcesar = new javax.swing.JTextArea();
        btnObtener = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tfIdBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfNombreResul = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfIdResul = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfMunicipioResul = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfTipoAguaResul = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfTipoCuerpoResul = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfIrcaResul = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("ID");

        jLabel3.setText("Municipio");

        jLabel4.setText("Tipo de Agua");

        jLabel5.setText("Tipo de Cuerpo");

        jLabel6.setText("IRCA");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTipoCuerpoIng, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(tfMunicipioIng)
                            .addComponent(tfNombreIng))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfIdIng, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(tfTipoAguaIng)
                            .addComponent(tfIrcaIng))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombreIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMunicipioIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTipoAguaIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTipoCuerpoIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIrcaIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addComponent(btnIngresar)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingresar", jPanel1);

        taObtener.setColumns(20);
        taObtener.setRows(5);
        jScrollPane1.setViewportView(taObtener);

        taProcesar.setColumns(20);
        taProcesar.setRows(5);
        jScrollPane2.setViewportView(taProcesar);

        btnObtener.setText("Obtener Datos");
        btnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerActionPerformed(evt);
            }
        });

        btnProcesar.setText("Procesar Datos");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObtener))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcesar)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnObtener))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnProcesar)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Procesar Datos", jPanel2);

        jLabel7.setText("ID");

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Resultados busqueda");

        jLabel9.setText("Nombre");

        jLabel10.setText("Municipio");

        jLabel11.setText("Tipo de Agua");

        jLabel12.setText("Tipo de Cuerpo");

        jLabel13.setText("IRCA");

        jLabel14.setText("ID");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscar))
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(btEditar))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEliminar)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfNombreResul, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMunicipioResul, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(tfTipoCuerpoResul))))))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfIdResul)
                    .addComponent(tfTipoAguaResul, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(tfIrcaResul))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfNombreResul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdResul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfMunicipioResul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTipoAguaResul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfTipoCuerpoResul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIrcaResul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEditar)
                    .addComponent(btEliminar))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar/Eliminar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if (validar()){
           CuerpoDeAgua obj = new CuerpoDeAgua();
           obj.setNombre(tfNombreIng.getText());
           obj.setId(Integer.parseInt(tfIdIng.getText()));
           obj.setMunicipio(tfMunicipioIng.getText());
           obj.setTipoagua(tfTipoAguaIng.getText());
           obj.setTipocuerpo(tfTipoCuerpoIng.getText());
           obj.setIrca(Double.parseDouble(tfIrcaIng.getText()));
           String crearTabla = "CREATE TABLE IF NOT EXISTS cuerpoagua (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	nombre text NOT NULL,\n"
                + "	municipio text, \n"
                + "	tipoagua text, \n"
                + "	tipocuerpo text, \n"                
                 + "	irca double \n"
                + ");";
           String insertar = "INSERT INTO cuerpoagua(id, nombre, municipio, tipoagua, tipocuerpo, irca) VALUES (?, ?, ?, ?, ?, ?)";
            try {
                Connection datos = Conexion.conectar();
                Statement S = datos.createStatement();
                S.execute(crearTabla);
                PreparedStatement statement = datos.prepareStatement(insertar);
                statement.setInt(1, obj.getId());
                statement.setString(2, obj.getNombre());
                statement.setString(3, obj.getMunicipio());
                statement.setString(4, obj.getTipoagua());
                statement.setString(5, obj.getTipocuerpo());
                statement.setDouble(6, obj.getIrca());
                if (statement.executeUpdate() == 1){
                    JOptionPane.showMessageDialog(null, "Registro Ingresado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        limpiarformulario();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerActionPerformed
        taObtener.setText("");
        taProcesar.setText("");
        nombre1.clear();
        irca1.clear();
        String seleccionar = "SELECT * FROM cuerpoagua";
        Connection datos;
        try {
            datos = Conexion.conectar();
            Statement S = datos.createStatement();
            ResultSet resultado = S.executeQuery(seleccionar);
            String impresion = "";
            while(resultado.next()){
                nombre1.add(resultado.getString("nombre"));
                irca1.add(resultado.getDouble("irca"));
                impresion += resultado.getString("nombre") + " ";
                impresion += resultado.getInt("id") + " ";
                impresion += resultado.getString("municipio") + " ";
                impresion += resultado.getString("tipoagua") + " ";
                impresion += resultado.getString("tipocuerpo") + " ";
                impresion += resultado.getDouble("irca") + "\n";
            }
            taObtener.setText(impresion);
        } catch (SQLException ex) {
            Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnObtenerActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        taProcesar.setText("");
        taProcesar.setText((CuerpoDeAgua.nivel(nombre1, irca1).toString()) + 
                (CuerpoDeAgua.Analisis(irca1).toString()) + "\n" 
                + (CuerpoDeAgua.Sinriesgo(irca1).toString()) 
                + (CuerpoDeAgua.Estadistica(irca1).toString()) + "\n");
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String seleccionar = "SELECT * FROM cuerpoagua WHERE id = ?";
        Connection datos;
        try {
            datos = Conexion.conectar();
            PreparedStatement statement = datos.prepareStatement(seleccionar);
            statement.setInt(1, (Integer.parseInt(tfIdBuscar.getText())));
            ResultSet resultado = statement.executeQuery();
            while(resultado.next()){
                tfNombreResul.setText(resultado.getString("nombre"));
                tfIdResul.setText(String.valueOf(resultado.getInt("id")));
                tfMunicipioResul.setText(resultado.getString("municipio"));
                tfTipoAguaResul.setText(resultado.getString("tipoagua"));
                tfTipoCuerpoResul.setText(resultado.getString("tipocuerpo"));
                tfIrcaResul.setText(String.valueOf(resultado.getDouble("irca")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiarformulario();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if (validaractualizar()){
           CuerpoDeAgua obj = new CuerpoDeAgua();
           obj.setNombre(tfNombreResul.getText());
           obj.setId(Integer.parseInt(tfIdResul.getText()));
           obj.setMunicipio(tfMunicipioResul.getText());
           obj.setTipoagua(tfTipoAguaResul.getText());
           obj.setTipocuerpo(tfTipoCuerpoResul.getText());
           obj.setIrca(Double.parseDouble(tfIrcaResul.getText()));
           String insertar = "UPDATE cuerpoagua SET nombre = ?, municipio = ?, tipoagua = ?, tipocuerpo = ?, irca = ? WHERE id = ?";
            try {
                Connection datos = Conexion.conectar();
                PreparedStatement statement = datos.prepareStatement(insertar);
                statement.setInt(6, obj.getId());
                statement.setString(1, obj.getNombre());
                statement.setString(2, obj.getMunicipio());
                statement.setString(3, obj.getTipoagua());
                statement.setString(4, obj.getTipocuerpo());
                statement.setDouble(5, obj.getIrca());
                if (statement.executeUpdate() == 1){
                    JOptionPane.showMessageDialog(null, "Registro Editado");
                }
            } catch (SQLException ex) {
                Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
        limpiarbusqueda();
    }//GEN-LAST:event_btEditarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        String seleccionar = "DELETE FROM cuerpoagua WHERE id = ?";
        Connection datos;
        try {
            datos = Conexion.conectar();
            PreparedStatement statement = datos.prepareStatement(seleccionar);
            statement.setInt(1, (Integer.parseInt(tfIdResul.getText())));
            if (statement.executeUpdate() == 1){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(reto4.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiarbusqueda();
    }//GEN-LAST:event_btEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reto4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnObtener;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea taObtener;
    private javax.swing.JTextArea taProcesar;
    private javax.swing.JTextField tfIdBuscar;
    private javax.swing.JTextField tfIdIng;
    private javax.swing.JTextField tfIdResul;
    private javax.swing.JTextField tfIrcaIng;
    private javax.swing.JTextField tfIrcaResul;
    private javax.swing.JTextField tfMunicipioIng;
    private javax.swing.JTextField tfMunicipioResul;
    private javax.swing.JTextField tfNombreIng;
    private javax.swing.JTextField tfNombreResul;
    private javax.swing.JTextField tfTipoAguaIng;
    private javax.swing.JTextField tfTipoAguaResul;
    private javax.swing.JTextField tfTipoCuerpoIng;
    private javax.swing.JTextField tfTipoCuerpoResul;
    // End of variables declaration//GEN-END:variables

    private boolean validar() {
        if (tfNombreIng.getText() == "" || tfIdIng.getText() == "" || tfMunicipioIng.getText() == "" ||  
                tfTipoAguaIng.getText() == "" || tfTipoCuerpoIng.getText() == "" || tfIrcaIng.getText() == ""){
            return false;
        } else {
            return true;
        }
    }
    
    private boolean validaractualizar() {
        if (tfNombreResul.getText() == "" || tfIdResul.getText() == "" || tfMunicipioResul.getText() == "" ||  
                tfTipoAguaResul.getText() == "" || tfTipoCuerpoResul.getText() == "" || tfIrcaResul.getText() == ""){
            return false;
        } else {
            return true;
        }
    }
    
    private void limpiarformulario() {
        tfNombreIng.setText("");
        tfIdIng.setText("");
        tfMunicipioIng.setText("");
        tfTipoAguaIng.setText("");
        tfTipoCuerpoIng.setText("");
        tfIrcaIng.setText("");
        tfIdBuscar.setText("");
    }
    
    private void limpiarbusqueda() {
        tfNombreResul.setText("");
        tfIdResul.setText("");
        tfMunicipioResul.setText("");
        tfTipoAguaResul.setText("");
        tfTipoCuerpoResul.setText("");
        tfIrcaResul.setText("");
        tfIdResul.setText("");
    }
}
