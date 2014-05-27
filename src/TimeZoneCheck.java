import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneCheck{
     public static void main(String [] args){
         
//          TimeZone tz = Calendar.getInstance().getTimeZone();
    	   	Date day = new Date();
    		System.out.println("time : " + day);
    		
    		String dateform = "yyyy-MM-dd HH:mm:ss";
    		SimpleDateFormat df = new SimpleDateFormat(dateform, Locale.KOREA);
    		System.out.println("KOREA:" + df.format(day));
    		    		
    		SimpleDateFormat sdf = new SimpleDateFormat (dateform);
    		
    		sdf.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
    		System.out.println("Asia/Seoul : " + sdf.format(day));
    		
    		sdf.setTimeZone (TimeZone.getTimeZone("Asia/Beijing"));
    		System.out.println("Asia/Beijing : " + sdf.format(day));
    		
    		sdf.setTimeZone (TimeZone.getTimeZone ("China/Beijing"));
    		System.out.println("China/Beijing : " + sdf.format(day));
    		
    		sdf.setTimeZone (TimeZone.getTimeZone ("Asia/Shanghai"));
    		System.out.println("Asia/Shanghai : " + sdf.format(day));
     
//          System.out.println("현재 TimeZone 구역 의 이름 ::: " + tz.getDisplayName());
//          System.out.println("현재 TimeZone 구역 의 해당 ID ::: "  + tz.getID());
//          System.out.println(tz.getAvailableIDs());
//          System.out.println(TimeZone.getTimeZone("China/BeiJing"));
//          System.out.println(tz.get(Calendar.HOUR_OF_DAY));
      /*    
          for(String ids : TimeZone.getAvailableIDs()){
        	  System.out.println(ids);
          }
       
          String[] zids = TimeZone.getAvailableIDs();
          for(String st : zids){
        	  System.out.println(st);
          }
          
          tz.setDefault(tz.getTimeZone("Asia/Beijing"));
          tz.getTimeZone("Asia/Beijing");
          */
       }

}