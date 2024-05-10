class Solution {
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        
        if (n % 2 != 0) {
            return stringBuilder.repeat("a", n)
                .toString();
        }

        return stringBuilder.repeat("a", n - 1)
            .append("b")
            .toString();
    }
}

