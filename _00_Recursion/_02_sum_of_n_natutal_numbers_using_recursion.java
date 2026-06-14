public class _02_sum_of_n_natutal_numbers_using_recursion {
 void main(){
    int number=Integer.parseInt(IO.readln("Enter the number till you want to find the sum"));
   int result= findSum(number);
   IO.println(result);
 }

 public static int findSum(int num){
    int sum=0;
    if(num==0){
        return sum;
    }
    sum=num+findSum(num-1);
    return sum;


 }}
