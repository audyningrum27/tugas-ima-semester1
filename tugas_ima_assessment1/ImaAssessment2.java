public class ImaAssessment2 {
    public static void main(String[] audy) {
        int min = 1;
        int max = 121;
        int i = 0;

        // keyword : "random number java" //
        while(i < 3){
            int random = (int) (Math.random() * (max - min + 1)) + min;
            if((random % 4) == 0) {
                System.out.print(random + " ");
                i++;
            }
        }

        /*int range = max - min + 1;

        for(i = 0; i < 3; i++) {
            int random = (int) (Math.random() * range) + min;
            if((random % 4) == 0) {
                System.out.print(random + " ");
            }
        }*/
    }
}
