package com.example.conditionalstatements;

public class SwitchCseExample {
    public static void main(String[] args) {
        SwitchCseExample obj = new SwitchCseExample();
        String res = obj.findDayOfWeek("Wednesday");
        System.out.println("Response : " + res);
    }

    public String findDayOfWeek(String day){
        String response;

        switch (day) {
            case "Monday":
                response ="Monday";
                break;
            case "Tuesday":
                response ="Tuesday";
                break;
            case "Wednesday":
                response = "Wednesday";
                break;
            case "Thursday":
                response = "Thursday";
                break;
            case "Friday":
                response ="Friday";
                break;

            default:
                response = day;
                break;
        }

        return response;
    }


}
