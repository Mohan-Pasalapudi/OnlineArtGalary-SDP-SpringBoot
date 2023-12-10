package com.example.OAG;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GalleryController {

    // Route function for the home page
    @GetMapping("/index")
    public String index() {
        return "index"; // This will return a view named "home.jsp" or "home.html" in your "src/main/resources/templates" folder
    }
    @GetMapping("/products.html")
    public String products() {
        return "products"; // This will return a view named "home.jsp" or "home.html" in your "src/main/resources/templates" folder
    }
    
    @GetMapping("/card.html")
    public String card() {
        return "card"; // This will return a view named "home.jsp" or "home.html" in your "src/main/resources/templates" folder
    }
    
    @GetMapping("/events")
    public String events() {
        return "events"; // Render the events.jsp template
    }

    @GetMapping("/art.html")
    public String art() {
        return "art"; // Render the events.jsp template
    }
    @GetMapping("/paint.html")
    public String paint() {
        return "paint"; // Render the events.jsp template
    }
    @GetMapping("/photo1.html")
    public String photo1() {
        return "photo1"; // Render the events.jsp template
    }
    @GetMapping("/suc.html")
    public String suc() {
        return "suc"; // Render the events.jsp template
    }
    @GetMapping("/text.html")
    public String text() {
        return "text"; // Render the events.jsp template
    }
    
    @GetMapping("/mm.html")
    public String mm() {
        return "mm"; // Render the events.jsp template
    }
    
    @GetMapping("/artworks")
    public String artworks() {
        return "artworks"; // Render the artworks.jsp template
    }

    @GetMapping("/artists")
    public String artists() {
        return "artists"; // Render the artists.jsp template
    }

    
    @GetMapping("/Pricing")
    public String pricing() {
        return "Pricing"; // Render the artists.jsp template
    }
//    @GetMapping("/form")
//    public String login() {
//        return "form"; // Render the login.jsp template
//    }

//    @GetMapping("/signup")
//    public String signup() {
//        return "signup"; // Render the signup.jsp template
//    }
    // You can define more route functions for other pages (e.g., events, artworks, artists, login, signup) here
    
    
    
    StudentDAOClass sdc;


	@Autowired
	public GalleryController(com.example.OAG.StudentDAOClass sdc) {
		super();
		this.sdc = sdc;
	}
	
public GalleryController() {
		super();
	}
	//	@GetMapping("/form") 
//	public String form(Model model){
//		model.addAttribute("Stud1", new Student());
//	return "form";
//	}
	@GetMapping("/form") 
	public String form(Model m)
	{
		//m.addAttribute("command", new Student());
	return "form";
	}
	@GetMapping("/map.html") 
	public String map()
	{
		//m.addAttribute("command", new Student());
	return "map.html";
	}
	
	@PostMapping("/save1") 
	//@ResponseBody
	public String Login(@ModelAttribute("stud3") Student stud3)
	{
		
	//return "Login";
		Integer id=stud3.getId();
		String pass=stud3.getPassword();
		Optional<Student> ss=sdc.findstubyid(id);

		Student s1 = ss.orElse(new Student()); // Provide a default Student object if Optional is empty

		// Now you have the Student object, which will either be the result from findstubyid or the default Student object if Optional is empty

		if(ss!=null && pass.equals(s1.getPassword()) )
		{
			//return "success.jsp";
			return "artworks";
		}
		else
		{
			//return "error.jsp";
			return "failed";
		}
	}
	
	@PostMapping("/save")
	public String register(@ModelAttribute("stud2") Student stud2,Model m)
	{
		sdc.insertStudent(stud2);
		m.addAttribute("command", new Student());
		return"Register.html";
	}
	
	@GetMapping("/show")
	@ResponseBody
	public String check(@ModelAttribute("Stud2") Student stud2)
	{
		return stud2.toString();
	}
}
