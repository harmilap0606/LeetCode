class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // If the set already contains the number, it's a duplicate
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                // Otherwise, remember this number for later
                seen.add(num);
            }
        }
        
        return duplicates;
    }
}