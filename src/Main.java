import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        int day = sc.nextInt();

        String day_of_week;

        if (day == 1) {
            day_of_week = "Sunny Sunday";
        }

        else if (day == 2){
            day_of_week = "Motivational Monday";
        }

        else if (day == 3){
            day_of_week = "Tired Tuesday";
        }

        else if (day == 4){
            day_of_week = "Wild Wednesday";
        }

        else if (day == 5){
            day_of_week = "Thinking Thursday";
        }

        else if (day == 6){
            day_of_week = "Funny Friday";
        }

        else if (day == 7){
            day_of_week = "Silly Saturday";
        }

        else {
            day_of_week = "INVALID";
        }

        System.out.println("The day of the week is : " + day_of_week);


    }
}