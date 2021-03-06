package survey;
// Generated Feb 23, 2017 6:28:00 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Survey generated by hbm2java
 */
public class Survey  implements java.io.Serializable {


     private int surveyId;
     private User user;
     private String surveyName;
     private Set<SurveyRespondent> surveyRespondents = new HashSet<SurveyRespondent>(0);
     private Set<Question> questions = new HashSet<Question>(0);

    public Survey() {
    }

	
    public Survey(String surveyName, User user) {
        this.user = user;
        this.surveyName = surveyName;
    }
    public Survey(String surveyName, User user, Set<SurveyRespondent> surveyRespondents, Set<Question> questions) {
       this.user = user;
       this.surveyName = surveyName;
       this.surveyRespondents = surveyRespondents;
       this.questions = questions;
    }
   
    public int getSurveyId() {
        return this.surveyId;
    }
    
    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }
    public User getUser() {
        return this.user;
    }
    
    /*public void setUser(int user) {
        this.user = user;
    }*/
    
    public void setUser(User user){
        this.user = user;
    }
    
    
    public String getSurveyName() {
        return this.surveyName;
    }
    
    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }
    public Set<SurveyRespondent> getSurveyRespondents() {
        return this.surveyRespondents;
    }
    
    public void setSurveyRespondents(Set<SurveyRespondent> surveyRespondents) {
        this.surveyRespondents = surveyRespondents;
    }
    public Set<Question> getQuestions() {
        return this.questions;
    }
    
    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }




}


