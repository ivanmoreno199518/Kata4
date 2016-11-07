package control;

import model.Histogram;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class Kata4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "/Users/IvanMoreno/Downloads/emailsfilev1.txt";
        ArrayList<String> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();

    }
}