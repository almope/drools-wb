/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.workbench.services.verifier.api.client.index.matchers;

import org.drools.workbench.services.verifier.api.client.maps.KeyDefinition;
import org.drools.workbench.services.verifier.api.client.index.keys.Value;

public class FromMatcher
        extends Matcher {

    private final Value from;
    private final boolean includeSetValue;

    public FromMatcher( final KeyDefinition keyDefinition,
                        final Comparable from ) {
        this( keyDefinition,
              from,
              false );
    }

    public FromMatcher( final KeyDefinition keyDefinition,
                        final Comparable from,
                        final boolean includeSetValue ) {
        super( keyDefinition );
        this.from = new Value( from );
        this.includeSetValue = includeSetValue;
    }

    public Value getFrom() {
        return from;
    }

    public boolean includeValue() {
        return includeSetValue;
    }
}