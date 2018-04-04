
public class DataPacket {
	
	/*
	 * Para o pacote de dados necessitamos 3 campos que o definem, que são:
	 * -> Name: Proveniente da classe "Names" onde são definidos os campos relevantes para definir os vários campos
	 * -> Content: O conteúdo, é convertido em bytes.
	 * -> Signature: A assinatura presente neste pacote.
	 * 
	 * Esta classe ainda pode sofrer alterações, apenas é um "esboço", tipos devem mudar.
	 */
	
	
	public Name name; //Objecto nome proveniente da classe Names
	public Content content; //Este conteúdo é convertido em bytes já na classe contents.
	public Signature signature; //Assinatura que também vira de uma classe em que são geradas a chaves e as assinatures.
	
	
	public DataPacket(Name name, Content content, Signature signature) {
		super();
		this.name = name;
		this.content = content;
		this.signature = signature;
	}


	public Name getName() {
		return name;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public Content getContent() {
		return content;
	}


	public void setContent(Content content) {
		this.content = content;
	}


	public Signature getSignature() {
		return singature;
	}


	public void setSignature(Signature signature) {
		this.signature = signature;
	}


	
	//Clone
	public DataPacket clone() {
		return DataPacket(this.name,this.content,this.signature);
	}
	
	
	
	
	
	
	

	
}
