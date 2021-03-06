/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mf.org.apache.wml.dom;

import mf.org.apache.wml.WMLCardElement;

/**
 * @author <a href="mailto:david@topware.com.tw">David Li</a>
 * @version $Id: WMLCardElementImpl.java 661560 2008-05-30 03:22:25Z mrglavas $
 * @xerces.internal
 */
public class WMLCardElementImpl extends WMLElementImpl implements WMLCardElement {

    private static final long serialVersionUID = -3571126568344328924L;

    public WMLCardElementImpl(WMLDocumentImpl owner, String tagName) {
        super(owner, tagName);
    }

    @Override
    public String getOnTimer() {
        return getAttribute("ontimer");
    }

    @Override
    public void setOnTimer(String newValue) {
        setAttribute("ontimer", newValue);
    }

    @Override
    public boolean getOrdered() {
        return getAttribute("ordered", true);
    }

    @Override
    public void setOrdered(boolean newValue) {
        setAttribute("ordered", newValue);
    }

    @Override
    public String getOnEnterBackward() {
        return getAttribute("onenterbackward");
    }

    @Override
    public void setOnEnterBackward(String newValue) {
        setAttribute("onenterbackward", newValue);
    }

    @Override
    public String getClassName() {
        return getAttribute("class");
    }

    @Override
    public void setClassName(String newValue) {
        setAttribute("class", newValue);
    }

    @Override
    public String getXmlLang() {
        return getAttribute("xml:lang");
    }

    @Override
    public void setXmlLang(String newValue) {
        setAttribute("xml:lang", newValue);
    }

    @Override
    public String getTitle() {
        return getAttribute("title");
    }

    @Override
    public void setTitle(String newValue) {
        setAttribute("title", newValue);
    }

    @Override
    public boolean getNewContext() {
        return getAttribute("newcontext", false);
    }

    @Override
    public void setNewContext(boolean newValue) {
        setAttribute("newcontext", newValue);
    }

    @Override
    public String getId() {
        return getAttribute("id");
    }

    @Override
    public void setId(String newValue) {
        setAttribute("id", newValue);
    }

    @Override
    public String getOnEnterForward() {
        return getAttribute("onenterforward");
    }

    @Override
    public void setOnEnterForward(String newValue) {
        setAttribute("onenterforward", newValue);
    }

}
