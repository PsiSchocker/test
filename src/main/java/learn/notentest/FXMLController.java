package learn.notentest;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {

    @FXML
    private Button bt;
    @FXML
    private TextField tfsch;
    @FXML
    private TextField tfmue;
    @FXML
    private TextField tfso;

    @FXML
    private TextField gesch;

    @FXML
    private TextField gemue;

    @FXML
    private TextField geso;

    @FXML
    private TextField schnitt1;

    @FXML
    private TextField schnitt2;

    @FXML
    private TextField schnitt3;

    @FXML
    private TextField schnitt4;

    @FXML
    public void bte(ActionEvent evt) {
        ArrayList<Double> a = new ArrayList<>();
        ArrayList<Double> b = new ArrayList<>();
        ArrayList<Double> c = new ArrayList<>();
        try {
            try {
                for (String s : tfsch.getText().split(",")) {
                    double t = Double.parseDouble(s);
                    if (t >= 1 && t <= 6) {
                        a.add(t);
                    }
                }
            } catch (NumberFormatException e) {
            }

            try {
                for (String s : tfmue.getText().split(",")) {
                    double t = Double.parseDouble(s);
                    if (t >= 1 && t <= 6) {
                        b.add(t);
                    }
                }
            } catch (NumberFormatException e) {
            }
            try {
                for (String s : tfso.getText().split(",")) {
                    double t = Double.parseDouble(s);
                    if (t >= 1 && t <= 6) {
                        c.add(t);
                    }
                }
            } catch (NumberFormatException e) {
            }

            int d = Integer.parseInt(gesch.getText());
            int e = Integer.parseInt(gemue.getText());
            int f = Integer.parseInt(geso.getText());

            double[] compute = compute(a, b, c, d, e, f);

            schnitt1.setText(String.valueOf(compute[0]));
            schnitt2.setText(String.valueOf(compute[1]));
            schnitt3.setText(String.valueOf(compute[2]));
            schnitt4.setText(String.valueOf(compute[3]));
        } catch (Exception e) {

            System.out.println("someting needs to bee fixed");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    private double[] compute(ArrayList<Double> schriftlich, ArrayList<Double> mündlich,
            ArrayList<Double> sonstiges, int schriftlichGewichtung,
            int mündlichGewichtung, int sonstigesGewichtung) {
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        int it1 = schriftlich.size();
        int it2 = mündlich.size();
        int it3 = sonstiges.size();

        double schnittGes = 0;
        double schnittSch = 0;
        double schnittMue = 0;
        double schnittSo = 0;

        double[] schnittArr = new double[4];

        for (Double g : schriftlich) {
            sum1 = sum1 + g;
        }
        schnittSch = sum1 / it1;

        for (Double g : mündlich) {
            sum2 = sum2 + g;
        }
        schnittMue = sum2 / it2;

        for (Double g : sonstiges) {
            sum3 = sum3 + g;
        }
        schnittSo = sum3 / it3;
        if (it1 == 0) {
            schnittSch = 1;
        }

        if (it2 == 0) {
            schnittMue = 1;
        }

        if (it3 == 0) {
            schnittSo = 1;
        }

        if (!(sonstiges.size() == 0)) {
            schnittGes = (schnittSch * schriftlichGewichtung
                    + schnittMue * mündlichGewichtung
                    + schnittSo * sonstigesGewichtung)
                    / (schriftlichGewichtung
                    + mündlichGewichtung
                    + sonstigesGewichtung);
        } else {

            schnittGes = (schnittSch * schriftlichGewichtung
                    + schnittMue * mündlichGewichtung)
                    / (schriftlichGewichtung
                    + mündlichGewichtung);

        }
        schnittArr[0] = schnittSch;
        schnittArr[1] = schnittMue;
        schnittArr[2] = schnittSo;
        schnittArr[3] = schnittGes;

        return schnittArr;
    }
}
