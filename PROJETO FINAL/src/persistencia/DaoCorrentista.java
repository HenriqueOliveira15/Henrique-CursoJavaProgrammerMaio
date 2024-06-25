package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Correntista;

public class DaoCorrentista {
	
	public boolean salvarCorrentista(Correntista correntista) {
		boolean salvamento = false;
		
		FabricaConexao conexaoConectarBancoTeste = new FabricaConexao();
		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;
		
		
		String comandoSqlInsert = "insert into correntista (nome, cpf, cep, qtdTransacoes) values (?, ?, ?, ?)";
	
		
		try {
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroCorrentista();
			
			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlInsert);	
			
			preparaComandoSQL.setString(1, correntista.getNome());
			preparaComandoSQL.setString(2, correntista.getCpf());
			preparaComandoSQL.setString(3, correntista.getCep()); 
			preparaComandoSQL.setString(4, correntista.getQtdTransacao().toString());
			//preparaComandoSQL.setString(5, correntista.getEndereco().getCep());
			//preparaComandoSQL.setString(6, correntista.getEndereco().getLocalidade());
			//preparaComandoSQL.setString(7, correntista.getEndereco().getLogradouro());
			//preparaComandoSQL.setString(8, correntista.getEndereco().getBairro());
			//preparaComandoSQL.setString(9, correntista.getEndereco().getUf());
			
			preparaComandoSQL.execute();
		
			System.out.println("Correntista registrado com sucesso");
			
			salvamento = true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Nao foi possivel registrar esse cachorro");
			
		}finally { // Esse é obrigatório
			
			try {
				if(connectionBaseTeste != null) {
					connectionBaseTeste.close();
				}
				if (preparaComandoSQL != null) {
					preparaComandoSQL.close();
				}

				
			} catch (Exception e2) {
				System.out.println("Não foi possível fechar a conexão");
			}
			
		}
	
		return salvamento;
	}
	
	public List<Correntista> retornaListaDeCorrentistas() {

		String comandoSqlBuscarCorrentista = "select * from correntista";
		List<Correntista> listaCorrentista = new ArrayList<>(); 
		FabricaConexao conexaoFabricaConexao = new FabricaConexao();

		Connection connectionBaseExemplo = null;
		PreparedStatement preparaOcomandoSQL = null; 
		ResultSet resultadoDaTabelaDoBanco = null;

		try {

			connectionBaseExemplo = conexaoFabricaConexao.criarConexaoCadastroCorrentista(); 
																								
			preparaOcomandoSQL = connectionBaseExemplo.prepareStatement(comandoSqlBuscarCorrentista);
			resultadoDaTabelaDoBanco = preparaOcomandoSQL.executeQuery();

			while (resultadoDaTabelaDoBanco.next()) {
				Correntista correntista = new Correntista();
				
				//Endereco endereco = new Endereco();

				correntista.setNome(resultadoDaTabelaDoBanco.getString("nome"));
				correntista.setCpf(resultadoDaTabelaDoBanco.getString("cpf"));
				correntista.setCep(resultadoDaTabelaDoBanco.getString("cep"));
				//correntista.setSalario(Double.parseDouble(resultadoDaTabelaDoBanco.getString("salario")));
			
				/*
				endereco.setCep(resultadoDaTabelaDoBanco.getString("cep"));
				endereco.setBairro(resultadoDaTabelaDoBanco.getString("bairro"));
				endereco.setLogradouro(resultadoDaTabelaDoBanco.getString("logradouro"));
				endereco.setLocalidade(resultadoDaTabelaDoBanco.getString("localidade"));
				endereco.setUf(resultadoDaTabelaDoBanco.getString("uf"));
				atendente.setEndereco(endereco);
				listaAtendente.add(atendente); */
			}

		} catch (Exception e) {
			System.out.println("Erro ao buscar a lista de Correntistas");
		} finally { 
			try {
				if (connectionBaseExemplo != null) {
					connectionBaseExemplo.close();
												
				}
				if (preparaOcomandoSQL != null) {
					preparaOcomandoSQL.close();
				}

			} catch (Exception e2) {
				System.out.println("Não foi possivel fechar a conexão!!");
			}
		}

		return listaCorrentista;

	}


}
