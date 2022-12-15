package numberClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Masukan Nama : ");
        String nama = scanner.nextLine();
        System.out.println("Masukan Tgl Lahir ");
        String tglLahir = scanner.nextLine();
        Date tglLahirDate = formater.parse(tglLahir);
        System.out.println("tgl Lahir: "+ tglLahirDate);

        Date currentDate = new Date();

        String tglSekarang = formater.format(currentDate);
        System.out.println("tgl Sekarang Date "+ currentDate);
        System.out.println("tgl Sekarang "+ tglSekarang);

        System.out.println("\n");
        // hitung umur
        Calendar calendar = Calendar.getInstance();
        //tgl date => calender
        calendar.setTime(tglLahirDate);
        System.out.println("Calender tgl lahir "+ calendar.getTime());
        //Calender sekaran
        Calendar currentCalender = Calendar.getInstance();
        currentCalender.setTime(new Date());
        System.out.println("tgl Sekarang "+ currentCalender.getTime());

        Long second = (currentCalender.getTimeInMillis() - calendar.getTimeInMillis())/1000;
        System.out.println("Bentuk Second: " + second);

        //Double minute = second * 0.0166666667;
        Double minute = second / 60.0;
        System.out.println("Bentuk Minute: " + minute);

        //Double hour = minute * 0.0166666667;
        Double hour = minute / 60.0;
        System.out.println("Bentuk hour: " + hour);

        //Double day = hour * 0.0416666667;
        Double day = hour / 24.0;
        System.out.println("Bentuk day: " + day);

        Double week = hour / 7.0;
        System.out.println("Bentuk week: " + week);

        //Double month = day * 0.0328549112;
        Double month = day /30.436;
        System.out.println("Bentuk month: " + month);

        //Double year = month * 0.08;
        //Double year = day * 0.003;
        Double year = day / 365.246;
        System.out.println("Bentuk year: " + year);




//        LocalDate input = LocalDate.parse(tglLahir);
//        LocalDate curDate = LocalDate.now();
//        Integer umur = Period.between(input,curDate).getYears();
//
//        System.out.println("Umur Sekarang: " + umur);
    }
}
