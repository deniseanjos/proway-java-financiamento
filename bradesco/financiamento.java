package bradesco;

import java.util.Scanner;

public class financiamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char continua = 'S';
        int opcao;
        
        do {
            
            System.out.println("========== BRADESCO FINANCIAMENTOS ==========");
            System.out.print("Opções disponíveis:\n" +
            "1 - Crédito Pessoal\t\t" +
            "2 - Crédito Imobiliário\t\t" + 
            "3 - Crédito Empresarial\t\t" + 
            "4 - Empréstimo Consignado\n" + 
            "Digite a opção desejada: ");
            opcao = sc.nextInt();

            while(opcao <= 0 || opcao > 4) {
                System.out.print("Opção inválida. Digite novamente: ");
                opcao = sc.nextInt();
            }

            switch(opcao){
                case 1:
                System.out.println("Crédito Pessoal");
                break;
                case 2:
                System.out.println("Crédito Imobiliário");
                break;
                case 3:
                System.out.println("Crédito Empresarial");
                break;
                case 4:
                System.out.println("Emprestimo Consignado");
                break;
            }

            System.out.print("Deseja voltar ao menu principal (V) ou sair do sistema (S)?: ");
            continua = sc.next().toUpperCase().charAt(0);

            while(continua != 'S' && continua != 'V') {
                System.out.print("Opção inválida. Digite V para voltar ao menu principal ou S para sair: ");
                continua = sc.next().toUpperCase().charAt(0);
            }

        } while(continua == 'V');

    }

}
