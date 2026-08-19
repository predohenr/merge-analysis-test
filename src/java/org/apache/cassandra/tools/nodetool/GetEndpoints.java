/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cassandra.tools.nodetool;

import picocli.CommandLine.Command;

@Deprecated(since = "7.0") // this is alias to getreplicas
@Command(name = "getendpoints", description = "Print the end points that owns the key, deprecated, use getreplicas instead")
public class GetEndpoints extends GetReplicas
{
    @CassandraUsage(usage = "<keyspace> <table> <key>", description = "The keyspace, the table, and the partition key for which we need to find the endpoint (e.g., pk1:pk2:pk3 for compound keys)")
    private List<String> args = new ArrayList<>();

    @Parameters(index = "2", arity = "0..1", description = "The partition key for which we need to find the endpoint (e.g., pk1:pk2:pk3 for compound keys)")
    private String key;
}
