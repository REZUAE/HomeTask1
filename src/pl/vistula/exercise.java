package pl.vistula;

public class exercise {
    public static void main(String[] args) {

        float earthWeightJavokhir;
        float marsWeightJavokhir;
        double marsWeightInDouble;
        int marsWeightInInt;

        earthWeightJavokhir = 65;
        marsWeightJavokhir = (earthWeightJavokhir * 0.38F);
        System.out.println(earthWeightJavokhir + "kg on Earth is" + marsWeightJavokhir + "kg on Mars");

        // float to double
        marsWeightInDouble = marsWeightJavokhir;
        System.out.println("Kilograms on Mars after converting to double" + marsWeightInDouble);

        //4 decimal
        System.out.printf("Kilograms on Mars displayed to four decimal places : %.4f %n,", marsWeightInDouble);

        // a floating point type cast to int
        marsWeightInInt = (int)marsWeightInDouble;
        System.out.println("Kilograms on Mars when casted to int" + marsWeightInInt);

        //int to char
        char c = (char)marsWeightInInt;
        System.out.println("The ASCII eq of marsWeightInInt is :" + c);

        //maths operation on the char to the new int
        int exampleOfMathOnChar = c*c;
        System.out.println("An examp[le of a math opearation on the char type: "+ exampleOfMathOnChar );

        //STUDENT ID 56297





    }
}
