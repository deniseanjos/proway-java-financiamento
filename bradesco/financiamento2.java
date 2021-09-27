package bradesco;

import java.util.Scanner;

public class financiamento2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cabecalho();
        menu();
        opcao_menu();

    }

    static void cabecalho() {
        System.out.println("========== BRADESCO FINANCIAMENTOS ==========");
    }

    static void menu() {
        System.out.println("Opções disponíveis:\n" + "1 - Crédito Pessoal\t\t" + "2 - Crédito Imobiliário\t\t"
                + "3 - Crédito Empresarial\t\t" + "4 - Empréstimo Consignado");
    }

    static void opcao_menu() {
        int op = valida_opcao(entrada_numerica("Digite a opção do menu: "), 1, 4);

        switch (op) {
            case 1:
                linha();
                System.out.println("Crédito Pessoal");
                linha();
                break;
            case 2:
                linha();
                System.out.println("Crédito Imobiliário");
                linha();
                break;
            case 3:
                linha();
                System.out.println("Crédito Empresarial");
                linha();
                break;
            case 4:
                linha();
                System.out.println("Emprestimo Consignado");
                linha();
                break;
        }

        continua();
    }

    static void continua() {
        char entrada = valida_char(entrada_char("Deseja voltar ao menu principal (V) ou sair do sistema (S)?: "), 'V',
                'S');
        if (entrada == 'V') {
            cabecalho();
            menu();
            opcao_menu();
        } else {
            System.out.println("OBRIGADE E VOLTE SEMPRE.");
        }
    }

    static int entrada_numerica(String msg) {
        System.out.print(msg);
        int entrada = sc.nextInt();
        return entrada;
    }

    static int valida_opcao(int entrada, int valorInicial, int limite) {
        while (entrada < valorInicial || entrada > limite) {
            entrada = entrada_numerica("Opção inválida. Digite novamente: ");
        }
        return entrada;
    }

    static char entrada_char(String msg) {
        System.out.print(msg);
        char entrada = sc.next().toUpperCase().charAt(0);
        return entrada;
    }

    static char valida_char(char entrada, char opcaoA, char opcaoB) {
        while (entrada != opcaoA && entrada != opcaoB) {
            entrada = entrada_char("Opção inválida. Digite novamente: ");
        }
        return entrada;
    }

    static void linha() {
        System.out.println("=============================================");
    }

}
