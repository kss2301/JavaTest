package test;

import util.ConfigLoader;

public class ConfTest {

	private ConfigLoader confInstance = null;

	public ConfTest() {
		try {
			confInstance = ConfigLoader.getInstance();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfTest test = new ConfTest();
		
		test.printInfo("VERSION");

	}
	
	public void printInfo(String key) {
		
		System.out.println(confInstance.getCommonMapValue(key));
	}

}
