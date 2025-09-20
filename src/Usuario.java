import java.sql.*;
import javax.swing.*;
public class Usuario extends javax.swing.JFrame {
    public Usuario() {
    initComponents();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        CbTecnico = new javax.swing.JCheckBox();
        CbSupervisor = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        BtCriar = new javax.swing.JButton();
        TxSenha = new javax.swing.JPasswordField();
        TxConfirmar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 700));

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setLayout(null);

        jPanel3.setMinimumSize(new java.awt.Dimension(200, 300));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 300));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 65, 108));
        jLabel1.setText("Criação de usuário");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 65, 108));
        jLabel2.setText("E-mail");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 65, 108));
        jLabel4.setText("Senha");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 65, 108));
        jLabel5.setText("Confirmar senha");

        jPanel4.setBackground(new java.awt.Color(231, 231, 231));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(CbTecnico);
        CbTecnico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CbTecnico.setForeground(new java.awt.Color(57, 65, 108));
        CbTecnico.setText("Técnico");

        buttonGroup1.add(CbSupervisor);
        CbSupervisor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CbSupervisor.setForeground(new java.awt.Color(57, 65, 108));
        CbSupervisor.setText("Supervisor");
        CbSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbSupervisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(CbTecnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(CbSupervisor)
                .addGap(5, 5, 5))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbTecnico)
                    .addComponent(CbSupervisor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 65, 108));
        jLabel6.setText("Nível de acesso");

        BtCriar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtCriar.setForeground(new java.awt.Color(136, 152, 242));
        BtCriar.setText("Criar usuário");
        BtCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCriarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(TxEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxSenha)
                                .addComponent(TxConfirmar)))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(BtCriar)
                        .addGap(164, 164, 164))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BtCriar)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 500, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbSupervisorActionPerformed

    }//GEN-LAST:event_CbSupervisorActionPerformed

    private void BtCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCriarActionPerformed
        String email = TxEmail.getText().trim();
        String senha = new String(TxSenha.getPassword());
        String confirmar = new String(TxConfirmar.getPassword());
        String tipo = CbTecnico.isSelected() ? "tecnico" : "supervisor";

        // Validações
        if (email.isEmpty() || senha.isEmpty() || confirmar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            return;
        }

        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(this, "E-mail inválido.");
            return;
        }

        if (!senha.equals(confirmar)) {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem.");
            return;
        }

        // Verificar se o e-mail já existe no banco
        if (emailJaCadastrado(email)) {
            JOptionPane.showMessageDialog(this, "Este e-mail já está cadastrado.");
            return;
        }

        // Salvar no banco
        if (cadastrarUsuario(email, senha, tipo)) {
            JOptionPane.showMessageDialog(this,
                "Usuário '" + email + "' criado com sucesso!\n" +
                "Tipo: " + tipo.substring(0, 1).toUpperCase() + tipo.substring(1));
            this.dispose(); // Fecha a janela
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao criar usuário no banco de dados.");
        }
    }//GEN-LAST:event_BtCriarActionPerformed
    private boolean emailJaCadastrado(String email) {
        String sql = "SELECT COUNT(*) FROM usuarios WHERE email = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    private boolean cadastrarUsuario(String email, String senha, String tipo) {
        String sql = "INSERT INTO usuarios (email, senha, tipo) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, senha); // Em produção: use hash (ex: BCrypt)
            stmt.setString(3, tipo);

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCriar;
    private javax.swing.JCheckBox CbSupervisor;
    private javax.swing.JCheckBox CbTecnico;
    private javax.swing.JPasswordField TxConfirmar;
    private javax.swing.JTextField TxEmail;
    private javax.swing.JPasswordField TxSenha;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
