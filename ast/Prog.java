package ast;

import java.util.ArrayList;

public class Prog{
    public Main main;
    public ArrayList<Fun> fun;
    public Prog(Main main, ArrayList<Fun> fun)
    {
        this.main = main;
        this.fun = fun;
    }

    @Override
    public String toString()
    {
        String result = "import java.util.Scanner;\n\n" + main.toString();
        for(Fun f: fun){
            result += f;
        }

        return result;
    }
}

