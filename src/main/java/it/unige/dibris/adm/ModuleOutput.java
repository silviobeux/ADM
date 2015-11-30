package it.unige.dibris.adm;

//Represent the generic object returned by the TC + ADM

public class ModuleOutput {
	Object[] columnNames;
	Object[][] data;
	String result;
	
	public ModuleOutput(Object[] columnNames, Object[][] data, String result){
		this.columnNames = columnNames;
		this.data = data;
		this.result = result;
	}

	public String getResult() {
		return result;
	}


	public void setResult(String result) {
		this.result = result;
	}


	public Object[] getColumnNames() {
		return columnNames;
	}

	public void setColumnNames(Object[] columnNames) {
		this.columnNames = columnNames;
	}

	public Object[][] getData() {
		return data;
	}

	public void setData(Object[][] data) {
		this.data = data;
	}
}
