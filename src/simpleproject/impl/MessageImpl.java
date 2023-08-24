package simpleproject.impl;

import simpleproject.interfaces.IMessage;

public class MessageImpl{
	IMessage iMessage = ()->{
		System.out.println("Haciendo uso de una Interfaz funcional...");
	};
}
