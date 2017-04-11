
package survey;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Angel
 */
@Named(value = "deleteSurveyController")
@SessionScoped
public class deleteSurveyController implements Serializable {

    DataModel surveyTitle;
    int surveyId;
    String response;
    int deleteSurvey;
        
    deleteSurveyHelper helper;
    
    public deleteSurveyController() {
        helper = new deleteSurveyHelper();
    }

    public DataModel getSurveyTitle() {
        if(surveyTitle == null){
            surveyTitle = new ListDataModel(helper.getSurveyTitleByID(surveyId));
        }
        return surveyTitle;
    }

    public void setSurveyTitle(DataModel surveyTitle) {
        this.surveyTitle = surveyTitle;
    }

    public int getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(int surveyId) {
        this.surveyId = surveyId;
    }

    public int deleteSurvey(int surveyId) {
        int id = helper.deleteSurvey(surveyId);
        return id;       
    }

    public void setDeleteSurvey(int deleteSurvey) {
        this.deleteSurvey = surveyId;
    }

    public String getResponse() {
        response = null;
        
            
            if(helper.deleteSurvey(surveyId) == 1){
                surveyId = getSurveyId();
                response = "A survey was deleted";
            }else{
                response = "A survey was not deleted";
            }
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
     
    
}
