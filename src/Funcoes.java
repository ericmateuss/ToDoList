import java.util.*;

public class Funcoes {

    static ArrayList<Task> tasks = new ArrayList<>();

    public void adicionarTask() {
        String nome;
        String descricao;
        String status = null;
        String dataTermino;
        int prioridade;
        int nCategoria;
        int nStatus;
        String categoria=null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome da Task: ");
        nome = scanner.nextLine().toLowerCase();


        System.out.println("Insira a descricao da Task: ");
        descricao = scanner.nextLine().toLowerCase();

        System.out.println("Insira o numero correspondente ao status da Task: ");
        System.out.println("1-Fazer//2-Fazendo//3-Feito");
        nStatus = Integer.parseInt(scanner.nextLine().toLowerCase());

        switch (nStatus){
            case 1:
                status = "fazer";
                break;
            case 2:
                status= "fazendo";
                break;
            case 3:
                status = "feito";
                break;
        }

        System.out.println("Insira a prioridade da Task: ");
        System.out.println("1//2//3//4//5");
        System.out.println("Onde 1 e a maior prioridadade.");
        prioridade = Integer.parseInt(scanner.nextLine());

        System.out.println("Insira a data de entrega da Task: ");
        dataTermino = scanner.nextLine().toLowerCase();

        System.out.println("Insira o numero correspondente a categoria: ");
        System.out.println("1-Dia a dia//2-Trabalho");
        nCategoria = Integer.parseInt(scanner.nextLine().toLowerCase());

        switch (nCategoria){
            case 1:
                categoria = "dia a dia";
                break;
            case 2:
                categoria=" trabalho";
                break;
        }

        Task novaTask = new Task(nome, descricao, status, dataTermino, prioridade, categoria);
        Cadastrar(novaTask);
    }

    public void Cadastrar(Task novaTask) {
        tasks.add(novaTask);
        tasks.sort(Comparator.comparing(Task::getPrioridade));
    }

    public static void printarLista() {
        String matriz[][] = new String[tasks.size()][6];
        for (int i = 0; i < tasks.size(); i++) {
            matriz[i][0] = tasks.get(i).getTask();
            matriz[i][1] = tasks.get(i).getDescricao();
            matriz[i][2] = tasks.get(i).getStatus();
            matriz[i][3] = tasks.get(i).getDataTermino();
            matriz[i][4] = String.valueOf(tasks.get(i).getPrioridade());
            matriz[i][5] = tasks.get(i).getCategoria();
        }

        for (int n = 0; n < tasks.size(); n++) {
            System.out.println("----------------------");
            System.out.println("Nome: " + matriz[n][0]);
            System.out.println("Descricao: " + matriz[n][1]);
            System.out.println("Status: " + matriz[n][2]);
            System.out.println("Data da entrega: " + matriz[n][3]);
            System.out.println("Prioridade: " + matriz[n][4]);
            System.out.println("Categoria: " + matriz[n][5]);

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
    public void salvarTask(){
        Scanner scanner = new Scanner(System.in);
        String nome;
        String descricao;
        String status = null;
        String dataTermino;
        int prioridade;
        int nCategoria;
        int nStatus;
        String categoria=null;

        System.out.println("Insira o nome da Task que deseja alterar: ");
        nome = scanner.nextLine().toLowerCase();


        for(int i = 0; i<tasks.size(); i++){
            if(nome.equals(tasks.get(i).getTask())){
                System.out.println("Task encontrada!!");

                System.out.println("Novo nome da Task: ");
                nome = scanner.nextLine().toLowerCase();

                System.out.println("Insira a descricao da Task: ");
                descricao = scanner.nextLine().toLowerCase();

                System.out.println("Insira o numero correspondente ao status da Task: ");
                System.out.println("1-Fazer//2-Fazendo//3-Feito");
                nStatus = Integer.parseInt(scanner.nextLine().toLowerCase());

                switch (nStatus){
                    case 1:
                        status = "fazer";
                        break;
                    case 2:
                        status= "fazendo";
                        break;
                    case 3:
                        status = "feito";
                        break;
                }

                System.out.println("Insira a prioridade da Task: ");
                System.out.println("1>>2>>3>>4>>5");
                prioridade = Integer.parseInt(scanner.nextLine());

                System.out.println("Insira a data de entrega da Task: ");
                dataTermino = scanner.nextLine().toLowerCase();

                System.out.println("Insira o numero correspondente a categoria: ");
                System.out.println("1-Dia a dia//2-Trabalho");
                nCategoria = Integer.parseInt(scanner.nextLine().toLowerCase());

                switch (nCategoria){
                    case 1:
                        categoria = "dia a dia";
                        break;
                    case 2:
                        categoria=" trabalho";
                        break;
                }

                tasks.get(i).setTask(nome);
                tasks.get(i).setDescricao(descricao);
                tasks.get(i).setStatus(status);
                tasks.get(i).setDataTerminos(dataTermino);
                tasks.get(i).setCategoria(categoria);
                tasks.get(i).setPrioridade(prioridade);
            }

        }
    }
}