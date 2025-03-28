import java.util.Map;
import java.util.TreeMap;

public class ChatApp3 {
    public static void main(String[] args){
        System.out.println(" Tree Map Sample");

        TreeMap<Integer, String>  treeMap = new TreeMap<>();

        treeMap.put(3, "Letter A");
        treeMap.put(2,"Letter B");
        treeMap.put(1, "Letter C");


        System.out.println(treeMap);
        for(Map.Entry<Integer , String> entry : treeMap.entrySet()){
            System.out.println("KEY : "+entry.getKey()+"VALUE : "+entry.getValue());
        }
    }
}
