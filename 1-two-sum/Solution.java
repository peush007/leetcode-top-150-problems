import java.util.Map;
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       Map<Integer, Integer> Notebook = new HashMap<>();

       for(int i = 0; i < nums.length; i++)
       {
        int currentNum = nums[i]; 
        int needed = target - currentNum;

        if(Notebook.containsKey(needed)){
            return new int[] { Notebook.get(needed), i};
            }
        Notebook.put(currentNum, i);
        }
        return new int[]{};
       }
}