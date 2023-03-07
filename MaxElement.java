public class MaxElement {
    static int maxNum(int arr[]){
        int maximun=arr[0];
        for(int i=1;i<arr.length;i++){
            maximun=Math.max(maximun, arr[i]);
        }
        return maximun;
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,8,9,6};
        System.out.println(maxNum(arr));
    }
}
