package com.restifo.ProgProj53_55;

import com.restifo.InterfacePractice.Quiz.Complexity;

public class Task implements Priority, Comparable<Task>, Complexity {
	private static final int MAX_PRIORITY = 10;
	private static final int MIN_PRIORITY = 1;
	private int priority;
	private int complexity;
	private String task;
	
	public Task(String task, int priority, int complexity)
	{
		if (priority > MAX_PRIORITY || priority < MIN_PRIORITY)
			throw new IllegalArgumentException();
		this.task = task;
		this.priority = priority;
		this.complexity = complexity;
	}
	
	public int compareTo(Task t) 
	{
		return (t.complexity == complexity) ? 0 : (t.complexity < complexity) ? 1 : -1;  
	}
	
	public void setComplexity(int complexity) { this.complexity = complexity; }
	public int getComplexity() { return complexity; }
	public void setPriority(int priority) { this.priority = priority; }
	public int getPriority() { return priority; }
	public String getTask() { return task; }
	
}