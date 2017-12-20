package season_of_month;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by joselitowilliamraymundo on 12/20/17.
 */
public class SeasonOfMonth {
    public static void main(String[] args) {

        Calendar calendarMonth = Calendar.getInstance();
        SimpleDateFormat intToStr = new SimpleDateFormat("MMMM");
        String[] months = new String[12];
        int i = 0;
        while (i < 12) {                                                       /********************************/
            calendarMonth.set(Calendar.MONTH, i);                             /* This block of codes load the */
            months[i] = intToStr.format(calendarMonth.getTime());            /*Months in an ARRAY thru the   */
            i++;                                                            /* Calendar Object/library.     */
        }                                                                  /********************************/

        String[] months2 = {"JanuAry",/*"DeCeMbEr",*/"FebRUary",         /***********************************/
                "MarCH", "AprIl", "MaY", "JUne", "JULy", "AugUSt",      /* Hard Coded Months in mixed case */
                "SepTEMber", "OctOBer", "nOvEmBeR"/*,"DEceMbeR"*/};    /***********************************/

        Calendar monthNow = Calendar.getInstance();                  /***********************************/
        String monthToSearch = intToStr.format(monthNow.getTime()); /* To test the codes using the     */
        Boolean isMatchFound = false;                              /* hard-coded ARRAY, append '2'    */
        int counter = 0;                                          /* in months i.e. 'months2' in     */
        for (String month : months/*2*/) {// <---< <---< <---<   /* the 'for' condition statement.  */
            counter++;                                          /***********************************/
            if (monthToSearch.toLowerCase().equals(month.toLowerCase())) {
                isMatchFound = true;
                break;
            }
        }
        if (isMatchFound) {
            String position = "";
            switch (counter) {
                case 1:                             /******************************************/
                    position = "st";               /* After a 'Break',or after exhausting the*/
                    break;                        /* whole ARRAY, which ever comes first,   */
                case 2:                          /* a test will be conducted to see if a   */
                    position = "nd";            /*  match was found and will be the basis */
                    break;                     /*  of the Print Out.                     */
                case 3:                       /******************************************/
                    position = "rd";
                    break;
                default:
                    position = "th";
            }
            System.out.println("First occurence of '" + monthToSearch + "' is " + counter + position + " in the Array of Months.");
        } else
            System.out.println("NO '" + monthToSearch + "' was found among " + counter + " record(s) in the Array of Months.");
    }
}



