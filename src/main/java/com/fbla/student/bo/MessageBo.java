package com.fbla.student.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fbla.student.dal.MessageDAO;
import com.fbla.student.model.Message;

@Component
public class MessageBo {
	
	@Autowired
	private MessageDAO messagedao;
	
	public String sendMessage(Message message) {
		return messagedao.sendMessage(message);
	}
	
	public List<Message> getMessages(int userId){
		return messagedao.getMessages(userId);
	}
	
	public List<Message> getSentMessages(int userId){
		List<Message> messages = messagedao.getSentMessages(userId);
		return messages;
	}
}
