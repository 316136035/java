package A01_对象输出流ObjectOutputStream;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 2981257557272162858L;
    /**
     * 当对象重新修改没有办法反序列化，注意idea要设置自动生成serialVersionUID 看图）鼠标放在类名 ALT+ENTER
     */
    private Integer id;
    private String name;
    private int age;

    private String  addr;

    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
