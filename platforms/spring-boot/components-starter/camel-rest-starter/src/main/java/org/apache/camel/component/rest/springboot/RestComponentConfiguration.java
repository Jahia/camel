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
package org.apache.camel.component.rest.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * The rest component is used for either hosting REST services (consumer) or
 * calling external REST services (producer).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.rest")
public class RestComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the rest component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The Camel Rest component to use for (consumer) the REST transport, such
     * as jetty, servlet, undertow. If no component has been explicit
     * configured, then Camel will lookup if there is a Camel component that
     * integrates with the Rest DSL, or if a
     * org.apache.camel.spi.RestConsumerFactory is registered in the registry.
     * If either one is found, then that is being used.
     */
    private String consumerComponentName;
    /**
     * The Camel Rest component to use for (producer) the REST transport, such
     * as http, undertow. If no component has been explicit configured, then
     * Camel will lookup if there is a Camel component that integrates with the
     * Rest DSL, or if a org.apache.camel.spi.RestProducerFactory is registered
     * in the registry. If either one is found, then that is being used.
     */
    private String producerComponentName;
    /**
     * The Camel Rest component to use for (producer) the REST transport, such
     * as http, undertow. If no component has been explicit configured, then
     * Camel will lookup if there is a Camel component that integrates with the
     * Rest DSL, or if a org.apache.camel.spi.RestProducerFactory is registered
     * in the registry. If either one is found, then that is being used.
     */
    @Deprecated
    private String componentName;
    /**
     * The swagger api doc resource to use. The resource is loaded from
     * classpath by default and must be in JSon format.
     */
    private String apiDoc;
    /**
     * Host and port of HTTP service to use (override host in swagger schema)
     */
    private String host;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public String getConsumerComponentName() {
        return consumerComponentName;
    }

    public void setConsumerComponentName(String consumerComponentName) {
        this.consumerComponentName = consumerComponentName;
    }

    public String getProducerComponentName() {
        return producerComponentName;
    }

    public void setProducerComponentName(String producerComponentName) {
        this.producerComponentName = producerComponentName;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public String getComponentName() {
        return componentName;
    }

    @Deprecated
    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getApiDoc() {
        return apiDoc;
    }

    public void setApiDoc(String apiDoc) {
        this.apiDoc = apiDoc;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }
}