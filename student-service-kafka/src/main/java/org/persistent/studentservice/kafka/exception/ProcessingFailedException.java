package org.persistent.studentservice.kafka.exception;

public class ProcessingFailedException extends RuntimeException {

	public ProcessingFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProcessingFailedException(String message) {
		super(message);
	}

}
