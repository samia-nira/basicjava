package My_Json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1 {
    private static boolean checkLogin(String pin) {
        boolean blocked = false;
        for (int i = 1; i <= 3; i++) {
            boolean flag = false;
            System.out.println("Please Enter your pin: ");
            Scanner scanner = new Scanner(System.in);
            String user_pin = scanner.nextLine();
            if (pin.equals(user_pin)) {
                flag = true;
            } else {
                System.out.println("Wrong pin inserted");
            }
            if (flag == true) {
                return true;
            }
            if (i == 3 && flag == false) {
                blocked = true;
            }
        }
        if (blocked) {
            System.out.println("Card is blocked. ");
        }
        return false;
    }

    public static JSONObject readJSONFile() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader("atm.json"));
        JSONObject atmJson = (JSONObject) obj;

        return atmJson;
    }

    public static void main(String[] args) throws IOException {
        JSONObject atmJson = new JSONObject();
        String strBalance = "";
        String strPin = "";
        try {
            atmJson = readJSONFile();
            strBalance = (String) atmJson.get("Balance");
            strPin = (String) atmJson.get("pin");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw balance");
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        double balance = Double.parseDouble(strBalance);

        if (result == 1 || result == 2) {
            if (result == 1) {
                if (checkLogin(strPin)) {
                    System.out.println("Your balance is " + balance + "Tk.");
                }
            } else if (result == 2) {
                boolean done = false;
                while (!done) {
                    if (!checkLogin(strPin)) {
                        done = true;
                    } else {
                        System.out.println("Input amount multiply by 500.");
                        int amount = scanner.nextInt();
                        System.out.println(amount);
                        if (amount % 500 != 0) {
                            System.out.println("Please input amount that is multiply by 500.");
                        } else if (amount > balance) {
                            System.out.println("Not enough balance.");
                        } else {
                            balance -= amount;
                            System.out.println("Withdraw successful. Your current balance is " + balance + ".");
                            atmJson.put("Balance", Double.toString(balance));
                            FileWriter writer = new FileWriter("atm.json");
                            writer.write(atmJson.toJSONString());
                            writer.flush();
                            writer.close();
                            done = true;

                        }
                    }
                }
            }
        } else {
            System.out.println("Invalid choice.");
        }


    }
}

