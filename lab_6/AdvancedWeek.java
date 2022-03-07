public class AdvancedWeek {

	private String a = "Monday";
	private String b = "Tuesday";
	private String c = "Wednesday";
	private String d = "Thursday";
	private String e = "Friday";
	private String f = "Saturday";
	private String g = "Sunday";
	private int x =1;
   
   public void printDays() {
        System.out.println(x++ +": "+a+",\n" +
			   x++ +": "+b+",\n" +
			   x++ +": "+c+",\n" +
			   x++ +": "+d+",\n" +
			   x++ +": "+e+",\n" +
			   x++ +": "+f+",\n" +
			   x++ +": "+g+".\n" );
    }
}