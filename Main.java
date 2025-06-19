package Exercicio09;

import java.util.Scanner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        menuCabeleleira menu = new menuCabeleleira();
        do{
            System.out.println("========== \uD83D\uDC85 Menu Cabeleireiro Sempre Bela \uD83D\uDC85 ==========");
            System.out.println("1️⃣  Cadastrar nova venda"); // Cadastrar
            System.out.println("2️⃣  Valor a Receber"); // Digitar o nome e voltar o quanto ela vendeu
            System.out.println("3️⃣  Consultar quem mais vendeu");
            System.out.println("4️⃣  Listar todas as vendas");
            System.out.println("5️⃣  ❌ Sair");
            System.out.println("=============================================");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    Cabeleleira novaCabeleleira = new Cabeleleira();
                    menu.menuCadastro( sc,novaCabeleleira);

                    break;
                case 2:
                    menu.menuRecebimento(sc);
                    break;
                case 3:
                    menu.quemMaisVendeu();
                    break;
                case 4:
                    menu.listaDeVendas();
                    break;
            }
        }while(opcao != 5);


    }
}
