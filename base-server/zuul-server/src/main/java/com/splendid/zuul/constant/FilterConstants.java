/*
 * Copyright 2013-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.splendid.zuul.constant;


/**
 * @author liyuzhang
 */
public interface FilterConstants {

	// KEY constants -----------------------------------

	String IS_DISPATCHER_SERVLET_REQUEST_KEY = "isDispatcherServletRequest";

	String FORWARD_TO_KEY = "forward.to";

	String PROXY_KEY = "proxy";

	String REQUEST_ENTITY_KEY = "requestEntity";

	String REQUEST_URI_KEY = "requestURI";

	String RETRYABLE_KEY = "retryable";

	String ROUTING_DEBUG_KEY = "routingDebug";

	String SERVICE_ID_KEY = "serviceId";

	// ORDER constants -----------------------------------

	int DEBUG_FILTER_ORDER = 1;

	int FORM_BODY_WRAPPER_FILTER_ORDER = -1;

	int PRE_DECORATION_FILTER_ORDER = 5;

	int RIBBON_ROUTING_FILTER_ORDER = 10;

	int SEND_ERROR_FILTER_ORDER = 0;

	int SEND_FORWARD_FILTER_ORDER = 500;

	int SEND_RESPONSE_FILTER_ORDER = 1000;

	int SIMPLE_HOST_ROUTING_FILTER_ORDER = 100;

	int SERVLET_30_WRAPPER_FILTER_ORDER = -2;

	int SERVLET_DETECTION_FILTER_ORDER = -3;

	// Zuul Filter TYPE constants -----------------------------------

	String ERROR_TYPE = "error";
	String POST_TYPE = "post";

	String PRE_TYPE = "pre";

	String ROUTE_TYPE = "route";

	// OTHER constants -----------------------------------

	String FORWARD_LOCATION_PREFIX = "forward:";

	/**
	 * default http port
	 */
	int HTTP_PORT = 80;

	/**
	 * default https port
	 */
	int HTTPS_PORT = 443;

	/**
	 * http url scheme
	 */
	String HTTP_SCHEME = "http";

	/**
	 * https url scheme
	 */
	String HTTPS_SCHEME = "https";

	// HEADER constants -----------------------------------

	/**
	 * X-* Header for the matching url. Used when routes use a url rather than serviceId
	 */
	String SERVICE_HEADER = "X-Zuul-Service";

	/**
	 * X-* Header for the matching serviceId
	 */
	String SERVICE_ID_HEADER = "X-Zuul-ServiceId";

	/**
	 * X-Forwarded-For Header
	 */
	String X_FORWARDED_FOR_HEADER = "X-Forwarded-For";

	/**
	 * X-Forwarded-Host Header
	 */
	String X_FORWARDED_HOST_HEADER = "X-Forwarded-Host";

	/**
	 * X-Forwarded-Prefix Header
	 */
	String X_FORWARDED_PREFIX_HEADER = "X-Forwarded-Prefix";

	/**
	 * X-Forwarded-Port Header
	 */
	String X_FORWARDED_PORT_HEADER = "X-Forwarded-Port";

	/**
	 * X-Forwarded-Proto Header
	 */
	String X_FORWARDED_PROTO_HEADER = "X-Forwarded-Proto";

	/**
	 * X-Zuul-Debug Header
	 */
	String X_ZUUL_DEBUG_HEADER = "X-Zuul-Debug-Header";
}
