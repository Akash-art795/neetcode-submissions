class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,List<String>>map = new HashMap<>();
        for(int i=0;i<n;i++){
            String current = strs[i];
            char[] arr = current.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(current);
        }
        return new ArrayList<>(map.values());
    }
}
