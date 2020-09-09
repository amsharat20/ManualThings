package Future;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SquareCalculatorIntegrationTest {
	

@Rule
public TestName name = new TestName();

private long start;

private SquareCalculator squareCalculator;

@Test
public void givenExecutorIsSingleThreaded_whenTwoExecutionsAreTriggered_thenRunInSequence() throws InterruptedException, ExecutionException {
	squareCalculator = new SquareCalculator(Executors.newSingleThreadExecutor());

	Future<Integer> result1 = squareCalculator.calculate(4);
	Future<Integer> result2 = squareCalculator.calculate(1000);

	while (!result1.isDone() || !result2.isDone()) {
		System.out.println(String.format("Task 1 is %s and Task 2 is %s.", result1.isDone() ? "done" : "not done", result2.isDone() ? "done" : "not done"));

		Thread.sleep(300);
	}

	assertEquals(16, result1.get().intValue());
	assertEquals(1000000, result2.get().intValue());
}
@Before
public void start() {
    start = System.currentTimeMillis();
}

@After
public void end() {
	System.out.println(String.format("Test %s took %s ms \n", name.getMethodName(), System.currentTimeMillis() - start));
}
}