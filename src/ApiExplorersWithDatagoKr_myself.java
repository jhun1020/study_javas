import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorersWithDatagoKr_myself{
    public static void main(String[] args) throws UnsupportedEncodingException {
        /* 
        https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List
        ?serviceKey=F8urQtWbXWR0eW72eAeRNVGCy5cvwfdcmi9pS%2FV30UzQidC1LUt2Aog6nAvaWENf72H2v4M09sz8d%2BcA%2B3y%2B%2Fw%3D%3D
        &stdt=1995
         */

        StringBuilder urlBuilder = new StringBuilder("https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List"); /*URL*/
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + URLEncoder.encode("F8urQtWbXWR0eW72eAeRNVGCy5cvwfdcmi9pS%2FV30UzQidC1LUt2Aog6nAvaWENf72H2v4M09sz8d%2BcA%2B3y%2B%2Fw%3D%3D", "UTF-8")); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("stdt","UTF-8") + "=" + URLEncoder.encode("1995", "UTF-8")); //조회시작년도

        // 연결 버튼
        URL url;
        HttpURLConnection conn = null;
        try {
            url = new URL(urlBuilder.toString());
            conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            // conn.setRequestProperty(null, null);
            System.out.println("getResponseCode : "+ conn.getResponseCode() ); // 값이 나오는지 확인용 출력문.

            BufferedReader reader;
            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {  //정상
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {  // 비정상
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuffer stringBuffer = new StringBuffer();
            String line = "";
            while((line = reader.readLine()) != null){
                stringBuffer.append(line);
            }
            int i = 1; //breakpoint용 무의미연산
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            conn.disconnect();
        }

    }
}
