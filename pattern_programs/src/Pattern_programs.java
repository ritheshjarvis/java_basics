public class Pattern_programs {
    public static void main(String[] args) {
        int num = 5;

        //Outer Loop for number of lines
        for(int i = 0; i < num; i++){

            //First inner loop for Blank spaces
            //In first iteration Four space will be printed - First line
            for(int j = i; j < num-1; j++) {
                System.out.print(" ");
            }

            //Second inner loop for star
            //In first iteration one star will be printed - First Line
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            //To goto second line
            System.out.println();
        }
    }
}
