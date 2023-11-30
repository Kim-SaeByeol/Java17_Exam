import java.util.*;

public class CollectionOf {

    /**
     * 불변 (Immutable) 메소드 지원.
     * 메소드 명 : of
     * @param args
     */
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("토끼");
        set.add("강아지");
        set.add("사슴");
        set.add("고양이");

        List<String> list = new ArrayList<>();
        list.add("토끼");
        list.add("사슴");
        list.add("강아지");
        list.add("고양이");

        Map<String, String> map = new HashMap<>();
        map.put("깡총", "토끼");
        map.put("고라니", "사슴");
        map.put("멍멍", "강아지");
        map.put("야옹", "고양이");

        System.out.println("set : " + set);
        System.out.println("list : " + list);
        System.out.println("map : " + map);

        Set<String> newSet = Set.of("토끼", "사슴", "강아지", "고양이");

        List<String> newList = List.of("토끼", "사슴", "강아지", "고양이");

        Map<String, String> newMap =
                Map.of("깡총", "토끼",
                "고라니", "사슴",
                "멍멍", "강아지",
                "야옹", "고양이");

        System.out.println("newSet : " + newSet);
        System.out.println("newList : " + newList);
        System.out.println("newMap : " + newMap);

        /*
        불변 객체에 값을 추가하는 방법은 객체를 새롭게 생성하여 값을 추가하는 방법만 가능
         */
//        Java8 과 같이 기존 배열 함수에 add 를 하면 오류가 발생함.
//        newSet.add("에러");
//        newList.add("에러");
//        newMap.put("키값", "에러");

        /*
        해결 방법
         불변 객체에 값을 추가하는 것은 안되니까
         -> 불변 객체를 새로 불러와 (기존 값들을 전부 복사하여)
         새롭게 만들면 됨.
         */
        Set<String> addSet = new HashSet<>(newSet);
        addSet.add("add");

        List<String> addList = new ArrayList<>(newList);
        addList.add("add");

        Map<String, String> putMap = new HashMap<>(newMap);
        putMap.put("Key", "put");

        System.out.println("addSet : " + addSet);
        System.out.println("addList : " + addList);
        System.out.println("putMap : " + putMap);
        }
}