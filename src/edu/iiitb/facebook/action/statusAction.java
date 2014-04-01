package edu.iiitb.facebook.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import edu.iiitb.facebook.model.statusModel;

public class statusAction {
	//int profileId=1;
	private String status;
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String updateStatus(){
		//session changes
				HttpSession session = ServletActionContext.getRequest().getSession(
						false);
				if (session == null || session.getAttribute("login") == null) {
					return "login";
				} else {
					// System.out.println("inside else");
					int profileid = (Integer) session.getAttribute("profileId");
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		statusModel.addStatus(status,timeStamp,profileid);
		return "success";
				}
	}
	
	public String tempReturnSuccess(){
		return "success";
	}

}
