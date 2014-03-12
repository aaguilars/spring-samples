package com.kapx.spring.batch.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component("jobExecutionListener")
public class AppJobExecutionListener implements JobExecutionListener {

	private static final Logger logger = LoggerFactory.getLogger(AppJobExecutionListener.class);

	public void afterJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			logger.debug("Job completed with JobId {} ", jobExecution.getJobId());
		} else if (jobExecution.getStatus() == BatchStatus.FAILED) {
			logger.debug("Job failed with JobId {} ", jobExecution.getJobId());
		}
	}

	public void beforeJob(JobExecution jobExecution) {
		if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
			logger.debug("Job completed with JobId {} ", jobExecution.getJobId());
		} else if (jobExecution.getStatus() == BatchStatus.FAILED) {
			logger.debug("Job failed with JobId {} ", jobExecution.getJobId());
		}
	}
}
