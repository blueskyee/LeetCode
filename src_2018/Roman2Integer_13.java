import com.sun.tools.javac.util.ArrayUtils;

import java.util.HashMap;

/**
 * Created by henry on 2018/7/23.
 */
public class Roman2Integer_13 {
    public static void main(String[] args) {
        String romanStr = "IX";
        Roman2Integer_13 ri = new Roman2Integer_13();
        System.out.print(ri.romanToInt(romanStr));
    }


    public int romanToInt(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();
        for (int i=0; i<charArray.length; i++){
            if(charArray[i] == 'I' && (i+1<charArray.length && charArray[i+1] == 'V')){
                result += 4;
                i++;
            }else if(charArray[i] == 'I' && (i+1<charArray.length && charArray[i+1] == 'X')){
                result += 9;
                i++;
            }else if(charArray[i] == 'X' && (i+1<charArray.length && charArray[i+1] == 'L')){
                result += 40;
                i++;
            }else if(charArray[i] == 'X' && (i+1<charArray.length && charArray[i+1] == 'C')){
                result += 90;
                i++;
            }else if(charArray[i] == 'C' && (i+1<charArray.length && charArray[i+1] == 'D')){
                result += 400;
                i++;
            }else if(charArray[i] == 'C' && (i+1<charArray.length && charArray[i+1] == 'M')){
                result += 900;
                i++;
            }else {
                switch(charArray[i]){
                    case 'I':
                        result += 1;
                        continue;
                    case 'V':
                        result += 5;
                        continue;
                    case 'X':
                        result += 10;
                        continue;
                    case 'L':
                        result += 50;
                        continue;
                    case 'C':
                        result += 100;
                        continue;
                    case 'D':
                        result += 500;
                        continue;
                    default:
                        result += 1000;
                }
            }
        }

        return result;
    }
}
