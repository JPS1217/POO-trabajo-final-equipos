package universidadnacional;

import javax.swing.JFrame;

/**
 *
 * @author jps12
 */
public class UniversidadNacional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FrmPrincipal principal = new FrmPrincipal();
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
    
}
