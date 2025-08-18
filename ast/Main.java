package ast;

import java.util.ArrayList;

public class Main{

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;
	
	public Main(ArrayList<VarDecl> vars,ArrayList<Comando> coms)
	{
		this.vars = vars;
		this.coms = coms;
	}

	public String toString() {
		String AAAAAA = "public static void main(){\n";
		for(Comando c: coms)
		{
			AAAAAA +=  "    " + c.toString();
		}
		AAAAAA += "}\n";
		return AAAAAA;
	}

}
