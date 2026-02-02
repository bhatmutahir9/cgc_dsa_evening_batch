public class arrlargest {
 
  public static void main(String[] args) {
    int arr[] = {10,8,7,14,9,12};
    int max = 0;
    for(int i = 0;i<6;i++){
       if(arr[i]>max){
        max = arr[i];
        
       }
    }
 System.out.println(max);
  }
}
