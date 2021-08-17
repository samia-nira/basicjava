package While_Do_Loop_Stirng;
//Assignment- 5
//        <html>
//        <body>
//        <div>
//        <p>Transaction Successful</p>
//        <p>Trnx ID: TXN5164870</p>
//        </div>
//
//
//        </body>
//        </html>
//
//
//        Extract only transaction ID from the HTML

import javax.sound.midi.Soundbank;

public class Assignment5 {
    public static void main(String[] args) {
        String str = "<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        String[] arr = (str.split("\n"));
        String transactionString = "";
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.contains("TXN")) {
                String[] arr1 = (s.split(" "));
                for (int j = 0; j < arr1.length; j++){
                    String t = arr1[j];
                    if (t.contains("TXN")){
                        transactionString = t.substring(0, t.indexOf("<"));
                    }
                }
            }
        }
        System.out.println("The transaction ID: "+transactionString);
    }
}


