/*
 *  Copyright 2012 Dirk Vranckaert
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package eu.vranckaert.worktime.testutils;

import android.app.Activity;
import android.content.Context;
import android.test.AndroidTestCase;
import eu.vranckaert.worktime.dao.generic.GenericDao;
import eu.vranckaert.worktime.dao.generic.GenericDaoImpl;

import java.lang.reflect.Constructor;

/**
 * User: DIRK VRANCKAERT
 * Date: 22/03/12
 * Time: 14:58
 */
public class DBAndroidTestCase<T extends GenericDaoImpl> extends AndroidTestCase {
    /**
     * The context that is used to execute the test.
     */
    public Context ctx;
    
    private T dao;
    private Class daoClass;
    
    public DBAndroidTestCase(Class<T> daoClass) {
        this.daoClass = daoClass;
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        ctx = getContext();
        
        Constructor<T> constructor = daoClass.getConstructor(Context.class);
        dao = constructor.newInstance(ctx);
        
        TestUtil.cleanUpDatabase(getContext());
    }
    
    public T getDao() {
        return dao;
    }
}
