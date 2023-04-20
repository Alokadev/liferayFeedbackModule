create table FB_Feedback (
	feedbackId LONG not null primary key,
	feedbackDate DATE null,
	feedbackText VARCHAR(75) null,
	feedbackSubject VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG
);