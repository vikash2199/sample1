package com.spring.controler;   
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model.*;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.DAO.EventDao;
import com.spring.Model.Event;


@Controller  
public class EventControler {  
    @Autowired  
    EventDao dao;//will inject dao from xml file  
      
    /*It displays a form to input data, here "command" is a reserved request attribute 
     *which is used to display object data into form 
     */  
    @RequestMapping("/form")  
    public String showform(Model m){  
    	m.addAttribute("command", new Event());
    	return "Form"; 
    }  
   
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("emp") Event eve){  
      	
    	dao.save(eve);  
        return "redirect:/display";
    }  
    /* It provides list of employees in model object */  
    @RequestMapping("/display")  
    public String viewemp(Model m){  
        List<Event> list=dao.getEvents();  
        m.addAttribute("list",list);
        return "Display";  
    }  
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editemp/{id}")  
    public String edit(@PathVariable int id, Model m){  
        Event eve=dao.getEventById(id);  
        m.addAttribute("command",eve);
        return "Edit";  
    }  
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("eve") Event eve){  
        dao.update(eve);  
        return "redirect:/display";  
    }  
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        dao.delete(id);  
        return "redirect:/display";  
    }   
} 
