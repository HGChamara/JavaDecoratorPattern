package com.patterns.decorator.server;

public class SmsMessageServer implements MessageServer
{
	public void sendMessage() 
	{
		System.out.println("Sending SMS message...");
	}

	public void receiveMessage() 
	{
		System.out.println("Receiving SMS message");
	}

	public boolean isRunning() 
	{
		return true;
	}

	public String description() 
	{
		return "SMS message server";
	}

}
