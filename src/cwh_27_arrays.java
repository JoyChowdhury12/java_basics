public class cwh_27_arrays {
    public static void main(String[] args) {
//        float[] arr1 = {12.1f, 34.2f, 56.3f, 78.4f, 90.5f};
        String[] students = {"Joy", "Tonu", "Chowdhury", "Shahin"};
//        System.out.println(arr.length);
//        System.out.println(arr[2]);
//        System.out.println(students.length);
//        System.out.println(students[2]);

        int[] arr = {12, 34, 56, 78, 90};
        System.out.println("Printing the array using for loop : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Printing the array in reverse order : ");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("Using for each loop : ");

        for (String element : students) {
            System.out.println(element);
        }
    }
}
