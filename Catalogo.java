import java.util.Scanner;

public class Catalogo {

    public static void main(String[] args) {
        
        // ==========================================
        // PARTE 1: MOSTRAR INFORMAÇÕES DOS PLANOS
        // ==========================================
        System.out.println("=== INFORMAÇÕES DA CONTA ===");
        Usuario usuario1 = new Basico("Carlos", 24.90);
        Usuario usuario2 = new Premium("Ana", 49.90);

        usuario1.validarDireitos();
        System.out.println();
        usuario2.validarDireitos();
        
        System.out.println("\n=========================================\n");

        // ==========================================
        // PARTE 2: BANCO DE DADOS (FILMES E SÉRIES)
        // ==========================================
        
        // Criando 80 Filmes (10 de cada um dos 8 gêneros)
        Filme[] listaFilmes = new Filme[80];
        
        // TERROR
        listaFilmes[0] = new Filme("Invocacao do Mal", "Terror", 1, 112);
        listaFilmes[1] = new Filme("O Exorcista", "Terror", 2, 122);
        listaFilmes[2] = new Filme("It: A Coisa", "Terror", 3, 135);
        listaFilmes[3] = new Filme("Panico", "Terror", 4, 111);
        listaFilmes[4] = new Filme("Halloween", "Terror", 5, 91);
        listaFilmes[5] = new Filme("O Iluminado", "Terror", 6, 144);
        listaFilmes[6] = new Filme("Corra!", "Terror", 7, 104);
        listaFilmes[7] = new Filme("A Freira", "Terror", 8, 96);
        listaFilmes[8] = new Filme("Hereditario", "Terror", 9, 127);
        listaFilmes[9] = new Filme("A Bruxa de Blair", "Terror", 10, 81);

        // DRAMA
        listaFilmes[10] = new Filme("Arremessando Alto", "Drama", 1, 117);
        listaFilmes[11] = new Filme("A Espera de um Milagre", "Drama", 2, 189);
        listaFilmes[12] = new Filme("O Poderoso Chefao", "Drama", 3, 175);
        listaFilmes[13] = new Filme("Forrest Gump", "Drama", 4, 142);
        listaFilmes[14] = new Filme("Clube da Luta", "Drama", 5, 139);
        listaFilmes[15] = new Filme("O Resgate do Soldado Ryan", "Drama", 6, 169);
        listaFilmes[16] = new Filme("Titanic", "Drama", 7, 194);
        listaFilmes[17] = new Filme("Coringa", "Drama", 8, 122);
        listaFilmes[18] = new Filme("A Procura da Felicidade", "Drama", 9, 117);
        listaFilmes[19] = new Filme("O Menino do Pijama Listrado", "Drama", 10, 94);

        // FICCAO
        listaFilmes[20] = new Filme("O Poco 2", "Ficcao", 1, 94);
        listaFilmes[21] = new Filme("Interestelar", "Ficcao", 2, 169);
        listaFilmes[22] = new Filme("Matrix", "Ficcao", 3, 136);
        listaFilmes[23] = new Filme("Duna", "Ficcao", 4, 155);
        listaFilmes[24] = new Filme("Avatar", "Ficcao", 5, 162);
        listaFilmes[25] = new Filme("Blade Runner 2049", "Ficcao", 6, 164);
        listaFilmes[26] = new Filme("De Volta para o Futuro", "Ficcao", 7, 116);
        listaFilmes[27] = new Filme("O Exterminador do Futuro 2", "Ficcao", 8, 137);
        listaFilmes[28] = new Filme("Alien: O Oitavo Passageiro", "Ficcao", 9, 117);
        listaFilmes[29] = new Filme("Gravidade", "Ficcao", 10, 91);

        // ACAO
        listaFilmes[30] = new Filme("John Wick", "Acao", 1, 101);
        listaFilmes[31] = new Filme("Mad Max: Estrada da Furia", "Acao", 2, 120);
        listaFilmes[32] = new Filme("Duro de Matar", "Acao", 3, 132);
        listaFilmes[33] = new Filme("Vingadores: Ultimato", "Acao", 4, 181);
        listaFilmes[34] = new Filme("Gladiador", "Acao", 5, 155);
        listaFilmes[35] = new Filme("Missao Impossivel: Efeito Fallout", "Acao", 6, 147);
        listaFilmes[36] = new Filme("O Cavaleiro das Trevas", "Acao", 7, 152);
        listaFilmes[37] = new Filme("Top Gun: Maverick", "Acao", 8, 130);
        listaFilmes[38] = new Filme("Velozes e Furiosos 5", "Acao", 9, 130);
        listaFilmes[39] = new Filme("Rambo", "Acao", 10, 93);

        // COMEDIA
        listaFilmes[40] = new Filme("Se Beber Nao Case", "Comedia", 1, 100);
        listaFilmes[41] = new Filme("As Branquelas", "Comedia", 2, 109);
        listaFilmes[42] = new Filme("O Auto da Compadecida", "Comedia", 3, 104);
        listaFilmes[43] = new Filme("Minha Mae e uma Peca", "Comedia", 4, 85);
        listaFilmes[44] = new Filme("Superbad", "Comedia", 5, 113);
        listaFilmes[45] = new Filme("Gente Grande", "Comedia", 6, 102);
        listaFilmes[46] = new Filme("Deadpool", "Comedia", 7, 108);
        listaFilmes[47] = new Filme("Debi e Loide", "Comedia", 8, 107);
        listaFilmes[48] = new Filme("American Pie", "Comedia", 9, 95);
        listaFilmes[49] = new Filme("Todo Mundo em Panico", "Comedia", 10, 88);

        // ROMANCE
        listaFilmes[50] = new Filme("Diario de uma Paixao", "Romance", 1, 123);
        listaFilmes[51] = new Filme("Orgulho e Preconceito", "Romance", 2, 129);
        listaFilmes[52] = new Filme("Como Eu Era Antes de Voce", "Romance", 3, 110);
        listaFilmes[53] = new Filme("A Culpa e das Estrelas", "Romance", 4, 126);
        listaFilmes[54] = new Filme("Questao de Tempo", "Romance", 5, 123);
        listaFilmes[55] = new Filme("Um Amor para Recordar", "Romance", 6, 101);
        listaFilmes[56] = new Filme("La La Land", "Romance", 7, 128);
        listaFilmes[57] = new Filme("Simplesmente Acontece", "Romance", 8, 102);
        listaFilmes[58] = new Filme("Cartas para Julieta", "Romance", 9, 105);
        listaFilmes[59] = new Filme("Casamento do Meu Melhor Amigo", "Romance", 10, 105);

        // DOCUMENTARIO
        listaFilmes[60] = new Filme("O Dilema das Redes", "Documentario", 1, 94);
        listaFilmes[61] = new Filme("Professor Polvo", "Documentario", 2, 85);
        listaFilmes[62] = new Filme("O Golpista do Tinder", "Documentario", 3, 114);
        listaFilmes[63] = new Filme("Fyre Festival", "Documentario", 4, 97);
        listaFilmes[64] = new Filme("Icarus", "Documentario", 5, 122);
        listaFilmes[65] = new Filme("Free Solo", "Documentario", 6, 100);
        listaFilmes[66] = new Filme("Industria Americana", "Documentario", 7, 110);
        listaFilmes[67] = new Filme("Nosso Planeta", "Documentario", 8, 50);
        listaFilmes[68] = new Filme("A 13a Emenda", "Documentario", 9, 100);
        listaFilmes[69] = new Filme("Virunga", "Documentario", 10, 100);

        // ANIMACAO
        listaFilmes[70] = new Filme("Toy Story", "Animacao", 1, 81);
        listaFilmes[71] = new Filme("Shrek", "Animacao", 2, 90);
        listaFilmes[72] = new Filme("Homem-Aranha no Aranhaverso", "Animacao", 3, 117);
        listaFilmes[73] = new Filme("O Rei Leao", "Animacao", 4, 88);
        listaFilmes[74] = new Filme("Divertida Mente", "Animacao", 5, 95);
        listaFilmes[75] = new Filme("Procurando Nemo", "Animacao", 6, 100);
        listaFilmes[76] = new Filme("Viva: A Vida e uma Festa", "Animacao", 7, 105);
        listaFilmes[77] = new Filme("Meu Malvado Favorito", "Animacao", 8, 95);
        listaFilmes[78] = new Filme("Up: Altas Aventuras", "Animacao", 9, 96);
        listaFilmes[79] = new Filme("Os Incriveis", "Animacao", 10, 115);

        // Criando 80 Séries (10 de cada um dos 8 gêneros)
        Serie[] listaSeries = new Serie[80];

        // TERROR SÉRIES
        listaSeries[0] = new Serie("A Maldicao da Residencia Hill", "Terror", 1, 1);
        listaSeries[1] = new Serie("Stranger Things", "Terror", 2, 4);
        listaSeries[2] = new Serie("American Horror Story", "Terror", 3, 12);
        listaSeries[3] = new Serie("Penny Dreadful", "Terror", 4, 3);
        listaSeries[4] = new Serie("Bates Motel", "Terror", 5, 5);
        listaSeries[5] = new Serie("Arquivo 81", "Terror", 6, 1);
        listaSeries[6] = new Serie("O Gabinete de Curiosidades", "Terror", 7, 1);
        listaSeries[7] = new Serie("Marianne", "Terror", 8, 1);
        listaSeries[8] = new Serie("Slasher", "Terror", 9, 5);
        listaSeries[9] = new Serie("Channel Zero", "Terror", 10, 4);

        // DRAMA SÉRIES
        listaSeries[10] = new Serie("Breaking Bad", "Drama", 1, 5);
        listaSeries[11] = new Serie("Peaky Blinders", "Drama", 2, 6);
        listaSeries[12] = new Serie("The Crown", "Drama", 3, 6);
        listaSeries[13] = new Serie("Succession", "Drama", 4, 4);
        listaSeries[14] = new Serie("Better Call Saul", "Drama", 5, 6);
        listaSeries[15] = new Serie("Mad Men", "Drama", 6, 7);
        listaSeries[16] = new Serie("The Sopranos", "Drama", 7, 6);
        listaSeries[17] = new Serie("Chernobyl", "Drama", 8, 1);
        listaSeries[18] = new Serie("The Wire", "Drama", 9, 5);
        listaSeries[19] = new Serie("This Is Us", "Drama", 10, 6);

        // FICCAO SÉRIES
        listaSeries[20] = new Serie("Dark", "Ficcao", 1, 3);
        listaSeries[21] = new Serie("Black Mirror", "Ficcao", 2, 6);
        listaSeries[22] = new Serie("The Mandalorian", "Ficcao", 3, 3);
        listaSeries[23] = new Serie("Westworld", "Ficcao", 4, 4);
        listaSeries[24] = new Serie("The Expanse", "Ficcao", 5, 6);
        listaSeries[25] = new Serie("Altered Carbon", "Ficcao", 6, 2);
        listaSeries[26] = new Serie("Sense8", "Ficcao", 7, 2);
        listaSeries[27] = new Serie("The Boys", "Ficcao", 8, 3);
        listaSeries[28] = new Serie("Doctor Who", "Ficcao", 9, 13);
        listaSeries[29] = new Serie("Fringe", "Ficcao", 10, 5);

        // ACAO SÉRIES
        listaSeries[30] = new Serie("Cobra Kai", "Acao", 1, 6);
        listaSeries[31] = new Serie("O Justiceiro", "Acao", 2, 2);
        listaSeries[32] = new Serie("Demolidor", "Acao", 3, 3);
        listaSeries[33] = new Serie("Jack Ryan", "Acao", 4, 4);
        listaSeries[34] = new Serie("Reacher", "Acao", 5, 2);
        listaSeries[35] = new Serie("The Witcher", "Acao", 6, 3);
        listaSeries[36] = new Serie("24 Horas", "Acao", 7, 9);
        listaSeries[37] = new Serie("Arrow", "Acao", 8, 8);
        listaSeries[38] = new Serie("Spartacus", "Acao", 9, 3);
        listaSeries[39] = new Serie("Banshee", "Acao", 10, 4);

        // COMEDIA SÉRIES
        listaSeries[40] = new Serie("The Office", "Comedia", 1, 9);
        listaSeries[41] = new Serie("Brooklyn Nine-Nine", "Comedia", 2, 8);
        listaSeries[42] = new Serie("Friends", "Comedia", 3, 10);
        listaSeries[43] = new Serie("Modern Family", "Comedia", 4, 11);
        listaSeries[44] = new Serie("Seinfeld", "Comedia", 5, 9);
        listaSeries[45] = new Serie("The Big Bang Theory", "Comedia", 6, 12);
        listaSeries[46] = new Serie("Parks and Recreation", "Comedia", 7, 7);
        listaSeries[47] = new Serie("Arrested Development", "Comedia", 8, 5);
        listaSeries[48] = new Serie("Two and a Half Men", "Comedia", 9, 12);
        listaSeries[49] = new Serie("How I Met Your Mother", "Comedia", 10, 9);

        // ROMANCE SÉRIES
        listaSeries[50] = new Serie("Bridgerton", "Romance", 1, 2);
        listaSeries[51] = new Serie("Outlander", "Romance", 2, 7);
        listaSeries[52] = new Serie("Normal People", "Romance", 3, 1);
        listaSeries[53] = new Serie("Heartstopper", "Romance", 4, 2);
        listaSeries[54] = new Serie("Virgin River", "Romance", 5, 5);
        listaSeries[55] = new Serie("Doces Magnolias", "Romance", 6, 3);
        listaSeries[56] = new Serie("Amor Moderno", "Romance", 7, 2);
        listaSeries[57] = new Serie("Jane the Virgin", "Romance", 8, 5);
        listaSeries[58] = new Serie("Gossip Girl", "Romance", 9, 6);
        listaSeries[59] = new Serie("The Vampire Diaries", "Romance", 10, 8);

        // DOCUMENTARIO SÉRIES
        listaSeries[60] = new Serie("Arremesso Final", "Documentario", 1, 1);
        listaSeries[61] = new Serie("Planeta Terra", "Documentario", 2, 2);
        listaSeries[62] = new Serie("Cosmos", "Documentario", 3, 1);
        listaSeries[63] = new Serie("Making a Murderer", "Documentario", 4, 2);
        listaSeries[64] = new Serie("Formula 1: Dirigir para Viver", "Documentario", 5, 5);
        listaSeries[65] = new Serie("A Mafia dos Tigres", "Documentario", 6, 2);
        listaSeries[66] = new Serie("Nova", "Documentario", 7, 50);
        listaSeries[67] = new Serie("Chef's Table", "Documentario", 8, 6);
        listaSeries[68] = new Serie("Wild Wild Country", "Documentario", 9, 1);
        listaSeries[69] = new Serie("Band of Brothers", "Documentario", 10, 1);

        // ANIMACAO SÉRIES
        listaSeries[70] = new Serie("Rick and Morty", "Animacao", 1, 6);
        listaSeries[71] = new Serie("BoJack Horseman", "Animacao", 2, 6);
        listaSeries[72] = new Serie("Avatar: A Lenda de Aang", "Animacao", 3, 3);
        listaSeries[73] = new Serie("Arcane", "Animacao", 4, 1);
        listaSeries[74] = new Serie("Os Simpsons", "Animacao", 5, 34);
        listaSeries[75] = new Serie("Futurama", "Animacao", 6, 8);
        listaSeries[76] = new Serie("Family Guy", "Animacao", 7, 21);
        listaSeries[77] = new Serie("South Park", "Animacao", 8, 26);
        listaSeries[78] = new Serie("Castlevania", "Animacao", 9, 4);
        listaSeries[79] = new Serie("Invencivel", "Animacao", 10, 2);


        // ==========================================
        // PARTE 3: MENUS DE INTERAÇÃO COM O USUÁRIO
        // ==========================================
        Scanner leitor = new Scanner(System.in);

        System.out.println("          MENU DE SELEÇÃO                ");
        System.out.println("=========================================");
        System.out.println("Categorias disponíveis:");
        System.out.println("1 - Terror      5 - Comedia");
        System.out.println("2 - Drama       6 - Romance");
        System.out.println("3 - Ficcao      7 - Documentario");
        System.out.println("4 - Acao        8 - Animacao");
        
        // Pede o gênero dos filmes
        System.out.print("\n-> Digite o numero do genero para FILMES (1 a 8): ");
        String opFilme = leitor.nextLine();

        // Pede o gênero das séries
        System.out.print("-> Digite o numero do genero para SERIES (1 a 8): ");
        String opSerie = leitor.nextLine();

        // Converte o número digitado na palavra exata do gênero para Filmes
        String generoFilmeBuscado = obterNomeGenero(opFilme);
        // Converte o número digitado na palavra exata do gênero para Séries
        String generoSerieBuscado = obterNomeGenero(opSerie);

        // Verifica se o usuário digitou opções válidas
        if (generoFilmeBuscado.equals("Invalido") || generoSerieBuscado.equals("Invalido")) {
            System.out.println("\n[ERRO] Voce digitou uma opcao invalida! Tente rodar o programa novamente.");
            leitor.close();
            return; // Encerra o programa
        }

        // ==========================================
        // PARTE 4: EXIBIÇÃO DOS RESULTADOS (JUNTOS)
        // ==========================================
        
        System.out.println("\n=========================================");
        System.out.println("        TOP 10 FILMES: " + generoFilmeBuscado.toUpperCase());
        System.out.println("=========================================");
        for (int i = 0; i < listaFilmes.length; i++) {
            if (listaFilmes[i].getGenero().equals(generoFilmeBuscado)) {
                listaFilmes[i].exibirDetalhes();
            }
        }

        System.out.println("\n=========================================");
        System.out.println("        TOP 10 SERIES: " + generoSerieBuscado.toUpperCase());
        System.out.println("=========================================");
        for (int i = 0; i < listaSeries.length; i++) {
            if (listaSeries[i].getGenero().equals(generoSerieBuscado)) {
                listaSeries[i].exibirDetalhes();
            }
        }

        leitor.close();
    }

    // ==========================================
    // MÉTODO AUXILIAR PARA O MENU
    // ==========================================
    // Criei esse método fora do main para o código não ficar tão bagunçado com vários switches
    public static String obterNomeGenero(String opcao) {
        switch (opcao) {
            case "1": return "Terror";
            case "2": return "Drama";
            case "3": return "Ficcao";
            case "4": return "Acao";
            case "5": return "Comedia";
            case "6": return "Romance";
            case "7": return "Documentario";
            case "8": return "Animacao";
            default: return "Invalido";
        }
    }
}

// ==========================================
// CLASSES DOS PLANOS (Usuário, Básico, Premium)
// ==========================================
abstract class Usuario  {
    private String usuario;
    private double plano;

    public Usuario(String usuario, double plano) {
        this.usuario = usuario;
        this.plano = plano;
    }
    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }
    public double getPlano() { return plano; }
    public void setPlano(double plano) { this.plano = plano; }
    
    public abstract void validarDireitos();
}

class Basico extends Usuario {
    public Basico(String usuario, double plano) {
        super(usuario, plano);
    }
    @Override
    public void validarDireitos() {
        System.out.println("Plano: Basico");
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Valor: R$ " + String.format("%.2f", getPlano()));
        if (getPlano() > 0) {
            System.out.println("O que voce tem direito:");
            System.out.println("- 1 tela\n- Filmes\n- Series\n- Uso no site ( nao possui aplicativo )");
        } else {
            System.out.println("Status: Pagamento pendente.\n- Nenhum acesso");
        }
    }
}

class Premium extends Usuario {
    public Premium(String usuario, double plano) {
        super(usuario, plano);
    }
    @Override
    public void validarDireitos() {
        System.out.println("Plano: Premium");
        System.out.println("Usuario: " + getUsuario());
        System.out.println("Valor: R$ " + String.format("%.2f", getPlano()));
        if (getPlano() > 0) {
            System.out.println("O que voce tem direito:");
            System.out.println("- 4 telas\n- Filmes\n- Series\n- Sem propaganda\n- Pode usar o aplicativo");
        } else {
            System.out.println("Status: Pagamento pendente.\n- Nenhum acesso");
        }
    }
}