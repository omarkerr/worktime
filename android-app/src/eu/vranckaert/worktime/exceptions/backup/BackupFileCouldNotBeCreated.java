/*
 * Copyright 2013 Dirk Vranckaert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.vranckaert.worktime.exceptions.backup;

/**
 * User: DIRK VRANCKAERT
 * Date: 12/09/11
 * Time: 16:59
 */
public class BackupFileCouldNotBeCreated extends BackupException {
    public BackupFileCouldNotBeCreated() {
        super();
    }

    public BackupFileCouldNotBeCreated(String message) {
        super(message);
    }

    public BackupFileCouldNotBeCreated(Exception e) {
        super(e);
    }

    public BackupFileCouldNotBeCreated(String message, Exception e) {
        super(message, e);
    }
}
