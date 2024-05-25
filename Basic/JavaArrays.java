public class JavaArrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        cars[0] = "opel";

        // System.out.println(cars[0]);
        // System.out.println(myNum[2]);
        // System.out.println(cars.length);

        // for (int i =0; i< cars.length; i++) {
        //     System.out.println(cars[i]);
        // }

        for (String i : cars) {
            // System.out.println(i);
        }


        // multidimensional arrays

        int[][] myNumber = {{1,2,3,4,5}, {6,7,8}};
        System.out.println(myNumber.length);

        myNumber[1][2] = 9;
        // System.out.println(myNumber[1][2]);


        for (int j = 0; j< myNumber.length; ++j){
            for (int k = 0; k<myNumber[j].length; ++k) {
                // System.out.println(myNumber[j][k]);
            }
        }
    }
}
