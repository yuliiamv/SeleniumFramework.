package testcases;

import org.testng.annotations.Test;

public class JavaMethodsTest {
    @Test
    public static void testJavaMethods() {
        double income = 23000;
        if (income >= 0 && income <= 10275) {
            System.out.println("Your tax will be 10%");
        } else if (income >= 10276 && income <= 41775) {
            System.out.println("Your tax will be 12%");
        } else if (income >= 41776 && income <= 89075) {
            System.out.println("Your tax will be 22%");
        } else {
            System.out.println("Please call your CPA");
        }
    }

    //Task#2. Create switch statement to print working hours for 6 different departments
    @Test
    public void testSwitch() {
        String department = "Research and Development";

        switch (department) {

            case "HR":
                System.out.println("HR Department works from: 9 AM to 5 PM");
                break;
            case "IT":
                System.out.println("IT Department works from: 10 AM to 6 PM");
                break;
            case "Finance":
                System.out.println("Finance Department works from: 8:30 AM to 4:30 PM");
                break;
            case "Marketing":
                System.out.println("Marketing Department works from: 9:30 AM to 6:30 PM");
                break;
            case "Operations":
                System.out.println("Operations Department works from: 8 AM to 4 PM");
                break;
            case "Sales":
                System.out.println("Sales Department works from: 10:30 AM to 7:30 PM");
                break;
            default:
                System.out.println("Department not found. Please check the department name.");
                break;
        }
    }
    @Test
    public void testForLoop(){
        for (int hour = 0; hour < 24; hour ++) {
            System.out.println(hour + ":00");
            hour++;
        }
    }

    }
            
