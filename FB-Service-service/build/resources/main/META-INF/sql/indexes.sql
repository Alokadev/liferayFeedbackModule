create index IX_1D61E1DA on FB_Feedback (companyId);
create index IX_CC0664D4 on FB_Feedback (feedbackText[$COLUMN_LENGTH:75$]);
create index IX_95CD16DC on FB_Feedback (groupId);