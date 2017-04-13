
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


/**
 *
 * @author Angel
 */
@Named(value = "respondentController")
@SessionScoped
public class respondentController implements Serializable {

    String respondentEmail;
    String respondentEmail1;
    String respondentEmail2;
    String respondentEmail3;
    String respondentEmail4;
    String response;
    
    int surveyId;
    int respondentId;
    int surveyIdArg;
    int userIdArd;
    int userID;
    
    respondentHelper helper;
    
    Respondent respondent;
    Survey survey;
    
    String emailAddress;
    
    
    public respondentController() {
        helper = new respondentHelper();        
    }

    public String getRespondentEmail() {
        return respondentEmail;
    }

    public void setRespondentEmail(String respondentEmail) {
        this.respondentEmail = respondentEmail;
    }

    public String getRespondentEmail1() {
        return respondentEmail1;
    }

    public void setRespondentEmail1(String respondentEmail1) {
        this.respondentEmail1 = respondentEmail1;
    }

    public String getRespondentEmail2() {
        return respondentEmail2;
    }

    public void setRespondentEmail2(String respondentEmail2) {
        this.respondentEmail2 = respondentEmail2;
    }   

    public String getRespondentEmail3() {
        return respondentEmail3;
    }

    public void setRespondentEmail3(String respondentEmail3) {
        this.respondentEmail3 = respondentEmail3;
    }

    public String getRespondentEmail4() {
        return respondentEmail4;
    }

    public void setRespondentEmail4(String respondentEmail4) {
        this.respondentEmail4 = respondentEmail4;
    }

    
    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
    
     public String getSurveyIds(int surveyIdArg, int userIdArg){
        surveyId = surveyIdArg;
        userID = userIdArg;
        return "respondent";
    }
   
    public int getRespondentId() {
        return respondentId;
    }

    public void setRespondentId(int respondentId) {
        this.respondentId = respondentId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    
    
    //heres a second demo for pushing
    
    public void dropItHard() {
      
    respondentEmail=null;
    respondentEmail1=null;
    respondentEmail2=null;
    respondentEmail3=null;
    respondentEmail4=null;
    response=null;
    
    surveyId=getSurveyId();
    respondentId=0;
    //surveyIdArg=0;
    
    helper=null;
    
    respondent=null;
    survey=null;
    
    emailAddress=null;
    

    }
    

    public String getResponse() {
        
        response = null;
        
        if(respondentEmail != null  && !respondentEmail.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
            if(helper.insert(respondentEmail, surveyId)== 1){
                respondentEmail = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "A Respondent Was Added.";
            }else{
                respondentEmail = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "A Respondent Was Not Added.";
            }
        }
        
        if(respondentEmail1 != null && !respondentEmail1.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            

            if(helper.insert(respondentEmail1, surveyId)== 1){
                respondentEmail1 = null;                
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Two Respondents Were Added.";
            }else{
                respondentEmail1 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Two Respondents Were Not Added.";
            }
        }    
        
        if(respondentEmail2 != null && !respondentEmail2.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
 
            if(helper.insert(respondentEmail2, surveyId)== 1){
                respondentEmail2 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Three Respondents Were Added.";
            }else{
                respondentEmail2 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Three Respondents Were Not Added.";
            }
        }
        
        if(respondentEmail3 != null && !respondentEmail3.isEmpty()){
            
            respondent = new Respondent(respondentEmail);
            
            
            if(helper.insert(respondentEmail3, surveyId)== 1){
                respondentEmail3 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Four Respondents Were Added.";
            }else{
                respondentEmail3 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Four Respondents Were Not Added.";
            }
        } 
        
        if(respondentEmail4 != null && !respondentEmail4.isEmpty()){
    
            respondent = new Respondent(respondentEmail);
            
            
            if(helper.insert(respondentEmail4, surveyId)== 1){
                respondentEmail4 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Five Respondents Were Added.";
            }else{
                respondentEmail4 = null;
                surveyId = getSurveyId();
                userID = getUserID();
                response = "Five Respondents Were Not Added.";
            }
        } 
     return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
}
