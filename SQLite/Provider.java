package me.theofrancisco.android.bookstore.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;

/**
     * {@link ContentProvider} for Pets app.
     */
    public class MyProvider extends ContentProvider {

        /** Tag for the log messages */
        //public static final String LOG_TAG = MyProvider.class.getSimpleName();
        //public static final String LOG_TAG = "MyApp";
        
        /**
         * Initialize the provider and the database helper object.
         */
        @Override
        public boolean onCreate() {
            // TODO: Create and initialize a PetDbHelper object to gain access to the pets database.
            // Make sure the variable is a global variable, so it can be referenced from other
            // ContentProvider methods.
            return true;
        }

        /**
         * Perform the query for the given URI. Use the given projection, selection, selection arguments, and sort order.
         */
        @Override
        public Cursor query(@NonNull Uri uri, String[] projection, String selection, String[] selectionArgs,
                            String sortOrder) {
            return null;
        }

        /**
         * Insert new data into the provider with the given ContentValues.
         */
        @Override
        public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
            return null;
        }

        /**
         * Updates the data at the given selection and selection arguments, with the new ContentValues.
         */
        @Override
        public int update(@NonNull Uri uri, ContentValues contentValues, String selection, String[] selectionArgs) {
            return 0;
        }

        /**
         * Delete the data at the given selection and selection arguments.
         */
        @Override
        public int delete(@NonNull Uri uri, String selection, String[] selectionArgs) {
            return 0;
        }

        /**
         * Returns the MIME type of data for the content URI.
         */
        @Override
        public String getType(@NonNull Uri uri) {
            return null;
        }
    }

