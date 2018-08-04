package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class RandomAspect {

	@Around("execution(public static int org.apache.commons.lang3.RandomUtils.nextInt()) "
			+ "&& !within(aspects..*)")
	public int around_Random_nextInt(final ProceedingJoinPoint pjp) throws Throwable {

		int originalReturnValue = (int) pjp.proceed(pjp.getArgs());
		//System.out.println("RandomAspect: originalReturnValue = " + originalReturnValue);
		return 9;
	}
}
//-javaagent:C:\aspectj1.8\lib\aspectjweaver.jar