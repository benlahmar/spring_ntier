/**
 * 
 */
package com.entities.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author moi
 *
 */

@Aspect
public class Aspect1 {

	int i=0;
	@Before("execution(* *.addCommande(..))")
	public void klk(JoinPoint jp)
	{
		i++;
		System.out.println(i+"********debut de la m�thode"
				+ "****"+jp.getSignature().getName());
	}
	
	@After("execution(* *.addCommande(..))")
	public void klk2(JoinPoint jp)
	{
		i++;
		System.out.println(i+"********fin de la m�thode****"+jp.getSignature().getName());
	}
}
