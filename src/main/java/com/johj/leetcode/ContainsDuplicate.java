package com.johj.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
      Set<Integer> uniq = new HashSet();
      for(int i = 0; i< nums.length ; i++){
        if(!uniq.contains(nums[i])){
          uniq.add(nums[i]);
        }
      }
      if(uniq.size() < nums.length){
        return true;
      }else{
        return false;
      }
    }
}
