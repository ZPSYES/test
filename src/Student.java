/**
 * 类功能说明内容
 *
 * @author <作者 1>
 * @author <作者 2>
 * @version 当前版本号
 * @see <相关类 1>
 * @see <相关类 2>
 * @since 最早可支持的jdk版本号
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public boolean equals(Object student) {
        if( this == student ) {
            return true;
        }
        if( student == null ) {
            return false;
        }
        if(this.getClass() != student.getClass())
            return false;
        Student stu = ( Student ) student;
        return this.name.equals(stu.name);
    }

}
