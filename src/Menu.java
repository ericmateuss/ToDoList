import java.util.Scanner;
public class Menu {
    public Menu(){
        Scanner scanner = new Scanner(System.in);

        boolean saida = false;
        int escolha = 0;

        while(!saida){
            Opcoes();
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch(escolha){
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }
    }

    public static void Opcoes(){
        System.out.println("\nDigite uma opcao: ");
        System.out.println("\t0 - Para printar opcoes.");
        System.out.println("\t1 - Adicionar uma Task.");
        System.out.println("\t2 - Printar toda a lista de Tasks.");
        System.out.println("\t3 - Para deletar uma Task.");
        System.out.println("\t4 - Para marcar uma Task como DOING.");
        System.out.println("\t5 - Para marcar uma Task como DONE.");
        System.out.println("\t3 - Para sair.");
    }
}
