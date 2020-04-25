package ru.job4j.tracker.inheritance;

public class ReportUsage {

    public static void main(String[] args) {

        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        HtmlReport htmlRep = new HtmlReport();
        String htmlText = htmlRep.generate("Report's name", "Report's body");
        System.out.println(htmlText);

        JsonReport jsonRep = new JsonReport();
        String jsonText = jsonRep.generate("name", "body");
        System.out.println(jsonText);
    }
}
