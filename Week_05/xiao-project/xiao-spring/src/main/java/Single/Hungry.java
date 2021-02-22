package Single;

import xiao.pojo.User;

/***
 * 饿汉式
 */
public class Hungry {
    public static final User user=new User();
    public User getUser() {
        return user;
    }

}
