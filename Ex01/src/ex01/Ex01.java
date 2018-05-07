package ex01;

public class Ex01{
    public static void main(String [] args){
        Pessoa p[] = new Pessoa[3];
        p[0] = new Pessoa("Lucas",24,"M");
        p[1] = new Pessoa("Mariana",25,"F");
        p[2] = new Pessoa("Cristiane",50,"F");
        
        Livro l[] = new Livro[3];
        l[0] = new Livro("Prisioneiro de Azkaban","J.K.Rowling",500,p[1]);
        l[1] = new Livro("Revolução dos Bichos","George Orwells",200,p[0]);
        l[2] = new Livro("Receitas Ana Maria","Ana Maria Braga",100,p[2]);
        
        l[0].detalhes();
        l[0].abrir();
        l[0].folhear(156);
        l[0].detalhes();
        l[0].fechar();
        l[0].detalhes();
        l[1].voltarPag();
        l[2].detalhes();
    }
}