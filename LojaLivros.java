import java.util.*;


public class LojaLivros{

    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
         
        System.out.println("Digite o nome do livro:");
        String nome;
        nome = scan.nextLine();
        System.out.println("Digite o ID:");
        int id;
        id = scan.nextInt();
        System.out.println("Digite o preço:");
        float preco;
        preco = scan.nextFloat();
        System.out.println("Digite se quer frete grátis:");
        boolean frete;
        frete = scan.hasNext();

        System.out.printf("Programação com Java %d\n",id);
        System.out.printf("Preço: %.2f\n",preco);
        System.out.println("Frete Grátis:\n" + frete);
    }

}
