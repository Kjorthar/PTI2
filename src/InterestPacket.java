
public class InterestPacket {
	
	/*
	 * Nesta classe definimos a estrutura dos pacotes de interesse, que são:
	 * Name : Nome do conteúdo que é para demonstrar interesse.
	 * MustBeFresh : Se está na contentStore ou não.
	 * Nonce: Evitar looping...
	 * Para já assim, depois consideramos a hipotese do tempo e tudo mais...
	 */
	
	public Name name;
	public int mustBeFresh; //Se 1 ou 0...
	public int nonce; //Random int
	
	
	
	
	public InterestPacket(Name name, int mustBeFresh, int nonce) {
		super();
		this.name = name;
		this.mustBeFresh = mustBeFresh;
		this.nonce = nonce;
	}
	
	
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getMustBeFresh() {
		return mustBeFresh;
	}
	public void setMustBeFresh(int mustBeFresh) {
		this.mustBeFresh = mustBeFresh;
	}
	public int getNonce() {
		return nonce;
	}
	public void setNonce(int nonce) {
		this.nonce = nonce;
	}
	
	
	public InterestPacket clone() {
		return InterestPacket(this.name,this.mustBeFresh,this.none);
	}

	
	

}
