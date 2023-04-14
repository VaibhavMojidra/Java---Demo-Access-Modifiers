import Pkg.Building;
import Pkg.Car;
import Pkg.Human;

public class Demo {

	public static void main(String[] args) {
		
		//For Public
		
		System.out.println("This is public hence can be accessible from anywhere");
		System.out.println("Car class : carName variable= "+new Car().carName);
		System.out.println("Car class : carName using getCarName() method = "+new Car().getCarName());
		
		
		//For Private
		
//		System.out.println("This is private hence cannot be accessible other than in its own class");
//		System.out.println("Building class : buildingRegistrationNumber variable= "+new Building().buildingRegistrationNumber);
		
		
		//For Protected
//		System.out.println("This is protected hence cannot be accessible outside the package directly");
//		System.out.println("Human class : name variable= "+new Human().name);
		System.out.println("This is protected hence cannot be accessible outside the package directly but can be accessible if inherited");
		System.out.println("Also protected members can be accessed in same package like in this case its rollNo");
		System.out.println("Building class : name variable= "+new Employee().getName());
		System.out.println("Building class : rollNo variable= "+new Employee().getRollNo());
	}

}
