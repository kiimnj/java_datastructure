package hashtable;

import java.util.Hashtable;

//프로그래머스 완주하지 못한 선수
public class HashTableSolution {
  public String solution(String[] participant,String[] completion) {
    Hashtable<String, String> answer = new Hashtable<>();
    for (String k : answer.keySet()) {
      if (!answer.containsKey(k)) return k;
    }
    return null;
  }
}
