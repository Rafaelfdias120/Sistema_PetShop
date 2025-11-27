package Sistema_PetShop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("==========SISTEMA PETSHOP==========");
            System.out.println("1. Cadastrar animal.");
            System.out.println("2. Cadastrar cliente.");
            System.out.println("3. Cadastrar serviço.");
            System.out.println("4. Cadastrar funcionario.");
            System.out.println("0. Sair.");
            System.out.println("Escolha uma opção:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            
                default:
                    if(opcao != 0)System.out.println("Opção invalida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
