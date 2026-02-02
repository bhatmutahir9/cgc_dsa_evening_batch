public class arrsum {
  public static void main(String[] args) {
    
  int arr[]= {5,7,2,8,10};
  int max = 0;
  int sum  = 0;
  for(int i = 0;i<arr.length;i++){
    sum = sum +arr[i];
  if(arr[i]>max){
    max =arr[i];
  }
  }
  int res = sum - max;
  System.out.println("Sum of Arr Except Max"+res);
}
}

