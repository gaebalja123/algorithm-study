class Solution {
    public int[] solution(int[] numbers) {
        
        int[] answer = getDouble(numbers);
        
        
        return answer;
    }
    
    public static int[] getDouble(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i]*2;
            }
            return arr;
    }
    
}