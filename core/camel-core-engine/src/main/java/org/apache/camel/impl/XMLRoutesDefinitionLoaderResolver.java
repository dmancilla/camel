/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl;

import java.io.IOException;

import org.apache.camel.CamelContext;
import org.apache.camel.ExtendedCamelContext;
import org.apache.camel.NoFactoryAvailableException;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.spi.FactoryFinder;
import org.apache.camel.spi.XMLRoutesDefinitionLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factory to create the {@link XMLRoutesDefinitionLoader} implementation to be used.
 *
 * @see XMLRoutesDefinitionLoader
 */
public class XMLRoutesDefinitionLoaderResolver {

    public static final String RESOURCE_PATH = "META-INF/services/org/apache/camel/";

    private static final Logger LOG = LoggerFactory.getLogger(XMLRoutesDefinitionLoaderResolver.class);

    private FactoryFinder factoryFinder;

    public XMLRoutesDefinitionLoader resolve(CamelContext context) {
        // use factory finder to find a custom implementations
        Class<?> type = null;
        try {
            type = findFactory("xmlroutes-loader", context);
        } catch (Exception e) {
            // ignore
        }

        if (type != null) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Found XMLRoutesDefinitionLoader: {} via: {}{}", type.getName(), factoryFinder.getResourcePath(), "xmlroutes-loader");
            }
            if (XMLRoutesDefinitionLoader.class.isAssignableFrom(type)) {
                XMLRoutesDefinitionLoader answer = (XMLRoutesDefinitionLoader) context.getInjector().newInstance(type, false);
                LOG.info("Detected and using XMLRoutesDefinitionLoader: {}", answer);
                return answer;
            } else {
                throw new IllegalArgumentException("Type is not a XMLRoutesDefinitionLoader implementation. Found: " + type.getName());
            }
        }

        throw new RuntimeCamelException("Cannot find XML routes loader in classpath. Add either camel-xml-io or camel-xml-jaxb to the classpath.");
    }

    private Class<?> findFactory(String name, CamelContext context) throws IOException {
        if (factoryFinder == null) {
            factoryFinder = context.adapt(ExtendedCamelContext.class).getFactoryFinder(RESOURCE_PATH);
        }
        return factoryFinder.findClass(name).orElse(null);
    }

}

