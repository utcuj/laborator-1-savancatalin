
import javax.swing.*;
import java.awt.*;

public class Interface {

    private Gara gara;
    private JFrame frame;
    private JLabel codLabel;
    private JTextField codText;
    private JButton buton;
    private JTextArea infoText;
    private JPanel mainPanel;
    private JPanel searchPanel;

    public Interface(Gara gara) {
        this.gara = gara;
    }

    public void go() {
        frame = new JFrame("Statie Tren");
        codLabel = new JLabel("Cod tren: ");
        codText = new JTextField(10);
        buton = new JButton("Afisare tren");
        infoText = new JTextArea(1, 25);
        mainPanel = new JPanel(new FlowLayout());
        searchPanel = new JPanel(new FlowLayout());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        infoText.setEditable(false);

        buton.addActionListener(e -> {
            if (codText != null) {
                String cod = codText.getText();
                if (cod.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Nu ati completat campul!");
                } else {
                    String info = InfoTrenCod(cod);
                    if (!info.equals("")) {
                        infoText.setText("Trenul tau ajunge in  "+ info + "Statie ta:"+gara.getNumeGara());
                    } else {
                        infoText.setText("Trenul nu a fost gasit!");
                    }
                }
            }
        });

        searchPanel.add(codLabel);
        searchPanel.add(codText);
        searchPanel.add(buton);
        mainPanel.add(searchPanel);
        mainPanel.add(infoText);

        frame.add(mainPanel);
        frame.setSize(400, 150);
        frame.setVisible(true);
    }

    public String InfoTrenCod(String cod) {
        for (Tren tren : gara.getTrenuri()) {
            if ((tren.getCodTren()).equals(cod) && (tren.getMin()!= -1) && (tren.getOra()!= -1)) {
                return tren.InfoTren();
   
            }
        }
        return "";
    }
}
