package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProv {

	@DataProvider(name="InvalidDataRegistration")
	public static Object[][] InvalidDataRegistration() throws IOException {
		
		ExcelUtils Eu = new ExcelUtils(System.getProperty("user.dir")+"\\testData\\DataForLuma.xlsx");
		String sheetName ="InvalidDataRegistration";
		Eu.getRowCount(sheetName);
		int MaxRow = Eu.getRowCount(sheetName);
		Object tab[][] = new Object[MaxRow][];
		for(int i = 1 ;i<= MaxRow; i++) {
			
			int MaxCell = Eu.getCellCount(sheetName, i);
			
			Object[] tab2 = new Object[MaxCell];
			
			for(int j = 0 ;j< MaxCell; j++) {
				
				tab2[j] = Eu.getCellData(sheetName, i, j);
				
			}
			
			tab[i-1] = tab2;
			
		}
	return tab;
		
	}
	
	@DataProvider(name = "DataLogin")
	public static Object[][] DataLogin() throws IOException{
		ExcelUtils Eu = new ExcelUtils(System.getProperty("user.dir")+"\\testData\\DataForLuma.xlsx");
		String sheet = "InvalidDataLogin";
		int MaxRow = Eu.getRowCount(sheet);
		int MaxCell = Eu.getCellCount(sheet, 1);
		Object [][] tab = new Object[MaxRow][MaxCell];
		
		for(int i = 1 ; i<= MaxRow; i++) {
			
			for(int j = 0 ;j<MaxCell ; j++) {
				
				tab[i-1][j] = Eu.getCellData(sheet, i, j);
				
			}
			
			
		}
		
		
		
		return tab;
		
	}
	
	@DataProvider(name = "AmountToCart")
	public static Object[][] AmountToCart() throws IOException{
		ExcelUtils Eu = new ExcelUtils(System.getProperty("user.dir")+"\\testData\\DataForLuma.xlsx");
		String sheet = "DataAmountProduct";
		int MaxRow = Eu.getRowCount(sheet);
		int MaxCell = Eu.getCellCount(sheet, 1);
		Object [][] tab = new Object[MaxRow][MaxCell];
		
		for(int i = 1 ; i<= MaxRow; i++) {
			
			for(int j = 0 ;j<MaxCell ; j++) {
				
				tab[i-1][j] = Eu.getCellData(sheet, i, j);
				
			}
			
			
		}
		
		
		
		return tab;
		
	}
	
	
	@DataProvider(name="InvalidDataWriteComment")
	public static Object[][] InvalidDataWriteComment() throws IOException {
		
		ExcelUtils Eu = new ExcelUtils(System.getProperty("user.dir")+"\\testData\\DataForLuma.xlsx");
		String sheet = "InvalidDataWriteComment";
		int MaxRow = Eu.getRowCount(sheet);
		int MaxCell = Eu.getCellCount(sheet, 1);
		Object [][] tab = new Object[MaxRow][MaxCell];
		
		for(int i = 1 ; i<= MaxRow; i++) {
					
			for(int j = 0 ;j<MaxCell ; j++) {
						
				tab[i-1][j] = Eu.getCellData(sheet, i, j);
						
			}
					
					
		}
		
		return tab;
		
	}
	
	@DataProvider(name = "DataAdvanceSearch")
	public static Object[][] DataAdvanceSearch() throws IOException{
		ExcelUtils Eu = new ExcelUtils(System.getProperty("user.dir")+"\\testData\\DataForLuma.xlsx");
		String sheet = "DataAdvanceSearch";
		int MaxRow = Eu.getRowCount(sheet);
		int MaxCell = Eu.getCellCount(sheet, 1);
		Object [][] tab = new Object[MaxRow][MaxCell];
		
		for(int i = 1 ; i<= MaxRow; i++) {
			
			for(int j = 0 ;j<MaxCell ; j++) {
				
				tab[i-1][j] = Eu.getCellData(sheet, i, j);
				
			}
			
			
		}
		
		
		
		return tab;
		
	
	}

	
	@DataProvider(name="DataContact")
	public static Object[][] DataContact() throws IOException {
		
		ExcelUtils Eu = new ExcelUtils(System.getProperty("user.dir")+"\\testData\\DataForLuma.xlsx");
		String sheet = "DataContact";
		int MaxRow = Eu.getRowCount(sheet);
		int MaxCell = Eu.getCellCount(sheet, 1);
		Object [][] tab = new Object[MaxRow][MaxCell];
		
		for(int i = 1 ; i<= MaxRow; i++) {
			
			for(int j = 0 ;j<MaxCell ; j++) {
				
				tab[i-1][j] = Eu.getCellData(sheet, i, j);
				
			}
			
			
		}
		
		return tab;
	
	}
	
	
	@DataProvider(name="DataToMailBoxSubscribe")
	public static Object[][] DataToMailBoxSubscribe() throws IOException{
		ExcelUtils Eu = new ExcelUtils(System.getProperty("user.dir")+"\\testData\\DataForLuma.xlsx");
		String sheet = "DataToMailBoxSubscribe";
		int MaxRow = Eu.getRowCount(sheet);//8
		int MaxCell = Eu.getCellCount(sheet, 1);//2
		
		Object [][] tab = new Object[MaxRow][MaxCell];
		for(int i = 1 ;i<=MaxRow ; i++) {
			
			for(int j = 0 ;j<MaxCell ; j++) {
				
				tab[i-1][j] = Eu.getCellData(sheet, i, j);
				
				
			}
			
			
		}
		
		
		return tab;
	}

	@DataProvider(name="InvalidDataEditAccountInfo")
	public static Object[][] InvalidDataEditAccountInfo() throws IOException{
		ExcelUtils Eu = new ExcelUtils(System.getProperty("user.dir")+"\\testData\\DataForLuma.xlsx");
		String sheet = "InvalidDataEditAccountInfo";
		int MaxRow = Eu.getRowCount(sheet);
		int MaxCell = Eu.getCellCount(sheet, 1);
		Object [][] tab = new Object[MaxRow][MaxCell];
		for(int i = 1 ;i<=MaxRow ; i++) {
			
			for(int j = 0 ;j<MaxCell ; j++) {
				
				tab[i-1][j] = Eu.getCellData(sheet, i, j);
				
				
			}
			
			
		}
		
		
		return tab;
	}
}



