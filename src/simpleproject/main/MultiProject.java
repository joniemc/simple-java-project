package simpleproject.main;
import simpleproject.modules.Message;
import simpleproject.interfaces.IMessage;
import simpleproject.impl.MessageImpl;
public class MultiProject {
	public static void main(String []Args) {
		sendToMessage();
		sendToMessageFromInterface();
	}
	
	public static void sendToMessage() {
		Message message = new Message();
		message.sendMessage();
	}
	
	public static void sendToMessageFromInterface() {
		IMessage iMessage = ()->{
			System.out.println("Haciendo uso de una Interfaz funcional...");
		};
		
		iMessage.sendMessge();
	}
}
