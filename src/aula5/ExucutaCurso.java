package aula5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExucutaCurso {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// ordenando pelo número de alunos inscritos
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

		OptionalDouble elemento = cursos.stream().mapToInt(c -> c.getAlunos())
				.average();
		
		List<Curso> stream= cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		
		System.out.println(stream);

		System.out.println(elemento);
		// stream().forEach(c -> System.out.println(c.getAlunos()));
	}

}
