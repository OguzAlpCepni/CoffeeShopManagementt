import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
	     BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
	       
	        customerManager.save(new Customer(1,"Ali Furkan","erg?ven",1997,"11111111111"));
	}

}
