package Pattern_Questions;

public class Inverted_Half_Pyramid_with_Numbers {
    // public static void main(String[] args) {
    //     int n = 5;
    //     for(int i = n; i >= 1; i--){
    //         for(int j = 1; j <= i; j++){
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }

//Alternate Method
public static void main(String[] args) {
    int n = 5;
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i+1; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
}

