/*
 *
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *
 *  contributor license agreements. See the NOTICE file distributed with
 *
 *  this work for additional information regarding copyright ownership.
 *
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *
 *  (the "License"); you may not use this file except in compliance with
 *
 *  the License. You may obtain a copy of the License at
 *
 *
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 *
 *  Unless required by applicable law or agreed to in writing, software
 *
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *
 *  limitations under the License.
 *
 * /
 */

package org.apache.kylin.streaming.invertedindex;

import org.apache.kylin.dict.Dictionary;
import org.apache.kylin.invertedindex.index.Slice;
import org.apache.kylin.invertedindex.index.TableRecord;
import org.apache.kylin.streaming.Stream;
import org.apache.kylin.streaming.StreamBuilder;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/**
 * Created by qianzhou on 3/3/15.
 */
public class IIStreamBuilder extends StreamBuilder {

    public IIStreamBuilder(BlockingQueue<Stream> streamQueue) {
        super(streamQueue);
    }

    @Override
    protected void build(List<Stream> streamsToBuild) {

    }

    private void calculateDistinctColumn() {

    }

    private Map<Integer, Dictionary<?>> buildDictionary() {
        return null;
    }

    private TableRecord parse(Stream stream) {
        return null;
    }

    private Slice buildSlice() {
        return null;
    }

    private void loadToHBase() {

    }


    private void submitOffset() {

    }

}