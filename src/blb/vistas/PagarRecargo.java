package blb.vistas;

import blb.controlador.UsuarioControlador;
import blb.modelo.Usuarios;
import blb.utilidad.Utilidades;
import javax.swing.JOptionPane;


public class PagarRecargo extends javax.swing.JPanel {

    /**
     * Creates new form Vista1
     */
    public PagarRecargo() {
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
        montoTxt = new javax.swing.JTextField();
        pagarRecargoBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbNombre1 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        lbMonto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de pago de mora");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Monto a cancelar:");

        pagarRecargoBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pagarRecargoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/metodo-de-pago.png"))); // NOI18N
        pagarRecargoBtn.setText("Pagar");
        pagarRecargoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarRecargoBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre:");

        lbNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNombre.setText("[Nombre de usuario]");

        lbNombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNombre1.setText("No de ID:");

        lbID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbID.setText("[No de ID]");

        lbMonto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMonto.setText("[Cantidad de recargo]");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Su monto de mora asciende a:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pedir-prestado (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(pagarRecargoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(montoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(107, 107, 107))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNombre)
                            .addComponent(jLabel4))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(77, 77, 77))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbMonto)
                                .addGap(86, 86, 86))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(montoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbNombre1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(lbNombre)
                    .addComponent(lbMonto))
                .addGap(18, 18, 18)
                .addComponent(pagarRecargoBtn)
                .addGap(176, 176, 176))
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

    private void pagarRecargoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarRecargoBtnActionPerformed

        String id_U = LogIn.userTxt.getText();
        String id_P = LogIn.passwordTxt.getText();

        String monto = montoTxt.getText();

        if (montoTxt.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Error, no puedes dejar campos vacíos...");
            return;
        }
        
        if (!Utilidades.verificarNumero(monto)) {
            JOptionPane.showMessageDialog(null, "Error, has ingresado un dato que no es númerico...");
            return;
        }

        try {
            
            UsuarioControlador uc = new UsuarioControlador();
            Usuarios u = uc.log_In(id_U, id_P);

            if (u.getRecargo_mora() == 0) {
                JOptionPane.showMessageDialog(null, "Error, no se ha encontrado ningún recargo de mora en tu cuenta...");
                lbMonto.setText("No tienes ningún recargo.");
                return;
            }

            if (Integer.parseInt(monto) < u.getRecargo_mora()) {

                JOptionPane.showMessageDialog(null, "Error, el recargo es mayor a la cantidad ingresada...");
                return;
            }

            int pagoMora = Integer.parseInt(monto) - u.getRecargo_mora();
            u.setRecargo_mora(0);
            uc.pagarRecargo(u);

            JOptionPane.showMessageDialog(null, "El pago ha sido realizado con exito, tu cambio es de: " + pagoMora + "$");

            montoTxt.setText("");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_pagarRecargoBtnActionPerformed

    public void cargarDatos() {

        String id_U = LogIn.userTxt.getText();
        String id_P = LogIn.passwordTxt.getText();

        UsuarioControlador uc = new UsuarioControlador();
        Usuarios u = uc.log_In(id_U, id_P);

        lbNombre.setText(u.getNombre() + " " + u.getApellido());
        lbID.setText(u.getIdUser());
        
        if (u.getRecargo_mora() == 0) {
            
            lbMonto.setText("No tienes ningún recargo.");
        
        } else if (u.getRecargo_mora() != 0) {
            
            lbMonto.setText("Tienes un recargo por " + u.getRecargo_mora() + "$");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbID;
    public static javax.swing.JLabel lbMonto;
    public static javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombre1;
    private javax.swing.JTextField montoTxt;
    private javax.swing.JButton pagarRecargoBtn;
    // End of variables declaration//GEN-END:variables
}