/*
 *   Copyright 2018. AppDynamics LLC and its affiliates.
 *   All Rights Reserved.
 *   This is unpublished proprietary source code of AppDynamics LLC and its affiliates.
 *   The copyright notice above does not evidence any actual or intended publication of such source code.
 *
 */

package com.appdynamics.extensions.riak;


import com.google.common.collect.Maps;
import com.singularity.ee.agent.systemagent.api.exception.TaskExecutionException;
import org.junit.Test;

import java.util.Map;

public class RiakMonitorTest {

    public static final String CONFIG_ARG = "config-file";

    @Test
    public void testZookeeperMonitorExtension() throws TaskExecutionException {
        RiakMonitor riakMonitor = new RiakMonitor();
        Map<String,String> taskArgs = Maps.newHashMap();
        taskArgs.put(CONFIG_ARG, "src/test/resources/conf/config.yml");
        riakMonitor.execute(taskArgs,null);
    }
}
