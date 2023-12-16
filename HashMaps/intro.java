package javaBasics.HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class intro {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
           map.put("a",1);
           map.put("c",2);
           map.put("b",3);

           //update
        System.out.println(map);
        map.put("c",10);

        map.put("c",29);

        System.out.println(map);

        System.out.println(map.containsKey("a"));

        System.out.println(map.get("a")); //key exist --> value will be returned
        System.out.println(map.get("d")); //key does not exist --> value returned will be - null

        //iteration
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //or

        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove
        System.out.println(map);
        map.remove("b");
        System.out.println(map);

    }
}
