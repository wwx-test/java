package Test;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student("郭靖",20);
        Student stu2 = new Student("黄蓉",18);
        stu.room = "101号教室";

        System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge() + "，在哪上课：" + stu.room + "，学生id："
                        + stu.getId());
        System.out.println("姓名：" + stu2.getName()+ "，年龄：" + stu2.getAge()+ "，在哪上课：" + stu2.room+ "，学生id："
                        + stu2.getId());


    }
}
