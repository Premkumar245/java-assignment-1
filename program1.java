public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            
            int currentArea = width * minHeight;
            maxArea = Math.max(maxArea, currentArea);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }

    public static void main(String[] args) {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max area: " + solution.maxArea(height1)); // Output: 49
        
        int[] height2 = {1, 1};
        System.out.println("Max area: " + solution.maxArea(height2)); // Output: 1
    }
}
