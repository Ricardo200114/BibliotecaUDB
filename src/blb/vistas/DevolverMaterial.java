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


public class DevolverMaterial extends javax.swing.JPanel {

    //SE CONSULTA LA BASE DE DATOS PARA OBTENER EL COSTO POR ENTREGA TARDIA DE ACUERDO A SU PROFESION.....
    AdminControlador ac = new AdminControlador();
    Administracion admin = ac.consultarAdmin();
    
    private final int diaLimiteEstudiante = admin.getDiaEstudiante();
    private final int recargoMoraEstudiante = admin.getMoraEstudiante();
    
    private final int diaLimiteProfesor = admin.getDiaProfesor();
    private final int recargoMoraProfesor = admin.getMoraProfesor();

    public DevolverMaterial() {
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
        devolverBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de devolución");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ingrese el ID de material a devolver:");

        devolverBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        devolverBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caja-de-devolucion.png"))); // NOI18N
        devolverBtn.setText("Devolver");
        devolverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverBtnActionPerformed(evt);
            }
        });

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPrestamos);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/devolucion-de-producto.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2)
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(material_idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(devolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(material_idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(devolverBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void devolverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverBtnActionPerformed

        String id_U = LogIn.userTxt.getText().toUpperCase();
        String id_P = LogIn.passwordTxt.getText().toUpperCase();
        
        String id_l = material_idTxt.getText().toUpperCase();

        if (material_idTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Error, no puedes dejar campos vacíos...");
            return;
        }
        
        if (!id_l.matches("^[A-Za-z]{3}\\d{4}$")) {
            JOptionPane.showMessageDialog(null, "El codigo del material debe de conterner 3 letras y 4 digitos...");
            return;
        }

        try {
           
            UsuarioControlador uc = new UsuarioControlador();
            Usuarios u = uc.log_In(id_U, id_P);
            
            MaterialControlador lc = new MaterialControlador();
            Materiales l = lc.consultarMaterial(id_l);
            
            //VALIDACION DE MATERIAL REGISTRADO.....
            if (l == null) {
                JOptionPane.showMessageDialog(null, "Error, no se encontró ningun material con ID: " + id_l + " favor ingresar un ID válido...");
                return;
            }

            PrestamoControlador pc = new PrestamoControlador();
            Prestamos p = pc.getLending(u, l);
            
            //VALIDACION DE PRESTAMOS ACTUALES.....
            if (p == null) {
                JOptionPane.showMessageDialog(null, "Error, no se pudo encontrar prestamo correspondiente al material que estas tratando de devolver...");
                return;
            }

            p.setF_devolucion(Utilidades.fechaActual());
            pc.modificar(p);

            l.setUnidades(l.getUnidades() + 1);
            lc.modificar(l);
            JOptionPane.showMessageDialog(null, "Material ID: " + l.getCodId() + " devuelto exitosamente...");

            material_idTxt.setText("");
            
            int dias = Utilidades.diferenciasDeFechas(p.getF_prestamos(), Utilidades.fechaActual());
            
            //SE APLICA RECARGO A ESTUDIANTES DE ACUERDO A LA INFORMACION EN BASE DE DATOS.....
            if (u.getOficio().equals("ESTUDIANTE") && dias > diaLimiteEstudiante) {

                int dia_retraso = dias - diaLimiteEstudiante;
                int recargo = dia_retraso * recargoMoraEstudiante;

                u.setRecargo_mora(u.getRecargo_mora() + recargo);
                uc.sancionar(u);

                JOptionPane.showMessageDialog(null, "RECARGO POR DEVOLUCIÓN TARDÍA HA SIDO APLICADO, EL TOTAL A PAGAR ES DE: " + recargo + "$");

            } 
            //SE APLICA RECARGO A PROFESORES DE ACUERDO A LA INFORMACION EN BASE DE DATOS.....
            else if (u.getOficio().equals("PROFESOR") && dias > diaLimiteEstudiante) {
                
                int dia_retraso = dias - diaLimiteProfesor;
                int recargo = dia_retraso * recargoMoraProfesor;

                u.setRecargo_mora(u.getRecargo_mora() + recargo);
                uc.sancionar(u);

                JOptionPane.showMessageDialog(null, "RECARGO POR DEVOLUCIÓN TARDÍA HA SIDO APLICADO, EL TOTAL A PAGAR ES DE: " + recargo + "$");

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_devolverBtnActionPerformed

    public void cargarDatos() {
        
        String id_U = LogIn.userTxt.getText().toUpperCase();
        String id_P = LogIn.passwordTxt.getText().toUpperCase();
        
        PrestamoControlador mc = new PrestamoControlador();
        UsuarioControlador uc = new UsuarioControlador(); 
        Usuarios u = uc.log_In(id_U, id_P);
        
        tblPrestamos.setModel(mc.listarPrestamosPorUsuario(u.getIdUser()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton devolverBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField material_idTxt;
    private javax.swing.JTable tblPrestamos;
    // End of variables declaration//GEN-END:variables
}
