import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
 
public class StringProgram {
    public void printVowels(String title)
    {
        int l=title.length();
        int i;
        char c;
       System.out.println("Vowels in string:");
        for(i=0;i<l;i++)
        {
            c=title.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')/*This condition helps for checking the Vowels in String*/
            {
                System.out.println(c);
            }
        }
    }
    public void printDigits(String title)
    {
        int l=title.length();
        int i;
        char c;
       System.out.println("Digits in string:");
        for(i=0;i<l;i++)
        {
            c=title.charAt(i);
            if(Character.isDigit(c)) /*condition helps for checking the Digits in String*/
            {
                System.out.println(c);
            }
        }
    }
     public void processExpression(String title) throws ScriptException
    {
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine engine = scriptEngineManager.getEngineByName("JavaScript");
    String result = title;
    System.out.println(engine.eval(result));/*prints the expression results in String*/
    }
     public void printConsonant(String title)
    {
        int i;
        char c;
       System.out.println("Consonants in string:");
        for(i=0;i<title.length();i++)
        {
            c=title.charAt(i);
            if(c=='B'||c=='b'||c=='C'||c=='c'||c=='D'||c=='d'||c=='F'||c=='f'||c=='G'||c=='g'||c=='H'||c=='h'||c=='J'||c=='j'||c=='K'||c=='k'||c=='L'||c=='l'||c=='M'||c=='m'||c=='N'||c=='n'||c=='P'||c=='p'||c=='Q'||c=='q'||c=='R'||c=='r'||c=='S'||c=='s'||c=='T'||c=='t'||c=='V'||c=='v'||c=='W'||c=='w'||c=='X'||c=='x'||c=='Y'||c=='y'||c=='Z'||c=='z') /*This condition helps for checking the Consonants in String*/
            {
                           System.out.print(c);
            }
                  
       }
    }
    public static void main(String args[]) throws ScriptException, IOException
    {
     StringProgram s=new StringProgram();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String title;
        String expression;
        System.out.println("Enter a String:");
        title=bufferedReader.readLine();
        s.printVowels(title);
        s.printConsonant(title);
        s.printDigits(title);
        System.out.println("Enter Expression String");
        expression=bufferedReader.readLine();
        s.processExpression(expression);
    }
}
 

