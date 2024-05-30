package csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvPrintPersonWriter {

    public static void main(String[] args) {
        List<Person> dataLines = buildSampleData();
        writeUsingPrintWriter(dataLines);
    }

    private static List<Person> buildSampleData() {
        List<Person> sampleDataLines = new ArrayList<>();
        sampleDataLines.add(new Person("Marcel", "Ionescu",
                38, "email_marcel@abc.com"));

        sampleDataLines.add(new Person("Sorin", "Popescu",
                19, "email_sorin@def.com" ));
        return sampleDataLines;
    }

    private static void writeUsingPrintWriter(List<Person> dataLines) {
        try (PrintWriter pw = new PrintWriter(new File("./persoane.csv"))) {
            for (Person p : dataLines) {
                pw.println(p.getNume() + ',' + p.getPrenume() + ',' + p.getVarsta() + ',' + p.getEmail());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
