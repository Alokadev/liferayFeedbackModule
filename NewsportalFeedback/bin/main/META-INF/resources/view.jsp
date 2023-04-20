<%@page import ="com.liferay.docs.feedback.service.FeedbackLocalServiceUtil" %>
<%@ include file="/init.jsp" %>

<h1>Feedback Portlet</h1>

<portlet:renderURL var="feedbackRenderURL">

	<portlet:param name="jspPage" value="/feedback.jsp"></portlet:param>

</portlet:renderURL>

<a href="${feedbackRenderURL}">Add New Feedback</a>

<liferay-ui:search-container>

<liferay-ui:search-container-results results="<%=FeedbackLocalServiceUtil.getFeedbacks(searchContainer.getStart(), searchContainer.getEnd()) %>">
</liferay-ui:search-container-results>

<liferay-ui:search-container-row className="com.liferay.docs.feedback.model.Feedback" modelVar="fb">

<liferay-ui:search-container-column-text name="Subject" property="feedbackSubject"></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="Message" property="feedbackText"></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-text name="Date" property="feedbackDate"></liferay-ui:search-container-column-text>
<liferay-ui:search-container-column-jsp align="-" name="Action" path="/action.jsp"></liferay-ui:search-container-column-jsp>
</liferay-ui:search-container-row>

<liferay-ui:search-iterator></liferay-ui:search-iterator>

</liferay-ui:search-container>