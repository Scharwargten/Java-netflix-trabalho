// Abstração
public abstract class Conteudo {
    private String titulo;
    private String genero;
    private int posicaoTop10;

    public Conteudo(String titulo, String genero, int posicaoTop10) {
        this.titulo = titulo;
        this.genero = genero;
        this.posicaoTop10 = posicaoTop10;
    }

    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getPosicaoTop10() { return posicaoTop10; }

    public abstract void exibirDetalhes();
}

// Herança
class Filme extends Conteudo {
    private int duracaoMinutos;

    public Filme(String titulo, String genero, int posicaoTop10, int duracaoMinutos) {
        super(titulo, genero, posicaoTop10);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(getPosicaoTop10() + "º Lugar [FILME] - " + getTitulo() + " (Duração: " + duracaoMinutos + " min)");
    }
}

// Herança
class Serie extends Conteudo {
    private int temporadas;

    public Serie(String titulo, String genero, int posicaoTop10, int temporadas) {
        super(titulo, genero, posicaoTop10);
        this.temporadas = temporadas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(getPosicaoTop10() + "º Lugar [SÉRIE] - " + getTitulo() + " (Temporadas: " + temporadas + ")");
    }
}