package ex01;

import java.util.Scanner;

public class Livro implements Publicacao{
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //CONSTRUTOR

    public Livro(String titulo,String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 1;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    
    //METODOS ESPECIAIS
    public void detalhes(){
        System.out.println("========= Informações =========");
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Total de Páginas: "+this.getTotPaginas());
        System.out.println("Página atual: "+this.getPagAtual());
        System.out.println("Aberto: "+this.getAberto());
        System.out.println("Leitor: "+this.getLeitor());
    }
    
    //METODO GETTER AND SETTER
    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean getAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private String getLeitor() {
        return leitor.getNome();
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //METODOS ABSTRATOS
    @Override
    public void abrir() {
        if (!this.getAberto())this.setAberto(true);
        System.out.println(">> Abrindo o livro "+this.getTitulo()+"!");
    }

    @Override
    public void fechar() {
        if(this.getAberto()) this.setAberto(false);
        System.out.println(">> Fechando o livro "+this.getTitulo()+"!");
    }

    @Override
    public void folhear(int folha) {
        if (this.getAberto()){
            
            if (folha > 0 && folha <= this.getTotPaginas()) {
                this.setPagAtual(folha);
                System.out.println(">> Livro: "+this.getTitulo()+" - Folheiou para a página "+this.getPagAtual()+".");
            }
            else System.out.println("### Livro: "+this.getTitulo()+" - Página "+folha+" não existe.");
        }else System.out.println("### Livro: "+this.getTitulo()+" - Não foi possível executar o comando. Livro fechado!");
    }

    @Override
    public void avançarPag() {
        if (this.getAberto()){
            if (this.getPagAtual() < this.getTotPaginas()) {
                this.setPagAtual(this.getPagAtual()+1);
                System.out.println(">>Livro: "+this.getTitulo()+" - Avançando para a página "+this.getPagAtual());
            }
            else System.out.println("### Livro: "+this.getTitulo()+" - Não pode avançar. Página final.");
        }else System.out.println("### Livro: "+this.getTitulo()+" - Não pode avançar para a página seguinte. Livro fechado!");
        
    }

    @Override
    public void voltarPag() {
        if (this.getAberto()){
            if(this.getPagAtual() > 1){ 
                this.setPagAtual(this.getPagAtual()-1);
                System.out.println(">>Livro:"+this.getTitulo()+" - Voltando para a página "+this.getPagAtual());
            }
            else System.out.println("### Livro:"+this.getTitulo()+" - Não pode voltar. Página inicial.");
        }else System.out.println("### Livro:"+this.getTitulo()+" - Não pode voltar para a página anterior. Livro fechado!");
    }
    
}