package com.splendid.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.splendid.zuul.constant.FilterConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * token过滤器，校验token必输项方法，token不能为空
 *
 * @author liyuzhang
 */
@Component
public class AccessTokenFilter extends ZuulFilter{

	private static Logger log = LoggerFactory.getLogger(AccessTokenFilter.class);
	/**
	 * to classify a filter by type. Standard types in Zuul are "pre" for pre-routing filtering,
	 * "route" for routing to an origin, "post" for post-routing filters, "error" for error handling.
	 * We also support a "static" type for static responses see  StaticResponseFilter.
	 * Any filterType made be created or added and run by calling FilterProcessor.runFilters(type)
	 *
	 * (non-Javadoc) pre：路由之前 routing：路由之时 post： 路由之后 error：发送错误调用
	 *
	 * @return A String representing that type
	 */
	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

	/**
	 * filterOrder() must also be defined for a filter. Filters may have the same  filterOrder if precedence is not
	 * important for a filter. filterOrders do not need to be sequential.
	 *
	 * @return the int order of a filter
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 *
	 * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
	 *
	 * a "true" return from this method means that the run() method should be invoked
	 *
	 * @see com.netflix.zuul.IZuulFilter#shouldFilter()
	 *
	 * @return true if the run() method should be invoked. false will not invoke the run() method
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * if shouldFilter() is true, this method will be invoked. this method is the core method of a ZuulFilter
	 *
	 * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
	 *
	 * @see com.netflix.zuul.IZuulFilter#run()
	 *
	 * @return Some arbitrary artifact may be returned. Current implementation ignores it.
	 */
	@Override
	public Object run() {
		//TODO 可将Front-app服务中的APISecurityCheck中针对accessToken的校验迁移至此，提前验证
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		Object accessToken = request.getParameter("accessToken");
		if(accessToken == null) {
			log.warn("token is empty");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			try {
				ctx.getResponse().getWriter().write("token is empty");
			}catch (Exception e){}

			return null;
		}
		log.info("ok");
		return null;
	}
}
