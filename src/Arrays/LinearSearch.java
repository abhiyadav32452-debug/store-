package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
int[] arr = {12,13,14,15,16,17,122};
int target = 149;
boolean found = false; // false means target array me nhi hai
        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
                found = true; // true means target array me hai
                break;
            }
        }
        if(found) System.out.println("Target exists in Array");
        else System.out.println("Target missing in array");
    }
}
