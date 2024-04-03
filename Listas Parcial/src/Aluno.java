
public class Aluno {
	private String nome;
	private String matricula;
	public Aluno(String nome) {
		this.nome = nome;
		matricula="000000";
	}
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}	

	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Eu sou um Aluno e meu nome é "+nome+" e a matricula é "+matricula;
		
	}	

	@Override
	public boolean equals(Object o) {
		Aluno a=(Aluno)o;
		return this.matricula.equals(a.matricula);
	}

}
