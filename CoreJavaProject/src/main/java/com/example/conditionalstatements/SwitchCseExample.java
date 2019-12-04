package com.example.conditionalstatements;

public class SwitchCseExample {
    public static void main(String[] args) {
        SwitchCseExample obj = new SwitchCseExample();
        obj.findDayOfWeek("Sunday");
    }
    public void findDayOfWeek(String day){
        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tuesday":
                System.out.println("Tuesday");
                break;
            case "Wednesday":
                System.out.println("Wednesday");
                break;
            case "Thursday":
                System.out.println("Thursday");
                break;
            case "Friday":
                System.out.println("Friday");
                break;

            default:
                System.out.println(day);
        }
    }


}
