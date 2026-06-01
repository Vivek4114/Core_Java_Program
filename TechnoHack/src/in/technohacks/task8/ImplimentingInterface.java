package in.technohacks.task8;

public class ImplimentingInterface implements InterfaceA{

	@Override
	public void display() {
		System.out.println("I Am Calling Interface A");
	}
	public static void main(String[] args) {
		ImplimentingInterface implimentingInterface = new ImplimentingInterface();
		implimentingInterface.display();
	}
}

