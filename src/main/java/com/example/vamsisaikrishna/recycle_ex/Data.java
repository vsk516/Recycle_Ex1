package com.example.vamsisaikrishna.recycle_ex;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vamsisaikrishna on 6/21/2016.
 */
public class Data {

    private static final String []titles = {"Nothingness cannot be define", "the shortest cannot be snapped",
                                                                            "be like water, my friend"};

    private  static final int[] Icons = {android.R.drawable.btn_radio, android.R.drawable.edit_text,
                                                                             android.R.drawable.btn_star};


   public static List<ListItem> getListData(){

       List<ListItem> data = new ArrayList<>();

       for(int i = 0; i<4; i++ ){
           for(int j=0; j<titles.length&&j<Icons.length; j++){
               ListItem item = new ListItem();
               item.setTitle(titles[j]);
               item.setImageResId(Icons[j]);
               data.add(item);
           }
       }
       return data;
   }


}
