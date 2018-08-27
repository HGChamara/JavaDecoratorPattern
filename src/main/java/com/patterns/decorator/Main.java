package com.patterns.decorator;

import com.patterns.decorator.server.ColoredMessageService;
import com.patterns.decorator.server.EmailMessageServer;
import com.patterns.decorator.server.MessageServer;
import com.patterns.decorator.server.SmsMessageServer;
import com.patterns.decorator.server.TextColor;
import com.patterns.decorator.server.TextSize;
import com.patterns.decorator.server.TextSizeMessageServer;

public class Main 
{
    public static void main( String[] args )
    {
        MessageServer emailServer = new EmailMessageServer();
        MessageServer smsServer = new SmsMessageServer();
        
        emailServer.sendMessage();
        smsServer.sendMessage();
        
        System.out.println();
        System.out.println("Message server with modified text color");
        MessageServer coloredMessageService = new ColoredMessageService(smsServer, TextColor.BLACK);
        coloredMessageService.sendMessage();
        coloredMessageService.receiveMessage();
        coloredMessageService.description();
        
        System.out.println();
        System.out.println("Message server with modified text size");
        MessageServer textSizeMessageService = new TextSizeMessageServer(emailServer, TextSize.LARGE);
        textSizeMessageService.sendMessage();
        textSizeMessageService.receiveMessage();
        textSizeMessageService.description();
    }
}
