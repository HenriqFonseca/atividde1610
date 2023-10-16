package exec2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {

        ArrayList<Item> lista = new ArrayList<>();
        lista.add(new Livro("Deuses Americanos", 40, "Neil Gaiman", "123"));
        lista.add(new Livro("Coraline", 50, "Neil Gaiman", "321"));
        lista.add(new CD("Bruno e Marrone - As Melhores 2013", 15, 10, "421"));
        lista.add(new DVD("Rei Leão", 30, 90, "8484"));
        lista.add(new DVD("Lista de Schindler", 40, 120, "4412"));
        lista.add(new DVD("Lista de Schindler", 40, 120, "4412"));
        lista.add(new DVD("Lista de Schindler", 40, 120, "121212"));


        Scanner sc = new Scanner(System.in);


        String menu = "0 - Sair" +
                "\n 1 - Listar" +
                "\n 2 - Buscar";
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (op) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar");
                    break;
                case 1:

                    for (Item item : lista){
                        System.out.println(item);
                    }

                    break;
                case 2:
                    System.out.println("Insira o nome do produto:");
                    String input = sc.next();
                    for (Item item: lista){
                        if ((input.equalsIgnoreCase(item.getNome()))){
                            System.out.println(item);
                            break;
                        }else{
                            System.out.println("Item não encontrado");
                        }
                    }
                    break;
                default:
                    System.out.println("default");
                    break;
            }
        } while (op != 0);
    }
}
