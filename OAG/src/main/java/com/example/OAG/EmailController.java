package com.example.OAG;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/email")
public class EmailController 
{
	@Autowired
	EmailManager em;
	@GetMapping("/send")
	public String send()
	{
		String frommail="prudhviponnuru@gmail.com";
		String toemail="2100030443cseh@gmail.com";
		String subject="welcome to emailing";
		String text="Hello hai,This is amil from prudhviponnuru to 210030443cseh";
		 em.sendEmail(frommail, toemail, subject, text);
		 return "register";
	}

}
