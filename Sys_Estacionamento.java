import java.util.Scanner;

public class Sys_Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 0;
        String marca = "", modelo = "", placa = "", horario_entrada = "";
        do {
            System.out.print("1 - Cadastrar\n2 - Alterar\n3 - Consultar\n4 - Excluir\n5 - Finalizar Estadia\n6 - Sair\n---> ");
            operacao = scanner.nextInt();
            if (operacao == 1) {
                if (marca.isEmpty() || modelo.isEmpty() || placa.isEmpty() || horario_entrada.isEmpty()) {
                    System.out.print("Diga a marca do veículo\n---> ");
                    marca = scanner.next();
                    System.out.print("Diga o modelo do veículo\n---> ");
                    modelo = scanner.next();
                    System.out.print("Diga a placa do veículo\n---> ");
                    placa = scanner.next();
                    System.out.print("Diga o horario de entrada do veículo\n---> ");
                    horario_entrada = scanner.next();
                    System.out.print("Cadastro realizado com sucesso!");
                }
                else {
                    System.out.print("Sem espaço no banco de dados!");
                }
            }
            else if (operacao == 2) {
                String escolha, pesquisa;
                System.out.print("Qual a placa do carro que você deseja alterar o cadastro?\n---> ");
                pesquisa = scanner.next();
                if (pesquisa.equalsIgnoreCase(placa)) {
                    System.out.print("Qual campo você deseja alterar? (nome, endereço, email ou telefone)\n---> ");
                    escolha = scanner.next();
                    if (escolha.equals("marca")) {
                        System.out.print("Diga a marca a ser alterado\n---> ");
                        marca = scanner.next();
                        System.out.print("Alteração cadastrada com sucesso!");
                    }
                    else if (escolha.equals("modelo")) {
                        System.out.print("Diga o modelo a ser alterado\n---> ");
                        modelo = scanner.next();
                        System.out.print("Alteração cadastrada com sucesso!");
                    }
                    else if (escolha.equals("horario")) {
                        System.out.print("Diga o horário a ser alterado\n---> ");
                        horario_entrada = scanner.next();
                        System.out.print("Alteração cadastrada com sucesso!");
                    }
                }
                else {
                    System.out.print("Placa inválida!");
                }
            }
            else if (operacao == 3) {
                String pesquisa;
                System.out.print("Qual a placa do carro que você deseja alterar o cadastro?\n---> ");
                pesquisa = scanner.next();
                if (pesquisa.equalsIgnoreCase(placa)) {
                    System.out.print("Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nHorário de entrada: " + horario_entrada);
                }
                else {
                    System.out.print("Veículo não encontrado!");
                }
            }
            else if (operacao == 4) {
                marca = ""; modelo = ""; placa = ""; horario_entrada = "";
                System.out.print("Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nHorário de entrada: " + horario_entrada);
                System.out.print("Campos excluídos com sucesso!");
            }
            else if (operacao == 5) {

            }
            else if (operacao == 6) {
                System.out.print("Saindo do programa...");
                break;
            }
            else {
                System.out.print("Opção inválida!");
            }
        }
        while (true);
        scanner.close();
    }
}