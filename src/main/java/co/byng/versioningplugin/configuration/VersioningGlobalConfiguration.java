/*
 * The MIT License
 *
 * Copyright 2015 matt.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package co.byng.versioningplugin.configuration;

/**
 *
 * @author matt
 */
public class VersioningGlobalConfiguration implements VersioningGlobalConfigurationWriteableProvider {

    private String previousVersionEnvVariable = "PREVIOUS_VERSION_NUMBER";
    private String currentVersionEnvVariable = "CURRENT_VERSION_NUMBER";
    
    @Override
    public String getPreviousVersionEnvVariable() {
        return this.previousVersionEnvVariable;
    }

    @Override
    public String getCurrentVersionEnvVariable() {
        return this.currentVersionEnvVariable;
    }

    @Override
    public VersioningGlobalConfiguration setPreviousVersionEnvVariable(String previousVersionEnvVariable) {
        this.previousVersionEnvVariable = previousVersionEnvVariable;
        
        return this;
    }

    @Override
    public VersioningGlobalConfiguration setCurrentVersionEnvVariable(String currentVersionEnvVariable) {
        this.currentVersionEnvVariable = currentVersionEnvVariable;
        
        return this;
    }
    
}
