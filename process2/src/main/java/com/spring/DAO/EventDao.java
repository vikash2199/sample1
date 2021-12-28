package com.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.Model.Event;

public class EventDao {
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  

	
	public int save(Event p){  
	    String sql="insert into event(EventName,OrganiserName,Date,Fare) values('  "+p.geteventName()+"','"+p.geteventOrganiserName()+"','"+p.getonDay()+"','"+p.geteventFare()+"')  ";  
	    return template.update(sql);  
	}  
	public int update(Event p){  
	    String sql=" update event set EventName='"+p.geteventName()+"', OrganiserName='"+p.geteventOrganiserName()+"',Date='"+p.getonDay()+"', Fare='"+p.geteventFare()+"' where Id='"+p.getid()+"' ";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from event where Id="+id+"";  
	    return template.update(sql);  
	}  
	public Event getEventById(int id){  
	    String sql="select Id as id,EventName as eventName,OrganiserName as eventOrganiserName,Date as onDay,Fare as eventFare from event where Id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Event>(Event.class));  
	}  
	public List<Event> getEvents(){  
		String sql="select * from event";
	    return template.query(sql,new RowMapper<Event>(){  
	        public Event mapRow(ResultSet rs, int row) throws SQLException {  
	            Event e=new Event();  
	            e.setid(rs.getInt("id"));  
	            e.seteventName(rs.getString("EventName"));  
	            e.seteventOrganiserName(rs.getString("OrganiserName"));  
	            e.setonDay(rs.getString("Date")); 
	            e.seteventFare(rs.getInt("Fare"));
	            return e;  
	        }  
	    });  
	}  

}

