class Solution {
    public int solution(int num1, int num2) {
        float answer1 = (float)num1 / (float)num2 * 1000;
        int answer2 = (int) answer1;
        return answer2;
    }
}