package b10.danh_sach.bai_tap.arraylist;

public class MyListTest {
    private static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        Student student1 = new Student(1, "Sang");
        Student student2 = new Student(2, "Nam");
        Student student3 = new Student(3, "Quang");
        Student student4 = new Student(4, "Viet");
        Student student5 = new Student(5, "vu");
        Student student6 = new Student(6, "Don");
        Student student7 = new Student(7, "Long");
        Student student10 = new Student(7, "Long");
        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> studentMyList2 = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);
        studentMyList.add(student6);
        studentMyList.add(student7,4);
        studentMyList2 = studentMyList.clone();
        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println(studentMyList.get(i).getName());
        }
        System.out.println(studentMyList.indexOf(student7));
        System.out.println(studentMyList.contains(student10));
        studentMyList2.remove(0);
        for (int i = 0; i < studentMyList2.size(); i++) {
            System.out.println(studentMyList2.get(i).getName());
        }
    }
}
