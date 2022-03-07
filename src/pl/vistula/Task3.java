package pl.vistula;

public class Task3 {
    public static void main(String[] args) {
        //random number between 100 and 1
        int randomNumber = (int)(Math.random() * (100-1) );

        //odd or even
        if(randomNumber%2 == 0 ){
            System.out.println(randomNumber + "is even");
    } else {
            System.out.println(randomNumber + "is odd");
        }
        //STUDENT ID 56297
    }
}
