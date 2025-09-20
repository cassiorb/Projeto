
import javax.swing.*;
public class Login extends javax.swing.JFrame {
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new Login().setVisible(true);
    });
}
    
    
    public Login telaLogin;

    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtEntrar = new javax.swing.JButton();
        TxSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(57, 65, 108));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem-vindo ao sistema de gerenciamento Taskio!");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("E-mail");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");

        BtEntrar.setBackground(new java.awt.Color(101, 125, 253));
        BtEntrar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        BtEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BtEntrar.setText("Entrar");
        BtEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(TxUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(TxSenha))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(BtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(150, Short.MAX_VALUE))
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

    private void BtEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEntrarActionPerformed
    String email = TxUsuario.getText().trim();
    String senha = new String(TxSenha.getPassword());
    if (email.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha e-mail e senha.");
        return;
    }        
    
    Usuarios.Usuario usuario = Usuarios.validarLogin(email, senha);
    
    if (usuario != null) {
        JOptionPane.showMessageDialog(this, 
            "Login realizado com sucesso!\n" +
            "Usuário: " + usuario.getEmail() + "\n" +
            "Perfil: " + usuario.getTipo().toUpperCase());    
            Tarefas telaTarefas = new Tarefas(this, usuario);
            telaTarefas.setVisible(true);
            this.dispose();
    }
    else {
        JOptionPane.showMessageDialog(this, 
            "E-mail ou senha incorretos.\n" +
            "Verifique os dados e tente novamente.", 
            "Erro de Login", 
            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_BtEntrarActionPerformed

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEntrar;
    private javax.swing.JPasswordField TxSenha;
    private javax.swing.JTextField TxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
