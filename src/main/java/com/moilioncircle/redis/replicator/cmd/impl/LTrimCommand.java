/*
 * Copyright 2016 leon chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.replicator.cmd.impl;

import com.moilioncircle.redis.replicator.cmd.Command;

/**
 * @author Leon Chen
 * @since 2.3.1
 */
public class LTrimCommand implements Command {

    private static final long serialVersionUID = 1L;

    private String key;
    private long start;
    private long stop;
    private byte[] rawKey;

    public LTrimCommand() {
    }

    public LTrimCommand(String key, long start, long stop) {
        this(key, start, stop, null);
    }

    public LTrimCommand(String key, long start, long stop, byte[] rawKey) {
        this.key = key;
        this.start = start;
        this.stop = stop;
        this.rawKey = rawKey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getStop() {
        return stop;
    }

    public void setStop(long stop) {
        this.stop = stop;
    }

    public byte[] getRawKey() {
        return rawKey;
    }

    public void setRawKey(byte[] rawKey) {
        this.rawKey = rawKey;
    }

    @Override
    public String toString() {
        return "LTrimCommand{" +
                "key='" + key + '\'' +
                ", start=" + start +
                ", stop=" + stop +
                '}';
    }
}
