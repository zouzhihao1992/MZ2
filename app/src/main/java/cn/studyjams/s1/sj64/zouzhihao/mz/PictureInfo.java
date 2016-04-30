package cn.studyjams.s1.sj64.zouzhihao.mz;

import java.util.ArrayList;
import java.util.List;

import cn.studyjams.s1.sj64.zouzhihao.mz.bean.SimplePicture;


/**
 * Created by zzh on 16/4/25.
 */
public class PictureInfo {

    public final static int ADD_AT_START = 1;
    public final static int ADD_AT_END = 2;
    public static List<SimplePicture> sPictures = new ArrayList<>();
    public static void addPicture(SimplePicture simplePicture,int postion){
        if(postion == ADD_AT_START){
            sPictures.add(0,simplePicture);
        }else if (postion == ADD_AT_END){
            sPictures.add(simplePicture);
        }
    }
    public static void  addPictures(List<SimplePicture> lists,int postion){
        if(postion == ADD_AT_START){
            sPictures.addAll(0,lists);
        }else if (postion == ADD_AT_END){
            sPictures.addAll(lists);

        }
    }
}
