
import java.util.Scanner;
import java.util.ArrayList;
 
public class Main
{
    public static void main(String[] args) {
        System.out.println(textModifier());                                                
    }
    public static String textModifier()
    {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку > ");
        byte j = 0;
                    
        StringBuilder stroka = new StringBuilder(input.nextLine().trim());
        if (stroka.length() > 250)
            return " Слишком длинная строка! ";
            
        StringBuilder outbez = new StringBuilder();
        StringBuilder outstr = new StringBuilder();
        for( short i = 0; i < stroka.length(); i++)
            {
            if(stroka.charAt(i) == ' ')
                 j++;
            else j = 0 ;
            if (j > 1)
                continue;
            outbez.append(stroka.charAt(i));
            
            }
 
        for( short i = 0; i < outbez.length(); i++)
            {
            if(outbez.charAt(i) == '-')
                {
                 if (i == 0)
                     return " Ошибка строки";
                 
            
                 outstr.insert(i-1,outbez.charAt(i+1));
                 outbez.deleteCharAt(i+1);
                
                }
            else
              outstr.append(outbez.charAt(i));
            }
              
              ArrayList<Byte> l = new ArrayList<>(); 
              short m = 0;
              outbez = new StringBuilder();
              char simvol;
              
              for( short i = 0; i < outstr.length(); i++)
              {
                simvol = outstr.charAt(i);
                 switch (simvol) {
 
                    case '0':  case '1': case '3': case '4':
                    case '5':  case '6': case '7': 
                    case '8':  case '9':
                    case '2':    
          
                     
                     byte k = (byte)Character.getNumericValue(simvol);
                     l.add(k);
                     break;
                    case '+': 
                        outbez.append('!');
                        break;
                    default:
                        outbez.append(simvol);
                 }    
        }
        
        for (byte n: l)
                 m += n ;
              //if ( simvol >= '0' && simvol <= '9')
              
            if (input != null) {
                input.close();
            }
                
                return "Строка = " + outbez.toString().trim() + ((m > 0) ? " "+ m : "");
 
                   
}
}