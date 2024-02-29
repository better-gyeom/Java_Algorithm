class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int n = 1; n <= number; n++) {
            int cnt = divisorCnt(n);
            if (cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }
        return answer;
    }
    
    public int divisorCnt(int num) {
        int cnt = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                cnt++;
            } else if (num % i == 0) {
                cnt += 2;
            }
        }
        
        return cnt;
    }
}