public class Pattern_programs {
    public static void main(String[] args) {
        int num = 5;
        for(int i = 0; i < num; i++){

            //First inner loop for Blank spaces - First line
            //In first iteration Four space will be printed
            for(int j = i; j < num-1; j++) {
                System.out.print(" ");
            }

            //Second inner loop for star - Second line
            //In first iteration one star will be printed
            for(int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
