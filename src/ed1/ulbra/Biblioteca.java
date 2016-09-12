package ed1.ulbra;

import java.util.Scanner;

/**
 * Created by Diogo on 12/09/2016.
 */
public class Biblioteca {
    Scanner ler = new Scanner(System.in);
    //livro
    public String titulo;
    public int numPag;
    public int numExp;
    //autor
    public String nome;
    public String sobrenome;
    public String email;
    //editora
    public String nomeEdit;
    public String end;
    public String emailEdt;

    public int cadastro(Biblioteca vetor[], int qtd) {
        Biblioteca b = new Biblioteca();

        System.out.println("LIVRO");
        System.out.println(" ");
        do {
            System.out.println("Titulo: ");
            this.titulo=ler.nextLine();
            if (titulo.length() < 5)
            {
                System.out.println("Digite um nome válido: ");
                titulo="";
            }
        }while(titulo=="");
        System.out.println("Numero de páginas: ");
        this.numPag=ler.nextInt();
        System.out.println("Número de exemplares ");
        this.numExp=ler.nextInt();
        System.out.println("AUTOR ");
        System.out.println(" ");
        do{
            System.out.println("Nome: ");
            this.nome=ler.nextLine();

                if (!nome.matches("^[A-Za-z]*$"))
                {
                    System.out.println("Digite um nome válido : ");
                    nome="";
                }
            }while(nome=="");
            do {
                System.out.println("Sobrenome: ");
                this.sobrenome=ler.nextLine();

                    if (!nome.matches("^[A-Za-z]*$"))
                    {
                        System.out.println("Digite um nome válido: ");
                        sobrenome="";
                    }
            }while(sobrenome=="");
            do{
                System.out.println("Email: ");
                this.email=ler.nextLine();

                    if (!email.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"))
                    {
                        System.out.println("Email inválido ");
                        email="";
                }
            }while(email=="");
        System.out.println("EDITORA ");
        System.out.println(" ");
        System.out.println("Nome: ");
        this.nomeEdit=ler.nextLine();
        System.out.println("Enderço: ");
        this.end=ler.nextLine();
            do {
                System.out.println("Email: ");
                this.emailEdt=ler.nextLine();

                if (!email.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"))
                {
                    System.out.println("Email inválido ");
                    emailEdt="";
                }
            }while(emailEdt=="");
        System.out.println(" ");

        vetor[qtd]=this;
        qtd++;

        return qtd;
    }
    ////////////// Informar qtd exemplares por título
    public void compararTitulos(Biblioteca vetor[], int qtd){
        String p;
        System.out.println("Informe o titulo: ");
        p=ler.nextLine();
            if (p.equals(this.titulo)){
                for (int i = 0; i < qtd; i++) {
                    System.out.println("Numero de exemplares de " +p+ ":" +vetor[i].numExp);
                    System.out.println(" ");

                }
            }
            else {
                System.out.println("Título não encontrado");
                System.out.println(" ");
            }
    }

    public void exibirLivros (Biblioteca vetor[], int qtd){
        String p;
        System.out.println("Informe um dos itens a seguir: Editora, autor ou título do livro ");
        p=ler.nextLine();
        if (p.equals(this.titulo)||p.equals(this.nomeEdit)||p.equals(nome)){
            for (int i = 0; i < qtd; i++) {
                System.out.println("LIVRO");
                System.out.println("Titulo: " + vetor[i].titulo);
                System.out.println("Numero de páginas: " + vetor[i].numPag);
                System.out.println("Número de exemplares " +vetor[i].numExp);
                System.out.println(" ");
                System.out.println("AUTOR ");
                System.out.println("Nome: " +vetor[i].nome);
                System.out.println("Sobrenome: " +vetor[i].sobrenome);
                System.out.println("Email: " +vetor[i].email);
                System.out.println(" ");
                System.out.println("EDITORA ");
                System.out.println("Nome: " +vetor[i].nomeEdit);
                System.out.println("Enderço: " +vetor[i].end);
                System.out.println("Email: " +vetor[i].emailEdt);
                System.out.println(" ");
            }
        }
        else {
            System.out.println("Livro não encontrado.");
            System.out.println(" ");
        }
    }

    public void editarLivros (Biblioteca vetor[], int qtd){
        String p;
        System.out.println("Informe um dos itens a seguir: Editora, autor ou título do livro ");
        p=ler.nextLine();
        if (p.equals(this.titulo)||p.equals(this.nomeEdit)||p.equals(nome)){
            for (int i = 0; i < qtd; i++) {
                System.out.println("LIVRO");
                System.out.println(" ");
                    do {
                        System.out.println("Titulo: ");
                        this.titulo=ler.nextLine();
                        if (titulo.length() < 5)
                        {
                            System.out.println("Digite um nome válido  : ");
                            titulo="";
                        }
                    }while(titulo=="");
                System.out.println("Numero de páginas: ");
                this.numPag=ler.nextInt();
                System.out.println("Número de exemplares ");
                this.numExp=ler.nextInt();
                System.out.println("AUTOR ");
                System.out.println(" ");
                    do {
                        System.out.println("Nome: ");
                        this.nome=ler.nextLine();

                            if (!nome.matches("^[A-Za-z]*$"))
                            {
                                System.out.println("Digite um nome válido: ");
                                nome="";
                            }
                    }while(nome=="");
                    do{
                        System.out.println("Sobrenome: ");
                        this.sobrenome=ler.nextLine();

                            if (!sobrenome.matches("^[A-Za-z]*$"))
                            {
                                System.out.println("Digite um sobrenome válido: ");
                                sobrenome="";
                            }
                    }while(sobrenome=="");
                    do{
                        System.out.println("Email: ");
                        this.email=ler.nextLine();

                            if (!email.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"))
                            {
                                System.out.println("Email2 inválido ");
                                email="";
                            }
                        }while(email=="");
                System.out.println("EDITORA ");
                System.out.println(" ");
                System.out.println("Nome: ");
                this.nomeEdit=ler.nextLine();
                System.out.println("Enderço: ");
                this.end=ler.nextLine();
                do {
                    System.out.println("Email: ");
                    this.emailEdt=ler.nextLine();

                        if (!emailEdt.matches("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$"))
                        {
                            System.out.println("Email editora inválido");
                            emailEdt="";
                        }
                    }while(emailEdt=="");
            }
        }
        else {
            System.out.println("Livro não encontrado.");
            System.out.println(" ");
        }
    }

    public void excluir(Biblioteca vetor[], int qtd){
        String p;
        System.out.println("Informe um dos itens a seguir: Editora, autor ou título do livro ");
        p=ler.nextLine();
        if (p.equals(this.titulo)||p.equals(this.nomeEdit)||p.equals(nome)) {
            for (int i = 0; i < qtd; i++) {

            }

        }
        else {
            System.out.println("Livro não encontrado.");
            System.out.println(" ");
        }
    }
}
