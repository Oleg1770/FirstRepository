import java.util.Scanner;
import java.lang.reflect.Method;


public class Main
{
    public static void main(String[] args) {
        System.out.println(textModifier());   
    }
    
    public static String textModifier()  
    {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку > ");
        byte j = -1;
        boolean kavychki = false;
       String msimvol =  "*+/-";
       String[] mact = {"umnozh","slozhi","deli","vychti"};
       String s1,s2;
       s1 = s2 = ""; 
       StringBuilder stroka = new StringBuilder(input.nextLine().trim());
       
        if (stroka.length() > 40)
            return " Слишком длинная строка! ";
            
         for( byte i = 0; i < stroka.length(); i++)
            {
                
                if ((stroka.charAt(i) == '"') && !kavychki )   {
                    kavychki = true;
                    continue;
                }
                if ((stroka.charAt(i) == '"') && kavychki )  kavychki = false; 
                
                if ( kavychki ) continue;
                
                j = (byte)msimvol.indexOf(stroka.charAt(i));
                
                if (j >= 0) {
                       s1 = stroka.substring(0,i).trim();
                       s2 = stroka.substring(i+1).trim();
  
                       break;
                }       
           
            }
            
            if (s1.isEmpty() || ((s1.charAt(0)  >= '0') && (s1.charAt(0) <= '9')) ||  (s1.length() > 12) ) 
                return (" Ошибка строки 1");
            
            
            if (s2.isEmpty() || (s2.length() > 12) || (((s2.charAt(0)  >= '0') && (s2.charAt(0) <= '9')) && (Integer.parseInt(s2) > 10)  ))
                return (" Ошибка строки 2");    
                
                
            
            try {
                Class c = Class.forName(mact[j]);
                Class[] params = {String.class, String.class};
                Object o= c.newInstance();
                Method m = o.getClass().getMethod("act", params);
                return (String)m.invoke(o,s1,s2);
                
                
            } catch(Exception e) {
                //e.printStackTrace();
                System.out.println(" Ошибка в строке ");
                return "";
            }
           


    }
}

class umnozh 
{
public static String act(String str, String mn) {
   
    StringBuilder s = new StringBuilder(str);
    s.deleteCharAt(s.length()-1);
    s.deleteCharAt(0);
    StringBuilder sresult = new StringBuilder();
    
    byte i = 1;
    byte n = Byte.parseByte(mn);  
    while (i <= n) {
        
        sresult.append(s);
        
        i++;
    }
    if (sresult.length() > 40) { 
        sresult.setLength(40);
        sresult.append("...");
    }
        

    return "\""+sresult.toString()+"\"";
}
}

class slozhi 
{
public static String act(String str, String str2) {

    return str.substring(0,str.length()-1) + str2.substring(1);
}
}

class deli {
    
    public static String act(String str, String del) {
   
    StringBuilder s = new StringBuilder(str);
    s.deleteCharAt(s.length()-1);
    s.deleteCharAt(0);

    byte i = (byte)s.length();
    byte d = Byte.parseByte(del); 
    i /= d;
    return "\""+s.substring(0,i)+"\"";
}
    
}

class vychti {
    public static String act(String str, String str2) {
        
        StringBuilder s =  new StringBuilder(str);
        StringBuilder s2 = new StringBuilder(str2);
        s.deleteCharAt(s.length()-1);
        s.deleteCharAt(0);  
        s2.deleteCharAt(s2.length()-1);
        s2.deleteCharAt(0); 
        
        str = s.toString();
        str2 = s2.toString();
        
        return  "\""+str.replace(str2,"")+ "\"";
    
    
}
    
}