package _00__Random_number_generation._By_Math_random_method;

public class _03_Genrate_random_numer_bw_start_end_range {
/// generating bw a given range
/// 
public static void main(String[] args) {
    int min = 50;
int max = 100;

int num = min + (int)(Math.random() * (max - min + 1));

System.out.println(num);

}
}
