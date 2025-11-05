class lc189 {
    static void reverse (int arr[] , int left , int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int p = nums.length - k - 1;
    reverse(nums, 0, p);
    reverse(nums, p + 1, nums.length - 1);
    reverse(nums, 0, nums.length - 1);
}
}