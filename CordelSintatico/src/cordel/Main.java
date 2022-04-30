package cordel;
import cordel.parser.*;
import cordel.lexer.*;
import cordel.node.*;
import java.io.*;

public class Main
{
 public static void main(String[] args)
 {
  try
  {
   String arquivo = "teste/teste.cordel";
  
   Lexer lex = new Lexer(
		    new PushbackReader(  
		    new FileReader(arquivo), 1024));
   
   Parser p = new Parser(lex); 
   
   Start tree = p.parse();
   //Imprime árvore na saída padrão
   //tree.apply(new ASTPrinter());
   //Imprime árvore em interface gráfica
   tree.apply(new ASTDisplay());
  }
  catch(Exception e)
  {
   System.out.println(e.getMessage());
  }
 }
}