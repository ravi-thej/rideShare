package com.hackathon.RideShare;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/share")
public class BookShareRide {

	private static final Logger LOGGER = Logger.getLogger(BookShareRide.class);
	
	/** The repository. */
	@Autowired
	private BookShareRepository shareRepository;
	

	/**
	 * Creates the.
	 *
	 * @param share 
	 * @return the response entity
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/book")
	public ResponseEntity<UserRequestDetails> bookShare(@RequestBody UserRequestDetails userDetails) {

		LOGGER.debug("start of bookShare  method");
		ResponseEntity<UserRequestDetails> response = null;
		try {
			UserRequestDetails result = shareRepository.save(userDetails);
			response = new ResponseEntity<UserRequestDetails>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.error("Exception occured in bookShare method :" + e.getMessage());
			response = new ResponseEntity<UserRequestDetails>(HttpStatus.NOT_FOUND);
		}
		LOGGER.debug("end of create bookShare method");
		return response;
	}

	
	@RequestMapping(method = RequestMethod.POST, value = "/feedback")
	public ResponseEntity<FeedbackForm> bookShare(@RequestBody FeedbackForm feedback) {

		LOGGER.debug("start of feedback  method");
		ResponseEntity<FeedbackForm> response = null;
		try {
			shareRepository.save(feedback);
			response = new ResponseEntity<FeedbackForm>(result, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.error("Exception occured in bookShare method :" + e.getMessage());
			response = new ResponseEntity<FeedbackForm>(HttpStatus.NOT_FOUND);
		}
		LOGGER.debug("end of create bookShare method");
		return response;
	}
	
}
