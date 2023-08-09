package qlnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Util.
 *
 * @author hasu
 */
public final class Util {

    private static String DATE_PATTERN = "dd/MM/yyyy";

    private Util() {
    }

    public static String inputString(String message) {
        Scanner sc = new Scanner(System.in);
        String str;
        do {
            System.out.print(message + ": ");
            str = sc.nextLine();
        } while (str.isBlank());
        return str;
    }

    public static Float inputFloat(String message) {
        Float floatValue = null;
        String str;
        do {
            str = Util.inputString(message);
            try {
                floatValue = Float.valueOf(str);
            } catch (NumberFormatException ex) {
//                System.out.println("");
            }
        } while (floatValue == null);
        return floatValue;
    }

    public static Integer inputInt(String message) {
        Integer intValue = null;
        String str;
        do {
            str = Util.inputString(message);
            try {
                intValue = Integer.valueOf(str);
            } catch (NumberFormatException ex) {
//                System.out.println("");
            }
        } while (intValue == null);
        return intValue;
    }

    public static Date inputDate(String message) {
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_PATTERN);
        Date dateValue = null;
        String str;
        do {
            str = Util.inputString(message + " (" + Util.DATE_PATTERN + ")");
            dateValue = toDate(str);
        } while (dateValue == null);
        return dateValue;
    }

    public static Date toDate(String dateString) {
        Date dateValue = null;
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_PATTERN);
        try {
            dateValue = df.parse(dateString);
        } catch (ParseException ex) {
//                System.out.println("");
        }
        return dateValue;
    }

    public static String toString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(Util.DATE_PATTERN);
        return df.format(date);
    }
}
