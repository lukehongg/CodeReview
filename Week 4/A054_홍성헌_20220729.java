import java.util.*;
class Solution
{
    private final Stack<Integer> bag = new Stack<>();
    public int solution(int[][] board, int[] moves)
    {
        int answer = 0;
        for (int move : moves){
            int j = move - 1;
            for (int i = 0; i < board.length; i++){
                if (board[i][j] > 0) {
                    if (!bag.isEmpty() && bag.peek() == board[i][j]) {
                        bag.pop();
                        answer += 2;
                    } else {
                        bag.push(board[i][j]);
                    }
                    board[i][j] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}