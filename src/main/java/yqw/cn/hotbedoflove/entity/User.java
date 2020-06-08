package yqw.cn.hotbedoflove.entity;

/**
 * <p>
 * 
 * </p>
 *
 * @author yqw
 * @since 2020-06-08
 */
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

    private String pasword;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "User{" +
        "name=" + name +
        ", pasword=" + pasword +
        "}";
    }
}
