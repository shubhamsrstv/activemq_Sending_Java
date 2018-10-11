package com.example.activemqSending;

import java.util.Scanner;

import javax.jms.JMSException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivemqSendingApplication 
{
	public static void main(String[] args) throws JMSException 
	{
		System.out.println("Enter your message");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();
		
		JMSMessageSender sender = new JMSMessageSender();
		System.out.println("Message send to queue is : "+sender.send(text));
	}
}
