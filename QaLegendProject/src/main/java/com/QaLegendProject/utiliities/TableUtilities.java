package com.QaLegendProject.utiliities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableUtilities {
	public static List<ArrayList<String>>
	get_Dynamic_TwoDimension_TablElemnts(List<WebElement> rowItems, List<WebElement> columnItems) {
	    int rSize = rowItems.size() - 1;
	    int colnmSize = columnItems.size();
	    String[] columnList = new String[colnmSize / rSize];

	    List<ArrayList<String>> gridData = new ArrayList<ArrayList<String>>();
	    int x = 0;
	    for (int i = 0; i < rSize; i++) {
	        for (int j = 0; j < columnList.length; j++) {
	            columnList[j] = columnItems.get(x).getText();
	            x++;
	        }
	        gridData.add(new ArrayList<String>(Arrays.asList(columnList)));
	    }
	    return gridData;
	}
	public static boolean
	checkTableElement(List<WebElement> rowItems, List<WebElement> columnItems,String checkText,String tagName) {
		boolean checkTableElement = false;
		for(int i=0;i<rowItems.size();i++)
		  {
			  List<WebElement>currentRow=rowItems.get(i).findElements(By.tagName(tagName));
			  for(int j=0;j<columnItems.size();j++)
			  {
				  String tableText=currentRow.get(j).getText();
				  if(tableText.equals(checkText))
				  {
					  checkTableElement =true;
					  break;
				  }
					  
			  }
			 
			  
			  
		  }
		 return checkTableElement;
	}

}
