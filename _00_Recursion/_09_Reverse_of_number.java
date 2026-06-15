public class _09_Reverse_of_number {
    static int reverse=0;
    void main() {

        int num = Integer.parseInt(IO.readln("Enter a number:"));

        int result = reverseNumber(num);

        IO.println("Reverse of given number is:" + result);
    }

    public static int reverseNumber(int num) {
        
       if(num==0){
       return reverse;
        }
       reverse= reverse*10+num%10;
       reverseNumber(num/10);
       return reverse;

    } 
}
