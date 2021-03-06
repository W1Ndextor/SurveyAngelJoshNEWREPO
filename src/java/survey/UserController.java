
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


/**
 *
 * @author Angel
 */
@Named(value = "userController")
@SessionScoped
public class UserController implements Serializable {

    
    String UserFname = null;
    String UserLname=null;
    String UserEmail=null;
    String response=null;
    int userID = 0;
    
    // this class uses hibernate to query the user table
    UserHelper helper;
    
    User user;
    
    /**
     * Creates a new instance of UserController
     */
    public UserController() {
        helper = new UserHelper();
    }

    public String getUserFname() {
        return UserFname;
    }

    public void setUserFname(String UserFname) {
        this.UserFname = UserFname;
    }

    public String getUserLname() {
        return UserLname;
    }

    public void setUserLname(String UserLname) {
        this.UserLname = UserLname;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
    
    public void clear(){
        UserEmail=null;
        UserFname=null;
        UserLname=null;
        user=null;
        response=null;
        
    }

    
    public String getResponse() {
        response = null;
        
        if(UserFname != null && UserLname != null && UserEmail != null){
            
            
            user = new User(UserFname, UserLname, UserEmail);
            
            if(helper.insertUser(user) == 1){
                UserFname = null;
                UserLname = null;
                UserEmail = null;
                response = "User Added.";
               // return response;
            }else{
                UserFname = null;
                UserLname = null;
                UserEmail = null;
                response = "User Not Added.";
            }
        } else {
            response = " ";
        }
        
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }   
}
