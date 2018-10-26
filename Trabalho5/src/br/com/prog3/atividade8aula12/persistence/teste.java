package br.com.prog3.atividade8aula12.persistence;

import java.sql.Connection;
import java.util.List;

import br.com.prog3.atividade8aula12.model.Aluno;

public class teste {

	public static void main(String[] args) {
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno aluno = ad.findByMatricula(2);
		if(aluno != null){
		System.out.println(aluno.getNome());
		}
}
}