import java.util.Arrays;
import java.util.HashMap;


public class Arr {
    public static void main(String[] args) {
        HashMap<String, Object> myMap = fun(21, "ABC");
        System.out.println(myMap.get("age") + " " + myMap.get("name"));
    }

    static HashMap<String, Object> fun(int age, String name) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("age", age);
        map.put("name", name);
        return map;
    }
}