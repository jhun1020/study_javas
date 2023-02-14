import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithJson {  
    public static void main(String[] args) {
        System.out.println("확인용이다");
        // 문자열을 Json으로 바꾸는 법  ex) 문자열 -> map
        Gson gson = new Gson();
        //  name:jhun 뒤에 habit으로 리스트를 맵으로 넣을 때 추가
        String jsonStr = "{id:1, name:Jhun habit:[fitness, read, game]}";
        Map jsonMap = gson.fromJson(jsonStr, Map.class);
        // 뒤는 자기가 바꾸려는 형태를 넣는다
        // 앞에 있는 jsonStr를 map형식으로 바꿔준다는 뜻.
        // 주의!! 가장 바깥에 있는 것을 기준으로 바꿔주어야함 ==> 굉장히 쉽게 변형이 가능하다
        String mapStr = gson.toJson(jsonMap); // 4번째 str사용했음
        // 디버깅 눌러보면  jsonStr에 값이 들어있는것을 확인할 수 있다. + map에도 !!
        
        // 문자열을 Json -> Object  / (bean == model == vo) 
        // 전에 사용했던 MemberBean활용
        String JsonStrBean = "{firstName:lee, secondName:jhun, handleName:lab}";
        MemberBean memberBean = gson.fromJson(JsonStrBean, MemberBean.class);  //앞에는 string 뒤에는 밖으로 뺄 멤버의 beandmf sjgsmsek
        
        // Object -> 문자열 Json
        String memberBeanStr = gson.toJson(memberBean);
        int i=0; //디버깅용
        System.out.println("asdf");
    }   
}
