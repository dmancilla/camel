/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.salesforce;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SalesforceComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SalesforceComponent target = (SalesforceComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpclientconnectiontimeout":
        case "httpClientConnectionTimeout": target.setHttpClientConnectionTimeout(property(camelContext, long.class, value)); return true;
        case "httpclientidletimeout":
        case "httpClientIdleTimeout": target.setHttpClientIdleTimeout(property(camelContext, long.class, value)); return true;
        case "httpmaxcontentlength":
        case "httpMaxContentLength": target.setHttpMaxContentLength(property(camelContext, java.lang.Integer.class, value)); return true;
        case "packages": target.setPackages(property(camelContext, java.lang.String[].class, value)); return true;
        case "config": target.setConfig(property(camelContext, org.apache.camel.component.salesforce.SalesforceEndpointConfig.class, value)); return true;
        case "httpclientproperties":
        case "httpClientProperties": target.setHttpClientProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "longpollingtransportproperties":
        case "longPollingTransportProperties": target.setLongPollingTransportProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "httpproxyexcludedaddresses":
        case "httpProxyExcludedAddresses": target.setHttpProxyExcludedAddresses(property(camelContext, java.util.Set.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyincludedaddresses":
        case "httpProxyIncludedAddresses": target.setHttpProxyIncludedAddresses(property(camelContext, java.util.Set.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "ishttpproxysocks4":
        case "isHttpProxySocks4": target.setIsHttpProxySocks4(property(camelContext, boolean.class, value)); return true;
        case "authenticationtype":
        case "authenticationType": target.setAuthenticationType(property(camelContext, org.apache.camel.component.salesforce.AuthenticationType.class, value)); return true;
        case "clientid":
        case "clientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyauthuri":
        case "httpProxyAuthUri": target.setHttpProxyAuthUri(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyrealm":
        case "httpProxyRealm": target.setHttpProxyRealm(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyusedigestauth":
        case "httpProxyUseDigestAuth": target.setHttpProxyUseDigestAuth(property(camelContext, boolean.class, value)); return true;
        case "httpproxyusername":
        case "httpProxyUsername": target.setHttpProxyUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "instanceurl":
        case "instanceUrl": target.setInstanceUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "ishttpproxysecure":
        case "isHttpProxySecure": target.setIsHttpProxySecure(property(camelContext, boolean.class, value)); return true;
        case "keystore": target.setKeystore(property(camelContext, org.apache.camel.support.jsse.KeyStoreParameters.class, value)); return true;
        case "lazylogin":
        case "lazyLogin": target.setLazyLogin(property(camelContext, boolean.class, value)); return true;
        case "loginconfig":
        case "loginConfig": target.setLoginConfig(property(camelContext, org.apache.camel.component.salesforce.SalesforceLoginConfig.class, value)); return true;
        case "loginurl":
        case "loginUrl": target.setLoginUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": target.setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "username":
        case "userName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

