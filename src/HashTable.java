import java.sql.SQLOutput;
import java.util.Hashtable;
import java.util.Map;
public class HashTable {
    public static void main(String[] args){
        Hashtable<Integer,String>player=new Hashtable<Integer,String>();
        player.put(18,"Virat");
        player.put(45,"Rohit");
        player.put(7,"Dhoni");
        for(Map.Entry m : player.entrySet()){
            System.out.println(m.getKey() + " jersey number "+ m.getValue() + " Player name " );
        }
        System.out.println();
    }
}
