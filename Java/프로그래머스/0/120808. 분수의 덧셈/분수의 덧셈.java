class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       //1. 통분하기
       //2. 대소비교하기
       //3. 공약수 구하기
       //4. 나누기
        
        int[] result = tong(numer1,denom1,numer2,denom2);
        int tm = result[0];
        int ts = result[1];
        
        int max = max(tm, ts);
        int min = min(tm, ts);
        
        int gcd = gcd(max, min);
        
        int fm = tm/gcd;
        int fs = ts/gcd;
        
        int[] answer = {fs, fm};
        return answer;
        
        
            
    }
    
    public static int[] tong(int numer1, int denom1, int numer2, int denom2) {
        int tm = denom1 * denom2;
        int ts = denom1*numer2 + denom2*numer1;
        
        int[] result = {tm, ts};
        return result;
    }
    
    public static int min(int a, int b) {
        int min = 0;

        if (a <=  b) {
            return min = a;
        }else{
            return min = b;
        }
    }

    public static int max(int a, int b) {
        int max = 0;

        if (a <=  b) {
            return max = b;
        }else {
            return max = a;
        }
    }
    
        public static int gcd(int a, int b) {
        if (a%b==0) {
            return b;
        }
        return gcd(b,a%b);
    }
}