package ssm.lxh.uitel;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FlyAscept {
	
	@Before("execution(* ssm.lxh.dao.FlyDao.getFly(..))")
	public void before(){
		
		System.out.println("好，我拦截到你了");
		
	}
	
	@After("execution(* ssm.lxh.dao.*.*(..))")
	public void after(){
		
		System.out.println("come we go to school");
	}
	

}
