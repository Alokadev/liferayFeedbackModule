/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.feedback.service.persistence;

import com.liferay.docs.feedback.exception.NoSuchFeedbackException;
import com.liferay.docs.feedback.model.Feedback;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FeedbackUtil
 * @generated
 */
@ProviderType
public interface FeedbackPersistence extends BasePersistence<Feedback> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FeedbackUtil} to access the feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the feedbacks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching feedbacks
	 */
	public java.util.List<Feedback> findBygroupId(long groupId);

	/**
	 * Returns a range of all the feedbacks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	public java.util.List<Feedback> findBygroupId(
		long groupId, int start, int end);

	/**
	 * Returns an ordered range of all the feedbacks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	public java.util.List<Feedback> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns an ordered range of all the feedbacks where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	public java.util.List<Feedback> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first feedback in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	public Feedback findBygroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Returns the first feedback in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	public Feedback fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns the last feedback in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	public Feedback findBygroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Returns the last feedback in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	public Feedback fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where groupId = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	public Feedback[] findBygroupId_PrevAndNext(
			long feedbackId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Removes all the feedbacks where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeBygroupId(long groupId);

	/**
	 * Returns the number of feedbacks where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching feedbacks
	 */
	public int countBygroupId(long groupId);

	/**
	 * Returns all the feedbacks where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching feedbacks
	 */
	public java.util.List<Feedback> findBycompanyId(long companyId);

	/**
	 * Returns a range of all the feedbacks where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	public java.util.List<Feedback> findBycompanyId(
		long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the feedbacks where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	public java.util.List<Feedback> findBycompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns an ordered range of all the feedbacks where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	public java.util.List<Feedback> findBycompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first feedback in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	public Feedback findBycompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Returns the first feedback in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	public Feedback fetchBycompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns the last feedback in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	public Feedback findBycompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Returns the last feedback in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	public Feedback fetchBycompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where companyId = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	public Feedback[] findBycompanyId_PrevAndNext(
			long feedbackId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Removes all the feedbacks where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeBycompanyId(long companyId);

	/**
	 * Returns the number of feedbacks where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching feedbacks
	 */
	public int countBycompanyId(long companyId);

	/**
	 * Returns all the feedbacks where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @return the matching feedbacks
	 */
	public java.util.List<Feedback> findByfeedbackText(String feedbackText);

	/**
	 * Returns a range of all the feedbacks where feedbackText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param feedbackText the feedback text
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of matching feedbacks
	 */
	public java.util.List<Feedback> findByfeedbackText(
		String feedbackText, int start, int end);

	/**
	 * Returns an ordered range of all the feedbacks where feedbackText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param feedbackText the feedback text
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching feedbacks
	 */
	public java.util.List<Feedback> findByfeedbackText(
		String feedbackText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns an ordered range of all the feedbacks where feedbackText = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param feedbackText the feedback text
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching feedbacks
	 */
	public java.util.List<Feedback> findByfeedbackText(
		String feedbackText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	public Feedback findByfeedbackText_First(
			String feedbackText,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Returns the first feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	public Feedback fetchByfeedbackText_First(
		String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns the last feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback
	 * @throws NoSuchFeedbackException if a matching feedback could not be found
	 */
	public Feedback findByfeedbackText_Last(
			String feedbackText,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Returns the last feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	 */
	public Feedback fetchByfeedbackText_Last(
		String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns the feedbacks before and after the current feedback in the ordered set where feedbackText = &#63;.
	 *
	 * @param feedbackId the primary key of the current feedback
	 * @param feedbackText the feedback text
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	public Feedback[] findByfeedbackText_PrevAndNext(
			long feedbackId, String feedbackText,
			com.liferay.portal.kernel.util.OrderByComparator<Feedback>
				orderByComparator)
		throws NoSuchFeedbackException;

	/**
	 * Removes all the feedbacks where feedbackText = &#63; from the database.
	 *
	 * @param feedbackText the feedback text
	 */
	public void removeByfeedbackText(String feedbackText);

	/**
	 * Returns the number of feedbacks where feedbackText = &#63;.
	 *
	 * @param feedbackText the feedback text
	 * @return the number of matching feedbacks
	 */
	public int countByfeedbackText(String feedbackText);

	/**
	 * Caches the feedback in the entity cache if it is enabled.
	 *
	 * @param feedback the feedback
	 */
	public void cacheResult(Feedback feedback);

	/**
	 * Caches the feedbacks in the entity cache if it is enabled.
	 *
	 * @param feedbacks the feedbacks
	 */
	public void cacheResult(java.util.List<Feedback> feedbacks);

	/**
	 * Creates a new feedback with the primary key. Does not add the feedback to the database.
	 *
	 * @param feedbackId the primary key for the new feedback
	 * @return the new feedback
	 */
	public Feedback create(long feedbackId);

	/**
	 * Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param feedbackId the primary key of the feedback
	 * @return the feedback that was removed
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	public Feedback remove(long feedbackId) throws NoSuchFeedbackException;

	public Feedback updateImpl(Feedback feedback);

	/**
	 * Returns the feedback with the primary key or throws a <code>NoSuchFeedbackException</code> if it could not be found.
	 *
	 * @param feedbackId the primary key of the feedback
	 * @return the feedback
	 * @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	 */
	public Feedback findByPrimaryKey(long feedbackId)
		throws NoSuchFeedbackException;

	/**
	 * Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param feedbackId the primary key of the feedback
	 * @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
	 */
	public Feedback fetchByPrimaryKey(long feedbackId);

	/**
	 * Returns all the feedbacks.
	 *
	 * @return the feedbacks
	 */
	public java.util.List<Feedback> findAll();

	/**
	 * Returns a range of all the feedbacks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @return the range of feedbacks
	 */
	public java.util.List<Feedback> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the feedbacks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of feedbacks
	 */
	public java.util.List<Feedback> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator);

	/**
	 * Returns an ordered range of all the feedbacks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FeedbackModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of feedbacks
	 * @param end the upper bound of the range of feedbacks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of feedbacks
	 */
	public java.util.List<Feedback> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the feedbacks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of feedbacks.
	 *
	 * @return the number of feedbacks
	 */
	public int countAll();

}