package com.mypurecloud.sdk.v2.guest.connector;

public class ApiClientConnectorProperty {
    private static final String PREFIX = ApiClientConnectorProperty.class.getName() + ".";
    public static final String CONNECTION_TIMEOUT = PREFIX + "CONNECTION_TIMEOUT";
    public static final String DETAIL_LEVEL = PREFIX + "DETAIL_LEVEL";
    public static final String PROXY = PREFIX + "PROXY";
    public static final String ASYNC_EXECUTOR_SERVICE = PREFIX + "ASYNC_EXECUTOR_SERVICE";
    public static final String CONNECTOR_PROVIDER = PREFIX + "CONNECTOR_PROVIDER";
    public static final String HTTP_REQUEST_INTERCEPTOR = PREFIX + "HTTP_REQUEST_INTERCEPTOR";
    public static final String HTTP_RESPONSE_INTERCEPTOR = PREFIX + "HTTP_RESPONSE_INTERCEPTOR";

    private ApiClientConnectorProperty() { }
}
