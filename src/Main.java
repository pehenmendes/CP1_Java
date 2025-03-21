import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1-Cadastro\n2-Atualizar\n3-Consultar\n4-Excluir\n5-Sair\nEscolha uma opção: ", pula = "\n";
        String menu2 = "1-Marca do carro\n2-Modelo do carro\n3-Placa do carro\n4-Horário de entrada\n";
        String marca = "", modelo = "", placa = "";
        int opcao = 0, opcao2, hrEntrada = 0;

        while (opcao != 5) {
            System.out.print(pula + menu);
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    if (marca.isBlank() || modelo.isBlank() || placa.isBlank() || !(hrEntrada > 5 && hrEntrada < 23)) {
                        System.out.print(pula + "Cadastrar novo veículo:" + pula);
                        System.out.print("Digite a marca do carro: ");
                        marca = input.next();
                        System.out.print("Digite o modelo do carro: ");
                        modelo = input.next();
                        System.out.print("Digite a placa do carro: ");
                        placa = input.next();
                        System.out.print("Digite o horário de entrada do carro: ");
                        hrEntrada = input.nextInt();
                        System.out.print("\nCadastro feito com sucesso!\n");
                    } else {
                        System.out.print(pula + "Banco de dados cheio." + pula);
                    }
                    break;
                case 2:
                    if (!marca.isBlank() || !modelo.isBlank() || !placa.isBlank() || (hrEntrada > 5 && hrEntrada < 23)) {
                        System.out.print(pula + "Atualizar dados:" + pula);
                        System.out.print(menu2 + "\nEcolha uma opção");
                        opcao2 = input.nextInt();
                        switch (opcao2){
                            case 1:
                                System.out.print("Digite a nova marca: ");
                                marca = input.next();
                                break;
                            case 2:
                                System.out.print("Digite o novo modelo: ");
                                modelo = input.next();
                                break;
                            case 3:
                                System.out.print("Digite a nova placa: ");
                                placa = input.next();
                                break;
                            case 4:
                                System.out.print("Digite o novo horário: ");
                                hrEntrada = input.nextInt();
                                break;
                            default:
                                System.out.print(pula + "Opção inválida. Tente novamente" + pula);
                                break;
                        }
                    } else {
                        System.out.print(pula + "Não há veículos cadastrados." + pula);
                    }
                    break;
                case 3:
                    if (!marca.isBlank() || !modelo.isBlank() || !placa.isBlank() || (hrEntrada > 5 && hrEntrada < 23)) {
                        System.out.print(pula + "Consultar veículos:" + pula);
                        System.out.print("Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nHorário Entrada: " + hrEntrada + pula);
                    } else {
                        System.out.print(pula + "Não há veículos cadastrados." + pula);
                    }
                    break;
                case 4:
                    if (!marca.isBlank() || !modelo.isBlank() || !placa.isBlank() || (hrEntrada > 5 && hrEntrada < 23)) {
                        System.out.print(pula + "Excluindo dados..." + pula);
                        marca = ""; modelo = ""; placa = ""; hrEntrada = 0;
                    } else {
                        System.out.print(pula + "Não há veículos cadastrados." + pula);
                    }
                    break;
                case 5:
                    System.out.print(pula + "Saindo do programa..." + pula);
                    break;
                default:
                    System.out.print(pula + "Opção inválida. Tente novamente" + pula);
                    break;
            }
        }
    }
}