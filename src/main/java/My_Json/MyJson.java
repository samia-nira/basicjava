package My_Json;

import netscape.javascript.JSObject;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyJson {
    public static void main(String[] args) throws IOException {
//        writeJsonFile();
        readJsonFile();
    }
    public static void readJsonFile() throws IOException {
        JSONObject atmobj = new JSONObject();
        atmobj.put("Balance", "6000");
        atmobj.put("pin", "1234");

        System.out.println(atmobj);
        FileReader reader = new FileReader("atm.json");
        FileWriter writer = new FileWriter("atm.json");
        writer.write(atmobj.toJSONString());
        writer.flush();
        writer.close();
    }
}
