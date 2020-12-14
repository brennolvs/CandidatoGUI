package controller;

import dao.CandidatoDao;
import model.Candidato;

public class ControllerCandidato {
	
public int cadastrar(String nome,String cpf, String cargo) {
		
		Candidato c = new Candidato (nome, cpf, cargo);
		Candidato cDao = new Candidato();
		return (cDao.create(c));
	}

}
