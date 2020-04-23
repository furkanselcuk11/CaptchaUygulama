
package captcha;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author FURKAN
 */
public class Captcha {

    
    public static void main(String[] args) {        
        System.out.println("CAPTCHA NUMARASI: "+captchaOlustur()+"\n");        
        Scanner klavye=new Scanner(System.in);
          
                
    }
    public static String captchaOlustur(){
        Random random=new Random();
        int length=7+(Math.abs(random.nextInt()%3));
        StringBuffer captchaStrBuffer=new StringBuffer();
        for(int i=0;i<length;i++){
            int baseCharacterNumber=Math.abs(random.nextInt())%62;
            int characterNumber=0;
            if(baseCharacterNumber<26){
                characterNumber=65+baseCharacterNumber;
            }
            else if(baseCharacterNumber<52){
                characterNumber=97+(baseCharacterNumber-26);          
            }
            else{
                characterNumber=48+(baseCharacterNumber-52);
            }
            captchaStrBuffer.append((char)characterNumber);
        }
        return captchaStrBuffer.toString();
        
    }
}
