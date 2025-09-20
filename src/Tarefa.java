
public class Tarefa {
    private String titulo;
    private String descricao;
    private String dataMeta;
    private String responsavel;
    private String prioridade;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, String dataMeta, String responsavel, String prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataMeta = dataMeta;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public String getDataMeta() { return dataMeta; }
    public String getResponsavel() { return responsavel; }
    public String getPrioridade() { return prioridade; }
    public boolean isConcluida() { return concluida; }

    // Setter
    public void setConcluida(boolean concluida) { this.concluida = concluida; }
}