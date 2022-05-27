class Test {
    public static int solution(int n) {

        int answer = 0;
            for(int i = 2; i <= n; i++){
                for (int j = 2; j <= i; j++) {
                    if(i % j == 0){
                        answer++;
                    }
                }
                if(answer == 1){
                    System.out.print(i+ " ");
                }
                answer = 0;
            }
        return answer;
    }
    public static void main(String[] args){
        System.out.printf("%d", solution(15));
    }
}
