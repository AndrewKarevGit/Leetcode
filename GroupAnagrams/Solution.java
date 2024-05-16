class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int index = 0;
        HashMap<String, Integer> indexMap = new HashMap<>();
        ArrayList<List<String>> result = new ArrayList<List<String>>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!indexMap.containsKey(sorted)) {
                indexMap.put(sorted, index);
                result.add(new ArrayList<String>());
                index++;
            }
            result.get(indexMap.get(sorted)).add(str);
        }
        return result;
    }
}
