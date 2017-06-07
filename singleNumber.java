/*Codefights*/
/*
  You are given an array of integers in which every element appears twice,
  except for one. Find the element that only appears one time. Your solution
  should have a linear runtime complexity (O(n)). Try to implement it without
  using extra memory.

Example

For nums = [2, 2, 1], the output should be
singleNumber(nums) = 1.

Input/Output

    [time limit] 3000ms (java)

    [input] array.integer nums

    Guaranteed constraints:
    1 ≤ nums.length ≤ 104,
    -109 ≤ nums[i] ≤ 109.

    [output] integer

*/

int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap();
    
    for (int num: nums)
    {
        if (map.containsKey(num) == false)
        {
            map.put(num, 1);
            continue;
        }
        
        if (map.containsKey(num) == true)
        {
            map.put(num, map.get(num) + 1);
        }
    }
    
    for (Map.Entry<Integer, Integer> entry : map.entrySet())
    {
        if (entry.getValue() == 1)
        {
            return entry.getKey();
        }
    }
    
    return 0;
}

