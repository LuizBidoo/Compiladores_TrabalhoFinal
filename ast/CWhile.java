package ast;

import java.util.ArrayList;

public class CWhile extends Comando{
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;
	
	public CWhile(int linha,Exp exp, ArrayList<Comando> bloco)
	{
	  this.linha = linha;
	  this.exp = exp;
	  this.bloco = bloco;
	} 

	public String toString() {
		String result = "while (" + exp.toString() + ") {\n";

		for(Comando c: bloco){
			result += "\t" +  c.toString();
		}

		result += "\t}\n";

		return result;	
	}

}
