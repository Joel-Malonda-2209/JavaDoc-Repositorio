package main;

import java.awt.Graphics;
import javax.smartcardio.Card;

/**
 *
 * @Autor Joel
 * Free Use - Livre_Uso
 */
public class BaralhoSecundario extends Pilha{
    
    /**
     *
     * @param x
     * @param y
     */
    public BaralhoSecundario(int x, int y) {
        super(x, y);
        super.setSize(72, 96);
    }

    /**
     *
     * @param g
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(this.isEmpty()) {
            g.drawImage(Carta.getCardOutline(), 0, 0, 72, this.getHeight(), this);
        }else {
            g.drawImage(this.top().getCardImage(), 0, 0, 72, this.getHeight(), this);
        }

    }
	
}
