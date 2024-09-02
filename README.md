# dependency-inversion

dependency-inversion

Dependency Inversion Principle (DIP)
Use Case: A reporting service that depends on abstractions (interfaces) rather than concrete classes.

Directory: dependency-inversion

ReportGenerator: Interface for generating reports.
PdfReportGenerator and ExcelReportGenerator: Implementations of ReportGenerator.
ReportService: Depends on the ReportGenerator abstraction.