public class Task {
    private String task;
    private String descricao;
    private String status;
    private int prioridade;
    public String getTask(){
        return task;
    }
    public void setTask(String task){
        this.task = task;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getPrioridade(){
        return prioridade;
    }
    public void setPrioridade(int prioridade){
        this.prioridade = prioridade;
    }
}
