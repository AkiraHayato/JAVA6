package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;
import java.util.List;

import br.com.prog3.atividade8aula12.controller.AlunoController;
import br.com.prog3.atividade8aula12.model.Aluno;

public class Teste {

	public static void main(String[] args) {
		// Connection con = ConnectionFactory.getConnection();
		AlunoController ad = new AlunoController();
		ad.setMatricula(2);
		ad.findAluno();
		Aluno aluno = ad.getAluno();
		if (aluno != null) {
			System.out.println(aluno.getNome());
		}

	}

}
