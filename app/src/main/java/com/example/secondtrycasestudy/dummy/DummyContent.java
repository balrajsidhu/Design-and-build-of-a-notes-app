package com.example.secondtrycasestudy.dummy;

import android.widget.EditText;

import com.example.secondtrycasestudy.R;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {





    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
   // public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
      //  ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        Calendar calendar=Calendar.getInstance();
        String currentDate= DateFormat.getDateInstance().format(calendar.getTime());
       String date =currentDate;
                    return new DummyItem( "Title ",date,true);
       }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {

        //public final String id;
        public  String title;
        public  String date;


        public  boolean checkBookmark;



        public DummyItem( String title, String date, boolean checkBookmark) {
            //this.id = id;
            this.title = title;
            this.date = date;
            this.checkBookmark = checkBookmark;

//        date=(EditText)view.findViewById(R.id.date);
            //         date.setText(currentDate);
            //this.date=currentDate;


        }

        @Override
        public String toString() {
            return title;
        }
    }
}