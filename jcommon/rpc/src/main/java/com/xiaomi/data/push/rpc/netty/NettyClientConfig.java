/*
 *  Copyright 2020 Xiaomi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.xiaomi.data.push.rpc.netty;

import lombok.Getter;
import lombok.Setter;

/**
 * @author goodjava@qq.com
 */
public class NettyClientConfig {
    /**
     * Worker thread number
     */
    private int clientWorkerThreads = 4;
    private int clientCallbackExecutorThreads = Runtime.getRuntime().availableProcessors();
    private int clientOnewaySemaphoreValue = NettySystemConfig.ClientOnewaySemaphoreValue;
    private int clientAsyncSemaphoreValue = NettySystemConfig.ClientAsyncSemaphoreValue;
    private int connectTimeoutMillis = 3000;
    private long channelNotActiveInterval = 1000 * 60;


    /**
     * 是否支持重连
     */
    @Setter
    @Getter
    private boolean reconnection = true;


    /**
     * IdleStateEvent will be triggered when neither read nor write was performed for
     * the specified period of this time. Specify {@code 0} to disable
     */
    private int clientChannelMaxIdleTimeSeconds = 120;

    private int clientSocketSndBufSize = NettySystemConfig.socketSndbufSize;
    private int clientSocketRcvBufSize = NettySystemConfig.socketRcvbufSize;
    private boolean clientPooledByteBufAllocatorEnable = false;
    private boolean clientCloseSocketIfTimeout = false;

    public boolean isClientCloseSocketIfTimeout() {
        return clientCloseSocketIfTimeout;
    }

    public void setClientCloseSocketIfTimeout(final boolean clientCloseSocketIfTimeout) {
        this.clientCloseSocketIfTimeout = clientCloseSocketIfTimeout;
    }

    public int getClientWorkerThreads() {
        return clientWorkerThreads;
    }


    public void setClientWorkerThreads(int clientWorkerThreads) {
        this.clientWorkerThreads = clientWorkerThreads;
    }


    public int getClientOnewaySemaphoreValue() {
        return clientOnewaySemaphoreValue;
    }


    public void setClientOnewaySemaphoreValue(int clientOnewaySemaphoreValue) {
        this.clientOnewaySemaphoreValue = clientOnewaySemaphoreValue;
    }


    public int getConnectTimeoutMillis() {
        return connectTimeoutMillis;
    }


    public void setConnectTimeoutMillis(int connectTimeoutMillis) {
        this.connectTimeoutMillis = connectTimeoutMillis;
    }


    public int getClientCallbackExecutorThreads() {
        return clientCallbackExecutorThreads;
    }


    public void setClientCallbackExecutorThreads(int clientCallbackExecutorThreads) {
        this.clientCallbackExecutorThreads = clientCallbackExecutorThreads;
    }


    public long getChannelNotActiveInterval() {
        return channelNotActiveInterval;
    }


    public void setChannelNotActiveInterval(long channelNotActiveInterval) {
        this.channelNotActiveInterval = channelNotActiveInterval;
    }


    public int getClientAsyncSemaphoreValue() {
        return clientAsyncSemaphoreValue;
    }


    public void setClientAsyncSemaphoreValue(int clientAsyncSemaphoreValue) {
        this.clientAsyncSemaphoreValue = clientAsyncSemaphoreValue;
    }


    public int getClientChannelMaxIdleTimeSeconds() {
        return clientChannelMaxIdleTimeSeconds;
    }


    public void setClientChannelMaxIdleTimeSeconds(int clientChannelMaxIdleTimeSeconds) {
        this.clientChannelMaxIdleTimeSeconds = clientChannelMaxIdleTimeSeconds;
    }


    public int getClientSocketSndBufSize() {
        return clientSocketSndBufSize;
    }


    public void setClientSocketSndBufSize(int clientSocketSndBufSize) {
        this.clientSocketSndBufSize = clientSocketSndBufSize;
    }


    public int getClientSocketRcvBufSize() {
        return clientSocketRcvBufSize;
    }


    public void setClientSocketRcvBufSize(int clientSocketRcvBufSize) {
        this.clientSocketRcvBufSize = clientSocketRcvBufSize;
    }


    public boolean isClientPooledByteBufAllocatorEnable() {
        return clientPooledByteBufAllocatorEnable;
    }


    public void setClientPooledByteBufAllocatorEnable(boolean clientPooledByteBufAllocatorEnable) {
        this.clientPooledByteBufAllocatorEnable = clientPooledByteBufAllocatorEnable;
    }



}
