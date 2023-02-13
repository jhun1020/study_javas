import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class notmone {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
         * 외교부 국가 지역별 최신 안전소식(코로나 관련)
         * https://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List?
         * serviceKey=NzstB3xGw8fHulyfoEqU56BRhGdw45Jeq6BpoZJKuXa3rKcuyaGut5yVyhpua4lYU%
         * 2F6lR5tF0KZdwOsTOEvvhw%3D%3D
         * &pageNo=1
         * &numOfRows=10
         * &type=xml
         */

        StringBuilder urlBuilder = new StringBuilder(
                "http://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List"); /* URL */
        // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=").append(
                "NzstB3xGw8fHulyfoEqU56BRhGdw45Jeq6BpoZJKuXa3rKcuyaGut5yVyhpua4lYU%2F6lR5tF0KZdwOsTOEvvhw%3D%3D");
        // Service Key

        urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));// 페이지번호
        urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
        urlBuilder.append("&" + URLEncoder.encode("type", "UTF-8") + "="
                + URLEncoder.encode("xml", "UTF-8")); /* XML 또는 JSON */
        // 한페이지 결과 수

        /* url로 값을 변환해줌 */
        URL url;
        HttpURLConnection conn = null;
        try {
            url = new URL(urlBuilder.toString());
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            // conn.setRequestProperty(null, null);
            System.out.println("Response CODE :" + conn.getResponseCode());
            /* 네트워트에서 받아온것을 변환하고 다루기 편하게 bufferedreader로 변환한다. */
            /* conn.getInputStream(); 실제 데이터가 들어있는 부분 */
            BufferedReader reader = null;
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() < 300) {// 정상적으로 받아질 때
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else { // 비정상일때
                reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));

            }

            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
            int i = 1;
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