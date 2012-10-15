import java.util.Arrays;
import java.util.Collections;

public class javahomework2 {
  
public static void main (String[] args){
String[] newString=new String[args.length];
int num=0;
                
                
            if(args[(args.length)-1].equals("down")){
                    num=1;
            }

            for (int i=0;i<args.length;i++){
                    if(System.getProperty(args[i])==null){
                            newString[i]="Error";
                            continue;
                    }
                    
                    newString[i]=System.getProperty(args[i]);
            }


            System.out.println("  ");
            if(num==1){
                        
Arrays.sort(newString,Collections.reverseOrder());
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
