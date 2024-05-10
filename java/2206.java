class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(nums)
            .forEach(num -> {
                int currentCount = map.getOrDefault(num, 0);
                map.put(num, currentCount + 1);
            });
        
        return map.values()
            .stream()
            .allMatch(count -> count % 2 == 0);
    }
}

