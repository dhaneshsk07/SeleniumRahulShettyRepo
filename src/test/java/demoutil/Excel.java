package demoutil;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import ExtraUtil.TestConfig;

public class Excel {

    private String username;
    private String password;
    private String excelFilePath;
    
    private List<String[]> credentialsList; //added on 23-06
    

    public Excel(String excelFilePath) {
        this.excelFilePath = excelFilePath;
        this.credentialsList = new ArrayList<>();
    }

    public void readCredentials() {
    	
    	
    	TestConfig sc=new TestConfig();	
    	
    	
    	excelFilePath= (sc.TEST_DATA_EXCEL_PATH);
    	
        FileInputStream fis = null;
        Workbook workbook = null;

        try {
            // Initialize FileInputStream and Workbook objects
            fis = new FileInputStream(new File(excelFilePath));
            workbook = WorkbookFactory.create(fis);

            // Get the first sheet of the Excel file
            Sheet sheet = workbook.getSheetAt(0); // Assuming credentials are in the first sheet

            // Iterate through each row of the sheet
            for (Row row : sheet) {
            	
            	String[] credentials = new String[2]; //added on 23-06
            	
                // Read username and password from cells
               // username = row.getCell(2).getStringCellValue(); // Assuming username is in the first column
                //password = row.getCell(3).getStringCellValue(); // Assuming password is in the second column
                
                
                credentials[0] = row.getCell(0).getStringCellValue(); // Username
                credentials[1] = row.getCell(1).getStringCellValue(); // Password

                credentialsList.add(credentials); //added on 23-06 
                
                // Print or store credentials (for testing purposes)
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the FileInputStream and Workbook objects
                if (fis != null) {
                    fis.close();
                }
                if (workbook != null) {
                    workbook.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    //list the username & password (multiple user testing // added on 23-06
    public List<String[]> getCredentialsList() {
        return credentialsList;
    }

    // Getter methods for username and password
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

