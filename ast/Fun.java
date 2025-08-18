package ast;

import java.util.ArrayList;

public class Fun{
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;
	
	public Fun(String nome,ArrayList<ParamFormalFun> params, String retorno,ArrayList<VarDecl> vars,ArrayList<Comando> body)
	{
		this.nome = nome;
		this.params = params;
		this.retorno = retorno;
		this.vars = vars;
		this.body = body;
	}

	public String toString() {
		String result = "public " + retorno + " " + nome + "(";
		for(ParamFormalFun p: params)
		{
			result += p + ", ";
		}
		result = result.substring(0, result.length() - 2) + ") {\n";

		for(Comando c: body){
			result += "    " +  c.toString();
		}

		result += "\n}\n";
		return result;
	}
}
