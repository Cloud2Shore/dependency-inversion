package dip.service;

import org.springframework.stereotype.Component;

@Component
public class ExcelReportGenerator implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Generating Excel report.");
    }
}
