import javax.swing.JOptionPane;

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        int novoCanal = 0;
        SmartTv smartTv = new SmartTv();

        System.err.println("TV Ligada ? " + smartTv.ligada);
        System.err.println("Canal Atual ? " +smartTv.canal);
        System.err.println("Volume Atual ? " +smartTv.volume);

        smartTv.ligar();

        System.err.println("Novo Status - TV Ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();

        System.err.println("Novo Status - Volume Atual ? " +smartTv.volume);

        novoCanal = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um valor de um novo canal"));

        smartTv.mudarCanal(novoCanal);

        System.err.println("Novo Canal Atual ? " +smartTv.canal);
    }
}
