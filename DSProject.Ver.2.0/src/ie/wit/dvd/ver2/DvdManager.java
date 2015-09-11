package ie.wit.dvd.ver2;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DvdManager 
{
	private static Icon myIcon = new ImageIcon("..\\DSProject.Ver.1.0\\images\\logosmall.gif");
	private static Icon anIcon = new ImageIcon();
	private static int currentSize = 0, maxSize = 5;

	private Dvd[] DeviceList = new Dvd[maxSize];

	///////////////////////////////////////////////////////////////////
	public DvdManager()
	{
	Dvd aDVD = new Dvd(101,"Batman",9.99);
	DeviceList[currentSize] = aDVD;
	currentSize++;
	}
	////////////////////////////////////////////////////////////////// 

	public int menuMain()
	{
	int option = 0;

	String opt1 = new String("1. Add a DVD :");
	String opt2 = new String("2. Play a DVD :");
	String opt3 = new String("3. List All DVDs :");
	String opt4 = new String("4. Exit :");
	String msg = new String("Enter Option:");
	JTextField opt = new JTextField("");

	Object message[] = new Object[7];

	message[0] = myIcon;
	message[1] = opt1;
	message[2] = opt2;
	message[3] = opt3;
	message[4] = opt4;
	message[5] = msg;
	message[6] = opt;

	int response = JOptionPane.showConfirmDialog(null,message,"DVD Data Entry",JOptionPane.OK_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE ,anIcon);

	    if(response == JOptionPane.CANCEL_OPTION)
	    ;
	    else
	    {
	    try {
	        option = Integer.parseInt( opt.getText());
	        }
	    catch (Exception e)
	        {
	        JOptionPane.showMessageDialog(null,"Data Input Error" + e + "\nPlease Try Again");
	        }
	    }
	    return option;
	 } 
	///////////////////////////////////////////////////////////////
	public void menuAddDvd()
	{
	int option;
	
	int tempId;
	String tempTitle;
	String msgID = new String("DVD ID :");
	String msgName = new String("DVD Name :");
	String msgPrice = new String("DVD Price :");
	JTextField id = new JTextField("");
	JTextField name = new JTextField("");
	JTextField price = new JTextField("");

	Object message[] = new Object[7];

	message[0] = myIcon;
	message[1] = msgID;
	message[2] = id;
	message[3] = msgName;
	message[4] = name;
	message[5] = msgPrice;
	message[6] = price;

	int response = JOptionPane.showConfirmDialog(null,message,"DVD Data Entry",JOptionPane.OK_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE ,anIcon);

	    if(response == JOptionPane.CANCEL_OPTION)
	    ;
	    else{
	    	try {
	    		option = Integer.parseInt(price.getText());
	    		tempId = Integer.parseInt(id.getText());
	    		tempTitle = name.getText();
	    		Dvd tempDvd = new Dvd(tempId, tempTitle, option);
	    		DeviceList[currentSize] = tempDvd;
	    		currentSize++;
	    		
	    	}
	    	catch (Exception e)
	    	{
	    		JOptionPane.showMessageDialog(null,"Data Input Error" + e + "\nPlease Try Again");
	    	}
	    }
	}


	//////////////////////////////////////////////////////////////////
	public void menuPlayDvd()
	{
		
		int idSelected;
		int tempId;
		
		System.out.println("Please enter the id of the dvd to be played");
		idSelected = EasyScanner.nextInt();

		for(int i = 0; i < currentSize; i++){
			tempId = DeviceList[i].getId();
			if(tempId == idSelected){
				System.out.println(DeviceList[i].play());
			} else {
				System.out.println("404, dvd not found");
			}
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////
	public void menuListDvds()
	{
		for(int i = 0; i < currentSize; i++){
			System.out.println(DeviceList[i].toString() + "\n\n");
		}
		
	}
}
