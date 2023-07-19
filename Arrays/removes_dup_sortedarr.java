public class removes_dup_sortedarr {
    public static int remove(int nums[]) {
        int flag = 1;
        for(int i =1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[flag] = nums[i];
                flag++;
            }
        }
        return flag;
    }
    public static void main(String args[]) {
        int nums[] = {0,1,1,1,1,2,2,3,3,4};
        System.out.print(remove(nums));
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +","+" ");
        }
    }
}
