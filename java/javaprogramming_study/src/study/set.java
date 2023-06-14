package study;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//set collection : 집합 (중복값 안들어감) ; 단 하나의 값만 저장됨 - hashset, linkedset, treeset
//list collection : 입력한 모든값이 저장됨 - arraylist, linkedlist, vector..
public class set {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(); // hashset
        List<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(3);

        b.add(1);
        b.add(1);
        b.add(3);
        b.add(2);
        b.add(1);

        for (int i : a) {

            System.out.println(i);

        }

        System.out.println("=".repeat(50));

        for (int i : b) {
            System.out.println(i);

        }
    }
}
