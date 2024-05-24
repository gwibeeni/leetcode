class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int firstStop = Math.min(start, destination);
        int lastStop = Math.max(start, destination);

        int circumference = Arrays.stream(distance)
            .sum();

        int clockwiseDistance = Arrays.stream(distance, firstStop, lastStop)
            .sum();

        int counterClockwiseDistance = circumference - clockwiseDistance;

        return Math.min(clockwiseDistance, counterClockwiseDistance);
    }
}
