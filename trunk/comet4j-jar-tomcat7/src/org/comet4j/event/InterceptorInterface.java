package org.comet4j.event;

/**
 * 拦截器接口
 * 此接口用于向Observable中加入拦截器
 * （通过使用Observable的addEventInterceptor方法）
 * @author xiaojinghai@kedacom.com
 *
 */
@SuppressWarnings("unchecked")
public interface InterceptorInterface<E extends Event> {
	/**
	 * 拦截器方法，供Observable对象addEventInterceptor方法使用。
	 * @param anEvent
	 * @return 返回false则停止事件广播、终止动作的发生并不再执行其它拦截器方法，否则继续执行。
	 */
	public boolean intercept(E anEvent);
}
