

public class Name {
	
	public Name() {
		this.d_name = "";
	}

	public String getName() {
		return this.d_name;
	}
	
	public int getNameSize() {
		//maybe not even necessary, but it stays here
		//assumes UTF-8 encoding
		return this.d_name.length();
	}
	
	public static byte NAME_TYPE = 0X07;
	public static byte NAME_COMP_TYPE = 0X08;
	private String d_name;
}

/*NAME COMPOSITION FOR NEWS APP
 *  For interest packets:
 *  source / category / YYYY / MM / DD / optional -> name.ext / filters
 * 
 *  For data packets:
 *  source / category / YYYY / MM / DD / name.ext / filters
 *  ex: publico / politica / 2018 / 04 / 08 / corrupçao.txt / ps
 * */
