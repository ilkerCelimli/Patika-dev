package example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {

    public static void main(String[] args) {
       String s =  StringChallenge("aadads");
        System.out.println(s);
    }

    public static String StringChallenge(String str) {
        Map<Character,Integer> maps = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            if(!maps.containsKey(str.charAt(i))){
                maps.put(str.charAt(i),1);
            }
            else {
                int a = maps.get(str.charAt(i));
                a++;
                maps.put(str.charAt(i),a);
            }
        }
        String newString = "";
          Set<Character> sets =   maps.keySet();
          for(Character s : sets){
              newString = newString.concat(String.valueOf(maps.get(s))).concat(String.valueOf(s));
        }


        return newString;
    }


}
