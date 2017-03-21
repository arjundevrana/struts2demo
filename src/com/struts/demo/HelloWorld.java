package com.struts.demo;
import com.opensymphony.xwork2.ActionSupport;
public class HelloWorld extends ActionSupport {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = -5401706618084171778L;
	public static final String MESSAGE = "Struts is up and running ...";
 
    public String execute() throws Exception {
        setMessage(MESSAGE);
        System.out.println("This time is Action time.....");
        return SUCCESS;
    }
 
    private String message;
 
    public void setMessage(String message){
        this.message = message;
    }
 
    public String getMessage() {
        return message;
    }
}