package FirstPack;

public class ClassA {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int max = arr[1];
        int min = arr[0];
        for(int i : arr){
            if(max < i){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }
        System.out.println(max+"   "+min);
    }
}
