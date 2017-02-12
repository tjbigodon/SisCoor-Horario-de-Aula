package utilitarios;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class GeraTabela {

    public static void main(String[] args) {
        Document doc = new Document();
        int cont = 0;
        try{
            PdfWriter pdf = PdfWriter.getInstance(doc, new FileOutputStream("Tabela"+cont+".pdf"));
            doc.setPageSize(PageSize.A4.rotate());
            doc.open();
            
            insereTabela(pdf, doc);
            
            //insereTabela(pdf, doc);
        }catch(DocumentException de){
            System.out.println(de.getMessage());
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            doc.close();
        }
    }
    
    public static void insereTabela(PdfWriter pdf, Document doc){
        try{
            Font fTitulo = new Font(Font.FontFamily.UNDEFINED, 14, Font.BOLD);
            Font fSubTitulo = new Font(Font.FontFamily.UNDEFINED, 12, Font.BOLD);
            PdfPTable tabela = new PdfPTable(12);
            tabela.setWidthPercentage(100f);
            PdfPCell nomeCurso = new PdfPCell(new Paragraph ("GTI - 2 periodo", fTitulo));
            PdfPCell horario = new PdfPCell (new Paragraph ("Horário", fTitulo));
            PdfPCell diaSemana;
            PdfPCell subTitulo;
            nomeCurso.setHorizontalAlignment(Element.ALIGN_CENTER);
            nomeCurso.setRowspan(6);
            nomeCurso.setVerticalAlignment(Element.ALIGN_MIDDLE);
            horario.setHorizontalAlignment(Element.ALIGN_CENTER);
            horario.setRowspan(2);
            horario.setVerticalAlignment(Element.ALIGN_MIDDLE);
            tabela.addCell(nomeCurso);
            tabela.addCell(horario);
            diaSemana = new PdfPCell(new Paragraph("Segunda",fTitulo));
            diaSemana.setColspan(2);
            diaSemana.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(diaSemana);
            diaSemana = new PdfPCell(new Paragraph("Terça",fTitulo));
            diaSemana.setColspan(2);
            diaSemana.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(diaSemana);
            diaSemana = new PdfPCell(new Paragraph("Quarta",fTitulo));
            diaSemana.setColspan(2);
            diaSemana.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(diaSemana);
            diaSemana = new PdfPCell(new Paragraph("Quinta",fTitulo));
            diaSemana.setColspan(2);
            diaSemana.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(diaSemana);
            diaSemana = new PdfPCell(new Paragraph("Sexta",fTitulo));
            diaSemana.setColspan(2);
            diaSemana.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(diaSemana);
            subTitulo = new PdfPCell(new Paragraph("Disciplina",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Docente",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Disciplina",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Docente",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Disciplina",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Docente",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Disciplina",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Docente",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Disciplina",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            subTitulo = new PdfPCell(new Paragraph("Docente",fSubTitulo));
            subTitulo.setHorizontalAlignment(Element.ALIGN_CENTER);
            tabela.addCell(subTitulo);
            tabela.addCell(new Paragraph("Horario 1",fSubTitulo));
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell(new Paragraph("Horario 2",fSubTitulo));
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell(new Paragraph("Horario 3",fSubTitulo));
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell(new Paragraph("Horario 4",fSubTitulo));
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            tabela.addCell("LTP");
            
            
            doc.add(tabela);
        }catch(DocumentException de){
            System.out.println(de.getMessage());
        }
    }
}
