package com.restifo.ProgProj53_55;
import static java.lang.System.out;
import java.util.Arrays;
public class TaskDriver {
	public static void main(String[] args) 
	{
		Task[] tasks = {
				new Task("Wake up", 10, 1),
				new Task("Make coffee", 9, 1),
				new Task("Get stuff ready", 6, 2),
				new Task("Ride the bus to school", 10, 1),
				new Task("Go to school", 10, 8),
				new Task("Finish homework", 7, 10),
				new Task("Sleep", 10, 1)
		};
		Arrays.sort(tasks);
		for (Task t : tasks)
		{
			out.println("Task: " + t.getTask());
			out.println("Complexity: " + t.getComplexity());
			out.println("Priority: " + t.getPriority());
			out.println();
		}
	}
}
