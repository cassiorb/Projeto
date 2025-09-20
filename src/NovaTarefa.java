
import javax.swing.*;
public class NovaTarefa extends javax.swing.JFrame {
    private Tarefas telaTarefas;
    private Usuarios.Usuario usuarioLogado;

    public NovaTarefa(Tarefas telaTarefas, Usuarios.Usuario usuarioLogado) {
        this.telaTarefas = telaTarefas;
        this.usuarioLogado = usuarioLogado;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxTitulo = new javax.swing.JTextField();
        TxDesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxResp = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        CbBaixa = new javax.swing.JCheckBox();
        CbMedia = new javax.swing.JCheckBox();
        CbAlta = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        BtCriar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 500));
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(217, 217, 217));
        jPanel5.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel5.setLayout(null);

        jPanel6.setMinimumSize(new java.awt.Dimension(200, 300));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 65, 108));
        jLabel1.setText("Criação de tarefa");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 65, 108));
        jLabel2.setText("Título da tarefa");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 65, 108));
        jLabel3.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 65, 108));
        jLabel4.setText("Data meta");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 65, 108));
        jLabel5.setText("Responsável");

        jPanel7.setBackground(new java.awt.Color(231, 231, 231));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(CbBaixa);
        CbBaixa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CbBaixa.setForeground(new java.awt.Color(57, 65, 108));
        CbBaixa.setText("Baixa");

        buttonGroup1.add(CbMedia);
        CbMedia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CbMedia.setForeground(new java.awt.Color(57, 65, 108));
        CbMedia.setText("Média");
        CbMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbMediaActionPerformed(evt);
            }
        });

        buttonGroup1.add(CbAlta);
        CbAlta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CbAlta.setForeground(new java.awt.Color(57, 65, 108));
        CbAlta.setText("Alta");
        CbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(CbBaixa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbMedia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbAlta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbBaixa)
                    .addComponent(CbMedia)
                    .addComponent(CbAlta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 65, 108));
        jLabel6.setText("Prioridade");

        BtCriar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtCriar.setForeground(new java.awt.Color(136, 152, 242));
        BtCriar.setText("Criar tarefa");
        BtCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCriarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(113, 113, 113))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(TxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(TxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxResp, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(BtCriar)
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(148, 148, 148))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxData, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxResp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BtCriar)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 0, 500, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbMediaActionPerformed

    }//GEN-LAST:event_CbMediaActionPerformed

    private void CbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAltaActionPerformed

    }//GEN-LAST:event_CbAltaActionPerformed

    private void BtCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCriarActionPerformed
        String titulo = TxTitulo.getText().trim();
        String descricao = TxDesc.getText().trim();
        String dataMeta = TxData.getText().trim();
        String responsavel = TxResp.getText().trim();
        String prioridade = getPrioridadeSelecionada();

        if (titulo.isEmpty() || descricao.isEmpty() || dataMeta.isEmpty() || responsavel.isEmpty() || prioridade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para criação da tarefa, é necessário informar todos os campos.");
            return;

        }
        if (!dataMeta.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{2}$")) {
        JOptionPane.showMessageDialog(this, "A data deve estar no formato DD/MM/AA e ser uma data válida.");
        TxData.requestFocus();
        return;
        }
        
        if (Tarefas.tituloExiste(titulo)) {
        JOptionPane.showMessageDialog(this, "Já existe uma tarefa com o título: \"" + titulo + "\".\nEscolha outro título.");
        TxTitulo.requestFocus();
        return;
        }
        
        telaTarefas.adicionarTarefa(titulo, descricao, dataMeta, responsavel, prioridade);
        
        if (telaTarefas != null) {
            telaTarefas.atualizarTabela();
        }


        JOptionPane.showMessageDialog(this, "Tarefa criada com sucesso!");
        TxTitulo.setText("");
        TxDesc.setText("");
        TxData.setText("");
        TxResp.setText("");
        buttonGroup1.clearSelection();
        
    }//GEN-LAST:event_BtCriarActionPerformed
    private String getPrioridadeSelecionada() {
        if (CbBaixa.isSelected()) return "Baixa";
        if (CbMedia.isSelected()) return "Média";
        if (CbAlta.isSelected()) return "Alta";
        return "";
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCriar;
    private javax.swing.JCheckBox CbAlta;
    private javax.swing.JCheckBox CbBaixa;
    private javax.swing.JCheckBox CbMedia;
    private javax.swing.JTextField TxData;
    private javax.swing.JTextField TxDesc;
    private javax.swing.JTextField TxResp;
    private javax.swing.JTextField TxTitulo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
