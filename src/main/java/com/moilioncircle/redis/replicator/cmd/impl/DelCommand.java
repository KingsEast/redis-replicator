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

import java.util.Arrays;

/**
 * @author Leon Chen
 * @since 2.1.0
 */
public class DelCommand implements Command {

    private static final long serialVersionUID = 1L;

    private String[] keys;
    private byte[][] rawKeys;

    public DelCommand() {
    }

    public DelCommand(String[] keys) {
        this(keys, null);
    }

    public DelCommand(String[] keys, byte[][] rawKeys) {
        this.keys = keys;
        this.rawKeys = rawKeys;
    }

    public String[] getKeys() {
        return keys;
    }

    public void setKeys(String[] keys) {
        this.keys = keys;
    }

    public byte[][] getRawKeys() {
        return rawKeys;
    }

    public void setRawKeys(byte[][] rawKeys) {
        this.rawKeys = rawKeys;
    }

    @Override
    public String toString() {
        return "DelCommand{" +
                "keys=" + Arrays.toString(keys) +
                '}';
    }
}
