package ast;

import java.util.ArrayList;

public class EChamadaFun extends Exp{
	public String fun;
	public ArrayList<Exp> args;
	
	public EChamadaFun(String fun, ArrayList<Exp> args)
	{
	  this.fun = fun;
	  this.args = args;
	} 

	public String toString() {
		String result = fun + "(";	
		for(Exp e: args){
			result += e.toString() + ", ";
		}

		result = result.substring(0, result.length() - 2) + ");\n";
		return result;
	}

}
