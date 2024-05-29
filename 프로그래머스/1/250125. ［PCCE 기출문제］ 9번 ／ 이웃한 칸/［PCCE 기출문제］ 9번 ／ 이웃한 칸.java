class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        
        int n = board.length;
        int cnt = 0;

        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i <= 3; i++) {
            int nh = h + dh[i];
            int nw = w + dw[i];

            if (0 <= nh && nh < n && 0 <= nw && nw < n) {
                if (board[h][w].equals(board[nh][nw])) {
                    cnt++;
                }
            }
        }

        answer = cnt;
        
        return answer;
    }
}