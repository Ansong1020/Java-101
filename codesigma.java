public class codesigma {
        public static int countOccurences(int[] arr, int n){
          int count =0;
          for( int i = 0; i<arr.length; i++){
            if (arr[i]==n) {
                count++;
            }
          }
          return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,2,1,2,2,2,2};
        int n=2;
        System.out.println("the number" + n +"appears" +countOccurences(arr,n) +"times");
    }
}