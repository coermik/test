import java.util.*;
// 백엔드 2기 김다현
public class JavaStudy06 {
    public static void main(String args[]) {
        Election election = new Election();
        election.startElection();
    }
}

class Election{
    private int numberOfVoter, recent;
    private int[] voteResults = new int[4];
    private int[] results = {0, 0, 0, 0};
    private String[] name = {"이재명", "윤석열", "심상정", "안철수"};
    private String percent = "%";
    Random random = new Random();

    public void startElection(){
        numberOfVoter = 10000;

        while(true){
            int detector = 0;
            printFunction();
            whoIsElected();
            for(int i = 0; i <= 3; i++){
                detector += results[i];
            }
            if(detector == 1){
                resultsPrint();
                break;
            }else{
                for(int j = 0; j <= 3; j++){
                    voteResults[j] = 0;
                    results[j] = 0;
                }
            }
        }
    }

    private void recentVote(){
        if(recent == 0) { System.out.printf("%s", name[0]); }
        else if(recent == 1) { System.out.printf("%s", name[1]); }
        else if(recent == 2) { System.out.printf("%s", name[2]); }
        if(recent == 3) { System.out.printf("%s", name[3]); }
    }

    private void printFunction(){
        for(int i = 0; i < numberOfVoter; i++){
            vote();
            System.out.printf("[투표진행률] : %.2f%s, %d명 투표 => ", ((float)(i+1)/(float)numberOfVoter)*100.0, percent, i+1);
            recentVote();
            System.out.printf("\n");
            for(int j = 0; j <= 3; j++){
                System.out.printf("[기호:%d] %s : %.2f%s, (투표수 : %d)\n", j + 1,name[j], ((float)voteResults[j]/(float)numberOfVoter*100.0), percent, voteResults[j]);
            }
        }
    }

    public void resultsPrint(){
        for(int i = 0; i <= 3; i++){
            if(results[i] == 1){
                System.out.printf("[투표결과] 당선인: %s\n", name[i]);
            }
        }
    }

    private void whoIsElected(){
        int temp = 0;
        temp = Math.max(Math.max(voteResults[0], voteResults[1]), Math.max(voteResults[2], voteResults[3]));
        for(int i = 0; i <= 3; i++){
            if(temp == voteResults[i]){
                results[i] = 1;
            }
        }
    }

    private void vote(){
        int result = 0;
        recent = 0;
        result = random.nextInt(10000);
        if(result >= 7500) { voteResults[0] += 1; recent = 0; }
        else if(result >= 5000) { voteResults[1] += 1; recent = 1;}
        else if(result >= 2500) { voteResults[2] += 1; recent = 2;}
        else { voteResults[3] += 1; recent = 3; }
    }
}

