package blb.vistas;

import blb.controlador.MaterialControlador;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class MainMenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        prestarMaterialBtn = new javax.swing.JButton();
        devolverMaterialBtn = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        actualizarAdminBtn = new javax.swing.JButton();
        pagarRecargoBtn = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        registrarUsuarioBtn = new javax.swing.JButton();
        registrarMaterialBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        bg.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido a biblioteca UDB");

        prestarMaterialBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        prestarMaterialBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedir-prestado.png"))); // NOI18N
        prestarMaterialBtn.setText(" Prestar material");
        prestarMaterialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestarMaterialBtnActionPerformed(evt);
            }
        });

        devolverMaterialBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        devolverMaterialBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/caja-de-devolucion.png"))); // NOI18N
        devolverMaterialBtn.setText("Devolver material");
        devolverMaterialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolverMaterialBtnActionPerformed(evt);
            }
        });

        content.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        actualizarAdminBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualizarAdminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar-pagina.png"))); // NOI18N
        actualizarAdminBtn.setText("Actualizar ");
        actualizarAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarAdminBtnActionPerformed(evt);
            }
        });

        pagarRecargoBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pagarRecargoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/metodo-de-pago.png"))); // NOI18N
        pagarRecargoBtn.setText("Pagar recargo");
        pagarRecargoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarRecargoBtnActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        registrarUsuarioBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrarUsuarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        registrarUsuarioBtn.setText("Registrar Usuario");
        registrarUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioBtnActionPerformed(evt);
            }
        });

        registrarMaterialBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrarMaterialBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carpeta.png"))); // NOI18N
        registrarMaterialBtn.setText("Registrar material");
        registrarMaterialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMaterialBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione la acción que desea realizar:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca2.png"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(registrarUsuarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(actualizarAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(prestarMaterialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(devolverMaterialBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pagarRecargoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarMaterialBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(51, 51, 51))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prestarMaterialBtn)
                    .addComponent(devolverMaterialBtn)
                    .addComponent(registrarMaterialBtn))
                .addGap(8, 8, 8)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrarUsuarioBtn)
                            .addComponent(pagarRecargoBtn))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(actualizarAdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prestarMaterialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestarMaterialBtnActionPerformed

        PrestarMaterialAdmin v = new PrestarMaterialAdmin();
        mostrarPanel(v);

    }//GEN-LAST:event_prestarMaterialBtnActionPerformed

    private void devolverMaterialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolverMaterialBtnActionPerformed

        DevolverMaterialAdmin v = new DevolverMaterialAdmin();
        mostrarPanel(v);

    }//GEN-LAST:event_devolverMaterialBtnActionPerformed

    private void actualizarAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarAdminBtnActionPerformed

        ActualizarAdministracion v = new ActualizarAdministracion();
        mostrarPanel(v);
    }//GEN-LAST:event_actualizarAdminBtnActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        LogIn lg = new LogIn();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void pagarRecargoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarRecargoBtnActionPerformed

        PagarRecargoAdmin v = new PagarRecargoAdmin();
        mostrarPanel(v);
    }//GEN-LAST:event_pagarRecargoBtnActionPerformed

    private void registrarUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioBtnActionPerformed

        RegistrarUsuario v = new RegistrarUsuario();
        mostrarPanel(v);
    }//GEN-LAST:event_registrarUsuarioBtnActionPerformed

    private void registrarMaterialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMaterialBtnActionPerformed

        RegistrarMaterial v = new RegistrarMaterial();
        mostrarPanel(v);
    }//GEN-LAST:event_registrarMaterialBtnActionPerformed

    private void mostrarPanel(JPanel p) {

        p.setSize(658, 421);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarAdminBtn;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel content;
    private javax.swing.JButton devolverMaterialBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton pagarRecargoBtn;
    private javax.swing.JButton prestarMaterialBtn;
    private javax.swing.JButton registrarMaterialBtn;
    private javax.swing.JButton registrarUsuarioBtn;
    // End of variables declaration//GEN-END:variables
}
