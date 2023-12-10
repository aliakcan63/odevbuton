import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonKontrol extends JButton {
    private String GraphQLşeması;
    private Color aktifButonRengi;
    private Color pasifButonRengi;
    private boolean aktifMi;
    private static ButonKontrol butonKontrol;

    public ButonKontrol(String text) {
        super(text);
        this.GraphQLşeması = "";
        this.aktifButonRengi = Color.blue;
        this.pasifButonRengi = Color.CYAN;
        this.aktifMi = false;

        PasifDurum();
        addActionListener(new ButtonClickListener());
    }

    public void setGraphQLşeması(String şema) {
        this.GraphQLşeması = şema;
    }

    public void setAktif(Color renk) {
        this.aktifButonRengi = renk;
    }

    public void setPasif(Color renk) {
        this.pasifButonRengi = renk;
    }

    private void PasifDurum() {
        setBackground(pasifButonRengi);
        setText("Pasif Buton");
        aktifMi = false;
    }

    private void setAktifDurum() {
        setBackground(aktifButonRengi);
        setText("Aktif Buton");
        aktifMi = true;
        System.out.println("Çalıştı... " + GraphQLşeması);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (aktifMi) {
                setPasifDurumSimdikiHaricTumu();
                aktifMi = false;
            } else {
                butonKontrol();
                setAktifDurum();
                aktifMi = true;
            }
        }
    }

    private void butonKontrol() {
        butonKontrol = this;
    }

    private void setPasifDurumSimdikiHaricTumu() {
        for (Component component : getParent().getComponents()) {
            if (component instanceof ButonKontrol) {
                ButonKontrol button = (ButonKontrol) component;
                if (button != this) {
                    button.PasifDurum();
                }
            }
        }
    }
}
