import java.util.*;

public class Task2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the game:");
        System.out.println("What do you want to choose(0 for Rock|1 for paper|2 for Scissor)::");
        String gameplay="yes";
        while(gameplay.equalsIgnoreCase("yes")){
            Random rd=new Random();
            int computer=rd.nextInt(3);
            System.out.println("Enter your Choice::");
            int player=sc.nextInt();
            System.out.println("Player chooses="+player);
            System.out.println("Computer choose="+computer);

            if(computer==player){
                System.out.println("It's a draw");
            }
            else if(computer==0 && player==2 || computer==1 && player==0 || computer==2 && player==1){
                System.out.println("Player lose");
            }
            else{
                System.out.println("Player wins");
            }

            System.out.println("Do want to try another round?(Yes/No)::");
            gameplay=sc.next();

        }
        System.out.println("Thanks,for playing hope you enjoyed it!!!");
        sc.close();


    }
}