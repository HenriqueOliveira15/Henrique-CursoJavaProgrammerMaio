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

import entidades.CorrentistaPadrao;
import entidades.CorrentistaPremium;
import validacao.EntidadeValidacao;

public class EntidadeService {

	public Double buscarAnuidadeCorrentista(String qtdTransacao) {

		CorrentistaPadrao correntista = new CorrentistaPadrao();
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();

		if (entidadeValidacao.validaqtdTransacao(qtdTransacao) == null) {
			JOptionPane.showMessageDialog(null, "O valor " + qtdTransacao + " Não é valido");
		} else {
			return correntista.calcularAnuidade(entidadeValidacao.validaqtdTransacao(qtdTransacao));
		}

		return null;
	}

	public Double buscarAnuidadeCorrentistaPremium(String qtdTransacao) {

		CorrentistaPremium correntista = new CorrentistaPremium();
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();

		if (entidadeValidacao.validaqtdTransacao(qtdTransacao) == null) {
			JOptionPane.showMessageDialog(null, "O valor " + qtdTransacao + " Não é valido");
		} else {
			return correntista.calcularAnuidade(entidadeValidacao.validaqtdTransacao(qtdTransacao));
		}

		return null;
	}

	public static void gerarPdfDetalharCorrentistaPadrao(CorrentistaPadrao correntista) {
		
		String caminhoArquivo = "D:\\CursoJavaProgrammerMaio\\Henrique-CursoJavaProgrammerMaio\\relatorios\\correntistaPadrao.pdf";
		
		Document document = new Document();

		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
			writer.setPageEvent(new RodapeTemplate());

			document.open();
			document.add(new Paragraph("Empresa: IMPACTA", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));

			document.add(new Paragraph("Relatorio de Detalhe do Correntista Padrao",
					FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));

			document.add(new Paragraph(" "));

			if (correntista != null) {

				PdfPTable table = new PdfPTable(2);
				table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
				table.setWidthPercentage(100);

				table.addCell("CPF");
				table.addCell(correntista.getCpf());

				table.addCell("Nome");
				table.addCell(correntista.getNome());

				table.addCell("Cep");
				table.addCell(correntista.getEndereco().getCep());

				table.addCell("Localidade");
				table.addCell(correntista.getEndereco().getLocalidade());

				table.addCell("Logradouro");
				table.addCell(correntista.getEndereco().getLogradouro());

				table.addCell("Bairro");
				table.addCell(correntista.getEndereco().getBairro());

				table.addCell("Uf");
				table.addCell(correntista.getEndereco().getUf());

				document.add(table);
			}

			document.close();

			File pdfArquivo = new File(caminhoArquivo);

			if (pdfArquivo.exists()) {
				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfArquivo);
				} else {
					System.out.println("PDF gerado mas não foi possivel abrir");
				}

			} else {
				System.out.println("PDF gerado mas não foi possivel encontrar");
			}

		} catch (Exception e) {
			e.getMessage();
		}

	}
	
public static void gerarPdfDetalharCorrentistaPremium(CorrentistaPremium correntista) {
		
		String caminhoArquivo = "D:\\CursoJavaProgrammerMaio\\Henrique-CursoJavaProgrammerMaio\\relatorios\\correntistaPremium.pdf";
		
		Document document = new Document();

		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(caminhoArquivo));
			writer.setPageEvent(new RodapeTemplate());

			document.open();
			document.add(new Paragraph("Empresa: IMPACTA", FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));

			document.add(new Paragraph("Relatorio de Detalhe do Correntista Padrao",
					FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14)));

			document.add(new Paragraph(" "));

			if (correntista != null) {

				PdfPTable table = new PdfPTable(2);
				table.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
				table.setWidthPercentage(100);

				table.addCell("CPF");
				table.addCell(correntista.getCpf());

				table.addCell("Nome");
				table.addCell(correntista.getNome());

				table.addCell("Cep");
				table.addCell(correntista.getEndereco().getCep());

				table.addCell("Localidade");
				table.addCell(correntista.getEndereco().getLocalidade());

				table.addCell("Logradouro");
				table.addCell(correntista.getEndereco().getLogradouro());

				table.addCell("Bairro");
				table.addCell(correntista.getEndereco().getBairro());

				table.addCell("Uf");
				table.addCell(correntista.getEndereco().getUf());

				document.add(table);
			}

			document.close();

			File pdfArquivo = new File(caminhoArquivo);

			if (pdfArquivo.exists()) {
				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfArquivo);
				} else {
					System.out.println("PDF gerado mas não foi possivel abrir");
				}

			} else {
				System.out.println("PDF gerado mas não foi possivel encontrar");
			}

		} catch (Exception e) {
			e.getMessage();
		}

	}

}
