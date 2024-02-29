import java.util.Scanner;
public class UnitConverter {
    public double fahrenheit, celsius, kelvin;
    public String answer;
    public double celsiusToFahrenheit(double celsius) {
        return (9.0/5.0) * celsius + 32;
    }
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    public double fahrenheitToCelsius(double fahrenheit) {
        return (5.0/9.0) * (fahrenheit - 32);
    }
    public double fahrenheitToKelvin(double fahrenheit) {
        return (5.0/9.0) * (fahrenheit - 32) + 273.15;
    }
    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    public double kelvinToFahrenheit(double kelvin) {
        return (9.0/5.0) * (kelvin - 273.15) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UnitConverter converter = new UnitConverter();
        System.out.println("Welcome to the Unit converter program");
        boolean flag = true;
        boolean flag3 = false;

        do {
            do {
                System.out.println("Enter the number of your unit measurement");
                System.out.println("1. Celsius");
                System.out.println("2. Fahrenheit");
                System.out.println("3. Kelvin");
                converter.answer = sc.next();
                if (!converter.answer.equals("1") && !converter.answer.equals("2") && !converter.answer.equals("3")) {
                    System.out.println("The input is incorrect, try again");
                    flag = false;
                } else {
                    flag = true;
                }
            } while (!flag);

            boolean flag2 = true;
            do {
                switch (converter.answer) {
                    case "1":
                        System.out.println("Enter the temperature in Celsius");
                        try {
                            double input1 = sc.nextDouble();
                            System.out.println("Enter the number of the measurement you want to convert to");
                            System.out.println("1. Fahrenheit");
                            System.out.println("2. Kelvin");
                            String input2 = sc.next();

                            flag2 = switch (input2) {
                                case "1" -> {
                                    System.out.println("The temperature in Fahrenheit is " + converter.celsiusToFahrenheit(input1));
                                    yield true;
                                }
                                case "2" -> {
                                    System.out.println("The temperature in Kelvin is " + converter.celsiusToKelvin(input1));
                                    yield true;
                                }
                                default -> {
                                    System.out.println("invalid option, try again");
                                    yield false;
                                }
                            };
                        } catch (Exception e) {
                            System.out.println("invalid input, please enter a valid number");
                            sc.next();
                            flag2 = false;
                        }
                        break;
                    case "2":
                        System.out.println("Enter the temperature in Fahrenheit");
                        try {
                            double input1 = sc.nextDouble();
                            System.out.println("Enter the number of the measurement you want to convert to");
                            System.out.println("1. Celsius");
                            System.out.println("2. Kelvin");
                            String input2 = sc.next();

                            flag2 = switch (input2) {
                                case "1" -> {
                                    System.out.println("The temperature in Celsius is " + converter.fahrenheitToCelsius(input1));
                                    yield true;
                                }
                                case "2" -> {
                                    System.out.println("The temperature in Kelvin is " + converter.fahrenheitToKelvin(input1));
                                    yield true;
                                }
                                default -> {
                                    System.out.println("Invalid input, please try again");
                                    yield false;
                                }
                            };
                        } catch (Exception e) {
                            System.out.println("Invalid input, please enter a valid number");
                            sc.next();
                            flag2 = false;
                        }
                        break;
                    case "3":
                        System.out.println("Enter the temperature in Kelvin");
                        try {
                            double input1 = sc.nextDouble();
                            System.out.println("Enter the number of the measurement you want to convert to");
                            System.out.println("1. Celsius");
                            System.out.println("2. Fahrenheit");
                            String input2 = sc.next();

                            flag2 = switch (input2) {
                                case "1" -> {
                                    System.out.println("The temperature in Celsius is " + converter.kelvinToCelsius(input1));
                                    yield true;
                                }
                                case "2" -> {
                                    System.out.println("The temperature in Fahrenheit is " + converter.kelvinToFahrenheit(input1));
                                    yield true;
                                }
                                default -> {
                                    System.out.println("invalid input, please try again");
                                    yield false;
                                }
                            };
                        } catch (Exception e) {
                            System.out.println("Invalid input, enter a valid number");
                            sc.next();
                            flag2 = false;
                        }
                        break;
                    default:
                        System.out.println("try again");
                        flag2 = false;
                        break;
                }
            } while (!flag2);

            System.out.println("Do you want to convert more units? (yes/no)");
            String ans = sc.next();
            if(ans.equalsIgnoreCase("yes")) {
                flag3 = true;
            } else {
                System.out.println("See you later!");
                flag3 = false;
            }
        } while (flag3);
    }
}
