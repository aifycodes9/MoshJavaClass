import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the name of the job: ");
        String jobName = keyboardInput.nextLine();

        System.out.print("<press enter to continue>: ");
        keyboardInput.nextLine();

        System.out.print("Enter cost of materials: ");
        double materialCost = keyboardInput.nextDouble();

        System.out.print("Enter number of hours (hh.mm) required to job: ");
        double hoursOfWork = keyboardInput.nextDouble();

        System.out.print("Enter number of hours (hh.mm) required to travel to site: ");
        double travelTime = keyboardInput.nextDouble();

        System.out.println(jobName + " will cost $" + computeJobEstimate(materialCost, hoursOfWork, travelTime));
    }

    public static double computeJobEstimate(double matCost, double workTime, double tripTime) {
         double jobCost = matCost + (workTime * 35) + (tripTime * 12);
         return jobCost;

    }
}
