package com.example.myandroidhub.inventoryapp;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class ProductContract {
    private ProductContract() {
    }

    public static final String CONTENT_AUTHORITY = "com.example.myandroidhub.inventoryapp";

    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_PRODUCTS = "products";

    public static final class Product implements BaseColumns{
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PRODUCTS);

        //MIME for list of products
        public static final String CONTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;

        //MIME for single product
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PRODUCTS;


        public final static String TABLE_NAME = "products";

        public final static String _ID = BaseColumns._ID;

        public final static String COLUMN_PRODUCT_PICTURES="pictures";

        public final static String COLUMN_PRODUCT_NAME = "name";

        public final static String COLUMN_PRODUCT_QUANTITY = "quantity";

        public final static String COLUMN_PRODUCT_UNIT="unit";

        public final static String COLUMN_PRODUCT_UNIT_PRICE="unit_price";

        public final static String COLUMN_PRODUCT_CURRENCY="currency";

        public final static String COLUMN_PRODUCT_TOTAL_PRICE="total_price";

        public final static String COLUMN_PRODUCT_AVAILABILITY = "availability";

        public final static String COLUMN_SUPPLIER_NAME="supplier_name";

        public final static String COLUMN_SUPPLIER_EMAIL_ADDRESS="supplier_email";

        public final static String COLUMN_SUPPLIER_CONTACT_NUMBER="supplier_contact_number";


        public final static int PRODUCT_IN_STOCK=1;

        public final static int PRODUCT_OUT_OF_STOCK=0;
    }

}
