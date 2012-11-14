/*
TUES http://www.elsys-bg.org/
11а
09
Даниел Красимиров Цоков
Да се създаде програма, която да изкарва на екрана стойността на системните свойства по
зададени от командния ред 
*/

import java.util.Arrays;
import java.util.Collections;

public class HomeWork2 {
  
public static void main (String[] args){
String[] newString=new String[args.length];
int counter=0;
                
                
            if(args[(args.length)-1].equals("down")){
                    counter=1;
            }

            for (int i=0;i<args.length;i++){
                    if(System.getProperty(args[i])==null){
                            newString[i]="Error";
                            continue;
                    }
                    
                    newString[i]=System.getProperty(args[i]);
            }


            System.out.println("");
            if(counter==1){
                        
Arrays.sort(newString,Collections.reverseOrder()); //,java.text.Collator.getInstance()
}
            else
{
                    Arrays.sort(newString);
            }

            for (int i=0;i<newString.length;i++){
                    if(newString[i].equals("Error")){
                            continue;
                    }
                    System.out.println(newString[i]);
}
 
    }

}
