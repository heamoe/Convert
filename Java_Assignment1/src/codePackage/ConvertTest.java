package codePackage;

import java.util.InputMismatchException;
import java.util.Scanner;
//Group member: Zhaorui Zhang, Rajnessh
//we add the additional error free check on the code
public class ConvertTest {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        do {
            System.out.println("Enter '1' for weight converting, or '2' for temperature converting");
            String input = scanner.nextLine();
            try{
                int choice = Integer.parseInt(input);
                if (choice == 1) {
                    System.out.println("Enter the mass you want to calculate");
                    boolean  massInputSuccess =false;
                    double value =0;
                    do {
                        try {
                            value = Double.parseDouble(scanner.next());
                            massInputSuccess = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid mass value.");
                        }catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                        }
                    }while (!massInputSuccess);
                    System.out.println("Enter '1' for converting LB to KG, or '2' for converting KG to LB:");
                    boolean  modeInputSuccess =false;
                    int mode=0;
                    do {
                        try {
                            mode = Integer.parseInt((scanner.next()));
                            modeInputSuccess = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid choice.");
                        }catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                        }
                    }while (!modeInputSuccess);

                    double massResult = (mode == 1)? Convert.getMass(value,1):Convert.getMass(value,2);
                    System.out.printf("%f%s is %f%s",value,(mode==1)?"Lb":"KG",massResult,(mode==1)?"KG":"LB");
                    System.out.println("");
                }else if (choice == 2){
                    System.out.println("Enter the temperature you want to calculate");
                    boolean  tempInputSuccess =false;
                    double value =0;
                    do {
                        try {
                            value = Double.parseDouble(scanner.next());
                            tempInputSuccess = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid temperature value.");
                        }catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                        }
                    }while (!tempInputSuccess);
                    System.out.println("Enter '1' for converting °C to °F, or '2' for converting °F to °C:");
                    boolean  modeInputSuccess =false;
                    int mode=0;
                    do {
                        try {
                            mode = Integer.parseInt((scanner.next()));
                            modeInputSuccess = true;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid choice.");
                        }catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter a number.");
                        }
                    }while (!modeInputSuccess);
                    double tempResult = (mode == 1)? Convert.getTemperature(value,1):Convert.getTemperature(value,2);
                    System.out.printf("%f%s is %f%s",value,(mode==1)?"°C":"°F",tempResult,(mode==1)?"°F":"°C");
                    System.out.println("");
                }else {
                    System.out.println("Invalid input");
                }
            }catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
            }catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        input = scanner.nextLine();
        }while (true);

    }
}
