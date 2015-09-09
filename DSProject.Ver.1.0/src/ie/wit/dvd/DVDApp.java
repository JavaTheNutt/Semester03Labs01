package ie.wit.dvd;

public class DVDApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int option;

	    DVDManager manager = new DVDManager();

	    do {
	        option = manager.menuMain();

	        switch(option)
	            {
	            case 1 : manager.menuAddDvd();
	                     break;
	            case 2 : manager.menuPlayDvd();
	                     break;
	            case 3 : manager.menuListDvds();
	                     break; 
	            case 4 : break; 
	            default : break;
	            }
	        } while(option != 4);

	}

}
