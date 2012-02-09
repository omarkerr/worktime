/*
 *  Copyright 2011 Dirk Vranckaert
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
package eu.vranckaert.worktime.constants;

/**
 * User: DIRK VRANCKAERT
 * Date: 06/02/11
 * Time: 15:22
 */
public class Constants {
    public class Dialog {
        public static final int DELETE_PROJECT_YES_NO = 0;
        public static final int DELETE_TIME_REGISTRATION_YES_NO = 6;
        public static final int CHOOSE_SELECTED_PROJECT = 8;
        public static final int LOADING_TIMEREGISTRATION_CHANGE = 9;
        public static final int CHOOSE_TASK = 10;
        public static final int NO_TASKS_AVAILABLE = 11;
        public static final int DELETE_TASK_YES_NO = 12;
        public static final int DELETE_TIME_REGISTRATIONS_OF_TASK_YES_NO = 13;
        public static final int WARN_PROJECT_DELETE_PROJECT_STILL_IN_USE = 14;
        public static final int ENTER_COMMENT_FOR_TR = 15;
        public static final int END_TIME_REGISTRATION_YES_NO = 16;
        public static final int CHOOSE_DATE = 17;
        public static final int CHOOSE_TIME = 18;
        public static final int VALIDATION_DATE_LOWER_LIMIT = 19;
        public static final int VALIDATION_DATE_HIGHER_LIMIT = 20;
        public static final int WARN_TASK_NOT_FINISHED_ONGOING_TR = 21;
        public static final int ASK_FINISH_TASK = 22;
        public static final int BACKUP_IN_PROGRESS = 23;
        public static final int BACKUP_SUCCESS = 24;
        public static final int BACKUP_ERROR = 25;
        public static final int BACKUP_RESTORE_FILE_SEARCH_NOTHING_FOUND = 26;
        public static final int BACKUP_RESTORE_FILE_SEARCH_SHOW_LIST = 27;
        public static final int BACKUP_RESTORE_FILE_SEARCH_NO_SD = 28;
        public static final int RESTORE_IN_PROGRESS = 29;
        public static final int BACKUP_RESTORE_START_QUESTION = 30;
        public static final int RESTORE_SUCCESS = 31;
        public static final int RESTORE_ERROR = 32;
        public static final int BACKUP_RESTORE_DOCUMENTATION = 33;
        public static final int REPORTING_CRITERIA_SELECT_PROJECT = 34;
        public static final int REPORTING_CRITERIA_SELECT_TASK = 35;
        public static final int REPORTING_CRITERIA_SELECT_START_DATE = 36;
        public static final int REPORTING_CRITERIA_SELECT_END_DATE = 37;
        public static final int REPORTING_CRITERIA_SELECT_END_DATE_ERROR_BEFORE_START_DATE = 38;
        public static final int LOADING_REPORTING_RESULTS = 39;
        public static final int REPORTING_EXPORT_CHOOSE_CSV_SEPARATOR = 41;
        public static final int REPORTING_EXPORT_DONE = 42;
        public static final int REPORTING_EXPORT_LOADING = 43;
        public static final int REPORTING_EXPORT_UNAVAILABLE = 44;
        public static final int REPORTING_BATCH_SHARE = 45;
    }
    public class IntentRequestCodes {
        public static final int ADD_PROJECT = 0;
        public static final int ADD_TASK = 1;
        public static final int EDIT_PROJECT = 2;
        public static final int EDIT_TASK = 3;
        public static final int PROJECT_DETAILS = 4;
        public static final int REGISTRATION_DETAILS = 5;
        public static final int STOP_TIME_REGISTRATION = 6;
        public static final int REGISTRATION_EDIT_DIALOG = 7;
        public static final int REGISTRATION_SPLIT_DIALOG = 8;
        public static final int MOVE_TASK = 4;
    }
    public class IntentResultCodes {
        public static final int RESULT_OK_SPLIT = 100;
    }
    public class Preferences {
        public static final String PREFERENCES_NAME = "WorkTime_0001";

        public static final int SELECTED_PROJECT_ID_DEFAULT_VALUE = -1;
        public static final boolean WIDGET_ASK_FOR_TASK_SELECTION_IF_ONLY_ONE_DEFAULT_VALUE = true;
        public static final boolean WIDGET_ENDING_TIME_REGISTRATION_COMMENT_PREFERENCE_DEFAULT_VALUE = true;
        public static final boolean WIDGET_ENDING_TIME_REGISTRATION_FINISH_TASK_PREFERENCE_DEFAULT_VALUE = false;
        public static final boolean SHOW_STATUS_BAR_NOTIFICATIONS_PREFERENCE_DEFAULT_VALUE = true;
        public static final int WIDGET_ENDING_TIME_REGISTRATION_COMMENT_MAX_HISTORY_STORAGE_PREFERENCE_DEFAULT_VALUE = 5;
        public static final String DISPLAY_HOUR_12_24_FORMAT_DEFAULT_VALUE = "system-default";
        public static final boolean SELECT_TASK_HIDE_FINISHED_DEFAULT_VALUE = true;
        public static final boolean DISPLAY_TASKS_HIDE_FINISHED_DEFAULT_VALUE = false;
        public static final String WEEK_STARTS_ON_DEFAULT_VALUE = "7";
        public static final String REPORTING_EXPORT_FILE_NAME_DEFAULT_VALUE = "export";
        public static final boolean TIME_REGISTRATION_AUTO_CLOSE_60S_GAP_DEFAULT_VALUE = true;

        public class Keys {
            public static final String SELECTED_PROJECT_ID = "selectedProjectId";
            public static final String WIDGET_ASK_FOR_TASK_SELECTION_IF_ONLY_ONE = "askForTaskSelectionIfOnlyOne";
            public static final String WIDGET_ENDING_TIME_REGISTRATION_COMMENT_PREFERENCE = "widgetEndingTimeRegistrationCommentPreference";
            public static final String WIDGET_ENDING_TIME_REGISTRATION_FINISH_TASK_PREFERENCE = "widgetEndingTimeRegistrationFinishTaskPreference";
            public static final String WIDGET_ENDING_TIME_REGISTRATION_COMMENT_MAX_HISTORY_STORAGE_PREFERENCE = "widgetEndingTimeRegistrationCommentMaxHistoryStoragePreference";
            public static final String SHOW_STATUS_BAR_NOTIFICATIONS_PREFERENCE = "showStatusBarNotificationsPreference";
            public static final String DISPLAY_HOUR_12_24_FORMAT = "displayHour1224Format";
            public static final String DISPLAY_TASKS_HIDE_FINISHED = "displayTasksHideFinished";
            public static final String SELECT_TASK_HIDE_FINISHED = "selectTaskHideFinished";
            public static final String WEEK_STARTS_ON = "weekStartsOn";
            public static final String REPORTING_EXPORT_FILE_NAME = "reportingExportFileName";
            public static final String REPORTING_EXPORT_CSV_SEPARATOR = "reportingExportCsvSeparator";
            public static final String TIME_REGISTRATION_AUTO_CLOSE_60S_GAP = "timeRegistrationAutoClose60sGap";
        }
    }
    public class Export {
        public static final String EXPORT_DIRECTORY = "worktime";
        public static final String BACKUP_DIRECTORY = "worktime-backup";
    }
    public class Extras {
        public static final String PROJECT = "project";
        public static final String TASK = "task";
        public static final String TIME_REGISTRATION = "timeRegistration";
        public static final String TIME_REGISTRATION_NEXT = "timeRegistrationNext";
        public static final String TIME_REGISTRATION_PREVIOUS = "timeRegistrationPrevious";
        public static final String TIME_REGISTRATION_START_DATE = "timeRegistrationStartDate";
        public static final String TIME_REGISTRATION_END_DATE = "timeRegistrationEndDate";
        public static final String EXPORT_HEADERS = "exportHeaders";
        public static final String EXPORT_VALUES = "exportValues";
        public static final String DATA_GROUPING = "dataGrouping";
        public static final String DISPLAY_DURATION = "displayDuration";
        public static final String DATA_ORDER = "dataOrder";
    }
    public class ContentMenuItemIds {
        public static final int PROJECT_DETAILS = 1;
        public static final int PROJECT_DELETE = 2;
        public static final int PROJECT_ADD = 3;
        public static final int PROJECT_EDIT = 4;
        public static final int TASK_EDIT = 5;
        public static final int TASK_ADD = 6;
        public static final int TASK_DELETE = 7;
        public static final int TIME_REGISTRATION_DETAILS = 8;
        public static final int TIME_REGISTRATION_EDIT_START = 9;
        public static final int TIME_REGISTRATION_EDIT_END = 10;
        public static final int TIME_REGISTRATION_EDIT_COMMENT = 11;
        public static final int TIME_REGISTRATION_EDIT_PROJECT_TASK = 12;
        public static final int TASK_MARK_UNFINISHED = 13;
        public static final int TASK_MARK_FINISHED = 14;
        public static final int TIME_REGISTRATION_DELETE = 15;
        public static final int TIME_REGISTRATION_RESTART = 16;
        public static final int TIME_REGISTRATION_ADD_COMMENT = 17;
        public static final int TIME_REGISTRATION_SPLIT = 18;
        public static final int TASK_MOVE = 19;
    }
}