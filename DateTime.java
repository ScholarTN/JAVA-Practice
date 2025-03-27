import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.*;
import java.time.temporal.*;

public class DateTime
{
        public static void main(String[] args) 
        {
            Date d = new Date();
            SimpleDateFormat  sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
            sdf.setTimeZone(TimeZone.getTimeZone("ASia/Kolkata"));
            String date = sdf.format(d);
            System.out.println(date);

            //Using Calendar classs
            Calendar c = Calendar.getInstance();
            System.out.println(c.get(Calendar.DAY_OF_WEEK));
            System.out.println(c.get(Calendar.DAY_OF_YEAR));
            System.out.println(c.get(Calendar.HOUR));
            System.out.println(c.get(Calendar.MINUTE));
            System.out.println(c.get(Calendar.SECOND));

            //Using LocalDate
            LocalDate da = LocalDate.now();
            System.out.println(da);

            //using DateTimeFormatter class to format the date
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            String datee = da.format(dtf);
            System.out.println(datee);

            //Converting String to date 
            String s = "21-09-2011";
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy"); // the string format must be same as dateformatter format ie. "dd-MM-yyyy" in this case
            LocalDate date2 = LocalDate.parse(s,dtf1);
            DateTimeFormatter dtf2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String date3 = date2.format(dtf2);
            System.out.println(date3);

            //WAP to reformat the date
            //Input : 20th oct 2052 
            //first remove th,st,nd,rd with none

            Scanner sc = new Scanner(System.in);
            String s2 = sc.nextLine(); //If s2 is 20th Oct 2052
            
           s2=s2.replaceAll("th|st|nd|rd","");// 20 Oct 2052
           //Convert to date 
           try{
           DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd MMM yyyy");//string format is this so use that
          
           LocalDate date5 = LocalDate.parse(s2,dtf4);//s has been changed to date
           DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //Format you want to print it
           String finalDate = date5.format(dtf5);
           System.out.println(finalDate);
           }
           catch(Exception e){};

           sc.close();


        }
}

//WAP To find the number of Days between 2 dates
class NumDates
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s4 = sc.nextLine();
        String s5 = sc.nextLine();

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date6 = LocalDate.parse(s4,dtf5);
        LocalDate date7 = LocalDate.parse(s5,dtf5);

        //To compare and get the difference 
        System.out.println("No of years: "+ Period.between(date6, date7).getYears());
        System.out.println("No of Months: "+ Period.between(date6, date7).getMonths());  
        System.out.println("No of Days: "+ Period.between(date6, date7).getDays());

        // using chonoUnit to calculate the total months or days at once // import java.time.temporal.*;
        Long a=ChronoUnit.YEARS.between(date6, date7);
        Long b=ChronoUnit.MONTHS.between(date6, date7);
        Long c=ChronoUnit.DAYS.between(date6, date7);

        System.out.println("Total Days: " +a );
        System.out.println("Total Days: " + b);
        System.out.println("Total Days: " + c);

        //Using manual method 
        int noOfDays = 0;
        while (!date6.equals(date7)) 
        {
            date6 = date7.plusDays(1);
            noOfDays++;    
        }
        System.out.println(noOfDays);

        sc.close();


    }
}

//WAP to find the difference between 2 times. time is in 12:45 and 13:35

class TimeDiff
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s6 = sc.nextLine();
        String s7 = sc.nextLine();

        String st1[] = s6.split(":"); //st1[0]=12
        int hour1 = Integer.parseInt(st1[0]);
        int min1 = Integer.parseInt(st1[1]);
        int finalmin1 = (hour1*60)+min1;

        String st2[] = s7.split(":");
        int hour2 = Integer.parseInt(st2[0]);
        int min2 = Integer.parseInt(st2[1]);
        int finalmin2 = (hour2*60)+min2;

        //Make it absolute because we do not know which one is greater
        int diff = Math.abs(finalmin1-finalmin2);
        //now to handle instances where the time is 00:00 for 24hrs 
        int resMin = Math.min(diff,1440-diff);

        System.out.println("Diff in minutes: " + resMin);

        sc.close();

    }   
}

//WAP Accept a time in the form of hour and minute, find the hidden digits to get the max time 
//suppose 1?:?3 : max time 19:53 
// ??:?? : max 23:59
//2?:0? : max 23:09

 class HiddenDigit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s8 = sc.nextLine();

        char ch[] = s8.toCharArray();
        if (ch[0]=='?')
        {
            if(ch[1]=='?')
            {
                ch[0]='2';
                ch[1]='3';

            }
            else
            {
                ch[0] = (ch[1]<='3')?'2':'1';
            }
        }
        if (ch[1]=='?')
        {
            ch[1]=(ch[0]=='2')?'3':'9';
        }
        if (ch[3]=='?')
        {
            if(ch[4]=='?')
            {
                ch[3]='5';
                ch[4]='9';
            }
            else 
            {
                ch[3]='5';
            }
        }
        if(ch[4]=='?')
        {
            ch[4]='9';
        }
        sc.close();
    }
    //System.out.println("Final max time= " + ch[0]+ch[1]+ch[2]+ch[3]+ch[4]);
    
}



