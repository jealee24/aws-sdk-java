/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RemixSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemixSettingsJsonUnmarshaller implements Unmarshaller<RemixSettings, JsonUnmarshallerContext> {

    public RemixSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        RemixSettings remixSettings = new RemixSettings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("channelMapping", targetDepth)) {
                    context.nextToken();
                    remixSettings.setChannelMapping(ChannelMappingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("channelsIn", targetDepth)) {
                    context.nextToken();
                    remixSettings.setChannelsIn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("channelsOut", targetDepth)) {
                    context.nextToken();
                    remixSettings.setChannelsOut(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return remixSettings;
    }

    private static RemixSettingsJsonUnmarshaller instance;

    public static RemixSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemixSettingsJsonUnmarshaller();
        return instance;
    }
}