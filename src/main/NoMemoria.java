package main;

/**
 *
 * @Autor joel
 * Free Use - Livre_Uso
 */
public class NoMemoria {
   
    /**
     *
     */
    public static BaralhoPrincipal baralhoPrincipal;

    /**
     *
     */
    public static BaralhoSecundario baralhoSecundario;

    /**
     *
     */
    public static SolucaoBaralho[] solucaoBaralho;

    /**
     *
     */
    public static Tabuleiro[] tabuleiro;
    NoMemoria proximo;
    NoMemoria anterior;
    
    /**
     *
     * @param baralhoPrincipal
     * @param baralhoSecundario
     * @param solucaoBaralho
     * @param tabuleiro
     */
    public NoMemoria(BaralhoPrincipal baralhoPrincipal, BaralhoSecundario baralhoSecundario, SolucaoBaralho[] solucaoBaralho, Tabuleiro[] tabuleiro){
        
        this.baralhoPrincipal = baralhoPrincipal;
        this.baralhoSecundario = baralhoSecundario;
        this.solucaoBaralho = solucaoBaralho;
        this.tabuleiro = tabuleiro;
    }
}
