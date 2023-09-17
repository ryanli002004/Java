package mypackage;

public class Second {
    public static void main(String[] args){
        int temp = 32;
        if (temp>30){
            System.out.println("it is a hot day");
            System.out.println("drink water");
        }
        else if (temp >20){
            System.out.println("beautiful day");
        }
        else {System.out.println("cold day");}

        int income = 120000;
        boolean hasHighIncome = (income > 100000);
        System.out.println(hasHighIncome);

        int income1 = 120000;
        String className = income1 > 100000 ? "First":"Economy";
        System.out.println(className);

        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("you are an admin");
                break;
            case "moderator":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }
    }
}
