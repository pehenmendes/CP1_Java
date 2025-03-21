import java.util.Random;
import java.util.Scanner;

public class Sys_Estacionamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao, horario_entrada = 0;
        String marca = "", modelo = "", placa = "", pesquisa = "";
        do {
            System.out.print("*** MENU ESTACIONAMENTO ***\n1 - Cadastrar\n2 - Alterar\n3 - Consultar\n4 - Excluir\n5 - Calcular Estadia\n6 - Sair\n---> ");
            operacao = scanner.nextInt();
            switch (operacao) {
                case 1:
                    if (marca.isEmpty() || modelo.isEmpty() || placa.isEmpty()) {
                        System.out.print("Diga a marca do veículo\n---> ");
                        marca = scanner.next();
                        System.out.print("Diga o modelo do veículo\n---> ");
                        modelo = scanner.next();
                        System.out.print("Diga a placa do veículo\n---> ");
                        placa = scanner.next();
                        System.out.print("Diga o horário de entrada do veículo\n---> ");
                        horario_entrada = scanner.nextInt();
                        System.out.println("Cadastro realizado com sucesso!");
                    }
                    else {
                        System.out.println("Sem espaço no banco de dados!");
                    }
                    break;
                case 2:
                    System.out.print("Qual a placa do carro que você deseja alterar o cadastro?\n---> ");
                    pesquisa = scanner.next();
                    if (pesquisa.equalsIgnoreCase(placa)) {
                        System.out.print("Qual campo você deseja alterar? (marca, modelo ou horário)\n---> ");
                        String escolha = scanner.next();
                        switch (escolha.toLowerCase()) {
                            case "marca":
                                System.out.print("Diga a nova marca\n---> ");
                                marca = scanner.next();
                                break;
                            case "modelo":
                                System.out.print("Diga o novo modelo\n---> ");
                                modelo = scanner.next();
                                break;
                            case "horario":
                                System.out.print("Diga o novo horário de entrada\n---> ");
                                horario_entrada = scanner.nextInt();
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                        System.out.println("Alteração cadastrada com sucesso!");
                    }
                    else {
                        System.out.println("Placa inválida!");
                    }
                    break;
                case 3:
                    System.out.print("Qual a placa do carro que você deseja consultar?\n---> ");
                    pesquisa = scanner.next();
                    if (pesquisa.equalsIgnoreCase(placa)) {
                        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nHorário de entrada: " + horario_entrada);
                    }
                    else {
                        System.out.println("Veículo não encontrado!");
                    }
                    break;
                case 4:
                    System.out.print("Qual a placa do carro que você deseja excluir o cadastro?\n---> ");
                    pesquisa = scanner.next();
                    if (pesquisa.equalsIgnoreCase(placa)) {
                        marca = ""; modelo = ""; placa = ""; horario_entrada = 0;
                        System.out.println("Cadastro excluído com sucesso!");
                    }
                    else {
                        System.out.println("Veículo não encontrado!");
                    }
                    break;
                case 5:
                    System.out.print("Qual a placa do carro que você deseja calcular o serviço?\n---> ");
                    pesquisa = scanner.next();
                    if (pesquisa.equalsIgnoreCase(placa)) {
                        if (horario_entrada == 0) {
                            System.out.println("Erro: O veículo não foi cadastrado corretamente!");
                        }
                        else {
                            Random random = new Random();
                            int valor_estadia = 0;
                            int horario_saida = random.nextInt(6, 23);
                            int tempo_estadia = horario_saida - horario_entrada;
                            if (tempo_estadia < 0) {
                                tempo_estadia = -tempo_estadia;
                            }
                            if (tempo_estadia == 0) {
                                System.out.println("PASSAGEM LIBERADA!");
                            } else if (tempo_estadia >= 24) {
                                valor_estadia = 80;
                            } else if (tempo_estadia >= 7) {
                                valor_estadia = 60;
                            } else if (tempo_estadia >= 5) {
                                valor_estadia = 45;
                            } else if (tempo_estadia >= 3) {
                                valor_estadia = 30;
                            }
                            System.out.println("Recibo: \nO carro com placa " + placa + " esteve no estacionamento por " + tempo_estadia + " horas. O valor da estadia a ser cobrado é de R$ " + valor_estadia);
                        }
                    } else {
                        System.out.println("Veículo não encontrado!");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (operacao != 6);
        scanner.close();
    }
}
