package activities;

public class Activity2 {

    public static void main(String args[]){
        int numArr[] = { 10, 77, 10, 54, -11};

        int searchNum = 10;
        int total = 30;

        System.out.println("Result is -> " + findResult(numArr,searchNum,total));
    }

    public static boolean findResult(int numbers[], int searchNum, int fixedTotal){
        int temp = 0;
        for(int number: numbers) {
            if (number == searchNum) {
                temp = temp + searchNum;
            }

            if (temp > fixedTotal) {
                break;
            }
        }
            return temp == fixedTotal;
        }

}
