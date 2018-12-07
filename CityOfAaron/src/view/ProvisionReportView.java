package view;

import cityofaaron.CityOfAaron;
import Exceptions.GameControlException;
import java.io.*;
import model.InventoryItem;

/**
 *
 * @author chelseawaite
 */
public class ProvisionReportView extends ViewBase {

    public ProvisionReportView() {
    }

    @Override
    protected String getMessage() {
        return "Send Provision Report to file:\n";
    }

    
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter the name you would like the report to be saved as\n"
                + "or press Enter to return to the Reports Menu", true);
        return inputs;
    }

    
    @Override
    public boolean doAction(String[] inputs) {

        try {
            if (inputs[0] == null || inputs[0].equals("")) {
                throw new GameControlException("No file name entered so sending you back to the Reports Menu...");
            }
            String fileName = inputs[0];
            writeReport(fileName);
            this.console.println("Provision Report saved as " + fileName);

        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        }
        return false;
    }

    private void writeReport(String fileName) {

        InventoryItem[] provisions = CityOfAaron.getCurrentGame().getTheStorehouse().getProvisions();

        try (PrintWriter report = new PrintWriter(new FileWriter(fileName))) {
            report.println("Provision Report");
            report.println();

            String formatString = "%-10s %-10s %10s";
            report.println(String.format(formatString, "Quantity", "Provision Name", "Condition"));

            for (InventoryItem provision : provisions) {
                report.println(String.format(formatString, provision.getquantity(), provision.getname(),
                        provision.getcondition()));
            }
            report.println();

            report.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
