package freakans;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        frekans(new int[]{4,4,4,4,2,2,123,4,123,51,2,4});
    }

    public static void frekans(int[] array){
        Map<Integer,Integer> frekans = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            if(!frekans.containsKey(array[i])){
                frekans.put(array[i],1);
            }
            else{
                int f = frekans.get(array[i])+1;
                frekans.put(array[i],f++);
            }
        }
        frekans.keySet().forEach(i -> System.out.println(i + "Sayısı : "+ frekans.get(i) + "kez tekrar etmiştir."));
    }
}
