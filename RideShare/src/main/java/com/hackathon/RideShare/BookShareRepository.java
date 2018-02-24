package com.hackathon.RideShare;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The Interface BookShareRepository.
 */
@Repository
public interface BookShareRepository extends 
MongoRepository<UserRequestDetails, String> {

	void feedack(FeedbackForm feedback);

}
