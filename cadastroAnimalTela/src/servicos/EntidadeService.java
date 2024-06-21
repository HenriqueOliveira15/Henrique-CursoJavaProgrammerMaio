package servicos;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import entidades.Cachorro;
import entidades.Cobra;
import validacao.EntidadeValidacao;

public class EntidadeService {
	
	public Double calculaPrecoCachorro (String peso) {
		
		Cachorro cachorro = new Cachorro();
		
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validapeso(peso) == null) {
			JOptionPane.showMessageDialog(null, "O Valor " + peso + "Não é válido");
			}else {
			
			return cachorro.calcularPreco(entidadeValidacao.validapeso(peso));
		}
		
		return null;
	}
	
	public Double calculaPrecoCobra (String peso) {
		
		Cobra cobra = new Cobra();
		
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validapeso(peso) == null) {
			JOptionPane.showMessageDialog(null, "O Valor " + peso + "Não é válido");
		}else {
			
			return cobra.calcularPreco(entidadeValidacao.validapeso(peso));
		}
		
		return null;
	}
	
	
	public static void gerarPdfDetalharCachorro(Cachorro cachorro) {
		String caminhoArquivo = "D:\\CursoJavaProgrammerMaio\\Henrique-CursoJavaProgrammerMaio\\relatorios\\cachorro.pdf";
		Document document = new Document();

		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
			writer.setPageEvent(new RodapeTemplate());
			
			document.open();
			document.add(new Paragraph("Empresa: IMPACTA", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
			
			document.add(new Paragraph("Relatorio de Detalhe do Cachorro", FontFactory.getFont(FontFactory.HELVETICA_BOLD,14)));
			
			document.add(new Paragraph(" "));
			
			if (cachorro != null) {
				
				PdfPTable table = new PdfPTable(2);
				table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
				table.setWidthPercentage(100);
				
				table.addCell("CAF");
				table.addCell(cachorro.getCaf());
				
				table.addCell("Nome");
				table.addCell(cachorro.getNome());
				
				table.addCell("Cor Pelo");
				table.addCell(cachorro.getCorPelo());
			
				table.addCell("Cep");
				table.addCell(cachorro.getEndereco().getCep());
				
				table.addCell("Localidade");
				table.addCell(cachorro.getEndereco().getLocalidade());
				
				table.addCell("Logradouro");
				table.addCell(cachorro.getEndereco().getLogradouro());
				
				table.addCell("Bairro");
				table.addCell(cachorro.getEndereco().getBairro());
				
				table.addCell("Uf");
				table.addCell(cachorro.getEndereco().getUf());
			
				document.add(table);
			}
			
			document.close();
			
			File pdfArquivo = new File(caminhoArquivo);
			
			if(pdfArquivo.exists()) {
				if(Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfArquivo);
				}else {
					System.out.println("PDF gerado mas não foi possivel abrir");
				}
				
			}else {
				System.out.println("PDF gerado mas não foi possivel encontrar");
			}
			
		
		} catch (Exception e) {
			e.getMessage();
		}

	}
	
	
	public static void gerarPdfDetalharCobra(Cobra cobra) {
		String caminhoArquivo = "D:\\CursoJavaProgrammerMaio\\Henrique-CursoJavaProgrammerMaio\\relatorios\\cobra.pdf";
		Document document = new Document();

		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
			writer.setPageEvent(new RodapeTemplate());
			
			document.open();
			document.add(new Paragraph("Empresa: IMPACTA", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));
			
			document.add(new Paragraph("Relatorio de Detalhe da Cobra", FontFactory.getFont(FontFactory.HELVETICA_BOLD,14)));
			
			document.add(new Paragraph(" "));
			
			if (cobra != null) {
				
				PdfPTable table = new PdfPTable(2);
				table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
				table.setWidthPercentage(100);
				
				table.addCell("CAF");
				table.addCell(cobra.getCaf());
				
				table.addCell("Nome");
				table.addCell(cobra.getNome());
				
				table.addCell("Cor Pelo");
				table.addCell(cobra.getTipoVeneno());
			
				table.addCell("Cep");
				table.addCell(cobra.getEndereco().getCep());
				
				table.addCell("Localidade");
				table.addCell(cobra.getEndereco().getLocalidade());
				
				table.addCell("Logradouro");
				table.addCell(cobra.getEndereco().getLogradouro());
				
				table.addCell("Bairro");
				table.addCell(cobra.getEndereco().getBairro());
				
				table.addCell("Uf");
				table.addCell(cobra.getEndereco().getUf());
			
				document.add(table);
			}
			
			document.close();
			
			File pdfArquivo = new File(caminhoArquivo);
			
			if(pdfArquivo.exists()) {
				if(Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfArquivo);
				}else {
					System.out.println("PDF gerado mas não foi possivel abrir");
				}
				
			}else {
				System.out.println("PDF gerado mas não foi possivel encontrar");
			}
			
		
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
