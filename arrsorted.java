
public class arrsorted {
  public static void main(String[] args) {
    int arr[]={1,2,3,4,9,12};
    int a = 0;
    for(int i = 0;i<arr.length-1;i++){
      if ( arr[i]>arr[i+1]){
        System.out.println("Unsorted");
        a = 1;
        break;
      }
    }

    if(a==0){
      System.out.println("sorted");
    }
    if(a==1){
      System.out.println("Unsorted");
    }
    // System.out.println(arr);
  }
}
