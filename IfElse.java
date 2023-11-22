package atividades;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
    Scanner n1 = new Scanner(System.in);// Create a Scanner object
    Scanner n2 = new Scanner(System.in);
    Scanner n3 = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = n1.nextLine();  // Read user input
    
    System.out.println("Digite a sua idade: ");
    String idade = n2.nextLine();
    
    System.out.println("Deseja que o seu nome e sua idade sejam mostradas?(sim/nao)");
    String opcao = n3.nextLine();
    
    if (opcao.equals("sim")) {
        System.out.println("Olá " + nome + " você tem "+ idade + " anos.");
    }
    n1.close();
    n2.close();
    n3.close();
    }
  
}
