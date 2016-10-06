package h8;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Knoppenenvensterstekenen4variabelen2 extends Applet {
    int beginHoogte;
    Color diagramKleur;
    int valerie, hoogteVy1, hoogteVy2, staafGrootteV;
    int jeroen, hoogteJy1, hoogteJy2, staafGrootteJ;
    int hans, hoogteHy1, hoogteHy2, staafGrootteH;
    int vGetal, jGetal, hGetal;
    TextField valerieField, jeroenField, hansField;
    Label vLabel, jLabel, hLabel;
    Button wijzig;
    Font mijnFont;
    public void init() {
        vLabel = new Label("Valerie");
        add(vLabel);
        valerieField = new TextField("", 3);
        add(valerieField);
        vGetal = 40;

        jLabel = new Label("Jeroen");
        add(jLabel);
        jeroenField = new TextField("", 3);
        add(jeroenField);
        jGetal = 100;

        hLabel = new Label("Hans");
        add(hLabel);
        hansField = new TextField("", 3);
        add(hansField);
        hGetal = 80;

        wijzig = new Button("Wijzig waardes");
        add(wijzig);
        wijzig.addActionListener(new WaardeListener());
    }


    public void paint(Graphics g) {

        setSize(800, 400);
        // Achtergrond kleur van staafdiagram.
        diagramKleur = new Color(230, 230, 230);
        g.setColor(diagramKleur);
        g.fillRect(50, 50, 141, 200);
        g.setColor(Color.black);

        // Hier kan de gewicht van de personen worden gewijzigd.
        valerie = vGetal;
        jeroen = jGetal;
        hans = hGetal;

        // Begin hoogte y van rechthoek (staaf).
        beginHoogte = 250;

        // Gewicht van Valerie berekening.
        staafGrootteV = valerie *2;
        hoogteVy2 = staafGrootteV;
        hoogteVy1 = beginHoogte - hoogteVy2;

        // Gewicht van Jeroen berekening.
        staafGrootteJ = jeroen *2;
        hoogteJy2 = staafGrootteJ;
        hoogteJy1 = beginHoogte - hoogteJy2;

        // Gewicht van Hans berekening.
        staafGrootteH = hans *2;
        hoogteHy2 = staafGrootteH;
        hoogteHy1 = beginHoogte - hoogteHy2;

        // Tabel lijn x en y
        g.drawLine(50, 50, 50, 250);
        g.drawLine(50, 250, 190, 250);

        // Staafdiagram naam
        // Pijltje voor staafdiagram naam (Gewicht in kg.)
        g.drawLine(40, 30, 40, 20);
        g.drawLine(40, 20, 42, 27);
        g.drawLine(40, 20, 38, 27);
        g.drawString("Gewicht in kg.", 50, 30);

        // Aantal gewicht
        g.drawString("100", 20, 50);
        // Grijze x lijn van 100
        g.setColor(Color.gray);
        g.drawLine(50, 50, 190, 50);

        g.setColor(Color.black);
        g.drawString("80", 27, 90);
        // Grijze x lijn van 80
        g.setColor(Color.gray);
        g.drawLine(50, 90, 190, 90);

        g.setColor(Color.black);
        g.drawString("60", 27, 130);
        // Grijze x lijn van 60
        g.setColor(Color.gray);
        g.drawLine(50, 130, 190, 130);

        g.setColor(Color.black);
        g.drawString("40", 27, 170);
        // Grijze x lijn van 40
        g.setColor(Color.gray);
        g.drawLine(50, 170, 190, 170);

        g.setColor(Color.black);
        g.drawString("20", 27, 210);
        // Grijze x lijn van 20
        g.setColor(Color.gray);
        g.drawLine(50, 210, 190, 210);

        g.setColor(Color.black);
        g.drawString("0", 30, 250);
        g.setColor(Color.gray);

        // Namen
        // Staaf
        g.setColor(Color.red);
        g.fillRect(70, hoogteVy1, 20, hoogteVy2);
        g.setColor(Color.black);
        g.drawString("Valerie", 50, 270);

        // Staaf
        g.setColor(Color.blue);
        g.fillRect(110, hoogteJy1, 20, hoogteJy2);
        g.setColor(Color.black);
        g.drawString("Jeroen", 100, 270);

        // Staaf
        g.setColor(Color.green);
        g.fillRect(150, hoogteHy1, 20, hoogteHy2);
        g.setColor(Color.black);
        g.drawString("Hans", 150, 270);
    }

    class WaardeListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            vGetal = Integer.parseInt(valerieField.getText());
            jGetal = Integer.parseInt(jeroenField.getText());
            hGetal = Integer.parseInt(hansField.getText());
            repaint();
        }
    }
}