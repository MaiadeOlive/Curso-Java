package entities;

public class Curso implements Comparable<Curso>{

	private Integer matriculaAluno;

	public Curso(Integer matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public Integer getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(Integer matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public int compareTo(Curso other) {
		return matriculaAluno.compareTo(other.getMatriculaAluno());
	}
}
