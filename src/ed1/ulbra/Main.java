package ed1.ulbra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int op=0, cont=0;
        int exemplares=0;
        Scanner ler = new Scanner(System.in);
        Biblioteca [] vetor = new Biblioteca[50];
        Biblioteca b = new Biblioteca();


        do{
            System.out.println("1 - Cadastrar livros");
            System.out.println("2 - Quantidade de exemplares cadastrados por título do livro: ");
            System.out.println("3 - Quantidade de exemplares cadastrados ao total: ");
            System.out.println("4 - Livros ao total: ");
            System.out.println("5 - Exibir livros: ");
            System.out.println("6 - Editar Livros: ");
            System.out.println("7 - Excluir livros: ");
            System.out.println("0 - Sair");
            op = ler.nextInt();

            switch (op){
                case 1:
                    cont = b.cadastro(vetor,cont);
                    break;

                case 2:
                    b.compararTitulos(vetor,cont);
                    break;

                case 3:
                    // fazer
                    break;
                case 4:
                    System.out.println("Livros cadastrados: " +cont);
                    break;
                case 5:
                    b.exibirLivros(vetor,cont);
                    break;
                case 6:
                    b.editarLivros(vetor,cont);
                    break;
                case 7:
                    //fazer
                    b.excluir(vetor,cont);
                    break;
                case 0:
                    System.out.println("Finalizando...");
                    break;
            }
        }while (op!=0);
    }
}
