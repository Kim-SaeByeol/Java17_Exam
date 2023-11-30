import java.util.ArrayList;
import java.util.List;

public class NewKeywordVar {
    /**
     * 추론 타입 Var
     * 알아서 변수의 타입을 추론하여 지정함
     * 1111 과 같은 상수는 Integet
     * 1.5 와 같은 소수는 Double
     * " " 라면 String
     * '' 라면 Character
     *
     * @param args
     */
    public static void main(String[] args) {

    var strData = "str";
    var charData = 'c';
    var doubleData = 1.11;
    var intdata = 1;

        List datas = new ArrayList<>();
        datas.add(strData);
        datas.add(charData);
        datas.add(doubleData);
        datas.add(intdata);

    for (var data : datas) {
        System.out.println("data : " + data);
        System.out.println("data : " + data.getClass());
    }



    }
}
