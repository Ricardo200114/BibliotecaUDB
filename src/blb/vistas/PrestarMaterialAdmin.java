package blb.vistas;


import blb.controlador.AdminControlador;
import blb.controlador.MaterialControlador;
import blb.controlador.PrestamoControlador;
import blb.controlador.UsuarioControlador;
import blb.modelo.Administracion;
import blb.modelo.Materiales;
import blb.modelo.Prestamos;
import blb.modelo.Usuarios;
import blb.utilidad.Utilidades;
import javax.swing.JOptionPane;



public class PrestarMaterialAdmin extends javax.swing.JPanel {

    /**
     * Creates new form Vista1
     */
    public PrestarMaterialAdmin() {
        initComponents();
        cargarDatos();
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
        jLabel3 = new javax.swing.JLabel();
        material_idTxt = new javax.swing.JTextField();
        prestarBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMateriales = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de préstamos ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese el ID de material:");

        prestarBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prestarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedir-prestado.png"))); // NOI18N
        prestarBtn.setText("Prestar");
        prestarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese el ID de usuario:");

        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });

        tblMateriales.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMateriales);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/devolucion-de-producto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(prestarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(material_idTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(prestarBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(material_idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void prestarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarBtnActionPerformed

        String id_u = userTxt.getText().toUpperCase();
        String id_l = material_idTxt.getText().toUpperCase();

        if (material_idTxt.getText().equals("") || userTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Error, no puedes dejar campos vacíos...");
            return;
        }
        
        if (!id_u.matches("^[A-Za-z]{2}\\d{6}$")) {
            JOptionPane.showMessageDialog(null, "El No de ID debe de conterner 2 letras y 6 digitos...");
            return;
        }
        
        if (!id_l.matches("^[A-Za-z]{3}\\d{4}$")) {
            JOptionPane.showMessageDialog(null, "El codigo del material debe de conterner 3 letras y 4 digitos...");
            return;
        }

        try {
            
            AdminControlador ac = new AdminControlador();
            Administracion admin = ac.consultarAdmin();
            
            UsuarioControlador uc = new UsuarioControlador();
            Usuarios u = uc.consultarPorId(id_u);
            
            //VALIDACION DE USUARIO REGISTRADO.....
            if (u == null) {
                JOptionPane.showMessageDialog(null, "Error, no se encontró ningun usuario con ID: " + id_u + " favor ingresar un ID válido...");
                return;
            } 

            MaterialControlador mc = new MaterialControlador();
            Materiales l = mc.consultarMaterial(id_l);
            
            //VALIDACION DE MATERIAL REGISTRADO.....
            if (l == null) {
                JOptionPane.showMessageDialog(null, "Error, no se encontró ningun material con ID: " + id_l + " favor ingresar un ID válido...");
                return;
            } 
            //VALIDACION DE DISPONIBILIDAD DE MATERIAL A PRESTAR.....
            else if (l.getUnidades() < 1) {
                JOptionPane.showMessageDialog(null, "Error, el material que estas buscando no esta disponible...");
                return;
            }

            PrestamoControlador pc = new PrestamoControlador();
            Prestamos pActual = pc.getLending(u, l);
            
            //VALIDACION DE PRESTAMOS ACTUALES.....
            if (pActual != null) {
                JOptionPane.showMessageDialog(null, "Error, no puedes prestar el mismo material, vuelve a intentarlo...");
                return;
            }

            //VALIDACION PARA ESTUDIANTES SOLO TIENE PERMITIDO N PRESTAMOS DE ACUERDO A LA INFORMACION EN BASE DE DATOS.....
            if (u.getOficio().equals("ESTUDIANTE") && pc.cantidadPrestamos(u) >= admin.getMaterialEstudiante()) {
                JOptionPane.showMessageDialog(null, "Lo siento, solo tienes permitidio prestar 3 materiales como máximo...");
                return;
            }

            //VALIDACION PARA PROFESORES SOLO TIENE PERMITIDO N PRESTAMOS DE ACUERDO A LA INFORMACION EN BASE DE DATOS.....
            if (u.getOficio().equals("PROFESOR") && pc.cantidadPrestamos(u) >= admin.getMaterialProfesor()) {
                JOptionPane.showMessageDialog(null, "Lo siento, solo tienes permitidio prestar 6 materiales como máximo...");
                return;
            }

            if (u.getOficio().equals("ADMINISTRADOR"));
    
            //VALIDACION PARA USUARIOS CON RECARGO POR ENTREGA TARDIA.....
            if (u.getRecargo_mora() != 0) {
                JOptionPane.showMessageDialog(null, "Lo siento, Se ha detectado que tienes un recargo por entrega tardía de: " + u.getRecargo_mora()
                        + "$,  Favor cancelar el recargo para que puedas prestar otro material...");
                return;
            }
            
            String idUser = u.getIdUser();
            String nombreUser = u.getNombre()+ " " + u.getApellido();
            String idMaterial = l.getCodId();
            String nombreMaterial = l.getNombreMaterial();

            Prestamos p = new Prestamos(idUser,idUser,nombreUser,idMaterial,nombreMaterial,Utilidades.fechaActual());
                    
            pc.registrar(p);

            l.setUnidades(l.getUnidades() - 1);
            mc.modificar(l);
            JOptionPane.showMessageDialog(null, "Material ID: " + l.getCodId() + " prestado exitosamente...");

            userTxt.setText("");
            material_idTxt.setText("");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_prestarBtnActionPerformed

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    public void cargarDatos() {
        MaterialControlador mc = new MaterialControlador();
        tblMateriales.setModel(mc.listarMateriales());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField material_idTxt;
    private javax.swing.JButton prestarBtn;
    public static javax.swing.JTable tblMateriales;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
