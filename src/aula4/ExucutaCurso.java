package aula4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExucutaCurso {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// ordenando pelo número de alunos inscritos
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

		cursos.stream().filter(c -> c.getAlunos() > 50)
		.map(c -> c.getCurso()).
		forEach(System.out::println);

		System.out.println(cursos);

		// stream().forEach(c -> System.out.println(c.getAlunos()));
	}

}
