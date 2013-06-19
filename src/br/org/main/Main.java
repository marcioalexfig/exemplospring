package br.org.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import br.org.dominio.Aluno;
import br.org.dominio.Professor;
import br.org.dominio.Turma;
import br.org.interf.Membro;

public class Main {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory( new FileSystemResource("spring.xml") );
//		Membro aluno = (Membro) factory.getBean("aluno");
//		Membro professor = (Membro) factory.getBean("professor");
//		Turma turma = (Turma) factory.getBean("turma");
//		
//		System.out.println( aluno.mostraNome() );
//		System.out.println( professor.mostraNome() );
//
//		for (Aluno a : turma.getAlunos() ){
//			System.out.println(a.getNome());
//		}
			
		ApplicationContext context = new ClassPathXmlApplicationContext("/exspring/resources/spring.xml");
		Membro aluno = (Membro) context.getBean(Aluno.class);
		Membro professor = (Membro) context.getBean(Professor.class);
		Turma turma = (Turma) context.getBean(Turma.class);
		System.out.println( aluno.mostraNome() );
		System.out.println( professor.mostraNome() );

	}

}
