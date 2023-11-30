public class NewMethod {
    public static void main(String[] args) {

        //isBlank 문자열이 비어있거나 공백이면 True 반환 함수
        boolean res = "  ".isBlank();
        System.out.println("res : " + res);

        res = "".isBlank();
        System.out.println("res : " + res);

        res = "Hi  ".isBlank();
        System.out.println("res : " + res);


        String text = "1번쨰 \n2번째 \n3번째 \n4번째 ";
        System.out.println(text);


        /**
         * lines()  줄바꿈된 문자열을 스트림 형태로 반환하는 메소드
         * 스트림 : 스트리밍의 그 스트림이 맞음.
         * -> 기존에는 모든 값을 받은 이후에 쪼개서 전송하는 방식을 사용했다면
         * 스트림은 모든 값을 받는 것이 아닌 일부의 값을 먼저 받아 전송하고
         * 다시 일부의 값을 전송하는 방식으로
         * 값이 없을 때 까지 전송함.
         * ==> lines() 함수를 사용할 경우 해당 문자열은 스트림 형태로 반환이 되는데
         * 해당 스트림 형태는 Stream<String> 형태로
         * 배열과 같은 형식이며, 해당 배열에 있는 값이 사용될 경우
         * (사용 : get 으로 일단 가져오는 것. 출력, 계산 등등 다 포함 )
         * 배열에서 값이 아예 사라짐. (1회성임)
         */
        var lines = text.lines();
        System.out.println("lines : " + lines.getClass());
        lines.forEachOrdered(line -> System.out.println("첫번째 line 반복 : " + line));

//        // 해당 line 값은 이제 사라져 에러가 발생함.
//        lines.forEachOrdered(line -> System.out.println("두번째 line 반복 : " + line));

        //string 문자열 공백 제거
        // 기존 trim() 함수 개성된 버전으로 유니코드와 공백들을 전부 제거함
        var text1 =  "   안녕하세요.  ";
        System.out.println("strip : # " + text1.strip() + "#");


        //repeat(#count) 함수
        // -> 문자열을 count반복 횟수만큼 반복
        var result = "안녕".repeat(3);
        System.out.println("result : " + result.getClass());
        System.out.println("result : " + result);

    }
}
