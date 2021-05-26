package application;

public class Helper {

	 public static boolean isNumeric(String cadena){
	        System.out.println("cadena "+ cadena);
		try {
	            Long.parseLong(cadena);
	            //Integer.parseInt(cadena);
	        System.out.println("yes "+ cadena);
	            return true;
		} catch (NumberFormatException nfe){
	        System.out.println("err "+ cadena);
	            return false;
		}
	    }

}
