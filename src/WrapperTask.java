public class WrapperTask {
     
    
    public static void main(String[] args) {
        char[] values = {'1', 'a', '3', 'z', '9'};
        int[] nums = {10, 0, -4, 20, 5};
        System.out.println(countDigitsPrimitive(values));
        // You can call your methods here and print results
        // Example:
        // System.out.println(countDigitsPrimitive(values));
    }

    // Task A: Count digits using only primitives (e.g., ASCII comparison)
    public static int countDigitsPrimitive(char[] values) {
        int d = 0;
        for(char c : values){
            if(c >= 48 && c <= 57){
                d++;
            }
        }
        return d;
    }

    // Task B: Count digits using Character.isDigit()
    public static int countDigitsWrapper(char[] values) {
        int d = 0;
        for(char c : values){
            if(Character.isDigit(c)){
                d++;
            }
        }
        return d;
    }

    // Die 2. Version ist einfacher, da man auf den ersten Blick sieht was sie macht durch "isDigit"

    // Task C: Find max using only primitives
    public static int maxPrimitive(int[] nums) {
        int max = nums[0];
        for(int i : nums){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    // Task D: Find max using Integer.compare()
    public static int maxWithWrapper(int[] nums) {
        int max = nums[0];
        for(int i : nums){
            if(Integer.compare(i, max) == 1){
                max = i;
            }
        }
        return 0;
    }

    // Hier macht es nicht unbedingt Sinn die wrapper Methode zu verwenden, da man auch in der Methode mit der primitiven Implementation gut erkennen kann was diese tut

    // Bei soetwas wie isEqual macht boxin/unboxing Sinn
}
