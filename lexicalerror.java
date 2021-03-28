
import javax.lang.model.SourceVersion;
import javax.lang.model.element.NestingKind;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class lexicalerror{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no of lines");
        String[] input=new String[scan.nextInt()];
        scan.nextLine();
        String con=" ";
        System.out.println("please enter your program");
        for (int i=0; i<input.length;i++)
        {   input[1]=scan.nextLine();
            con=con.concat(input[1]+" ");
    }

            System.out.println("\n input line are :");
            String output[]=con.split(" ");
            for (String output1:output)
         {
             System.out.printf(" " +output1);
        }

        System.out.println(" ");
            int id =0;
            int token=0;
for (int i=0;i<output.length;i++)
        {
        if(null!=output[i]) {
            switch (output[i]) {
                case "String":
                case "int":
                case "float":
                case "double":
                case "boolean":
                    token++;
                    System.out.println("<DataType," + output[i] + ">");
                    break;
                case "if":
                case "ifelse":
                case "else":
                    token++;
                    System.out.println("<conditionalstatement, " + output[i] + ">");
                case ";":
                    token++;
                    System.out.println("<EndStatement, " + output[i] + ">");
                    break;
                case ",":
                    token++;
                    System.out.println("<colon, " + output[i] + ">");
                    break;
                case "a":
                case "b":
                case "c":
                case "d":
                case "e":
                case "f":
                case "g":
                case "h":
                case "i":
                case "j":
                case "k":
                case "l":
                    token++;
                    id++;
                    System.out.println("< id"+id+","+output[i]+">");
                    break;
                case" ":
                        System.out.println("");
                        break;
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
                case "20":
                    token++;
                    System.out.println("< number, "+output[i]+">");
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                case "=":
                case "==":
                case "<":
                case ">":
                case "&":
                case "&&":
                case "!!":
                    token++;
                    System.out.println("<operator, "+output[i]+">");
                    break;
                default:
                    System.out.println("Input type is not defined: "+output[i]);


            }


            }
        }
        System.out.println("total no of tokens in your program: " +token);
    }
}