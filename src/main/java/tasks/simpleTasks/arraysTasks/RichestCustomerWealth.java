package tasks.simpleTasks.arraysTasks;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1,2,3},{3,2,1}};
        System.out.println(RichestCustomerWealth.maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;
        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;
            for (int bank : customer) {
                currentCustomerWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
    }
}