package topic03_InheritanceAndPolymorphism;

public class LegalEntity extends Person{

	private String cnpj;
	
	public LegalEntity() {
		super();
	}

	public LegalEntity(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
