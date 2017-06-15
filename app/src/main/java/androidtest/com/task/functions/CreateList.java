package androidtest.com.task.functions;

/**
 * Created by Sridhar on 28-05-2017.
 */

public class CreateList {

    private String image_title;
    private String image_title2,time;

    private int image_id;



    public String getImage_title() {
        return image_title;
    }

    public String getImage_title2() {
        return image_title2;
    }

    public void setImage_title(String android_version_name) {
        this.image_title = android_version_name;
    }
    public void setImage_title2(String android_version_name2) {
        this.image_title2 = android_version_name2;
    }

    public void settime(String time) {
        this.time = time;
    }
    public String gettime() {
        return time;
    }

    public int getImage_ID() {
        return image_id;
    }

    public void setImage_ID(int android_image_url) {
        this.image_id = android_image_url;
    }
}