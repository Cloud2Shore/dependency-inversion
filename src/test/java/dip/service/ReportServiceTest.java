package dip.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ReportServiceTest {

    private ReportService reportService;
    private ReportGenerator reportGenerator;

    @BeforeEach
    void setUp() {
        reportGenerator = Mockito.mock(ReportGenerator.class);
        reportService = new ReportService(reportGenerator);
    }

    @Test
    void shouldCreateReportUsingProvidedReportGenerator() {
        reportService.createReport();

        verify(reportGenerator, times(1)).generateReport();
    }
}
