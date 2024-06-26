package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.CorrentistaPadrao;
import entidades.Correntista;
import entidades.Endereco;

public class DaoCorrentistaPadrao {
	
	public boolean salvarCorrentista(CorrentistaPadrao correntista) {
		
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
			preparaComandoSQL.setString(3, correntista.getEndereco().getCep()); 
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
			System.out.println("Nao foi possivel registrar esse correntista");
			
		}finally { 
			
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
	
	public List<CorrentistaPadrao> retornaListaDeCorrentistas() {

		String comandoSqlBuscarCorrentista = "SELECT * FROM correntista";
		List<CorrentistaPadrao> listaCorrentista = new ArrayList<>(); 
		FabricaConexao conexaoFabricaConexao = new FabricaConexao();

		Connection connectionBaseExemplo = null;
		PreparedStatement preparaOcomandoSQL = null; 
		ResultSet resultadoDaTabelaDoBanco = null;

		try {

			connectionBaseExemplo = conexaoFabricaConexao.criarConexaoCadastroCorrentista(); 
																								
			preparaOcomandoSQL = connectionBaseExemplo.prepareStatement(comandoSqlBuscarCorrentista);
			resultadoDaTabelaDoBanco = preparaOcomandoSQL.executeQuery();

			while (resultadoDaTabelaDoBanco.next()) {
				
				CorrentistaPadrao correntista = new CorrentistaPadrao();
				
				Endereco endereco = new Endereco();

				correntista.setNome(resultadoDaTabelaDoBanco.getString("nome"));
				correntista.setCpf(resultadoDaTabelaDoBanco.getString("cpf"));
				endereco.setCep(resultadoDaTabelaDoBanco.getString("cep"));;
			
				/*
				endereco.setCep(resultadoDaTabelaDoBanco.getString("cep"));
				endereco.setBairro(resultadoDaTabelaDoBanco.getString("bairro"));
				endereco.setLogradouro(resultadoDaTabelaDoBanco.getString("logradouro"));
				endereco.setLocalidade(resultadoDaTabelaDoBanco.getString("localidade"));
				endereco.setUf(resultadoDaTabelaDoBanco.getString("uf"));
				*/
				
				correntista.setEndereco(endereco);
				
				listaCorrentista.add(correntista); 
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
	
	public boolean deletarCorrentista(String cpf) {

		boolean deletar = false;

		FabricaConexao conexaoFabricaConexao = new FabricaConexao();
		Connection connectionBaseExemplo = null; 
		PreparedStatement preparaOcomandoSQL = null; 

		String comandoSqlDelete = "DELETE FROM correntista WHERE cpf = ?;"; 

		try {
			connectionBaseExemplo = conexaoFabricaConexao.criarConexaoCadastroCorrentista(); 
			
			preparaOcomandoSQL = connectionBaseExemplo.prepareStatement(comandoSqlDelete);
																				
																							
			preparaOcomandoSQL.setString(1, cpf);

			preparaOcomandoSQL.execute(); 

			System.out.println("Correntista Deletado");

			deletar = true; 

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(" Não foi possivel deletar");

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

		return deletar;

	}
	
	public boolean alterarCorrentista(CorrentistaPadrao correntista) {

		boolean alterar = false;

		FabricaConexao conexaoFabricaConexao = new FabricaConexao();
		Connection connectionBaseExemplo = null; 
		PreparedStatement preparaOcomandoSQL = null; 

		String comandoSqlDelete = "UPDATE correntista SET nome = ?, cep = ? WHERE cpf = ?;"; //Exemplo CEP = 00000-000 , CPF = 000.000.000-00 
		
		try {
			connectionBaseExemplo = conexaoFabricaConexao.criarConexaoCadastroCorrentista(); 
			
			preparaOcomandoSQL = connectionBaseExemplo.prepareStatement(comandoSqlDelete);
													
			preparaOcomandoSQL.setString(1, correntista.getNome());																			
			preparaOcomandoSQL.setString(2, correntista.getCpf());
			preparaOcomandoSQL.setString(3, correntista.getEndereco().getCep());

			preparaOcomandoSQL.execute(); 

			System.out.println("Correntista Alterado");

			alterar = true; 

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(" Não foi possivel alterar");

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

		return alterar;

	}
	
	


}
