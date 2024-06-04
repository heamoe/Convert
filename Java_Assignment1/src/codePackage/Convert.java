package codePackage;

public class Convert {
    static double massResult;
    static double tempResult;
    static private double getKilogramValue(double mass){
        return mass*0.4536;
    }
    static private double getPoundValue(double mass){
        return  mass/0.4536;
    }
    static private double getFahrenheitValue(double temp){
        return temp*9/5+32;
    }
    static private double getCelsiusValue(double temp){
        return (temp-32)*5/9;
    }
    static public double getTemperature(double temp,int i){
        if (i == 1){
            tempResult = getFahrenheitValue(temp);
        }else if (i  == 2){
            tempResult = getCelsiusValue(temp);
        }else {System.err.println("Invalid Choice! Only 1 or 2 is allowed");tempResult = 0;}
        return tempResult;
    }
    static public double getMass(double mass,int i){
        if (i == 1){
            massResult = getKilogramValue(mass);
        }else if (i  == 2){
            massResult = getPoundValue(mass);
        }else {System.err.println("Invalid Choice! Only 1 or 2 is allowed");massResult = 0;}
        return massResult;
    }
}
