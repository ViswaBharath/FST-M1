package activities;

public class Activity4 {
    public static void main(String[] args) {
        int numArr[] = {8, 9, 1, 2, 5, 10, 4};

        System.out.println("Before sort -> ");
        for(int i: numArr){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("After sort-> ");
        sortArray(numArr);
        for(int i: numArr){
            System.out.print(i+" ");
        }
    }

    static void sortArray(int array[]){
        int size = array.length;

        for(int i=1;i< size;i++){
            int temp = array[i];
            int j = i-1;

            while((j>-1) && (array[j]>temp)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
