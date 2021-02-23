package com.basic.day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExam {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("a", 85);
    map.put("b", 90);
    map.put("c", 78);
    map.put("d", 90);
    map.put("c", 90);
    System.out.println(map.size());

    System.out.println("찾기 :" + map.get("c"));

    Set<String> keySet = map.keySet();
    Iterator<String> ite = keySet.iterator();
    while(ite.hasNext()) {
      String key = ite.next();
      Integer value = map.get(key);
      System.out.println(" key ? " + key + " value ? " + value);
    }
    System.out.println("-----------------------------------");
    map.remove("c");
    System.out.println("-----------------------------------");

    Set <Map.Entry<String, Integer>> entrySet = map.entrySet();
    Iterator<Map.Entry<String, Integer>> ite2 = entrySet.iterator();

    while(ite2.hasNext()) {
      Map.Entry<String, Integer> entry = ite2.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println(" key ? " + key + " value ? " + value);
    }

  }
}
