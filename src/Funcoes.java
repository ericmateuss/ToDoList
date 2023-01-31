import java.util.*;

public class Funcoes {
    private String nome;
    private String descricao;
    private String status;
    private String dataTermino;
    private int prioridade;
    static ArrayList<Task> tasks = new ArrayList<>();

    public void adicionarTask() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome da Task: ");
        nome = scanner.nextLine().toLowerCase();


        System.out.println("Insira a descricao da Task: ");
        descricao = scanner.nextLine().toLowerCase();

        System.out.println("Insira o status da Task: ");
        System.out.println("Feito/Fazendo/Fazer");
        status = scanner.nextLine().toLowerCase();

        System.out.println("Insira a prioridade da Task: ");
        System.out.println("1>>2>>3>>4>>5");
        prioridade = Integer.parseInt(scanner.nextLine());

        System.out.println("Insira a data de entrega da Task: ");
        dataTermino = scanner.nextLine().toLowerCase();

        Task novaTask = new Task(nome, descricao, status, dataTermino, prioridade);
        Cadastrar(novaTask);
    }

    public void Cadastrar(Task novaTask) {
        tasks.add(novaTask);
        tasks.sort(Comparator.comparing(Task::getPrioridade));
    }

    public static void printarLista() {
        String matriz[][] = new String[tasks.size()][5];
        for (int i = 0; i < tasks.size(); i++) {
            matriz[i][0] = tasks.get(i).getTask();
            matriz[i][1] = tasks.get(i).getDescricao();
            matriz[i][2] = tasks.get(i).getStatus();
            matriz[i][3] = tasks.get(i).getDataTermino();
            matriz[i][4] = String.valueOf(tasks.get(i).getPrioridade());
        }

        for (int n = 0; n < tasks.size(); n++) {
            System.out.println("----------------------");
            System.out.println("Nome: " + matriz[n][0]);
            System.out.println("Descricao: " + matriz[n][1]);
            System.out.println("Status: " + matriz[n][2]);
            System.out.println("Data da entrega: " + matriz[n][3]);
            System.out.println("Prioridade: " + matriz[n][4]);
        }
    }

    public void deletarTask(){
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Insira o nome da Task a ser deletada: ");
        nome = scanner.nextLine().toLowerCase();
        for(int i = 0; i<tasks.size(); i++){
            if(nome.equals(tasks.get(i).getTask())){
                tasks.remove(i);

            }
        }
    }
}