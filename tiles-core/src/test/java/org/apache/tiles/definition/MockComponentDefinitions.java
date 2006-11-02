/*
 * $Id$
 *
 * Copyright 1999-2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.apache.tiles.definition;

import java.util.Locale;
import org.apache.tiles.definition.ComponentDefinitions;
import org.apache.tiles.definition.NoSuchDefinitionException;
import org.apache.tiles.definition.ComponentDefinition;

/**
 *
 * @version $Rev$ $Date$ 
 */
public class MockComponentDefinitions implements ComponentDefinitions {
    
    /**
     * Hokey way to verify that this was created.
     */
    private static int instanceCount = 0;
    
    /**
     * Hokey way to verify that this class was created.
     */
    public static int getInstanceCount() {
        return instanceCount;
    }
    
    /** Creates a new instance of MockComponentDefinitions */
    public MockComponentDefinitions() {
        instanceCount++;
    }

    /**
     * Returns a ComponentDefinition object that matches the given name.
     * 
     * @param name The name of the ComponentDefinition to return.
     * @return the ComponentDefinition matching the given name or null if none
     *  is found.
     */
    public ComponentDefinition getDefinition(String name) {
        return null;
    }

    /**
     * Adds new locale-specific ComponentDefinition objects to the internal 
     * collection and resolves inheritance attraibutes.
     * 
     * @param defsMap The new definitions to add.
     * @param locale The locale to add the definitions to.
     */
    public void addDefinitions(java.util.Map defsMap, java.util.Locale locale) {
    }

    /**
     * Returns a ComponentDefinition object that matches the given name and locale.
     * 
     * @param name The name of the ComponentDefinition to return.
     * @param locale The locale to use to resolve the definition.
     * @return the ComponentDefinition matching the given name or null if none
     *  is found.
     */
    public ComponentDefinition getDefinition(String name, java.util.Locale locale) {
        return null;
    }

    /**
     * Adds new ComponentDefinition objects to the internal collection and 
     * resolves inheritance attraibutes.
     * 
     * @param defsMap The new definitions to add.
     */
    public void addDefinitions(java.util.Map defsMap) {
    }

    /**
     * Resolves configuration inheritance properties.
     */
    public void resolveInheritances() throws NoSuchDefinitionException {
    }

    /**
     * Resolves configuration inheritance properties.
     */
    public void resolveInheritances(Locale locale) throws NoSuchDefinitionException {
    }

    /**
     * Clears definitions.
     */
    public void reset() {
    }

    /**
     * Returns base definitions collection;
     */
    public java.util.Map getBaseDefinitions() {
        return null;
    }
    
}