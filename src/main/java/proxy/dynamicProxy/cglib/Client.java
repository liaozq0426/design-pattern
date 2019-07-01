package proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class Client {
	
	public static void main(String[] args) {
		// 真实对象 
		RealStar realStar = new RealStar();
		
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(realStar.getClass());
		enhancer.setCallback(new RealStarInterceptor());
		// 创建代理对象
		RealStar proxy = (RealStar) enhancer.create();
		proxy.sing();
	}
}
