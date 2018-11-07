
package view;

import java.util.Scanner;

/**
 *
 * @author DIDIM
 */

//The Game Menu View controls the play of the game.
public class GameMenuView {
     protected String message;
        /**
     * Constructor
     */
    public GameMenuView(){
        
        message = "GameMenu\n"
                + "-------------\n"
                + "V - View the Map\n"
                + "N - Move to a New Location\n"
                + "C - Manage the Crops\n"
                + "L - Live the year\n"
                + "R - Reports Menu\n"
                + "S - Save the Game\n"
                + "M - Return to the Main Menu\n"
                + "Q - Quit the Game";
     }
       
       /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
       
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
         
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("What would you like to do? Enter a Letter.");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        
        return inputs;
    }
     
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
              
        switch (inputs[0].trim().toUpperCase()) {
          case "V":
            ViewTheMapView();
            break;
          case "N":
            MoveToNewLocation();
            break;
          case "C":
              ManageTheCropsView();
              break;
          case "L":
              LiveTheYear();
              break;
          case "R":
              ReportsMenuView();
              break;
          case "S":
              SaveTheMenu();
              break;
          case "M":
              MainMenuView();
              break;
          case "Q":
            System.out.println("Thank you for playing. Bye.");
            return false;
       }
        return true;
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
      private void MainMenuView() {
       MainMenuView view = new MainMenuView();
       view.displayView();
    }
        private void SaveTheMenu() {
        System.out.println("Save the Menu coming soon.");
    }

    private void ReportsMenuView() {
        ReportsMenuView view= new ReportsMenuView();
        view.displayView();
    }

    private void ManageTheCropsView() {
        ManageTheCropsView view = new ManageTheCropsView();
        view.displayView();
    }

    private void LiveTheYear() {
        LiveTheYearView view = new LiveTheYearView();
        view.displayView();
    }

    private void MoveToNewLocation() {
        System.out.println("Move to New Location coming soon.");
    }

    private void ViewTheMapView() {
        ViewTheMapView view = new ViewTheMapView();
         view.displayView();
    }

   
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private boolean someActionHandler(){
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need 
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        
        return true;
    }

  
  
}
