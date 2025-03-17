import java.util.Random;
import java.util.Scanner;

public class Sys_Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao; int horario_entrada = 0; int horario_saida;
        String marca = "", modelo = "", placa = "";
        do {
            System.out.print("*** MENU ESTACIONAMENTO ***\n1 - Cadastrar\n2 - Alterar\n3 - Consultar\n4 - Excluir\n5 - Calcular Estadia\n6 - Sair\n---> ");
            operacao = scanner.nextInt();
            if (operacao == 1) {
                if (marca.isEmpty() || modelo.isEmpty() || placa.isEmpty() || !(horario_entrada > 5 && horario_entrada < 23)) {
                    System.out.print("Diga a marca do veículo\n---> ");
                    marca = scanner.next();
                    System.out.print("Diga o modelo do veículo\n---> ");
                    modelo = scanner.next();
                    System.out.print("Diga a placa do veículo\n---> ");
                    placa = scanner.next();
                    System.out.print("Diga o horario de entrada do veículo\n---> ");
                    horario_entrada = scanner.nextInt();
                    System.out.println("Cadastro realizado com sucesso!");
                }
                else {
                    System.out.println("Sem espaço no banco de dados!");
                }
            }
            else if (operacao == 2) {
                String escolha, pesquisa;
                System.out.print("Qual a placa do carro que você deseja alterar o cadastro?\n---> ");
                pesquisa = scanner.next();
                if (pesquisa.equalsIgnoreCase(placa)) {
                    System.out.print("Qual campo você deseja alterar? (marca, modelo ou horário)\n---> ");
                    escolha = scanner.next();
                    if (escolha.equalsIgnoreCase("marca")) {
                        System.out.print("Diga a marca a ser alterado\n---> ");
                        marca = scanner.next();
                    }
                    else if (escolha.equalsIgnoreCase("modelo")) {
                        System.out.print("Diga o modelo a ser alterado\n---> ");
                        modelo = scanner.next();
                    }
                    else if (escolha.equalsIgnoreCase("horario")) {
                        System.out.print("Diga o horário a ser alterado\n---> ");
                        horario_entrada = scanner.nextInt();
                    }
                    System.out.println("Alteração cadastrada com sucesso!");
                }
                else {
                    System.out.println("Placa inválida!");
                }
            }
            else if (operacao == 3) {
                String pesquisa;
                System.out.print("Qual a placa do carro que você deseja alterar o cadastro?\n---> ");
                pesquisa = scanner.next();
                if (pesquisa.equalsIgnoreCase(placa)) {
                    System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nHorário de entrada: " + horario_entrada);
                }
                else {
                    System.out.println("Veículo não encontrado!");
                }
            }
            else if (operacao == 4) {
                marca = ""; modelo = ""; placa = ""; horario_entrada = 0;
                System.out.print("Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nHorário de entrada: " + horario_entrada);
                System.out.println("Campos excluídos com sucesso!");
            }
            else if (operacao == 5) {
                String pesquisa;
                int valor_estadia = 0;
                System.out.print("Qual a placa do carro que você deseja calcular o serviço?\n---> ");
                pesquisa = scanner.next();
                Random random = new Random();
                if (pesquisa.equalsIgnoreCase(placa)) {
                    horario_saida = random.nextInt(6, 22);
                    if (horario_saida - horario_entrada >= 3) {
                        valor_estadia = 30;
                    }
                    else if (horario_saida - horario_entrada >= 5) {
                        valor_estadia = 45;
                    }
                    else if (horario_saida - horario_entrada >= 7) {
                        valor_estadia = 60;
                    }
                    else if (horario_saida - horario_entrada >= 24) {
                        valor_estadia = 80;
                    }
                    System.out.println("O carro com placa " + placa + " precisa pagar R$ " + valor_estadia);
                }
                else {
                    System.out.println("Veículo não encontrado!");
                }
            }
            else if (operacao == 6) {
                System.out.println("Saindo do programa...");
                break;
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
        while (true);
        scanner.close();
    }
}