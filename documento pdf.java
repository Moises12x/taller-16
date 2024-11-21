public class Main {
    public class Documento {
        public void exportarPDF(String contenido) {
            System.out.println("Exportando a PDF: " + contenido);
        }
    }
    public interface Exportador {
        void exportar(String contenido);
    }
// para PDF
public class ExportadorPDF implements Exportador {
    public void exportar(String contenido) {
        System.out.println("Exportando a PDF: " + contenido);
    }
}
// para Word
public class ExportadorWord implements Exportador {
    public void exportar(String contenido) {
        System.out.println("Exportando a Word: " + contenido);
    }
}

// para Excel
public class ExportadorExcel implements Exportador {
    public void exportar(String contenido) {
        System.out.println("Exportando a Excel: " + contenido);
    }
}   
}
