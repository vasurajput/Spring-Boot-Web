package com.vasu.springbatch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("Before Job Started");
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("After Job Ended " + jobExecution.getStatus().toString());
	}

}
