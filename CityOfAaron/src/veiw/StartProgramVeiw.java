
package view;

import java.util.Scanner;
import veiw.NewGameView;

/**
 *
 * @author kanderson
 */
public class StartProgramVeiw {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public StartProgramVeiw() {
        
        message = "Welcome to the city of Aaron. You have been summonded here by the Priest to assume\n"
                + " your role as ruler of the city. Your responsibility is to buy and sell land, determine how much\n "
                + "wheat to plant each year and how much to set aside to feed the people. In addition, it will be \n"
                + "your job to pay an annual tithe on the wheat that is harvested. If you fail to provide enough \n"
                + "wheat for the people, people will starve, some people will die, and your workforce will be diminished. \n"
                + "Plan carefully. And Oh, there is always a danger of rats eating your wheat..\n";
                      
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
        
        inputs[0] = getUserInput("What would you like to do? Enter 'N' for a New Game. Enter 'L' to Load a saved game. Enter 'H' to access the Help Menu. Enter 'Q' to Quit.", true);
        
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
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        switch (inputs[0].trim().toUpperCase()) {
          case "N":
            startNewGame();
            break;
          case "L":
            loadSavedGame();
            break;
          case "H":
              helpMenu();
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
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
     private void startNewGame(){
       NewGameVeiw view = new NewGameView();
       veiw.displayVeiw();
    }
    
    private void helpMenu(){
       System.out.println("helpMenu() called. Jeremy is doing that this week.");
    }
    
    private void loadSavedGame(){
       System.out.println("loadSavedGame() called. coming soon");
    }
    
}
