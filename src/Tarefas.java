import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Tarefas extends javax.swing.JFrame {
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new Login().setVisible(true);
    });
}
    private JFrame telaAnterior;
    private Usuarios.Usuario usuarioLogado;
    
    public Tarefas() {
        initComponents();
    }
    
    public void adicionarTarefa(String titulo, String descricao, String dataMeta, String responsavel, String prioridade) {
    String sql = "INSERT INTO tarefas (titulo, descricao, data_meta, responsavel, prioridade, usuario_id) " +
                 "VALUES (?, ?, ?, ?, ?, (SELECT id FROM usuarios WHERE email = ?))";

    try (Connection conn = Conexao.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, titulo);
        stmt.setString(2, descricao);
        stmt.setString(3, dataMeta);
        stmt.setString(4, responsavel);
        stmt.setString(5, prioridade);
        stmt.setString(6, this.usuarioLogado.getEmail());

        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao salvar tarefa no banco.");
    }
    }   
    public static boolean tituloExiste(String titulo) {
        String sql = "SELECT COUNT(*) FROM tarefas WHERE LOWER(titulo) = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo.trim().toLowerCase());
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
    public static void concluirTarefa(String titulo) {
        String sql = "UPDATE tarefas SET concluida = TRUE WHERE titulo = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Tarefa> filtrarTarefas(String filtro) {
        List<Tarefa> tarefas = new ArrayList<>();
        String sql = "SELECT titulo, descricao, data_meta, responsavel, prioridade, concluida " +
                     "FROM tarefas WHERE LOWER(titulo) LIKE ? ORDER BY id DESC";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + filtro.toLowerCase().trim() + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Tarefa t = new Tarefa(
                        rs.getString("titulo"),
                        rs.getString("descricao"),
                        rs.getString("data_meta"),
                        rs.getString("responsavel"),
                        rs.getString("prioridade")
                    );
                    t.setConcluida(rs.getBoolean("concluida"));
                    tarefas.add(t);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tarefas;
    }
    public static String getDescricao(String titulo) {
        String sql = "SELECT descricao FROM tarefas WHERE titulo = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("descricao");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Descrição não encontrada";
    }
    public void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        model.setRowCount(0); // Limpa a tabela

        String sql = "SELECT titulo, responsavel, prioridade, data_meta, concluida FROM tarefas ORDER BY id DESC";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("titulo"),
                    rs.getString("responsavel"),
                    rs.getString("prioridade"),
                    rs.getString("data_meta"),
                    rs.getBoolean("concluida") ? "Sim" : "Não"
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar tarefas.");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BtCriarUsuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TxBuscar = new javax.swing.JTextField();
        BtBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BtVisualizar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtTarefa = new javax.swing.JButton();
        BtConcluir = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));
        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel2.setLayout(null);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tabela.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Tabela.setForeground(new java.awt.Color(0, 0, 153));
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tarefa", "Responsável", "Prioridade", "Data meta", "Concluído"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.setGridColor(new java.awt.Color(136, 152, 242));
        Tabela.setMaximumSize(new java.awt.Dimension(1366, 768));
        Tabela.setRowHeight(40);
        Tabela.setSelectionBackground(new java.awt.Color(204, 204, 204));
        Tabela.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Tabela.setShowGrid(true);
        Tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tabela);
        if (Tabela.getColumnModel().getColumnCount() > 0) {
            Tabela.getColumnModel().getColumn(0).setResizable(false);
            Tabela.getColumnModel().getColumn(0).setPreferredWidth(650);
            Tabela.getColumnModel().getColumn(1).setResizable(false);
            Tabela.getColumnModel().getColumn(1).setPreferredWidth(100);
            Tabela.getColumnModel().getColumn(2).setResizable(false);
            Tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
            Tabela.getColumnModel().getColumn(3).setResizable(false);
            Tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
            Tabela.getColumnModel().getColumn(4).setResizable(false);
            Tabela.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(90, 90, 1260, 750);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(136, 152, 242)));

        BtCriarUsuario.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        BtCriarUsuario.setForeground(new java.awt.Color(136, 152, 242));
        BtCriarUsuario.setText("👨‍");
        BtCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCriarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtCriarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(784, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, -10, 90, 850);

        TxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxBuscarActionPerformed(evt);
            }
        });

        BtBuscar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtBuscar.setForeground(new java.awt.Color(136, 152, 242));
        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(TxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtBuscar)
                .addContainerGap(724, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtBuscar)))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(90, 50, 1280, 40);

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(136, 152, 242)));

        BtVisualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtVisualizar.setForeground(new java.awt.Color(136, 152, 242));
        BtVisualizar.setText("Visualizar");
        BtVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVisualizarActionPerformed(evt);
            }
        });

        BtExcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtExcluir.setForeground(new java.awt.Color(136, 152, 242));
        BtExcluir.setText("Excluir");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        BtTarefa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtTarefa.setForeground(new java.awt.Color(136, 152, 242));
        BtTarefa.setText("Nova tarefa");
        BtTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTarefaActionPerformed(evt);
            }
        });

        BtConcluir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtConcluir.setForeground(new java.awt.Color(136, 152, 242));
        BtConcluir.setText("Concluir");
        BtConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConcluirActionPerformed(evt);
            }
        });

        BtVoltar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        BtVoltar.setForeground(new java.awt.Color(136, 152, 242));
        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(BtTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 557, Short.MAX_VALUE)
                .addComponent(BtVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(-10, -10, 1470, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTarefaActionPerformed
        NovaTarefa criar = new NovaTarefa(this, usuarioLogado);
        criar.setVisible(true);
    }//GEN-LAST:event_BtTarefaActionPerformed

    private void TxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxBuscarActionPerformed

    }//GEN-LAST:event_TxBuscarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        int selectedRow = Tabela.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para excluir.");
            return;
        }
        String titulo = Tabela.getValueAt(selectedRow, 0).toString();

        String sql = "DELETE FROM tarefas WHERE titulo = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            stmt.executeUpdate();
            atualizarTabela(); // Atualiza a tabela
            JOptionPane.showMessageDialog(this, "Tarefa excluída com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao excluir tarefa.");
        }
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCriarUsuarioActionPerformed

        Usuario criar = new Usuario();
        criar.setVisible(true);      
    }//GEN-LAST:event_BtCriarUsuarioActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        this.dispose();
        telaAnterior.setVisible(true);
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void BtVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVisualizarActionPerformed
    int selectedRow = Tabela.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selecione uma tarefa para visualizar.");
        return;
    }
    String titulo = Tabela.getValueAt(selectedRow, 0).toString();
    String responsavel = Tabela.getValueAt(selectedRow, 1).toString();
    String prioridade = Tabela.getValueAt(selectedRow, 2).toString();
    String dataMeta = Tabela.getValueAt(selectedRow, 3).toString();
    String descricao = Tarefas.getDescricao(titulo);

    Visualizar visualizar = new Visualizar(
        this,
        titulo,
        descricao,
        dataMeta,
        responsavel,
        prioridade
    );
    visualizar.setVisible(true);
    }//GEN-LAST:event_BtVisualizarActionPerformed

    private void BtConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConcluirActionPerformed
    int selectedRow = Tabela.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Selecione uma tarefa para concluir.");
        return;
    }
    String titulo = Tabela.getValueAt(selectedRow, 0).toString();

    // Verifica se já está concluída
    String sql = "SELECT concluida FROM tarefas WHERE titulo = ?";
    try (Connection conn = Conexao.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, titulo);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next() && rs.getBoolean("concluida")) {
                JOptionPane.showMessageDialog(this, "Esta tarefa já foi concluída.");
                return;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    // Conclui
    Tarefas.concluirTarefa(titulo);
    atualizarTabela();
    JOptionPane.showMessageDialog(this, "Tarefa concluída com sucesso!");
    }//GEN-LAST:event_BtConcluirActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        String texto = TxBuscar.getText();
        List<Tarefa> tarefasFiltradas = Tarefas.filtrarTarefas(texto);
        atualizarTabela(tarefasFiltradas);
    }//GEN-LAST:event_BtBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtConcluir;
    private javax.swing.JButton BtCriarUsuario;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JButton BtTarefa;
    private javax.swing.JButton BtVisualizar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JTable Tabela;
    private javax.swing.JTextField TxBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    public Tarefas(JFrame telaAnterior, Usuarios.Usuario usuarioLogado) {
        this();
        this.telaAnterior = telaAnterior;
        this.usuarioLogado = usuarioLogado;
        BtCriarUsuario.setVisible(usuarioLogado.getTipo().equals("supervisor"));
        atualizarTabela(); // Carrega as tarefas ao abrir
    }
    public void atualizarTabela(List<Tarefa> tarefas) {
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        model.setRowCount(0);
        for (Tarefa tarefa : tarefas) {
            model.addRow(new Object[]{
                tarefa.getTitulo(),
                tarefa.getResponsavel(),
                tarefa.getPrioridade(),
                tarefa.getDataMeta(),
                tarefa.isConcluida() ? "Sim" : "Não"
            });
        }
    }
}

    
