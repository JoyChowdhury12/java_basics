public class cwh_29_practiceSet_6 {
    public static void main(String[] args) {

        //Problem 1

       /* float[] marks = {45.6f, 33.7f, 22.8f, 32.3f, 67.0f};
        float sum = 0;
        for (float element : marks) {
            sum += element;
        }
        System.out.println("The sum of the float is : " + sum);*/


        //Problem 2

     /*   float[] marks = {45.6f, 33.7f, 22.8f, 32.3f, 67.0f};
        float num = 33.7f;
        boolean isInArray = false;
        for (float element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array ");
        } else {
            System.out.println("The value is not present in the array ");
        }*/


        //Problem 3
        /*
        float[] marks = {45.6f, 33.7f, 22.8f, 32.3f, 67.0f};
        float sum = 0;
        for (float element : marks) {
            sum += element;
        }
        System.out.println("The Average of the float is : " + sum / marks.length);*/


        //Problem 4
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{12, 24, 32}, {46, 53, 67}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("Setting value for i = %d and j = %d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
                
            }
            for (i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) {
                    System.out.println(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];

                }
                System.out.println("");
            }
        }
    }
}
