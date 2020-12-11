
package wahag.project;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.PrintWriter;
import java.io.WriteAbortedException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WahagProject extends IOException {

    /**
     * @param args the command line arguments
     */
        String file="Result1.doc";
      PrintWriter sheet;

    public WahagProject() throws FileNotFoundException {
        this.sheet = new PrintWriter(file);
    }
    void fn() throws FileNotFoundException{
        DateTimeFormatter datetimeformat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
      LocalDateTime getcurrenttime = LocalDateTime.now();  
 
      sheet.println("********************");
      String datetime=datetimeformat.format(getcurrenttime);
      Random rand=new Random();
      int start =5;
      try{
      for(int loopcount=0;loopcount<=start;loopcount++){
          int check=rand.nextInt(5);
          if( check>=0 && check<2){
              System.out.println("Patient need some sugar and eat some sweet");
              
              
              sheet.append("Patient need some sugar and eat some sweet12\n Your Suger Level is: "+check);
              sheet.append(datetime);
              sheet.append("\n################################\n");
              
              
              sheet.flush();
              break;
              
          }
          else if( check>=3 &&  check<=5){
              System.out.println("Patient sugar level is very hight inject insuline");
              
              
              sheet.append("Your Suger Level is High\n Your Suger Level is: "+ check);
              sheet.append(datetime);
              sheet.append("\n################################\n");
              
              sheet.flush();
              break;
              
          }
          else if( check==2){
              System.out.println("Normal sugar Level");
              
              
              sheet.println("Your Suger Level is normal\n Your Suger Level is: "+ check);
              sheet.println(datetime);
              sheet.println("\n################################\n");
              
              sheet.flush();
              
              break;
              
              
          }
      }
      }
      catch(Exception ex){
          
          
      }
    
   }
    public static void main(String[] args) throws FileNotFoundException {
     
        // TODO code application logic here
        
        WahagProject object=new WahagProject();
        
       
 

 
         
    try{
         
      
           
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            

            @Override
            public void run() {
                try {
                    object.fn();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(WahagProject.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
               
            }  
       },
     new Date(),
        3000
        );  
    }  
       catch(Exception e){System.out.println(e);
           
           }  
    }
           
           
}     
           
           
           

           
    

