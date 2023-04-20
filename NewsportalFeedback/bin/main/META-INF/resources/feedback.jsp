<%@ page import="javax.portlet.RenderRequest" %>
<%@ page import="com.liferay.docs.feedback.service.FeedbackLocalServiceUtil" %>
<%@ page import="com.liferay.docs.feedback.model.Feedback" %>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ include file="/init.jsp" %>

<h1>Feedback Submit Form</h1>

<%
// retrieve feedback object based on feedbackId parameter
Feedback feedback = null;
long feedbackId = ParamUtil.getLong(request, "feedbackId");
if (feedbackId > 0) {
    feedback = FeedbackLocalServiceUtil.getFeedback(feedbackId);
}
%>

<portlet:renderURL var="viewRenderURL">
    <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="addFeedback" var="feedbackActionURL" />

<!-- create a form with a feedback object and action URL -->
<aui:model-context bean="<%=feedback %>" model="<%=Feedback.class %>"></aui:model-context>
<aui:form action="<%=feedbackActionURL %>">
    <!-- add input fields for feedback subject and message -->
    <aui:input label="Feedback Subject (Required):" name="feedbackSubject" type="text" />
    <aui:input label="Feedback Message (Required):" name="feedbackMessage" type="text" />

    <!-- add a hidden input field for feedback ID -->
    <aui:input name="feedbackId" type="hidden" />

    <!-- add submit and cancel buttons -->
    <aui:button type="submit" value="Submit" />
    <aui:button onClick="<%=viewRenderURL.toString()%>" type="cancel" value="Cancel" />
</aui:form>
