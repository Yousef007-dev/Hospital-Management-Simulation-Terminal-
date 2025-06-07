public class StringAndCharAndInt {



    static int reminderOfTheCharArray=0;


    public static int CharToInt(char[] a){
        int x=a[0]-'0';
        int remi=0;
        for (int i=1;i<a.length;i++)
        {
            if (a[i]=='/')
            {
                reminderOfTheCharArray++;
                remi++;
                continue;
            }
            x*=10;
            x=x+(a[i]-'0');
        }
        if (remi==0)
        {
            reminderOfTheCharArray+=2;
        }
        return x;
    }//'0'=48

    public static boolean firstIsBiggerThanTheSecond(String firstDate,String secondDate){

        reminderOfTheCharArray=0;
        boolean firstIsBigger;

        char[] firstDateChar =firstDate.toCharArray();
        char[] secondDateChar =secondDate.toCharArray();


        char[] firstDateDay = {firstDateChar[reminderOfTheCharArray], firstDateChar[++reminderOfTheCharArray]};
        int firstDateDayInt = CharToInt(firstDateDay);

        char[] firstDateMonth = {firstDateChar[reminderOfTheCharArray], firstDateChar[++reminderOfTheCharArray]};
        int firstDateMonthInt = CharToInt(firstDateMonth);

        char[] firstDateYear = {firstDateChar[reminderOfTheCharArray], firstDateChar[++reminderOfTheCharArray],
                firstDateChar[++reminderOfTheCharArray], firstDateChar[++reminderOfTheCharArray]};
        int firstDateYearInt = CharToInt(firstDateYear);

        reminderOfTheCharArray = 0;


        char[] secondDateDay = {secondDateChar[reminderOfTheCharArray], secondDateChar[++reminderOfTheCharArray]};
        int secondDateDayInt = CharToInt(secondDateDay);

        char[] secondDateMonth = {secondDateChar[reminderOfTheCharArray], secondDateChar[++reminderOfTheCharArray]};
        int secondDateMonthInt = CharToInt(secondDateMonth);

        char[] secondDateYear = {secondDateChar[reminderOfTheCharArray], secondDateChar[++reminderOfTheCharArray],
                secondDateChar[++reminderOfTheCharArray], secondDateChar[++reminderOfTheCharArray]};
        int secondDateYearInt = CharToInt(secondDateYear);

        reminderOfTheCharArray = 0;


        if(firstDateYearInt>secondDateYearInt)
        {
            firstIsBigger= true;
        }
        else if (firstDateYearInt<secondDateYearInt)
        {
            firstIsBigger= false;
        }
        else
        {
            if (firstDateMonthInt>secondDateMonthInt)
            {
                firstIsBigger= true;
            }
            else if (firstDateMonthInt<secondDateMonthInt)
            {
                firstIsBigger= false;
            }
            else
            {
                if (firstDateDayInt>=secondDateDayInt)
                {
                    firstIsBigger= true;
                }
                else
                    firstIsBigger= false;
            }
        }

        return firstIsBigger;

    }
}

