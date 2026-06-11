package DSA_mqt.Arrays.TwoPointers;

public class ContainerWithMostWater_11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int area = Math.min(height[left],height[right]) * (right-left);
            maxArea = Math.max(area,maxArea);
            left++;
            
        }
        left = 0;
        while(left<right){
            int area = Math.min(height[left],height[right]) * (right-left);
            maxArea = Math.max(area,maxArea);
            right--;
            
        }
        right = height.length-1;
        while(left<right){
            int area = Math.min(height[left],height[right]) * (right-left);
            maxArea = Math.max(area,maxArea);
            right--;
            left++;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(arr);
        System.out.println(ans);
    }
}
