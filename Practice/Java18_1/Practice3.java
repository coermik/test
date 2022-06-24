package Practice.Java18_1;


public class Practice3 {
    public static String solution(char[] str, char[] find, char[] to) {
        int idx = 0; // 인덱스 변수
        String replaceStr = "";// 최종 변경 데이터
        char[] replaceBucket = str.clone(); // 임시

        do{
            idx = findIndex(replaceBucket, find);//해당위치를 찾음
            if(idx != -1){
                for (int i = 0; i < idx; i++) {
                    replaceStr += replaceBucket[i]; //replaceBucket의 값을 idx전까지
                }
                for (int i = 0; i < to.length; i++) {
                    replaceStr += to[i];
                }
                for (int i = idx + find.length; i < replaceBucket.length; i++) {
                    //찾았던 idx위치와 find.length위치 부터 나머지 쭉연결
                    replaceStr += replaceBucket[i];
                }

                replaceBucket = replaceStr.toCharArray(); // 문자열을 char형 배열로바꿔줌
                replaceStr = "";
            }
            
            
        }while(idx != -1); // -1은 매칭되는게 없을때의 값

        replaceStr = new String(replaceBucket);
        return replaceStr;
    }

    public static int findIndex(char[] str, char[] find){
        int idx = -1; //-1로 초기화
        boolean isMatch = false; // 찾을 변수

        for(int i = 0; i < str.length; i ++){
            if(str[i] == find[0] && str.length - i >= find.length){ // 첫글자 일치
                isMatch = true;
                for (int j = 1; j < find.length; j++){
                   if(str[i + j] != find[j]){// 한글자씩 일치 확인
                       isMatch = false; //비교할 필요가없으므로 브레이크
                       break;
                   }
                }
            }
            if(isMatch){ //일치하면 isMatch는 true
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
