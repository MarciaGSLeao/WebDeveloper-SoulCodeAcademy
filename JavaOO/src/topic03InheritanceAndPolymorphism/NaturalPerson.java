package topic03InheritanceAndPolymorphism;

public class NaturalPerson extends Person{
	
	private String cpf;
	
	public NaturalPerson() {
		super();
	}

	public NaturalPerson(String cpf) {
		super();
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
