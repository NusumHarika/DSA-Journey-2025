class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int x:nums){
            if(!map.containsKey(x)){
                map.put(x,1);
            }else{
                map.put(x,map.get(x)+1);
            }
        }
        int sum=0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key=entry.getKey();
            int value=entry.getValue();
            if(value%k==0){
                sum+=(key*value);
            }
        }
        return sum;
    }
}