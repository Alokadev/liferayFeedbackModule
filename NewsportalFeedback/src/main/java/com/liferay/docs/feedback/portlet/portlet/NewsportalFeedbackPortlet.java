package com.liferay.docs.feedback.portlet.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.docs.feedback.model.Feedback;
import com.liferay.docs.feedback.portlet.constants.NewsportalFeedbackPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

import java.util.Date;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;
import com.liferay.docs.feedback.service.FeedbackLocalServiceUtil;

/**
 * @author Aloka
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=NewsportalFeedback",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + NewsportalFeedbackPortletKeys.NEWSPORTALFEEDBACK,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class NewsportalFeedbackPortlet extends MVCPortlet {
	public void addFeedback(ActionRequest actionRequest, ActionResponse actionResponse) 
			throws PortalException, IOException{
		
	    // Get the group ID from the ThemeDisplay object
	    ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
	    long groupId = themeDisplay.getScopeGroupId();
	    
	    // Get the user ID from the ThemeDisplay object
	    long userId = themeDisplay.getUserId();
		
        String fbSubject = ParamUtil.getString(actionRequest, "feedbackSubject");
        String fbMessage = ParamUtil.getString(actionRequest, "feedbackMessage");
        Date fbDate = new Date();
        long feedbackId = ParamUtil.getLong(actionRequest, "feedbackId");
      
        
        
        System.out.println("\nNew Feedback Uploading\n");
        System.out.println("Feedback Subject is: " + fbSubject);
        System.out.println("Feedback Message is: " + fbMessage);
        System.out.println("Feedback Date is: " + fbDate);
        System.out.println("Feedback Group Id is: " + groupId);
        System.out.println("Feedback User Id is: " + userId);

        Feedback feedback;
        
        if(feedbackId>0) {
			//Update existing feedback
			feedback = FeedbackLocalServiceUtil.getFeedback(feedbackId);
			
			feedback.setFeedbackSubject(fbSubject);
			feedback.setFeedbackText(fbMessage);
			feedback.setFeedbackDate(fbDate);
			feedback.setGroupId(groupId);
			feedback.setUserId(userId);
			
			FeedbackLocalServiceUtil.updateFeedback(feedback);
			System.out.println("Feedback has been updated succedssfully " + feedbackId);
		} else {
        	//Add New Feedback
			//auto increment for feedbackId 
			feedbackId = CounterLocalServiceUtil.increment();
			//Created feedback object 
			feedback = FeedbackLocalServiceUtil.createFeedback(feedbackId);
			//Initialize fd sub and message into databse
			feedback.setFeedbackSubject(fbSubject);
			feedback.setFeedbackText(fbMessage);
			feedback.setFeedbackDate(fbDate);
			feedback.setGroupId(groupId);
			feedback.setUserId(userId);
			
			FeedbackLocalServiceUtil.addFeedback(feedback);
			System.out.println("Feedback has been saved successfully " + feedbackId);
        }
        
        sendRedirect(actionRequest, actionResponse);

    }

	
	public void deleteFeedback(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, IOException {
		long feedbackId = ParamUtil.getLong(actionRequest, "feedbackId");
		
		FeedbackLocalServiceUtil.deleteFeedback(feedbackId);
		
		sendRedirect(actionRequest, actionResponse);
	}
	
	
	
}