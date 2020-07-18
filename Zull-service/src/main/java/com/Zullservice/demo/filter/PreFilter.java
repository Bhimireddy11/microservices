package com.Zullservice.demo.filter;

public class PreFilter extends ZuulFilter{  

		
		private static Logger log = LoggerFactory.getLogger(PreFilter.class);

		@Override
		public boolean shouldFilter() {
			// TODO Auto-generated method stub
			return true;
		}

		@Override
		public Object run() throws ZuulException {
			// TODO Auto-generated method stub
			RequestContext context = RequestContext.getCurrentContext();
			HttpServletRequest request = context.getRequest();
			log.info("Prefilter:"+String.format("%s request to %s",request.getMethod() , request.getRequestURL().toString()));
			
			return null;
		}

		@Override
		public String filterType() {
			// TODO Auto-generated method stub
			return "pre";
		}

		@Override
		public int filterOrder() {
			// TODO Auto-generated method stub
			return 1;
		}

	}
}
