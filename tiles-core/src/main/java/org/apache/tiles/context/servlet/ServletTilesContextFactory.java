/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.tiles.context.servlet;

import org.apache.tiles.TilesApplicationContext;
import org.apache.tiles.context.TilesContextFactory;
import org.apache.tiles.context.TilesRequestContext;
import org.apache.tiles.context.servlet.ServletTilesApplicationContext;
import org.apache.tiles.context.servlet.ServletTilesRequestContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Creates an instance of the appropriate TilesApplicationContext implementation.
 *
 * @version $Rev$ $Date$
 */
public class ServletTilesContextFactory implements TilesContextFactory {

    public void init(Map<String, String> configParameters) {
    }

    /**
     * Creates a TilesApplicationContext from the given context.
     */
    public TilesApplicationContext createApplicationContext(Object context) {
        if (context instanceof ServletContext) {
            ServletContext servletContext = (ServletContext) context;
            return new ServletTilesApplicationContext(servletContext);
        }
        return null;
    }

    public TilesRequestContext createRequestContext(TilesApplicationContext context,
                                                    Object... requestItems) {
        if (requestItems.length == 2) {
            ServletContext servletContext = getServletContext(context);
            if (servletContext != null) {
                return new ServletTilesRequestContext(servletContext,
                    (HttpServletRequest) requestItems[0],
                    (HttpServletResponse) requestItems[1]);
            }
        }
        
        return null;
    }

    protected ServletContext getServletContext(TilesApplicationContext context) {
        if (context instanceof ServletTilesApplicationContext) {
            ServletTilesApplicationContext app = (ServletTilesApplicationContext) context;
            return app.getServletContext();
        }
        return null;

    }
}