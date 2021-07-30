/**
 * 线性查找
 *
 * 泛型存放类对象，不能存放基本数据类型
 */
public class LinearSearch<E> {
    public static<E> int search(E[] data,E target) {
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(target) ) {  //1 默认比较的是地址  2 修改为比较内容
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Integer[] data = {1,2,3,5,19,20,34};
//        int index = LinearSearch.search(data,4);
//        System.out.println(index);
        Student[] students = {new Student("zps"),new Student("asda")};
        Student zps = new Student("zps");
        System.out.println(LinearSearch.search(students,zps));
    }
}
