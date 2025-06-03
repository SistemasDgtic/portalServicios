/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.sep.util.servicios;


//http://stackoverflow.com/questions/11881148/log-method-entries-with-spring-aop
//	<dependency>
//	  <groupId>org.aspectj</groupId>
//	  <artifactId>com.springsource.org.aspectj.weaver</artifactId>
//	  <version>1.6.8.RELEASE</version>
//	  <type>jar</type>
//	 </dependency>
//	 <dependency>
//	    <groupId>cglib</groupId>
//	    <artifactId>cglib-nodep</artifactId>
//	    <version>3.0</version>
//	  </dependency>
//	  <dependency>
//	    <groupId>org.springframework</groupId>
//	    <artifactId>spring-aop</artifactId>
//	    <version>3.1.1.RELEASE</version>
//	  </dependency>

//Component
//@Aspect
//@Order(value=1)
public class LoggingAspect {

    /*@Around("execution(* mx.sep.siniestros.servicios..*.*(..))")
    public Object logMethod(ProceedingJoinPoint joinPoint) throws Throwable{
        Object retVal = null;

        try {
            StringBuffer startMessageStringBuffer = new StringBuffer();

            startMessageStringBuffer.append("Start method ");
	    startMessageStringBuffer.append(joinPoint.getSignature().toShortString());
	    startMessageStringBuffer.append("===");
            startMessageStringBuffer.append(joinPoint.getSignature().getName());
            startMessageStringBuffer.append("(");

            Object[] args = joinPoint.getArgs();
            for (int i = 0; i < args.length; i++) {
                startMessageStringBuffer.append(args[i]).append(",");
            }
            if (args.length > 0) {
                startMessageStringBuffer.deleteCharAt(startMessageStringBuffer.length() - 1);
            }

            startMessageStringBuffer.append(")");

            System.out.println(startMessageStringBuffer.toString());

            StopWatch stopWatch = new StopWatch();
            stopWatch.start();

            retVal = joinPoint.proceed();

            stopWatch.stop();

            StringBuffer endMessageStringBuffer = new StringBuffer();
            endMessageStringBuffer.append("Finish method ");
            endMessageStringBuffer.append(joinPoint.getSignature().getName());
            endMessageStringBuffer.append("(..); execution time: ");
            endMessageStringBuffer.append(stopWatch.getTotalTimeMillis());
            endMessageStringBuffer.append(" ms;");

            System.out.println(endMessageStringBuffer.toString());
        } catch (Throwable ex) {
            StringBuffer errorMessageStringBuffer = new StringBuffer();

             // Create error message 
             System.out.println(ex.getMessage() );

            throw ex;
        }

        return retVal;
    }*/
}