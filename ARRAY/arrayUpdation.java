import java.util.*;

public class arrayUpdation{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the size of array :\t");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("\nEnter the elements of array :\t");
        for(int g=0;g<size;g++)
            arr[g] = sc.nextInt();

        System.out.print("\nEnter the new data to insert in array :\t");
        int data = sc.nextInt();

        System.out.print("\nEnter the position to insert data to array :\t");
        int pos = sc.nextInt();

        if(pos == 1)
            System.out.print("\nArray after insertion at start :\t"+Arrays.toString(new arrayUpdate().insertAtStart(arr, data)));
        else if(pos > 1 && pos < arr.length-1)
            System.out.print("\nArray after insertion at position "+pos+":\t"+Arrays.toString(new arrayUpdate().insertAtPos(arr, data, pos)));
        else
            System.out.print("\nArray after insertion at last :\t"+Arrays.toString(new arrayUpdate().insertAtLast(arr, data)));
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