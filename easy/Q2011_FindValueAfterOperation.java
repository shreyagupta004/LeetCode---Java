package easy;

public class Q2011_FindValueAfterOperation {
    public static void main(String[] args) {
        String [] operations =  {"--X", "X++", "X++"};
         Q2011_FindValueAfterOperation obj = new Q2011_FindValueAfterOperation();

        int ans = obj.finalValueAfterOperations(operations);

        System.out.println(ans);
        
    }
     public int finalValueAfterOperations(String[] operations) {
          int x = 0;

        for (String operation : operations) {

            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }

        return x;
    }
}
