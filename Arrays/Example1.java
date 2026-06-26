public class Example1 {
    public static void main(String[] args) {
        int[] arr={0,1,3};

        int size=arr.length;

        int expectedSum=size*(size+1)/2;

        int sum=0;
        for(int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
        int actualSum=expectedSum-sum;

        System.out.println("Missing no is array : " + actualSum);
    }
}
