import java.util.Arrays;
import java.util.Scanner;

public class updateArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int newNum = 10;

        System.out.print("\nArray before update :\t");
        System.out.print(Arrays.toString(arr));

        System.out.print("\nArray after update, new data at start :\t"+Arrays.toString(new arrayUpdate().insertAtStart(arr, newNum)));

        System.out.print("\nArray after update, new data at last :\t"+Arrays.toString(new arrayUpdate().insertAtLast(arr, newNum)));

        int pos = 5;
        System.out.print("\nArray after update, new data at position :"+pos+" is :\t"+Arrays.toString(new arrayUpdate().insertAtPos(arr, newNum, pos)));
    }
}

class arrayUpdate{
    public int[] insertAtStart(int[] arr, int num){ // inserting new data to first of array
        int[] newArr = new int[arr.length+1];
        for(int g=0;g<arr.length;g++)
            newArr[g+1] = arr[g];
        newArr[0] = num;
        return newArr;
    }

    public int[] insertAtPos(int[] arr, int num, int pos){ // inserting new data to given position
        int[] newArr = new int[arr.length+1];
        for(int g=0;g<pos-1;g++)
            newArr[g] = arr[g];
        newArr[pos-1] = num;

        for(int g=pos-1;g<arr.length;g++)
            newArr[g+1] = arr[g];
        
        return newArr;
    }

    public int[] insertAtLast(int[] arr, int num){ // inserting new data to last of array
        int[] newArr = new int[arr.length+1];
        for(int g=0;g<arr.length;g++)
            newArr[g] = arr[g];
        newArr[arr.length] = num;
        return newArr;
    }
}