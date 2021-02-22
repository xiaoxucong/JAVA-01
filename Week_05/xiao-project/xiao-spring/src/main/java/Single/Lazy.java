package Single;

import xiao.pojo.User;

/***
 * 懒汉式
 */
public class Lazy {
    public static User user=new User();
    public User getUser() {
        if(user == null ) {
            user = new User();
        }
        return user;
    }
    public synchronized User createUser() {
        if(user == null ) {
            user = new User();
        }
        return user;
    }

    public  User createUser1() {
        if(user == null) {
            synchronized(this) {
                if(user == null ) {
                    user = new User();
                }
            }
        }
        return user;
    }

}
