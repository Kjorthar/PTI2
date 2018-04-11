

public class Name {
	
	
	//blank constructor
	public Name() {
		//this.d_name = "/pti2/grupo2";
	}
	
	//copy constructor
	public Name(Name n) {
		this.d_name = new String(n.getName());
	}

	public String getName() {
		return this.d_name;
	}
	
	public int getNameSize() {
		//maybe not even necessary, but it stays here
		//assumes UTF-8 encoding
		return this.d_name.length();
	}
	
	public void addSrcType(String src, String tp) {
		if(this.d_name.equals("/pti2/grupo2")) {
			String s = "/" + src + "/" + tp;
			this.d_name = this.d_name.concat(s);
		}
		else {
			//ERROR: existing src and type 
		}
	}
	
	public void addSrc(String src) {
		String s = "/" + src;
		this.d_name = this.d_name.concat(s);
	}
	
	public void addType(String tp) {
		String s = "/" + tp;
		this.d_name = this.d_name.concat(s);
	}
	
	//methods for Date
	public void addDate(int yy) {
		String s = "/" + Integer.toString(yy);
		this.d_name = this.d_name.concat(s);
	}
	
	public void addDate(int yy, int mm) {
		String s = "/" + Integer.toString(yy) + "/" + Integer.toString(mm);
		this.d_name = this.d_name.concat(s);
	}

	public void addDate(int yy, int mm, int dd) {
		String s = "/" + Integer.toString(yy) + "/" + Integer.toString(mm) + "/" + Integer.toString(dd);
		this.d_name = this.d_name.concat(s);
	}
	
	public void appendName(String n) {
		String s = "/" + n;
		this.d_name = this.d_name.concat(s);
	}
	
	public String getSrc() {
		String[] tokens = this.d_name.split("/");
		return tokens[2];
	}
	
	public String getType() {
		String[] tokens = this.d_name.split("/");
		return tokens[3];
	}
	
	
	
	//public static byte NAME_TYPE = 0X07;
	//public static byte NAME_COMP_TYPE = 0X08;
	private String d_name = "/pti2/grupo2";
}

/*NAME COMPOSITION FOR NEWS APP
 *  For interest packets:
 *  / app_name / source / category / YYYY / MM / DD / optional -> name.ext / filters
 * 
 *  For data packets:
 *  / app_name / source / category / YYYY / MM / DD / name.ext / filters
 *  ex: / pti2 / grupo2 / publico / politica / 2018 / 04 / 08 / corrupçao.txt / ps
 * */
