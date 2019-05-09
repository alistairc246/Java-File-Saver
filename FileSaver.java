/*
 * Developed By Alistair Clarke
 * Date: May 9th, 2019
 */


import java.util.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class FileSaver {

  // File creator function
  
  public void MakeFile(String file_name, String file_loc, String file_ext) {
  
    // Try Catch Block
    
    try {
      
      // Base Path
      
      StringBuilder base_path = new StringBuilder("C:\\Users/Clarkeinstein/");
      
      String loc = file_loc;
      String dest = "/" + file_name;
      String ext = file_ext;
      
      base_path.append(loc);      
      base_path.append(dest);      
      base_path.append(ext);
      
      // Convert StringBuilder to String
      
      String file_path = base_path.toString();
      
      File file = new File(file_path);
      
      boolean fileChecker = file.createNewFile();
      
      if(fileChecker == true) {
      
        System.out.println("File Saved Successfully!!!");
        
      } else {
      
        System.out.println("File Couldnt Be Saved!!!!");
        
      }
      
    } catch (IOException exe) {
    
      System.out.println("An Unexpected Exception Occurred!!!");
      
      exe.printStackTrace();
    
    }
    
  }
  
  public static void main(String [] args) {
  
    JFrame framer = new JFrame();
    
    // Create an object
  
    FileSaver saver = new FileSaver();
    
    // File saving options
    
    Object[] dest_options = {"Desktop", "Documents", "Downloads"};
    
    // File saving extensions
    
    Object[] ext_options = {
      ".doc",".docx",".pdf", ".txt", ".html", ".cs", ".js", ".java", ".jpg", ".png", ".jpeg", 
      ".java", ".c", ".cpp", ".php", ".py", ".ppt", ".pps", ".xml"};
    
    
    
    // Prompt user for input
    
    String file_name = JOptionPane.showInputDialog(framer, "Save File As:");
    
    Object selectionDestFolder = JOptionPane.showInputDialog(framer, "Choose", "File Destination", JOptionPane.PLAIN_MESSAGE, null, dest_options, dest_options[0]);
    String file_dest = selectionDestFolder.toString();

    Object selectionExtFolder = JOptionPane.showInputDialog(framer, "Choose", "File Extension", JOptionPane.PLAIN_MESSAGE, null, ext_options, ext_options[0]);
    String file_ext = selectionExtFolder.toString();
    
    // Call function
    
    saver.MakeFile(file_name, file_dest, file_ext);
    
    
  }
}