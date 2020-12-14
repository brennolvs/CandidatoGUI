package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConectionFactory;
import model.Candidato;

public class CandidatoDao {
	
	public int create(Candidato c) {
		Connection con = null;
		java.sql.PreparedStatement stmt = null;
		String sqlInsert = "INSERT INTO candidato(nome,cpf, cargo) "
				+ "values (?,?,?,?)";
		
		con = ConectionFactory.getConnection();
		try {
			stmt=con.prepareStatement(sqlInsert);
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getCpf());
			stmt.setString(3, c.getCargo());
			stmt.execute();
			return 1;
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro na inserção do candidato", "ERRO", 4);
			return 0;
		}
		finally{
			ConectionFactory.closeConnection(con);
		}
	}
}
