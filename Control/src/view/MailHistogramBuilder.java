package view;

import model.Histogram;
import model.Mail;

import java.util.ArrayList;

public class MailHistogramBuilder {
    public static Histogram<String> build(ArrayList<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail2 : mail) {
            histo.increment(new Mail(mail2).getDomain());
        }
        return histo;
    }
}