package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("djkill59@mail.ru", "RinKokonoe");
        map.put("patushaimba@mail.ru", "Katya");

        for (Map.Entry<String, String> mapEntry : map.entrySet()) {
            System.out.println(mapEntry.getKey() + "  "   + mapEntry.getValue());
        }
    }
}
