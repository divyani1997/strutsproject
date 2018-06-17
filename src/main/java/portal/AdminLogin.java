package portal;
 
//import java.util.Map;  
//import org.apache.struts2.dispatcher.SessionMap;  
//import org.apache.struts2.interceptor.SessionAware;  
import com.opensymphony.xwork2.ActionSupport;

public class AdminLogin extends ActionSupport{  
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private String username,userpass;  
  
public String getUsername() {  
    return username;  
}  
  
public void setUsername(String username) {  
    this.username = username;  
}  
  
public String getUserpass() {  
    return userpass;  
}  
  
public void setUserpass(String userpass) {  
    this.userpass = userpass;  
}  
  
public String execute(){  
    if("admin".equals(username) && "admin".equals(userpass)){  
        return "success";  
    }  
    else{  
        return "error";  
    }  
}  

  
/*public void setSession(Map<String, Object> map) {  
    sessionmap=(SessionMap<String, String>)map;  
    sessionmap.put("login","true");  
}  */
  
/*public String logout(){  
    sessionmap.invalidate();  
    return "success";  
} */ 
  
}  
