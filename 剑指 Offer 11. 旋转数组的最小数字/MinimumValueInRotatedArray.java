class Solution {
    public int minArray(int[] numbers) {
        boolean flag = false;
        for(int i = 0; i < numbers.length - 1; i++){
            if(numbers[i]>numbers[i+1]){
                flag = true;
                return numbers[i+1];
            }
        }
        if(!flag){
            return numbers[0];
        }
        return 0;
    }
}