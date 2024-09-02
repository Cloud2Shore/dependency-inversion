package dip.service;

import org.springframework.stereotype.Component;

@Component
public class PdfReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating PDF report.");
    }
}

