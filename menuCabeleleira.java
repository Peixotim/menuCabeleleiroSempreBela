package Exercicio09;

import java.util.ArrayList;
import java.util.Scanner;

public class menuCabeleleira implements contractsMenu{

    ArrayList<Cabeleleira> cabeleleiras = new ArrayList<>();

    int servicoOferecido;

    @Override
    public Cabeleleira menuCadastro(Scanner sc, Cabeleleira cb) {


        System.out.print("Digite o nome da cabeleleira : ");
        cb.nome = sc.nextLine();

        System.out.println("Selecione o servico feito");
        System.out.println("1 - Pés");
        System.out.println("2 - Maos ");
        System.out.println("3 - Podologia");
        System.out.print("Selecionar : ");
        servicoOferecido = sc.nextInt();
        switch(servicoOferecido){
            case 1:
                System.out.println("Servico de pés cadastrado ✅ ");
                cb.saldoAtual += 10.00;
                cb.pesFeitos++;
                break;
            case 2:
                System.out.println("Servico de maos cadastrado ✅ ");
                cb.saldoAtual += 15.00;
                cb.maosFeitas++;
                break;
            case 3:
                System.out.println("Servico de podologia cadastrado ✅ ");
                cb.saldoAtual += 30.00;
                cb.podologiasFeitas++;
                break;
            default:
                System.out.println("Servico nao encontrado ");
                break;
        }
        cabeleleiras.add(cb);
        return cb;
    }

    @Override
    public void menuRecebimento(Scanner sc) {
        if (cabeleleiras.isEmpty()) {
            System.out.println("Nao há cabeleleiras cadastradas ");
        } else {
            String nome;
            System.out.print("Digite o nome para ver o saldo atual : ");
            nome = sc.nextLine();
            for (int i = 0; i    < cabeleleiras.size(); i++) {
                Cabeleleira cbL = cabeleleiras.get(i);
                String nomeCabeleleira = cbL.nome;

                if (nome.equalsIgnoreCase(nomeCabeleleira)) {
                    System.out.println("Seu saldo atual é : " + "R$" + cbL.saldoAtual);
                    System.out.println("Seu saldo com a taxa mensal fica em " + "R$" + (cbL.saldoAtual / 2.00) );
                }
            }
        }
    }

    @Override
    public void quemMaisVendeu() {
        if(cabeleleiras.isEmpty()) {
            System.out.println("Nao há cabeleleiras cadastradas");
        }else{
            Cabeleleira campeaMaiorSaldo = cabeleleiras.get(0);

            for (int i = 0; i < cabeleleiras.size(); i++) {
                Cabeleleira cbL = cabeleleiras.get(i);

                if(cbL.saldoAtual > campeaMaiorSaldo.saldoAtual){
                   campeaMaiorSaldo = cbL;
                }


            }
            System.out.println("A pessoa que mais vendeu este mes foi : " + campeaMaiorSaldo.nome);
        }
    }

    @Override
    public void listaDeVendas() {
        if(cabeleleiras.isEmpty()){
            System.out.println("Nao há cabeleleiras cadastradas");
        }else {
            for (int i = 0; i < cabeleleiras.size(); i++) {
                Cabeleleira cbL = cabeleleiras.get(i);
                System.out.println("📋 Lista de vendas:");
                System.out.println("Nome: " + cbL.nome);
                System.out.println(" - Pés feitos: " + cbL.pesFeitos);
                System.out.println(" - Mãos feitas: " + cbL.maosFeitas);
                System.out.println(" - Podologias feitas: " + cbL.podologiasFeitas);
                System.out.println(" - Saldo total: R$" + cbL.saldoAtual);
                System.out.println("------------------------------------------------");
            }
        }
    }
}

