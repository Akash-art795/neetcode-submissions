class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        boolean found = false;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
                found = true;
            }
        }
        if(!found){
            System.out.println("No Duplicates Found");
        }
        return found;
    }
}