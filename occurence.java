public class occurence {
  public static void main(String[] args) {
    int arr[]={1,5,6,8,9,1,4,1};
    int key = 1;
    int count = 0;
    for(int i = 0;i<=arr.length-1;i++){
      if(arr[i]==key){
        count++;
      
      }
    }
    System.out.println(key + " : "+ count);
  }
}
