package proxy.dynamicProxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class RealStarInterceptor implements MethodInterceptor{

	@Override
	public Object intercept(Object object, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
		Object result = null;
		System.out.println("真正的方法执行前！");
		System.out.println("面谈，签合同，预付款，订机票");
		if(method.getName().equals("sing")){			
			result = methodProxy.invokeSuper(object, params);
		}
		System.out.println("真正的方法执行后！");
		System.out.println("收尾款");
		return result;
	}
}
