package vue;

import controleur.CtrlAbstrait;
import javax.swing.JPanel;

/**
 * VueAbstraite
 modèle de vue
 - un lien vers le contrôleur
 chaque contrôleur a un lien vers une vue
 * @author nbourgeois
 * @version  20 novembre 2013
 */

public abstract class VueAbstraite extends JPanel{
    // associations
    protected CtrlAbstrait controleur=null;
    
    public VueAbstraite(CtrlAbstrait ctrl) {
        this.controleur = ctrl;
    }       
    
}
