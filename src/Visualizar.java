
import javax.swing.*;
public class Visualizar extends javax.swing.JFrame {

    private JFrame telaAnterior;
    public Visualizar(JFrame telaAnterior, String titulo, String descricao, String data, String responsavel, String prioridade) {
        this.telaAnterior = telaAnterior;
        initComponents();

        LbTitulo.setText(titulo);
        TxDesc.setText(descricao);
        LbData.setText(data);
        LbResp.setText(responsavel);
        LbPrioridade.setText(prioridade);
    }
    public Visualizar() {
    initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxDesc = new javax.swing.JTextArea();
        LbData = new javax.swing.JLabel();
        LbResp = new javax.swing.JLabel();
        LbPrioridade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 500));

        jPanel6.setMinimumSize(new java.awt.Dimension(200, 300));

        LbTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LbTitulo.setForeground(new java.awt.Color(57, 65, 108));
        LbTitulo.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 65, 108));
        jLabel3.setText("Descrição");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 65, 108));
        jLabel4.setText("Data meta:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(57, 65, 108));
        jLabel5.setText("Responsável:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(57, 65, 108));
        jLabel6.setText("Prioridade:");

        TxDesc.setColumns(20);
        TxDesc.setRows(5);
        jScrollPane1.setViewportView(TxDesc);

        LbData.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbData.setForeground(new java.awt.Color(0, 0, 153));

        LbResp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbResp.setForeground(new java.awt.Color(0, 0, 153));

        LbPrioridade.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LbPrioridade.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbResp))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbData))
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbPrioridade))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(LbTitulo)))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(LbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LbData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LbResp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LbPrioridade))
                .addContainerGap(234, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbData;
    private javax.swing.JLabel LbPrioridade;
    private javax.swing.JLabel LbResp;
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JTextArea TxDesc;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
