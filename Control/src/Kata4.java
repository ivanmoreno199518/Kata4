//por que no se importA?

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import



public class Kata4 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "/Users/IvanMoreno/Downloads/emailsfilev1.txt";
        ArrayList<String> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();

    }
}
//falta la libreria, está mal importada, no es cosa del git