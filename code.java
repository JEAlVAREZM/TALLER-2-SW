/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.jornada.novedades;
import javax.swing.JOptionPane;

public class code {
  
  
    public static void main(String[] args){
    
     boolean repeat = true; 
     String name = JOptionPane.showInputDialog("Type the name of the employe");
     String id = JOptionPane.showInputDialog("Type de ID of the employe");
     double countHours = 0;
     int countLicency = 4;
     int countMother = 180;
     int countFather = 15;
     int countIncapacities = 20;
     int countVacation = 15;
     
     while(repeat == true){
         //main menu
        String option = JOptionPane.showInputDialog("Type A) to enter working day. B) to enter novelties. C) Exit");   
         switch (option) {
             //option a to register hours
             case "a", "A" -> {
                 String date = JOptionPane.showInputDialog("Type the date in this format: dd-mm-yyyy");
                 double startHour = Double.parseDouble(JOptionPane.showInputDialog("Type the hour in this format hh.mm"));
                 double finalHour = Double.parseDouble(JOptionPane.showInputDialog("Type the hour in this format hh.mm"));
                 double workingTime = finalHour - startHour;
                 if((workingTime + countHours) >= 8 ){
                     JOptionPane.showMessageDialog(null,"Succesful registration. Worked hours: " + (workingTime + countHours) + ". At the date: " + date);
                 }
                 else{
                     JOptionPane.showInputDialog("There are hours left to complete the minimum hours. Missing: " + (8-workingTime) + " hours.");
                     countHours = countHours + workingTime;
                     
                 }
             }
             //option to gonna second menu
             case "b", "B" -> {
                 String option2 = JOptionPane.showInputDialog("Type the option: 1. Licenses. 2. Inabilities. 3. Vacations. 4. Work permits.");
                 //licencies
                 switch (option2) {
                     case "1" -> {
                         String option3 = JOptionPane.showInputDialog("Type the option: 1. Temporal. 2. Motherhood. 3. Factherhood.");
                         
                         if (option3.equals("1")) {
                             int temporalLicency = Integer.parseInt(JOptionPane.showInputDialog("Type the days of license"));
                             
                             if (countLicency - temporalLicency <= 4 && countLicency - temporalLicency >= 0 ) {
                                 JOptionPane.showMessageDialog(null, "Days of license registered succesful. " + "Left days: " + (temporalLicency - countLicency) );
                                 countLicency = countLicency - temporalLicency;
                                 
                             }else
                             {
                                 JOptionPane.showMessageDialog(null, "You reached the limit days of license. Please take vacations");
                                 
                                 
                             }
                             
                         }
                         if (option3.equals("2")) {
                             int motherLicency = Integer.parseInt(JOptionPane.showInputDialog("Type the days of license"));
                             
                             if (countMother - motherLicency <= 180  && countMother - motherLicency >= 0 ) {
                                 JOptionPane.showMessageDialog(null, "Days of license registered succesful. " + "Left days: " + (countMother - motherLicency) );
                                 countMother = countMother - motherLicency;
                                 
                             }else
                             {
                                 JOptionPane.showMessageDialog(null, "You reached the limit days of license. Please take vacations");
                                 
                                 
                             }
                             
                         }
                         if (option3.equals("3")) {
                             int fatherLicency = Integer.parseInt(JOptionPane.showInputDialog("Type the days of license"));
                             
                             if (countFather - fatherLicency <= 15  && countFather - fatherLicency >= 0 ) {
                                 JOptionPane.showMessageDialog(null, "Days of license registered succesful. " + "Left days: " + (countFather - fatherLicency) );
                                 countFather = countFather - fatherLicency;
                                 
                             }else
                             {
                                 JOptionPane.showMessageDialog(null, "You reached the limit days of license. Please take vacations");
                                 
                                 
                             }
                             
                         }
                     }
                     case "2" -> {
                         int incapacities = Integer.parseInt(JOptionPane.showInputDialog("Type the days of inability. 20 days maximum"));
                         if (countIncapacities - incapacities <= 20  && countIncapacities - incapacities >= 0 ){
                             JOptionPane.showMessageDialog(null, "Days of inability registered succesful. " + "left days " + (countIncapacities - incapacities) );
                             countIncapacities = countIncapacities - incapacities;
                             
                         }
                         else{
                             
                             JOptionPane.showMessageDialog(null, "The maximium days are 20. Try again.");
                             
                         }
                     }
                     case "3" -> {
                         int vacations = Integer.parseInt(JOptionPane.showInputDialog("Type the days of vacations"));
                         if (countVacation - vacations <= 15  && countVacation - vacations >= 0 ){
                             JOptionPane.showMessageDialog(null, "Days of vocations registered succesful. " + "left days " + (countVacation - vacations));
                             countVacation = countVacation - vacations;
                             
                         }
                         else{
                             
                             JOptionPane.showMessageDialog(null, "The maximium days are 15. Try again ");
                             
                         }
                     }
                     case "4" ->{
                         int permisions = Integer.parseInt(JOptionPane.showInputDialog("Type the requested hours for work permits"));
                         if (permisions <= 5 && permisions >= 1 ){
                             JOptionPane.showMessageDialog(null, "Work permits hours registered sucecesful. " + "Total requested hours: " + permisions);
                             
                         }
                         else{
                             
                             JOptionPane.showMessageDialog(null, "The maximium days are 5. Please ask for a temporal requested or vacations. ");
                             
                         }
                         
                         
                     }
                     default -> {
                     }
                 }
             }
             case "c", "C" -> repeat = false;
             default -> {
             }
         }
            
            
            }
            
            
     }
     
        
    
    }
    
    
