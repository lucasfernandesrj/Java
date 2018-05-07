package ex01;

public interface Publicacao{
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int folha);
    public abstract void avançarPag();
    public abstract void voltarPag();
}