public class Task{
    private String task;
    private String descricao;
    private String status;
    private String dataTermino;
    private int prioridade;

    private String categoria;

    public Task(String task, String descricao, String status, String dataTermino, int prioridade, String categoria){
        super();
        this.task=task;
        this.descricao=descricao;
        this.status=status;
        this.dataTermino=dataTermino;
        this.prioridade=prioridade;
        this.categoria=categoria;
    }
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

    public String getDataTermino(){
        return dataTermino;
    }
    public void setDataTerminos(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

}
